// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.messages.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The message template's text value information.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "kind", defaultImpl = MessageTemplateText.class, visible = true)
@JsonTypeName("text")
@Immutable
public final class MessageTemplateText extends MessageTemplateValue {

    /*
     * The text value.
     */
    @Generated
    @JsonProperty(value = "text")
    private final String text;

    /**
     * Creates an instance of MessageTemplateText class.
     *
     * @param refValue the refValue value to set.
     * @param text the text value to set.
     */
    @Generated
    @JsonCreator
    public MessageTemplateText(@JsonProperty(value = "name") String refValue,
        @JsonProperty(value = "text") String text) {
        super(refValue);
        this.text = text;
    }

    /**
     * Get the text property: The text value.
     *
     * @return the text value.
     */
    @Generated
    public String getText() {
        return this.text;
    }

    /*
     * The type discriminator describing a template parameter type.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "kind")
    private MessageTemplateValueKind kind = MessageTemplateValueKind.TEXT;

    /**
     * Get the kind property: The type discriminator describing a template parameter type.
     *
     * @return the kind value.
     */
    @Generated
    @Override
    public MessageTemplateValueKind getKind() {
        return this.kind;
    }
}
