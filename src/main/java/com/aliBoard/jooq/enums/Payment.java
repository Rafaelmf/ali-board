/*
 * This file is generated by jOOQ.
 */
package com.aliBoard.jooq.enums;


import com.aliBoard.jooq.Public;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum Payment implements EnumType {

    card("card"),

    cash("cash"),

    billet("billet");

    private final String literal;

    private Payment(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public String getName() {
        return "payment";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
