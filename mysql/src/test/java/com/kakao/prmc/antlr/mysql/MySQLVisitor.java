package com.kakao.prmc.antlr.mysql;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class MySQLVisitor extends MySQLParserBaseVisitor<MySQLVisitor> {
    private Map<Integer, Map<String, String>> tableMap = new LinkedHashMap<>();
    private Integer queryIndex = 0;

    public Map<Integer, Map<String, String>> getTableMap() {
        return tableMap;
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

    @Override
    public MySQLVisitor visitColumn_list_clause(MySQLParser.Column_list_clauseContext ctx) {
        return super.visitColumn_list_clause(ctx);
    }

    @Override
    public MySQLVisitor visitFrom_clause(MySQLParser.From_clauseContext ctx) {
        return super.visitFrom_clause(ctx);
    }

    @Override
    public MySQLVisitor visitSelect_key(MySQLParser.Select_keyContext ctx) {
        return super.visitSelect_key(ctx);
    }

    @Override
    public MySQLVisitor visitWhere_clause(MySQLParser.Where_clauseContext ctx) {
        return super.visitWhere_clause(ctx);
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
    public MySQLVisitor visitTable_factor1(MySQLParser.Table_factor1Context ctx) {
        return super.visitTable_factor1(ctx);
    }

    @Override
    public MySQLVisitor visitTable_factor2(MySQLParser.Table_factor2Context ctx) {
        return super.visitTable_factor2(ctx);
    }

    @Override
    public MySQLVisitor visitTable_factor3(MySQLParser.Table_factor3Context ctx) {
        return super.visitTable_factor3(ctx);
    }

    @Override
    public MySQLVisitor visitTable_factor4(MySQLParser.Table_factor4Context ctx) {
        return super.visitTable_factor4(ctx);
    }

    @Override
    public MySQLVisitor visitTable_atom(MySQLParser.Table_atomContext ctx) {
        Map<String, String> map = Optional.ofNullable(this.tableMap.get(this.queryIndex)).orElse(new LinkedHashMap<>());
        String tableName = ctx.table_name().getText();
        String tableAlias = Optional.ofNullable(ctx.table_alias()).map(c -> c.getText()).orElse(tableName);
        map.put(tableAlias, tableName);
        this.tableMap.put(this.queryIndex, map);
        return super.visitTable_atom(ctx);
    }

    @Override
    public MySQLVisitor visitJoin_clause(MySQLParser.Join_clauseContext ctx) {
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
        this.queryIndex++;
        return super.visitSubquery(ctx);
    }
}
