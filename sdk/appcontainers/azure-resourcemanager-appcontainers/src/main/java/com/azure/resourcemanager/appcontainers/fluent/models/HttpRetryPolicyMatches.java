// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appcontainers.models.HeaderMatch;
import java.io.IOException;
import java.util.List;

/**
 * Conditions that must be met for a request to be retried.
 */
@Fluent
public final class HttpRetryPolicyMatches implements JsonSerializable<HttpRetryPolicyMatches> {
    /*
     * Headers that must be present for a request to be retried
     */
    private List<HeaderMatch> headers;

    /*
     * Additional http status codes that can trigger a retry
     */
    private List<Integer> httpStatusCodes;

    /*
     * Errors that can trigger a retry
     */
    private List<String> errors;

    /**
     * Creates an instance of HttpRetryPolicyMatches class.
     */
    public HttpRetryPolicyMatches() {
    }

    /**
     * Get the headers property: Headers that must be present for a request to be retried.
     * 
     * @return the headers value.
     */
    public List<HeaderMatch> headers() {
        return this.headers;
    }

    /**
     * Set the headers property: Headers that must be present for a request to be retried.
     * 
     * @param headers the headers value to set.
     * @return the HttpRetryPolicyMatches object itself.
     */
    public HttpRetryPolicyMatches withHeaders(List<HeaderMatch> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the httpStatusCodes property: Additional http status codes that can trigger a retry.
     * 
     * @return the httpStatusCodes value.
     */
    public List<Integer> httpStatusCodes() {
        return this.httpStatusCodes;
    }

    /**
     * Set the httpStatusCodes property: Additional http status codes that can trigger a retry.
     * 
     * @param httpStatusCodes the httpStatusCodes value to set.
     * @return the HttpRetryPolicyMatches object itself.
     */
    public HttpRetryPolicyMatches withHttpStatusCodes(List<Integer> httpStatusCodes) {
        this.httpStatusCodes = httpStatusCodes;
        return this;
    }

    /**
     * Get the errors property: Errors that can trigger a retry.
     * 
     * @return the errors value.
     */
    public List<String> errors() {
        return this.errors;
    }

    /**
     * Set the errors property: Errors that can trigger a retry.
     * 
     * @param errors the errors value to set.
     * @return the HttpRetryPolicyMatches object itself.
     */
    public HttpRetryPolicyMatches withErrors(List<String> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (headers() != null) {
            headers().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("headers", this.headers, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("httpStatusCodes", this.httpStatusCodes,
            (writer, element) -> writer.writeInt(element));
        jsonWriter.writeArrayField("errors", this.errors, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HttpRetryPolicyMatches from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HttpRetryPolicyMatches if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HttpRetryPolicyMatches.
     */
    public static HttpRetryPolicyMatches fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HttpRetryPolicyMatches deserializedHttpRetryPolicyMatches = new HttpRetryPolicyMatches();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("headers".equals(fieldName)) {
                    List<HeaderMatch> headers = reader.readArray(reader1 -> HeaderMatch.fromJson(reader1));
                    deserializedHttpRetryPolicyMatches.headers = headers;
                } else if ("httpStatusCodes".equals(fieldName)) {
                    List<Integer> httpStatusCodes = reader.readArray(reader1 -> reader1.getInt());
                    deserializedHttpRetryPolicyMatches.httpStatusCodes = httpStatusCodes;
                } else if ("errors".equals(fieldName)) {
                    List<String> errors = reader.readArray(reader1 -> reader1.getString());
                    deserializedHttpRetryPolicyMatches.errors = errors;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHttpRetryPolicyMatches;
        });
    }
}
