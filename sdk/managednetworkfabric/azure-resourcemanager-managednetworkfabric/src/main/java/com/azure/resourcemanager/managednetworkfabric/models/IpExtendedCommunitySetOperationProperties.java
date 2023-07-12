// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IP Extended Community set operation properties. */
@Fluent
public class IpExtendedCommunitySetOperationProperties {
    /*
     * IP Extended Community Id list properties.
     */
    @JsonProperty(value = "set")
    private IpExtendedCommunityIdList set;

    /** Creates an instance of IpExtendedCommunitySetOperationProperties class. */
    public IpExtendedCommunitySetOperationProperties() {
    }

    /**
     * Get the set property: IP Extended Community Id list properties.
     *
     * @return the set value.
     */
    public IpExtendedCommunityIdList set() {
        return this.set;
    }

    /**
     * Set the set property: IP Extended Community Id list properties.
     *
     * @param set the set value to set.
     * @return the IpExtendedCommunitySetOperationProperties object itself.
     */
    public IpExtendedCommunitySetOperationProperties withSet(IpExtendedCommunityIdList set) {
        this.set = set;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (set() != null) {
            set().validate();
        }
    }
}
