// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.identity.models;

import com.azure.communication.identity.CommunicationIdentityAsyncClient;
import com.azure.communication.identity.CommunicationIdentityClient;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Options class for configuring the
 * {@link CommunicationIdentityAsyncClient#getTokenForTeamsUser(GetTokenForTeamsUserOptions)} and
 * {@link CommunicationIdentityClient#getTokenForTeamsUser(GetTokenForTeamsUserOptions)} methods.
 */
@Immutable
public final class GetTokenForTeamsUserOptions implements JsonSerializable<GetTokenForTeamsUserOptions> {

    /*
     * Azure AD access token of a Teams User to acquire a new Communication Identity access token.
     */
    private String teamsUserAadToken;

    /*
     * Client ID of an Azure AD application to be verified against the appid claim in the Azure AD access token.
     */
    private String clientId;

    /*
     * Object ID of an Azure AD user (Teams User) to be verified against the oid claim in the Azure AD access token.
     */
    private String userObjectId;

    /**
     * Constructor of {@link GetTokenForTeamsUserOptions}.
     *
     * @param teamsUserAadToken Azure AD access token of a Teams User.
     * @param clientId Client ID of an Azure AD application to be verified against the appId claim in the Azure AD
     * access token.
     * @param userObjectId Object ID of an Azure AD user (Teams User) to be verified against the OID claim in the Azure
     * AD access token.
     */
    public GetTokenForTeamsUserOptions(String teamsUserAadToken, String clientId, String userObjectId) {
        this.teamsUserAadToken = teamsUserAadToken;
        this.clientId = clientId;
        this.userObjectId = userObjectId;
    }

    /**
     * Gets the Azure AD access token of a Teams User.
     *
     * @return the Azure AD access token of a Teams User.
     */
    public String getTeamsUserAadToken() {
        return this.teamsUserAadToken;
    }

    /**
     * Gets the Client ID of an Azure AD application.
     *
     * @return the Client ID of an Azure AD application.
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * Gets the Object ID of an Azure AD user (Teams User).
     *
     * @return the Object ID of an Azure AD user (Teams User).
     */
    public String getUserObjectId() {
        return this.userObjectId;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("token", this.teamsUserAadToken);
        jsonWriter.writeStringField("appId", this.clientId);
        jsonWriter.writeStringField("userId", this.userObjectId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TeamsUserExchangeTokenRequest from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of TeamsUserExchangeTokenRequest if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TeamsUserExchangeTokenRequest.
     */
    public static GetTokenForTeamsUserOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String teamsUserAadToken = null;
            String clientId = null;
            String userObjectId = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("token".equals(fieldName)) {
                    teamsUserAadToken = reader.getString();
                } else if ("appId".equals(fieldName)) {
                    clientId = reader.getString();
                } else if ("userId".equals(fieldName)) {
                    userObjectId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new GetTokenForTeamsUserOptions(teamsUserAadToken, clientId, userObjectId);
        });
    }
}
