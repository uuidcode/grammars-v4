
parser grammar MySQLParser;

options
   { tokenVocab = MySQLLexer; }

stat
   : select_clause+
   ;

schema_name
   : ID
   ;

select_clause
   : SELECT column_list_clause ( from_clause )? ( where_clause )? ( groupBy_clause )? ( orderBy_clause )?
   ;

asc_desc
    : ASC
    | DESC
    ;

groupBy_clause
    : GROUP BY groupBy_item? ( COMMA groupBy_item )*
    ;

groupBy_item
    : column_name
    ;

orderBy_clause
    : ORDER BY orderBy_item? ( COMMA orderBy_item )*
    ;

orderBy_item
    : column_name (asc_desc)?
    ;

table_name
   : ID
   ;

table_alias
   : ID
   ;

column_name
   : ASTERISK
   | table_alias DOT ASTERISK
   | ( table_alias DOT )? ID
   | INT
   | STRING
   | function
   ;

function
    : ID LPAREN function_parameter RPAREN
    ;

function_parameter
    : column_name ( COMMA column_name )*
    ;

column_name_alias
   : ID
   ;

index_name
   : ID
   ;

column_list
   : LPAREN column_name ( COMMA column_name )* RPAREN
   ;

column_list_clause
   : column_name ( COMMA column_name )*
   ;

from_clause
   :  FROM table_references
   ;

select_key
   : SELECT
   ;

where_clause
   : WHERE expression
   ;

expression
   : simple_expression ( expr_op simple_expression )*
   ;

element
   : column_name
   | INT
   | STRING
   ;

right_element
   : element
   ;

left_element
   : element
   ;

target_element
   : element
   ;

relational_op
   : EQ | LTH | GTH | NOT_EQ | LET | GET
   ;

expr_op
   : AND | XOR | OR | NOT
   ;

between_op
   : BETWEEN
   ;

is_or_is_not
   : IS | IS NOT
   ;

simple_expression
   : left_element relational_op right_element
   | target_element between_op left_element AND right_element
   | target_element is_or_is_not NULL
   | EXISTS subquery
   | NOT EXISTS subquery
   | element IN in_clause
   ;

in_clause
    :LPAREN (element | INT | STRING) ( COMMA element | INT | STRING )+ RPAREN
    ;

table_references
   : table_reference ( ( COMMA table_reference ) | join_clause )*

   ;

table_reference
   : table_atom
   ;

//table_factor1
//   : table_factor2 ( ( INNER | CROSS )? JOIN table_atom ( join_condition )? )?
//   ;
//
//table_factor2
//   : table_factor3 ( STRAIGHT_JOIN table_atom ( ON expression )? )?
//   ;
//
//table_factor3
//   : table_factor4 ( ( LEFT | RIGHT ) ( OUTER )? JOIN table_factor4 join_condition )?
//   ;
//
table_factor4
   : table_atom ( NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom )?
   ;

leftjoin_table_atom
    : table_atom
    ;

table_atom
   : ( table_name ( partition_clause )? ( table_alias )? ( index_hint_list )? ) | ( subquery subquery_alias ) | ( LPAREN table_references RPAREN ) | ( OJ table_reference LEFT OUTER JOIN table_reference ON expression )
   ;

join_clause
   : ( ( INNER | CROSS )? JOIN table_atom ( join_condition )? ) | ( STRAIGHT_JOIN table_atom ( ON expression )? ) | ( ( LEFT | RIGHT ) ( OUTER )? JOIN leftjoin_table_atom join_condition ) | ( NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom )
   ;

join_condition
   : ( ON expression ( expr_op expression )* ) | ( USING column_list )
   ;

index_hint_list
   : index_hint ( COMMA index_hint )*
   ;

index_options
   : ( INDEX | KEY ) ( FOR ( ( JOIN ) | ( ORDER BY ) | ( GROUP BY ) ) )?
   ;

index_hint
   : USE index_options LPAREN ( index_list )? RPAREN | IGNORE index_options LPAREN index_list RPAREN
   ;

index_list
   : index_name ( COMMA index_name )*
   ;

partition_clause
   : PARTITION LPAREN partition_names RPAREN
   ;

partition_names
   : partition_name ( COMMA partition_name )*
   ;

partition_name
   : ID
   ;

subquery_alias
   : ID
   ;

subquery
   : LPAREN select_clause RPAREN
   ;
