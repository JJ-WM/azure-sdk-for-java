// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Extra Operation properties.
 */
@Fluent
public final class OperationProperties {
    /*
     * Service specifications of the operation
     */
    @JsonProperty(value = "serviceSpecification")
    private ServiceSpecification serviceSpecification;

    /**
     * Creates an instance of OperationProperties class.
     */
    public OperationProperties() {
    }

    /**
     * Get the serviceSpecification property: Service specifications of the operation.
     * 
     * @return the serviceSpecification value.
     */
    public ServiceSpecification serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Set the serviceSpecification property: Service specifications of the operation.
     * 
     * @param serviceSpecification the serviceSpecification value to set.
     * @return the OperationProperties object itself.
     */
    public OperationProperties withServiceSpecification(ServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceSpecification() != null) {
            serviceSpecification().validate();
        }
    }
}
