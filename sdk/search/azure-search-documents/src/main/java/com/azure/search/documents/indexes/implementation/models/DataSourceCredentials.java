// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents credentials that can be used to connect to a datasource.
 */
@Fluent
public final class DataSourceCredentials implements JsonSerializable<DataSourceCredentials> {
    /*
     * The connection string for the datasource. Set to `<unchanged>` (with brackets) if you don't want the connection
     * string updated. Set to `<redacted>` if you want to remove the connection string value from the datasource.
     */
    private String connectionString;

    /**
     * Creates an instance of DataSourceCredentials class.
     */
    public DataSourceCredentials() {
    }

    /**
     * Get the connectionString property: The connection string for the datasource. Set to `&lt;unchanged&gt;` (with
     * brackets) if you don't want the connection string updated. Set to `&lt;redacted&gt;` if you want to remove the
     * connection string value from the datasource.
     * 
     * @return the connectionString value.
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string for the datasource. Set to `&lt;unchanged&gt;` (with
     * brackets) if you don't want the connection string updated. Set to `&lt;redacted&gt;` if you want to remove the
     * connection string value from the datasource.
     * 
     * @param connectionString the connectionString value to set.
     * @return the DataSourceCredentials object itself.
     */
    public DataSourceCredentials setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("connectionString", this.connectionString);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataSourceCredentials from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataSourceCredentials if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataSourceCredentials.
     */
    public static DataSourceCredentials fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataSourceCredentials deserializedDataSourceCredentials = new DataSourceCredentials();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectionString".equals(fieldName)) {
                    deserializedDataSourceCredentials.connectionString = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataSourceCredentials;
        });
    }
}
