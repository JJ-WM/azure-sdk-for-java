// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The Salesforce read behavior for the operation.
 */
public final class SalesforceSourceReadBehavior extends ExpandableStringEnum<SalesforceSourceReadBehavior> {
    /**
     * Static value Query for SalesforceSourceReadBehavior.
     */
    public static final SalesforceSourceReadBehavior QUERY = fromString("Query");

    /**
     * Static value QueryAll for SalesforceSourceReadBehavior.
     */
    public static final SalesforceSourceReadBehavior QUERY_ALL = fromString("QueryAll");

    /**
     * Creates a new instance of SalesforceSourceReadBehavior value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SalesforceSourceReadBehavior() {
    }

    /**
     * Creates or finds a SalesforceSourceReadBehavior from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SalesforceSourceReadBehavior.
     */
    @JsonCreator
    public static SalesforceSourceReadBehavior fromString(String name) {
        return fromString(name, SalesforceSourceReadBehavior.class);
    }

    /**
     * Gets known SalesforceSourceReadBehavior values.
     * 
     * @return known SalesforceSourceReadBehavior values.
     */
    public static Collection<SalesforceSourceReadBehavior> values() {
        return values(SalesforceSourceReadBehavior.class);
    }
}
