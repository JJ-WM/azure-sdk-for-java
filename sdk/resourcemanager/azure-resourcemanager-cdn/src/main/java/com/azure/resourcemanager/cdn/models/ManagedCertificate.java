// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;

/**
 * Managed Certificate used for https.
 */
@Fluent
public final class ManagedCertificate extends Certificate {
    /**
     * Creates an instance of ManagedCertificate class.
     */
    public ManagedCertificate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedCertificate withType(SecretType type) {
        super.withType(type);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
