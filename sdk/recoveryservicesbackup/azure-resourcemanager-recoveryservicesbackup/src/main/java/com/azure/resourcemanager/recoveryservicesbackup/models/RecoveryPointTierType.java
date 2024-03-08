// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Recovery point tier type.
 */
public enum RecoveryPointTierType {
    /**
     * Enum value Invalid.
     */
    INVALID("Invalid"),

    /**
     * Enum value InstantRP.
     */
    INSTANT_RP("InstantRP"),

    /**
     * Enum value HardenedRP.
     */
    HARDENED_RP("HardenedRP"),

    /**
     * Enum value ArchivedRP.
     */
    ARCHIVED_RP("ArchivedRP");

    /**
     * The actual serialized value for a RecoveryPointTierType instance.
     */
    private final String value;

    RecoveryPointTierType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RecoveryPointTierType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed RecoveryPointTierType object, or null if unable to parse.
     */
    @JsonCreator
    public static RecoveryPointTierType fromString(String value) {
        if (value == null) {
            return null;
        }
        RecoveryPointTierType[] items = RecoveryPointTierType.values();
        for (RecoveryPointTierType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
