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
import java.util.List;
import java.util.Map;

/**
 * parentalControlSettings.
 */
@Fluent
public final class MicrosoftGraphParentalControlSettings
    implements JsonSerializable<MicrosoftGraphParentalControlSettings> {
    /*
     * Specifies the two-letter ISO country codes. Access to the application will be blocked for minors from the
     * countries specified in this list.
     */
    private List<String> countriesBlockedForMinors;

    /*
     * Specifies the legal age group rule that applies to users of the app. Can be set to one of the following values:
     * ValueDescriptionAllowDefault. Enforces the legal minimum. This means parental consent is required for minors in
     * the European Union and Korea.RequireConsentForPrivacyServicesEnforces the user to specify date of birth to comply
     * with COPPA rules. RequireConsentForMinorsRequires parental consent for ages below 18, regardless of country minor
     * rules.RequireConsentForKidsRequires parental consent for ages below 14, regardless of country minor
     * rules.BlockMinorsBlocks minors from using the app.
     */
    private String legalAgeGroupRule;

    /*
     * parentalControlSettings
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphParentalControlSettings class.
     */
    public MicrosoftGraphParentalControlSettings() {
    }

    /**
     * Get the countriesBlockedForMinors property: Specifies the two-letter ISO country codes. Access to the application
     * will be blocked for minors from the countries specified in this list.
     * 
     * @return the countriesBlockedForMinors value.
     */
    public List<String> countriesBlockedForMinors() {
        return this.countriesBlockedForMinors;
    }

    /**
     * Set the countriesBlockedForMinors property: Specifies the two-letter ISO country codes. Access to the application
     * will be blocked for minors from the countries specified in this list.
     * 
     * @param countriesBlockedForMinors the countriesBlockedForMinors value to set.
     * @return the MicrosoftGraphParentalControlSettings object itself.
     */
    public MicrosoftGraphParentalControlSettings withCountriesBlockedForMinors(List<String> countriesBlockedForMinors) {
        this.countriesBlockedForMinors = countriesBlockedForMinors;
        return this;
    }

    /**
     * Get the legalAgeGroupRule property: Specifies the legal age group rule that applies to users of the app. Can be
     * set to one of the following values: ValueDescriptionAllowDefault. Enforces the legal minimum. This means parental
     * consent is required for minors in the European Union and Korea.RequireConsentForPrivacyServicesEnforces the user
     * to specify date of birth to comply with COPPA rules. RequireConsentForMinorsRequires parental consent for ages
     * below 18, regardless of country minor rules.RequireConsentForKidsRequires parental consent for ages below 14,
     * regardless of country minor rules.BlockMinorsBlocks minors from using the app.
     * 
     * @return the legalAgeGroupRule value.
     */
    public String legalAgeGroupRule() {
        return this.legalAgeGroupRule;
    }

    /**
     * Set the legalAgeGroupRule property: Specifies the legal age group rule that applies to users of the app. Can be
     * set to one of the following values: ValueDescriptionAllowDefault. Enforces the legal minimum. This means parental
     * consent is required for minors in the European Union and Korea.RequireConsentForPrivacyServicesEnforces the user
     * to specify date of birth to comply with COPPA rules. RequireConsentForMinorsRequires parental consent for ages
     * below 18, regardless of country minor rules.RequireConsentForKidsRequires parental consent for ages below 14,
     * regardless of country minor rules.BlockMinorsBlocks minors from using the app.
     * 
     * @param legalAgeGroupRule the legalAgeGroupRule value to set.
     * @return the MicrosoftGraphParentalControlSettings object itself.
     */
    public MicrosoftGraphParentalControlSettings withLegalAgeGroupRule(String legalAgeGroupRule) {
        this.legalAgeGroupRule = legalAgeGroupRule;
        return this;
    }

    /**
     * Get the additionalProperties property: parentalControlSettings.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: parentalControlSettings.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphParentalControlSettings object itself.
     */
    public MicrosoftGraphParentalControlSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
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
        jsonWriter.writeArrayField("countriesBlockedForMinors", this.countriesBlockedForMinors,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("legalAgeGroupRule", this.legalAgeGroupRule);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphParentalControlSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphParentalControlSettings if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphParentalControlSettings.
     */
    public static MicrosoftGraphParentalControlSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphParentalControlSettings deserializedMicrosoftGraphParentalControlSettings
                = new MicrosoftGraphParentalControlSettings();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("countriesBlockedForMinors".equals(fieldName)) {
                    List<String> countriesBlockedForMinors = reader.readArray(reader1 -> reader1.getString());
                    deserializedMicrosoftGraphParentalControlSettings.countriesBlockedForMinors
                        = countriesBlockedForMinors;
                } else if ("legalAgeGroupRule".equals(fieldName)) {
                    deserializedMicrosoftGraphParentalControlSettings.legalAgeGroupRule = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphParentalControlSettings.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphParentalControlSettings;
        });
    }
}
