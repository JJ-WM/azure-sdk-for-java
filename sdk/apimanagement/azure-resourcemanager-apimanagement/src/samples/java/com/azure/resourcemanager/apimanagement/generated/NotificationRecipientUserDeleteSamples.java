// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.resourcemanager.apimanagement.models.NotificationName;

/** Samples for NotificationRecipientUser Delete. */
public final class NotificationRecipientUserDeleteSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementDeleteNotificationRecipientUser.json
     */
    /**
     * Sample code: ApiManagementDeleteNotificationRecipientUser.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementDeleteNotificationRecipientUser(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .notificationRecipientUsers()
            .deleteWithResponse(
                "rg1",
                "apimService1",
                NotificationName.REQUEST_PUBLISHER_NOTIFICATION_MESSAGE,
                "576823d0a40f7e74ec07d642",
                com.azure.core.util.Context.NONE);
    }
}
