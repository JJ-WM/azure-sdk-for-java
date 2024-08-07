// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Managed identity properties retrieved from ARM request headers.
 */
@Fluent
public final class ManagedIdentityProperties implements JsonSerializable<ManagedIdentityProperties> {
    /*
     * Type of the managed identity
     */
    private ManagedIdentityType type;

    /*
     * Principal Id of system-assigned managed identity.
     */
    private String principalId;

    /*
     * Tenant Id of system-assigned managed identity.
     */
    private String tenantId;

    /*
     * Properties of user-assigned managed identities
     */
    private Map<String, UserAssignedManagedIdentity> userAssignedIdentities;

    /**
     * Creates an instance of ManagedIdentityProperties class.
     */
    public ManagedIdentityProperties() {
    }

    /**
     * Get the type property: Type of the managed identity.
     * 
     * @return the type value.
     */
    public ManagedIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the managed identity.
     * 
     * @param type the type value to set.
     * @return the ManagedIdentityProperties object itself.
     */
    public ManagedIdentityProperties withType(ManagedIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the principalId property: Principal Id of system-assigned managed identity.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: Principal Id of system-assigned managed identity.
     * 
     * @param principalId the principalId value to set.
     * @return the ManagedIdentityProperties object itself.
     */
    public ManagedIdentityProperties withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the tenantId property: Tenant Id of system-assigned managed identity.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Tenant Id of system-assigned managed identity.
     * 
     * @param tenantId the tenantId value to set.
     * @return the ManagedIdentityProperties object itself.
     */
    public ManagedIdentityProperties withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: Properties of user-assigned managed identities.
     * 
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserAssignedManagedIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: Properties of user-assigned managed identities.
     * 
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the ManagedIdentityProperties object itself.
     */
    public ManagedIdentityProperties
        withUserAssignedIdentities(Map<String, UserAssignedManagedIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAssignedIdentities() != null) {
            userAssignedIdentities().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("principalId", this.principalId);
        jsonWriter.writeStringField("tenantId", this.tenantId);
        jsonWriter.writeMapField("userAssignedIdentities", this.userAssignedIdentities,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedIdentityProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedIdentityProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedIdentityProperties.
     */
    public static ManagedIdentityProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedIdentityProperties deserializedManagedIdentityProperties = new ManagedIdentityProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedManagedIdentityProperties.type = ManagedIdentityType.fromString(reader.getString());
                } else if ("principalId".equals(fieldName)) {
                    deserializedManagedIdentityProperties.principalId = reader.getString();
                } else if ("tenantId".equals(fieldName)) {
                    deserializedManagedIdentityProperties.tenantId = reader.getString();
                } else if ("userAssignedIdentities".equals(fieldName)) {
                    Map<String, UserAssignedManagedIdentity> userAssignedIdentities
                        = reader.readMap(reader1 -> UserAssignedManagedIdentity.fromJson(reader1));
                    deserializedManagedIdentityProperties.userAssignedIdentities = userAssignedIdentities;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedIdentityProperties;
        });
    }
}
