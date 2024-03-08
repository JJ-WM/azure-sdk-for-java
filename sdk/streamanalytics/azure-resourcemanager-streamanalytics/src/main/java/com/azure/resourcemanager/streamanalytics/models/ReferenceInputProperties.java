// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The properties that are associated with an input containing reference data.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Reference")
@Fluent
public final class ReferenceInputProperties extends InputProperties {
    /*
     * Describes an input data source that contains reference data. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "datasource")
    private ReferenceInputDataSource datasource;

    /**
     * Creates an instance of ReferenceInputProperties class.
     */
    public ReferenceInputProperties() {
    }

    /**
     * Get the datasource property: Describes an input data source that contains reference data. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @return the datasource value.
     */
    public ReferenceInputDataSource datasource() {
        return this.datasource;
    }

    /**
     * Set the datasource property: Describes an input data source that contains reference data. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @param datasource the datasource value to set.
     * @return the ReferenceInputProperties object itself.
     */
    public ReferenceInputProperties withDatasource(ReferenceInputDataSource datasource) {
        this.datasource = datasource;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferenceInputProperties withSerialization(Serialization serialization) {
        super.withSerialization(serialization);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferenceInputProperties withCompression(Compression compression) {
        super.withCompression(compression);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferenceInputProperties withPartitionKey(String partitionKey) {
        super.withPartitionKey(partitionKey);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferenceInputProperties withWatermarkSettings(InputWatermarkProperties watermarkSettings) {
        super.withWatermarkSettings(watermarkSettings);
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
        if (datasource() != null) {
            datasource().validate();
        }
    }
}
