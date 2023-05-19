// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * This determines if events published to this partner namespace should use the source attribute in the event payload or
 * use the channel name in the header when matching to the partner topic. If none is specified, source attribute routing
 * will be used to match the partner topic.
 */
public final class PartnerTopicRoutingMode extends ExpandableStringEnum<PartnerTopicRoutingMode> {
    /** Static value SourceEventAttribute for PartnerTopicRoutingMode. */
    public static final PartnerTopicRoutingMode SOURCE_EVENT_ATTRIBUTE = fromString("SourceEventAttribute");

    /** Static value ChannelNameHeader for PartnerTopicRoutingMode. */
    public static final PartnerTopicRoutingMode CHANNEL_NAME_HEADER = fromString("ChannelNameHeader");

    /**
     * Creates a new instance of PartnerTopicRoutingMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PartnerTopicRoutingMode() {
    }

    /**
     * Creates or finds a PartnerTopicRoutingMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PartnerTopicRoutingMode.
     */
    @JsonCreator
    public static PartnerTopicRoutingMode fromString(String name) {
        return fromString(name, PartnerTopicRoutingMode.class);
    }

    /**
     * Gets known PartnerTopicRoutingMode values.
     *
     * @return known PartnerTopicRoutingMode values.
     */
    public static Collection<PartnerTopicRoutingMode> values() {
        return values(PartnerTopicRoutingMode.class);
    }
}
