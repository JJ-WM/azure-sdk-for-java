// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.resourcemanager.dataprotection.fluent.models.FeatureValidationResponseBaseInner;

/**
 * An immutable client-side representation of FeatureValidationResponseBase.
 */
public interface FeatureValidationResponseBase {
    /**
     * Gets the objectType property: Type of the specific object - used for deserializing.
     * 
     * @return the objectType value.
     */
    String objectType();

    /**
     * Gets the inner com.azure.resourcemanager.dataprotection.fluent.models.FeatureValidationResponseBaseInner object.
     * 
     * @return the inner object.
     */
    FeatureValidationResponseBaseInner innerModel();
}
