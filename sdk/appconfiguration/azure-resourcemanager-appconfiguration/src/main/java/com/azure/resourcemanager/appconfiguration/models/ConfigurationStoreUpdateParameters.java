// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appconfiguration.fluent.models.ConfigurationStorePropertiesUpdateParameters;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The parameters for updating a configuration store. */
@Fluent
public final class ConfigurationStoreUpdateParameters {
    /*
     * The properties for updating a configuration store.
     */
    @JsonProperty(value = "properties")
    private ConfigurationStorePropertiesUpdateParameters innerProperties;

    /*
     * The managed identity information for the configuration store.
     */
    @JsonProperty(value = "identity")
    private ResourceIdentity identity;

    /*
     * The SKU of the configuration store.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * The ARM resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of ConfigurationStoreUpdateParameters class. */
    public ConfigurationStoreUpdateParameters() {
    }

    /**
     * Get the innerProperties property: The properties for updating a configuration store.
     *
     * @return the innerProperties value.
     */
    private ConfigurationStorePropertiesUpdateParameters innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The managed identity information for the configuration store.
     *
     * @return the identity value.
     */
    public ResourceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed identity information for the configuration store.
     *
     * @param identity the identity value to set.
     * @return the ConfigurationStoreUpdateParameters object itself.
     */
    public ConfigurationStoreUpdateParameters withIdentity(ResourceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the sku property: The SKU of the configuration store.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the configuration store.
     *
     * @param sku the sku value to set.
     * @return the ConfigurationStoreUpdateParameters object itself.
     */
    public ConfigurationStoreUpdateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the tags property: The ARM resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The ARM resource tags.
     *
     * @param tags the tags value to set.
     * @return the ConfigurationStoreUpdateParameters object itself.
     */
    public ConfigurationStoreUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the encryption property: The encryption settings of the configuration store.
     *
     * @return the encryption value.
     */
    public EncryptionProperties encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: The encryption settings of the configuration store.
     *
     * @param encryption the encryption value to set.
     * @return the ConfigurationStoreUpdateParameters object itself.
     */
    public ConfigurationStoreUpdateParameters withEncryption(EncryptionProperties encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConfigurationStorePropertiesUpdateParameters();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the disableLocalAuth property: Disables all authentication methods other than AAD authentication.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.innerProperties() == null ? null : this.innerProperties().disableLocalAuth();
    }

    /**
     * Set the disableLocalAuth property: Disables all authentication methods other than AAD authentication.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the ConfigurationStoreUpdateParameters object itself.
     */
    public ConfigurationStoreUpdateParameters withDisableLocalAuth(Boolean disableLocalAuth) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConfigurationStorePropertiesUpdateParameters();
        }
        this.innerProperties().withDisableLocalAuth(disableLocalAuth);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Control permission for data plane traffic coming from public networks while
     * private endpoint is enabled.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Control permission for data plane traffic coming from public networks while
     * private endpoint is enabled.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the ConfigurationStoreUpdateParameters object itself.
     */
    public ConfigurationStoreUpdateParameters withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConfigurationStorePropertiesUpdateParameters();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the enablePurgeProtection property: Property specifying whether protection against purge is enabled for this
     * configuration store.
     *
     * @return the enablePurgeProtection value.
     */
    public Boolean enablePurgeProtection() {
        return this.innerProperties() == null ? null : this.innerProperties().enablePurgeProtection();
    }

    /**
     * Set the enablePurgeProtection property: Property specifying whether protection against purge is enabled for this
     * configuration store.
     *
     * @param enablePurgeProtection the enablePurgeProtection value to set.
     * @return the ConfigurationStoreUpdateParameters object itself.
     */
    public ConfigurationStoreUpdateParameters withEnablePurgeProtection(Boolean enablePurgeProtection) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConfigurationStorePropertiesUpdateParameters();
        }
        this.innerProperties().withEnablePurgeProtection(enablePurgeProtection);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
