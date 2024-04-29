// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.devcenter.fluent.models.EnvironmentDefinitionInner;
import java.util.List;

/**
 * An immutable client-side representation of EnvironmentDefinition.
 */
public interface EnvironmentDefinition {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the description property: A short description of the environment definition.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the parameters property: Input parameters passed to an environment.
     * 
     * @return the parameters value.
     */
    List<EnvironmentDefinitionParameter> parameters();

    /**
     * Gets the templatePath property: Path to the Environment Definition entrypoint file.
     * 
     * @return the templatePath value.
     */
    String templatePath();

    /**
     * Gets the validationStatus property: Validation status for the environment definition.
     * 
     * @return the validationStatus value.
     */
    CatalogResourceValidationStatus validationStatus();

    /**
     * Gets the inner com.azure.resourcemanager.devcenter.fluent.models.EnvironmentDefinitionInner object.
     * 
     * @return the inner object.
     */
    EnvironmentDefinitionInner innerModel();
}
