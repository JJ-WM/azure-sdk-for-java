// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The settings that will be leveraged for SAP HANA source partitioning.
 */
@Fluent
public final class SapHanaPartitionSettings {
    /*
     * The name of the column that will be used for proceeding range partitioning. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "partitionColumnName")
    private Object partitionColumnName;

    /**
     * Creates an instance of SapHanaPartitionSettings class.
     */
    public SapHanaPartitionSettings() {
    }

    /**
     * Get the partitionColumnName property: The name of the column that will be used for proceeding range
     * partitioning. Type: string (or Expression with resultType string).
     * 
     * @return the partitionColumnName value.
     */
    public Object getPartitionColumnName() {
        return this.partitionColumnName;
    }

    /**
     * Set the partitionColumnName property: The name of the column that will be used for proceeding range
     * partitioning. Type: string (or Expression with resultType string).
     * 
     * @param partitionColumnName the partitionColumnName value to set.
     * @return the SapHanaPartitionSettings object itself.
     */
    public SapHanaPartitionSettings setPartitionColumnName(Object partitionColumnName) {
        this.partitionColumnName = partitionColumnName;
        return this;
    }
}
