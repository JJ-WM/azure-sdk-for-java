// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * A plan's extension properties.
 */
@Fluent
public final class Extension {
    /*
     * The extension name. Supported values are: <br><br>**AgentlessDiscoveryForKubernetes** - API-based discovery of
     * information about Kubernetes cluster architecture, workload objects, and setup. Required for Kubernetes
     * inventory, identity and network exposure detection, attack path analysis and risk hunting as part of the cloud
     * security explorer.
     * Available for CloudPosture plan.<br><br>**OnUploadMalwareScanning** - Limits the GB to be scanned per month for
     * each storage account within the subscription. Once this limit reached on a given storage account, Blobs won't be
     * scanned during current calendar month.
     * Available for StorageAccounts plan.<br><br>**SensitiveDataDiscovery** - Sensitive data discovery identifies Blob
     * storage container with sensitive data such as credentials, credit cards, and more, to help prioritize and
     * investigate security events.
     * Available for StorageAccounts and CloudPosture plans.<br><br>**ContainerRegistriesVulnerabilityAssessments** -
     * Provides vulnerability management for images stored in your container registries.
     * Available for CloudPosture and Containers plans.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Indicates whether the extension is enabled.
     */
    @JsonProperty(value = "isEnabled", required = true)
    private IsEnabled isEnabled;

    /*
     * Property values associated with the extension.
     */
    @JsonProperty(value = "additionalExtensionProperties")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> additionalExtensionProperties;

    /*
     * Optional. A status describing the success/failure of the extension's enablement/disablement operation.
     */
    @JsonProperty(value = "operationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private OperationStatusAutoGenerated operationStatus;

    /**
     * Creates an instance of Extension class.
     */
    public Extension() {
    }

    /**
     * Get the name property: The extension name. Supported values are:
     * &lt;br&gt;&lt;br&gt;**AgentlessDiscoveryForKubernetes** - API-based discovery of information about Kubernetes
     * cluster architecture, workload objects, and setup. Required for Kubernetes inventory, identity and network
     * exposure detection, attack path analysis and risk hunting as part of the cloud security explorer.
     * Available for CloudPosture plan.&lt;br&gt;&lt;br&gt;**OnUploadMalwareScanning** - Limits the GB to be scanned
     * per month for each storage account within the subscription. Once this limit reached on a given storage account,
     * Blobs won't be scanned during current calendar month.
     * Available for StorageAccounts plan.&lt;br&gt;&lt;br&gt;**SensitiveDataDiscovery** - Sensitive data discovery
     * identifies Blob storage container with sensitive data such as credentials, credit cards, and more, to help
     * prioritize and investigate security events.
     * Available for StorageAccounts and CloudPosture
     * plans.&lt;br&gt;&lt;br&gt;**ContainerRegistriesVulnerabilityAssessments** - Provides vulnerability management
     * for images stored in your container registries.
     * Available for CloudPosture and Containers plans.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The extension name. Supported values are:
     * &lt;br&gt;&lt;br&gt;**AgentlessDiscoveryForKubernetes** - API-based discovery of information about Kubernetes
     * cluster architecture, workload objects, and setup. Required for Kubernetes inventory, identity and network
     * exposure detection, attack path analysis and risk hunting as part of the cloud security explorer.
     * Available for CloudPosture plan.&lt;br&gt;&lt;br&gt;**OnUploadMalwareScanning** - Limits the GB to be scanned
     * per month for each storage account within the subscription. Once this limit reached on a given storage account,
     * Blobs won't be scanned during current calendar month.
     * Available for StorageAccounts plan.&lt;br&gt;&lt;br&gt;**SensitiveDataDiscovery** - Sensitive data discovery
     * identifies Blob storage container with sensitive data such as credentials, credit cards, and more, to help
     * prioritize and investigate security events.
     * Available for StorageAccounts and CloudPosture
     * plans.&lt;br&gt;&lt;br&gt;**ContainerRegistriesVulnerabilityAssessments** - Provides vulnerability management
     * for images stored in your container registries.
     * Available for CloudPosture and Containers plans.
     * 
     * @param name the name value to set.
     * @return the Extension object itself.
     */
    public Extension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isEnabled property: Indicates whether the extension is enabled.
     * 
     * @return the isEnabled value.
     */
    public IsEnabled isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Indicates whether the extension is enabled.
     * 
     * @param isEnabled the isEnabled value to set.
     * @return the Extension object itself.
     */
    public Extension withIsEnabled(IsEnabled isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the additionalExtensionProperties property: Property values associated with the extension.
     * 
     * @return the additionalExtensionProperties value.
     */
    public Map<String, Object> additionalExtensionProperties() {
        return this.additionalExtensionProperties;
    }

    /**
     * Set the additionalExtensionProperties property: Property values associated with the extension.
     * 
     * @param additionalExtensionProperties the additionalExtensionProperties value to set.
     * @return the Extension object itself.
     */
    public Extension withAdditionalExtensionProperties(Map<String, Object> additionalExtensionProperties) {
        this.additionalExtensionProperties = additionalExtensionProperties;
        return this;
    }

    /**
     * Get the operationStatus property: Optional. A status describing the success/failure of the extension's
     * enablement/disablement operation.
     * 
     * @return the operationStatus value.
     */
    public OperationStatusAutoGenerated operationStatus() {
        return this.operationStatus;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Extension"));
        }
        if (isEnabled() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property isEnabled in model Extension"));
        }
        if (operationStatus() != null) {
            operationStatus().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Extension.class);
}
