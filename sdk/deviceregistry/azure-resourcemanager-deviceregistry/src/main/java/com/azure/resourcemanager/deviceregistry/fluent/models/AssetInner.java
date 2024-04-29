// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.deviceregistry.models.AssetProperties;
import com.azure.resourcemanager.deviceregistry.models.ExtendedLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Asset definition.
 */
@Fluent
public final class AssetInner extends Resource {
    /*
     * The resource-specific properties for this resource.
     */
    @JsonProperty(value = "properties")
    private AssetProperties properties;

    /*
     * The extended location.
     */
    @JsonProperty(value = "extendedLocation", required = true)
    private ExtendedLocation extendedLocation;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of AssetInner class.
     */
    public AssetInner() {
    }

    /**
     * Get the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    public AssetProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The resource-specific properties for this resource.
     * 
     * @param properties the properties value to set.
     * @return the AssetInner object itself.
     */
    public AssetInner withProperties(AssetProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the extendedLocation property: The extended location.
     * 
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location.
     * 
     * @param extendedLocation the extendedLocation value to set.
     * @return the AssetInner object itself.
     */
    public AssetInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssetInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssetInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
        if (extendedLocation() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property extendedLocation in model AssetInner"));
        } else {
            extendedLocation().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AssetInner.class);
}
