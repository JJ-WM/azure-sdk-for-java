// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Jobs are directed to the worker who has been idle longest. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("longestIdle")
@Fluent
public final class LongestIdleMode extends DistributionMode {
    /** Creates an instance of LongestIdleMode class. */
    public LongestIdleMode() {}

    /** {@inheritDoc} */
    @Override
    public LongestIdleMode setMinConcurrentOffers(Integer minConcurrentOffers) {
        super.setMinConcurrentOffers(minConcurrentOffers);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LongestIdleMode setMaxConcurrentOffers(Integer maxConcurrentOffers) {
        super.setMaxConcurrentOffers(maxConcurrentOffers);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LongestIdleMode setBypassSelectors(Boolean bypassSelectors) {
        super.setBypassSelectors(bypassSelectors);
        return this;
    }
}
