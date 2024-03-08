// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.DatasetsImpl;
import com.azure.analytics.synapse.artifacts.models.ArtifactRenameRequest;
import com.azure.analytics.synapse.artifacts.models.CloudErrorException;
import com.azure.analytics.synapse.artifacts.models.DatasetResource;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.Response;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous ArtifactsClient type.
 */
@ServiceClient(builder = ArtifactsClientBuilder.class, isAsync = true)
public final class DatasetAsyncClient {
    @Generated
    private final DatasetsImpl serviceClient;

    /**
     * Initializes an instance of DatasetAsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    DatasetAsyncClient(DatasetsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists datasets.
     * 
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of dataset resources as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DatasetResource> getDatasetsByWorkspace() {
        return this.serviceClient.getDatasetsByWorkspaceAsync();
    }

    /**
     * Creates or updates a dataset.
     * 
     * @param datasetName The dataset name.
     * @param dataset Dataset resource definition.
     * @param ifMatch ETag of the dataset entity. Should only be specified for update, for which it should match
     * existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dataset resource type along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DatasetResource>> createOrUpdateDatasetWithResponse(String datasetName,
        DatasetResource dataset, String ifMatch) {
        return this.serviceClient.createOrUpdateDatasetWithResponseAsync(datasetName, dataset, ifMatch);
    }

    /**
     * Creates or updates a dataset.
     * 
     * @param datasetName The dataset name.
     * @param dataset Dataset resource definition.
     * @param ifMatch ETag of the dataset entity. Should only be specified for update, for which it should match
     * existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dataset resource type on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatasetResource> createOrUpdateDataset(String datasetName, DatasetResource dataset, String ifMatch) {
        return this.serviceClient.createOrUpdateDatasetAsync(datasetName, dataset, ifMatch);
    }

    /**
     * Creates or updates a dataset.
     * 
     * @param datasetName The dataset name.
     * @param dataset Dataset resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dataset resource type on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatasetResource> createOrUpdateDataset(String datasetName, DatasetResource dataset) {
        return this.serviceClient.createOrUpdateDatasetAsync(datasetName, dataset);
    }

    /**
     * Gets a dataset.
     * 
     * @param datasetName The dataset name.
     * @param ifNoneMatch ETag of the dataset entity. Should only be specified for get. If the ETag matches the existing
     * entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dataset along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DatasetResource>> getDatasetWithResponse(String datasetName, String ifNoneMatch) {
        return this.serviceClient.getDatasetWithResponseAsync(datasetName, ifNoneMatch);
    }

    /**
     * Gets a dataset.
     * 
     * @param datasetName The dataset name.
     * @param ifNoneMatch ETag of the dataset entity. Should only be specified for get. If the ETag matches the existing
     * entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dataset on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatasetResource> getDataset(String datasetName, String ifNoneMatch) {
        return this.serviceClient.getDatasetAsync(datasetName, ifNoneMatch);
    }

    /**
     * Gets a dataset.
     * 
     * @param datasetName The dataset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dataset on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatasetResource> getDataset(String datasetName) {
        return this.serviceClient.getDatasetAsync(datasetName);
    }

    /**
     * Deletes a dataset.
     * 
     * @param datasetName The dataset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteDatasetWithResponse(String datasetName) {
        return this.serviceClient.deleteDatasetWithResponseAsync(datasetName);
    }

    /**
     * Deletes a dataset.
     * 
     * @param datasetName The dataset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteDataset(String datasetName) {
        return this.serviceClient.deleteDatasetAsync(datasetName);
    }

    /**
     * Renames a dataset.
     * 
     * @param datasetName The dataset name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> renameDatasetWithResponse(String datasetName, ArtifactRenameRequest request) {
        return this.serviceClient.renameDatasetWithResponseAsync(datasetName, request);
    }

    /**
     * Renames a dataset.
     * 
     * @param datasetName The dataset name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> renameDataset(String datasetName, ArtifactRenameRequest request) {
        return this.serviceClient.renameDatasetAsync(datasetName, request);
    }
}
