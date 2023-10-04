// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.apimanagement.models.RegistrationDelegationSettingsProperties;
import com.azure.resourcemanager.apimanagement.models.SubscriptionsDelegationSettingsProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Delegation settings for a developer portal. */
@Fluent
public final class PortalDelegationSettingsInner extends ProxyResource {
    /*
     * Delegation settings contract properties.
     */
    @JsonProperty(value = "properties")
    private PortalDelegationSettingsProperties innerProperties;

    /** Creates an instance of PortalDelegationSettingsInner class. */
    public PortalDelegationSettingsInner() {
    }

    /**
     * Get the innerProperties property: Delegation settings contract properties.
     *
     * @return the innerProperties value.
     */
    private PortalDelegationSettingsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the url property: A delegation Url.
     *
     * @return the url value.
     */
    public String url() {
        return this.innerProperties() == null ? null : this.innerProperties().url();
    }

    /**
     * Set the url property: A delegation Url.
     *
     * @param url the url value to set.
     * @return the PortalDelegationSettingsInner object itself.
     */
    public PortalDelegationSettingsInner withUrl(String url) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PortalDelegationSettingsProperties();
        }
        this.innerProperties().withUrl(url);
        return this;
    }

    /**
     * Get the validationKey property: A base64-encoded validation key to validate, that a request is coming from Azure
     * API Management.
     *
     * @return the validationKey value.
     */
    public String validationKey() {
        return this.innerProperties() == null ? null : this.innerProperties().validationKey();
    }

    /**
     * Set the validationKey property: A base64-encoded validation key to validate, that a request is coming from Azure
     * API Management.
     *
     * @param validationKey the validationKey value to set.
     * @return the PortalDelegationSettingsInner object itself.
     */
    public PortalDelegationSettingsInner withValidationKey(String validationKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PortalDelegationSettingsProperties();
        }
        this.innerProperties().withValidationKey(validationKey);
        return this;
    }

    /**
     * Get the subscriptions property: Subscriptions delegation settings.
     *
     * @return the subscriptions value.
     */
    public SubscriptionsDelegationSettingsProperties subscriptions() {
        return this.innerProperties() == null ? null : this.innerProperties().subscriptions();
    }

    /**
     * Set the subscriptions property: Subscriptions delegation settings.
     *
     * @param subscriptions the subscriptions value to set.
     * @return the PortalDelegationSettingsInner object itself.
     */
    public PortalDelegationSettingsInner withSubscriptions(SubscriptionsDelegationSettingsProperties subscriptions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PortalDelegationSettingsProperties();
        }
        this.innerProperties().withSubscriptions(subscriptions);
        return this;
    }

    /**
     * Get the userRegistration property: User registration delegation settings.
     *
     * @return the userRegistration value.
     */
    public RegistrationDelegationSettingsProperties userRegistration() {
        return this.innerProperties() == null ? null : this.innerProperties().userRegistration();
    }

    /**
     * Set the userRegistration property: User registration delegation settings.
     *
     * @param userRegistration the userRegistration value to set.
     * @return the PortalDelegationSettingsInner object itself.
     */
    public PortalDelegationSettingsInner withUserRegistration(
        RegistrationDelegationSettingsProperties userRegistration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PortalDelegationSettingsProperties();
        }
        this.innerProperties().withUserRegistration(userRegistration);
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
