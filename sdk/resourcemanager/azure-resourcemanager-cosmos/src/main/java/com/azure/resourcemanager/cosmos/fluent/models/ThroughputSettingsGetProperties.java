// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.models.ThroughputSettingsGetPropertiesResource;
import java.io.IOException;

/**
 * The properties of an Azure Cosmos DB resource throughput.
 */
@Fluent
public final class ThroughputSettingsGetProperties implements JsonSerializable<ThroughputSettingsGetProperties> {
    /*
     * The resource property.
     */
    private ThroughputSettingsGetPropertiesResource resource;

    /**
     * Creates an instance of ThroughputSettingsGetProperties class.
     */
    public ThroughputSettingsGetProperties() {
    }

    /**
     * Get the resource property: The resource property.
     * 
     * @return the resource value.
     */
    public ThroughputSettingsGetPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource property.
     * 
     * @param resource the resource value to set.
     * @return the ThroughputSettingsGetProperties object itself.
     */
    public ThroughputSettingsGetProperties withResource(ThroughputSettingsGetPropertiesResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resource() != null) {
            resource().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("resource", this.resource);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ThroughputSettingsGetProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ThroughputSettingsGetProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ThroughputSettingsGetProperties.
     */
    public static ThroughputSettingsGetProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ThroughputSettingsGetProperties deserializedThroughputSettingsGetProperties
                = new ThroughputSettingsGetProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resource".equals(fieldName)) {
                    deserializedThroughputSettingsGetProperties.resource
                        = ThroughputSettingsGetPropertiesResource.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedThroughputSettingsGetProperties;
        });
    }
}
