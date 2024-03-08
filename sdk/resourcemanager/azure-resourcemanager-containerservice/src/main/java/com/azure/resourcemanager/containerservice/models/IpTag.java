// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the IPTag associated with the object.
 */
@Fluent
public final class IpTag {
    /*
     * The IP tag type. Example: RoutingPreference.
     */
    @JsonProperty(value = "ipTagType")
    private String ipTagType;

    /*
     * The value of the IP tag associated with the public IP. Example: Internet.
     */
    @JsonProperty(value = "tag")
    private String tag;

    /**
     * Creates an instance of IpTag class.
     */
    public IpTag() {
    }

    /**
     * Get the ipTagType property: The IP tag type. Example: RoutingPreference.
     * 
     * @return the ipTagType value.
     */
    public String ipTagType() {
        return this.ipTagType;
    }

    /**
     * Set the ipTagType property: The IP tag type. Example: RoutingPreference.
     * 
     * @param ipTagType the ipTagType value to set.
     * @return the IpTag object itself.
     */
    public IpTag withIpTagType(String ipTagType) {
        this.ipTagType = ipTagType;
        return this;
    }

    /**
     * Get the tag property: The value of the IP tag associated with the public IP. Example: Internet.
     * 
     * @return the tag value.
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Set the tag property: The value of the IP tag associated with the public IP. Example: Internet.
     * 
     * @param tag the tag value to set.
     * @return the IpTag object itself.
     */
    public IpTag withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
