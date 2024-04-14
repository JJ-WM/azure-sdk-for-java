// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.confluent.models.SCMetadataEntity;
import com.azure.resourcemanager.confluent.models.SchemaRegistryClusterSpecEntity;
import com.azure.resourcemanager.confluent.models.SchemaRegistryClusterStatusEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema Registry Cluster Properties.
 */
@Fluent
public final class SchemaRegistryClusterProperties {
    /*
     * Metadata of the record
     */
    @JsonProperty(value = "metadata")
    private SCMetadataEntity metadata;

    /*
     * Specification of the schema registry cluster
     */
    @JsonProperty(value = "spec")
    private SchemaRegistryClusterSpecEntity spec;

    /*
     * Specification of the cluster status
     */
    @JsonProperty(value = "status")
    private SchemaRegistryClusterStatusEntity status;

    /**
     * Creates an instance of SchemaRegistryClusterProperties class.
     */
    public SchemaRegistryClusterProperties() {
    }

    /**
     * Get the metadata property: Metadata of the record.
     * 
     * @return the metadata value.
     */
    public SCMetadataEntity metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Metadata of the record.
     * 
     * @param metadata the metadata value to set.
     * @return the SchemaRegistryClusterProperties object itself.
     */
    public SchemaRegistryClusterProperties withMetadata(SCMetadataEntity metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the spec property: Specification of the schema registry cluster.
     * 
     * @return the spec value.
     */
    public SchemaRegistryClusterSpecEntity spec() {
        return this.spec;
    }

    /**
     * Set the spec property: Specification of the schema registry cluster.
     * 
     * @param spec the spec value to set.
     * @return the SchemaRegistryClusterProperties object itself.
     */
    public SchemaRegistryClusterProperties withSpec(SchemaRegistryClusterSpecEntity spec) {
        this.spec = spec;
        return this;
    }

    /**
     * Get the status property: Specification of the cluster status.
     * 
     * @return the status value.
     */
    public SchemaRegistryClusterStatusEntity status() {
        return this.status;
    }

    /**
     * Set the status property: Specification of the cluster status.
     * 
     * @param status the status value to set.
     * @return the SchemaRegistryClusterProperties object itself.
     */
    public SchemaRegistryClusterProperties withStatus(SchemaRegistryClusterStatusEntity status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metadata() != null) {
            metadata().validate();
        }
        if (spec() != null) {
            spec().validate();
        }
        if (status() != null) {
            status().validate();
        }
    }
}
