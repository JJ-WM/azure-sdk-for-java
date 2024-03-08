// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Azure MySql sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureMySqlSink")
@Fluent
public final class AzureMySqlSink extends CopySink {
    /*
     * A query to execute before starting the copy. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "preCopyScript")
    private Object preCopyScript;

    /**
     * Creates an instance of AzureMySqlSink class.
     */
    public AzureMySqlSink() {
    }

    /**
     * Get the preCopyScript property: A query to execute before starting the copy. Type: string (or Expression with
     * resultType string).
     * 
     * @return the preCopyScript value.
     */
    public Object getPreCopyScript() {
        return this.preCopyScript;
    }

    /**
     * Set the preCopyScript property: A query to execute before starting the copy. Type: string (or Expression with
     * resultType string).
     * 
     * @param preCopyScript the preCopyScript value to set.
     * @return the AzureMySqlSink object itself.
     */
    public AzureMySqlSink setPreCopyScript(Object preCopyScript) {
        this.preCopyScript = preCopyScript;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMySqlSink setWriteBatchSize(Object writeBatchSize) {
        super.setWriteBatchSize(writeBatchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMySqlSink setWriteBatchTimeout(Object writeBatchTimeout) {
        super.setWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMySqlSink setSinkRetryCount(Object sinkRetryCount) {
        super.setSinkRetryCount(sinkRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMySqlSink setSinkRetryWait(Object sinkRetryWait) {
        super.setSinkRetryWait(sinkRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMySqlSink setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
