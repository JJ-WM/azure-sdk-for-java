// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem model.
 */
@Fluent
public final class AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem
    implements JsonSerializable<AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem> {
    /*
     * Whether this version is the default agent pool version.
     */
    private Boolean defaultProperty;

    /*
     * The Kubernetes version (major.minor.patch).
     */
    private String kubernetesVersion;

    /*
     * Whether Kubernetes version is currently in preview.
     */
    private Boolean isPreview;

    /**
     * Creates an instance of AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem class.
     */
    public AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem() {
    }

    /**
     * Get the defaultProperty property: Whether this version is the default agent pool version.
     * 
     * @return the defaultProperty value.
     */
    public Boolean defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: Whether this version is the default agent pool version.
     * 
     * @param defaultProperty the defaultProperty value to set.
     * @return the AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem object itself.
     */
    public AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem withDefaultProperty(Boolean defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get the kubernetesVersion property: The Kubernetes version (major.minor.patch).
     * 
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Set the kubernetesVersion property: The Kubernetes version (major.minor.patch).
     * 
     * @param kubernetesVersion the kubernetesVersion value to set.
     * @return the AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem object itself.
     */
    public AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem withKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }

    /**
     * Get the isPreview property: Whether Kubernetes version is currently in preview.
     * 
     * @return the isPreview value.
     */
    public Boolean isPreview() {
        return this.isPreview;
    }

    /**
     * Set the isPreview property: Whether Kubernetes version is currently in preview.
     * 
     * @param isPreview the isPreview value to set.
     * @return the AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem object itself.
     */
    public AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem withIsPreview(Boolean isPreview) {
        this.isPreview = isPreview;
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
        jsonWriter.writeBooleanField("default", this.defaultProperty);
        jsonWriter.writeStringField("kubernetesVersion", this.kubernetesVersion);
        jsonWriter.writeBooleanField("isPreview", this.isPreview);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem if the JsonReader was pointing
     * to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the
     * AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem.
     */
    public static AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem deserializedAgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem
                = new AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("default".equals(fieldName)) {
                    deserializedAgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem.defaultProperty
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("kubernetesVersion".equals(fieldName)) {
                    deserializedAgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem.kubernetesVersion
                        = reader.getString();
                } else if ("isPreview".equals(fieldName)) {
                    deserializedAgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem.isPreview
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem;
        });
    }
}
