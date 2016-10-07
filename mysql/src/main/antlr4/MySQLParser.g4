
parser grammar MySQLParser;

options
   { tokenVocab = MySQLLexer; }

@header {
package com.kakao.prmc.antlr.mysql;
}

stat
   : selectClause+
   ;

schemaName
   : ID
   ;

selectClause
   : SELECT columnListClause ( fromClause )? ( whereClause )? ( groupByClause )? ( orderByClause )?
   ;

ascDesc
    : ASC
    | DESC
    ;

groupByClause
    : GROUP BY groupByItem? ( COMMA groupByItem )*
    ;

groupByItem
    : columnName
    ;

orderByClause
    : ORDER BY orderByItem? ( COMMA orderByItem )*
    ;

orderByItem
    : columnName (ascDesc)?
    ;

tableName
   : ID
   ;

tableAlias
   : ID
   ;

columnName
   : ( tableAlias DOT )? ASTERISK
   | ( tableAlias DOT )? ID
   | INT
   | STRING
   | function
   ;

function
    : ID LPAREN functionParameter RPAREN
    ;

functionParameter
    : columnName ( COMMA columnName )*
    ;

columnNameAlias
   : ID
   ;

indexName
   : ID
   ;

columnList
   : LPAREN columnName ( COMMA columnName )* RPAREN
   ;

columnListClause
   : columnName ( COMMA columnName )*
   ;

fromClause
   :  FROM tableReferences
   ;

selectKey
   : SELECT
   ;

whereClause
   : WHERE expression
   ;

expression
   : simpleExpression ( exprOp simpleExpression )*
   ;

element
   : columnName
   | INT
   | STRING
   ;

rightElement
   : element
   ;

leftElement
   : element
   ;

targetElement
   : element
   ;

relationalOp
   : EQ | LTH | GTH | NOT_EQ | LET | GET
   ;

exprOp
   : AND | XOR | OR | NOT
   ;

betweenOp
   : BETWEEN
   ;

isOrIsNot
   : IS | IS NOT
   ;

simpleExpression
   : leftElement relationalOp rightElement
   | targetElement betweenOp leftElement AND rightElement
   | targetElement isOrIsNot NULL
   | exists
   | notExists
   | element IN inClause
   | inSubquery
   ;

inSubquery
    : element IN subquery
    ;

exists
    : EXISTS subquery
    ;

notExists
    : NOT EXISTS subquery
    ;

inClause
    :LPAREN (element | INT | STRING) ( COMMA element | INT | STRING )+ RPAREN
    ;

tableReferences
   : tableReference ( ( COMMA tableReference ) | joinClause )*

   ;

tableReference
   : tableAtom
   ;

//tableFactor1
//   : tableFactor2 ( ( INNER | CROSS )? JOIN tableAtom ( joinCondition )? )?
//   ;
//
//tableFactor2
//   : tableFactor3 ( STRAIGHTJOIN tableAtom ( ON expression )? )?
//   ;
//
//tableFactor3
//   : tableFactor4 ( ( LEFT | RIGHT ) ( OUTER )? JOIN tableFactor4 joinCondition )?
//   ;
//
tableFactor4
   : tableAtom ( NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN tableAtom )?
   ;

leftjoinTableAtom
    : tableAtom
    ;

tableAtom
   : ( tableName ( partitionClause )? ( tableAlias )? ( indexHintList )? ) | ( subquery subqueryAlias ) | ( LPAREN tableReferences RPAREN ) | ( OJ tableReference LEFT OUTER JOIN tableReference ON expression )
   ;

joinClause
   : ( ( INNER | CROSS )? JOIN tableAtom ( joinCondition )? ) | ( STRAIGHTJOIN tableAtom ( ON expression )? ) | ( ( LEFT | RIGHT ) ( OUTER )? JOIN leftjoinTableAtom joinCondition ) | ( NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN tableAtom )
   ;

joinCondition
   : ( ON expression ( exprOp expression )* ) | ( USING columnList )
   ;

indexHintList
   : indexHint ( COMMA indexHint )*
   ;

indexOptions
   : ( INDEX | KEY ) ( FOR ( ( JOIN ) | ( ORDER BY ) | ( GROUP BY ) ) )?
   ;

indexHint
   : USE indexOptions LPAREN ( indexList )? RPAREN | IGNORE indexOptions LPAREN indexList RPAREN
   ;

indexList
   : indexName ( COMMA indexName )*
   ;

partitionClause
   : PARTITION LPAREN partitionNames RPAREN
   ;

partitionNames
   : partitionName ( COMMA partitionName )*
   ;

partitionName
   : ID
   ;

subqueryAlias
   : ID
   ;

subquery
   : LPAREN selectClause subqueryEnd
   ;

subqueryEnd
    : RPAREN
    ;
