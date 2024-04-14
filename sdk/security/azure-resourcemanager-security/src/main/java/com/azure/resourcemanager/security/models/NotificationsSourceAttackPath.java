// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Attack path notification source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "sourceType")
@JsonTypeName("AttackPath")
@Fluent
public final class NotificationsSourceAttackPath extends NotificationsSource {
    /*
     * Defines the minimal attach path risk level which will be sent as email notifications
     */
    @JsonProperty(value = "minimalRiskLevel")
    private MinimalRiskLevel minimalRiskLevel;

    /**
     * Creates an instance of NotificationsSourceAttackPath class.
     */
    public NotificationsSourceAttackPath() {
    }

    /**
     * Get the minimalRiskLevel property: Defines the minimal attach path risk level which will be sent as email
     * notifications.
     * 
     * @return the minimalRiskLevel value.
     */
    public MinimalRiskLevel minimalRiskLevel() {
        return this.minimalRiskLevel;
    }

    /**
     * Set the minimalRiskLevel property: Defines the minimal attach path risk level which will be sent as email
     * notifications.
     * 
     * @param minimalRiskLevel the minimalRiskLevel value to set.
     * @return the NotificationsSourceAttackPath object itself.
     */
    public NotificationsSourceAttackPath withMinimalRiskLevel(MinimalRiskLevel minimalRiskLevel) {
        this.minimalRiskLevel = minimalRiskLevel;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
