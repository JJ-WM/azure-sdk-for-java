// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.mobilenetwork.fluent.models.AsyncOperationStatusInner;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCaptureInner;

/** An instance of this class provides access to all the operations defined in PacketCapturesClient. */
public interface PacketCapturesClient {
    /**
     * Creates or updates a packet capture.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCaptureName The name of the packet capture session.
     * @param parameters Parameters supplied to the create or update packet capture operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of packet capture session resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PacketCaptureInner>, PacketCaptureInner> beginCreateOrUpdate(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        String packetCaptureName,
        PacketCaptureInner parameters);

    /**
     * Creates or updates a packet capture.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCaptureName The name of the packet capture session.
     * @param parameters Parameters supplied to the create or update packet capture operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of packet capture session resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PacketCaptureInner>, PacketCaptureInner> beginCreateOrUpdate(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        String packetCaptureName,
        PacketCaptureInner parameters,
        Context context);

    /**
     * Creates or updates a packet capture.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCaptureName The name of the packet capture session.
     * @param parameters Parameters supplied to the create or update packet capture operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return packet capture session resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PacketCaptureInner createOrUpdate(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        String packetCaptureName,
        PacketCaptureInner parameters);

    /**
     * Creates or updates a packet capture.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCaptureName The name of the packet capture session.
     * @param parameters Parameters supplied to the create or update packet capture operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return packet capture session resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PacketCaptureInner createOrUpdate(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        String packetCaptureName,
        PacketCaptureInner parameters,
        Context context);

    /**
     * Gets information about the specified packet capture session.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCaptureName The name of the packet capture session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified packet capture session along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PacketCaptureInner> getWithResponse(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCaptureName, Context context);

    /**
     * Gets information about the specified packet capture session.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCaptureName The name of the packet capture session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified packet capture session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PacketCaptureInner get(String resourceGroupName, String packetCoreControlPlaneName, String packetCaptureName);

    /**
     * Deletes the specified packet capture.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCaptureName The name of the packet capture session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCaptureName);

    /**
     * Deletes the specified packet capture.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCaptureName The name of the packet capture session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCaptureName, Context context);

    /**
     * Deletes the specified packet capture.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCaptureName The name of the packet capture session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String packetCoreControlPlaneName, String packetCaptureName);

    /**
     * Deletes the specified packet capture.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCaptureName The name of the packet capture session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String packetCoreControlPlaneName, String packetCaptureName, Context context);

    /**
     * Stop a packet capture session.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCaptureName The name of the packet capture session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AsyncOperationStatusInner>, AsyncOperationStatusInner> beginStop(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCaptureName);

    /**
     * Stop a packet capture session.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCaptureName The name of the packet capture session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AsyncOperationStatusInner>, AsyncOperationStatusInner> beginStop(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCaptureName, Context context);

    /**
     * Stop a packet capture session.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCaptureName The name of the packet capture session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AsyncOperationStatusInner stop(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCaptureName);

    /**
     * Stop a packet capture session.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCaptureName The name of the packet capture session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AsyncOperationStatusInner stop(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCaptureName, Context context);

    /**
     * Lists all the packet capture sessions under a packet core control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet capture API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PacketCaptureInner> listByPacketCoreControlPlane(
        String resourceGroupName, String packetCoreControlPlaneName);

    /**
     * Lists all the packet capture sessions under a packet core control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet capture API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PacketCaptureInner> listByPacketCoreControlPlane(
        String resourceGroupName, String packetCoreControlPlaneName, Context context);
}
