// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.resourcemanager.confluent.fluent.models.AccessListInvitationsSuccessResponseInner;
import java.util.List;

/**
 * An immutable client-side representation of AccessListInvitationsSuccessResponse.
 */
public interface AccessListInvitationsSuccessResponse {
    /**
     * Gets the kind property: Type of response.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the metadata property: Metadata of the list.
     * 
     * @return the metadata value.
     */
    ConfluentListMetadata metadata();

    /**
     * Gets the data property: Data of the invitations list.
     * 
     * @return the data value.
     */
    List<InvitationRecord> data();

    /**
     * Gets the inner com.azure.resourcemanager.confluent.fluent.models.AccessListInvitationsSuccessResponseInner
     * object.
     * 
     * @return the inner object.
     */
    AccessListInvitationsSuccessResponseInner innerModel();
}
