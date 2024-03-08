// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Report for a custom model training field.
 */
@Fluent
public final class FormFieldsReport implements JsonSerializable<FormFieldsReport> {
    /*
     * Training field name.
     */
    private String fieldName;

    /*
     * Estimated extraction accuracy for this field.
     */
    private float accuracy;

    /**
     * Creates an instance of FormFieldsReport class.
     */
    public FormFieldsReport() {
    }

    /**
     * Get the fieldName property: Training field name.
     * 
     * @return the fieldName value.
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * Set the fieldName property: Training field name.
     * 
     * @param fieldName the fieldName value to set.
     * @return the FormFieldsReport object itself.
     */
    public FormFieldsReport setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * Get the accuracy property: Estimated extraction accuracy for this field.
     * 
     * @return the accuracy value.
     */
    public float getAccuracy() {
        return this.accuracy;
    }

    /**
     * Set the accuracy property: Estimated extraction accuracy for this field.
     * 
     * @param accuracy the accuracy value to set.
     * @return the FormFieldsReport object itself.
     */
    public FormFieldsReport setAccuracy(float accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("fieldName", this.fieldName);
        jsonWriter.writeFloatField("accuracy", this.accuracy);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FormFieldsReport from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FormFieldsReport if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FormFieldsReport.
     */
    public static FormFieldsReport fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FormFieldsReport deserializedFormFieldsReport = new FormFieldsReport();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String jsonFieldName = reader.getFieldName();
                reader.nextToken();

                if ("fieldName".equals(jsonFieldName)) {
                    deserializedFormFieldsReport.fieldName = reader.getString();
                } else if ("accuracy".equals(jsonFieldName)) {
                    deserializedFormFieldsReport.accuracy = reader.getFloat();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFormFieldsReport;
        });
    }
}
