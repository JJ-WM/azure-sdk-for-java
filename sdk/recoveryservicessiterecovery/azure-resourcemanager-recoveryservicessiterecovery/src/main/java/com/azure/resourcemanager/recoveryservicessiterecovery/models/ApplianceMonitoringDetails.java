// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Appliance details of the migration item.
 */
@Immutable
public final class ApplianceMonitoringDetails {
    /*
     * The appliance CPU details.
     */
    @JsonProperty(value = "cpuDetails", access = JsonProperty.Access.WRITE_ONLY)
    private ApplianceResourceDetails cpuDetails;

    /*
     * The appliance RAM details.
     */
    @JsonProperty(value = "ramDetails", access = JsonProperty.Access.WRITE_ONLY)
    private ApplianceResourceDetails ramDetails;

    /*
     * The appliance datastore snapshot details.
     */
    @JsonProperty(value = "datastoreSnapshot", access = JsonProperty.Access.WRITE_ONLY)
    private List<DataStoreUtilizationDetails> datastoreSnapshot;

    /*
     * The disk replication details.
     */
    @JsonProperty(value = "disksReplicationDetails", access = JsonProperty.Access.WRITE_ONLY)
    private ApplianceResourceDetails disksReplicationDetails;

    /*
     * The ESXi NFC buffer details.
     */
    @JsonProperty(value = "esxiNfcBuffer", access = JsonProperty.Access.WRITE_ONLY)
    private ApplianceResourceDetails esxiNfcBuffer;

    /*
     * The appliance network bandwidth details.
     */
    @JsonProperty(value = "networkBandwidth", access = JsonProperty.Access.WRITE_ONLY)
    private ApplianceResourceDetails networkBandwidth;

    /**
     * Creates an instance of ApplianceMonitoringDetails class.
     */
    public ApplianceMonitoringDetails() {
    }

    /**
     * Get the cpuDetails property: The appliance CPU details.
     * 
     * @return the cpuDetails value.
     */
    public ApplianceResourceDetails cpuDetails() {
        return this.cpuDetails;
    }

    /**
     * Get the ramDetails property: The appliance RAM details.
     * 
     * @return the ramDetails value.
     */
    public ApplianceResourceDetails ramDetails() {
        return this.ramDetails;
    }

    /**
     * Get the datastoreSnapshot property: The appliance datastore snapshot details.
     * 
     * @return the datastoreSnapshot value.
     */
    public List<DataStoreUtilizationDetails> datastoreSnapshot() {
        return this.datastoreSnapshot;
    }

    /**
     * Get the disksReplicationDetails property: The disk replication details.
     * 
     * @return the disksReplicationDetails value.
     */
    public ApplianceResourceDetails disksReplicationDetails() {
        return this.disksReplicationDetails;
    }

    /**
     * Get the esxiNfcBuffer property: The ESXi NFC buffer details.
     * 
     * @return the esxiNfcBuffer value.
     */
    public ApplianceResourceDetails esxiNfcBuffer() {
        return this.esxiNfcBuffer;
    }

    /**
     * Get the networkBandwidth property: The appliance network bandwidth details.
     * 
     * @return the networkBandwidth value.
     */
    public ApplianceResourceDetails networkBandwidth() {
        return this.networkBandwidth;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (cpuDetails() != null) {
            cpuDetails().validate();
        }
        if (ramDetails() != null) {
            ramDetails().validate();
        }
        if (datastoreSnapshot() != null) {
            datastoreSnapshot().forEach(e -> e.validate());
        }
        if (disksReplicationDetails() != null) {
            disksReplicationDetails().validate();
        }
        if (esxiNfcBuffer() != null) {
            esxiNfcBuffer().validate();
        }
        if (networkBandwidth() != null) {
            networkBandwidth().validate();
        }
    }
}
