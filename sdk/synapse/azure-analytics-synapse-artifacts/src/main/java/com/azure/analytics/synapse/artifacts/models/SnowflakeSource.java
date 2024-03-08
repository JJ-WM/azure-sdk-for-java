// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity snowflake source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SnowflakeSource")
@Fluent
public final class SnowflakeSource extends CopySource {
    /*
     * Snowflake Sql query. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /*
     * Snowflake export settings.
     */
    @JsonProperty(value = "exportSettings", required = true)
    private SnowflakeExportCopyCommand exportSettings;

    /**
     * Creates an instance of SnowflakeSource class.
     */
    public SnowflakeSource() {
    }

    /**
     * Get the query property: Snowflake Sql query. Type: string (or Expression with resultType string).
     * 
     * @return the query value.
     */
    public Object getQuery() {
        return this.query;
    }

    /**
     * Set the query property: Snowflake Sql query. Type: string (or Expression with resultType string).
     * 
     * @param query the query value to set.
     * @return the SnowflakeSource object itself.
     */
    public SnowflakeSource setQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the exportSettings property: Snowflake export settings.
     * 
     * @return the exportSettings value.
     */
    public SnowflakeExportCopyCommand getExportSettings() {
        return this.exportSettings;
    }

    /**
     * Set the exportSettings property: Snowflake export settings.
     * 
     * @param exportSettings the exportSettings value to set.
     * @return the SnowflakeSource object itself.
     */
    public SnowflakeSource setExportSettings(SnowflakeExportCopyCommand exportSettings) {
        this.exportSettings = exportSettings;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SnowflakeSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SnowflakeSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SnowflakeSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
