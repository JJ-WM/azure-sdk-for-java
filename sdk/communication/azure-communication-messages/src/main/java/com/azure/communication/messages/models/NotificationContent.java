// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.messages.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Details of the message to send.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "kind", defaultImpl = NotificationContent.class, visible = true)
@JsonTypeName("NotificationContent")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "text", value = TextNotificationContent.class),
    @JsonSubTypes.Type(name = "image", value = MediaNotificationContent.class),
    @JsonSubTypes.Type(name = "template", value = TemplateNotificationContent.class) })
@Immutable
public abstract class NotificationContent {

    /*
     * The Channel Registration ID for the Business Identifier.
     */
    @Generated
    @JsonProperty(value = "channelRegistrationId")
    private final String channelRegistrationId;

    /*
     * The native external platform user identifiers of the recipient.
     */
    @Generated
    @JsonProperty(value = "to")
    private final List<String> to;

    /**
     * Creates an instance of NotificationContent class.
     *
     * @param channelRegistrationId the channelRegistrationId value to set.
     * @param to the to value to set.
     */
    @Generated
    @JsonCreator
    protected NotificationContent(@JsonProperty(value = "channelRegistrationId") String channelRegistrationId,
        @JsonProperty(value = "to") List<String> to) {
        this.channelRegistrationId = channelRegistrationId;
        this.to = to;
    }

    /**
     * Get the channelRegistrationId property: The Channel Registration ID for the Business Identifier.
     *
     * @return the channelRegistrationId value.
     */
    @Generated
    public String getChannelRegistrationId() {
        return this.channelRegistrationId;
    }

    /**
     * Get the to property: The native external platform user identifiers of the recipient.
     *
     * @return the to value.
     */
    @Generated
    public List<String> getTo() {
        return this.to;
    }

    /*
     * The type discriminator describing a notification type.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "kind")
    private CommunicationMessageKind kind = CommunicationMessageKind.fromString("NotificationContent");

    /**
     * Get the kind property: The type discriminator describing a notification type.
     *
     * @return the kind value.
     */
    @Generated
    public CommunicationMessageKind getKind() {
        return this.kind;
    }
}
