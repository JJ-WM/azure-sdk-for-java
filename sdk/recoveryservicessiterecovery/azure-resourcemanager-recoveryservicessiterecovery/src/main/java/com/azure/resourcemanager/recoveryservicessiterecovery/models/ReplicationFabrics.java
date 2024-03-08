// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of ReplicationFabrics.
 */
public interface ReplicationFabrics {
    /**
     * Gets the list of ASR fabrics.
     * 
     * Gets a list of the Azure Site Recovery fabrics in the vault.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the Azure Site Recovery fabrics in the vault as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Fabric> list(String resourceName, String resourceGroupName);

    /**
     * Gets the list of ASR fabrics.
     * 
     * Gets a list of the Azure Site Recovery fabrics in the vault.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the Azure Site Recovery fabrics in the vault as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Fabric> list(String resourceName, String resourceGroupName, Context context);

    /**
     * Gets the details of an ASR fabric.
     * 
     * Gets the details of an Azure Site Recovery fabric.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Azure Site Recovery fabric along with {@link Response}.
     */
    Response<Fabric> getWithResponse(String resourceName, String resourceGroupName, String fabricName, String filter,
        Context context);

    /**
     * Gets the details of an ASR fabric.
     * 
     * Gets the details of an Azure Site Recovery fabric.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Azure Site Recovery fabric.
     */
    Fabric get(String resourceName, String resourceGroupName, String fabricName);

    /**
     * Purges the site.
     * 
     * The operation to purge(force delete) an Azure Site Recovery fabric.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName ASR fabric to purge.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void purge(String resourceName, String resourceGroupName, String fabricName);

    /**
     * Purges the site.
     * 
     * The operation to purge(force delete) an Azure Site Recovery fabric.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName ASR fabric to purge.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void purge(String resourceName, String resourceGroupName, String fabricName, Context context);

    /**
     * Checks the consistency of the ASR fabric.
     * 
     * The operation to perform a consistency check on the fabric.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fabric definition.
     */
    Fabric checkConsistency(String resourceName, String resourceGroupName, String fabricName);

    /**
     * Checks the consistency of the ASR fabric.
     * 
     * The operation to perform a consistency check on the fabric.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fabric definition.
     */
    Fabric checkConsistency(String resourceName, String resourceGroupName, String fabricName, Context context);

    /**
     * Migrates the site to AAD.
     * 
     * The operation to migrate an Azure Site Recovery fabric to AAD.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName ASR fabric to migrate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void migrateToAad(String resourceName, String resourceGroupName, String fabricName);

    /**
     * Migrates the site to AAD.
     * 
     * The operation to migrate an Azure Site Recovery fabric to AAD.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName ASR fabric to migrate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void migrateToAad(String resourceName, String resourceGroupName, String fabricName, Context context);

    /**
     * Perform failover of the process server.
     * 
     * The operation to move replications from a process server to another process server.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName The name of the fabric containing the process server.
     * @param failoverProcessServerRequest The input to the failover process server operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fabric definition.
     */
    Fabric reassociateGateway(String resourceName, String resourceGroupName, String fabricName,
        FailoverProcessServerRequest failoverProcessServerRequest);

    /**
     * Perform failover of the process server.
     * 
     * The operation to move replications from a process server to another process server.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName The name of the fabric containing the process server.
     * @param failoverProcessServerRequest The input to the failover process server operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fabric definition.
     */
    Fabric reassociateGateway(String resourceName, String resourceGroupName, String fabricName,
        FailoverProcessServerRequest failoverProcessServerRequest, Context context);

    /**
     * Deletes the site.
     * 
     * The operation to delete or remove an Azure Site Recovery fabric.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName ASR fabric to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceName, String resourceGroupName, String fabricName);

    /**
     * Deletes the site.
     * 
     * The operation to delete or remove an Azure Site Recovery fabric.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName ASR fabric to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceName, String resourceGroupName, String fabricName, Context context);

    /**
     * Renews certificate for the fabric.
     * 
     * Renews the connection certificate for the ASR replication fabric.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName fabric name to renew certs for.
     * @param renewCertificate Renew certificate input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fabric definition.
     */
    Fabric renewCertificate(String resourceName, String resourceGroupName, String fabricName,
        RenewCertificateInput renewCertificate);

    /**
     * Renews certificate for the fabric.
     * 
     * Renews the connection certificate for the ASR replication fabric.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName fabric name to renew certs for.
     * @param renewCertificate Renew certificate input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fabric definition.
     */
    Fabric renewCertificate(String resourceName, String resourceGroupName, String fabricName,
        RenewCertificateInput renewCertificate, Context context);

    /**
     * Removes the appliance's infrastructure under the fabric.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceName Resource name.
     * @param fabricName Fabric name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void removeInfra(String resourceGroupName, String resourceName, String fabricName);

    /**
     * Removes the appliance's infrastructure under the fabric.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceName Resource name.
     * @param fabricName Fabric name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void removeInfra(String resourceGroupName, String resourceName, String fabricName, Context context);

    /**
     * Gets the details of an ASR fabric.
     * 
     * Gets the details of an Azure Site Recovery fabric.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Azure Site Recovery fabric along with {@link Response}.
     */
    Fabric getById(String id);

    /**
     * Gets the details of an ASR fabric.
     * 
     * Gets the details of an Azure Site Recovery fabric.
     * 
     * @param id the resource ID.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Azure Site Recovery fabric along with {@link Response}.
     */
    Response<Fabric> getByIdWithResponse(String id, String filter, Context context);

    /**
     * Begins definition for a new Fabric resource.
     * 
     * @param name resource name.
     * @return the first stage of the new Fabric definition.
     */
    Fabric.DefinitionStages.Blank define(String name);
}
