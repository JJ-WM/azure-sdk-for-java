// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The available service alias.
 */
@Fluent
public final class AvailableServiceAliasInner implements JsonSerializable<AvailableServiceAliasInner> {
    /*
     * The name of the service alias.
     */
    private String name;

    /*
     * The ID of the service alias.
     */
    private String id;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The resource name of the service alias.
     */
    private String resourceName;

    /**
     * Creates an instance of AvailableServiceAliasInner class.
     */
    public AvailableServiceAliasInner() {
    }

    /**
     * Get the name property: The name of the service alias.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the service alias.
     * 
     * @param name the name value to set.
     * @return the AvailableServiceAliasInner object itself.
     */
    public AvailableServiceAliasInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: The ID of the service alias.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the service alias.
     * 
     * @param id the id value to set.
     * @return the AvailableServiceAliasInner object itself.
     */
    public AvailableServiceAliasInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the resource.
     * 
     * @param type the type value to set.
     * @return the AvailableServiceAliasInner object itself.
     */
    public AvailableServiceAliasInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the resourceName property: The resource name of the service alias.
     * 
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: The resource name of the service alias.
     * 
     * @param resourceName the resourceName value to set.
     * @return the AvailableServiceAliasInner object itself.
     */
    public AvailableServiceAliasInner withResourceName(String resourceName) {
        this.resourceName = resourceName;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("resourceName", this.resourceName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvailableServiceAliasInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailableServiceAliasInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvailableServiceAliasInner.
     */
    public static AvailableServiceAliasInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailableServiceAliasInner deserializedAvailableServiceAliasInner = new AvailableServiceAliasInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedAvailableServiceAliasInner.name = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedAvailableServiceAliasInner.id = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAvailableServiceAliasInner.type = reader.getString();
                } else if ("resourceName".equals(fieldName)) {
                    deserializedAvailableServiceAliasInner.resourceName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailableServiceAliasInner;
        });
    }
}
