// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.largeinstance.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Enum of the hardware options (vendor and/or their product name) for an Azure Large Instance.
 */
public final class AzureLargeInstanceHardwareTypeNamesEnum
    extends ExpandableStringEnum<AzureLargeInstanceHardwareTypeNamesEnum> {
    /**
     * Static value Cisco_UCS for AzureLargeInstanceHardwareTypeNamesEnum.
     */
    public static final AzureLargeInstanceHardwareTypeNamesEnum CISCO_UCS = fromString("Cisco_UCS");

    /**
     * Static value HPE for AzureLargeInstanceHardwareTypeNamesEnum.
     */
    public static final AzureLargeInstanceHardwareTypeNamesEnum HPE = fromString("HPE");

    /**
     * Static value SDFLEX for AzureLargeInstanceHardwareTypeNamesEnum.
     */
    public static final AzureLargeInstanceHardwareTypeNamesEnum SDFLEX = fromString("SDFLEX");

    /**
     * Creates a new instance of AzureLargeInstanceHardwareTypeNamesEnum value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AzureLargeInstanceHardwareTypeNamesEnum() {
    }

    /**
     * Creates or finds a AzureLargeInstanceHardwareTypeNamesEnum from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AzureLargeInstanceHardwareTypeNamesEnum.
     */
    @JsonCreator
    public static AzureLargeInstanceHardwareTypeNamesEnum fromString(String name) {
        return fromString(name, AzureLargeInstanceHardwareTypeNamesEnum.class);
    }

    /**
     * Gets known AzureLargeInstanceHardwareTypeNamesEnum values.
     * 
     * @return known AzureLargeInstanceHardwareTypeNamesEnum values.
     */
    public static Collection<AzureLargeInstanceHardwareTypeNamesEnum> values() {
        return values(AzureLargeInstanceHardwareTypeNamesEnum.class);
    }
}
