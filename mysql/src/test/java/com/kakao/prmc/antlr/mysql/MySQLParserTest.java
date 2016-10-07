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
        checkJava("exists1");
        checkJava("simple1");
        checkJava("simple2");
        checkJava("simple3");
        checkJava("exists1");
        checkJava("groupBy1");
        checkJava("leftJoin1");
        checkJava("in1");
    }

    private MySQLParser.SelectClauseContext getSelectClauseContext(String filename) throws IOException {
        MySQLLexer mySQLLexer = new MySQLLexer(new ANTLRFileStream(String.format("sql/%s.sql", filename)));
        CommonTokenStream commonTokenStream = new CommonTokenStream(mySQLLexer);
        return new MySQLParser(commonTokenStream).selectClause();
    }

    private MySQLVisitor getMySQLVisitor(String filename) throws IOException {
        MySQLVisitor mySQLVisitor = new MySQLVisitor(MySQLVisitor.Mode.PRE);
        mySQLVisitor.visit(getSelectClauseContext(filename));
        return mySQLVisitor;
    }

    private MySQLVisitor getMySQLVisitor(String filename, MySQLVisitor preMySQLVisitor) throws IOException {
        MySQLVisitor mySQLVisitor = new MySQLVisitor(MySQLVisitor.Mode.POST);
        mySQLVisitor.setIndexTableMap(preMySQLVisitor.getIndexTableMap());
        mySQLVisitor.visit(getSelectClauseContext(filename));
        return mySQLVisitor;
    }

    private void checkJava(String filename) throws Exception {
        MySQLVisitor postMySQLVisitor = getMySQLVisitor(filename, getMySQLVisitor(filename));
        String content = CoreUtil.getContent(new File(String.format("java/%s.java", filename)));
        String source = postMySQLVisitor.getSource();
        this.log(filename, source);
        assertThat(source).isEqualTo(content);
    }

    public void log(Object object) {
        System.out.println("###" + object);
    }

    public void log(String title, Object object) {
        log(title + ":" + CoreUtil.toJson(object));
    }

    public void log(String title, String log) {
        log(title + ":" + log);
    }
}