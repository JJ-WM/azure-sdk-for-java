// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Abstract base class for defining a distribution mode. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = DistributionModeInternal.class)
@JsonTypeName("DistributionModeInternal")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "best-worker", value = BestWorkerModeInternal.class),
    @JsonSubTypes.Type(name = "longest-idle", value = LongestIdleModeInternal.class),
    @JsonSubTypes.Type(name = "round-robin", value = RoundRobinModeInternal.class)
})
@Fluent
public class DistributionModeInternal {
    /*
     * Governs the minimum desired number of active concurrent offers a job can have.
     */
    @JsonProperty(value = "minConcurrentOffers")
    private Integer minConcurrentOffers;

    /*
     * Governs the maximum number of active concurrent offers a job can have.
     */
    @JsonProperty(value = "maxConcurrentOffers")
    private Integer maxConcurrentOffers;

    /*
     * (Optional)
     * If set to true, then router will match workers to jobs even if they don't match label selectors.
     * Warning: You may get workers that are not qualified for the job they are matched with if you set this
     * variable to true. This flag is intended more for temporary usage.
     * By default, set to false.
     */
    @JsonProperty(value = "bypassSelectors")
    private Boolean bypassSelectors;

    /** Creates an instance of DistributionModeInternal class. */
    public DistributionModeInternal() {}

    /**
     * Get the minConcurrentOffers property: Governs the minimum desired number of active concurrent offers a job can
     * have.
     *
     * @return the minConcurrentOffers value.
     */
    public Integer getMinConcurrentOffers() {
        return this.minConcurrentOffers;
    }

    /**
     * Set the minConcurrentOffers property: Governs the minimum desired number of active concurrent offers a job can
     * have.
     *
     * @param minConcurrentOffers the minConcurrentOffers value to set.
     * @return the DistributionModeInternal object itself.
     */
    public DistributionModeInternal setMinConcurrentOffers(Integer minConcurrentOffers) {
        this.minConcurrentOffers = minConcurrentOffers;
        return this;
    }

    /**
     * Get the maxConcurrentOffers property: Governs the maximum number of active concurrent offers a job can have.
     *
     * @return the maxConcurrentOffers value.
     */
    public Integer getMaxConcurrentOffers() {
        return this.maxConcurrentOffers;
    }

    /**
     * Set the maxConcurrentOffers property: Governs the maximum number of active concurrent offers a job can have.
     *
     * @param maxConcurrentOffers the maxConcurrentOffers value to set.
     * @return the DistributionModeInternal object itself.
     */
    public DistributionModeInternal setMaxConcurrentOffers(Integer maxConcurrentOffers) {
        this.maxConcurrentOffers = maxConcurrentOffers;
        return this;
    }

    /**
     * Get the bypassSelectors property: (Optional) If set to true, then router will match workers to jobs even if they
     * don't match label selectors. Warning: You may get workers that are not qualified for the job they are matched
     * with if you set this variable to true. This flag is intended more for temporary usage. By default, set to false.
     *
     * @return the bypassSelectors value.
     */
    public Boolean isBypassSelectors() {
        return this.bypassSelectors;
    }

    /**
     * Set the bypassSelectors property: (Optional) If set to true, then router will match workers to jobs even if they
     * don't match label selectors. Warning: You may get workers that are not qualified for the job they are matched
     * with if you set this variable to true. This flag is intended more for temporary usage. By default, set to false.
     *
     * @param bypassSelectors the bypassSelectors value to set.
     * @return the DistributionModeInternal object itself.
     */
    public DistributionModeInternal setBypassSelectors(Boolean bypassSelectors) {
        this.bypassSelectors = bypassSelectors;
        return this;
    }
}
