// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes an upgrade policy - automatic, manual, or rolling.
 */
@Fluent
public final class UpgradePolicy {
    /*
     * Specifies the mode of an upgrade to virtual machines in the scale set.<br /><br /> Possible values are:<br /><br
     * /> **Manual** - You control the application of updates to virtual machines in the scale set. You do this by
     * using the manualUpgrade action.<br /><br /> **Automatic** - All virtual machines in the scale set are
     * automatically updated at the same time.<br /><br /> **Rolling** - Scale set performs updates in batches with an
     * optional pause time in between.
     */
    @JsonProperty(value = "mode", required = true)
    private UpgradeMode mode;

    /*
     * The configuration parameters used for performing automatic OS upgrade.
     */
    @JsonProperty(value = "automaticOSUpgradePolicy")
    private AutomaticOSUpgradePolicy automaticOSUpgradePolicy;

    /*
     * This property is only supported on Pools with the virtualMachineConfiguration property.
     */
    @JsonProperty(value = "rollingUpgradePolicy")
    private RollingUpgradePolicy rollingUpgradePolicy;

    /**
     * Creates an instance of UpgradePolicy class.
     */
    public UpgradePolicy() {
    }

    /**
     * Get the mode property: Specifies the mode of an upgrade to virtual machines in the scale set.&lt;br /&gt;&lt;br
     * /&gt; Possible values are:&lt;br /&gt;&lt;br /&gt; **Manual** - You control the application of updates to
     * virtual machines in the scale set. You do this by using the manualUpgrade action.&lt;br /&gt;&lt;br /&gt;
     * **Automatic** - All virtual machines in the scale set are automatically updated at the same time.&lt;br
     * /&gt;&lt;br /&gt; **Rolling** - Scale set performs updates in batches with an optional pause time in between.
     * 
     * @return the mode value.
     */
    public UpgradeMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: Specifies the mode of an upgrade to virtual machines in the scale set.&lt;br /&gt;&lt;br
     * /&gt; Possible values are:&lt;br /&gt;&lt;br /&gt; **Manual** - You control the application of updates to
     * virtual machines in the scale set. You do this by using the manualUpgrade action.&lt;br /&gt;&lt;br /&gt;
     * **Automatic** - All virtual machines in the scale set are automatically updated at the same time.&lt;br
     * /&gt;&lt;br /&gt; **Rolling** - Scale set performs updates in batches with an optional pause time in between.
     * 
     * @param mode the mode value to set.
     * @return the UpgradePolicy object itself.
     */
    public UpgradePolicy withMode(UpgradeMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the automaticOSUpgradePolicy property: The configuration parameters used for performing automatic OS
     * upgrade.
     * 
     * @return the automaticOSUpgradePolicy value.
     */
    public AutomaticOSUpgradePolicy automaticOSUpgradePolicy() {
        return this.automaticOSUpgradePolicy;
    }

    /**
     * Set the automaticOSUpgradePolicy property: The configuration parameters used for performing automatic OS
     * upgrade.
     * 
     * @param automaticOSUpgradePolicy the automaticOSUpgradePolicy value to set.
     * @return the UpgradePolicy object itself.
     */
    public UpgradePolicy withAutomaticOSUpgradePolicy(AutomaticOSUpgradePolicy automaticOSUpgradePolicy) {
        this.automaticOSUpgradePolicy = automaticOSUpgradePolicy;
        return this;
    }

    /**
     * Get the rollingUpgradePolicy property: This property is only supported on Pools with the
     * virtualMachineConfiguration property.
     * 
     * @return the rollingUpgradePolicy value.
     */
    public RollingUpgradePolicy rollingUpgradePolicy() {
        return this.rollingUpgradePolicy;
    }

    /**
     * Set the rollingUpgradePolicy property: This property is only supported on Pools with the
     * virtualMachineConfiguration property.
     * 
     * @param rollingUpgradePolicy the rollingUpgradePolicy value to set.
     * @return the UpgradePolicy object itself.
     */
    public UpgradePolicy withRollingUpgradePolicy(RollingUpgradePolicy rollingUpgradePolicy) {
        this.rollingUpgradePolicy = rollingUpgradePolicy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (mode() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property mode in model UpgradePolicy"));
        }
        if (automaticOSUpgradePolicy() != null) {
            automaticOSUpgradePolicy().validate();
        }
        if (rollingUpgradePolicy() != null) {
            rollingUpgradePolicy().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UpgradePolicy.class);
}
