package com.kakao.prmc.antlr.mysql;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import com.kakao.prmc.core.utility.CoreUtil;

public class MySQLParserTest {
    @Test
    public void visit() throws Exception {
        checkTableMap("exists1");
        checkTableMap("exists2");
        checkTableMap("simple1");
        checkJava("simple1");
    }

    private MySQLVisitor getMySQLVisitor(String filename) throws IOException {
        MySQLLexer mySQLLexer = new MySQLLexer(new ANTLRFileStream(String.format("sql/%s.sql", filename)));
        CommonTokenStream commonTokenStream = new CommonTokenStream(mySQLLexer);
        MySQLParser mySQLParser = new MySQLParser(commonTokenStream);
        MySQLVisitor mySQLVisitor = new MySQLVisitor(MySQLVisitor.Mode.PRE);
        mySQLVisitor.visit(mySQLParser.select_clause());
        return mySQLVisitor;
    }

    private MySQLVisitor getMySQLVisitor(String filename, MySQLVisitor preMySQLVisitor) throws IOException {
        MySQLLexer mySQLLexer = new MySQLLexer(new ANTLRFileStream(String.format("sql/%s.sql", filename)));
        CommonTokenStream commonTokenStream = new CommonTokenStream(mySQLLexer);
        MySQLParser mySQLParser = new MySQLParser(commonTokenStream);
        MySQLVisitor mySQLVisitor = new MySQLVisitor(MySQLVisitor.Mode.POST);
        mySQLVisitor.setTableMap(preMySQLVisitor.getTableMap());
        mySQLVisitor.visit(mySQLParser.select_clause());
        return mySQLVisitor;
    }

    private void checkTableMap(String filename) throws Exception {
        MySQLVisitor mySQLVisitor = getMySQLVisitor(filename);
        assertThat(CoreUtil.toJson(mySQLVisitor.getTableMap())).isEqualTo(CoreUtil.getContent(new File(String.format("json/%s.json", filename))));
    }

    private void checkJava(String filename) throws Exception {
        MySQLVisitor mySQLVisitor = getMySQLVisitor(filename);
        MySQLVisitor postMySQLVisitor = getMySQLVisitor(filename, mySQLVisitor);
        assertThat(postMySQLVisitor.getSource()).isEqualTo(CoreUtil.getContent(new File(String.format("java/%s.java", filename))));
    }
}