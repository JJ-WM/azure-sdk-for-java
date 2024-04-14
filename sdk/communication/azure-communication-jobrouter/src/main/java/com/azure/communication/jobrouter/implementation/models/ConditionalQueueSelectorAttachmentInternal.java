// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.communication.jobrouter.models.QueueSelectorAttachmentKind;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Describes a set of queue selectors that will be attached if the given condition resolves to true.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "kind",
    defaultImpl = ConditionalQueueSelectorAttachmentInternal.class,
    visible = true)
@JsonTypeName("conditional")
@Immutable
public final class ConditionalQueueSelectorAttachmentInternal extends QueueSelectorAttachmentInternal {

    /*
     * The condition that must be true for the queue selectors to be attached.
     */
    @Generated
    @JsonProperty(value = "condition")
    private final RouterRuleInternal condition;

    /*
     * The queue selectors to attach.
     */
    @Generated
    @JsonProperty(value = "queueSelectors")
    private final List<RouterQueueSelectorInternal> queueSelectors;

    /**
     * Creates an instance of ConditionalQueueSelectorAttachmentInternal class.
     *
     * @param condition the condition value to set.
     * @param queueSelectors the queueSelectors value to set.
     */
    @Generated
    @JsonCreator
    public ConditionalQueueSelectorAttachmentInternal(@JsonProperty(value = "condition") RouterRuleInternal condition,
        @JsonProperty(value = "queueSelectors") List<RouterQueueSelectorInternal> queueSelectors) {
        this.condition = condition;
        this.queueSelectors = queueSelectors;
    }

    /**
     * Get the condition property: The condition that must be true for the queue selectors to be attached.
     *
     * @return the condition value.
     */
    @Generated
    public RouterRuleInternal getCondition() {
        return this.condition;
    }

    /**
     * Get the queueSelectors property: The queue selectors to attach.
     *
     * @return the queueSelectors value.
     */
    @Generated
    public List<RouterQueueSelectorInternal> getQueueSelectors() {
        return this.queueSelectors;
    }

    /*
     * The type discriminator describing a sub-type of QueueSelectorAttachment.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "kind")
    private QueueSelectorAttachmentKind kind = QueueSelectorAttachmentKind.CONDITIONAL;

    /**
     * Get the kind property: The type discriminator describing a sub-type of QueueSelectorAttachment.
     *
     * @return the kind value.
     */
    @Generated
    @Override
    public QueueSelectorAttachmentKind getKind() {
        return this.kind;
    }
}
