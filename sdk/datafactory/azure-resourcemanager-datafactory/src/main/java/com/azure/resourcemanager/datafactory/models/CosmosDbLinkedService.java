// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.CosmosDbLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Microsoft Azure Cosmos Database (CosmosDB) linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = CosmosDbLinkedService.class, visible = true)
@JsonTypeName("CosmosDb")
@Fluent
public final class CosmosDbLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "CosmosDb";

    /*
     * CosmosDB linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private CosmosDbLinkedServiceTypeProperties innerTypeProperties = new CosmosDbLinkedServiceTypeProperties();

    /**
     * Creates an instance of CosmosDbLinkedService class.
     */
    public CosmosDbLinkedService() {
    }

    /**
     * Get the type property: Type of linked service.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: CosmosDB linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    private CosmosDbLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CosmosDbLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CosmosDbLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CosmosDbLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CosmosDbLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the connectionString property: The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().connectionString();
    }

    /**
     * Set the connectionString property: The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @param connectionString the connectionString value to set.
     * @return the CosmosDbLinkedService object itself.
     */
    public CosmosDbLinkedService withConnectionString(Object connectionString) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CosmosDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withConnectionString(connectionString);
        return this;
    }

    /**
     * Get the accountEndpoint property: The endpoint of the Azure CosmosDB account. Type: string (or Expression with
     * resultType string).
     * 
     * @return the accountEndpoint value.
     */
    public Object accountEndpoint() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accountEndpoint();
    }

    /**
     * Set the accountEndpoint property: The endpoint of the Azure CosmosDB account. Type: string (or Expression with
     * resultType string).
     * 
     * @param accountEndpoint the accountEndpoint value to set.
     * @return the CosmosDbLinkedService object itself.
     */
    public CosmosDbLinkedService withAccountEndpoint(Object accountEndpoint) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CosmosDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAccountEndpoint(accountEndpoint);
        return this;
    }

    /**
     * Get the database property: The name of the database. Type: string (or Expression with resultType string).
     * 
     * @return the database value.
     */
    public Object database() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().database();
    }

    /**
     * Set the database property: The name of the database. Type: string (or Expression with resultType string).
     * 
     * @param database the database value to set.
     * @return the CosmosDbLinkedService object itself.
     */
    public CosmosDbLinkedService withDatabase(Object database) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CosmosDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withDatabase(database);
        return this;
    }

    /**
     * Get the accountKey property: The account key of the Azure CosmosDB account. Type: SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @return the accountKey value.
     */
    public SecretBase accountKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accountKey();
    }

    /**
     * Set the accountKey property: The account key of the Azure CosmosDB account. Type: SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @param accountKey the accountKey value to set.
     * @return the CosmosDbLinkedService object itself.
     */
    public CosmosDbLinkedService withAccountKey(SecretBase accountKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CosmosDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAccountKey(accountKey);
        return this;
    }

    /**
     * Get the servicePrincipalId property: The client ID of the application in Azure Active Directory used for
     * Server-To-Server authentication. Type: string (or Expression with resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalId();
    }

    /**
     * Set the servicePrincipalId property: The client ID of the application in Azure Active Directory used for
     * Server-To-Server authentication. Type: string (or Expression with resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the CosmosDbLinkedService object itself.
     */
    public CosmosDbLinkedService withServicePrincipalId(Object servicePrincipalId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CosmosDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalId(servicePrincipalId);
        return this;
    }

    /**
     * Get the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string.
     * 
     * @return the servicePrincipalCredentialType value.
     */
    public Object servicePrincipalCredentialType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalCredentialType();
    }

    /**
     * Set the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string.
     * 
     * @param servicePrincipalCredentialType the servicePrincipalCredentialType value to set.
     * @return the CosmosDbLinkedService object itself.
     */
    public CosmosDbLinkedService withServicePrincipalCredentialType(Object servicePrincipalCredentialType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CosmosDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalCredentialType(servicePrincipalCredentialType);
        return this;
    }

    /**
     * Get the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     * @return the servicePrincipalCredential value.
     */
    public SecretBase servicePrincipalCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalCredential();
    }

    /**
     * Set the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     * @param servicePrincipalCredential the servicePrincipalCredential value to set.
     * @return the CosmosDbLinkedService object itself.
     */
    public CosmosDbLinkedService withServicePrincipalCredential(SecretBase servicePrincipalCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CosmosDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalCredential(servicePrincipalCredential);
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     * 
     * @return the tenant value.
     */
    public Object tenant() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().tenant();
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     * 
     * @param tenant the tenant value to set.
     * @return the CosmosDbLinkedService object itself.
     */
    public CosmosDbLinkedService withTenant(Object tenant) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CosmosDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withTenant(tenant);
        return this;
    }

    /**
     * Get the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     * 
     * @return the azureCloudType value.
     */
    public Object azureCloudType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().azureCloudType();
    }

    /**
     * Set the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     * 
     * @param azureCloudType the azureCloudType value to set.
     * @return the CosmosDbLinkedService object itself.
     */
    public CosmosDbLinkedService withAzureCloudType(Object azureCloudType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CosmosDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAzureCloudType(azureCloudType);
        return this;
    }

    /**
     * Get the connectionMode property: The connection mode used to access CosmosDB account. Type: string.
     * 
     * @return the connectionMode value.
     */
    public CosmosDbConnectionMode connectionMode() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().connectionMode();
    }

    /**
     * Set the connectionMode property: The connection mode used to access CosmosDB account. Type: string.
     * 
     * @param connectionMode the connectionMode value to set.
     * @return the CosmosDbLinkedService object itself.
     */
    public CosmosDbLinkedService withConnectionMode(CosmosDbConnectionMode connectionMode) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CosmosDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withConnectionMode(connectionMode);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the CosmosDbLinkedService object itself.
     */
    public CosmosDbLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CosmosDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     * 
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().credential();
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     * 
     * @param credential the credential value to set.
     * @return the CosmosDbLinkedService object itself.
     */
    public CosmosDbLinkedService withCredential(CredentialReference credential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CosmosDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withCredential(credential);
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
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model CosmosDbLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CosmosDbLinkedService.class);
}
