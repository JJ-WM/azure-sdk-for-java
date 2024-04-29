// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.Duration;

/** Policy governing how jobs are distributed to workers. */
@Fluent
public final class DistributionPolicy {
    /**
     * Create new instance
     */
    public DistributionPolicy() {
    }

    /*
     * The unique identifier of the policy.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The human readable name of the policy.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The duration after which any offers created under this policy will be
     * expired.
     */
    @JsonProperty(value = "offerExpiresAfterSeconds")
    @JsonDeserialize(using = DurationDeserializer.class)
    @JsonSerialize(using = DurationSerializer.class)
    private Duration offerExpiresAfter;

    /*
     * Abstract base class for defining a distribution mode
     */
    @JsonProperty(value = "mode")
    private DistributionMode mode;

    /**
     * Get the id property: The unique identifier of the policy.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The human readable name of the policy.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The human readable name of the policy.
     *
     * @param name the name value to set.
     * @return the DistributionPolicy object itself.
     */
    public DistributionPolicy setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the offerExpiresAfter property: The duration after which any offers created under this policy
     * will be expired.
     *
     * @return the offerExpiresAfter value.
     */
    public Duration getOfferExpiresAfter() {
        return this.offerExpiresAfter;
    }

    /**
     * Set the offerExpiresAfter property: The duration after which any offers created under this policy
     * will be expired.
     *
     * @param offerExpiresAfter the offerExpiresAfter value to set.
     * @return the DistributionPolicy object itself.
     */
    public DistributionPolicy setOfferExpiresAfter(Duration offerExpiresAfter) {
        this.offerExpiresAfter = offerExpiresAfter;
        return this;
    }

    /**
     * Get the mode property: Abstract base class for defining a distribution mode.
     *
     * @return the mode value.
     */
    public DistributionMode getMode() {
        return this.mode;
    }

    /**
     * Set the mode property: Abstract base class for defining a distribution mode.
     *
     * @param mode the mode value to set.
     * @return the DistributionPolicy object itself.
     */
    public DistributionPolicy setMode(DistributionMode mode) {
        this.mode = mode;
        return this;
    }

    /*
     * Concurrency Token.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the etag property: Concurrency Token.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }
}
