// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.fluent.BackupsUnderAccountsClient;
import com.azure.resourcemanager.netapp.models.BackupsMigrationRequest;
import com.azure.resourcemanager.netapp.models.BackupsUnderAccounts;

public final class BackupsUnderAccountsImpl implements BackupsUnderAccounts {
    private static final ClientLogger LOGGER = new ClientLogger(BackupsUnderAccountsImpl.class);

    private final BackupsUnderAccountsClient innerClient;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    public BackupsUnderAccountsImpl(BackupsUnderAccountsClient innerClient,
        com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void migrateBackups(String resourceGroupName, String accountName, BackupsMigrationRequest body) {
        this.serviceClient().migrateBackups(resourceGroupName, accountName, body);
    }

    public void migrateBackups(String resourceGroupName, String accountName, BackupsMigrationRequest body,
        Context context) {
        this.serviceClient().migrateBackups(resourceGroupName, accountName, body, context);
    }

    private BackupsUnderAccountsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }
}
