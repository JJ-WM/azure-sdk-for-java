// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The latest run of this disco group with some limited information, null if the group has never been run.
 */
@Immutable
public final class DiscoRunResult {

    /*
     * The date for when the disco run was created in the system.
     */
    @Generated
    @JsonProperty(value = "submittedDate")
    private OffsetDateTime submittedDate;

    /*
     * The date for when the disco run was actually started by the system.
     */
    @Generated
    @JsonProperty(value = "startedDate")
    private OffsetDateTime startedDate;

    /*
     * The date for when the disco run was completed by the system.
     */
    @Generated
    @JsonProperty(value = "completedDate")
    private OffsetDateTime completedDate;

    /*
     * The tier which will affect the algorithm used for the disco run.
     */
    @Generated
    @JsonProperty(value = "tier")
    private String tier;

    /*
     * The State of the disco run.
     */
    @Generated
    @JsonProperty(value = "state")
    private DiscoRunState state;

    /*
     * The total count of assets that were found this disco run.
     */
    @Generated
    @JsonProperty(value = "totalAssetsFoundCount")
    private Long totalAssetsFoundCount;

    /*
     * The list of seeds used for the disco run.
     */
    @Generated
    @JsonProperty(value = "seeds")
    private List<DiscoSource> seeds;

    /*
     * The list of excludes used for the disco run, aka assets to exclude from the discovery algorithm.
     */
    @Generated
    @JsonProperty(value = "excludes")
    private List<DiscoSource> excludes;

    /*
     * The list of names used for the disco run.
     */
    @Generated
    @JsonProperty(value = "names")
    private List<String> names;

    /**
     * Creates an instance of DiscoRunResult class.
     */
    @Generated
    private DiscoRunResult() {
    }

    /**
     * Get the submittedDate property: The date for when the disco run was created in the system.
     *
     * @return the submittedDate value.
     */
    @Generated
    public OffsetDateTime getSubmittedDate() {
        return this.submittedDate;
    }

    /**
     * Get the startedDate property: The date for when the disco run was actually started by the system.
     *
     * @return the startedDate value.
     */
    @Generated
    public OffsetDateTime getStartedDate() {
        return this.startedDate;
    }

    /**
     * Get the completedDate property: The date for when the disco run was completed by the system.
     *
     * @return the completedDate value.
     */
    @Generated
    public OffsetDateTime getCompletedDate() {
        return this.completedDate;
    }

    /**
     * Get the tier property: The tier which will affect the algorithm used for the disco run.
     *
     * @return the tier value.
     */
    @Generated
    public String getTier() {
        return this.tier;
    }

    /**
     * Get the state property: The State of the disco run.
     *
     * @return the state value.
     */
    @Generated
    public DiscoRunState getState() {
        return this.state;
    }

    /**
     * Get the totalAssetsFoundCount property: The total count of assets that were found this disco run.
     *
     * @return the totalAssetsFoundCount value.
     */
    @Generated
    public Long getTotalAssetsFoundCount() {
        return this.totalAssetsFoundCount;
    }

    /**
     * Get the seeds property: The list of seeds used for the disco run.
     *
     * @return the seeds value.
     */
    @Generated
    public List<DiscoSource> getSeeds() {
        return this.seeds;
    }

    /**
     * Get the excludes property: The list of excludes used for the disco run, aka assets to exclude from the discovery
     * algorithm.
     *
     * @return the excludes value.
     */
    @Generated
    public List<DiscoSource> getExcludes() {
        return this.excludes;
    }

    /**
     * Get the names property: The list of names used for the disco run.
     *
     * @return the names value.
     */
    @Generated
    public List<String> getNames() {
        return this.names;
    }
}
