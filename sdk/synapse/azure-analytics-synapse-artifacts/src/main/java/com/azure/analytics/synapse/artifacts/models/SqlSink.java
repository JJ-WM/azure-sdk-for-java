// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity SQL sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SqlSink")
@Fluent
public final class SqlSink extends CopySink {
    /*
     * SQL writer stored procedure name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "sqlWriterStoredProcedureName")
    private Object sqlWriterStoredProcedureName;

    /*
     * SQL writer table type. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "sqlWriterTableType")
    private Object sqlWriterTableType;

    /*
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "preCopyScript")
    private Object preCopyScript;

    /*
     * SQL stored procedure parameters.
     */
    @JsonProperty(value = "storedProcedureParameters")
    private Object storedProcedureParameters;

    /*
     * The stored procedure parameter name of the table type. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "storedProcedureTableTypeParameterName")
    private Object storedProcedureTableTypeParameterName;

    /*
     * The option to handle sink table, such as autoCreate. For now only 'autoCreate' value is supported. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "tableOption")
    private Object tableOption;

    /**
     * Creates an instance of SqlSink class.
     */
    public SqlSink() {
    }

    /**
     * Get the sqlWriterStoredProcedureName property: SQL writer stored procedure name. Type: string (or Expression
     * with resultType string).
     * 
     * @return the sqlWriterStoredProcedureName value.
     */
    public Object getSqlWriterStoredProcedureName() {
        return this.sqlWriterStoredProcedureName;
    }

    /**
     * Set the sqlWriterStoredProcedureName property: SQL writer stored procedure name. Type: string (or Expression
     * with resultType string).
     * 
     * @param sqlWriterStoredProcedureName the sqlWriterStoredProcedureName value to set.
     * @return the SqlSink object itself.
     */
    public SqlSink setSqlWriterStoredProcedureName(Object sqlWriterStoredProcedureName) {
        this.sqlWriterStoredProcedureName = sqlWriterStoredProcedureName;
        return this;
    }

    /**
     * Get the sqlWriterTableType property: SQL writer table type. Type: string (or Expression with resultType string).
     * 
     * @return the sqlWriterTableType value.
     */
    public Object getSqlWriterTableType() {
        return this.sqlWriterTableType;
    }

    /**
     * Set the sqlWriterTableType property: SQL writer table type. Type: string (or Expression with resultType string).
     * 
     * @param sqlWriterTableType the sqlWriterTableType value to set.
     * @return the SqlSink object itself.
     */
    public SqlSink setSqlWriterTableType(Object sqlWriterTableType) {
        this.sqlWriterTableType = sqlWriterTableType;
        return this;
    }

    /**
     * Get the preCopyScript property: SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     * @return the preCopyScript value.
     */
    public Object getPreCopyScript() {
        return this.preCopyScript;
    }

    /**
     * Set the preCopyScript property: SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     * @param preCopyScript the preCopyScript value to set.
     * @return the SqlSink object itself.
     */
    public SqlSink setPreCopyScript(Object preCopyScript) {
        this.preCopyScript = preCopyScript;
        return this;
    }

    /**
     * Get the storedProcedureParameters property: SQL stored procedure parameters.
     * 
     * @return the storedProcedureParameters value.
     */
    public Object getStoredProcedureParameters() {
        return this.storedProcedureParameters;
    }

    /**
     * Set the storedProcedureParameters property: SQL stored procedure parameters.
     * 
     * @param storedProcedureParameters the storedProcedureParameters value to set.
     * @return the SqlSink object itself.
     */
    public SqlSink setStoredProcedureParameters(Object storedProcedureParameters) {
        this.storedProcedureParameters = storedProcedureParameters;
        return this;
    }

    /**
     * Get the storedProcedureTableTypeParameterName property: The stored procedure parameter name of the table type.
     * Type: string (or Expression with resultType string).
     * 
     * @return the storedProcedureTableTypeParameterName value.
     */
    public Object getStoredProcedureTableTypeParameterName() {
        return this.storedProcedureTableTypeParameterName;
    }

    /**
     * Set the storedProcedureTableTypeParameterName property: The stored procedure parameter name of the table type.
     * Type: string (or Expression with resultType string).
     * 
     * @param storedProcedureTableTypeParameterName the storedProcedureTableTypeParameterName value to set.
     * @return the SqlSink object itself.
     */
    public SqlSink setStoredProcedureTableTypeParameterName(Object storedProcedureTableTypeParameterName) {
        this.storedProcedureTableTypeParameterName = storedProcedureTableTypeParameterName;
        return this;
    }

    /**
     * Get the tableOption property: The option to handle sink table, such as autoCreate. For now only 'autoCreate'
     * value is supported. Type: string (or Expression with resultType string).
     * 
     * @return the tableOption value.
     */
    public Object getTableOption() {
        return this.tableOption;
    }

    /**
     * Set the tableOption property: The option to handle sink table, such as autoCreate. For now only 'autoCreate'
     * value is supported. Type: string (or Expression with resultType string).
     * 
     * @param tableOption the tableOption value to set.
     * @return the SqlSink object itself.
     */
    public SqlSink setTableOption(Object tableOption) {
        this.tableOption = tableOption;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSink setWriteBatchSize(Object writeBatchSize) {
        super.setWriteBatchSize(writeBatchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSink setWriteBatchTimeout(Object writeBatchTimeout) {
        super.setWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSink setSinkRetryCount(Object sinkRetryCount) {
        super.setSinkRetryCount(sinkRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSink setSinkRetryWait(Object sinkRetryWait) {
        super.setSinkRetryWait(sinkRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSink setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
