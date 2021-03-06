/*
 * This file is generated by jOOQ.
 */
package com.aliBoard.jooq;


import com.aliBoard.jooq.tables.Company;
import com.aliBoard.jooq.tables.records.CompanyRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CompanyRecord> COMPANY_PKEY = Internal.createUniqueKey(Company.COMPANY, DSL.name("company_pkey"), new TableField[] { Company.COMPANY.ID }, true);
}
