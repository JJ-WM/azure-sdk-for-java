// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.TrinoDebugConfig;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Trino Coordinator. */
@Fluent
public final class TrinoCoordinator {
    /*
     * Trino debug configuration.
     */
    @JsonProperty(value = "debug")
    private TrinoDebugConfig innerDebug;

    /*
     * The flag that if enable coordinator HA, uses multiple coordinator replicas with auto failover, one per each head
     * node. Default: true.
     */
    @JsonProperty(value = "highAvailabilityEnabled")
    private Boolean highAvailabilityEnabled;

    /** Creates an instance of TrinoCoordinator class. */
    public TrinoCoordinator() {
    }

    /**
     * Get the innerDebug property: Trino debug configuration.
     *
     * @return the innerDebug value.
     */
    private TrinoDebugConfig innerDebug() {
        return this.innerDebug;
    }

    /**
     * Get the highAvailabilityEnabled property: The flag that if enable coordinator HA, uses multiple coordinator
     * replicas with auto failover, one per each head node. Default: true.
     *
     * @return the highAvailabilityEnabled value.
     */
    public Boolean highAvailabilityEnabled() {
        return this.highAvailabilityEnabled;
    }

    /**
     * Set the highAvailabilityEnabled property: The flag that if enable coordinator HA, uses multiple coordinator
     * replicas with auto failover, one per each head node. Default: true.
     *
     * @param highAvailabilityEnabled the highAvailabilityEnabled value to set.
     * @return the TrinoCoordinator object itself.
     */
    public TrinoCoordinator withHighAvailabilityEnabled(Boolean highAvailabilityEnabled) {
        this.highAvailabilityEnabled = highAvailabilityEnabled;
        return this;
    }

    /**
     * Get the enable property: The flag that if enable debug or not.
     *
     * @return the enable value.
     */
    public Boolean enable() {
        return this.innerDebug() == null ? null : this.innerDebug().enable();
    }

    /**
     * Set the enable property: The flag that if enable debug or not.
     *
     * @param enable the enable value to set.
     * @return the TrinoCoordinator object itself.
     */
    public TrinoCoordinator withEnable(Boolean enable) {
        if (this.innerDebug() == null) {
            this.innerDebug = new TrinoDebugConfig();
        }
        this.innerDebug().withEnable(enable);
        return this;
    }

    /**
     * Get the port property: The debug port.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.innerDebug() == null ? null : this.innerDebug().port();
    }

    /**
     * Set the port property: The debug port.
     *
     * @param port the port value to set.
     * @return the TrinoCoordinator object itself.
     */
    public TrinoCoordinator withPort(Integer port) {
        if (this.innerDebug() == null) {
            this.innerDebug = new TrinoDebugConfig();
        }
        this.innerDebug().withPort(port);
        return this;
    }

    /**
     * Get the suspend property: The flag that if suspend debug or not.
     *
     * @return the suspend value.
     */
    public Boolean suspend() {
        return this.innerDebug() == null ? null : this.innerDebug().suspend();
    }

    /**
     * Set the suspend property: The flag that if suspend debug or not.
     *
     * @param suspend the suspend value to set.
     * @return the TrinoCoordinator object itself.
     */
    public TrinoCoordinator withSuspend(Boolean suspend) {
        if (this.innerDebug() == null) {
            this.innerDebug = new TrinoDebugConfig();
        }
        this.innerDebug().withSuspend(suspend);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerDebug() != null) {
            innerDebug().validate();
        }
    }
}
