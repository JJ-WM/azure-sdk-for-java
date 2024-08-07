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
import java.util.List;

/**
 * ApiError for Fleet.
 */
@Immutable
public final class ApiError implements JsonSerializable<ApiError> {
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

    /*
     * The API error details
     */
    private List<ApiErrorBase> details;

    /*
     * The API inner error
     */
    private InnerError innererror;

    /**
     * Creates an instance of ApiError class.
     */
    private ApiError() {
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
     * Get the details property: The API error details.
     * 
     * @return the details value.
     */
    public List<ApiErrorBase> details() {
        return this.details;
    }

    /**
     * Get the innererror property: The API inner error.
     * 
     * @return the innererror value.
     */
    public InnerError innererror() {
        return this.innererror;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (details() != null) {
            details().forEach(e -> e.validate());
        }
        if (innererror() != null) {
            innererror().validate();
        }
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
        jsonWriter.writeArrayField("details", this.details, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("innererror", this.innererror);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApiError from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApiError if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the ApiError.
     */
    public static ApiError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApiError deserializedApiError = new ApiError();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedApiError.code = reader.getString();
                } else if ("target".equals(fieldName)) {
                    deserializedApiError.target = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedApiError.message = reader.getString();
                } else if ("details".equals(fieldName)) {
                    List<ApiErrorBase> details = reader.readArray(reader1 -> ApiErrorBase.fromJson(reader1));
                    deserializedApiError.details = details;
                } else if ("innererror".equals(fieldName)) {
                    deserializedApiError.innererror = InnerError.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApiError;
        });
    }
}
