// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.SsisLogLocationTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSIS package execution log location.
 */
@Fluent
public final class SsisLogLocation {
    /*
     * The SSIS package execution log path. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "logPath", required = true)
    private Object logPath;

    /*
     * The type of SSIS log location.
     */
    @JsonProperty(value = "type", required = true)
    private SsisLogLocationType type;

    /*
     * SSIS package execution log location properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private SsisLogLocationTypeProperties innerTypeProperties = new SsisLogLocationTypeProperties();

    /**
     * Creates an instance of SsisLogLocation class.
     */
    public SsisLogLocation() {
    }

    /**
     * Get the logPath property: The SSIS package execution log path. Type: string (or Expression with resultType
     * string).
     * 
     * @return the logPath value.
     */
    public Object logPath() {
        return this.logPath;
    }

    /**
     * Set the logPath property: The SSIS package execution log path. Type: string (or Expression with resultType
     * string).
     * 
     * @param logPath the logPath value to set.
     * @return the SsisLogLocation object itself.
     */
    public SsisLogLocation withLogPath(Object logPath) {
        this.logPath = logPath;
        return this;
    }

    /**
     * Get the type property: The type of SSIS log location.
     * 
     * @return the type value.
     */
    public SsisLogLocationType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of SSIS log location.
     * 
     * @param type the type value to set.
     * @return the SsisLogLocation object itself.
     */
    public SsisLogLocation withType(SsisLogLocationType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the innerTypeProperties property: SSIS package execution log location properties.
     * 
     * @return the innerTypeProperties value.
     */
    private SsisLogLocationTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * Get the accessCredential property: The package execution log access credential.
     * 
     * @return the accessCredential value.
     */
    public SsisAccessCredential accessCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accessCredential();
    }

    /**
     * Set the accessCredential property: The package execution log access credential.
     * 
     * @param accessCredential the accessCredential value to set.
     * @return the SsisLogLocation object itself.
     */
    public SsisLogLocation withAccessCredential(SsisAccessCredential accessCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SsisLogLocationTypeProperties();
        }
        this.innerTypeProperties().withAccessCredential(accessCredential);
        return this;
    }

    /**
     * Get the logRefreshInterval property: Specifies the interval to refresh log. The default interval is 5 minutes.
     * Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @return the logRefreshInterval value.
     */
    public Object logRefreshInterval() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().logRefreshInterval();
    }

    /**
     * Set the logRefreshInterval property: Specifies the interval to refresh log. The default interval is 5 minutes.
     * Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @param logRefreshInterval the logRefreshInterval value to set.
     * @return the SsisLogLocation object itself.
     */
    public SsisLogLocation withLogRefreshInterval(Object logRefreshInterval) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SsisLogLocationTypeProperties();
        }
        this.innerTypeProperties().withLogRefreshInterval(logRefreshInterval);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logPath() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property logPath in model SsisLogLocation"));
        }
        if (type() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property type in model SsisLogLocation"));
        }
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model SsisLogLocation"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SsisLogLocation.class);
}
