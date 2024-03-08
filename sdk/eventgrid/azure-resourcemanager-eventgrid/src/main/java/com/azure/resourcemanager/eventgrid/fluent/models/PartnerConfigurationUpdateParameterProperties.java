// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information of partner configuration update parameter properties.
 */
@Fluent
public final class PartnerConfigurationUpdateParameterProperties {
    /*
     * The default time used to validate the maximum expiration time for each authorized partners in days. Allowed
     * values ar between 1 and 365 days.
     */
    @JsonProperty(value = "defaultMaximumExpirationTimeInDays")
    private Integer defaultMaximumExpirationTimeInDays;

    /**
     * Creates an instance of PartnerConfigurationUpdateParameterProperties class.
     */
    public PartnerConfigurationUpdateParameterProperties() {
    }

    /**
     * Get the defaultMaximumExpirationTimeInDays property: The default time used to validate the maximum expiration
     * time for each authorized partners in days. Allowed values ar between 1 and 365 days.
     * 
     * @return the defaultMaximumExpirationTimeInDays value.
     */
    public Integer defaultMaximumExpirationTimeInDays() {
        return this.defaultMaximumExpirationTimeInDays;
    }

    /**
     * Set the defaultMaximumExpirationTimeInDays property: The default time used to validate the maximum expiration
     * time for each authorized partners in days. Allowed values ar between 1 and 365 days.
     * 
     * @param defaultMaximumExpirationTimeInDays the defaultMaximumExpirationTimeInDays value to set.
     * @return the PartnerConfigurationUpdateParameterProperties object itself.
     */
    public PartnerConfigurationUpdateParameterProperties
        withDefaultMaximumExpirationTimeInDays(Integer defaultMaximumExpirationTimeInDays) {
        this.defaultMaximumExpirationTimeInDays = defaultMaximumExpirationTimeInDays;
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
