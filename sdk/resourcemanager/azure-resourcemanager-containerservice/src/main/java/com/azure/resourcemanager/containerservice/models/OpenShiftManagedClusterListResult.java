// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.containerservice.fluent.models.OpenShiftManagedClusterInner;
import java.io.IOException;
import java.util.List;

/**
 * The response from the List OpenShift Managed Clusters operation.
 */
@Fluent
public final class OpenShiftManagedClusterListResult implements JsonSerializable<OpenShiftManagedClusterListResult> {
    /*
     * The list of OpenShift managed clusters.
     */
    private List<OpenShiftManagedClusterInner> value;

    /*
     * The URL to get the next set of OpenShift managed cluster results.
     */
    private String nextLink;

    /**
     * Creates an instance of OpenShiftManagedClusterListResult class.
     */
    public OpenShiftManagedClusterListResult() {
    }

    /**
     * Get the value property: The list of OpenShift managed clusters.
     * 
     * @return the value value.
     */
    public List<OpenShiftManagedClusterInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of OpenShift managed clusters.
     * 
     * @param value the value value to set.
     * @return the OpenShiftManagedClusterListResult object itself.
     */
    public OpenShiftManagedClusterListResult withValue(List<OpenShiftManagedClusterInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of OpenShift managed cluster results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OpenShiftManagedClusterListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OpenShiftManagedClusterListResult if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OpenShiftManagedClusterListResult.
     */
    public static OpenShiftManagedClusterListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OpenShiftManagedClusterListResult deserializedOpenShiftManagedClusterListResult
                = new OpenShiftManagedClusterListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<OpenShiftManagedClusterInner> value
                        = reader.readArray(reader1 -> OpenShiftManagedClusterInner.fromJson(reader1));
                    deserializedOpenShiftManagedClusterListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedOpenShiftManagedClusterListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOpenShiftManagedClusterListResult;
        });
    }
}
