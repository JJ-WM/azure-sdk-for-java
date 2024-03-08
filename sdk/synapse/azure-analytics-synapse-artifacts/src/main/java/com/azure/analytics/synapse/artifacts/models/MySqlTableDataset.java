// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * The MySQL table dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("MySqlTable")
@JsonFlatten
@Fluent
public class MySqlTableDataset extends Dataset {
    /*
     * The MySQL table name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tableName")
    private Object tableName;

    /**
     * Creates an instance of MySqlTableDataset class.
     */
    public MySqlTableDataset() {
    }

    /**
     * Get the tableName property: The MySQL table name. Type: string (or Expression with resultType string).
     * 
     * @return the tableName value.
     */
    public Object getTableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The MySQL table name. Type: string (or Expression with resultType string).
     * 
     * @param tableName the tableName value to set.
     * @return the MySqlTableDataset object itself.
     */
    public MySqlTableDataset setTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MySqlTableDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MySqlTableDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MySqlTableDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MySqlTableDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MySqlTableDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MySqlTableDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MySqlTableDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
