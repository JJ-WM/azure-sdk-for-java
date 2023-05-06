// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SupportedVersion object for appliance. */
@Immutable
public final class SupportedVersion {
    /*
     * This is the metadata of the supported newer version.
     */
    @JsonProperty(value = "metadata", access = JsonProperty.Access.WRITE_ONLY)
    private SupportedVersionMetadata metadata;

    /*
     * The newer version available for upgrade.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /** Creates an instance of SupportedVersion class. */
    public SupportedVersion() {
    }

    /**
     * Get the metadata property: This is the metadata of the supported newer version.
     *
     * @return the metadata value.
     */
    public SupportedVersionMetadata metadata() {
        return this.metadata;
    }

    /**
     * Get the version property: The newer version available for upgrade.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metadata() != null) {
            metadata().validate();
        }
    }
}
