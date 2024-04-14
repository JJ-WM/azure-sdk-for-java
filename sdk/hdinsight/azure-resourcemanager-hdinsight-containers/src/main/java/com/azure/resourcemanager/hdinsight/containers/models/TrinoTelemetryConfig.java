// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Trino user telemetry definition.
 */
@Fluent
public final class TrinoTelemetryConfig {
    /*
     * Hive Catalog name used to mount external tables on the logs written by trino, if not specified there tables are
     * not created.
     */
    @JsonProperty(value = "hivecatalogName")
    private String hivecatalogName;

    /*
     * Schema of the above catalog to use, to mount query logs as external tables, if not specified tables will be
     * mounted under schema trinologs.
     */
    @JsonProperty(value = "hivecatalogSchema")
    private String hivecatalogSchema;

    /*
     * Retention period for query log table partitions, this doesn't have any affect on actual data.
     */
    @JsonProperty(value = "partitionRetentionInDays")
    private Integer partitionRetentionInDays;

    /*
     * Azure storage location of the blobs.
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * Creates an instance of TrinoTelemetryConfig class.
     */
    public TrinoTelemetryConfig() {
    }

    /**
     * Get the hivecatalogName property: Hive Catalog name used to mount external tables on the logs written by trino,
     * if not specified there tables are not created.
     * 
     * @return the hivecatalogName value.
     */
    public String hivecatalogName() {
        return this.hivecatalogName;
    }

    /**
     * Set the hivecatalogName property: Hive Catalog name used to mount external tables on the logs written by trino,
     * if not specified there tables are not created.
     * 
     * @param hivecatalogName the hivecatalogName value to set.
     * @return the TrinoTelemetryConfig object itself.
     */
    public TrinoTelemetryConfig withHivecatalogName(String hivecatalogName) {
        this.hivecatalogName = hivecatalogName;
        return this;
    }

    /**
     * Get the hivecatalogSchema property: Schema of the above catalog to use, to mount query logs as external tables,
     * if not specified tables will be mounted under schema trinologs.
     * 
     * @return the hivecatalogSchema value.
     */
    public String hivecatalogSchema() {
        return this.hivecatalogSchema;
    }

    /**
     * Set the hivecatalogSchema property: Schema of the above catalog to use, to mount query logs as external tables,
     * if not specified tables will be mounted under schema trinologs.
     * 
     * @param hivecatalogSchema the hivecatalogSchema value to set.
     * @return the TrinoTelemetryConfig object itself.
     */
    public TrinoTelemetryConfig withHivecatalogSchema(String hivecatalogSchema) {
        this.hivecatalogSchema = hivecatalogSchema;
        return this;
    }

    /**
     * Get the partitionRetentionInDays property: Retention period for query log table partitions, this doesn't have
     * any affect on actual data.
     * 
     * @return the partitionRetentionInDays value.
     */
    public Integer partitionRetentionInDays() {
        return this.partitionRetentionInDays;
    }

    /**
     * Set the partitionRetentionInDays property: Retention period for query log table partitions, this doesn't have
     * any affect on actual data.
     * 
     * @param partitionRetentionInDays the partitionRetentionInDays value to set.
     * @return the TrinoTelemetryConfig object itself.
     */
    public TrinoTelemetryConfig withPartitionRetentionInDays(Integer partitionRetentionInDays) {
        this.partitionRetentionInDays = partitionRetentionInDays;
        return this;
    }

    /**
     * Get the path property: Azure storage location of the blobs.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Azure storage location of the blobs.
     * 
     * @param path the path value to set.
     * @return the TrinoTelemetryConfig object itself.
     */
    public TrinoTelemetryConfig withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
