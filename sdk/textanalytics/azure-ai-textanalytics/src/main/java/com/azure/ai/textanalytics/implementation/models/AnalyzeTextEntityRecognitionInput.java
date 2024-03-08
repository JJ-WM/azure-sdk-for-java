// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;

/** The AnalyzeTextEntityRecognitionInput model. */
@Fluent
public final class AnalyzeTextEntityRecognitionInput extends AnalyzeTextTask {
    /*
     * The analysisInput property.
     */
    private MultiLanguageAnalysisInput analysisInput;

    /*
     * Supported parameters for an Entity Recognition task.
     */
    private EntitiesTaskParameters parameters;

    /** Creates an instance of AnalyzeTextEntityRecognitionInput class. */
    public AnalyzeTextEntityRecognitionInput() {}

    /**
     * Get the analysisInput property: The analysisInput property.
     *
     * @return the analysisInput value.
     */
    public MultiLanguageAnalysisInput getAnalysisInput() {
        return this.analysisInput;
    }

    /**
     * Set the analysisInput property: The analysisInput property.
     *
     * @param analysisInput the analysisInput value to set.
     * @return the AnalyzeTextEntityRecognitionInput object itself.
     */
    public AnalyzeTextEntityRecognitionInput setAnalysisInput(MultiLanguageAnalysisInput analysisInput) {
        this.analysisInput = analysisInput;
        return this;
    }

    /**
     * Get the parameters property: Supported parameters for an Entity Recognition task.
     *
     * @return the parameters value.
     */
    public EntitiesTaskParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Supported parameters for an Entity Recognition task.
     *
     * @param parameters the parameters value to set.
     * @return the AnalyzeTextEntityRecognitionInput object itself.
     */
    public AnalyzeTextEntityRecognitionInput setParameters(EntitiesTaskParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", Objects.toString(AnalyzeTextTaskKind.ENTITY_RECOGNITION, null));
        jsonWriter.writeJsonField("analysisInput", this.analysisInput);
        jsonWriter.writeJsonField("parameters", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AnalyzeTextEntityRecognitionInput from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnalyzeTextEntityRecognitionInput if the JsonReader was pointing to an instance of it, or
     *     null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     * @throws IOException If an error occurs while reading the AnalyzeTextEntityRecognitionInput.
     */
    public static AnalyzeTextEntityRecognitionInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    AnalyzeTextEntityRecognitionInput deserializedAnalyzeTextEntityRecognitionInput =
                            new AnalyzeTextEntityRecognitionInput();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("kind".equals(fieldName)) {
                            String kind = reader.getString();
                            if (!"EntityRecognition".equals(kind)) {
                                throw new IllegalStateException(
                                        "'kind' was expected to be non-null and equal to 'EntityRecognition'. The found 'kind' was '"
                                                + kind
                                                + "'.");
                            }
                        } else if ("analysisInput".equals(fieldName)) {
                            deserializedAnalyzeTextEntityRecognitionInput.analysisInput =
                                    MultiLanguageAnalysisInput.fromJson(reader);
                        } else if ("parameters".equals(fieldName)) {
                            deserializedAnalyzeTextEntityRecognitionInput.parameters =
                                    EntitiesTaskParameters.fromJson(reader);
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedAnalyzeTextEntityRecognitionInput;
                });
    }
}
