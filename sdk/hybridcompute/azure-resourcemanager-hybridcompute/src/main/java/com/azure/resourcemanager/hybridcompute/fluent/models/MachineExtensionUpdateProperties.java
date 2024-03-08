// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Describes the properties of a Machine Extension. */
@Fluent
public final class MachineExtensionUpdateProperties {
    /*
     * How the extension handler should be forced to update even if the extension configuration has not changed.
     */
    @JsonProperty(value = "forceUpdateTag")
    private String forceUpdateTag;

    /*
     * The name of the extension handler publisher.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /*
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Specifies the version of the script handler.
     */
    @JsonProperty(value = "typeHandlerVersion")
    private String typeHandlerVersion;

    /*
     * Indicates whether the extension should be automatically upgraded by the platform if there is a newer version
     * available.
     */
    @JsonProperty(value = "enableAutomaticUpgrade")
    private Boolean enableAutomaticUpgrade;

    /*
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once
     * deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set
     * to true.
     */
    @JsonProperty(value = "autoUpgradeMinorVersion")
    private Boolean autoUpgradeMinorVersion;

    /*
     * Json formatted public settings for the extension.
     */
    @JsonProperty(value = "settings")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> settings;

    /*
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at
     * all.
     */
    @JsonProperty(value = "protectedSettings")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> protectedSettings;

    /** Creates an instance of MachineExtensionUpdateProperties class. */
    public MachineExtensionUpdateProperties() {
    }

    /**
     * Get the forceUpdateTag property: How the extension handler should be forced to update even if the extension
     * configuration has not changed.
     *
     * @return the forceUpdateTag value.
     */
    public String forceUpdateTag() {
        return this.forceUpdateTag;
    }

    /**
     * Set the forceUpdateTag property: How the extension handler should be forced to update even if the extension
     * configuration has not changed.
     *
     * @param forceUpdateTag the forceUpdateTag value to set.
     * @return the MachineExtensionUpdateProperties object itself.
     */
    public MachineExtensionUpdateProperties withForceUpdateTag(String forceUpdateTag) {
        this.forceUpdateTag = forceUpdateTag;
        return this;
    }

    /**
     * Get the publisher property: The name of the extension handler publisher.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The name of the extension handler publisher.
     *
     * @param publisher the publisher value to set.
     * @return the MachineExtensionUpdateProperties object itself.
     */
    public MachineExtensionUpdateProperties withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @param type the type value to set.
     * @return the MachineExtensionUpdateProperties object itself.
     */
    public MachineExtensionUpdateProperties withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the typeHandlerVersion property: Specifies the version of the script handler.
     *
     * @return the typeHandlerVersion value.
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion property: Specifies the version of the script handler.
     *
     * @param typeHandlerVersion the typeHandlerVersion value to set.
     * @return the MachineExtensionUpdateProperties object itself.
     */
    public MachineExtensionUpdateProperties withTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version available.
     *
     * @return the enableAutomaticUpgrade value.
     */
    public Boolean enableAutomaticUpgrade() {
        return this.enableAutomaticUpgrade;
    }

    /**
     * Set the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version available.
     *
     * @param enableAutomaticUpgrade the enableAutomaticUpgrade value to set.
     * @return the MachineExtensionUpdateProperties object itself.
     */
    public MachineExtensionUpdateProperties withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade) {
        this.enableAutomaticUpgrade = enableAutomaticUpgrade;
        return this;
    }

    /**
     * Get the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     *
     * @return the autoUpgradeMinorVersion value.
     */
    public Boolean autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * Set the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     *
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set.
     * @return the MachineExtensionUpdateProperties object itself.
     */
    public MachineExtensionUpdateProperties withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }

    /**
     * Get the settings property: Json formatted public settings for the extension.
     *
     * @return the settings value.
     */
    public Map<String, Object> settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Json formatted public settings for the extension.
     *
     * @param settings the settings value to set.
     * @return the MachineExtensionUpdateProperties object itself.
     */
    public MachineExtensionUpdateProperties withSettings(Map<String, Object> settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     *
     * @return the protectedSettings value.
     */
    public Map<String, Object> protectedSettings() {
        return this.protectedSettings;
    }

    /**
     * Set the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     *
     * @param protectedSettings the protectedSettings value to set.
     * @return the MachineExtensionUpdateProperties object itself.
     */
    public MachineExtensionUpdateProperties withProtectedSettings(Map<String, Object> protectedSettings) {
        this.protectedSettings = protectedSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
