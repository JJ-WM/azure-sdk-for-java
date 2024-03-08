// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ServicePrincipalInKVParam model.
 */
@Fluent
public final class ServicePrincipalInKVParam implements JsonSerializable<ServicePrincipalInKVParam> {
    /*
     * The Key Vault endpoint that storing the service principal.
     */
    private String keyVaultEndpoint;

    /*
     * The Client Id to access the Key Vault.
     */
    private String keyVaultClientId;

    /*
     * The Client Secret to access the Key Vault.
     */
    private String keyVaultClientSecret;

    /*
     * The secret name of the service principal's client Id in the Key Vault.
     */
    private String servicePrincipalIdNameInKV;

    /*
     * The secret name of the service principal's client secret in the Key Vault.
     */
    private String servicePrincipalSecretNameInKV;

    /*
     * The tenant id of your service principal.
     */
    private String tenantId;

    /**
     * Creates an instance of ServicePrincipalInKVParam class.
     */
    public ServicePrincipalInKVParam() {
    }

    /**
     * Get the keyVaultEndpoint property: The Key Vault endpoint that storing the service principal.
     * 
     * @return the keyVaultEndpoint value.
     */
    public String getKeyVaultEndpoint() {
        return this.keyVaultEndpoint;
    }

    /**
     * Set the keyVaultEndpoint property: The Key Vault endpoint that storing the service principal.
     * 
     * @param keyVaultEndpoint the keyVaultEndpoint value to set.
     * @return the ServicePrincipalInKVParam object itself.
     */
    public ServicePrincipalInKVParam setKeyVaultEndpoint(String keyVaultEndpoint) {
        this.keyVaultEndpoint = keyVaultEndpoint;
        return this;
    }

    /**
     * Get the keyVaultClientId property: The Client Id to access the Key Vault.
     * 
     * @return the keyVaultClientId value.
     */
    public String getKeyVaultClientId() {
        return this.keyVaultClientId;
    }

    /**
     * Set the keyVaultClientId property: The Client Id to access the Key Vault.
     * 
     * @param keyVaultClientId the keyVaultClientId value to set.
     * @return the ServicePrincipalInKVParam object itself.
     */
    public ServicePrincipalInKVParam setKeyVaultClientId(String keyVaultClientId) {
        this.keyVaultClientId = keyVaultClientId;
        return this;
    }

    /**
     * Get the keyVaultClientSecret property: The Client Secret to access the Key Vault.
     * 
     * @return the keyVaultClientSecret value.
     */
    public String getKeyVaultClientSecret() {
        return this.keyVaultClientSecret;
    }

    /**
     * Set the keyVaultClientSecret property: The Client Secret to access the Key Vault.
     * 
     * @param keyVaultClientSecret the keyVaultClientSecret value to set.
     * @return the ServicePrincipalInKVParam object itself.
     */
    public ServicePrincipalInKVParam setKeyVaultClientSecret(String keyVaultClientSecret) {
        this.keyVaultClientSecret = keyVaultClientSecret;
        return this;
    }

    /**
     * Get the servicePrincipalIdNameInKV property: The secret name of the service principal's client Id in the Key
     * Vault.
     * 
     * @return the servicePrincipalIdNameInKV value.
     */
    public String getServicePrincipalIdNameInKV() {
        return this.servicePrincipalIdNameInKV;
    }

    /**
     * Set the servicePrincipalIdNameInKV property: The secret name of the service principal's client Id in the Key
     * Vault.
     * 
     * @param servicePrincipalIdNameInKV the servicePrincipalIdNameInKV value to set.
     * @return the ServicePrincipalInKVParam object itself.
     */
    public ServicePrincipalInKVParam setServicePrincipalIdNameInKV(String servicePrincipalIdNameInKV) {
        this.servicePrincipalIdNameInKV = servicePrincipalIdNameInKV;
        return this;
    }

    /**
     * Get the servicePrincipalSecretNameInKV property: The secret name of the service principal's client secret in the
     * Key Vault.
     * 
     * @return the servicePrincipalSecretNameInKV value.
     */
    public String getServicePrincipalSecretNameInKV() {
        return this.servicePrincipalSecretNameInKV;
    }

    /**
     * Set the servicePrincipalSecretNameInKV property: The secret name of the service principal's client secret in the
     * Key Vault.
     * 
     * @param servicePrincipalSecretNameInKV the servicePrincipalSecretNameInKV value to set.
     * @return the ServicePrincipalInKVParam object itself.
     */
    public ServicePrincipalInKVParam setServicePrincipalSecretNameInKV(String servicePrincipalSecretNameInKV) {
        this.servicePrincipalSecretNameInKV = servicePrincipalSecretNameInKV;
        return this;
    }

    /**
     * Get the tenantId property: The tenant id of your service principal.
     * 
     * @return the tenantId value.
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenant id of your service principal.
     * 
     * @param tenantId the tenantId value to set.
     * @return the ServicePrincipalInKVParam object itself.
     */
    public ServicePrincipalInKVParam setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("keyVaultEndpoint", this.keyVaultEndpoint);
        jsonWriter.writeStringField("keyVaultClientId", this.keyVaultClientId);
        jsonWriter.writeStringField("servicePrincipalIdNameInKV", this.servicePrincipalIdNameInKV);
        jsonWriter.writeStringField("servicePrincipalSecretNameInKV", this.servicePrincipalSecretNameInKV);
        jsonWriter.writeStringField("tenantId", this.tenantId);
        jsonWriter.writeStringField("keyVaultClientSecret", this.keyVaultClientSecret);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServicePrincipalInKVParam from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServicePrincipalInKVParam if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ServicePrincipalInKVParam.
     */
    public static ServicePrincipalInKVParam fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServicePrincipalInKVParam deserializedServicePrincipalInKVParam = new ServicePrincipalInKVParam();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("keyVaultEndpoint".equals(fieldName)) {
                    deserializedServicePrincipalInKVParam.keyVaultEndpoint = reader.getString();
                } else if ("keyVaultClientId".equals(fieldName)) {
                    deserializedServicePrincipalInKVParam.keyVaultClientId = reader.getString();
                } else if ("servicePrincipalIdNameInKV".equals(fieldName)) {
                    deserializedServicePrincipalInKVParam.servicePrincipalIdNameInKV = reader.getString();
                } else if ("servicePrincipalSecretNameInKV".equals(fieldName)) {
                    deserializedServicePrincipalInKVParam.servicePrincipalSecretNameInKV = reader.getString();
                } else if ("tenantId".equals(fieldName)) {
                    deserializedServicePrincipalInKVParam.tenantId = reader.getString();
                } else if ("keyVaultClientSecret".equals(fieldName)) {
                    deserializedServicePrincipalInKVParam.keyVaultClientSecret = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServicePrincipalInKVParam;
        });
    }
}
