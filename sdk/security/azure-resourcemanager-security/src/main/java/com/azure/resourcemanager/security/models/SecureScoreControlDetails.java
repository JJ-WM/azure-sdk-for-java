// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.resourcemanager.security.fluent.models.SecureScoreControlDetailsInner;

/**
 * An immutable client-side representation of SecureScoreControlDetails.
 */
public interface SecureScoreControlDetails {
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
     * Gets the displayName property: User friendly display name of the control.
     * 
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the healthyResourceCount property: Number of healthy resources in the control.
     * 
     * @return the healthyResourceCount value.
     */
    Integer healthyResourceCount();

    /**
     * Gets the unhealthyResourceCount property: Number of unhealthy resources in the control.
     * 
     * @return the unhealthyResourceCount value.
     */
    Integer unhealthyResourceCount();

    /**
     * Gets the notApplicableResourceCount property: Number of not applicable resources in the control.
     * 
     * @return the notApplicableResourceCount value.
     */
    Integer notApplicableResourceCount();

    /**
     * Gets the weight property: The relative weight for this specific control in each of your subscriptions. Used when
     * calculating an aggregated score for this control across all of your subscriptions.
     * 
     * @return the weight value.
     */
    Long weight();

    /**
     * Gets the definition property: Information about the security control.
     * 
     * @return the definition value.
     */
    SecureScoreControlDefinitionItem definition();

    /**
     * Gets the max property: Maximum score available.
     * 
     * @return the max value.
     */
    Integer max();

    /**
     * Gets the current property: Current score.
     * 
     * @return the current value.
     */
    Double current();

    /**
     * Gets the percentage property: Ratio of the current score divided by the maximum. Rounded to 4 digits after the
     * decimal point.
     * 
     * @return the percentage value.
     */
    Double percentage();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.SecureScoreControlDetailsInner object.
     * 
     * @return the inner object.
     */
    SecureScoreControlDetailsInner innerModel();
}
