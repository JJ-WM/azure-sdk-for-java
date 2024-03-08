// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Virtual Network information contract.
 */
@Fluent
public final class VnetInfo {
    /*
     * The Virtual Network's resource ID.
     */
    @JsonProperty(value = "vnetResourceId")
    private String vnetResourceId;

    /*
     * The client certificate thumbprint.
     */
    @JsonProperty(value = "certThumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String certThumbprint;

    /*
     * A certificate file (.cer) blob containing the public key of the private key used to authenticate a
     * Point-To-Site VPN connection.
     */
    @JsonProperty(value = "certBlob")
    private String certBlob;

    /*
     * The routes that this Virtual Network connection uses.
     */
    @JsonProperty(value = "routes", access = JsonProperty.Access.WRITE_ONLY)
    private List<VnetRouteInner> routes;

    /*
     * <code>true</code> if a resync is required; otherwise, <code>false</code>.
     */
    @JsonProperty(value = "resyncRequired", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean resyncRequired;

    /*
     * DNS servers to be used by this Virtual Network. This should be a comma-separated list of IP addresses.
     */
    @JsonProperty(value = "dnsServers")
    private String dnsServers;

    /*
     * Flag that is used to denote if this is VNET injection
     */
    @JsonProperty(value = "isSwift")
    private Boolean isSwift;

    /**
     * Creates an instance of VnetInfo class.
     */
    public VnetInfo() {
    }

    /**
     * Get the vnetResourceId property: The Virtual Network's resource ID.
     * 
     * @return the vnetResourceId value.
     */
    public String vnetResourceId() {
        return this.vnetResourceId;
    }

    /**
     * Set the vnetResourceId property: The Virtual Network's resource ID.
     * 
     * @param vnetResourceId the vnetResourceId value to set.
     * @return the VnetInfo object itself.
     */
    public VnetInfo withVnetResourceId(String vnetResourceId) {
        this.vnetResourceId = vnetResourceId;
        return this;
    }

    /**
     * Get the certThumbprint property: The client certificate thumbprint.
     * 
     * @return the certThumbprint value.
     */
    public String certThumbprint() {
        return this.certThumbprint;
    }

    /**
     * Get the certBlob property: A certificate file (.cer) blob containing the public key of the private key used to
     * authenticate a
     * Point-To-Site VPN connection.
     * 
     * @return the certBlob value.
     */
    public String certBlob() {
        return this.certBlob;
    }

    /**
     * Set the certBlob property: A certificate file (.cer) blob containing the public key of the private key used to
     * authenticate a
     * Point-To-Site VPN connection.
     * 
     * @param certBlob the certBlob value to set.
     * @return the VnetInfo object itself.
     */
    public VnetInfo withCertBlob(String certBlob) {
        this.certBlob = certBlob;
        return this;
    }

    /**
     * Get the routes property: The routes that this Virtual Network connection uses.
     * 
     * @return the routes value.
     */
    public List<VnetRouteInner> routes() {
        return this.routes;
    }

    /**
     * Get the resyncRequired property: &lt;code&gt;true&lt;/code&gt; if a resync is required; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the resyncRequired value.
     */
    public Boolean resyncRequired() {
        return this.resyncRequired;
    }

    /**
     * Get the dnsServers property: DNS servers to be used by this Virtual Network. This should be a comma-separated
     * list of IP addresses.
     * 
     * @return the dnsServers value.
     */
    public String dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set the dnsServers property: DNS servers to be used by this Virtual Network. This should be a comma-separated
     * list of IP addresses.
     * 
     * @param dnsServers the dnsServers value to set.
     * @return the VnetInfo object itself.
     */
    public VnetInfo withDnsServers(String dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * Get the isSwift property: Flag that is used to denote if this is VNET injection.
     * 
     * @return the isSwift value.
     */
    public Boolean isSwift() {
        return this.isSwift;
    }

    /**
     * Set the isSwift property: Flag that is used to denote if this is VNET injection.
     * 
     * @param isSwift the isSwift value to set.
     * @return the VnetInfo object itself.
     */
    public VnetInfo withIsSwift(Boolean isSwift) {
        this.isSwift = isSwift;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (routes() != null) {
            routes().forEach(e -> e.validate());
        }
    }
}
