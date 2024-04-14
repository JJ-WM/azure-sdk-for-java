// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.support.models.CommunicationDirection;
import com.azure.resourcemanager.support.models.CommunicationType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Object that represents a Communication resource.
 */
@Fluent
public final class CommunicationDetailsInner extends ProxyResource {
    /*
     * Properties of the resource.
     */
    @JsonProperty(value = "properties")
    private CommunicationDetailsProperties innerProperties;

    /**
     * Creates an instance of CommunicationDetailsInner class.
     */
    public CommunicationDetailsInner() {
    }

    /**
     * Get the innerProperties property: Properties of the resource.
     * 
     * @return the innerProperties value.
     */
    private CommunicationDetailsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the communicationType property: Communication type.
     * 
     * @return the communicationType value.
     */
    public CommunicationType communicationType() {
        return this.innerProperties() == null ? null : this.innerProperties().communicationType();
    }

    /**
     * Get the communicationDirection property: Direction of communication.
     * 
     * @return the communicationDirection value.
     */
    public CommunicationDirection communicationDirection() {
        return this.innerProperties() == null ? null : this.innerProperties().communicationDirection();
    }

    /**
     * Get the sender property: Email address of the sender. This property is required if called by a service
     * principal.
     * 
     * @return the sender value.
     */
    public String sender() {
        return this.innerProperties() == null ? null : this.innerProperties().sender();
    }

    /**
     * Set the sender property: Email address of the sender. This property is required if called by a service
     * principal.
     * 
     * @param sender the sender value to set.
     * @return the CommunicationDetailsInner object itself.
     */
    public CommunicationDetailsInner withSender(String sender) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunicationDetailsProperties();
        }
        this.innerProperties().withSender(sender);
        return this;
    }

    /**
     * Get the subject property: Subject of the communication.
     * 
     * @return the subject value.
     */
    public String subject() {
        return this.innerProperties() == null ? null : this.innerProperties().subject();
    }

    /**
     * Set the subject property: Subject of the communication.
     * 
     * @param subject the subject value to set.
     * @return the CommunicationDetailsInner object itself.
     */
    public CommunicationDetailsInner withSubject(String subject) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunicationDetailsProperties();
        }
        this.innerProperties().withSubject(subject);
        return this;
    }

    /**
     * Get the body property: Body of the communication.
     * 
     * @return the body value.
     */
    public String body() {
        return this.innerProperties() == null ? null : this.innerProperties().body();
    }

    /**
     * Set the body property: Body of the communication.
     * 
     * @param body the body value to set.
     * @return the CommunicationDetailsInner object itself.
     */
    public CommunicationDetailsInner withBody(String body) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunicationDetailsProperties();
        }
        this.innerProperties().withBody(body);
        return this;
    }

    /**
     * Get the createdDate property: Time in UTC (ISO 8601 format) when the communication was created.
     * 
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDate();
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
