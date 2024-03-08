// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.azurestackhci.models.ExtendedLocation;
import com.azure.resourcemanager.azurestackhci.models.ProvisioningStateEnum;
import com.azure.resourcemanager.azurestackhci.models.StorageContainerStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The storage container resource definition. */
@Fluent
public final class StorageContainersInner extends Resource {
    /*
     * Properties under the storage container resource
     */
    @JsonProperty(value = "properties")
    private StorageContainerProperties innerProperties;

    /*
     * The extendedLocation of the resource.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of StorageContainersInner class. */
    public StorageContainersInner() {
    }

    /**
     * Get the innerProperties property: Properties under the storage container resource.
     *
     * @return the innerProperties value.
     */
    private StorageContainerProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the extendedLocation property: The extendedLocation of the resource.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extendedLocation of the resource.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the StorageContainersInner object itself.
     */
    public StorageContainersInner withExtendedLocation(ExtendedLocation extendedLocation) {
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

    /** {@inheritDoc} */
    @Override
    public StorageContainersInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StorageContainersInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the path property: Path of the storage container on the disk.
     *
     * @return the path value.
     */
    public String path() {
        return this.innerProperties() == null ? null : this.innerProperties().path();
    }

    /**
     * Set the path property: Path of the storage container on the disk.
     *
     * @param path the path value to set.
     * @return the StorageContainersInner object itself.
     */
    public StorageContainersInner withPath(String path) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageContainerProperties();
        }
        this.innerProperties().withPath(path);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the storage container.
     *
     * @return the provisioningState value.
     */
    public ProvisioningStateEnum provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the status property: The observed state of storage containers.
     *
     * @return the status value.
     */
    public StorageContainerStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }
}
