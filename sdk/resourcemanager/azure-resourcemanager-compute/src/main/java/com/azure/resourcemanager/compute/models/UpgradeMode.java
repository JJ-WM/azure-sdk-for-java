// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the mode of an upgrade to virtual machines in the scale set.&lt;br /&gt;&lt;br /&gt; Possible values
 * are:&lt;br /&gt;&lt;br /&gt; **Manual** - You control the application of updates to virtual machines in the scale
 * set. You do this by using the manualUpgrade action.&lt;br /&gt;&lt;br /&gt; **Automatic** - All virtual machines in
 * the scale set are automatically updated at the same time.
 */
public enum UpgradeMode {
    /**
     * Enum value Automatic.
     */
    AUTOMATIC("Automatic"),

    /**
     * Enum value Manual.
     */
    MANUAL("Manual"),

    /**
     * Enum value Rolling.
     */
    ROLLING("Rolling");

    /**
     * The actual serialized value for a UpgradeMode instance.
     */
    private final String value;

    UpgradeMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a UpgradeMode instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed UpgradeMode object, or null if unable to parse.
     */
    @JsonCreator
    public static UpgradeMode fromString(String value) {
        if (value == null) {
            return null;
        }
        UpgradeMode[] items = UpgradeMode.values();
        for (UpgradeMode item : items) {
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
