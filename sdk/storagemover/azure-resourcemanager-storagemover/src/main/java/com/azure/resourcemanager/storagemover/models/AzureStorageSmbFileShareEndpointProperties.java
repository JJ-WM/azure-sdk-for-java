// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The properties of Azure Storage SMB file share endpoint. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType")
@JsonTypeName("AzureStorageSmbFileShare")
@Fluent
public final class AzureStorageSmbFileShareEndpointProperties extends EndpointBaseProperties {
    /*
     * The Azure Resource ID of the storage account.
     */
    @JsonProperty(value = "storageAccountResourceId", required = true)
    private String storageAccountResourceId;

    /*
     * The name of the Azure Storage file share.
     */
    @JsonProperty(value = "fileShareName", required = true)
    private String fileShareName;

    /** Creates an instance of AzureStorageSmbFileShareEndpointProperties class. */
    public AzureStorageSmbFileShareEndpointProperties() {
    }

    /**
     * Get the storageAccountResourceId property: The Azure Resource ID of the storage account.
     *
     * @return the storageAccountResourceId value.
     */
    public String storageAccountResourceId() {
        return this.storageAccountResourceId;
    }

    /**
     * Set the storageAccountResourceId property: The Azure Resource ID of the storage account.
     *
     * @param storageAccountResourceId the storageAccountResourceId value to set.
     * @return the AzureStorageSmbFileShareEndpointProperties object itself.
     */
    public AzureStorageSmbFileShareEndpointProperties withStorageAccountResourceId(String storageAccountResourceId) {
        this.storageAccountResourceId = storageAccountResourceId;
        return this;
    }

    /**
     * Get the fileShareName property: The name of the Azure Storage file share.
     *
     * @return the fileShareName value.
     */
    public String fileShareName() {
        return this.fileShareName;
    }

    /**
     * Set the fileShareName property: The name of the Azure Storage file share.
     *
     * @param fileShareName the fileShareName value to set.
     * @return the AzureStorageSmbFileShareEndpointProperties object itself.
     */
    public AzureStorageSmbFileShareEndpointProperties withFileShareName(String fileShareName) {
        this.fileShareName = fileShareName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureStorageSmbFileShareEndpointProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (storageAccountResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storageAccountResourceId in model"
                            + " AzureStorageSmbFileShareEndpointProperties"));
        }
        if (fileShareName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property fileShareName in model AzureStorageSmbFileShareEndpointProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureStorageSmbFileShareEndpointProperties.class);
}
