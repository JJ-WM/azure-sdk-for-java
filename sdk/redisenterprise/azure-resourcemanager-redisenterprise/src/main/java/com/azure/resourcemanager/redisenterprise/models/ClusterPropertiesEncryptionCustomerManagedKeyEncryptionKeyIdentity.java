// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All identity configuration for Customer-managed key settings defining which identity should be used to auth to Key
 * Vault.
 */
@Fluent
public final class ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity {
    /*
     * User assigned identity to use for accessing key encryption key Url. Ex: /subscriptions/<sub
     * uuid>/resourceGroups/<resource group>/providers/Microsoft.ManagedIdentity/userAssignedIdentities/myId.
     */
    @JsonProperty(value = "userAssignedIdentityResourceId")
    private String userAssignedIdentityResourceId;

    /*
     * Only userAssignedIdentity is supported in this API version; other types may be supported in the future
     */
    @JsonProperty(value = "identityType")
    private CmkIdentityType identityType;

    /**
     * Creates an instance of ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity class.
     */
    public ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity() {
    }

    /**
     * Get the userAssignedIdentityResourceId property: User assigned identity to use for accessing key encryption key
     * Url. Ex: /subscriptions/&lt;sub uuid&gt;/resourceGroups/&lt;resource
     * group&gt;/providers/Microsoft.ManagedIdentity/userAssignedIdentities/myId.
     * 
     * @return the userAssignedIdentityResourceId value.
     */
    public String userAssignedIdentityResourceId() {
        return this.userAssignedIdentityResourceId;
    }

    /**
     * Set the userAssignedIdentityResourceId property: User assigned identity to use for accessing key encryption key
     * Url. Ex: /subscriptions/&lt;sub uuid&gt;/resourceGroups/&lt;resource
     * group&gt;/providers/Microsoft.ManagedIdentity/userAssignedIdentities/myId.
     * 
     * @param userAssignedIdentityResourceId the userAssignedIdentityResourceId value to set.
     * @return the ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity object itself.
     */
    public ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity
        withUserAssignedIdentityResourceId(String userAssignedIdentityResourceId) {
        this.userAssignedIdentityResourceId = userAssignedIdentityResourceId;
        return this;
    }

    /**
     * Get the identityType property: Only userAssignedIdentity is supported in this API version; other types may be
     * supported in the future.
     * 
     * @return the identityType value.
     */
    public CmkIdentityType identityType() {
        return this.identityType;
    }

    /**
     * Set the identityType property: Only userAssignedIdentity is supported in this API version; other types may be
     * supported in the future.
     * 
     * @param identityType the identityType value to set.
     * @return the ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity object itself.
     */
    public ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity
        withIdentityType(CmkIdentityType identityType) {
        this.identityType = identityType;
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
