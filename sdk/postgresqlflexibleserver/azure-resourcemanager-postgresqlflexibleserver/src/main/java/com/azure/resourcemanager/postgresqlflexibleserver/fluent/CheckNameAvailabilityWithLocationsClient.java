// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CheckNameAvailabilityRequest;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in CheckNameAvailabilityWithLocationsClient.
 */
public interface CheckNameAvailabilityWithLocationsClient {
    /**
     * Check the availability of name for resource.
     *
     * @param locationName The name of the location.
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a resource name availability along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<NameAvailabilityInner>> executeWithResponseAsync(
        String locationName, CheckNameAvailabilityRequest nameAvailabilityRequest);

    /**
     * Check the availability of name for resource.
     *
     * @param locationName The name of the location.
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a resource name availability on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NameAvailabilityInner> executeAsync(String locationName, CheckNameAvailabilityRequest nameAvailabilityRequest);

    /**
     * Check the availability of name for resource.
     *
     * @param locationName The name of the location.
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a resource name availability along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NameAvailabilityInner> executeWithResponse(
        String locationName, CheckNameAvailabilityRequest nameAvailabilityRequest, Context context);

    /**
     * Check the availability of name for resource.
     *
     * @param locationName The name of the location.
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a resource name availability.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NameAvailabilityInner execute(String locationName, CheckNameAvailabilityRequest nameAvailabilityRequest);
}
