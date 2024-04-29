// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Describes the Machine Extension Upgrade Properties.
 */
@Fluent
public final class MachineExtensionUpgrade {
    /*
     * Describes the Extension Target Properties.
     */
    @JsonProperty(value = "extensionTargets")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, ExtensionTargetProperties> extensionTargets;

    /**
     * Creates an instance of MachineExtensionUpgrade class.
     */
    public MachineExtensionUpgrade() {
    }

    /**
     * Get the extensionTargets property: Describes the Extension Target Properties.
     * 
     * @return the extensionTargets value.
     */
    public Map<String, ExtensionTargetProperties> extensionTargets() {
        return this.extensionTargets;
    }

    /**
     * Set the extensionTargets property: Describes the Extension Target Properties.
     * 
     * @param extensionTargets the extensionTargets value to set.
     * @return the MachineExtensionUpgrade object itself.
     */
    public MachineExtensionUpgrade withExtensionTargets(Map<String, ExtensionTargetProperties> extensionTargets) {
        this.extensionTargets = extensionTargets;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extensionTargets() != null) {
            extensionTargets().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }
}
