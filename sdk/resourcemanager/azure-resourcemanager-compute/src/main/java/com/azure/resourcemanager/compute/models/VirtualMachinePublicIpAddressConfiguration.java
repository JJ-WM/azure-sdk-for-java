// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachinePublicIpAddressConfigurationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes a virtual machines IP Configuration's PublicIPAddress configuration.
 */
@Fluent
public final class VirtualMachinePublicIpAddressConfiguration {
    /*
     * The publicIP address configuration name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Describes a virtual machines IP Configuration's PublicIPAddress configuration
     */
    @JsonProperty(value = "properties")
    private VirtualMachinePublicIpAddressConfigurationProperties innerProperties;

    /*
     * Describes the public IP Sku. It can only be set with OrchestrationMode as Flexible.
     */
    @JsonProperty(value = "sku")
    private PublicIpAddressSku sku;

    /**
     * Creates an instance of VirtualMachinePublicIpAddressConfiguration class.
     */
    public VirtualMachinePublicIpAddressConfiguration() {
    }

    /**
     * Get the name property: The publicIP address configuration name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The publicIP address configuration name.
     * 
     * @param name the name value to set.
     * @return the VirtualMachinePublicIpAddressConfiguration object itself.
     */
    public VirtualMachinePublicIpAddressConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Describes a virtual machines IP Configuration's PublicIPAddress configuration.
     * 
     * @return the innerProperties value.
     */
    private VirtualMachinePublicIpAddressConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: Describes the public IP Sku. It can only be set with OrchestrationMode as Flexible.
     * 
     * @return the sku value.
     */
    public PublicIpAddressSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Describes the public IP Sku. It can only be set with OrchestrationMode as Flexible.
     * 
     * @param sku the sku value to set.
     * @return the VirtualMachinePublicIpAddressConfiguration object itself.
     */
    public VirtualMachinePublicIpAddressConfiguration withSku(PublicIpAddressSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: The idle timeout of the public IP address.
     * 
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.innerProperties() == null ? null : this.innerProperties().idleTimeoutInMinutes();
    }

    /**
     * Set the idleTimeoutInMinutes property: The idle timeout of the public IP address.
     * 
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the VirtualMachinePublicIpAddressConfiguration object itself.
     */
    public VirtualMachinePublicIpAddressConfiguration withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePublicIpAddressConfigurationProperties();
        }
        this.innerProperties().withIdleTimeoutInMinutes(idleTimeoutInMinutes);
        return this;
    }

    /**
     * Get the deleteOption property: Specify what happens to the public IP address when the VM is deleted.
     * 
     * @return the deleteOption value.
     */
    public DeleteOptions deleteOption() {
        return this.innerProperties() == null ? null : this.innerProperties().deleteOption();
    }

    /**
     * Set the deleteOption property: Specify what happens to the public IP address when the VM is deleted.
     * 
     * @param deleteOption the deleteOption value to set.
     * @return the VirtualMachinePublicIpAddressConfiguration object itself.
     */
    public VirtualMachinePublicIpAddressConfiguration withDeleteOption(DeleteOptions deleteOption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePublicIpAddressConfigurationProperties();
        }
        this.innerProperties().withDeleteOption(deleteOption);
        return this;
    }

    /**
     * Get the dnsSettings property: The dns settings to be applied on the publicIP addresses .
     * 
     * @return the dnsSettings value.
     */
    public VirtualMachinePublicIpAddressDnsSettingsConfiguration dnsSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsSettings();
    }

    /**
     * Set the dnsSettings property: The dns settings to be applied on the publicIP addresses .
     * 
     * @param dnsSettings the dnsSettings value to set.
     * @return the VirtualMachinePublicIpAddressConfiguration object itself.
     */
    public VirtualMachinePublicIpAddressConfiguration
        withDnsSettings(VirtualMachinePublicIpAddressDnsSettingsConfiguration dnsSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePublicIpAddressConfigurationProperties();
        }
        this.innerProperties().withDnsSettings(dnsSettings);
        return this;
    }

    /**
     * Get the ipTags property: The list of IP tags associated with the public IP address.
     * 
     * @return the ipTags value.
     */
    public List<VirtualMachineIpTag> ipTags() {
        return this.innerProperties() == null ? null : this.innerProperties().ipTags();
    }

    /**
     * Set the ipTags property: The list of IP tags associated with the public IP address.
     * 
     * @param ipTags the ipTags value to set.
     * @return the VirtualMachinePublicIpAddressConfiguration object itself.
     */
    public VirtualMachinePublicIpAddressConfiguration withIpTags(List<VirtualMachineIpTag> ipTags) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePublicIpAddressConfigurationProperties();
        }
        this.innerProperties().withIpTags(ipTags);
        return this;
    }

    /**
     * Get the publicIpPrefix property: The PublicIPPrefix from which to allocate publicIP addresses.
     * 
     * @return the publicIpPrefix value.
     */
    public SubResource publicIpPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpPrefix();
    }

    /**
     * Set the publicIpPrefix property: The PublicIPPrefix from which to allocate publicIP addresses.
     * 
     * @param publicIpPrefix the publicIpPrefix value to set.
     * @return the VirtualMachinePublicIpAddressConfiguration object itself.
     */
    public VirtualMachinePublicIpAddressConfiguration withPublicIpPrefix(SubResource publicIpPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePublicIpAddressConfigurationProperties();
        }
        this.innerProperties().withPublicIpPrefix(publicIpPrefix);
        return this;
    }

    /**
     * Get the publicIpAddressVersion property: Available from Api-Version 2019-07-01 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     * 
     * @return the publicIpAddressVersion value.
     */
    public IpVersions publicIpAddressVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAddressVersion();
    }

    /**
     * Set the publicIpAddressVersion property: Available from Api-Version 2019-07-01 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     * 
     * @param publicIpAddressVersion the publicIpAddressVersion value to set.
     * @return the VirtualMachinePublicIpAddressConfiguration object itself.
     */
    public VirtualMachinePublicIpAddressConfiguration withPublicIpAddressVersion(IpVersions publicIpAddressVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePublicIpAddressConfigurationProperties();
        }
        this.innerProperties().withPublicIpAddressVersion(publicIpAddressVersion);
        return this;
    }

    /**
     * Get the publicIpAllocationMethod property: Specify the public IP allocation type.
     * 
     * @return the publicIpAllocationMethod value.
     */
    public PublicIpAllocationMethod publicIpAllocationMethod() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAllocationMethod();
    }

    /**
     * Set the publicIpAllocationMethod property: Specify the public IP allocation type.
     * 
     * @param publicIpAllocationMethod the publicIpAllocationMethod value to set.
     * @return the VirtualMachinePublicIpAddressConfiguration object itself.
     */
    public VirtualMachinePublicIpAddressConfiguration
        withPublicIpAllocationMethod(PublicIpAllocationMethod publicIpAllocationMethod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePublicIpAddressConfigurationProperties();
        }
        this.innerProperties().withPublicIpAllocationMethod(publicIpAllocationMethod);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property name in model VirtualMachinePublicIpAddressConfiguration"));
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachinePublicIpAddressConfiguration.class);
}
