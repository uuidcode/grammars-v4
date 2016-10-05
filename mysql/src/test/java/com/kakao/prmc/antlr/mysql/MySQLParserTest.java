package com.kakao.prmc.antlr.mysql;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import com.kakao.prmc.core.utility.CoreUtil;

public class MySQLParserTest {
    @Test
    public void visit() throws Exception {
        check("exists1");
        check("exists2");
    }

    private void check(String filename) throws Exception {
        MySQLLexer mySQLLexer = new MySQLLexer(new ANTLRFileStream(String.format("sql/%s.sql", filename)));
        CommonTokenStream commonTokenStream = new CommonTokenStream(mySQLLexer);
        MySQLParser mySQLParser = new MySQLParser(commonTokenStream);
        MySQLVisitor mySQLVisitor = new MySQLVisitor();
        mySQLVisitor.visit(mySQLParser.select_clause());
        assertThat(CoreUtil.toJson(mySQLVisitor.getTableMap())).isEqualTo(CoreUtil.getContent(new File(String.format("json/%s.json", filename))));
    }
}