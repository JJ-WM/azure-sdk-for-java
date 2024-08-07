// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * licenseUnitsDetail.
 */
@Fluent
public final class MicrosoftGraphLicenseUnitsDetail implements JsonSerializable<MicrosoftGraphLicenseUnitsDetail> {
    /*
     * The number of units that are enabled.
     */
    private Integer enabled;

    /*
     * The number of units that are suspended.
     */
    private Integer suspended;

    /*
     * The number of units that are in warning status.
     */
    private Integer warning;

    /*
     * licenseUnitsDetail
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphLicenseUnitsDetail class.
     */
    public MicrosoftGraphLicenseUnitsDetail() {
    }

    /**
     * Get the enabled property: The number of units that are enabled.
     * 
     * @return the enabled value.
     */
    public Integer enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: The number of units that are enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the MicrosoftGraphLicenseUnitsDetail object itself.
     */
    public MicrosoftGraphLicenseUnitsDetail withEnabled(Integer enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the suspended property: The number of units that are suspended.
     * 
     * @return the suspended value.
     */
    public Integer suspended() {
        return this.suspended;
    }

    /**
     * Set the suspended property: The number of units that are suspended.
     * 
     * @param suspended the suspended value to set.
     * @return the MicrosoftGraphLicenseUnitsDetail object itself.
     */
    public MicrosoftGraphLicenseUnitsDetail withSuspended(Integer suspended) {
        this.suspended = suspended;
        return this;
    }

    /**
     * Get the warning property: The number of units that are in warning status.
     * 
     * @return the warning value.
     */
    public Integer warning() {
        return this.warning;
    }

    /**
     * Set the warning property: The number of units that are in warning status.
     * 
     * @param warning the warning value to set.
     * @return the MicrosoftGraphLicenseUnitsDetail object itself.
     */
    public MicrosoftGraphLicenseUnitsDetail withWarning(Integer warning) {
        this.warning = warning;
        return this;
    }

    /**
     * Get the additionalProperties property: licenseUnitsDetail.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: licenseUnitsDetail.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphLicenseUnitsDetail object itself.
     */
    public MicrosoftGraphLicenseUnitsDetail withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
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
        jsonWriter.writeNumberField("enabled", this.enabled);
        jsonWriter.writeNumberField("suspended", this.suspended);
        jsonWriter.writeNumberField("warning", this.warning);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphLicenseUnitsDetail from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphLicenseUnitsDetail if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphLicenseUnitsDetail.
     */
    public static MicrosoftGraphLicenseUnitsDetail fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphLicenseUnitsDetail deserializedMicrosoftGraphLicenseUnitsDetail
                = new MicrosoftGraphLicenseUnitsDetail();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedMicrosoftGraphLicenseUnitsDetail.enabled = reader.getNullable(JsonReader::getInt);
                } else if ("suspended".equals(fieldName)) {
                    deserializedMicrosoftGraphLicenseUnitsDetail.suspended = reader.getNullable(JsonReader::getInt);
                } else if ("warning".equals(fieldName)) {
                    deserializedMicrosoftGraphLicenseUnitsDetail.warning = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphLicenseUnitsDetail.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphLicenseUnitsDetail;
        });
    }
}
