// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Json read settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("JsonReadSettings")
@Fluent
public final class JsonReadSettings extends FormatReadSettings {
    /*
     * Compression settings.
     */
    @JsonProperty(value = "compressionProperties")
    private CompressionReadSettings compressionProperties;

    /**
     * Creates an instance of JsonReadSettings class.
     */
    public JsonReadSettings() {
    }

    /**
     * Get the compressionProperties property: Compression settings.
     * 
     * @return the compressionProperties value.
     */
    public CompressionReadSettings compressionProperties() {
        return this.compressionProperties;
    }

    /**
     * Set the compressionProperties property: Compression settings.
     * 
     * @param compressionProperties the compressionProperties value to set.
     * @return the JsonReadSettings object itself.
     */
    public JsonReadSettings withCompressionProperties(CompressionReadSettings compressionProperties) {
        this.compressionProperties = compressionProperties;
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
        if (compressionProperties() != null) {
            compressionProperties().validate();
        }
    }
}
