// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * publicClientApplication.
 */
@Fluent
public final class MicrosoftGraphPublicClientApplication
    implements JsonSerializable<MicrosoftGraphPublicClientApplication> {
    /*
     * Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization
     * codes and access tokens are sent.
     */
    private List<String> redirectUris;

    /*
     * publicClientApplication
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphPublicClientApplication class.
     */
    public MicrosoftGraphPublicClientApplication() {
    }

    /**
     * Get the redirectUris property: Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs
     * where OAuth 2.0 authorization codes and access tokens are sent.
     * 
     * @return the redirectUris value.
     */
    public List<String> redirectUris() {
        return this.redirectUris;
    }

    /**
     * Set the redirectUris property: Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs
     * where OAuth 2.0 authorization codes and access tokens are sent.
     * 
     * @param redirectUris the redirectUris value to set.
     * @return the MicrosoftGraphPublicClientApplication object itself.
     */
    public MicrosoftGraphPublicClientApplication withRedirectUris(List<String> redirectUris) {
        this.redirectUris = redirectUris;
        return this;
    }

    /**
     * Get the additionalProperties property: publicClientApplication.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: publicClientApplication.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPublicClientApplication object itself.
     */
    public MicrosoftGraphPublicClientApplication withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
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
        jsonWriter.writeArrayField("redirectUris", this.redirectUris, (writer, element) -> writer.writeString(element));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphPublicClientApplication from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphPublicClientApplication if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphPublicClientApplication.
     */
    public static MicrosoftGraphPublicClientApplication fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphPublicClientApplication deserializedMicrosoftGraphPublicClientApplication
                = new MicrosoftGraphPublicClientApplication();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("redirectUris".equals(fieldName)) {
                    List<String> redirectUris = reader.readArray(reader1 -> reader1.getString());
                    deserializedMicrosoftGraphPublicClientApplication.redirectUris = redirectUris;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphPublicClientApplication.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphPublicClientApplication;
        });
    }
}
