// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mobilenetwork.fluent.models.ExtendedUeInfoInner;

/**
 * An instance of this class provides access to all the operations defined in ExtendedUeInformationsClient.
 */
public interface ExtendedUeInformationsClient {
    /**
     * Gets extended information about the specified UE from the packet core.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param ueId IMSI of a UE.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extended information about the specified UE from the packet core along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExtendedUeInfoInner> getWithResponse(String resourceGroupName, String packetCoreControlPlaneName,
        String ueId, Context context);

    /**
     * Gets extended information about the specified UE from the packet core.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param ueId IMSI of a UE.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extended information about the specified UE from the packet core.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExtendedUeInfoInner get(String resourceGroupName, String packetCoreControlPlaneName, String ueId);
}
