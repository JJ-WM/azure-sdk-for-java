// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApplyRecoveryPoint input specific to InMageRcm provider.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageRcm")
@Fluent
public final class InMageRcmApplyRecoveryPointInput extends ApplyRecoveryPointProviderSpecificInput {
    /*
     * The recovery point Id.
     */
    @JsonProperty(value = "recoveryPointId", required = true)
    private String recoveryPointId;

    /**
     * Creates an instance of InMageRcmApplyRecoveryPointInput class.
     */
    public InMageRcmApplyRecoveryPointInput() {
    }

    /**
     * Get the recoveryPointId property: The recovery point Id.
     * 
     * @return the recoveryPointId value.
     */
    public String recoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * Set the recoveryPointId property: The recovery point Id.
     * 
     * @param recoveryPointId the recoveryPointId value to set.
     * @return the InMageRcmApplyRecoveryPointInput object itself.
     */
    public InMageRcmApplyRecoveryPointInput withRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
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
        if (recoveryPointId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property recoveryPointId in model InMageRcmApplyRecoveryPointInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(InMageRcmApplyRecoveryPointInput.class);
}
