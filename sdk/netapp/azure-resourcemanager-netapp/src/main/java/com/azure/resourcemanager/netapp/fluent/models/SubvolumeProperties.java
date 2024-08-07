// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * This represents path associated with the subvolume.
 */
@Fluent
public final class SubvolumeProperties implements JsonSerializable<SubvolumeProperties> {
    /*
     * Path to the subvolume
     */
    private String path;

    /*
     * Truncate subvolume to the provided size in bytes
     */
    private Long size;

    /*
     * parent path to the subvolume
     */
    private String parentPath;

    /*
     * Azure lifecycle management
     */
    private String provisioningState;

    /**
     * Creates an instance of SubvolumeProperties class.
     */
    public SubvolumeProperties() {
    }

    /**
     * Get the path property: Path to the subvolume.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Path to the subvolume.
     * 
     * @param path the path value to set.
     * @return the SubvolumeProperties object itself.
     */
    public SubvolumeProperties withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the size property: Truncate subvolume to the provided size in bytes.
     * 
     * @return the size value.
     */
    public Long size() {
        return this.size;
    }

    /**
     * Set the size property: Truncate subvolume to the provided size in bytes.
     * 
     * @param size the size value to set.
     * @return the SubvolumeProperties object itself.
     */
    public SubvolumeProperties withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the parentPath property: parent path to the subvolume.
     * 
     * @return the parentPath value.
     */
    public String parentPath() {
        return this.parentPath;
    }

    /**
     * Set the parentPath property: parent path to the subvolume.
     * 
     * @param parentPath the parentPath value to set.
     * @return the SubvolumeProperties object itself.
     */
    public SubvolumeProperties withParentPath(String parentPath) {
        this.parentPath = parentPath;
        return this;
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
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
        jsonWriter.writeStringField("path", this.path);
        jsonWriter.writeNumberField("size", this.size);
        jsonWriter.writeStringField("parentPath", this.parentPath);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SubvolumeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SubvolumeProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SubvolumeProperties.
     */
    public static SubvolumeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SubvolumeProperties deserializedSubvolumeProperties = new SubvolumeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("path".equals(fieldName)) {
                    deserializedSubvolumeProperties.path = reader.getString();
                } else if ("size".equals(fieldName)) {
                    deserializedSubvolumeProperties.size = reader.getNullable(JsonReader::getLong);
                } else if ("parentPath".equals(fieldName)) {
                    deserializedSubvolumeProperties.parentPath = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedSubvolumeProperties.provisioningState = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSubvolumeProperties;
        });
    }
}
