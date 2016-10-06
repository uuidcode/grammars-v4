package com.kakao.prmc.antlr.mysql;

import static com.kakao.prmc.antlr.mysql.MySQLVisitor.Mode.POST;
import static com.kakao.prmc.antlr.mysql.MySQLVisitor.Mode.PRE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.kakao.prmc.core.utility.CoreUtil;

public class MySQLVisitor extends MySQLParserBaseVisitor<MySQLVisitor> {
    private final static String NEW_LINE = "\r\n";

    private Map<String, String> opMap = new HashMap<>();
    private Map<Integer, Map<String, Table>> indexTableMap = new LinkedHashMap<>();
    private List<String> list = new ArrayList<>();

    private Integer queryIndex = 0;
    private Mode mode;
    private SubQueryType subQueryType;

    public enum Mode {
        PRE, POST
    }

    public enum SubQueryType {
        EXISTS, NOT_EXISTS, IN
    }

    public enum WhereType {
        WHERE("where"), ON("on");

        private String keyword;

        public String getKeyword() {
            return this.keyword;
        }

        WhereType(String keyword) {
            this.keyword = keyword;
        }
    }

    public MySQLVisitor(Mode mode) {
        this.mode = mode;
        opMap.put("=", "eq");
        opMap.put("!=", "ne");
        opMap.put(">=", "goe");
        opMap.put(">", "gt");
        opMap.put("<=", "loe");
        opMap.put("<", "lt");
    }

    public MySQLVisitor setIndexTableMap(Map<Integer, Map<String, Table>> indexTableMap) {
        this.indexTableMap = indexTableMap;
        return this;
    }

    public Map<Integer, Map<String, Table>> getIndexTableMap() {
        return indexTableMap;
    }

    public String getSource() {
        return CoreUtil.joining(this.list, NEW_LINE);
    }

    public void log(Object object) {
        //System.out.println("###" + object);
    }

    public void log(String title, Object object) {
        log(title + ":" + CoreUtil.toJson(object));
    }

    @Override
    public MySQLVisitor visitSelectClause(MySQLParser.SelectClauseContext ctx) {
        if (this.mode == POST) {
            list.add("this.queryService");
            list.add(".select(");
        }

        return super.visitSelectClause(ctx);
    }

    @Override
    public MySQLVisitor visitColumnListClause(MySQLParser.ColumnListClauseContext ctx) {
        List<String> columnList = new ArrayList<>();

        if (this.mode == POST) {
            List<MySQLParser.ColumnNameContext> columnNameContextList = ctx.columnName();

            columnNameContextList
                .stream()
                .forEach(c -> {
                    Map<String, Table> table = this.indexTableMap.get(this.queryIndex);
                    MySQLParser.TableAliasContext tableAliasContext = c.tableAlias();

                    if (tableAliasContext != null) {
                        String alias = tableAliasContext.getText();
                        if (c.ASTERISK() != null) {
                            columnList.addAll(
                                table
                                    .entrySet()
                                    .stream()
                                    .filter(e -> e.getKey().equals(alias))
                                    .map(e -> e.getValue().getName())
                                    .map(e -> "q" + CoreUtil.getJavaClassName(e))
                                    .collect(Collectors.toList()));
                        }
                    } else {
                        if (c.ASTERISK() != null) {
                            columnList.addAll(
                                table
                                    .entrySet()
                                    .stream()
                                    .map(e -> e.getValue().getName())
                                    .map(e -> "q" + CoreUtil.getJavaClassName(e))
                                    .collect(Collectors.toList()));
                        } else if (c.INT() != null) {
                            columnList.add(String.format("Expressions.constant(%s)", c.INT().getText()));
                        } else if (c.ID() != null) {
                            columnList.add(this.getPath(c));
                        } else if (c.function() != null) {
                            if ("count".equals(c.function().ID().getText())) {
                                String tableName = this.indexTableMap.get(this.queryIndex).entrySet().stream().map(e -> e.getValue().getName()).findFirst().get();
                                columnList.add(String.format("q%s.count()", CoreUtil.getJavaClassName(tableName)));
                            }
                        }
                    }
                });

            list.add(columnList.stream().collect(Collectors.joining(String.format(",%s", NEW_LINE))));
            list.add(")");
        }

        return super.visitColumnListClause(ctx);
    }

