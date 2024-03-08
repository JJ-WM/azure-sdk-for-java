// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Amazon Redshift linked service properties.
 */
@Fluent
public final class AmazonRedshiftLinkedServiceTypeProperties {
    /*
     * The name of the Amazon Redshift server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "server", required = true)
    private Object server;

    /*
     * The username of the Amazon Redshift source. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "username")
    private Object username;

    /*
     * The password of the Amazon Redshift source.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * The database name of the Amazon Redshift source. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "database", required = true)
    private Object database;

    /*
     * The TCP port number that the Amazon Redshift server uses to listen for client connections. The default value is
     * 5439. Type: integer (or Expression with resultType integer).
     */
    @JsonProperty(value = "port")
    private Object port;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /**
     * Creates an instance of AmazonRedshiftLinkedServiceTypeProperties class.
     */
    public AmazonRedshiftLinkedServiceTypeProperties() {
    }

    /**
     * Get the server property: The name of the Amazon Redshift server. Type: string (or Expression with resultType
     * string).
     * 
     * @return the server value.
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set the server property: The name of the Amazon Redshift server. Type: string (or Expression with resultType
     * string).
     * 
     * @param server the server value to set.
     * @return the AmazonRedshiftLinkedServiceTypeProperties object itself.
     */
    public AmazonRedshiftLinkedServiceTypeProperties withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the username property: The username of the Amazon Redshift source. Type: string (or Expression with
     * resultType string).
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: The username of the Amazon Redshift source. Type: string (or Expression with
     * resultType string).
     * 
     * @param username the username value to set.
     * @return the AmazonRedshiftLinkedServiceTypeProperties object itself.
     */
    public AmazonRedshiftLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password of the Amazon Redshift source.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: The password of the Amazon Redshift source.
     * 
     * @param password the password value to set.
     * @return the AmazonRedshiftLinkedServiceTypeProperties object itself.
     */
    public AmazonRedshiftLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the database property: The database name of the Amazon Redshift source. Type: string (or Expression with
     * resultType string).
     * 
     * @return the database value.
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set the database property: The database name of the Amazon Redshift source. Type: string (or Expression with
     * resultType string).
     * 
     * @param database the database value to set.
     * @return the AmazonRedshiftLinkedServiceTypeProperties object itself.
     */
    public AmazonRedshiftLinkedServiceTypeProperties withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get the port property: The TCP port number that the Amazon Redshift server uses to listen for client
     * connections. The default value is 5439. Type: integer (or Expression with resultType integer).
     * 
     * @return the port value.
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port number that the Amazon Redshift server uses to listen for client
     * connections. The default value is 5439. Type: integer (or Expression with resultType integer).
     * 
     * @param port the port value to set.
     * @return the AmazonRedshiftLinkedServiceTypeProperties object itself.
     */
    public AmazonRedshiftLinkedServiceTypeProperties withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AmazonRedshiftLinkedServiceTypeProperties object itself.
     */
    public AmazonRedshiftLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (server() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property server in model AmazonRedshiftLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
        if (database() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property database in model AmazonRedshiftLinkedServiceTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AmazonRedshiftLinkedServiceTypeProperties.class);
}
