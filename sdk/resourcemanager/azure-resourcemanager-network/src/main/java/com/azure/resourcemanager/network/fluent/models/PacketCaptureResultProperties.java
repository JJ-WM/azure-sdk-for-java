// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.PacketCaptureFilter;
import com.azure.resourcemanager.network.models.PacketCaptureMachineScope;
import com.azure.resourcemanager.network.models.PacketCaptureStorageLocation;
import com.azure.resourcemanager.network.models.PacketCaptureTargetType;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The properties of a packet capture session.
 */
@Fluent
public final class PacketCaptureResultProperties extends PacketCaptureParameters {
    /*
     * The provisioning state of the packet capture session.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of PacketCaptureResultProperties class.
     */
    public PacketCaptureResultProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the packet capture session.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCaptureResultProperties withTarget(String target) {
        super.withTarget(target);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCaptureResultProperties withScope(PacketCaptureMachineScope scope) {
        super.withScope(scope);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCaptureResultProperties withTargetType(PacketCaptureTargetType targetType) {
        super.withTargetType(targetType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCaptureResultProperties withBytesToCapturePerPacket(Long bytesToCapturePerPacket) {
        super.withBytesToCapturePerPacket(bytesToCapturePerPacket);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCaptureResultProperties withTotalBytesPerSession(Long totalBytesPerSession) {
        super.withTotalBytesPerSession(totalBytesPerSession);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCaptureResultProperties withTimeLimitInSeconds(Integer timeLimitInSeconds) {
        super.withTimeLimitInSeconds(timeLimitInSeconds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCaptureResultProperties withStorageLocation(PacketCaptureStorageLocation storageLocation) {
        super.withStorageLocation(storageLocation);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCaptureResultProperties withFilters(List<PacketCaptureFilter> filters) {
        super.withFilters(filters);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