    @Override
    public MySQLVisitor visitFromClause(MySQLParser.FromClauseContext ctx) {
        if (this.mode == PRE) {
            MySQLParser.TableReferencesContext tableReferencesContext = ctx.tableReferences();
            tableReferencesContext
                .tableReference()
                .stream()
                .forEach(c -> {
                    Map<String, Table> map = Optional.ofNullable(this.indexTableMap.get(this.queryIndex)).orElse(new LinkedHashMap<>());
                    String tableName = c.tableAtom().tableName().getText();
                    String tableAlias = Optional.ofNullable(c.tableAtom().tableAlias()).map(ac -> ac.getText()).orElse(tableName);
                    map.put(tableAlias, new Table().setName(tableName).setAlias(tableAlias).setType(Table.Type.JOIN));
                    this.indexTableMap.put(this.queryIndex, map);
                    this.list.add("q" + CoreUtil.getJavaClassName(tableName));
                });
        }

        if (this.mode == POST) {
            String from = this.indexTableMap
                .get(this.queryIndex)
                .entrySet()
                .stream()
                .map(e -> e.getValue())
                .filter(table -> table.getType() == Table.Type.JOIN)
                .map(Table::getName)
                .map(name -> String.format(".from(%s)", "q" + CoreUtil.getJavaClassName(name)))
                .collect(Collectors.joining(NEW_LINE));

            this.list.add(from);
        }

        return super.visitFromClause(ctx);
    }

    private String getPath(MySQLParser.ColumnNameContext context) {
        if (context.INT() != null) {
            return context.INT().getText();
        } else if (context.STRING() != null) {
            return String.format("%s", context.STRING().getText().replaceAll("'", "\""));
        }

        Map<String, Table> tableMap = this.indexTableMap.get(this.queryIndex);
        MySQLParser.TableAliasContext tableAliasContext = context.tableAlias();

        String tableName = null;

        if (tableAliasContext != null) {
            tableName =
                Optional
                    .ofNullable(tableMap.get(tableAliasContext.getText()))
                    .map(Table::getName)
                    .orElse(null);
        }

        int currentQueryIndex = this.queryIndex;

        while (tableName == null) {
            currentQueryIndex--;
            tableMap = this.indexTableMap.get(currentQueryIndex);

            if (tableMap == null) {
                break;
            }

            String tableAlias = Optional.ofNullable(tableAliasContext).map(c -> c.getText()).orElse(null);
            tableName = Optional.ofNullable(tableMap.get(tableAlias)).map(Table::getName).orElse(null);
        }

        if (tableName == null) {
            tableName =
                this.indexTableMap.get(this.queryIndex)
                .entrySet()
                .stream()
                .map(e -> e.getValue().getName())
                .findFirst()
                .get();
        }

        String columnName = context.ID().getText();
        return String.format("q%s.%s", CoreUtil.getJavaClassName(tableName), CoreUtil.getJavaFieldName(columnName));
    }

    @Override
    public MySQLVisitor visitWhereClause(MySQLParser.WhereClauseContext ctx) {
        if (this.mode == POST) {
            this.processWhere(WhereType.WHERE, ctx.expression());
        }

        return super.visitWhereClause(ctx);
    }

    private void processWhere(WhereType whereType, MySQLParser.ExpressionContext expression) {
        List<MySQLParser.SimpleExpressionContext> simpleExpressionContextList =
            expression.simpleExpression();

        String keyword = whereType.getKeyword();

        simpleExpressionContextList
            .stream()
            .filter(c -> c.exists() == null)
            .filter(c -> c.notExists() == null)
            .forEach(
                c -> {
                    if (c.inClause() != null) {
                        String leftPath = this.getPath(c.element().columnName());
                        String rightPath = c.inClause().getText().replaceAll("'", "\"");
                        this.list.add(String.format(".%s(%s.in%s)", keyword, leftPath, rightPath));
                    } else if (c.inSubquery() != null) {

                    } else {
                        MySQLParser.LeftElementContext leftElementContext = c.leftElement();
                        MySQLParser.ColumnNameContext leftColumn = leftElementContext.element().columnName();

                        if (leftColumn != null) {
                            MySQLParser.ColumnNameContext rightColumn = c.rightElement().element().columnName();
                            String leftPath = getPath(leftColumn);
                            String relationOp = this.opMap.get(c.relationalOp().getText());
                            String rightPath = getPath(rightColumn);
                            this.list.add(String.format(".%s(%s.%s(%s))", keyword, leftPath, relationOp, rightPath));
                        }
                    }
                });
    }

