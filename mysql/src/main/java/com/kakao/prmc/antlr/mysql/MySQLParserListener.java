// Generated from MySQLParser.g4 by ANTLR 4.5.3
package com.kakao.prmc.antlr.mysql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MySQLParser}.
 */
public interface MySQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MySQLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MySQLParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MySQLParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(MySQLParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(MySQLParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(MySQLParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(MySQLParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#ascDesc}.
	 * @param ctx the parse tree
	 */
	void enterAscDesc(MySQLParser.AscDescContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#ascDesc}.
	 * @param ctx the parse tree
	 */
	void exitAscDesc(MySQLParser.AscDescContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(MySQLParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(MySQLParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void enterGroupByItem(MySQLParser.GroupByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void exitGroupByItem(MySQLParser.GroupByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(MySQLParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(MySQLParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(MySQLParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(MySQLParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(MySQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(MySQLParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(MySQLParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(MySQLParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(MySQLParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(MySQLParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MySQLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MySQLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(MySQLParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(MySQLParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#columnNameAlias}.
	 * @param ctx the parse tree
	 */
	void enterColumnNameAlias(MySQLParser.ColumnNameAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#columnNameAlias}.
	 * @param ctx the parse tree
	 */
	void exitColumnNameAlias(MySQLParser.ColumnNameAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(MySQLParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(MySQLParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(MySQLParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(MySQLParser.ColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#columnListClause}.
	 * @param ctx the parse tree
	 */
	void enterColumnListClause(MySQLParser.ColumnListClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#columnListClause}.
	 * @param ctx the parse tree
	 */
	void exitColumnListClause(MySQLParser.ColumnListClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(MySQLParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(MySQLParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#selectKey}.
	 * @param ctx the parse tree
	 */
	void enterSelectKey(MySQLParser.SelectKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#selectKey}.
	 * @param ctx the parse tree
	 */
	void exitSelectKey(MySQLParser.SelectKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(MySQLParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(MySQLParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MySQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MySQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(MySQLParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(MySQLParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#rightElement}.
	 * @param ctx the parse tree
	 */
	void enterRightElement(MySQLParser.RightElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#rightElement}.
	 * @param ctx the parse tree
	 */
	void exitRightElement(MySQLParser.RightElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#leftElement}.
	 * @param ctx the parse tree
	 */
	void enterLeftElement(MySQLParser.LeftElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#leftElement}.
	 * @param ctx the parse tree
	 */
	void exitLeftElement(MySQLParser.LeftElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#targetElement}.
	 * @param ctx the parse tree
	 */
	void enterTargetElement(MySQLParser.TargetElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#targetElement}.
	 * @param ctx the parse tree
	 */
	void exitTargetElement(MySQLParser.TargetElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(MySQLParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(MySQLParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#exprOp}.
	 * @param ctx the parse tree
	 */
	void enterExprOp(MySQLParser.ExprOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#exprOp}.
	 * @param ctx the parse tree
	 */
	void exitExprOp(MySQLParser.ExprOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#betweenOp}.
	 * @param ctx the parse tree
	 */
	void enterBetweenOp(MySQLParser.BetweenOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#betweenOp}.
	 * @param ctx the parse tree
	 */
	void exitBetweenOp(MySQLParser.BetweenOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#isOrIsNot}.
	 * @param ctx the parse tree
	 */
	void enterIsOrIsNot(MySQLParser.IsOrIsNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#isOrIsNot}.
	 * @param ctx the parse tree
	 */
	void exitIsOrIsNot(MySQLParser.IsOrIsNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(MySQLParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(MySQLParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#exists}.
	 * @param ctx the parse tree
	 */
	void enterExists(MySQLParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#exists}.
	 * @param ctx the parse tree
	 */
	void exitExists(MySQLParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#notExists}.
	 * @param ctx the parse tree
	 */
	void enterNotExists(MySQLParser.NotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#notExists}.
	 * @param ctx the parse tree
	 */
	void exitNotExists(MySQLParser.NotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#inClause}.
	 * @param ctx the parse tree
	 */
	void enterInClause(MySQLParser.InClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#inClause}.
	 * @param ctx the parse tree
	 */
	void exitInClause(MySQLParser.InClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void enterTableReferences(MySQLParser.TableReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void exitTableReferences(MySQLParser.TableReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(MySQLParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(MySQLParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tableFactor4}.
	 * @param ctx the parse tree
	 */
	void enterTableFactor4(MySQLParser.TableFactor4Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tableFactor4}.
	 * @param ctx the parse tree
	 */
	void exitTableFactor4(MySQLParser.TableFactor4Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#leftjoinTableAtom}.
	 * @param ctx the parse tree
	 */
	void enterLeftjoinTableAtom(MySQLParser.LeftjoinTableAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#leftjoinTableAtom}.
	 * @param ctx the parse tree
	 */
	void exitLeftjoinTableAtom(MySQLParser.LeftjoinTableAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tableAtom}.
	 * @param ctx the parse tree
	 */
	void enterTableAtom(MySQLParser.TableAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tableAtom}.
	 * @param ctx the parse tree
	 */
	void exitTableAtom(MySQLParser.TableAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(MySQLParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(MySQLParser.JoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void enterJoinCondition(MySQLParser.JoinConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void exitJoinCondition(MySQLParser.JoinConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#indexHintList}.
	 * @param ctx the parse tree
	 */
	void enterIndexHintList(MySQLParser.IndexHintListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#indexHintList}.
	 * @param ctx the parse tree
	 */
	void exitIndexHintList(MySQLParser.IndexHintListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#indexOptions}.
	 * @param ctx the parse tree
	 */
	void enterIndexOptions(MySQLParser.IndexOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#indexOptions}.
	 * @param ctx the parse tree
	 */
	void exitIndexOptions(MySQLParser.IndexOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void enterIndexHint(MySQLParser.IndexHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void exitIndexHint(MySQLParser.IndexHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#indexList}.
	 * @param ctx the parse tree
	 */
	void enterIndexList(MySQLParser.IndexListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#indexList}.
	 * @param ctx the parse tree
	 */
	void exitIndexList(MySQLParser.IndexListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionClause(MySQLParser.PartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionClause(MySQLParser.PartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#partitionNames}.
	 * @param ctx the parse tree
	 */
	void enterPartitionNames(MySQLParser.PartitionNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#partitionNames}.
	 * @param ctx the parse tree
	 */
	void exitPartitionNames(MySQLParser.PartitionNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#partitionName}.
	 * @param ctx the parse tree
	 */
	void enterPartitionName(MySQLParser.PartitionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#partitionName}.
	 * @param ctx the parse tree
	 */
	void exitPartitionName(MySQLParser.PartitionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#subqueryAlias}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryAlias(MySQLParser.SubqueryAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#subqueryAlias}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryAlias(MySQLParser.SubqueryAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(MySQLParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(MySQLParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#subqueryEnd}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryEnd(MySQLParser.SubqueryEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#subqueryEnd}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryEnd(MySQLParser.SubqueryEndContext ctx);
}