// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Network and credential configuration currently applied on terminal server. */
@Fluent
public final class VpnConfigurationProperties {
    /*
     * ARM Resource ID of the Network To Network Interconnect.
     */
    @JsonProperty(value = "networkToNetworkInterconnectId")
    private String networkToNetworkInterconnectId;

    /*
     * Administrative state of the resource.
     */
    @JsonProperty(value = "administrativeState", access = JsonProperty.Access.WRITE_ONLY)
    private AdministrativeState administrativeState;

    /*
     * Peering option list.
     */
    @JsonProperty(value = "peeringOption", required = true)
    private PeeringOption peeringOption;

    /*
     * option B properties
     */
    @JsonProperty(value = "optionBProperties")
    private OptionBProperties optionBProperties;

    /*
     * option A properties
     */
    @JsonProperty(value = "optionAProperties")
    private VpnConfigurationPropertiesOptionAProperties optionAProperties;

    /** Creates an instance of VpnConfigurationProperties class. */
    public VpnConfigurationProperties() {
    }

    /**
     * Get the networkToNetworkInterconnectId property: ARM Resource ID of the Network To Network Interconnect.
     *
     * @return the networkToNetworkInterconnectId value.
     */
    public String networkToNetworkInterconnectId() {
        return this.networkToNetworkInterconnectId;
    }

    /**
     * Set the networkToNetworkInterconnectId property: ARM Resource ID of the Network To Network Interconnect.
     *
     * @param networkToNetworkInterconnectId the networkToNetworkInterconnectId value to set.
     * @return the VpnConfigurationProperties object itself.
     */
    public VpnConfigurationProperties withNetworkToNetworkInterconnectId(String networkToNetworkInterconnectId) {
        this.networkToNetworkInterconnectId = networkToNetworkInterconnectId;
        return this;
    }

    /**
     * Get the administrativeState property: Administrative state of the resource.
     *
     * @return the administrativeState value.
     */
    public AdministrativeState administrativeState() {
        return this.administrativeState;
    }

    /**
     * Get the peeringOption property: Peering option list.
     *
     * @return the peeringOption value.
     */
    public PeeringOption peeringOption() {
        return this.peeringOption;
    }

    /**
     * Set the peeringOption property: Peering option list.
     *
     * @param peeringOption the peeringOption value to set.
     * @return the VpnConfigurationProperties object itself.
     */
    public VpnConfigurationProperties withPeeringOption(PeeringOption peeringOption) {
        this.peeringOption = peeringOption;
        return this;
    }

    /**
     * Get the optionBProperties property: option B properties.
     *
     * @return the optionBProperties value.
     */
    public OptionBProperties optionBProperties() {
        return this.optionBProperties;
    }

    /**
     * Set the optionBProperties property: option B properties.
     *
     * @param optionBProperties the optionBProperties value to set.
     * @return the VpnConfigurationProperties object itself.
     */
    public VpnConfigurationProperties withOptionBProperties(OptionBProperties optionBProperties) {
        this.optionBProperties = optionBProperties;
        return this;
    }

    /**
     * Get the optionAProperties property: option A properties.
     *
     * @return the optionAProperties value.
     */
    public VpnConfigurationPropertiesOptionAProperties optionAProperties() {
        return this.optionAProperties;
    }

    /**
     * Set the optionAProperties property: option A properties.
     *
     * @param optionAProperties the optionAProperties value to set.
     * @return the VpnConfigurationProperties object itself.
     */
    public VpnConfigurationProperties withOptionAProperties(
        VpnConfigurationPropertiesOptionAProperties optionAProperties) {
        this.optionAProperties = optionAProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (peeringOption() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property peeringOption in model VpnConfigurationProperties"));
        }
        if (optionBProperties() != null) {
            optionBProperties().validate();
        }
        if (optionAProperties() != null) {
            optionAProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VpnConfigurationProperties.class);
}
