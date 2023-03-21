// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Optional tier of this particular SKU. 'Standard' or 'Free'.
 *
 * <p>`Basic` is deprecated, use `Standard` instead.
 */
public final class SignalRSkuTier extends ExpandableStringEnum<SignalRSkuTier> {
    /** Static value Free for SignalRSkuTier. */
    public static final SignalRSkuTier FREE = fromString("Free");

    /** Static value Basic for SignalRSkuTier. */
    public static final SignalRSkuTier BASIC = fromString("Basic");

    /** Static value Standard for SignalRSkuTier. */
    public static final SignalRSkuTier STANDARD = fromString("Standard");

    /** Static value Premium for SignalRSkuTier. */
    public static final SignalRSkuTier PREMIUM = fromString("Premium");

    /**
     * Creates a new instance of SignalRSkuTier value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SignalRSkuTier() {
    }

    /**
     * Creates or finds a SignalRSkuTier from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SignalRSkuTier.
     */
    @JsonCreator
    public static SignalRSkuTier fromString(String name) {
        return fromString(name, SignalRSkuTier.class);
    }

    /**
     * Gets known SignalRSkuTier values.
     *
     * @return known SignalRSkuTier values.
     */
    public static Collection<SignalRSkuTier> values() {
        return values(SignalRSkuTier.class);
    }
}
