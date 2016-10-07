// Generated from MySQLParser.g4 by ANTLR 4.5.3

package com.kakao.prmc.antlr.mysql;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MySQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MySQLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MySQLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(MySQLParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(MySQLParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(MySQLParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#ascDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscDesc(MySQLParser.AscDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(MySQLParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#groupByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByItem(MySQLParser.GroupByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(MySQLParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#orderByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByItem(MySQLParser.OrderByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(MySQLParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAlias(MySQLParser.TableAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(MySQLParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MySQLParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(MySQLParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#columnNameAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNameAlias(MySQLParser.ColumnNameAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(MySQLParser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#columnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnList(MySQLParser.ColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#columnListClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnListClause(MySQLParser.ColumnListClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(MySQLParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#selectKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectKey(MySQLParser.SelectKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(MySQLParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MySQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(MySQLParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#rightElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightElement(MySQLParser.RightElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#leftElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftElement(MySQLParser.LeftElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#targetElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetElement(MySQLParser.TargetElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOp(MySQLParser.RelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#exprOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOp(MySQLParser.ExprOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#betweenOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenOp(MySQLParser.BetweenOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#isOrIsNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsOrIsNot(MySQLParser.IsOrIsNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(MySQLParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#inSubquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInSubquery(MySQLParser.InSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(MySQLParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#notExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExists(MySQLParser.NotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#inClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInClause(MySQLParser.InClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tableReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReferences(MySQLParser.TableReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(MySQLParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tableFactor4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFactor4(MySQLParser.TableFactor4Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#leftjoinTableAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftjoinTableAtom(MySQLParser.LeftjoinTableAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tableAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAtom(MySQLParser.TableAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(MySQLParser.JoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#joinCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCondition(MySQLParser.JoinConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#indexHintList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHintList(MySQLParser.IndexHintListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#indexOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOptions(MySQLParser.IndexOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#indexHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHint(MySQLParser.IndexHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#indexList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexList(MySQLParser.IndexListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#partitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionClause(MySQLParser.PartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#partitionNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionNames(MySQLParser.PartitionNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#partitionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionName(MySQLParser.PartitionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#subqueryAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryAlias(MySQLParser.SubqueryAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(MySQLParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#subqueryEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryEnd(MySQLParser.SubqueryEndContext ctx);
}