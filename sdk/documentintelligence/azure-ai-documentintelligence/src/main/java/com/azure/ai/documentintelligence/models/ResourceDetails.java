// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * General information regarding the current resource.
 */
@Immutable
public final class ResourceDetails implements JsonSerializable<ResourceDetails> {
    /*
     * Details regarding custom document models.
     */
    @Generated
    private final CustomDocumentModelsDetails customDocumentModels;

    /*
     * Quota used, limit, and next reset date/time.
     */
    @Generated
    private final QuotaDetails customNeuralDocumentModelBuilds;

    /**
     * Creates an instance of ResourceDetails class.
     * 
     * @param customDocumentModels the customDocumentModels value to set.
     * @param customNeuralDocumentModelBuilds the customNeuralDocumentModelBuilds value to set.
     */
    @Generated
    private ResourceDetails(CustomDocumentModelsDetails customDocumentModels,
        QuotaDetails customNeuralDocumentModelBuilds) {
        this.customDocumentModels = customDocumentModels;
        this.customNeuralDocumentModelBuilds = customNeuralDocumentModelBuilds;
    }

    /**
     * Get the customDocumentModels property: Details regarding custom document models.
     * 
     * @return the customDocumentModels value.
     */
    @Generated
    public CustomDocumentModelsDetails getCustomDocumentModels() {
        return this.customDocumentModels;
    }

    /**
     * Get the customNeuralDocumentModelBuilds property: Quota used, limit, and next reset date/time.
     * 
     * @return the customNeuralDocumentModelBuilds value.
     */
    @Generated
    public QuotaDetails getCustomNeuralDocumentModelBuilds() {
        return this.customNeuralDocumentModelBuilds;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("customDocumentModels", this.customDocumentModels);
        jsonWriter.writeJsonField("customNeuralDocumentModelBuilds", this.customNeuralDocumentModelBuilds);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceDetails if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ResourceDetails.
     */
    @Generated
    public static ResourceDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomDocumentModelsDetails customDocumentModels = null;
            QuotaDetails customNeuralDocumentModelBuilds = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("customDocumentModels".equals(fieldName)) {
                    customDocumentModels = CustomDocumentModelsDetails.fromJson(reader);
                } else if ("customNeuralDocumentModelBuilds".equals(fieldName)) {
                    customNeuralDocumentModelBuilds = QuotaDetails.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new ResourceDetails(customDocumentModels, customNeuralDocumentModelBuilds);
        });
    }
}
