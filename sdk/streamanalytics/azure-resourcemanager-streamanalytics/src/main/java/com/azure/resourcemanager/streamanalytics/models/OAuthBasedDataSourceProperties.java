// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties that are associated with data sources that use OAuth as their authentication model.
 */
@Fluent
public class OAuthBasedDataSourceProperties {
    /*
     * A refresh token that can be used to obtain a valid access token that can then be used to authenticate with the
     * data source. A valid refresh token is currently only obtainable via the Azure Portal. It is recommended to put a
     * dummy string value here when creating the data source and then going to the Azure Portal to authenticate the
     * data source which will update this property with a valid refresh token. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "refreshToken")
    private String refreshToken;

    /*
     * The user principal name (UPN) of the user that was used to obtain the refresh token. Use this property to help
     * remember which user was used to obtain the refresh token.
     */
    @JsonProperty(value = "tokenUserPrincipalName")
    private String tokenUserPrincipalName;

    /*
     * The user display name of the user that was used to obtain the refresh token. Use this property to help remember
     * which user was used to obtain the refresh token.
     */
    @JsonProperty(value = "tokenUserDisplayName")
    private String tokenUserDisplayName;

    /**
     * Creates an instance of OAuthBasedDataSourceProperties class.
     */
    public OAuthBasedDataSourceProperties() {
    }

    /**
     * Get the refreshToken property: A refresh token that can be used to obtain a valid access token that can then be
     * used to authenticate with the data source. A valid refresh token is currently only obtainable via the Azure
     * Portal. It is recommended to put a dummy string value here when creating the data source and then going to the
     * Azure Portal to authenticate the data source which will update this property with a valid refresh token.
     * Required on PUT (CreateOrReplace) requests.
     * 
     * @return the refreshToken value.
     */
    public String refreshToken() {
        return this.refreshToken;
    }

    /**
     * Set the refreshToken property: A refresh token that can be used to obtain a valid access token that can then be
     * used to authenticate with the data source. A valid refresh token is currently only obtainable via the Azure
     * Portal. It is recommended to put a dummy string value here when creating the data source and then going to the
     * Azure Portal to authenticate the data source which will update this property with a valid refresh token.
     * Required on PUT (CreateOrReplace) requests.
     * 
     * @param refreshToken the refreshToken value to set.
     * @return the OAuthBasedDataSourceProperties object itself.
     */
    public OAuthBasedDataSourceProperties withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Get the tokenUserPrincipalName property: The user principal name (UPN) of the user that was used to obtain the
     * refresh token. Use this property to help remember which user was used to obtain the refresh token.
     * 
     * @return the tokenUserPrincipalName value.
     */
    public String tokenUserPrincipalName() {
        return this.tokenUserPrincipalName;
    }

    /**
     * Set the tokenUserPrincipalName property: The user principal name (UPN) of the user that was used to obtain the
     * refresh token. Use this property to help remember which user was used to obtain the refresh token.
     * 
     * @param tokenUserPrincipalName the tokenUserPrincipalName value to set.
     * @return the OAuthBasedDataSourceProperties object itself.
     */
    public OAuthBasedDataSourceProperties withTokenUserPrincipalName(String tokenUserPrincipalName) {
        this.tokenUserPrincipalName = tokenUserPrincipalName;
        return this;
    }

    /**
     * Get the tokenUserDisplayName property: The user display name of the user that was used to obtain the refresh
     * token. Use this property to help remember which user was used to obtain the refresh token.
     * 
     * @return the tokenUserDisplayName value.
     */
    public String tokenUserDisplayName() {
        return this.tokenUserDisplayName;
    }

    /**
     * Set the tokenUserDisplayName property: The user display name of the user that was used to obtain the refresh
     * token. Use this property to help remember which user was used to obtain the refresh token.
     * 
     * @param tokenUserDisplayName the tokenUserDisplayName value to set.
     * @return the OAuthBasedDataSourceProperties object itself.
     */
    public OAuthBasedDataSourceProperties withTokenUserDisplayName(String tokenUserDisplayName) {
        this.tokenUserDisplayName = tokenUserDisplayName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
