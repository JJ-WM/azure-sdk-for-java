// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * cross metrics operator
 * 
 * should be specified when setting up multiple metric alerting configurations.
 */
public final class AnomalyAlertingConfigurationLogicType
    extends ExpandableStringEnum<AnomalyAlertingConfigurationLogicType> {
    /**
     * Static value AND for AnomalyAlertingConfigurationLogicType.
     */
    public static final AnomalyAlertingConfigurationLogicType AND = fromString("AND");

    /**
     * Static value OR for AnomalyAlertingConfigurationLogicType.
     */
    public static final AnomalyAlertingConfigurationLogicType OR = fromString("OR");

    /**
     * Static value XOR for AnomalyAlertingConfigurationLogicType.
     */
    public static final AnomalyAlertingConfigurationLogicType XOR = fromString("XOR");

    /**
     * Creates a new instance of AnomalyAlertingConfigurationLogicType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AnomalyAlertingConfigurationLogicType() {
    }

    /**
     * Creates or finds a AnomalyAlertingConfigurationLogicType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AnomalyAlertingConfigurationLogicType.
     */
    public static AnomalyAlertingConfigurationLogicType fromString(String name) {
        return fromString(name, AnomalyAlertingConfigurationLogicType.class);
    }

    /**
     * Gets known AnomalyAlertingConfigurationLogicType values.
     * 
     * @return known AnomalyAlertingConfigurationLogicType values.
     */
    public static Collection<AnomalyAlertingConfigurationLogicType> values() {
        return values(AnomalyAlertingConfigurationLogicType.class);
    }
}
