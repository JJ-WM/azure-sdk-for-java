// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.search.documents.indexes.implementation.models.VectorSearchAlgorithmKind;
import java.io.IOException;

/**
 * Contains configuration options specific to the HNSW approximate nearest neighbors algorithm used during indexing and
 * querying. The HNSW algorithm offers a tunable trade-off between search speed and accuracy.
 */
@Fluent
public final class HnswAlgorithmConfiguration extends VectorSearchAlgorithmConfiguration {
    /*
     * Contains the parameters specific to HNSW algorithm.
     */
    private HnswParameters parameters;

    /**
     * Creates an instance of HnswAlgorithmConfiguration class.
     * 
     * @param name the name value to set.
     */
    public HnswAlgorithmConfiguration(String name) {
        super(name);
    }

    /**
     * Get the parameters property: Contains the parameters specific to HNSW algorithm.
     * 
     * @return the parameters value.
     */
    public HnswParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Contains the parameters specific to HNSW algorithm.
     * 
     * @param parameters the parameters value to set.
     * @return the HnswAlgorithmConfiguration object itself.
     */
    public HnswAlgorithmConfiguration setParameters(HnswParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind",
            VectorSearchAlgorithmKind.HNSW == null ? null : VectorSearchAlgorithmKind.HNSW.toString());
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeJsonField("hnswParameters", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HnswAlgorithmConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HnswAlgorithmConfiguration if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the HnswAlgorithmConfiguration.
     */
    public static HnswAlgorithmConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            HnswParameters parameters = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kind".equals(fieldName)) {
                    String kind = reader.getString();
                    if (!"hnsw".equals(kind)) {
                        throw new IllegalStateException(
                            "'kind' was expected to be non-null and equal to 'hnsw'. The found 'kind' was '" + kind
                                + "'.");
                    }
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("hnswParameters".equals(fieldName)) {
                    parameters = HnswParameters.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound) {
                HnswAlgorithmConfiguration deserializedHnswAlgorithmConfiguration
                    = new HnswAlgorithmConfiguration(name);
                deserializedHnswAlgorithmConfiguration.parameters = parameters;

                return deserializedHnswAlgorithmConfiguration;
            }
            throw new IllegalStateException("Missing required property: name");
        });
    }
}
