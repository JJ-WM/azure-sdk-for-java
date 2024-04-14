// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.newrelicobservability.models.LogRules;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type used for update operations of the TagRule.
 */
@Fluent
public final class TagRuleUpdateInner {
    /*
     * The updatable properties of the TagRule.
     */
    @JsonProperty(value = "properties")
    private TagRuleUpdatePropertiesInner innerProperties;

    /**
     * Creates an instance of TagRuleUpdateInner class.
     */
    public TagRuleUpdateInner() {
    }

    /**
     * Get the innerProperties property: The updatable properties of the TagRule.
     * 
     * @return the innerProperties value.
     */
    private TagRuleUpdatePropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the logRules property: Set of rules for sending logs for the Monitor resource.
     * 
     * @return the logRules value.
     */
    public LogRules logRules() {
        return this.innerProperties() == null ? null : this.innerProperties().logRules();
    }

    /**
     * Set the logRules property: Set of rules for sending logs for the Monitor resource.
     * 
     * @param logRules the logRules value to set.
     * @return the TagRuleUpdateInner object itself.
     */
    public TagRuleUpdateInner withLogRules(LogRules logRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TagRuleUpdatePropertiesInner();
        }
        this.innerProperties().withLogRules(logRules);
        return this;
    }

    /**
     * Get the metricRules property: Set of rules for sending metrics for the Monitor resource.
     * 
     * @return the metricRules value.
     */
    public MetricRulesInner metricRules() {
        return this.innerProperties() == null ? null : this.innerProperties().metricRules();
    }

    /**
     * Set the metricRules property: Set of rules for sending metrics for the Monitor resource.
     * 
     * @param metricRules the metricRules value to set.
     * @return the TagRuleUpdateInner object itself.
     */
    public TagRuleUpdateInner withMetricRules(MetricRulesInner metricRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TagRuleUpdatePropertiesInner();
        }
        this.innerProperties().withMetricRules(metricRules);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
