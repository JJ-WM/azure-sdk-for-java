// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservicefleet.fluent.models.UpdateRunInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of a UpdateRun list operation. */
@Fluent
public final class UpdateRunListResult {
    /*
     * The UpdateRun items on this page
     */
    @JsonProperty(value = "value", required = true)
    private List<UpdateRunInner> value;

    /*
     * The link to the next page of items
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of UpdateRunListResult class. */
    public UpdateRunListResult() {
    }

    /**
     * Get the value property: The UpdateRun items on this page.
     *
     * @return the value value.
     */
    public List<UpdateRunInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The UpdateRun items on this page.
     *
     * @param value the value value to set.
     * @return the UpdateRunListResult object itself.
     */
    public UpdateRunListResult withValue(List<UpdateRunInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of items.
     *
     * @param nextLink the nextLink value to set.
     * @return the UpdateRunListResult object itself.
     */
    public UpdateRunListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model UpdateRunListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UpdateRunListResult.class);
}
