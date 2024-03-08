// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the Spring Cloud Gateway Operator.
 */
@Immutable
public final class GatewayOperatorResourceRequests {
    /*
     * Cpu allocated to each Spring Cloud Gateway Operator instance.
     */
    @JsonProperty(value = "cpu", access = JsonProperty.Access.WRITE_ONLY)
    private String cpu;

    /*
     * Memory allocated to each Spring Cloud Gateway Operator instance.
     */
    @JsonProperty(value = "memory", access = JsonProperty.Access.WRITE_ONLY)
    private String memory;

    /*
     * Instance count of the Spring Cloud Gateway Operator.
     */
    @JsonProperty(value = "instanceCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer instanceCount;

    /**
     * Creates an instance of GatewayOperatorResourceRequests class.
     */
    public GatewayOperatorResourceRequests() {
    }

    /**
     * Get the cpu property: Cpu allocated to each Spring Cloud Gateway Operator instance.
     * 
     * @return the cpu value.
     */
    public String cpu() {
        return this.cpu;
    }

    /**
     * Get the memory property: Memory allocated to each Spring Cloud Gateway Operator instance.
     * 
     * @return the memory value.
     */
    public String memory() {
        return this.memory;
    }

    /**
     * Get the instanceCount property: Instance count of the Spring Cloud Gateway Operator.
     * 
     * @return the instanceCount value.
     */
    public Integer instanceCount() {
        return this.instanceCount;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
