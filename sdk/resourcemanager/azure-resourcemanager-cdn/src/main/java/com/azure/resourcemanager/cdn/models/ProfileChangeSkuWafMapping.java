// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters required for profile upgrade.
 */
@Fluent
public final class ProfileChangeSkuWafMapping {
    /*
     * The security policy name.
     */
    @JsonProperty(value = "securityPolicyName", required = true)
    private String securityPolicyName;

    /*
     * The new waf resource for the security policy to use.
     */
    @JsonProperty(value = "changeToWafPolicy", required = true)
    private ResourceReference changeToWafPolicy;

    /**
     * Creates an instance of ProfileChangeSkuWafMapping class.
     */
    public ProfileChangeSkuWafMapping() {
    }

    /**
     * Get the securityPolicyName property: The security policy name.
     * 
     * @return the securityPolicyName value.
     */
    public String securityPolicyName() {
        return this.securityPolicyName;
    }

    /**
     * Set the securityPolicyName property: The security policy name.
     * 
     * @param securityPolicyName the securityPolicyName value to set.
     * @return the ProfileChangeSkuWafMapping object itself.
     */
    public ProfileChangeSkuWafMapping withSecurityPolicyName(String securityPolicyName) {
        this.securityPolicyName = securityPolicyName;
        return this;
    }

    /**
     * Get the changeToWafPolicy property: The new waf resource for the security policy to use.
     * 
     * @return the changeToWafPolicy value.
     */
    public ResourceReference changeToWafPolicy() {
        return this.changeToWafPolicy;
    }

    /**
     * Set the changeToWafPolicy property: The new waf resource for the security policy to use.
     * 
     * @param changeToWafPolicy the changeToWafPolicy value to set.
     * @return the ProfileChangeSkuWafMapping object itself.
     */
    public ProfileChangeSkuWafMapping withChangeToWafPolicy(ResourceReference changeToWafPolicy) {
        this.changeToWafPolicy = changeToWafPolicy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (securityPolicyName() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property securityPolicyName in model ProfileChangeSkuWafMapping"));
        }
        if (changeToWafPolicy() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property changeToWafPolicy in model ProfileChangeSkuWafMapping"));
        } else {
            changeToWafPolicy().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ProfileChangeSkuWafMapping.class);
}
