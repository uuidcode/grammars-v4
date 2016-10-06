package com.kakao.prmc.antlr.mysql;

public class Table {
    public static enum Type {
        JOIN, LEFT_JOIN
    }

    private String name;
    private String alias;
    private Type type;

    public Type getType() {
        return this.type;
    }

    public Table setType(Type type) {
        this.type = type;
        return this;
    }

    public String getAlias() {
        return this.alias;
    }

    public Table setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Table setName(String name) {
        this.name = name;
        return this;
    }
}
