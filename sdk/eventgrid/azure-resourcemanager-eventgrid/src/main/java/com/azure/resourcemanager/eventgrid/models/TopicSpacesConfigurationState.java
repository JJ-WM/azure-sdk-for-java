// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Indicate if Topic Spaces Configuration is enabled for the namespace. Default is Disabled.
 */
public final class TopicSpacesConfigurationState extends ExpandableStringEnum<TopicSpacesConfigurationState> {
    /**
     * Static value Disabled for TopicSpacesConfigurationState.
     */
    public static final TopicSpacesConfigurationState DISABLED = fromString("Disabled");

    /**
     * Static value Enabled for TopicSpacesConfigurationState.
     */
    public static final TopicSpacesConfigurationState ENABLED = fromString("Enabled");

    /**
     * Creates a new instance of TopicSpacesConfigurationState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TopicSpacesConfigurationState() {
    }

    /**
     * Creates or finds a TopicSpacesConfigurationState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TopicSpacesConfigurationState.
     */
    @JsonCreator
    public static TopicSpacesConfigurationState fromString(String name) {
        return fromString(name, TopicSpacesConfigurationState.class);
    }

    /**
     * Gets known TopicSpacesConfigurationState values.
     * 
     * @return known TopicSpacesConfigurationState values.
     */
    public static Collection<TopicSpacesConfigurationState> values() {
        return values(TopicSpacesConfigurationState.class);
    }
}
