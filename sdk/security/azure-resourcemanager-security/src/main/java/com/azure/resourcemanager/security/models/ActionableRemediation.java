// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Configuration payload for PR Annotations.
 */
@Fluent
public final class ActionableRemediation {
    /*
     * ActionableRemediation Setting.
     * None - the setting was never set.
     * Enabled - ActionableRemediation is enabled.
     * Disabled - ActionableRemediation is disabled.
     */
    @JsonProperty(value = "state")
    private ActionableRemediationState state;

    /*
     * Gets or sets list of categories and severity levels.
     */
    @JsonProperty(value = "categoryConfigurations")
    private List<CategoryConfiguration> categoryConfigurations;

    /*
     * Repository branch configuration for PR Annotations.
     */
    @JsonProperty(value = "branchConfiguration")
    private TargetBranchConfiguration branchConfiguration;

    /*
     * Update Settings.
     * 
     * Enabled - Resource should inherit configurations from parent.
     * Disabled - Resource should not inherit configurations from parent.
     */
    @JsonProperty(value = "inheritFromParentState")
    private InheritFromParentState inheritFromParentState;

    /**
     * Creates an instance of ActionableRemediation class.
     */
    public ActionableRemediation() {
    }

    /**
     * Get the state property: ActionableRemediation Setting.
     * None - the setting was never set.
     * Enabled - ActionableRemediation is enabled.
     * Disabled - ActionableRemediation is disabled.
     * 
     * @return the state value.
     */
    public ActionableRemediationState state() {
        return this.state;
    }

    /**
     * Set the state property: ActionableRemediation Setting.
     * None - the setting was never set.
     * Enabled - ActionableRemediation is enabled.
     * Disabled - ActionableRemediation is disabled.
     * 
     * @param state the state value to set.
     * @return the ActionableRemediation object itself.
     */
    public ActionableRemediation withState(ActionableRemediationState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the categoryConfigurations property: Gets or sets list of categories and severity levels.
     * 
     * @return the categoryConfigurations value.
     */
    public List<CategoryConfiguration> categoryConfigurations() {
        return this.categoryConfigurations;
    }

    /**
     * Set the categoryConfigurations property: Gets or sets list of categories and severity levels.
     * 
     * @param categoryConfigurations the categoryConfigurations value to set.
     * @return the ActionableRemediation object itself.
     */
    public ActionableRemediation withCategoryConfigurations(List<CategoryConfiguration> categoryConfigurations) {
        this.categoryConfigurations = categoryConfigurations;
        return this;
    }

    /**
     * Get the branchConfiguration property: Repository branch configuration for PR Annotations.
     * 
     * @return the branchConfiguration value.
     */
    public TargetBranchConfiguration branchConfiguration() {
        return this.branchConfiguration;
    }

    /**
     * Set the branchConfiguration property: Repository branch configuration for PR Annotations.
     * 
     * @param branchConfiguration the branchConfiguration value to set.
     * @return the ActionableRemediation object itself.
     */
    public ActionableRemediation withBranchConfiguration(TargetBranchConfiguration branchConfiguration) {
        this.branchConfiguration = branchConfiguration;
        return this;
    }

    /**
     * Get the inheritFromParentState property: Update Settings.
     * 
     * Enabled - Resource should inherit configurations from parent.
     * Disabled - Resource should not inherit configurations from parent.
     * 
     * @return the inheritFromParentState value.
     */
    public InheritFromParentState inheritFromParentState() {
        return this.inheritFromParentState;
    }

    /**
     * Set the inheritFromParentState property: Update Settings.
     * 
     * Enabled - Resource should inherit configurations from parent.
     * Disabled - Resource should not inherit configurations from parent.
     * 
     * @param inheritFromParentState the inheritFromParentState value to set.
     * @return the ActionableRemediation object itself.
     */
    public ActionableRemediation withInheritFromParentState(InheritFromParentState inheritFromParentState) {
        this.inheritFromParentState = inheritFromParentState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (categoryConfigurations() != null) {
            categoryConfigurations().forEach(e -> e.validate());
        }
        if (branchConfiguration() != null) {
            branchConfiguration().validate();
        }
    }
}
