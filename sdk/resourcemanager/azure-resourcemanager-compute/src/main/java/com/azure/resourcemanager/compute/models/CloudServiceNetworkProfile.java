// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Network Profile for the cloud service.
 */
@Fluent
public final class CloudServiceNetworkProfile {
    /*
     * List of Load balancer configurations. Cloud service can have up to two load balancer configurations,
     * corresponding to a Public Load Balancer and an Internal Load Balancer.
     */
    @JsonProperty(value = "loadBalancerConfigurations")
    private List<LoadBalancerConfiguration> loadBalancerConfigurations;

    /*
     * Slot type for the cloud service.
     * Possible values are <br /><br />**Production**<br /><br />**Staging**<br /><br />
     * If not specified, the default value is Production.
     */
    @JsonProperty(value = "slotType")
    private CloudServiceSlotType slotType;

    /*
     * The id reference of the cloud service containing the target IP with which the subject cloud service can perform a
     * swap. This property cannot be updated once it is set. The swappable cloud service referred by this id must be
     * present otherwise an error will be thrown.
     */
    @JsonProperty(value = "swappableCloudService")
    private SubResource swappableCloudService;

    /**
     * Creates an instance of CloudServiceNetworkProfile class.
     */
    public CloudServiceNetworkProfile() {
    }

    /**
     * Get the loadBalancerConfigurations property: List of Load balancer configurations. Cloud service can have up to
     * two load balancer configurations, corresponding to a Public Load Balancer and an Internal Load Balancer.
     * 
     * @return the loadBalancerConfigurations value.
     */
    public List<LoadBalancerConfiguration> loadBalancerConfigurations() {
        return this.loadBalancerConfigurations;
    }

    /**
     * Set the loadBalancerConfigurations property: List of Load balancer configurations. Cloud service can have up to
     * two load balancer configurations, corresponding to a Public Load Balancer and an Internal Load Balancer.
     * 
     * @param loadBalancerConfigurations the loadBalancerConfigurations value to set.
     * @return the CloudServiceNetworkProfile object itself.
     */
    public CloudServiceNetworkProfile
        withLoadBalancerConfigurations(List<LoadBalancerConfiguration> loadBalancerConfigurations) {
        this.loadBalancerConfigurations = loadBalancerConfigurations;
        return this;
    }

    /**
     * Get the slotType property: Slot type for the cloud service.
     * Possible values are &lt;br /&gt;&lt;br /&gt;**Production**&lt;br /&gt;&lt;br /&gt;**Staging**&lt;br /&gt;&lt;br
     * /&gt;
     * If not specified, the default value is Production.
     * 
     * @return the slotType value.
     */
    public CloudServiceSlotType slotType() {
        return this.slotType;
    }

    /**
     * Set the slotType property: Slot type for the cloud service.
     * Possible values are &lt;br /&gt;&lt;br /&gt;**Production**&lt;br /&gt;&lt;br /&gt;**Staging**&lt;br /&gt;&lt;br
     * /&gt;
     * If not specified, the default value is Production.
     * 
     * @param slotType the slotType value to set.
     * @return the CloudServiceNetworkProfile object itself.
     */
    public CloudServiceNetworkProfile withSlotType(CloudServiceSlotType slotType) {
        this.slotType = slotType;
        return this;
    }

    /**
     * Get the swappableCloudService property: The id reference of the cloud service containing the target IP with which
     * the subject cloud service can perform a swap. This property cannot be updated once it is set. The swappable cloud
     * service referred by this id must be present otherwise an error will be thrown.
     * 
     * @return the swappableCloudService value.
     */
    public SubResource swappableCloudService() {
        return this.swappableCloudService;
    }

    /**
     * Set the swappableCloudService property: The id reference of the cloud service containing the target IP with which
     * the subject cloud service can perform a swap. This property cannot be updated once it is set. The swappable cloud
     * service referred by this id must be present otherwise an error will be thrown.
     * 
     * @param swappableCloudService the swappableCloudService value to set.
     * @return the CloudServiceNetworkProfile object itself.
     */
    public CloudServiceNetworkProfile withSwappableCloudService(SubResource swappableCloudService) {
        this.swappableCloudService = swappableCloudService;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (loadBalancerConfigurations() != null) {
            loadBalancerConfigurations().forEach(e -> e.validate());
        }
    }
}
