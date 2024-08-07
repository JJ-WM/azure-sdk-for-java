// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.fluent.models.MongoUserDefinitionGetResultsInner;
import java.io.IOException;
import java.util.List;

/**
 * The relevant User Definition.
 */
@Immutable
public final class MongoUserDefinitionListResult implements JsonSerializable<MongoUserDefinitionListResult> {
    /*
     * List of User Definition and their properties
     */
    private List<MongoUserDefinitionGetResultsInner> value;

    /**
     * Creates an instance of MongoUserDefinitionListResult class.
     */
    public MongoUserDefinitionListResult() {
    }

    /**
     * Get the value property: List of User Definition and their properties.
     * 
     * @return the value value.
     */
    public List<MongoUserDefinitionGetResultsInner> value() {
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
     * Reads an instance of MongoUserDefinitionListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MongoUserDefinitionListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MongoUserDefinitionListResult.
     */
    public static MongoUserDefinitionListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MongoUserDefinitionListResult deserializedMongoUserDefinitionListResult
                = new MongoUserDefinitionListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<MongoUserDefinitionGetResultsInner> value
                        = reader.readArray(reader1 -> MongoUserDefinitionGetResultsInner.fromJson(reader1));
                    deserializedMongoUserDefinitionListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMongoUserDefinitionListResult;
        });
    }
}
