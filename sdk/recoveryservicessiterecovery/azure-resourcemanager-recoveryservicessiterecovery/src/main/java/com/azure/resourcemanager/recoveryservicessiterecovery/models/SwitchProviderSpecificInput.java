// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Provider specific switch provider input.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = SwitchProviderSpecificInput.class)
@JsonTypeName("SwitchProviderSpecificInput")
@JsonSubTypes({ @JsonSubTypes.Type(name = "InMageAzureV2", value = InMageAzureV2SwitchProviderInput.class) })
@Immutable
public class SwitchProviderSpecificInput {
    /**
     * Creates an instance of SwitchProviderSpecificInput class.
     */
    public SwitchProviderSpecificInput() {
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
