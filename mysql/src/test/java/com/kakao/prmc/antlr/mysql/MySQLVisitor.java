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
    private Map<Integer, Map<String, String>> tableMap = new LinkedHashMap<>();
    private Integer queryIndex = 0;
    private List<String> list = new ArrayList<>();
    private Mode mode;
    private boolean isExists = false;
    private Integer joinConditionIndex = 0;

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

    public MySQLVisitor setTableMap(Map<Integer, Map<String, String>> tableMap) {
        this.tableMap = tableMap;
        return this;
    }

    public Map<Integer, Map<String, String>> getTableMap() {
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
    public MySQLVisitor visitSchema_name(MySQLParser.Schema_nameContext ctx) {
        return super.visitSchema_name(ctx);
    }

    @Override
    public MySQLVisitor visitSelect_clause(MySQLParser.Select_clauseContext ctx) {
        this.queryIndex++;

        if (this.mode == POST) {
            list.add("this.queryService");
            list.add(".select(");
        }

        return super.visitSelect_clause(ctx);
    }

    @Override
    public MySQLVisitor visitTable_name(MySQLParser.Table_nameContext ctx) {
        return super.visitTable_name(ctx);
    }

    @Override
    public MySQLVisitor visitTable_alias(MySQLParser.Table_aliasContext ctx) {
        return super.visitTable_alias(ctx);
    }

    @Override
    public MySQLVisitor visitColumn_name(MySQLParser.Column_nameContext ctx) {
        return super.visitColumn_name(ctx);
    }

    @Override
    public MySQLVisitor visitColumn_name_alias(MySQLParser.Column_name_aliasContext ctx) {
        return super.visitColumn_name_alias(ctx);
    }

    @Override
    public MySQLVisitor visitIndex_name(MySQLParser.Index_nameContext ctx) {
        return super.visitIndex_name(ctx);
    }

    @Override
    public MySQLVisitor visitColumn_list(MySQLParser.Column_listContext ctx) {
        return super.visitColumn_list(ctx);
    }

    public void log(Object object) {
        System.out.println("###" + object);
    }

    @Override
    public MySQLVisitor visitColumn_list_clause(MySQLParser.Column_list_clauseContext ctx) {
        List<String> columnList = new ArrayList<>();

        if (this.mode == POST) {
            List<MySQLParser.Column_nameContext> columnNameContextList = ctx.column_name();

            columnNameContextList
                .stream()
                .forEach(c -> {
                    Map<String, String> table = this.tableMap.get(this.queryIndex);
                    MySQLParser.Table_aliasContext tableAliasContext = c.table_alias();

                    if (tableAliasContext != null) {
                        String alias = tableAliasContext.getText();
                        if (c.ASTERISK() != null) {
                            columnList.addAll(
                                table
                                    .entrySet()
                                    .stream()
                                    .filter(e -> e.getKey().equals(alias))
                                    .map(e -> e.getValue())
                                    .map(e -> "q" + CoreUtil.getJavaClassName(e))
                                    .collect(Collectors.toList()));
                        }
                    } else {
                        if (c.ASTERISK() != null) {
                            columnList.addAll(
                                table
                                    .entrySet()
                                    .stream()
                                    .map(e -> e.getValue())
                                    .map(e -> "q" + CoreUtil.getJavaClassName(e))
                                    .collect(Collectors.toList()));
                        } else if (c.INT() != null) {
                            columnList.add(String.format("Expressions.constant(%s)", c.INT().getText()));
                        } else if (c.ID() != null) {
                            columnList.add(this.getPath(c));
                        } else if (c.function() != null) {
                            if ("count".equals(c.function().ID().getText())) {
                                String tableName = this.tableMap.get(this.queryIndex).entrySet().stream().map(e -> e.getValue()).findFirst().get();
                                columnList.add(String.format("q%s.count()", CoreUtil.getJavaClassName(tableName)));
                            }
                        }
                    }
                });

            list.add(columnList.stream().collect(Collectors.joining(String.format(",%s", NEW_LINE))));
            list.add(")");
        }

        return super.visitColumn_list_clause(ctx);
    }

    @Override
    public MySQLVisitor visitFrom_clause(MySQLParser.From_clauseContext ctx) {
        if (this.mode == PRE) {
            MySQLParser.Table_referencesContext tableReferencesContext = ctx.table_references();
            tableReferencesContext
                .table_reference()
                .stream()
                .forEach(c -> {
                    Map<String, String> map = Optional.ofNullable(this.tableMap.get(this.queryIndex)).orElse(new LinkedHashMap<>());
                    String tableName = c.table_atom().table_name().getText();
                    String tableAlias = Optional.ofNullable(c.table_atom().table_alias()).map(ac -> ac.getText()).orElse(tableName);
                    map.put(tableAlias, tableName);
                    this.tableMap.put(this.queryIndex, map);
                    this.list.add("q" + CoreUtil.getJavaClassName(tableName));
                });
        }

        if (this.mode == POST) {
            String from = this.tableMap
                .get(this.queryIndex)
                .entrySet()
                .stream()
                .map(entry -> entry.getValue())
                .map(name -> String.format(".from(%s)", "q" + CoreUtil.getJavaClassName(name)))
                .collect(Collectors.joining(NEW_LINE));

            this.list.add(from);
        }

        return super.visitFrom_clause(ctx);
    }

    @Override
    public MySQLVisitor visitSelect_key(MySQLParser.Select_keyContext ctx) {
        return super.visitSelect_key(ctx);
    }

    private String getPath(MySQLParser.Column_nameContext context) {
        if (context.INT() != null) {
            return context.INT().getText();
        } else if (context.STRING() != null) {
            return String.format("%s", context.STRING().getText().replaceAll("'", "\""));
        }

        Map<String, String> table = this.tableMap.get(this.queryIndex);
        MySQLParser.Table_aliasContext tableAliasContext = context.table_alias();

        String tableName = null;

        if (tableAliasContext != null) {
            tableName = table.get(tableAliasContext.getText());
        }

        int currentQueryIndex = this.queryIndex;

        while (tableName == null) {
            currentQueryIndex--;
            table = this.tableMap.get(currentQueryIndex);

            if (table == null) {
                break;
            }

            tableName = table.get(tableAliasContext.getText());
        }

        if (tableName == null) {
            tableName =
                this.tableMap.get(this.queryIndex)
                .entrySet()
                .stream()
                .map(e -> e.getValue())
                .findFirst()
                .get();
        }

        String columnName = context.ID().getText();
        return String.format("q%s.%s", CoreUtil.getJavaClassName(tableName), CoreUtil.getJavaFieldName(columnName));
    }

    @Override
    public MySQLVisitor visitWhere_clause(MySQLParser.Where_clauseContext ctx) {
        if (this.mode == POST) {
            this.processWhere(WhereType.WHERE, ctx.expression());
        }

        return super.visitWhere_clause(ctx);
    }

    private void processWhere(WhereType whereType, MySQLParser.ExpressionContext expression) {
        List<MySQLParser.Simple_expressionContext> simpleExpressionContextList =
            expression.simple_expression();

        this.joinConditionIndex = 0;

        String keyword = whereType.getKeyword();
        simpleExpressionContextList
            .stream()
            .forEach(
            e -> {
                if (e.EXISTS() != null) {
                    this.list.add(String.format(".%s(", keyword));
                    this.isExists = true;
                    this.joinConditionIndex++;
                } else if (e.in_clause() != null) {
                    this.list.add(String.format(".%s(%s.in%s)", keyword, this.getPath(e.element().column_name()), e.in_clause().getText().replaceAll("'", "\"")));
                    this.joinConditionIndex++;
                } else {
                    MySQLParser.Left_elementContext left_elementContext = e.left_element();
                    MySQLParser.Column_nameContext leftColumn = left_elementContext.element().column_name();

                    if (leftColumn != null) {
                        MySQLParser.Column_nameContext rightColumn = e.right_element().element().column_name();
                        String leftPath = getPath(leftColumn);
                        String relationOp = this.opMap.get(e.relational_op().getText());
                        String rightPath = getPath(rightColumn);
                        this.list.add(String.format(".%s(%s.%s(%s))", keyword, leftPath, relationOp, rightPath));
                    }

                    if (this.isExists) {
                        this.list.add(".exists())");
                        this.isExists = false;
                    }
                    this.joinConditionIndex++;
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
    public MySQLVisitor visitRight_element(MySQLParser.Right_elementContext ctx) {
        return super.visitRight_element(ctx);
    }

    @Override
    public MySQLVisitor visitLeft_element(MySQLParser.Left_elementContext ctx) {
        return super.visitLeft_element(ctx);
    }

    @Override
    public MySQLVisitor visitTarget_element(MySQLParser.Target_elementContext ctx) {
        return super.visitTarget_element(ctx);
    }

    @Override
    public MySQLVisitor visitRelational_op(MySQLParser.Relational_opContext ctx) {
        return super.visitRelational_op(ctx);
    }

    @Override
    public MySQLVisitor visitExpr_op(MySQLParser.Expr_opContext ctx) {
        return super.visitExpr_op(ctx);
    }

    @Override
    public MySQLVisitor visitBetween_op(MySQLParser.Between_opContext ctx) {
        return super.visitBetween_op(ctx);
    }

    @Override
    public MySQLVisitor visitIs_or_is_not(MySQLParser.Is_or_is_notContext ctx) {
        return super.visitIs_or_is_not(ctx);
    }

    @Override
    public MySQLVisitor visitSimple_expression(MySQLParser.Simple_expressionContext ctx) {
        return super.visitSimple_expression(ctx);
    }

    @Override
    public MySQLVisitor visitTable_references(MySQLParser.Table_referencesContext ctx) {
        return super.visitTable_references(ctx);
    }

    @Override
    public MySQLVisitor visitTable_reference(MySQLParser.Table_referenceContext ctx) {
        return super.visitTable_reference(ctx);
    }


    @Override
    public MySQLVisitor visitTable_factor4(MySQLParser.Table_factor4Context ctx) {
        return super.visitTable_factor4(ctx);
    }

    @Override
    public MySQLVisitor visitTable_atom(MySQLParser.Table_atomContext ctx) {
        return super.visitTable_atom(ctx);
    }

    @Override
    public MySQLVisitor visitJoin_clause(MySQLParser.Join_clauseContext ctx) {
        MySQLParser.Table_atomContext tableAtomContext = ctx.leftjoin_table_atom().table_atom();

        if (this.mode == PRE) {
            if (ctx.LEFT() != null) {
                Map<String, String> map = Optional.ofNullable(this.tableMap.get(this.queryIndex)).orElse(new LinkedHashMap<>());
                String tableName = tableAtomContext.table_name().getText();
                String tableAlias = Optional.ofNullable(tableAtomContext.table_alias()).map(a -> a.getText()).orElse(tableName);
                map.put(tableAlias, tableName);
            }
        } else if (this.mode == POST) {
            if (ctx.LEFT() != null) {
                String tableName = tableAtomContext.table_name().getText();
                this.list.add(String.format(".leftJoin(q%s)", CoreUtil.getJavaClassName(tableName)));
            }

            if (ctx.join_condition() != null) {
                ctx.join_condition()
                    .expression()
                    .stream()
                    .forEach(e -> this.processWhere(WhereType.ON, e));
            }
        }

        return super.visitJoin_clause(ctx);
    }

    @Override
    public MySQLVisitor visitJoin_condition(MySQLParser.Join_conditionContext ctx) {
        return super.visitJoin_condition(ctx);
    }

    @Override
    public MySQLVisitor visitIndex_hint_list(MySQLParser.Index_hint_listContext ctx) {
        return super.visitIndex_hint_list(ctx);
    }

    @Override
    public MySQLVisitor visitIndex_options(MySQLParser.Index_optionsContext ctx) {
        return super.visitIndex_options(ctx);
    }

    @Override
    public MySQLVisitor visitIndex_hint(MySQLParser.Index_hintContext ctx) {
        return super.visitIndex_hint(ctx);
    }

    @Override
    public MySQLVisitor visitIndex_list(MySQLParser.Index_listContext ctx) {
        return super.visitIndex_list(ctx);
    }

    @Override
    public MySQLVisitor visitPartition_clause(MySQLParser.Partition_clauseContext ctx) {
        return super.visitPartition_clause(ctx);
    }

    @Override
    public MySQLVisitor visitPartition_names(MySQLParser.Partition_namesContext ctx) {
        return super.visitPartition_names(ctx);
    }

    @Override
    public MySQLVisitor visitPartition_name(MySQLParser.Partition_nameContext ctx) {
        return super.visitPartition_name(ctx);
    }

    @Override
    public MySQLVisitor visitSubquery_alias(MySQLParser.Subquery_aliasContext ctx) {
        return super.visitSubquery_alias(ctx);
    }

    @Override
    public MySQLVisitor visitSubquery(MySQLParser.SubqueryContext ctx) {
        return super.visitSubquery(ctx);
    }

    @Override
    public MySQLVisitor visitGroupBy_clause(MySQLParser.GroupBy_clauseContext ctx) {
        String groupBy = ctx.groupBy_item()
            .stream()
            .map(c -> {
                String path = this.getPath(c.column_name());
                return String.format("%s", path);
            })
            .collect(Collectors.joining(","));
        this.list.add(String.format(".groupBy(%s)", groupBy));
        return super.visitGroupBy_clause(ctx);
    }

    @Override
    public MySQLVisitor visitOrderBy_clause(MySQLParser.OrderBy_clauseContext ctx) {
        String orderBy =
            ctx.orderBy_item()
            .stream()
            .map(c -> {
                String path = this.getPath(c.column_name());
                String ascDesc = Optional.ofNullable(c.asc_desc()).map(MySQLParser.Asc_descContext::getText).orElse("asc");
                return String.format("%s.%s()", path, ascDesc);
            })
            .collect(Collectors.joining(","));
        this.list.add(String.format(".orderBy(%s)", orderBy));
        return super.visitOrderBy_clause(ctx);
    }
}
