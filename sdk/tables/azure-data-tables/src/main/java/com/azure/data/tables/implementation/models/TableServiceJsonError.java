// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.tables.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Table service error.
 */
@Fluent
public final class TableServiceJsonError implements JsonSerializable<TableServiceJsonError> {
    /*
     * The service error.
     */
    private TableServiceOdataError odataError;

    /**
     * Creates an instance of TableServiceJsonError class.
     */
    public TableServiceJsonError() {
    }

    /**
     * Get the odataError property: The service error.
     * 
     * @return the odataError value.
     */
    public TableServiceOdataError getOdataError() {
        return this.odataError;
    }

    /**
     * Set the odataError property: The service error.
     * 
     * @param odataError the odataError value to set.
     * @return the TableServiceJsonError object itself.
     */
    public TableServiceJsonError setOdataError(TableServiceOdataError odataError) {
        this.odataError = odataError;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("odata.error", this.odataError);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TableServiceJsonError from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TableServiceJsonError if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TableServiceJsonError.
     */
    public static TableServiceJsonError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TableServiceJsonError deserializedTableServiceJsonError = new TableServiceJsonError();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("odata.error".equals(fieldName)) {
                    deserializedTableServiceJsonError.odataError = TableServiceOdataError.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTableServiceJsonError;
        });
    }
}
