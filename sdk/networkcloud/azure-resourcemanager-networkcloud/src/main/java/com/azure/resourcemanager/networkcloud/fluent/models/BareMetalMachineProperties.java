// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.models.AdministrativeCredentials;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineCordonStatus;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineDetailedStatus;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachinePowerState;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineProvisioningState;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineReadyState;
import com.azure.resourcemanager.networkcloud.models.HardwareInventory;
import com.azure.resourcemanager.networkcloud.models.HardwareValidationStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** BareMetalMachineProperties represents the properties of a bare metal machine. */
@Fluent
public final class BareMetalMachineProperties {
    /*
     * The list of resource IDs for the other Microsoft.NetworkCloud resources that have attached this network.
     */
    @JsonProperty(value = "associatedResourceIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> associatedResourceIds;

    /*
     * The connection string for the baseboard management controller including IP address and protocol.
     */
    @JsonProperty(value = "bmcConnectionString", required = true)
    private String bmcConnectionString;

    /*
     * AdministrativeCredentials represents the admin credentials for the device requiring password-based
     * authentication.
     *
     * The credentials of the baseboard management controller on this bare metal machine.
     */
    @JsonProperty(value = "bmcCredentials", required = true)
    private AdministrativeCredentials bmcCredentials;

    /*
     * The MAC address of the BMC device.
     */
    @JsonProperty(value = "bmcMacAddress", required = true)
    private String bmcMacAddress;

    /*
     * The MAC address of a NIC connected to the PXE network.
     */
    @JsonProperty(value = "bootMacAddress", required = true)
    private String bootMacAddress;

    /*
     * The resource ID of the cluster this bare metal machine is associated with.
     */
    @JsonProperty(value = "clusterId", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterId;

    /*
     * The cordon status of the bare metal machine.
     */
    @JsonProperty(value = "cordonStatus", access = JsonProperty.Access.WRITE_ONLY)
    private BareMetalMachineCordonStatus cordonStatus;

    /*
     * The more detailed status of the bare metal machine.
     */
    @JsonProperty(value = "detailedStatus", access = JsonProperty.Access.WRITE_ONLY)
    private BareMetalMachineDetailedStatus detailedStatus;

    /*
     * The descriptive message about the current detailed status.
     */
    @JsonProperty(value = "detailedStatusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String detailedStatusMessage;

    /*
     * HardwareInventory represents the hardware configuration of this machine as exposed to the customer, including
     * information acquired from the model/sku information and from the ironic inspector.
     *
     * The hardware inventory, including information acquired from the model/sku information and from the ironic
     * inspector.
     */
    @JsonProperty(value = "hardwareInventory", access = JsonProperty.Access.WRITE_ONLY)
    private HardwareInventory hardwareInventory;

    /*
     * HardwareValidationStatus represents the latest hardware validation details performed for this bare metal
     * machine.
     *
     * The details of the latest hardware validation performed for this bare metal machine.
     */
    @JsonProperty(value = "hardwareValidationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private HardwareValidationStatus hardwareValidationStatus;

    /*
     * Field Deprecated. These fields will be empty/omitted. The list of the resource IDs for the HybridAksClusters
     * that have nodes hosted on this bare metal machine.
     */
    @JsonProperty(value = "hybridAksClustersAssociatedIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> hybridAksClustersAssociatedIds;

    /*
     * The name of this machine represented by the host object in the Cluster's Kubernetes control plane.
     */
    @JsonProperty(value = "kubernetesNodeName", access = JsonProperty.Access.WRITE_ONLY)
    private String kubernetesNodeName;

    /*
     * The version of Kubernetes running on this machine.
     */
    @JsonProperty(value = "kubernetesVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String kubernetesVersion;

    /*
     * The custom details provided by the customer.
     */
    @JsonProperty(value = "machineDetails", required = true)
    private String machineDetails;

    /*
     * The OS-level hostname assigned to this machine.
     */
    @JsonProperty(value = "machineName", required = true)
    private String machineName;

    /*
     * The unique internal identifier of the bare metal machine SKU.
     */
    @JsonProperty(value = "machineSkuId", required = true)
    private String machineSkuId;

    /*
     * The IPv4 address that is assigned to the bare metal machine during the cluster deployment.
     */
    @JsonProperty(value = "oamIpv4Address", access = JsonProperty.Access.WRITE_ONLY)
    private String oamIpv4Address;

    /*
     * The IPv6 address that is assigned to the bare metal machine during the cluster deployment.
     */
    @JsonProperty(value = "oamIpv6Address", access = JsonProperty.Access.WRITE_ONLY)
    private String oamIpv6Address;

    /*
     * The image that is currently provisioned to the OS disk.
     */
    @JsonProperty(value = "osImage", access = JsonProperty.Access.WRITE_ONLY)
    private String osImage;

    /*
     * The power state derived from the baseboard management controller.
     */
    @JsonProperty(value = "powerState", access = JsonProperty.Access.WRITE_ONLY)
    private BareMetalMachinePowerState powerState;

    /*
     * The provisioning state of the bare metal machine.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private BareMetalMachineProvisioningState provisioningState;

    /*
     * The resource ID of the rack where this bare metal machine resides.
     */
    @JsonProperty(value = "rackId", required = true)
    private String rackId;

    /*
     * The rack slot in which this bare metal machine is located, ordered from the bottom up i.e. the lowest slot is 1.
     */
    @JsonProperty(value = "rackSlot", required = true)
    private long rackSlot;

    /*
     * The indicator of whether the bare metal machine is ready to receive workloads.
     */
    @JsonProperty(value = "readyState", access = JsonProperty.Access.WRITE_ONLY)
    private BareMetalMachineReadyState readyState;

    /*
     * The serial number of the bare metal machine.
     */
    @JsonProperty(value = "serialNumber", required = true)
    private String serialNumber;

    /*
     * The discovered value of the machine's service tag.
     */
    @JsonProperty(value = "serviceTag", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceTag;

    /*
     * Field Deprecated. These fields will be empty/omitted. The list of the resource IDs for the VirtualMachines that
     * are hosted on this bare metal machine.
     */
    @JsonProperty(value = "virtualMachinesAssociatedIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> virtualMachinesAssociatedIds;

    /** Creates an instance of BareMetalMachineProperties class. */
    public BareMetalMachineProperties() {
    }

    /**
     * Get the associatedResourceIds property: The list of resource IDs for the other Microsoft.NetworkCloud resources
     * that have attached this network.
     *
     * @return the associatedResourceIds value.
     */
    public List<String> associatedResourceIds() {
        return this.associatedResourceIds;
    }

    /**
     * Get the bmcConnectionString property: The connection string for the baseboard management controller including IP
     * address and protocol.
     *
     * @return the bmcConnectionString value.
     */
    public String bmcConnectionString() {
        return this.bmcConnectionString;
    }

    /**
     * Set the bmcConnectionString property: The connection string for the baseboard management controller including IP
     * address and protocol.
     *
     * @param bmcConnectionString the bmcConnectionString value to set.
     * @return the BareMetalMachineProperties object itself.
     */
    public BareMetalMachineProperties withBmcConnectionString(String bmcConnectionString) {
        this.bmcConnectionString = bmcConnectionString;
        return this;
    }

    /**
     * Get the bmcCredentials property: AdministrativeCredentials represents the admin credentials for the device
     * requiring password-based authentication.
     *
     * <p>The credentials of the baseboard management controller on this bare metal machine.
     *
     * @return the bmcCredentials value.
     */
    public AdministrativeCredentials bmcCredentials() {
        return this.bmcCredentials;
    }

    /**
     * Set the bmcCredentials property: AdministrativeCredentials represents the admin credentials for the device
     * requiring password-based authentication.
     *
     * <p>The credentials of the baseboard management controller on this bare metal machine.
     *
     * @param bmcCredentials the bmcCredentials value to set.
     * @return the BareMetalMachineProperties object itself.
     */
    public BareMetalMachineProperties withBmcCredentials(AdministrativeCredentials bmcCredentials) {
        this.bmcCredentials = bmcCredentials;
        return this;
    }

    /**
     * Get the bmcMacAddress property: The MAC address of the BMC device.
     *
     * @return the bmcMacAddress value.
     */
    public String bmcMacAddress() {
        return this.bmcMacAddress;
    }

    /**
     * Set the bmcMacAddress property: The MAC address of the BMC device.
     *
     * @param bmcMacAddress the bmcMacAddress value to set.
     * @return the BareMetalMachineProperties object itself.
     */
    public BareMetalMachineProperties withBmcMacAddress(String bmcMacAddress) {
        this.bmcMacAddress = bmcMacAddress;
        return this;
    }

    /**
     * Get the bootMacAddress property: The MAC address of a NIC connected to the PXE network.
     *
     * @return the bootMacAddress value.
     */
    public String bootMacAddress() {
        return this.bootMacAddress;
    }

    /**
     * Set the bootMacAddress property: The MAC address of a NIC connected to the PXE network.
     *
     * @param bootMacAddress the bootMacAddress value to set.
     * @return the BareMetalMachineProperties object itself.
     */
    public BareMetalMachineProperties withBootMacAddress(String bootMacAddress) {
        this.bootMacAddress = bootMacAddress;
        return this;
    }

    /**
     * Get the clusterId property: The resource ID of the cluster this bare metal machine is associated with.
     *
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * Get the cordonStatus property: The cordon status of the bare metal machine.
     *
     * @return the cordonStatus value.
     */
    public BareMetalMachineCordonStatus cordonStatus() {
        return this.cordonStatus;
    }

    /**
     * Get the detailedStatus property: The more detailed status of the bare metal machine.
     *
     * @return the detailedStatus value.
     */
    public BareMetalMachineDetailedStatus detailedStatus() {
        return this.detailedStatus;
    }

    /**
     * Get the detailedStatusMessage property: The descriptive message about the current detailed status.
     *
     * @return the detailedStatusMessage value.
     */
    public String detailedStatusMessage() {
        return this.detailedStatusMessage;
    }

    /**
     * Get the hardwareInventory property: HardwareInventory represents the hardware configuration of this machine as
     * exposed to the customer, including information acquired from the model/sku information and from the ironic
     * inspector.
     *
     * <p>The hardware inventory, including information acquired from the model/sku information and from the ironic
     * inspector.
     *
     * @return the hardwareInventory value.
     */
    public HardwareInventory hardwareInventory() {
        return this.hardwareInventory;
    }

    /**
     * Get the hardwareValidationStatus property: HardwareValidationStatus represents the latest hardware validation
     * details performed for this bare metal machine.
     *
     * <p>The details of the latest hardware validation performed for this bare metal machine.
     *
     * @return the hardwareValidationStatus value.
     */
    public HardwareValidationStatus hardwareValidationStatus() {
        return this.hardwareValidationStatus;
    }

    /**
     * Get the hybridAksClustersAssociatedIds property: Field Deprecated. These fields will be empty/omitted. The list
     * of the resource IDs for the HybridAksClusters that have nodes hosted on this bare metal machine.
     *
     * @return the hybridAksClustersAssociatedIds value.
     */
    public List<String> hybridAksClustersAssociatedIds() {
        return this.hybridAksClustersAssociatedIds;
    }

    /**
     * Get the kubernetesNodeName property: The name of this machine represented by the host object in the Cluster's
     * Kubernetes control plane.
     *
     * @return the kubernetesNodeName value.
     */
    public String kubernetesNodeName() {
        return this.kubernetesNodeName;
    }

    /**
     * Get the kubernetesVersion property: The version of Kubernetes running on this machine.
     *
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Get the machineDetails property: The custom details provided by the customer.
     *
     * @return the machineDetails value.
     */
    public String machineDetails() {
        return this.machineDetails;
    }

    /**
     * Set the machineDetails property: The custom details provided by the customer.
     *
     * @param machineDetails the machineDetails value to set.
     * @return the BareMetalMachineProperties object itself.
     */
    public BareMetalMachineProperties withMachineDetails(String machineDetails) {
        this.machineDetails = machineDetails;
        return this;
    }

    /**
     * Get the machineName property: The OS-level hostname assigned to this machine.
     *
     * @return the machineName value.
     */
    public String machineName() {
        return this.machineName;
    }

    /**
     * Set the machineName property: The OS-level hostname assigned to this machine.
     *
     * @param machineName the machineName value to set.
     * @return the BareMetalMachineProperties object itself.
     */
    public BareMetalMachineProperties withMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }

    /**
     * Get the machineSkuId property: The unique internal identifier of the bare metal machine SKU.
     *
     * @return the machineSkuId value.
     */
    public String machineSkuId() {
        return this.machineSkuId;
    }

    /**
     * Set the machineSkuId property: The unique internal identifier of the bare metal machine SKU.
     *
     * @param machineSkuId the machineSkuId value to set.
     * @return the BareMetalMachineProperties object itself.
     */
    public BareMetalMachineProperties withMachineSkuId(String machineSkuId) {
        this.machineSkuId = machineSkuId;
        return this;
    }

    /**
     * Get the oamIpv4Address property: The IPv4 address that is assigned to the bare metal machine during the cluster
     * deployment.
     *
     * @return the oamIpv4Address value.
     */
    public String oamIpv4Address() {
        return this.oamIpv4Address;
    }

    /**
     * Get the oamIpv6Address property: The IPv6 address that is assigned to the bare metal machine during the cluster
     * deployment.
     *
     * @return the oamIpv6Address value.
     */
    public String oamIpv6Address() {
        return this.oamIpv6Address;
    }

    /**
     * Get the osImage property: The image that is currently provisioned to the OS disk.
     *
     * @return the osImage value.
     */
    public String osImage() {
        return this.osImage;
    }

    /**
     * Get the powerState property: The power state derived from the baseboard management controller.
     *
     * @return the powerState value.
     */
    public BareMetalMachinePowerState powerState() {
        return this.powerState;
    }

    /**
     * Get the provisioningState property: The provisioning state of the bare metal machine.
     *
     * @return the provisioningState value.
     */
    public BareMetalMachineProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the rackId property: The resource ID of the rack where this bare metal machine resides.
     *
     * @return the rackId value.
     */
    public String rackId() {
        return this.rackId;
    }

    /**
     * Set the rackId property: The resource ID of the rack where this bare metal machine resides.
     *
     * @param rackId the rackId value to set.
     * @return the BareMetalMachineProperties object itself.
     */
    public BareMetalMachineProperties withRackId(String rackId) {
        this.rackId = rackId;
        return this;
    }

    /**
     * Get the rackSlot property: The rack slot in which this bare metal machine is located, ordered from the bottom up
     * i.e. the lowest slot is 1.
     *
     * @return the rackSlot value.
     */
    public long rackSlot() {
        return this.rackSlot;
    }

    /**
     * Set the rackSlot property: The rack slot in which this bare metal machine is located, ordered from the bottom up
     * i.e. the lowest slot is 1.
     *
     * @param rackSlot the rackSlot value to set.
     * @return the BareMetalMachineProperties object itself.
     */
    public BareMetalMachineProperties withRackSlot(long rackSlot) {
        this.rackSlot = rackSlot;
        return this;
    }

    /**
     * Get the readyState property: The indicator of whether the bare metal machine is ready to receive workloads.
     *
     * @return the readyState value.
     */
    public BareMetalMachineReadyState readyState() {
        return this.readyState;
    }

    /**
     * Get the serialNumber property: The serial number of the bare metal machine.
     *
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Set the serialNumber property: The serial number of the bare metal machine.
     *
     * @param serialNumber the serialNumber value to set.
     * @return the BareMetalMachineProperties object itself.
     */
    public BareMetalMachineProperties withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * Get the serviceTag property: The discovered value of the machine's service tag.
     *
     * @return the serviceTag value.
     */
    public String serviceTag() {
        return this.serviceTag;
    }

    /**
     * Get the virtualMachinesAssociatedIds property: Field Deprecated. These fields will be empty/omitted. The list of
     * the resource IDs for the VirtualMachines that are hosted on this bare metal machine.
     *
     * @return the virtualMachinesAssociatedIds value.
     */
    public List<String> virtualMachinesAssociatedIds() {
        return this.virtualMachinesAssociatedIds;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (bmcConnectionString() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property bmcConnectionString in model BareMetalMachineProperties"));
        }
        if (bmcCredentials() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property bmcCredentials in model BareMetalMachineProperties"));
        } else {
            bmcCredentials().validate();
        }
        if (bmcMacAddress() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property bmcMacAddress in model BareMetalMachineProperties"));
        }
        if (bootMacAddress() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property bootMacAddress in model BareMetalMachineProperties"));
        }
        if (hardwareInventory() != null) {
            hardwareInventory().validate();
        }
        if (hardwareValidationStatus() != null) {
            hardwareValidationStatus().validate();
        }
        if (machineDetails() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property machineDetails in model BareMetalMachineProperties"));
        }
        if (machineName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property machineName in model BareMetalMachineProperties"));
        }
        if (machineSkuId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property machineSkuId in model BareMetalMachineProperties"));
        }
        if (rackId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property rackId in model BareMetalMachineProperties"));
        }
        if (serialNumber() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property serialNumber in model BareMetalMachineProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BareMetalMachineProperties.class);
}
