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
 * The information of an AvailablePrivateEndpointType.
 */
@Fluent
public final class AvailablePrivateEndpointTypeInner implements JsonSerializable<AvailablePrivateEndpointTypeInner> {
    /*
     * The name of the service and resource.
     */
    private String name;

    /*
     * A unique identifier of the AvailablePrivateEndpoint Type resource.
     */
    private String id;

    /*
     * Resource type.
     */
    private String type;

    /*
     * The name of the service and resource.
     */
    private String resourceName;

    /*
     * Display name of the resource.
     */
    private String displayName;

    /**
     * Creates an instance of AvailablePrivateEndpointTypeInner class.
     */
    public AvailablePrivateEndpointTypeInner() {
    }

    /**
     * Get the name property: The name of the service and resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the service and resource.
     * 
     * @param name the name value to set.
     * @return the AvailablePrivateEndpointTypeInner object itself.
     */
    public AvailablePrivateEndpointTypeInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: A unique identifier of the AvailablePrivateEndpoint Type resource.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: A unique identifier of the AvailablePrivateEndpoint Type resource.
     * 
     * @param id the id value to set.
     * @return the AvailablePrivateEndpointTypeInner object itself.
     */
    public AvailablePrivateEndpointTypeInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: Resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Resource type.
     * 
     * @param type the type value to set.
     * @return the AvailablePrivateEndpointTypeInner object itself.
     */
    public AvailablePrivateEndpointTypeInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the resourceName property: The name of the service and resource.
     * 
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: The name of the service and resource.
     * 
     * @param resourceName the resourceName value to set.
     * @return the AvailablePrivateEndpointTypeInner object itself.
     */
    public AvailablePrivateEndpointTypeInner withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Get the displayName property: Display name of the resource.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of the resource.
     * 
     * @param displayName the displayName value to set.
     * @return the AvailablePrivateEndpointTypeInner object itself.
     */
    public AvailablePrivateEndpointTypeInner withDisplayName(String displayName) {
        this.displayName = displayName;
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
        jsonWriter.writeStringField("displayName", this.displayName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvailablePrivateEndpointTypeInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailablePrivateEndpointTypeInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvailablePrivateEndpointTypeInner.
     */
    public static AvailablePrivateEndpointTypeInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailablePrivateEndpointTypeInner deserializedAvailablePrivateEndpointTypeInner
                = new AvailablePrivateEndpointTypeInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedAvailablePrivateEndpointTypeInner.name = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedAvailablePrivateEndpointTypeInner.id = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAvailablePrivateEndpointTypeInner.type = reader.getString();
                } else if ("resourceName".equals(fieldName)) {
                    deserializedAvailablePrivateEndpointTypeInner.resourceName = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedAvailablePrivateEndpointTypeInner.displayName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailablePrivateEndpointTypeInner;
        });
    }
}
