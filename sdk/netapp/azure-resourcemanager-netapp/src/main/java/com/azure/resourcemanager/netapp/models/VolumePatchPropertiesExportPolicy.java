// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * exportPolicy
 * 
 * Set of export policy rules.
 */
@Fluent
public final class VolumePatchPropertiesExportPolicy implements JsonSerializable<VolumePatchPropertiesExportPolicy> {
    /*
     * Export policy rule
     */
    private List<ExportPolicyRule> rules;

    /**
     * Creates an instance of VolumePatchPropertiesExportPolicy class.
     */
    public VolumePatchPropertiesExportPolicy() {
    }

    /**
     * Get the rules property: Export policy rule.
     * 
     * @return the rules value.
     */
    public List<ExportPolicyRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: Export policy rule.
     * 
     * @param rules the rules value to set.
     * @return the VolumePatchPropertiesExportPolicy object itself.
     */
    public VolumePatchPropertiesExportPolicy withRules(List<ExportPolicyRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("rules", this.rules, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VolumePatchPropertiesExportPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VolumePatchPropertiesExportPolicy if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VolumePatchPropertiesExportPolicy.
     */
    public static VolumePatchPropertiesExportPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VolumePatchPropertiesExportPolicy deserializedVolumePatchPropertiesExportPolicy
                = new VolumePatchPropertiesExportPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("rules".equals(fieldName)) {
                    List<ExportPolicyRule> rules = reader.readArray(reader1 -> ExportPolicyRule.fromJson(reader1));
                    deserializedVolumePatchPropertiesExportPolicy.rules = rules;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVolumePatchPropertiesExportPolicy;
        });
    }
}
