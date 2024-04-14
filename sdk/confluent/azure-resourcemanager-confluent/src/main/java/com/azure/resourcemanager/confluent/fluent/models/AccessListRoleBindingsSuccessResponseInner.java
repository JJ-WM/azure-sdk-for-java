// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.confluent.models.ConfluentListMetadata;
import com.azure.resourcemanager.confluent.models.RoleBindingRecord;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Details of the role bindings returned on successful response.
 */
@Fluent
public final class AccessListRoleBindingsSuccessResponseInner {
    /*
     * Type of response
     */
    @JsonProperty(value = "kind")
    private String kind;

    /*
     * Metadata of the list
     */
    @JsonProperty(value = "metadata")
    private ConfluentListMetadata metadata;

    /*
     * List of role binding
     */
    @JsonProperty(value = "data")
    private List<RoleBindingRecord> data;

    /**
     * Creates an instance of AccessListRoleBindingsSuccessResponseInner class.
     */
    public AccessListRoleBindingsSuccessResponseInner() {
    }

    /**
     * Get the kind property: Type of response.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Type of response.
     * 
     * @param kind the kind value to set.
     * @return the AccessListRoleBindingsSuccessResponseInner object itself.
     */
    public AccessListRoleBindingsSuccessResponseInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the metadata property: Metadata of the list.
     * 
     * @return the metadata value.
     */
    public ConfluentListMetadata metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Metadata of the list.
     * 
     * @param metadata the metadata value to set.
     * @return the AccessListRoleBindingsSuccessResponseInner object itself.
     */
    public AccessListRoleBindingsSuccessResponseInner withMetadata(ConfluentListMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the data property: List of role binding.
     * 
     * @return the data value.
     */
    public List<RoleBindingRecord> data() {
        return this.data;
    }

    /**
     * Set the data property: List of role binding.
     * 
     * @param data the data value to set.
     * @return the AccessListRoleBindingsSuccessResponseInner object itself.
     */
    public AccessListRoleBindingsSuccessResponseInner withData(List<RoleBindingRecord> data) {
        this.data = data;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metadata() != null) {
            metadata().validate();
        }
        if (data() != null) {
            data().forEach(e -> e.validate());
        }
    }
}
