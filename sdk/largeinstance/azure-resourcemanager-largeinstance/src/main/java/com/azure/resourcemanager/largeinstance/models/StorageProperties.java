// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.largeinstance.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * described the storage properties of the azure large storage instance.
 */
@Fluent
public final class StorageProperties {
    /*
     * State of provisioning of the AzureLargeStorageInstance
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * the offering type for which the resource is getting provisioned
     */
    @JsonProperty(value = "offeringType")
    private String offeringType;

    /*
     * the storage protocol for which the resource is getting provisioned
     */
    @JsonProperty(value = "storageType")
    private String storageType;

    /*
     * the kind of storage instance
     */
    @JsonProperty(value = "generation")
    private String generation;

    /*
     * the hardware type of the storage instance
     */
    @JsonProperty(value = "hardwareType")
    private AzureLargeInstanceHardwareTypeNamesEnum hardwareType;

    /*
     * the workload for which the resource is getting provisioned
     */
    @JsonProperty(value = "workloadType")
    private String workloadType;

    /*
     * the billing related information for the resource
     */
    @JsonProperty(value = "storageBillingProperties")
    private StorageBillingProperties storageBillingProperties;

    /**
     * Creates an instance of StorageProperties class.
     */
    public StorageProperties() {
    }

    /**
     * Get the provisioningState property: State of provisioning of the AzureLargeStorageInstance.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the offeringType property: the offering type for which the resource is getting provisioned.
     * 
     * @return the offeringType value.
     */
    public String offeringType() {
        return this.offeringType;
    }

    /**
     * Set the offeringType property: the offering type for which the resource is getting provisioned.
     * 
     * @param offeringType the offeringType value to set.
     * @return the StorageProperties object itself.
     */
    public StorageProperties withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * Get the storageType property: the storage protocol for which the resource is getting provisioned.
     * 
     * @return the storageType value.
     */
    public String storageType() {
        return this.storageType;
    }

    /**
     * Set the storageType property: the storage protocol for which the resource is getting provisioned.
     * 
     * @param storageType the storageType value to set.
     * @return the StorageProperties object itself.
     */
    public StorageProperties withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * Get the generation property: the kind of storage instance.
     * 
     * @return the generation value.
     */
    public String generation() {
        return this.generation;
    }

    /**
     * Set the generation property: the kind of storage instance.
     * 
     * @param generation the generation value to set.
     * @return the StorageProperties object itself.
     */
    public StorageProperties withGeneration(String generation) {
        this.generation = generation;
        return this;
    }

    /**
     * Get the hardwareType property: the hardware type of the storage instance.
     * 
     * @return the hardwareType value.
     */
    public AzureLargeInstanceHardwareTypeNamesEnum hardwareType() {
        return this.hardwareType;
    }

    /**
     * Set the hardwareType property: the hardware type of the storage instance.
     * 
     * @param hardwareType the hardwareType value to set.
     * @return the StorageProperties object itself.
     */
    public StorageProperties withHardwareType(AzureLargeInstanceHardwareTypeNamesEnum hardwareType) {
        this.hardwareType = hardwareType;
        return this;
    }

    /**
     * Get the workloadType property: the workload for which the resource is getting provisioned.
     * 
     * @return the workloadType value.
     */
    public String workloadType() {
        return this.workloadType;
    }

    /**
     * Set the workloadType property: the workload for which the resource is getting provisioned.
     * 
     * @param workloadType the workloadType value to set.
     * @return the StorageProperties object itself.
     */
    public StorageProperties withWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * Get the storageBillingProperties property: the billing related information for the resource.
     * 
     * @return the storageBillingProperties value.
     */
    public StorageBillingProperties storageBillingProperties() {
        return this.storageBillingProperties;
    }

    /**
     * Set the storageBillingProperties property: the billing related information for the resource.
     * 
     * @param storageBillingProperties the storageBillingProperties value to set.
     * @return the StorageProperties object itself.
     */
    public StorageProperties withStorageBillingProperties(StorageBillingProperties storageBillingProperties) {
        this.storageBillingProperties = storageBillingProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageBillingProperties() != null) {
            storageBillingProperties().validate();
        }
    }
}
