// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * API error base.
 */
@Immutable
public final class ApiErrorBase implements JsonSerializable<ApiErrorBase> {
    /*
     * The error code.
     */
    private String code;

    /*
     * The target of the particular error.
     */
    private String target;

    /*
     * The error message.
     */
    private String message;

    /**
     * Creates an instance of ApiErrorBase class.
     */
    private ApiErrorBase() {
    }

    /**
     * Get the code property: The error code.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the target property: The target of the particular error.
     * 
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Get the message property: The error message.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
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
        jsonWriter.writeStringField("code", this.code);
        jsonWriter.writeStringField("target", this.target);
        jsonWriter.writeStringField("message", this.message);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApiErrorBase from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApiErrorBase if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApiErrorBase.
     */
    public static ApiErrorBase fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApiErrorBase deserializedApiErrorBase = new ApiErrorBase();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedApiErrorBase.code = reader.getString();
                } else if ("target".equals(fieldName)) {
                    deserializedApiErrorBase.target = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedApiErrorBase.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApiErrorBase;
        });
    }
}
