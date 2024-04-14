// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.newrelicobservability.models.Status;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list of subscriptions and it's monitoring status by current NewRelic monitor.
 */
@Fluent
public final class MonitoredSubscriptionInner {
    /*
     * The subscriptionId to be monitored.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /*
     * The state of monitoring.
     */
    @JsonProperty(value = "status")
    private Status status;

    /*
     * The reason of not monitoring the subscription.
     */
    @JsonProperty(value = "error")
    private String error;

    /*
     * The resource-specific properties for this resource.
     */
    @JsonProperty(value = "tagRules")
    private MonitoringTagRulesPropertiesInner tagRules;

    /**
     * Creates an instance of MonitoredSubscriptionInner class.
     */
    public MonitoredSubscriptionInner() {
    }

    /**
     * Get the subscriptionId property: The subscriptionId to be monitored.
     * 
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The subscriptionId to be monitored.
     * 
     * @param subscriptionId the subscriptionId value to set.
     * @return the MonitoredSubscriptionInner object itself.
     */
    public MonitoredSubscriptionInner withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the status property: The state of monitoring.
     * 
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status property: The state of monitoring.
     * 
     * @param status the status value to set.
     * @return the MonitoredSubscriptionInner object itself.
     */
    public MonitoredSubscriptionInner withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get the error property: The reason of not monitoring the subscription.
     * 
     * @return the error value.
     */
    public String error() {
        return this.error;
    }

    /**
     * Set the error property: The reason of not monitoring the subscription.
     * 
     * @param error the error value to set.
     * @return the MonitoredSubscriptionInner object itself.
     */
    public MonitoredSubscriptionInner withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get the tagRules property: The resource-specific properties for this resource.
     * 
     * @return the tagRules value.
     */
    public MonitoringTagRulesPropertiesInner tagRules() {
        return this.tagRules;
    }

    /**
     * Set the tagRules property: The resource-specific properties for this resource.
     * 
     * @param tagRules the tagRules value to set.
     * @return the MonitoredSubscriptionInner object itself.
     */
    public MonitoredSubscriptionInner withTagRules(MonitoringTagRulesPropertiesInner tagRules) {
        this.tagRules = tagRules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tagRules() != null) {
            tagRules().validate();
        }
    }
}
