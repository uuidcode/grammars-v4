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
    private Map<Integer, Map<String, Table>> tableMap = new LinkedHashMap<>();
    private Integer queryIndex = 0;
    private List<String> list = new ArrayList<>();
    private Mode mode;
    private boolean isExists = false;

    public enum Mode {
        PRE, POST
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

    public MySQLVisitor setTableMap(Map<Integer, Map<String, Table>> tableMap) {
        this.tableMap = tableMap;
        return this;
    }

    public Map<Integer, Map<String, Table>> getTableMap() {
        return tableMap;
    }

    public String getSource() {
        return CoreUtil.joining(this.list, NEW_LINE);
    }

    @Override
    public MySQLVisitor visitStat(MySQLParser.StatContext ctx) {
        return super.visitStat(ctx);
    }

    @Override
    public MySQLVisitor visitSchemaName(MySQLParser.SchemaNameContext ctx) {
        return super.visitSchemaName(ctx);
    }

    @Override
    public MySQLVisitor visitSelectClause(MySQLParser.SelectClauseContext ctx) {
        this.queryIndex++;

        if (this.mode == POST) {
            list.add("this.queryService");
            list.add(".select(");
        }

        return super.visitSelectClause(ctx);
    }

    @Override
    public MySQLVisitor visitTableName(MySQLParser.TableNameContext ctx) {
        return super.visitTableName(ctx);
    }

    @Override
    public MySQLVisitor visitTableAlias(MySQLParser.TableAliasContext ctx) {
        return super.visitTableAlias(ctx);
    }

    @Override
    public MySQLVisitor visitColumnName(MySQLParser.ColumnNameContext ctx) {
        return super.visitColumnName(ctx);
    }

    @Override
    public MySQLVisitor visitColumnNameAlias(MySQLParser.ColumnNameAliasContext ctx) {
        return super.visitColumnNameAlias(ctx);
    }

    @Override
    public MySQLVisitor visitIndexName(MySQLParser.IndexNameContext ctx) {
        return super.visitIndexName(ctx);
    }

    @Override
    public MySQLVisitor visitColumnList(MySQLParser.ColumnListContext ctx) {
        return super.visitColumnList(ctx);
    }

    public void log(Object object) {
        System.out.println("###" + object);
    }

    @Override
    public MySQLVisitor visitColumnListClause(MySQLParser.ColumnListClauseContext ctx) {
        List<String> columnList = new ArrayList<>();

        if (this.mode == POST) {
            List<MySQLParser.ColumnNameContext> columnNameContextList = ctx.columnName();

            columnNameContextList
                .stream()
                .forEach(c -> {
                    Map<String, Table> table = this.tableMap.get(this.queryIndex);
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
                                String tableName = this.tableMap.get(this.queryIndex).entrySet().stream().map(e -> e.getValue().getName()).findFirst().get();
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
                    Map<String, Table> map = Optional.ofNullable(this.tableMap.get(this.queryIndex)).orElse(new LinkedHashMap<>());
                    String tableName = c.tableAtom().tableName().getText();
                    String tableAlias = Optional.ofNullable(c.tableAtom().tableAlias()).map(ac -> ac.getText()).orElse(tableName);
                    map.put(tableAlias, new Table().setName(tableName).setAlias(tableAlias).setType(Table.Type.JOIN));
                    this.tableMap.put(this.queryIndex, map);
                    this.list.add("q" + CoreUtil.getJavaClassName(tableName));
                });
        }

        if (this.mode == POST) {
            String from = this.tableMap
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

    @Override
    public MySQLVisitor visitSelectKey(MySQLParser.SelectKeyContext ctx) {
        return super.visitSelectKey(ctx);
    }

    private String getPath(MySQLParser.ColumnNameContext context) {
        if (context.INT() != null) {
            return context.INT().getText();
        } else if (context.STRING() != null) {
            return String.format("%s", context.STRING().getText().replaceAll("'", "\""));
        }

        Map<String, Table> table = this.tableMap.get(this.queryIndex);
        MySQLParser.TableAliasContext tableAliasContext = context.tableAlias();

        String tableName = null;

        if (tableAliasContext != null) {
            tableName =
                Optional
                    .ofNullable(table.get(tableAliasContext.getText()))
                    .map(Table::getName)
                    .orElse(null);
        }

        int currentQueryIndex = this.queryIndex;

        while (tableName == null) {
            currentQueryIndex--;
            table = this.tableMap.get(currentQueryIndex);

            if (table == null) {
                break;
            }

            tableName = table.get(tableAliasContext.getText()).getName();
        }

        if (tableName == null) {
            tableName =
                this.tableMap.get(this.queryIndex)
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
            .forEach(
            e -> {
                if (e.EXISTS() != null) {
                    this.list.add(String.format(".%s(", keyword));
                    this.isExists = true;
                } else if (e.inClause() != null) {
                    this.list.add(String.format(".%s(%s.in%s)", keyword, this.getPath(e.element().columnName()), e.inClause().getText().replaceAll("'", "\"")));
                } else {
                    MySQLParser.LeftElementContext leftElementContext = e.leftElement();
                    MySQLParser.ColumnNameContext leftColumn = leftElementContext.element().columnName();

                    if (leftColumn != null) {
                        MySQLParser.ColumnNameContext rightColumn = e.rightElement().element().columnName();
                        String leftPath = getPath(leftColumn);
                        String relationOp = this.opMap.get(e.relationalOp().getText());
                        String rightPath = getPath(rightColumn);
                        this.list.add(String.format(".%s(%s.%s(%s))", keyword, leftPath, relationOp, rightPath));
                    }

                    if (this.isExists) {
                        this.list.add(".exists())");
                        this.isExists = false;
                    }
                }
            });
    }

    @Override
    public MySQLVisitor visitExpression(MySQLParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public MySQLVisitor visitElement(MySQLParser.ElementContext ctx) {
        return super.visitElement(ctx);
    }

    @Override
    public MySQLVisitor visitRightElement(MySQLParser.RightElementContext ctx) {
        return super.visitRightElement(ctx);
    }

    @Override
    public MySQLVisitor visitLeftElement(MySQLParser.LeftElementContext ctx) {
        return super.visitLeftElement(ctx);
    }

    @Override
    public MySQLVisitor visitTargetElement(MySQLParser.TargetElementContext ctx) {
        return super.visitTargetElement(ctx);
    }

    @Override
    public MySQLVisitor visitRelationalOp(MySQLParser.RelationalOpContext ctx) {
        return super.visitRelationalOp(ctx);
    }

    @Override
    public MySQLVisitor visitExprOp(MySQLParser.ExprOpContext ctx) {
        return super.visitExprOp(ctx);
    }

    @Override
    public MySQLVisitor visitBetweenOp(MySQLParser.BetweenOpContext ctx) {
        return super.visitBetweenOp(ctx);
    }

    @Override
    public MySQLVisitor visitIsOrIsNot(MySQLParser.IsOrIsNotContext ctx) {
        return super.visitIsOrIsNot(ctx);
    }

    @Override
    public MySQLVisitor visitSimpleExpression(MySQLParser.SimpleExpressionContext ctx) {
        return super.visitSimpleExpression(ctx);
    }

    @Override
    public MySQLVisitor visitTableReferences(MySQLParser.TableReferencesContext ctx) {
        return super.visitTableReferences(ctx);
    }

    @Override
    public MySQLVisitor visitTableReference(MySQLParser.TableReferenceContext ctx) {
        return super.visitTableReference(ctx);
    }


    @Override
    public MySQLVisitor visitTableFactor4(MySQLParser.TableFactor4Context ctx) {
        return super.visitTableFactor4(ctx);
    }

    @Override
    public MySQLVisitor visitTableAtom(MySQLParser.TableAtomContext ctx) {
        return super.visitTableAtom(ctx);
    }

    @Override
    public MySQLVisitor visitJoinClause(MySQLParser.JoinClauseContext ctx) {
        MySQLParser.TableAtomContext tableAtomContext = ctx.leftjoinTableAtom().tableAtom();

        if (this.mode == PRE) {
            if (ctx.LEFT() != null) {
                Map<String, Table> map = Optional.ofNullable(this.tableMap.get(this.queryIndex)).orElse(new LinkedHashMap<>());
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
    public MySQLVisitor visitJoinCondition(MySQLParser.JoinConditionContext ctx) {
        return super.visitJoinCondition(ctx);
    }

    @Override
    public MySQLVisitor visitIndexHintList(MySQLParser.IndexHintListContext ctx) {
        return super.visitIndexHintList(ctx);
    }

    @Override
    public MySQLVisitor visitIndexOptions(MySQLParser.IndexOptionsContext ctx) {
        return super.visitIndexOptions(ctx);
    }

    @Override
    public MySQLVisitor visitIndexHint(MySQLParser.IndexHintContext ctx) {
        return super.visitIndexHint(ctx);
    }

    @Override
    public MySQLVisitor visitIndexList(MySQLParser.IndexListContext ctx) {
        return super.visitIndexList(ctx);
    }

    @Override
    public MySQLVisitor visitPartitionClause(MySQLParser.PartitionClauseContext ctx) {
        return super.visitPartitionClause(ctx);
    }

    @Override
    public MySQLVisitor visitPartitionNames(MySQLParser.PartitionNamesContext ctx) {
        return super.visitPartitionNames(ctx);
    }

    @Override
    public MySQLVisitor visitPartitionName(MySQLParser.PartitionNameContext ctx) {
        return super.visitPartitionName(ctx);
    }

    @Override
    public MySQLVisitor visitSubqueryAlias(MySQLParser.SubqueryAliasContext ctx) {
        return super.visitSubqueryAlias(ctx);
    }

    @Override
    public MySQLVisitor visitSubquery(MySQLParser.SubqueryContext ctx) {
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
}
