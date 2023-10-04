// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.SapTableLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** SAP Table Linked Service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapTable")
@Fluent
public final class SapTableLinkedService extends LinkedService {
    /*
     * Properties specific to this linked service type.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private SapTableLinkedServiceTypeProperties innerTypeProperties = new SapTableLinkedServiceTypeProperties();

    /** Creates an instance of SapTableLinkedService class. */
    public SapTableLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: Properties specific to this linked service type.
     *
     * @return the innerTypeProperties value.
     */
    private SapTableLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SapTableLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapTableLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapTableLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapTableLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the server property: Host name of the SAP instance where the table is located. Type: string (or Expression
     * with resultType string).
     *
     * @return the server value.
     */
    public Object server() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().server();
    }

    /**
     * Set the server property: Host name of the SAP instance where the table is located. Type: string (or Expression
     * with resultType string).
     *
     * @param server the server value to set.
     * @return the SapTableLinkedService object itself.
     */
    public SapTableLinkedService withServer(Object server) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapTableLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServer(server);
        return this;
    }

    /**
     * Get the systemNumber property: System number of the SAP system where the table is located. (Usually a two-digit
     * decimal number represented as a string.) Type: string (or Expression with resultType string).
     *
     * @return the systemNumber value.
     */
    public Object systemNumber() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().systemNumber();
    }

    /**
     * Set the systemNumber property: System number of the SAP system where the table is located. (Usually a two-digit
     * decimal number represented as a string.) Type: string (or Expression with resultType string).
     *
     * @param systemNumber the systemNumber value to set.
     * @return the SapTableLinkedService object itself.
     */
    public SapTableLinkedService withSystemNumber(Object systemNumber) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapTableLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSystemNumber(systemNumber);
        return this;
    }

    /**
     * Get the clientId property: Client ID of the client on the SAP system where the table is located. (Usually a
     * three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     *
     * @return the clientId value.
     */
    public Object clientId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().clientId();
    }

    /**
     * Set the clientId property: Client ID of the client on the SAP system where the table is located. (Usually a
     * three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     *
     * @param clientId the clientId value to set.
     * @return the SapTableLinkedService object itself.
     */
    public SapTableLinkedService withClientId(Object clientId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapTableLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withClientId(clientId);
        return this;
    }

    /**
     * Get the language property: Language of the SAP system where the table is located. The default value is EN. Type:
     * string (or Expression with resultType string).
     *
     * @return the language value.
     */
    public Object language() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().language();
    }

    /**
     * Set the language property: Language of the SAP system where the table is located. The default value is EN. Type:
     * string (or Expression with resultType string).
     *
     * @param language the language value to set.
     * @return the SapTableLinkedService object itself.
     */
    public SapTableLinkedService withLanguage(Object language) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapTableLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withLanguage(language);
        return this;
    }

    /**
     * Get the systemId property: SystemID of the SAP system where the table is located. Type: string (or Expression
     * with resultType string).
     *
     * @return the systemId value.
     */
    public Object systemId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().systemId();
    }

    /**
     * Set the systemId property: SystemID of the SAP system where the table is located. Type: string (or Expression
     * with resultType string).
     *
     * @param systemId the systemId value to set.
     * @return the SapTableLinkedService object itself.
     */
    public SapTableLinkedService withSystemId(Object systemId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapTableLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSystemId(systemId);
        return this;
    }

    /**
     * Get the username property: Username to access the SAP server where the table is located. Type: string (or
     * Expression with resultType string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: Username to access the SAP server where the table is located. Type: string (or
     * Expression with resultType string).
     *
     * @param username the username value to set.
     * @return the SapTableLinkedService object itself.
     */
    public SapTableLinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapTableLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: Password to access the SAP server where the table is located.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: Password to access the SAP server where the table is located.
     *
     * @param password the password value to set.
     * @return the SapTableLinkedService object itself.
     */
    public SapTableLinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapTableLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the messageServer property: The hostname of the SAP Message Server. Type: string (or Expression with
     * resultType string).
     *
     * @return the messageServer value.
     */
    public Object messageServer() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().messageServer();
    }

    /**
     * Set the messageServer property: The hostname of the SAP Message Server. Type: string (or Expression with
     * resultType string).
     *
     * @param messageServer the messageServer value to set.
     * @return the SapTableLinkedService object itself.
     */
    public SapTableLinkedService withMessageServer(Object messageServer) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapTableLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withMessageServer(messageServer);
        return this;
    }

    /**
     * Get the messageServerService property: The service name or port number of the Message Server. Type: string (or
     * Expression with resultType string).
     *
     * @return the messageServerService value.
     */
    public Object messageServerService() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().messageServerService();
    }

    /**
     * Set the messageServerService property: The service name or port number of the Message Server. Type: string (or
     * Expression with resultType string).
     *
     * @param messageServerService the messageServerService value to set.
     * @return the SapTableLinkedService object itself.
     */
    public SapTableLinkedService withMessageServerService(Object messageServerService) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapTableLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withMessageServerService(messageServerService);
        return this;
    }

    /**
     * Get the sncMode property: SNC activation indicator to access the SAP server where the table is located. Must be
     * either 0 (off) or 1 (on). Type: string (or Expression with resultType string).
     *
     * @return the sncMode value.
     */
    public Object sncMode() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sncMode();
    }

    /**
     * Set the sncMode property: SNC activation indicator to access the SAP server where the table is located. Must be
     * either 0 (off) or 1 (on). Type: string (or Expression with resultType string).
     *
     * @param sncMode the sncMode value to set.
     * @return the SapTableLinkedService object itself.
     */
    public SapTableLinkedService withSncMode(Object sncMode) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapTableLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSncMode(sncMode);
        return this;
    }

    /**
     * Get the sncMyName property: Initiator's SNC name to access the SAP server where the table is located. Type:
     * string (or Expression with resultType string).
     *
     * @return the sncMyName value.
     */
    public Object sncMyName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sncMyName();
    }

    /**
     * Set the sncMyName property: Initiator's SNC name to access the SAP server where the table is located. Type:
     * string (or Expression with resultType string).
     *
     * @param sncMyName the sncMyName value to set.
     * @return the SapTableLinkedService object itself.
     */
    public SapTableLinkedService withSncMyName(Object sncMyName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapTableLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSncMyName(sncMyName);
        return this;
    }

    /**
     * Get the sncPartnerName property: Communication partner's SNC name to access the SAP server where the table is
     * located. Type: string (or Expression with resultType string).
     *
     * @return the sncPartnerName value.
     */
    public Object sncPartnerName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sncPartnerName();
    }

    /**
     * Set the sncPartnerName property: Communication partner's SNC name to access the SAP server where the table is
     * located. Type: string (or Expression with resultType string).
     *
     * @param sncPartnerName the sncPartnerName value to set.
     * @return the SapTableLinkedService object itself.
     */
    public SapTableLinkedService withSncPartnerName(Object sncPartnerName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapTableLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSncPartnerName(sncPartnerName);
        return this;
    }

    /**
     * Get the sncLibraryPath property: External security product's library to access the SAP server where the table is
     * located. Type: string (or Expression with resultType string).
     *
     * @return the sncLibraryPath value.
     */
    public Object sncLibraryPath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sncLibraryPath();
    }

    /**
     * Set the sncLibraryPath property: External security product's library to access the SAP server where the table is
     * located. Type: string (or Expression with resultType string).
     *
     * @param sncLibraryPath the sncLibraryPath value to set.
     * @return the SapTableLinkedService object itself.
     */
    public SapTableLinkedService withSncLibraryPath(Object sncLibraryPath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapTableLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSncLibraryPath(sncLibraryPath);
        return this;
    }

    /**
     * Get the sncQop property: SNC Quality of Protection. Allowed value include: 1, 2, 3, 8, 9. Type: string (or
     * Expression with resultType string).
     *
     * @return the sncQop value.
     */
    public Object sncQop() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sncQop();
    }

    /**
     * Set the sncQop property: SNC Quality of Protection. Allowed value include: 1, 2, 3, 8, 9. Type: string (or
     * Expression with resultType string).
     *
     * @param sncQop the sncQop value to set.
     * @return the SapTableLinkedService object itself.
     */
    public SapTableLinkedService withSncQop(Object sncQop) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapTableLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSncQop(sncQop);
        return this;
    }

    /**
     * Get the logonGroup property: The Logon Group for the SAP System. Type: string (or Expression with resultType
     * string).
     *
     * @return the logonGroup value.
     */
    public Object logonGroup() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().logonGroup();
    }

    /**
     * Set the logonGroup property: The Logon Group for the SAP System. Type: string (or Expression with resultType
     * string).
     *
     * @param logonGroup the logonGroup value to set.
     * @return the SapTableLinkedService object itself.
     */
    public SapTableLinkedService withLogonGroup(Object logonGroup) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapTableLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withLogonGroup(logonGroup);
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
     * @return the SapTableLinkedService object itself.
     */
    public SapTableLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapTableLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
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
                        "Missing required property innerTypeProperties in model SapTableLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SapTableLinkedService.class);
}
