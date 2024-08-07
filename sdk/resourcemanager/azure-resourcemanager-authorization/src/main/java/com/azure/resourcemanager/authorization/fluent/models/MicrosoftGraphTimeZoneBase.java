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
 * timeZoneBase.
 */
@Fluent
public final class MicrosoftGraphTimeZoneBase implements JsonSerializable<MicrosoftGraphTimeZoneBase> {
    /*
     * The name of a time zone. It can be a standard time zone name such as 'Hawaii-Aleutian Standard Time', or
     * 'Customized Time Zone' for a custom time zone.
     */
    private String name;

    /*
     * timeZoneBase
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphTimeZoneBase class.
     */
    public MicrosoftGraphTimeZoneBase() {
    }

    /**
     * Get the name property: The name of a time zone. It can be a standard time zone name such as 'Hawaii-Aleutian
     * Standard Time', or 'Customized Time Zone' for a custom time zone.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of a time zone. It can be a standard time zone name such as 'Hawaii-Aleutian
     * Standard Time', or 'Customized Time Zone' for a custom time zone.
     * 
     * @param name the name value to set.
     * @return the MicrosoftGraphTimeZoneBase object itself.
     */
    public MicrosoftGraphTimeZoneBase withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the additionalProperties property: timeZoneBase.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: timeZoneBase.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTimeZoneBase object itself.
     */
    public MicrosoftGraphTimeZoneBase withAdditionalProperties(Map<String, Object> additionalProperties) {
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
        jsonWriter.writeStringField("name", this.name);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphTimeZoneBase from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphTimeZoneBase if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphTimeZoneBase.
     */
    public static MicrosoftGraphTimeZoneBase fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphTimeZoneBase deserializedMicrosoftGraphTimeZoneBase = new MicrosoftGraphTimeZoneBase();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedMicrosoftGraphTimeZoneBase.name = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphTimeZoneBase.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphTimeZoneBase;
        });
    }
}