    @Override
    public MySQLVisitor visitJoinClause(MySQLParser.JoinClauseContext ctx) {
        MySQLParser.TableAtomContext tableAtomContext = ctx.leftjoinTableAtom().tableAtom();

        if (this.mode == PRE) {
            if (ctx.LEFT() != null) {
                Map<String, Table> map = Optional.ofNullable(this.indexTableMap.get(this.queryIndex)).orElse(new LinkedHashMap<>());
                String tableName = tableAtomContext.tableName().getText();
                String tableAlias = Optional.ofNullable(tableAtomContext.tableAlias()).map(a -> a.getText()).orElse(tableName);
                map.put(tableAlias, new Table().setName(tableName).setAlias(tableAlias).setType(Table.Type.LEFT_JOIN));
            }
        } else if (this.mode == POST) {
            if (ctx.LEFT() != null) {
                String tableName = tableAtomContext.tableName().getText();
                this.list.add(String.format(".leftJoin(q%s)", CoreUtil.getJavaClassName(tableName)));
            }

            if (ctx.joinCondition() != null) {
                ctx.joinCondition()
                    .expression()
                    .stream()
                    .forEach(e -> this.processWhere(WhereType.ON, e));
            }
        }

        return super.visitJoinClause(ctx);
    }

    @Override
    public MySQLVisitor visitSubquery(MySQLParser.SubqueryContext ctx) {
        this.queryIndex++;
        return super.visitSubquery(ctx);
    }

    @Override
    public MySQLVisitor visitGroupByClause(MySQLParser.GroupByClauseContext ctx) {
        String groupBy = ctx.groupByItem()
            .stream()
            .map(c -> {
                String path = this.getPath(c.columnName());
                return String.format("%s", path);
            })
            .collect(Collectors.joining(","));
        this.list.add(String.format(".groupBy(%s)", groupBy));
        return super.visitGroupByClause(ctx);
    }

    @Override
    public MySQLVisitor visitOrderByClause(MySQLParser.OrderByClauseContext ctx) {
        String orderBy =
            ctx.orderByItem()
            .stream()
            .map(c -> {
                String path = this.getPath(c.columnName());
                String ascDesc = Optional.ofNullable(c.ascDesc()).map(MySQLParser.AscDescContext::getText).orElse("asc");
                return String.format("%s.%s()", path, ascDesc);
            })
            .collect(Collectors.joining(","));
        this.list.add(String.format(".orderBy(%s)", orderBy));
        return super.visitOrderByClause(ctx);
    }

    @Override
    public MySQLVisitor visitExists(MySQLParser.ExistsContext ctx) {
        this.subQueryType = SubQueryType.EXISTS;
        this.list.add(".where(");
        return super.visitExists(ctx);
    }

    @Override
    public MySQLVisitor visitNotExists(MySQLParser.NotExistsContext ctx) {
        this.subQueryType = SubQueryType.NOT_EXISTS;
        this.list.add(".where(");
        return super.visitNotExists(ctx);
    }

    @Override
    public MySQLVisitor visitInSubquery(MySQLParser.InSubqueryContext ctx) {
        this.subQueryType = SubQueryType.IN;
        this.list.add(String.format(".where(%s.in(", this.getPath(ctx.element().columnName())));
        return super.visitInSubquery(ctx);
    }

    @Override
    public MySQLVisitor visitSubqueryEnd(MySQLParser.SubqueryEndContext ctx) {
        if (this.subQueryType == SubQueryType.NOT_EXISTS) {
            this.list.add(".notExists())");
        } else if (this.subQueryType == SubQueryType.EXISTS) {
            this.list.add(".exists())");
        } else if (this.subQueryType == SubQueryType.IN) {
            this.list.add(")");
        }

        this.subQueryType = null;
        return super.visitSubqueryEnd(ctx);
    }
}
