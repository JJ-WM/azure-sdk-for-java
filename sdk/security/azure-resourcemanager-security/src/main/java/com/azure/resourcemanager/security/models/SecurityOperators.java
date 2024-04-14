// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of SecurityOperators.
 */
public interface SecurityOperators {
    /**
     * Lists Microsoft Defender for Cloud securityOperators in the subscription.
     * 
     * @param pricingName name of the pricing configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SecurityOperator response along with {@link Response}.
     */
    Response<SecurityOperatorList> listWithResponse(String pricingName, Context context);

    /**
     * Lists Microsoft Defender for Cloud securityOperators in the subscription.
     * 
     * @param pricingName name of the pricing configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SecurityOperator response.
     */
    SecurityOperatorList list(String pricingName);

    /**
     * Get a specific security operator for the requested scope.
     * 
     * @param pricingName name of the pricing configuration.
     * @param securityOperatorName name of the securityOperator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific security operator for the requested scope along with {@link Response}.
     */
    Response<SecurityOperator> getWithResponse(String pricingName, String securityOperatorName, Context context);

    /**
     * Get a specific security operator for the requested scope.
     * 
     * @param pricingName name of the pricing configuration.
     * @param securityOperatorName name of the securityOperator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific security operator for the requested scope.
     */
    SecurityOperator get(String pricingName, String securityOperatorName);

    /**
     * Creates Microsoft Defender for Cloud security operator on the given scope.
     * 
     * @param pricingName name of the pricing configuration.
     * @param securityOperatorName name of the securityOperator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security operator under a given subscription and pricing along with {@link Response}.
     */
    Response<SecurityOperator> createOrUpdateWithResponse(String pricingName, String securityOperatorName,
        Context context);

    /**
     * Creates Microsoft Defender for Cloud security operator on the given scope.
     * 
     * @param pricingName name of the pricing configuration.
     * @param securityOperatorName name of the securityOperator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security operator under a given subscription and pricing.
     */
    SecurityOperator createOrUpdate(String pricingName, String securityOperatorName);

    /**
     * Delete Microsoft Defender for Cloud securityOperator in the subscription.
     * 
     * @param pricingName name of the pricing configuration.
     * @param securityOperatorName name of the securityOperator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String pricingName, String securityOperatorName, Context context);

    /**
     * Delete Microsoft Defender for Cloud securityOperator in the subscription.
     * 
     * @param pricingName name of the pricing configuration.
     * @param securityOperatorName name of the securityOperator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String pricingName, String securityOperatorName);
}
