// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes the properties of the load balancer configuration.
 */
@Fluent
public final class LoadBalancerConfigurationProperties {
    /*
     * Specifies the frontend IP to be used for the load balancer. Only IPv4 frontend IP address is supported. Each
     * load balancer configuration must have exactly one frontend IP configuration.
     */
    @JsonProperty(value = "frontendIpConfigurations", required = true)
    private List<LoadBalancerFrontendIpConfiguration> frontendIpConfigurations;

    /**
     * Creates an instance of LoadBalancerConfigurationProperties class.
     */
    public LoadBalancerConfigurationProperties() {
    }

    /**
     * Get the frontendIpConfigurations property: Specifies the frontend IP to be used for the load balancer. Only IPv4
     * frontend IP address is supported. Each load balancer configuration must have exactly one frontend IP
     * configuration.
     * 
     * @return the frontendIpConfigurations value.
     */
    public List<LoadBalancerFrontendIpConfiguration> frontendIpConfigurations() {
        return this.frontendIpConfigurations;
    }

    /**
     * Set the frontendIpConfigurations property: Specifies the frontend IP to be used for the load balancer. Only IPv4
     * frontend IP address is supported. Each load balancer configuration must have exactly one frontend IP
     * configuration.
     * 
     * @param frontendIpConfigurations the frontendIpConfigurations value to set.
     * @return the LoadBalancerConfigurationProperties object itself.
     */
    public LoadBalancerConfigurationProperties
        withFrontendIpConfigurations(List<LoadBalancerFrontendIpConfiguration> frontendIpConfigurations) {
        this.frontendIpConfigurations = frontendIpConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (frontendIpConfigurations() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property frontendIpConfigurations in model LoadBalancerConfigurationProperties"));
        } else {
            frontendIpConfigurations().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LoadBalancerConfigurationProperties.class);
}
