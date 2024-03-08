// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A set of rules describing access policies applied to NFSv3 clients of the cache.
 */
@Fluent
public final class NfsAccessPolicy {
    /*
     * Name identifying this policy. Access Policy names are not case sensitive.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The set of rules describing client accesses allowed under this policy.
     */
    @JsonProperty(value = "accessRules", required = true)
    private List<NfsAccessRule> accessRules;

    /**
     * Creates an instance of NfsAccessPolicy class.
     */
    public NfsAccessPolicy() {
    }

    /**
     * Get the name property: Name identifying this policy. Access Policy names are not case sensitive.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name identifying this policy. Access Policy names are not case sensitive.
     * 
     * @param name the name value to set.
     * @return the NfsAccessPolicy object itself.
     */
    public NfsAccessPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the accessRules property: The set of rules describing client accesses allowed under this policy.
     * 
     * @return the accessRules value.
     */
    public List<NfsAccessRule> accessRules() {
        return this.accessRules;
    }

    /**
     * Set the accessRules property: The set of rules describing client accesses allowed under this policy.
     * 
     * @param accessRules the accessRules value to set.
     * @return the NfsAccessPolicy object itself.
     */
    public NfsAccessPolicy withAccessRules(List<NfsAccessRule> accessRules) {
        this.accessRules = accessRules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property name in model NfsAccessPolicy"));
        }
        if (accessRules() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property accessRules in model NfsAccessPolicy"));
        } else {
            accessRules().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NfsAccessPolicy.class);
}
