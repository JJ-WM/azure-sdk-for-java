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
 * personType.
 */
@Fluent
public final class MicrosoftGraphPersonType implements JsonSerializable<MicrosoftGraphPersonType> {
    /*
     * The type of data source, such as Person.
     */
    private String classProperty;

    /*
     * The secondary type of data source, such as OrganizationUser.
     */
    private String subclass;

    /*
     * personType
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphPersonType class.
     */
    public MicrosoftGraphPersonType() {
    }

    /**
     * Get the classProperty property: The type of data source, such as Person.
     * 
     * @return the classProperty value.
     */
    public String classProperty() {
        return this.classProperty;
    }

    /**
     * Set the classProperty property: The type of data source, such as Person.
     * 
     * @param classProperty the classProperty value to set.
     * @return the MicrosoftGraphPersonType object itself.
     */
    public MicrosoftGraphPersonType withClassProperty(String classProperty) {
        this.classProperty = classProperty;
        return this;
    }

    /**
     * Get the subclass property: The secondary type of data source, such as OrganizationUser.
     * 
     * @return the subclass value.
     */
    public String subclass() {
        return this.subclass;
    }

    /**
     * Set the subclass property: The secondary type of data source, such as OrganizationUser.
     * 
     * @param subclass the subclass value to set.
     * @return the MicrosoftGraphPersonType object itself.
     */
    public MicrosoftGraphPersonType withSubclass(String subclass) {
        this.subclass = subclass;
        return this;
    }

    /**
     * Get the additionalProperties property: personType.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: personType.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPersonType object itself.
     */
    public MicrosoftGraphPersonType withAdditionalProperties(Map<String, Object> additionalProperties) {
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
        jsonWriter.writeStringField("class", this.classProperty);
        jsonWriter.writeStringField("subclass", this.subclass);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphPersonType from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphPersonType if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphPersonType.
     */
    public static MicrosoftGraphPersonType fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphPersonType deserializedMicrosoftGraphPersonType = new MicrosoftGraphPersonType();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("class".equals(fieldName)) {
                    deserializedMicrosoftGraphPersonType.classProperty = reader.getString();
                } else if ("subclass".equals(fieldName)) {
                    deserializedMicrosoftGraphPersonType.subclass = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphPersonType.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphPersonType;
        });
    }
}
