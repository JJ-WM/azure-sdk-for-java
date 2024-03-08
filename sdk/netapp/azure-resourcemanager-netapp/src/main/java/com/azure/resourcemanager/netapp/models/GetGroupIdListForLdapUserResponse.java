// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.resourcemanager.netapp.fluent.models.GetGroupIdListForLdapUserResponseInner;
import java.util.List;

/**
 * An immutable client-side representation of GetGroupIdListForLdapUserResponse.
 */
public interface GetGroupIdListForLdapUserResponse {
    /**
     * Gets the groupIdsForLdapUser property: Group Id list.
     * 
     * @return the groupIdsForLdapUser value.
     */
    List<String> groupIdsForLdapUser();

    /**
     * Gets the inner com.azure.resourcemanager.netapp.fluent.models.GetGroupIdListForLdapUserResponseInner object.
     * 
     * @return the inner object.
     */
    GetGroupIdListForLdapUserResponseInner innerModel();
}
