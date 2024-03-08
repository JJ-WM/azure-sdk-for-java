// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.connectedvmware.fluent.models.VirtualMachineInstanceInner;

/** Resource collection API of VirtualMachineInstances. */
public interface VirtualMachineInstances {
    /**
     * Implements virtual machine PUT method.
     *
     * <p>The operation to create or update a virtual machine instance. Please note some properties can be set only
     * during virtual machine instance creation.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachineInstance.
     */
    VirtualMachineInstance createOrUpdate(String resourceUri);

    /**
     * Implements virtual machine PUT method.
     *
     * <p>The operation to create or update a virtual machine instance. Please note some properties can be set only
     * during virtual machine instance creation.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachineInstance.
     */
    VirtualMachineInstance createOrUpdate(String resourceUri, VirtualMachineInstanceInner body, Context context);

    /**
     * Gets a virtual machine.
     *
     * <p>Retrieves information about a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachineInstance along with {@link Response}.
     */
    Response<VirtualMachineInstance> getWithResponse(String resourceUri, Context context);

    /**
     * Gets a virtual machine.
     *
     * <p>Retrieves information about a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachineInstance.
     */
    VirtualMachineInstance get(String resourceUri);

    /**
     * Updates a virtual machine.
     *
     * <p>The operation to update a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachineInstance.
     */
    VirtualMachineInstance update(String resourceUri);

    /**
     * Updates a virtual machine.
     *
     * <p>The operation to update a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param body Resource properties to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachineInstance.
     */
    VirtualMachineInstance update(String resourceUri, VirtualMachineInstanceUpdate body, Context context);

    /**
     * Deletes an virtual machine.
     *
     * <p>The operation to delete a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceUri);

    /**
     * Deletes an virtual machine.
     *
     * <p>The operation to delete a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param deleteFromHost Whether to delete the VM from the vCenter.
     * @param force Whether force delete was specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceUri, Boolean deleteFromHost, Boolean force, Context context);

    /**
     * Implements List virtual machine instances.
     *
     * <p>Lists all of the virtual machine instances within the specified parent resource.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualMachineInstances as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualMachineInstance> list(String resourceUri);

    /**
     * Implements List virtual machine instances.
     *
     * <p>Lists all of the virtual machine instances within the specified parent resource.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualMachineInstances as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualMachineInstance> list(String resourceUri, Context context);

    /**
     * Implements the operation to stop a virtual machine.
     *
     * <p>The operation to power off (stop) a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceUri);

    /**
     * Implements the operation to stop a virtual machine.
     *
     * <p>The operation to power off (stop) a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param body Virtualmachine stop action payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceUri, StopVirtualMachineOptions body, Context context);

    /**
     * Implements the operation to start a virtual machine.
     *
     * <p>The operation to start a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceUri);

    /**
     * Implements the operation to start a virtual machine.
     *
     * <p>The operation to start a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceUri, Context context);

    /**
     * Implements the operation to restart a virtual machine.
     *
     * <p>The operation to restart a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceUri);

    /**
     * Implements the operation to restart a virtual machine.
     *
     * <p>The operation to restart a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceUri, Context context);
}
