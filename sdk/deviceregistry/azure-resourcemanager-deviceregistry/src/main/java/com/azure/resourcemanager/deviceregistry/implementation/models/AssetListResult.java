// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.deviceregistry.fluent.models.AssetInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The response of a Asset list operation.
 */
@Immutable
public final class AssetListResult {
    /*
     * The Asset items on this page
     */
    @JsonProperty(value = "value", required = true)
    private List<AssetInner> value;

    /*
     * The link to the next page of items
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of AssetListResult class.
     */
    private AssetListResult() {
    }

    /**
     * Get the value property: The Asset items on this page.
     * 
     * @return the value value.
     */
    public List<AssetInner> value() {
        return this.value;
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
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model AssetListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AssetListResult.class);
}
