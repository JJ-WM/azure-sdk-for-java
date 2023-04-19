// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.confidentialledger.models.ResourceProviderOperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the Resource Provider Operation. */
@Fluent
public final class ResourceProviderOperationDefinitionInner {
    /*
     * Resource provider operation name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Indicates whether the operation is data action or not.
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /*
     * Details about the operations
     */
    @JsonProperty(value = "display")
    private ResourceProviderOperationDisplay display;

    /** Creates an instance of ResourceProviderOperationDefinitionInner class. */
    public ResourceProviderOperationDefinitionInner() {
    }

    /**
     * Get the name property: Resource provider operation name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource provider operation name.
     *
     * @param name the name value to set.
     * @return the ResourceProviderOperationDefinitionInner object itself.
     */
    public ResourceProviderOperationDefinitionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isDataAction property: Indicates whether the operation is data action or not.
     *
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the isDataAction property: Indicates whether the operation is data action or not.
     *
     * @param isDataAction the isDataAction value to set.
     * @return the ResourceProviderOperationDefinitionInner object itself.
     */
    public ResourceProviderOperationDefinitionInner withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get the display property: Details about the operations.
     *
     * @return the display value.
     */
    public ResourceProviderOperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Details about the operations.
     *
     * @param display the display value to set.
     * @return the ResourceProviderOperationDefinitionInner object itself.
     */
    public ResourceProviderOperationDefinitionInner withDisplay(ResourceProviderOperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}
