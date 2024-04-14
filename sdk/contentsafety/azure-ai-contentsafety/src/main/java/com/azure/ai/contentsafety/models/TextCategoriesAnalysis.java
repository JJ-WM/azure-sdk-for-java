// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.contentsafety.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Text analysis result.
 */
@Immutable
public final class TextCategoriesAnalysis implements JsonSerializable<TextCategoriesAnalysis> {

    /*
     * The text analysis category.
     */
    @Generated
    private final TextCategory category;

    /*
     * The value increases with the severity of the input content. The value of this field is determined by the output type specified in the request. The output type could be ‘FourSeverityLevels’ or ‘EightSeverity Levels’, and the output value can be 0, 2, 4, 6 or 0, 1, 2, 3, 4, 5, 6, or 7.
     */
    @Generated
    private Integer severity;

    /**
     * Creates an instance of TextCategoriesAnalysis class.
     *
     * @param category the category value to set.
     */
    @Generated
    private TextCategoriesAnalysis(TextCategory category) {
        this.category = category;
    }

    /**
     * Get the category property: The text analysis category.
     *
     * @return the category value.
     */
    @Generated
    public TextCategory getCategory() {
        return this.category;
    }

    /**
     * Get the severity property: The value increases with the severity of the input content. The value of this field is
     * determined by the output type specified in the request. The output type could be ‘FourSeverityLevels’ or
     * ‘EightSeverity Levels’, and the output value can be 0, 2, 4, 6 or 0, 1, 2, 3, 4, 5, 6, or 7.
     *
     * @return the severity value.
     */
    @Generated
    public Integer getSeverity() {
        return this.severity;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("category", this.category == null ? null : this.category.toString());
        jsonWriter.writeNumberField("severity", this.severity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TextCategoriesAnalysis from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of TextCategoriesAnalysis if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TextCategoriesAnalysis.
     */
    @Generated
    public static TextCategoriesAnalysis fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TextCategory category = null;
            Integer severity = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("category".equals(fieldName)) {
                    category = TextCategory.fromString(reader.getString());
                } else if ("severity".equals(fieldName)) {
                    severity = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }
            TextCategoriesAnalysis deserializedTextCategoriesAnalysis = new TextCategoriesAnalysis(category);
            deserializedTextCategoriesAnalysis.severity = severity;
            return deserializedTextCategoriesAnalysis;
        });
    }
}
