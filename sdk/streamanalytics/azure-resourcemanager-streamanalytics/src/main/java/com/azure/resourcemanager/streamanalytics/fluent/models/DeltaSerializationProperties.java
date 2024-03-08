// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The properties that are associated with the Delta Lake serialization type.
 */
@Fluent
public final class DeltaSerializationProperties {
    /*
     * Specifies the path of the Delta Lake table that the output will be written to.
     */
    @JsonProperty(value = "deltaTablePath", required = true)
    private String deltaTablePath;

    /*
     * Specifies the names of the columns for which the Delta Lake table will be partitioned. We are only supporting 1
     * partition column, but keeping it as an array for extensibility.
     */
    @JsonProperty(value = "partitionColumns")
    private List<String> partitionColumns;

    /**
     * Creates an instance of DeltaSerializationProperties class.
     */
    public DeltaSerializationProperties() {
    }

    /**
     * Get the deltaTablePath property: Specifies the path of the Delta Lake table that the output will be written to.
     * 
     * @return the deltaTablePath value.
     */
    public String deltaTablePath() {
        return this.deltaTablePath;
    }

    /**
     * Set the deltaTablePath property: Specifies the path of the Delta Lake table that the output will be written to.
     * 
     * @param deltaTablePath the deltaTablePath value to set.
     * @return the DeltaSerializationProperties object itself.
     */
    public DeltaSerializationProperties withDeltaTablePath(String deltaTablePath) {
        this.deltaTablePath = deltaTablePath;
        return this;
    }

    /**
     * Get the partitionColumns property: Specifies the names of the columns for which the Delta Lake table will be
     * partitioned. We are only supporting 1 partition column, but keeping it as an array for extensibility.
     * 
     * @return the partitionColumns value.
     */
    public List<String> partitionColumns() {
        return this.partitionColumns;
    }

    /**
     * Set the partitionColumns property: Specifies the names of the columns for which the Delta Lake table will be
     * partitioned. We are only supporting 1 partition column, but keeping it as an array for extensibility.
     * 
     * @param partitionColumns the partitionColumns value to set.
     * @return the DeltaSerializationProperties object itself.
     */
    public DeltaSerializationProperties withPartitionColumns(List<String> partitionColumns) {
        this.partitionColumns = partitionColumns;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deltaTablePath() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property deltaTablePath in model DeltaSerializationProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DeltaSerializationProperties.class);
}
