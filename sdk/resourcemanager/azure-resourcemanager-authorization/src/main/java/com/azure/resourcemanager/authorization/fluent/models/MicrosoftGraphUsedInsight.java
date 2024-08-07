// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * usedInsight.
 */
@Fluent
public final class MicrosoftGraphUsedInsight extends MicrosoftGraphEntity {
    /*
     * usageDetails
     */
    private MicrosoftGraphUsageDetails lastUsed;

    /*
     * resourceReference
     */
    private MicrosoftGraphResourceReference resourceReference;

    /*
     * resourceVisualization
     */
    private MicrosoftGraphResourceVisualization resourceVisualization;

    /*
     * entity
     */
    private MicrosoftGraphEntity resource;

    /*
     * usedInsight
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphUsedInsight class.
     */
    public MicrosoftGraphUsedInsight() {
    }

    /**
     * Get the lastUsed property: usageDetails.
     * 
     * @return the lastUsed value.
     */
    public MicrosoftGraphUsageDetails lastUsed() {
        return this.lastUsed;
    }

    /**
     * Set the lastUsed property: usageDetails.
     * 
     * @param lastUsed the lastUsed value to set.
     * @return the MicrosoftGraphUsedInsight object itself.
     */
    public MicrosoftGraphUsedInsight withLastUsed(MicrosoftGraphUsageDetails lastUsed) {
        this.lastUsed = lastUsed;
        return this;
    }

    /**
     * Get the resourceReference property: resourceReference.
     * 
     * @return the resourceReference value.
     */
    public MicrosoftGraphResourceReference resourceReference() {
        return this.resourceReference;
    }

    /**
     * Set the resourceReference property: resourceReference.
     * 
     * @param resourceReference the resourceReference value to set.
     * @return the MicrosoftGraphUsedInsight object itself.
     */
    public MicrosoftGraphUsedInsight withResourceReference(MicrosoftGraphResourceReference resourceReference) {
        this.resourceReference = resourceReference;
        return this;
    }

    /**
     * Get the resourceVisualization property: resourceVisualization.
     * 
     * @return the resourceVisualization value.
     */
    public MicrosoftGraphResourceVisualization resourceVisualization() {
        return this.resourceVisualization;
    }

    /**
     * Set the resourceVisualization property: resourceVisualization.
     * 
     * @param resourceVisualization the resourceVisualization value to set.
     * @return the MicrosoftGraphUsedInsight object itself.
     */
    public MicrosoftGraphUsedInsight
        withResourceVisualization(MicrosoftGraphResourceVisualization resourceVisualization) {
        this.resourceVisualization = resourceVisualization;
        return this;
    }

    /**
     * Get the resource property: entity.
     * 
     * @return the resource value.
     */
    public MicrosoftGraphEntity resource() {
        return this.resource;
    }

    /**
     * Set the resource property: entity.
     * 
     * @param resource the resource value to set.
     * @return the MicrosoftGraphUsedInsight object itself.
     */
    public MicrosoftGraphUsedInsight withResource(MicrosoftGraphEntity resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the additionalProperties property: usedInsight.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: usedInsight.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphUsedInsight object itself.
     */
    public MicrosoftGraphUsedInsight withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphUsedInsight withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (lastUsed() != null) {
            lastUsed().validate();
        }
        if (resourceReference() != null) {
            resourceReference().validate();
        }
        if (resourceVisualization() != null) {
            resourceVisualization().validate();
        }
        if (resource() != null) {
            resource().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("lastUsed", this.lastUsed);
        jsonWriter.writeJsonField("resourceReference", this.resourceReference);
        jsonWriter.writeJsonField("resourceVisualization", this.resourceVisualization);
        jsonWriter.writeJsonField("resource", this.resource);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphUsedInsight from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphUsedInsight if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphUsedInsight.
     */
    public static MicrosoftGraphUsedInsight fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphUsedInsight deserializedMicrosoftGraphUsedInsight = new MicrosoftGraphUsedInsight();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphUsedInsight.withId(reader.getString());
                } else if ("lastUsed".equals(fieldName)) {
                    deserializedMicrosoftGraphUsedInsight.lastUsed = MicrosoftGraphUsageDetails.fromJson(reader);
                } else if ("resourceReference".equals(fieldName)) {
                    deserializedMicrosoftGraphUsedInsight.resourceReference
                        = MicrosoftGraphResourceReference.fromJson(reader);
                } else if ("resourceVisualization".equals(fieldName)) {
                    deserializedMicrosoftGraphUsedInsight.resourceVisualization
                        = MicrosoftGraphResourceVisualization.fromJson(reader);
                } else if ("resource".equals(fieldName)) {
                    deserializedMicrosoftGraphUsedInsight.resource = MicrosoftGraphEntity.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphUsedInsight.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphUsedInsight;
        });
    }
}
