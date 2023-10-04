// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.MongoDbAtlasLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Linked service for MongoDB Atlas data source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("MongoDbAtlas")
@Fluent
public final class MongoDbAtlasLinkedService extends LinkedService {
    /*
     * MongoDB Atlas linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private MongoDbAtlasLinkedServiceTypeProperties innerTypeProperties = new MongoDbAtlasLinkedServiceTypeProperties();

    /** Creates an instance of MongoDbAtlasLinkedService class. */
    public MongoDbAtlasLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: MongoDB Atlas linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private MongoDbAtlasLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbAtlasLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbAtlasLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbAtlasLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbAtlasLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the connectionString property: The MongoDB Atlas connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().connectionString();
    }

    /**
     * Set the connectionString property: The MongoDB Atlas connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the MongoDbAtlasLinkedService object itself.
     */
    public MongoDbAtlasLinkedService withConnectionString(Object connectionString) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MongoDbAtlasLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withConnectionString(connectionString);
        return this;
    }

    /**
     * Get the database property: The name of the MongoDB Atlas database that you want to access. Type: string (or
     * Expression with resultType string).
     *
     * @return the database value.
     */
    public Object database() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().database();
    }

    /**
     * Set the database property: The name of the MongoDB Atlas database that you want to access. Type: string (or
     * Expression with resultType string).
     *
     * @param database the database value to set.
     * @return the MongoDbAtlasLinkedService object itself.
     */
    public MongoDbAtlasLinkedService withDatabase(Object database) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MongoDbAtlasLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withDatabase(database);
        return this;
    }

    /**
     * Get the driverVersion property: The driver version that you want to choose. Allowed value are v1 and v2. Type:
     * string (or Expression with resultType string).
     *
     * @return the driverVersion value.
     */
    public Object driverVersion() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().driverVersion();
    }

    /**
     * Set the driverVersion property: The driver version that you want to choose. Allowed value are v1 and v2. Type:
     * string (or Expression with resultType string).
     *
     * @param driverVersion the driverVersion value to set.
     * @return the MongoDbAtlasLinkedService object itself.
     */
    public MongoDbAtlasLinkedService withDriverVersion(Object driverVersion) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MongoDbAtlasLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withDriverVersion(driverVersion);
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
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model MongoDbAtlasLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MongoDbAtlasLinkedService.class);
}
