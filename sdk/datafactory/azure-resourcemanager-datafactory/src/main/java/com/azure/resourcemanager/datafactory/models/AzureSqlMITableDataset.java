// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.fluent.models.AzureSqlMITableDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * The Azure SQL Managed Instance dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = AzureSqlMITableDataset.class, visible = true)
@JsonTypeName("AzureSqlMITable")
@Fluent
public final class AzureSqlMITableDataset extends Dataset {
    /*
     * Type of dataset.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "AzureSqlMITable";

    /*
     * Azure SQL Managed Instance dataset properties.
     */
    @JsonProperty(value = "typeProperties")
    private AzureSqlMITableDatasetTypeProperties innerTypeProperties;

    /**
     * Creates an instance of AzureSqlMITableDataset class.
     */
    public AzureSqlMITableDataset() {
    }

    /**
     * Get the type property: Type of dataset.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Azure SQL Managed Instance dataset properties.
     * 
     * @return the innerTypeProperties value.
     */
    private AzureSqlMITableDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSqlMITableDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSqlMITableDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSqlMITableDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSqlMITableDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSqlMITableDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSqlMITableDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSqlMITableDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     * 
     * @return the tableName value.
     */
    public Object tableName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().tableName();
    }

    /**
     * Set the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     * 
     * @param tableName the tableName value to set.
     * @return the AzureSqlMITableDataset object itself.
     */
    public AzureSqlMITableDataset withTableName(Object tableName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureSqlMITableDatasetTypeProperties();
        }
        this.innerTypeProperties().withTableName(tableName);
        return this;
    }

    /**
     * Get the schema property: The schema name of the Azure SQL Managed Instance. Type: string (or Expression with
     * resultType string).
     * 
     * @return the schema value.
     */
    public Object schemaTypePropertiesSchema() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().schema();
    }

    /**
     * Set the schema property: The schema name of the Azure SQL Managed Instance. Type: string (or Expression with
     * resultType string).
     * 
     * @param schema the schema value to set.
     * @return the AzureSqlMITableDataset object itself.
     */
    public AzureSqlMITableDataset withSchemaTypePropertiesSchema(Object schema) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureSqlMITableDatasetTypeProperties();
        }
        this.innerTypeProperties().withSchema(schema);
        return this;
    }

    /**
     * Get the table property: The table name of the Azure SQL Managed Instance dataset. Type: string (or Expression
     * with resultType string).
     * 
     * @return the table value.
     */
    public Object table() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().table();
    }

    /**
     * Set the table property: The table name of the Azure SQL Managed Instance dataset. Type: string (or Expression
     * with resultType string).
     * 
     * @param table the table value to set.
     * @return the AzureSqlMITableDataset object itself.
     */
    public AzureSqlMITableDataset withTable(Object table) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureSqlMITableDatasetTypeProperties();
        }
        this.innerTypeProperties().withTable(table);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() != null) {
            innerTypeProperties().validate();
        }
    }
}
