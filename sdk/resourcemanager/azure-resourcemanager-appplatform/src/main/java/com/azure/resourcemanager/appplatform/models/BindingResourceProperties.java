// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Binding resource properties payload.
 */
@Fluent
public final class BindingResourceProperties implements JsonSerializable<BindingResourceProperties> {
    /*
     * The name of the bound resource
     */
    private String resourceName;

    /*
     * The standard Azure resource type of the bound resource
     */
    private String resourceType;

    /*
     * The Azure resource id of the bound resource
     */
    private String resourceId;

    /*
     * The key of the bound resource
     */
    private String key;

    /*
     * Binding parameters of the Binding resource
     */
    private Map<String, Object> bindingParameters;

    /*
     * The generated Spring Boot property file for this binding. The secret will be deducted.
     */
    private String generatedProperties;

    /*
     * Creation time of the Binding resource
     */
    private String createdAt;

    /*
     * Update time of the Binding resource
     */
    private String updatedAt;

    /**
     * Creates an instance of BindingResourceProperties class.
     */
    public BindingResourceProperties() {
    }

    /**
     * Get the resourceName property: The name of the bound resource.
     * 
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Get the resourceType property: The standard Azure resource type of the bound resource.
     * 
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the resourceId property: The Azure resource id of the bound resource.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The Azure resource id of the bound resource.
     * 
     * @param resourceId the resourceId value to set.
     * @return the BindingResourceProperties object itself.
     */
    public BindingResourceProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the key property: The key of the bound resource.
     * 
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: The key of the bound resource.
     * 
     * @param key the key value to set.
     * @return the BindingResourceProperties object itself.
     */
    public BindingResourceProperties withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the bindingParameters property: Binding parameters of the Binding resource.
     * 
     * @return the bindingParameters value.
     */
    public Map<String, Object> bindingParameters() {
        return this.bindingParameters;
    }

    /**
     * Set the bindingParameters property: Binding parameters of the Binding resource.
     * 
     * @param bindingParameters the bindingParameters value to set.
     * @return the BindingResourceProperties object itself.
     */
    public BindingResourceProperties withBindingParameters(Map<String, Object> bindingParameters) {
        this.bindingParameters = bindingParameters;
        return this;
    }

    /**
     * Get the generatedProperties property: The generated Spring Boot property file for this binding. The secret will
     * be deducted.
     * 
     * @return the generatedProperties value.
     */
    public String generatedProperties() {
        return this.generatedProperties;
    }

    /**
     * Get the createdAt property: Creation time of the Binding resource.
     * 
     * @return the createdAt value.
     */
    public String createdAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: Update time of the Binding resource.
     * 
     * @return the updatedAt value.
     */
    public String updatedAt() {
        return this.updatedAt;
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
        jsonWriter.writeStringField("resourceId", this.resourceId);
        jsonWriter.writeStringField("key", this.key);
        jsonWriter.writeMapField("bindingParameters", this.bindingParameters,
            (writer, element) -> writer.writeUntyped(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BindingResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BindingResourceProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BindingResourceProperties.
     */
    public static BindingResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BindingResourceProperties deserializedBindingResourceProperties = new BindingResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceName".equals(fieldName)) {
                    deserializedBindingResourceProperties.resourceName = reader.getString();
                } else if ("resourceType".equals(fieldName)) {
                    deserializedBindingResourceProperties.resourceType = reader.getString();
                } else if ("resourceId".equals(fieldName)) {
                    deserializedBindingResourceProperties.resourceId = reader.getString();
                } else if ("key".equals(fieldName)) {
                    deserializedBindingResourceProperties.key = reader.getString();
                } else if ("bindingParameters".equals(fieldName)) {
                    Map<String, Object> bindingParameters = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedBindingResourceProperties.bindingParameters = bindingParameters;
                } else if ("generatedProperties".equals(fieldName)) {
                    deserializedBindingResourceProperties.generatedProperties = reader.getString();
                } else if ("createdAt".equals(fieldName)) {
                    deserializedBindingResourceProperties.createdAt = reader.getString();
                } else if ("updatedAt".equals(fieldName)) {
                    deserializedBindingResourceProperties.updatedAt = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBindingResourceProperties;
        });
    }
}
