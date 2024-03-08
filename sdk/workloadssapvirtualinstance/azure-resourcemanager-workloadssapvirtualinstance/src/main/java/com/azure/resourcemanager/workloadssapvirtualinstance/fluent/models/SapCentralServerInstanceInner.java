// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapCentralServerProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Define the SAP Central Services Instance resource.
 */
@Fluent
public final class SapCentralServerInstanceInner extends Resource {
    /*
     * Defines the SAP Central Services Instance properties.
     */
    @JsonProperty(value = "properties")
    private SapCentralServerProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of SapCentralServerInstanceInner class.
     */
    public SapCentralServerInstanceInner() {
    }

    /**
     * Get the properties property: Defines the SAP Central Services Instance properties.
     * 
     * @return the properties value.
     */
    public SapCentralServerProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Defines the SAP Central Services Instance properties.
     * 
     * @param properties the properties value to set.
     * @return the SapCentralServerInstanceInner object itself.
     */
    public SapCentralServerInstanceInner withProperties(SapCentralServerProperties properties) {
        this.properties = properties;
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
    public SapCentralServerInstanceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapCentralServerInstanceInner withTags(Map<String, String> tags) {
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
    }
}
