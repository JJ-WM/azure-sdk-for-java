// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The custom domain assigned to this storage account. This can be set via Update.
 */
@Fluent
public final class CustomDomain implements JsonSerializable<CustomDomain> {
    /*
     * Gets or sets the custom domain name assigned to the storage account. Name is the CNAME source.
     */
    private String name;

    /*
     * Indicates whether indirect CName validation is enabled. Default value is false. This should only be set on
     * updates.
     */
    private Boolean useSubDomainName;

    /**
     * Creates an instance of CustomDomain class.
     */
    public CustomDomain() {
    }

    /**
     * Get the name property: Gets or sets the custom domain name assigned to the storage account. Name is the CNAME
     * source.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the custom domain name assigned to the storage account. Name is the CNAME
     * source.
     * 
     * @param name the name value to set.
     * @return the CustomDomain object itself.
     */
    public CustomDomain withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the useSubDomainName property: Indicates whether indirect CName validation is enabled. Default value is
     * false. This should only be set on updates.
     * 
     * @return the useSubDomainName value.
     */
    public Boolean useSubDomainName() {
        return this.useSubDomainName;
    }

    /**
     * Set the useSubDomainName property: Indicates whether indirect CName validation is enabled. Default value is
     * false. This should only be set on updates.
     * 
     * @param useSubDomainName the useSubDomainName value to set.
     * @return the CustomDomain object itself.
     */
    public CustomDomain withUseSubDomainName(Boolean useSubDomainName) {
        this.useSubDomainName = useSubDomainName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model CustomDomain"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomDomain.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeBooleanField("useSubDomainName", this.useSubDomainName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomDomain from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomDomain if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CustomDomain.
     */
    public static CustomDomain fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomDomain deserializedCustomDomain = new CustomDomain();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedCustomDomain.name = reader.getString();
                } else if ("useSubDomainName".equals(fieldName)) {
                    deserializedCustomDomain.useSubDomainName = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCustomDomain;
        });
    }
}
