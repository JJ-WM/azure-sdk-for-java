// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.loganalytics.models.LinkedServiceEntityStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Linked service properties. */
@Fluent
public final class LinkedServiceProperties {
    /*
     * The resource id of the resource that will be linked to the workspace. This should be used for linking resources
     * which require read access
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * The resource id of the resource that will be linked to the workspace. This should be used for linking resources
     * which require write access
     */
    @JsonProperty(value = "writeAccessResourceId")
    private String writeAccessResourceId;

    /*
     * The provisioning state of the linked service.
     */
    @JsonProperty(value = "provisioningState")
    private LinkedServiceEntityStatus provisioningState;

    /** Creates an instance of LinkedServiceProperties class. */
    public LinkedServiceProperties() {
    }

    /**
     * Get the resourceId property: The resource id of the resource that will be linked to the workspace. This should be
     * used for linking resources which require read access.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The resource id of the resource that will be linked to the workspace. This should be
     * used for linking resources which require read access.
     *
     * @param resourceId the resourceId value to set.
     * @return the LinkedServiceProperties object itself.
     */
    public LinkedServiceProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the writeAccessResourceId property: The resource id of the resource that will be linked to the workspace.
     * This should be used for linking resources which require write access.
     *
     * @return the writeAccessResourceId value.
     */
    public String writeAccessResourceId() {
        return this.writeAccessResourceId;
    }

    /**
     * Set the writeAccessResourceId property: The resource id of the resource that will be linked to the workspace.
     * This should be used for linking resources which require write access.
     *
     * @param writeAccessResourceId the writeAccessResourceId value to set.
     * @return the LinkedServiceProperties object itself.
     */
    public LinkedServiceProperties withWriteAccessResourceId(String writeAccessResourceId) {
        this.writeAccessResourceId = writeAccessResourceId;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the linked service.
     *
     * @return the provisioningState value.
     */
    public LinkedServiceEntityStatus provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the linked service.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the LinkedServiceProperties object itself.
     */
    public LinkedServiceProperties withProvisioningState(LinkedServiceEntityStatus provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
