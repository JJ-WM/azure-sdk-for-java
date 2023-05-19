// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information of namespace topic update parameter properties. */
@Fluent
public final class NamespaceTopicUpdateParameterProperties {
    /*
     * Event retention for the namespace topic expressed in days. The property default value is 1 day.
     * Min event retention duration value is 1 day and max event retention duration value is 1 day.
     */
    @JsonProperty(value = "eventRetentionInDays")
    private Integer eventRetentionInDays;

    /** Creates an instance of NamespaceTopicUpdateParameterProperties class. */
    public NamespaceTopicUpdateParameterProperties() {
    }

    /**
     * Get the eventRetentionInDays property: Event retention for the namespace topic expressed in days. The property
     * default value is 1 day. Min event retention duration value is 1 day and max event retention duration value is 1
     * day.
     *
     * @return the eventRetentionInDays value.
     */
    public Integer eventRetentionInDays() {
        return this.eventRetentionInDays;
    }

    /**
     * Set the eventRetentionInDays property: Event retention for the namespace topic expressed in days. The property
     * default value is 1 day. Min event retention duration value is 1 day and max event retention duration value is 1
     * day.
     *
     * @param eventRetentionInDays the eventRetentionInDays value to set.
     * @return the NamespaceTopicUpdateParameterProperties object itself.
     */
    public NamespaceTopicUpdateParameterProperties withEventRetentionInDays(Integer eventRetentionInDays) {
        this.eventRetentionInDays = eventRetentionInDays;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
