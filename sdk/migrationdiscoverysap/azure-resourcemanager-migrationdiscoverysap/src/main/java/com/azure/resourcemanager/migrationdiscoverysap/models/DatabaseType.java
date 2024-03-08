// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migrationdiscoverysap.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Select the database if this is a database server. Leave blank or add Not Applicable for all other instances except
 * the Database Instance.
 */
public final class DatabaseType extends ExpandableStringEnum<DatabaseType> {
    /**
     * Static value Adabas for DatabaseType.
     */
    public static final DatabaseType ADABAS = fromString("Adabas");

    /**
     * Static value Oracle for DatabaseType.
     */
    public static final DatabaseType ORACLE = fromString("Oracle");

    /**
     * Static value SAPMaxDB for DatabaseType.
     */
    public static final DatabaseType SAPMAX_DB = fromString("SAPMaxDB");

    /**
     * Static value Db2 for DatabaseType.
     */
    public static final DatabaseType DB2 = fromString("Db2");

    /**
     * Static value SAPASE for DatabaseType.
     */
    public static final DatabaseType SAPASE = fromString("SAPASE");

    /**
     * Static value SQLServer for DatabaseType.
     */
    public static final DatabaseType SQLSERVER = fromString("SQLServer");

    /**
     * Static value Informix for DatabaseType.
     */
    public static final DatabaseType INFORMIX = fromString("Informix");

    /**
     * Static value SAPDB for DatabaseType.
     */
    public static final DatabaseType SAPDB = fromString("SAPDB");

    /**
     * Static value HANA for DatabaseType.
     */
    public static final DatabaseType HANA = fromString("HANA");

    /**
     * Creates a new instance of DatabaseType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DatabaseType() {
    }

    /**
     * Creates or finds a DatabaseType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DatabaseType.
     */
    @JsonCreator
    public static DatabaseType fromString(String name) {
        return fromString(name, DatabaseType.class);
    }

    /**
     * Gets known DatabaseType values.
     * 
     * @return known DatabaseType values.
     */
    public static Collection<DatabaseType> values() {
        return values(DatabaseType.class);
    }
}
