// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ManagedClusterPoolUpgradeProfileUpgradesItem model.
 */
@Fluent
public final class ManagedClusterPoolUpgradeProfileUpgradesItem
    implements JsonSerializable<ManagedClusterPoolUpgradeProfileUpgradesItem> {
    /*
     * The Kubernetes version (major.minor.patch).
     */
    private String kubernetesVersion;

    /*
     * Whether the Kubernetes version is currently in preview.
     */
    private Boolean isPreview;

    /**
     * Creates an instance of ManagedClusterPoolUpgradeProfileUpgradesItem class.
     */
    public ManagedClusterPoolUpgradeProfileUpgradesItem() {
    }

    /**
     * Get the kubernetesVersion property: The Kubernetes version (major.minor.patch).
     * 
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Set the kubernetesVersion property: The Kubernetes version (major.minor.patch).
     * 
     * @param kubernetesVersion the kubernetesVersion value to set.
     * @return the ManagedClusterPoolUpgradeProfileUpgradesItem object itself.
     */
    public ManagedClusterPoolUpgradeProfileUpgradesItem withKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }

    /**
     * Get the isPreview property: Whether the Kubernetes version is currently in preview.
     * 
     * @return the isPreview value.
     */
    public Boolean isPreview() {
        return this.isPreview;
    }

    /**
     * Set the isPreview property: Whether the Kubernetes version is currently in preview.
     * 
     * @param isPreview the isPreview value to set.
     * @return the ManagedClusterPoolUpgradeProfileUpgradesItem object itself.
     */
    public ManagedClusterPoolUpgradeProfileUpgradesItem withIsPreview(Boolean isPreview) {
        this.isPreview = isPreview;
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
        jsonWriter.writeStringField("kubernetesVersion", this.kubernetesVersion);
        jsonWriter.writeBooleanField("isPreview", this.isPreview);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedClusterPoolUpgradeProfileUpgradesItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedClusterPoolUpgradeProfileUpgradesItem if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedClusterPoolUpgradeProfileUpgradesItem.
     */
    public static ManagedClusterPoolUpgradeProfileUpgradesItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedClusterPoolUpgradeProfileUpgradesItem deserializedManagedClusterPoolUpgradeProfileUpgradesItem
                = new ManagedClusterPoolUpgradeProfileUpgradesItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kubernetesVersion".equals(fieldName)) {
                    deserializedManagedClusterPoolUpgradeProfileUpgradesItem.kubernetesVersion = reader.getString();
                } else if ("isPreview".equals(fieldName)) {
                    deserializedManagedClusterPoolUpgradeProfileUpgradesItem.isPreview
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedClusterPoolUpgradeProfileUpgradesItem;
        });
    }
}
