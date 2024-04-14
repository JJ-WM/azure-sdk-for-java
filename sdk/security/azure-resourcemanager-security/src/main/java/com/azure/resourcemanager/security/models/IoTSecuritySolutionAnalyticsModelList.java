// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionAnalyticsModelListInner;
import java.util.List;

/**
 * An immutable client-side representation of IoTSecuritySolutionAnalyticsModelList.
 */
public interface IoTSecuritySolutionAnalyticsModelList {
    /**
     * Gets the value property: List of Security analytics of your IoT Security solution.
     * 
     * @return the value value.
     */
    List<IoTSecuritySolutionAnalyticsModel> value();

    /**
     * Gets the nextLink property: When there is too much alert data for one page, use this URI to fetch the next page.
     * 
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionAnalyticsModelListInner
     * object.
     * 
     * @return the inner object.
     */
    IoTSecuritySolutionAnalyticsModelListInner innerModel();
}
