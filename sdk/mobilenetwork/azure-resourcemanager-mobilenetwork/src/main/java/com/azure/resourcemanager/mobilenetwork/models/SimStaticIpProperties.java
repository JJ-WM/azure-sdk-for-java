// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Static IP configuration for a sim, scoped to a particular attached data network and slice. */
@Fluent
public final class SimStaticIpProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SimStaticIpProperties.class);

    /*
     * The attached data network on which the static IP address will be used.
     * The combination of attachedDataNetwork and slice defines the network
     * scope of the IP address.
     */
    @JsonProperty(value = "attachedDataNetwork")
    private AttachedDataNetworkResourceId attachedDataNetwork;

    /*
     * The network slice on which the static IP address will be used. The
     * combination of attachedDataNetwork and slice defines the network scope
     * of the IP address.
     */
    @JsonProperty(value = "slice")
    private SliceResourceId slice;

    /*
     * The static IP configuration for the sim to use at the defined network
     * scope.
     */
    @JsonProperty(value = "staticIp")
    private SimStaticIpPropertiesStaticIp staticIp;

    /**
     * Get the attachedDataNetwork property: The attached data network on which the static IP address will be used. The
     * combination of attachedDataNetwork and slice defines the network scope of the IP address.
     *
     * @return the attachedDataNetwork value.
     */
    public AttachedDataNetworkResourceId attachedDataNetwork() {
        return this.attachedDataNetwork;
    }

    /**
     * Set the attachedDataNetwork property: The attached data network on which the static IP address will be used. The
     * combination of attachedDataNetwork and slice defines the network scope of the IP address.
     *
     * @param attachedDataNetwork the attachedDataNetwork value to set.
     * @return the SimStaticIpProperties object itself.
     */
    public SimStaticIpProperties withAttachedDataNetwork(AttachedDataNetworkResourceId attachedDataNetwork) {
        this.attachedDataNetwork = attachedDataNetwork;
        return this;
    }

    /**
     * Get the slice property: The network slice on which the static IP address will be used. The combination of
     * attachedDataNetwork and slice defines the network scope of the IP address.
     *
     * @return the slice value.
     */
    public SliceResourceId slice() {
        return this.slice;
    }

    /**
     * Set the slice property: The network slice on which the static IP address will be used. The combination of
     * attachedDataNetwork and slice defines the network scope of the IP address.
     *
     * @param slice the slice value to set.
     * @return the SimStaticIpProperties object itself.
     */
    public SimStaticIpProperties withSlice(SliceResourceId slice) {
        this.slice = slice;
        return this;
    }

    /**
     * Get the staticIp property: The static IP configuration for the sim to use at the defined network scope.
     *
     * @return the staticIp value.
     */
    public SimStaticIpPropertiesStaticIp staticIp() {
        return this.staticIp;
    }

    /**
     * Set the staticIp property: The static IP configuration for the sim to use at the defined network scope.
     *
     * @param staticIp the staticIp value to set.
     * @return the SimStaticIpProperties object itself.
     */
    public SimStaticIpProperties withStaticIp(SimStaticIpPropertiesStaticIp staticIp) {
        this.staticIp = staticIp;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (attachedDataNetwork() != null) {
            attachedDataNetwork().validate();
        }
        if (slice() != null) {
            slice().validate();
        }
        if (staticIp() != null) {
            staticIp().validate();
        }
    }
}
