// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managednetworkfabric.models.ExportRoutePolicyInformation;
import com.azure.resourcemanager.managednetworkfabric.models.ImportRoutePolicyInformation;
import com.azure.resourcemanager.managednetworkfabric.models.Layer2Configuration;
import com.azure.resourcemanager.managednetworkfabric.models.NpbStaticRouteConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.OptionBLayer3Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Network to Network Interconnect patchable properties. */
@Fluent
public final class NetworkToNetworkInterconnectPatchableProperties {
    /*
     * Common properties for Layer2Configuration.
     */
    @JsonProperty(value = "layer2Configuration")
    private Layer2Configuration layer2Configuration;

    /*
     * Common properties for Layer3Configuration.
     */
    @JsonProperty(value = "optionBLayer3Configuration")
    private OptionBLayer3Configuration optionBLayer3Configuration;

    /*
     * NPB Static Route Configuration properties.
     */
    @JsonProperty(value = "npbStaticRouteConfiguration")
    private NpbStaticRouteConfiguration npbStaticRouteConfiguration;

    /*
     * Import Route Policy information.
     */
    @JsonProperty(value = "importRoutePolicy")
    private ImportRoutePolicyInformation importRoutePolicy;

    /*
     * Export Route Policy information
     */
    @JsonProperty(value = "exportRoutePolicy")
    private ExportRoutePolicyInformation exportRoutePolicy;

    /*
     * Egress Acl. ARM resource ID of Access Control Lists.
     */
    @JsonProperty(value = "egressAclId")
    private String egressAclId;

    /*
     * Ingress Acl. ARM resource ID of Access Control Lists.
     */
    @JsonProperty(value = "ingressAclId")
    private String ingressAclId;

    /** Creates an instance of NetworkToNetworkInterconnectPatchableProperties class. */
    public NetworkToNetworkInterconnectPatchableProperties() {
    }

    /**
     * Get the layer2Configuration property: Common properties for Layer2Configuration.
     *
     * @return the layer2Configuration value.
     */
    public Layer2Configuration layer2Configuration() {
        return this.layer2Configuration;
    }

    /**
     * Set the layer2Configuration property: Common properties for Layer2Configuration.
     *
     * @param layer2Configuration the layer2Configuration value to set.
     * @return the NetworkToNetworkInterconnectPatchableProperties object itself.
     */
    public NetworkToNetworkInterconnectPatchableProperties withLayer2Configuration(
        Layer2Configuration layer2Configuration) {
        this.layer2Configuration = layer2Configuration;
        return this;
    }

    /**
     * Get the optionBLayer3Configuration property: Common properties for Layer3Configuration.
     *
     * @return the optionBLayer3Configuration value.
     */
    public OptionBLayer3Configuration optionBLayer3Configuration() {
        return this.optionBLayer3Configuration;
    }

    /**
     * Set the optionBLayer3Configuration property: Common properties for Layer3Configuration.
     *
     * @param optionBLayer3Configuration the optionBLayer3Configuration value to set.
     * @return the NetworkToNetworkInterconnectPatchableProperties object itself.
     */
    public NetworkToNetworkInterconnectPatchableProperties withOptionBLayer3Configuration(
        OptionBLayer3Configuration optionBLayer3Configuration) {
        this.optionBLayer3Configuration = optionBLayer3Configuration;
        return this;
    }

    /**
     * Get the npbStaticRouteConfiguration property: NPB Static Route Configuration properties.
     *
     * @return the npbStaticRouteConfiguration value.
     */
    public NpbStaticRouteConfiguration npbStaticRouteConfiguration() {
        return this.npbStaticRouteConfiguration;
    }

    /**
     * Set the npbStaticRouteConfiguration property: NPB Static Route Configuration properties.
     *
     * @param npbStaticRouteConfiguration the npbStaticRouteConfiguration value to set.
     * @return the NetworkToNetworkInterconnectPatchableProperties object itself.
     */
    public NetworkToNetworkInterconnectPatchableProperties withNpbStaticRouteConfiguration(
        NpbStaticRouteConfiguration npbStaticRouteConfiguration) {
        this.npbStaticRouteConfiguration = npbStaticRouteConfiguration;
        return this;
    }

    /**
     * Get the importRoutePolicy property: Import Route Policy information.
     *
     * @return the importRoutePolicy value.
     */
    public ImportRoutePolicyInformation importRoutePolicy() {
        return this.importRoutePolicy;
    }

    /**
     * Set the importRoutePolicy property: Import Route Policy information.
     *
     * @param importRoutePolicy the importRoutePolicy value to set.
     * @return the NetworkToNetworkInterconnectPatchableProperties object itself.
     */
    public NetworkToNetworkInterconnectPatchableProperties withImportRoutePolicy(
        ImportRoutePolicyInformation importRoutePolicy) {
        this.importRoutePolicy = importRoutePolicy;
        return this;
    }

    /**
     * Get the exportRoutePolicy property: Export Route Policy information.
     *
     * @return the exportRoutePolicy value.
     */
    public ExportRoutePolicyInformation exportRoutePolicy() {
        return this.exportRoutePolicy;
    }

    /**
     * Set the exportRoutePolicy property: Export Route Policy information.
     *
     * @param exportRoutePolicy the exportRoutePolicy value to set.
     * @return the NetworkToNetworkInterconnectPatchableProperties object itself.
     */
    public NetworkToNetworkInterconnectPatchableProperties withExportRoutePolicy(
        ExportRoutePolicyInformation exportRoutePolicy) {
        this.exportRoutePolicy = exportRoutePolicy;
        return this;
    }

    /**
     * Get the egressAclId property: Egress Acl. ARM resource ID of Access Control Lists.
     *
     * @return the egressAclId value.
     */
    public String egressAclId() {
        return this.egressAclId;
    }

    /**
     * Set the egressAclId property: Egress Acl. ARM resource ID of Access Control Lists.
     *
     * @param egressAclId the egressAclId value to set.
     * @return the NetworkToNetworkInterconnectPatchableProperties object itself.
     */
    public NetworkToNetworkInterconnectPatchableProperties withEgressAclId(String egressAclId) {
        this.egressAclId = egressAclId;
        return this;
    }

    /**
     * Get the ingressAclId property: Ingress Acl. ARM resource ID of Access Control Lists.
     *
     * @return the ingressAclId value.
     */
    public String ingressAclId() {
        return this.ingressAclId;
    }

    /**
     * Set the ingressAclId property: Ingress Acl. ARM resource ID of Access Control Lists.
     *
     * @param ingressAclId the ingressAclId value to set.
     * @return the NetworkToNetworkInterconnectPatchableProperties object itself.
     */
    public NetworkToNetworkInterconnectPatchableProperties withIngressAclId(String ingressAclId) {
        this.ingressAclId = ingressAclId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (layer2Configuration() != null) {
            layer2Configuration().validate();
        }
        if (optionBLayer3Configuration() != null) {
            optionBLayer3Configuration().validate();
        }
        if (npbStaticRouteConfiguration() != null) {
            npbStaticRouteConfiguration().validate();
        }
        if (importRoutePolicy() != null) {
            importRoutePolicy().validate();
        }
        if (exportRoutePolicy() != null) {
            exportRoutePolicy().validate();
        }
    }
}
