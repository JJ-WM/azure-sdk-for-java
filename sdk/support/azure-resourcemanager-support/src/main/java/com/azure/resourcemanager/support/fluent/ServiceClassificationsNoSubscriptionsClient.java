// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.support.fluent.models.ServiceClassificationOutputInner;
import com.azure.resourcemanager.support.models.ServiceClassificationRequest;

/**
 * An instance of this class provides access to all the operations defined in
 * ServiceClassificationsNoSubscriptionsClient.
 */
public interface ServiceClassificationsNoSubscriptionsClient {
    /**
     * Classify the list of right Azure services.
     * 
     * @param serviceClassificationRequest Input to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the service classification API along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServiceClassificationOutputInner>
        classifyServicesWithResponse(ServiceClassificationRequest serviceClassificationRequest, Context context);

    /**
     * Classify the list of right Azure services.
     * 
     * @param serviceClassificationRequest Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the service classification API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServiceClassificationOutputInner classifyServices(ServiceClassificationRequest serviceClassificationRequest);
}
