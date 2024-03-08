// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of Skus.
 */
public interface Skus {
    /**
     * Gets a list of available SKUs about the specified streaming job.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of available SKUs about the specified streaming job as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<GetStreamingJobSkuResult> list(String resourceGroupName, String jobName);

    /**
     * Gets a list of available SKUs about the specified streaming job.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of available SKUs about the specified streaming job as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<GetStreamingJobSkuResult> list(String resourceGroupName, String jobName, Context context);
}
