// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The List service SAS credentials operation response.
 */
@Immutable
public final class ListServiceSasResponseInner implements JsonSerializable<ListServiceSasResponseInner> {
    /*
     * List service SAS credentials of specific resource.
     */
    private String serviceSasToken;

    /**
     * Creates an instance of ListServiceSasResponseInner class.
     */
    public ListServiceSasResponseInner() {
    }

    /**
     * Get the serviceSasToken property: List service SAS credentials of specific resource.
     * 
     * @return the serviceSasToken value.
     */
    public String serviceSasToken() {
        return this.serviceSasToken;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
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
     * Reads an instance of ListServiceSasResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ListServiceSasResponseInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ListServiceSasResponseInner.
     */
    public static ListServiceSasResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ListServiceSasResponseInner deserializedListServiceSasResponseInner = new ListServiceSasResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serviceSasToken".equals(fieldName)) {
                    deserializedListServiceSasResponseInner.serviceSasToken = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedListServiceSasResponseInner;
        });
    }
}
