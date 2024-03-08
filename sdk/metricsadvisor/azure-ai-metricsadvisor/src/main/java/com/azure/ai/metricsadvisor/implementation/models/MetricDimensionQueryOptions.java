// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The MetricDimensionQueryOptions model.
 */
@Fluent
public final class MetricDimensionQueryOptions implements JsonSerializable<MetricDimensionQueryOptions> {
    /*
     * dimension name
     */
    private String dimensionName;

    /*
     * dimension value to be filtered
     */
    private String dimensionValueFilter;

    /**
     * Creates an instance of MetricDimensionQueryOptions class.
     */
    public MetricDimensionQueryOptions() {
    }

    /**
     * Get the dimensionName property: dimension name.
     * 
     * @return the dimensionName value.
     */
    public String getDimensionName() {
        return this.dimensionName;
    }

    /**
     * Set the dimensionName property: dimension name.
     * 
     * @param dimensionName the dimensionName value to set.
     * @return the MetricDimensionQueryOptions object itself.
     */
    public MetricDimensionQueryOptions setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
        return this;
    }

    /**
     * Get the dimensionValueFilter property: dimension value to be filtered.
     * 
     * @return the dimensionValueFilter value.
     */
    public String getDimensionValueFilter() {
        return this.dimensionValueFilter;
    }

    /**
     * Set the dimensionValueFilter property: dimension value to be filtered.
     * 
     * @param dimensionValueFilter the dimensionValueFilter value to set.
     * @return the MetricDimensionQueryOptions object itself.
     */
    public MetricDimensionQueryOptions setDimensionValueFilter(String dimensionValueFilter) {
        this.dimensionValueFilter = dimensionValueFilter;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dimensionName", this.dimensionName);
        jsonWriter.writeStringField("dimensionValueFilter", this.dimensionValueFilter);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetricDimensionQueryOptions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetricDimensionQueryOptions if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MetricDimensionQueryOptions.
     */
    public static MetricDimensionQueryOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MetricDimensionQueryOptions deserializedMetricDimensionQueryOptions = new MetricDimensionQueryOptions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dimensionName".equals(fieldName)) {
                    deserializedMetricDimensionQueryOptions.dimensionName = reader.getString();
                } else if ("dimensionValueFilter".equals(fieldName)) {
                    deserializedMetricDimensionQueryOptions.dimensionValueFilter = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMetricDimensionQueryOptions;
        });
    }
}
