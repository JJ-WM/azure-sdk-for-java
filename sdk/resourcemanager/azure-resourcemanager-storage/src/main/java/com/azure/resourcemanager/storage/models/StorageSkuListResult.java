// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.storage.fluent.models.SkuInformationInner;
import java.io.IOException;
import java.util.List;

/**
 * The response from the List Storage SKUs operation.
 */
@Immutable
public final class StorageSkuListResult implements JsonSerializable<StorageSkuListResult> {
    /*
     * Get the list result of storage SKUs and their properties.
     */
    private List<SkuInformationInner> value;

    /**
     * Creates an instance of StorageSkuListResult class.
     */
    public StorageSkuListResult() {
    }

    /**
     * Get the value property: Get the list result of storage SKUs and their properties.
     * 
     * @return the value value.
     */
    public List<SkuInformationInner> value() {
        return this.value;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StorageSkuListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageSkuListResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StorageSkuListResult.
     */
    public static StorageSkuListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageSkuListResult deserializedStorageSkuListResult = new StorageSkuListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<SkuInformationInner> value
                        = reader.readArray(reader1 -> SkuInformationInner.fromJson(reader1));
                    deserializedStorageSkuListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageSkuListResult;
        });
    }
}
