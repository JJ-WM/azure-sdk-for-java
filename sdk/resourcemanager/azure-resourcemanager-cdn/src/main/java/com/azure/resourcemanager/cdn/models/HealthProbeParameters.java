// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JSON object that contains the properties to send health probes to origin.
 */
@Fluent
public final class HealthProbeParameters {
    /*
     * The path relative to the origin that is used to determine the health of the origin.
     */
    @JsonProperty(value = "probePath")
    private String probePath;

    /*
     * The type of health probe request that is made.
     */
    @JsonProperty(value = "probeRequestType")
    private HealthProbeRequestType probeRequestType;

    /*
     * Protocol to use for health probe.
     */
    @JsonProperty(value = "probeProtocol")
    private ProbeProtocol probeProtocol;

    /*
     * The number of seconds between health probes.Default is 240sec.
     */
    @JsonProperty(value = "probeIntervalInSeconds")
    private Integer probeIntervalInSeconds;

    /**
     * Creates an instance of HealthProbeParameters class.
     */
    public HealthProbeParameters() {
    }

    /**
     * Get the probePath property: The path relative to the origin that is used to determine the health of the origin.
     * 
     * @return the probePath value.
     */
    public String probePath() {
        return this.probePath;
    }

    /**
     * Set the probePath property: The path relative to the origin that is used to determine the health of the origin.
     * 
     * @param probePath the probePath value to set.
     * @return the HealthProbeParameters object itself.
     */
    public HealthProbeParameters withProbePath(String probePath) {
        this.probePath = probePath;
        return this;
    }

    /**
     * Get the probeRequestType property: The type of health probe request that is made.
     * 
     * @return the probeRequestType value.
     */
    public HealthProbeRequestType probeRequestType() {
        return this.probeRequestType;
    }

    /**
     * Set the probeRequestType property: The type of health probe request that is made.
     * 
     * @param probeRequestType the probeRequestType value to set.
     * @return the HealthProbeParameters object itself.
     */
    public HealthProbeParameters withProbeRequestType(HealthProbeRequestType probeRequestType) {
        this.probeRequestType = probeRequestType;
        return this;
    }

    /**
     * Get the probeProtocol property: Protocol to use for health probe.
     * 
     * @return the probeProtocol value.
     */
    public ProbeProtocol probeProtocol() {
        return this.probeProtocol;
    }

    /**
     * Set the probeProtocol property: Protocol to use for health probe.
     * 
     * @param probeProtocol the probeProtocol value to set.
     * @return the HealthProbeParameters object itself.
     */
    public HealthProbeParameters withProbeProtocol(ProbeProtocol probeProtocol) {
        this.probeProtocol = probeProtocol;
        return this;
    }

    /**
     * Get the probeIntervalInSeconds property: The number of seconds between health probes.Default is 240sec.
     * 
     * @return the probeIntervalInSeconds value.
     */
    public Integer probeIntervalInSeconds() {
        return this.probeIntervalInSeconds;
    }

    /**
     * Set the probeIntervalInSeconds property: The number of seconds between health probes.Default is 240sec.
     * 
     * @param probeIntervalInSeconds the probeIntervalInSeconds value to set.
     * @return the HealthProbeParameters object itself.
     */
    public HealthProbeParameters withProbeIntervalInSeconds(Integer probeIntervalInSeconds) {
        this.probeIntervalInSeconds = probeIntervalInSeconds;
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
