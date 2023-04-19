// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of the volume mount. */
@Fluent
public final class VolumeMount {
    /*
     * The name of the volume mount.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The path within the container where the volume should be mounted. Must not contain colon (:).
     */
    @JsonProperty(value = "mountPath", required = true)
    private String mountPath;

    /*
     * The flag indicating whether the volume mount is read-only.
     */
    @JsonProperty(value = "readOnly")
    private Boolean readOnly;

    /** Creates an instance of VolumeMount class. */
    public VolumeMount() {
    }

    /**
     * Get the name property: The name of the volume mount.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the volume mount.
     *
     * @param name the name value to set.
     * @return the VolumeMount object itself.
     */
    public VolumeMount withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the mountPath property: The path within the container where the volume should be mounted. Must not contain
     * colon (:).
     *
     * @return the mountPath value.
     */
    public String mountPath() {
        return this.mountPath;
    }

    /**
     * Set the mountPath property: The path within the container where the volume should be mounted. Must not contain
     * colon (:).
     *
     * @param mountPath the mountPath value to set.
     * @return the VolumeMount object itself.
     */
    public VolumeMount withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * Get the readOnly property: The flag indicating whether the volume mount is read-only.
     *
     * @return the readOnly value.
     */
    public Boolean readOnly() {
        return this.readOnly;
    }

    /**
     * Set the readOnly property: The flag indicating whether the volume mount is read-only.
     *
     * @param readOnly the readOnly value to set.
     * @return the VolumeMount object itself.
     */
    public VolumeMount withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model VolumeMount"));
        }
        if (mountPath() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property mountPath in model VolumeMount"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VolumeMount.class);
}
