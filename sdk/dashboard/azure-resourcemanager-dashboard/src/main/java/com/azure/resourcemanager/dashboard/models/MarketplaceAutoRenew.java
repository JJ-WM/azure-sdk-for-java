// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The AutoRenew setting of the Enterprise subscription.
 */
public final class MarketplaceAutoRenew extends ExpandableStringEnum<MarketplaceAutoRenew> {
    /**
     * Static value Disabled for MarketplaceAutoRenew.
     */
    public static final MarketplaceAutoRenew DISABLED = fromString("Disabled");

    /**
     * Static value Enabled for MarketplaceAutoRenew.
     */
    public static final MarketplaceAutoRenew ENABLED = fromString("Enabled");

    /**
     * Creates a new instance of MarketplaceAutoRenew value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MarketplaceAutoRenew() {
    }

    /**
     * Creates or finds a MarketplaceAutoRenew from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MarketplaceAutoRenew.
     */
    @JsonCreator
    public static MarketplaceAutoRenew fromString(String name) {
        return fromString(name, MarketplaceAutoRenew.class);
    }

    /**
     * Gets known MarketplaceAutoRenew values.
     * 
     * @return known MarketplaceAutoRenew values.
     */
    public static Collection<MarketplaceAutoRenew> values() {
        return values(MarketplaceAutoRenew.class);
    }
}
