// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The role type.
 */
public final class KeyVaultRoleType extends ExpandableStringEnum<KeyVaultRoleType> {
    /**
     * Built in role.
     */
    public static final KeyVaultRoleType BUILT_IN_ROLE = fromString("AKVBuiltInRole");

    /**
     * Custom role.
     */
    public static final KeyVaultRoleType CUSTOM_ROLE = fromString("CustomRole");

    /**
     * Creates a new instance of KeyVaultRoleType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public KeyVaultRoleType() {
    }

    /**
     * Creates or finds a KeyVaultRoleType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding KeyVaultRoleType.
     */
    public static KeyVaultRoleType fromString(String name) {
        return fromString(name, KeyVaultRoleType.class);
    }

    /**
     * Gets known KeyVaultRoleType values.
     * 
     * @return known KeyVaultRoleType values.
     */
    public static Collection<KeyVaultRoleType> values() {
        return values(KeyVaultRoleType.class);
    }
}
