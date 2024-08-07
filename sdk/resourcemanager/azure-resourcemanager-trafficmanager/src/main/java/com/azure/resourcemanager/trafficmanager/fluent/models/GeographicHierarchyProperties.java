// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.trafficmanager.models.Region;
import java.io.IOException;

/**
 * Class representing the properties of the Geographic hierarchy used with the Geographic traffic routing method.
 */
@Fluent
public final class GeographicHierarchyProperties implements JsonSerializable<GeographicHierarchyProperties> {
    /*
     * The region at the root of the hierarchy from all the regions in the hierarchy can be retrieved.
     */
    private Region geographicHierarchy;

    /**
     * Creates an instance of GeographicHierarchyProperties class.
     */
    public GeographicHierarchyProperties() {
    }

    /**
     * Get the geographicHierarchy property: The region at the root of the hierarchy from all the regions in the
     * hierarchy can be retrieved.
     * 
     * @return the geographicHierarchy value.
     */
    public Region geographicHierarchy() {
        return this.geographicHierarchy;
    }

    /**
     * Set the geographicHierarchy property: The region at the root of the hierarchy from all the regions in the
     * hierarchy can be retrieved.
     * 
     * @param geographicHierarchy the geographicHierarchy value to set.
     * @return the GeographicHierarchyProperties object itself.
     */
    public GeographicHierarchyProperties withGeographicHierarchy(Region geographicHierarchy) {
        this.geographicHierarchy = geographicHierarchy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (geographicHierarchy() != null) {
            geographicHierarchy().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("geographicHierarchy", this.geographicHierarchy);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GeographicHierarchyProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GeographicHierarchyProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GeographicHierarchyProperties.
     */
    public static GeographicHierarchyProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GeographicHierarchyProperties deserializedGeographicHierarchyProperties
                = new GeographicHierarchyProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("geographicHierarchy".equals(fieldName)) {
                    deserializedGeographicHierarchyProperties.geographicHierarchy = Region.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGeographicHierarchyProperties;
        });
    }
}
