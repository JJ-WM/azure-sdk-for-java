// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

/**
 * Samples for ServersMigration CutoverMigration.
 */
public final class ServersMigrationCutoverMigrationSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/FlexibleServers/stable/2023-12-30/examples/CutoverMigration.json
     */
    /**
     * Sample code: Cutover migration for MySQL import.
     * 
     * @param manager Entry point to MySqlManager.
     */
    public static void
        cutoverMigrationForMySQLImport(com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager.serversMigrations().cutoverMigration("testrg", "mysqltestserver", com.azure.core.util.Context.NONE);
    }
}
