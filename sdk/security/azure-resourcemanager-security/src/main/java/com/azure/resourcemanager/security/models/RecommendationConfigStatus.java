// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Recommendation status. When the recommendation status is disabled recommendations are not generated.
 */
public final class RecommendationConfigStatus extends ExpandableStringEnum<RecommendationConfigStatus> {
    /**
     * Static value Disabled for RecommendationConfigStatus.
     */
    public static final RecommendationConfigStatus DISABLED = fromString("Disabled");

    /**
     * Static value Enabled for RecommendationConfigStatus.
     */
    public static final RecommendationConfigStatus ENABLED = fromString("Enabled");

    /**
     * Creates a new instance of RecommendationConfigStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RecommendationConfigStatus() {
    }

    /**
     * Creates or finds a RecommendationConfigStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RecommendationConfigStatus.
     */
    @JsonCreator
    public static RecommendationConfigStatus fromString(String name) {
        return fromString(name, RecommendationConfigStatus.class);
    }

    /**
     * Gets known RecommendationConfigStatus values.
     * 
     * @return known RecommendationConfigStatus values.
     */
    public static Collection<RecommendationConfigStatus> values() {
        return values(RecommendationConfigStatus.class);
    }
}
