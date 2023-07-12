// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.networkcloud.models.CloudServicesNetworkDetailedStatus;
import com.azure.resourcemanager.networkcloud.models.CloudServicesNetworkEnableDefaultEgressEndpoints;
import com.azure.resourcemanager.networkcloud.models.CloudServicesNetworkProvisioningState;
import com.azure.resourcemanager.networkcloud.models.EgressEndpoint;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** CloudServicesNetworkProperties represents properties of the cloud services network. */
@Fluent
public final class CloudServicesNetworkProperties {
    /*
     * The list of egress endpoints. This allows for connection from a Hybrid AKS cluster to the specified endpoint.
     */
    @JsonProperty(value = "additionalEgressEndpoints")
    private List<EgressEndpoint> additionalEgressEndpoints;

    /*
     * The list of resource IDs for the other Microsoft.NetworkCloud resources that have attached this network.
     */
    @JsonProperty(value = "associatedResourceIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> associatedResourceIds;

    /*
     * The resource ID of the Network Cloud cluster this cloud services network is associated with.
     */
    @JsonProperty(value = "clusterId", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterId;

    /*
     * The more detailed status of the cloud services network.
     */
    @JsonProperty(value = "detailedStatus", access = JsonProperty.Access.WRITE_ONLY)
    private CloudServicesNetworkDetailedStatus detailedStatus;

    /*
     * The descriptive message about the current detailed status.
     */
    @JsonProperty(value = "detailedStatusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String detailedStatusMessage;

    /*
     * The indicator of whether the platform default endpoints are allowed for the egress traffic.
     */
    @JsonProperty(value = "enableDefaultEgressEndpoints")
    private CloudServicesNetworkEnableDefaultEgressEndpoints enableDefaultEgressEndpoints;

    /*
     * The full list of additional and default egress endpoints that are currently enabled.
     */
    @JsonProperty(value = "enabledEgressEndpoints", access = JsonProperty.Access.WRITE_ONLY)
    private List<EgressEndpoint> enabledEgressEndpoints;

    /*
     * Field Deprecated. These fields will be empty/omitted. The list of Hybrid AKS cluster resource IDs that are
     * associated with this cloud services network.
     */
    @JsonProperty(value = "hybridAksClustersAssociatedIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> hybridAksClustersAssociatedIds;

    /*
     * The name of the interface that will be present in the virtual machine to represent this network.
     */
    @JsonProperty(value = "interfaceName", access = JsonProperty.Access.WRITE_ONLY)
    private String interfaceName;

    /*
     * The provisioning state of the cloud services network.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private CloudServicesNetworkProvisioningState provisioningState;

    /*
     * Field Deprecated. These fields will be empty/omitted. The list of virtual machine resource IDs, excluding any
     * Hybrid AKS virtual machines, that are currently using this cloud services network.
     */
    @JsonProperty(value = "virtualMachinesAssociatedIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> virtualMachinesAssociatedIds;

    /** Creates an instance of CloudServicesNetworkProperties class. */
    public CloudServicesNetworkProperties() {
    }

    /**
     * Get the additionalEgressEndpoints property: The list of egress endpoints. This allows for connection from a
     * Hybrid AKS cluster to the specified endpoint.
     *
     * @return the additionalEgressEndpoints value.
     */
    public List<EgressEndpoint> additionalEgressEndpoints() {
        return this.additionalEgressEndpoints;
    }

    /**
     * Set the additionalEgressEndpoints property: The list of egress endpoints. This allows for connection from a
     * Hybrid AKS cluster to the specified endpoint.
     *
     * @param additionalEgressEndpoints the additionalEgressEndpoints value to set.
     * @return the CloudServicesNetworkProperties object itself.
     */
    public CloudServicesNetworkProperties withAdditionalEgressEndpoints(
        List<EgressEndpoint> additionalEgressEndpoints) {
        this.additionalEgressEndpoints = additionalEgressEndpoints;
        return this;
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
     * Get the clusterId property: The resource ID of the Network Cloud cluster this cloud services network is
     * associated with.
     *
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * Get the detailedStatus property: The more detailed status of the cloud services network.
     *
     * @return the detailedStatus value.
     */
    public CloudServicesNetworkDetailedStatus detailedStatus() {
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
     * Get the enableDefaultEgressEndpoints property: The indicator of whether the platform default endpoints are
     * allowed for the egress traffic.
     *
     * @return the enableDefaultEgressEndpoints value.
     */
    public CloudServicesNetworkEnableDefaultEgressEndpoints enableDefaultEgressEndpoints() {
        return this.enableDefaultEgressEndpoints;
    }

    /**
     * Set the enableDefaultEgressEndpoints property: The indicator of whether the platform default endpoints are
     * allowed for the egress traffic.
     *
     * @param enableDefaultEgressEndpoints the enableDefaultEgressEndpoints value to set.
     * @return the CloudServicesNetworkProperties object itself.
     */
    public CloudServicesNetworkProperties withEnableDefaultEgressEndpoints(
        CloudServicesNetworkEnableDefaultEgressEndpoints enableDefaultEgressEndpoints) {
        this.enableDefaultEgressEndpoints = enableDefaultEgressEndpoints;
        return this;
    }

    /**
     * Get the enabledEgressEndpoints property: The full list of additional and default egress endpoints that are
     * currently enabled.
     *
     * @return the enabledEgressEndpoints value.
     */
    public List<EgressEndpoint> enabledEgressEndpoints() {
        return this.enabledEgressEndpoints;
    }

    /**
     * Get the hybridAksClustersAssociatedIds property: Field Deprecated. These fields will be empty/omitted. The list
     * of Hybrid AKS cluster resource IDs that are associated with this cloud services network.
     *
     * @return the hybridAksClustersAssociatedIds value.
     */
    public List<String> hybridAksClustersAssociatedIds() {
        return this.hybridAksClustersAssociatedIds;
    }

    /**
     * Get the interfaceName property: The name of the interface that will be present in the virtual machine to
     * represent this network.
     *
     * @return the interfaceName value.
     */
    public String interfaceName() {
        return this.interfaceName;
    }

    /**
     * Get the provisioningState property: The provisioning state of the cloud services network.
     *
     * @return the provisioningState value.
     */
    public CloudServicesNetworkProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the virtualMachinesAssociatedIds property: Field Deprecated. These fields will be empty/omitted. The list of
     * virtual machine resource IDs, excluding any Hybrid AKS virtual machines, that are currently using this cloud
     * services network.
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
        if (additionalEgressEndpoints() != null) {
            additionalEgressEndpoints().forEach(e -> e.validate());
        }
        if (enabledEgressEndpoints() != null) {
            enabledEgressEndpoints().forEach(e -> e.validate());
        }
    }
}
