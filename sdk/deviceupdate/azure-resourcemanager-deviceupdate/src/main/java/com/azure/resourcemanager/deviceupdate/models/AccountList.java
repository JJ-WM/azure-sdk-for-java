// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.deviceupdate.fluent.models.AccountInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * List of Accounts.
 */
@Fluent
public final class AccountList {
    /*
     * The link used to get the next page of Accounts list.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * List of Accounts.
     */
    @JsonProperty(value = "value")
    private List<AccountInner> value;

    /**
     * Creates an instance of AccountList class.
     */
    public AccountList() {
    }

    /**
     * Get the nextLink property: The link used to get the next page of Accounts list.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of Accounts list.
     * 
     * @param nextLink the nextLink value to set.
     * @return the AccountList object itself.
     */
    public AccountList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: List of Accounts.
     * 
     * @return the value value.
     */
    public List<AccountInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Accounts.
     * 
     * @param value the value value to set.
     * @return the AccountList object itself.
     */
    public AccountList withValue(List<AccountInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
