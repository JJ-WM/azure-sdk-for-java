// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.resourcemanager.cosmosdbforpostgresql.models.Cluster;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.MaintenanceWindow;

/** Samples for Clusters Update. */
public final class ClustersUpdateSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterScaleStorage.json
     */
    /**
     * Sample code: Scale up storage.
     *
     * @param manager Entry point to CosmosDBForPostgreSqlManager.
     */
    public static void scaleUpStorage(
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager) {
        Cluster resource =
            manager
                .clusters()
                .getByResourceGroupWithResponse("TestGroup", "testcluster", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withNodeStorageQuotaInMb(2097152).apply();
    }

    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterUpdate.json
     */
    /**
     * Sample code: Update multiple configuration settings of the cluster.
     *
     * @param manager Entry point to CosmosDBForPostgreSqlManager.
     */
    public static void updateMultipleConfigurationSettingsOfTheCluster(
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager) {
        Cluster resource =
            manager
                .clusters()
                .getByResourceGroupWithResponse("TestGroup", "testcluster", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withAdministratorLoginPassword("newpassword")
            .withCoordinatorVCores(16)
            .withNodeCount(4)
            .withNodeVCores(16)
            .apply();
    }

    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterScaleCompute.json
     */
    /**
     * Sample code: Scale compute up or down.
     *
     * @param manager Entry point to CosmosDBForPostgreSqlManager.
     */
    public static void scaleComputeUpOrDown(
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager) {
        Cluster resource =
            manager
                .clusters()
                .getByResourceGroupWithResponse("TestGroup", "testcluster", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withNodeVCores(16).apply();
    }

    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterAddNode.json
     */
    /**
     * Sample code: Scale out: Add new worker nodes.
     *
     * @param manager Entry point to CosmosDBForPostgreSqlManager.
     */
    public static void scaleOutAddNewWorkerNodes(
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager) {
        Cluster resource =
            manager
                .clusters()
                .getByResourceGroupWithResponse("TestGroup", "testcluster", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withNodeCount(2).apply();
    }

    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterUpdateMaintenanceWindow.json
     */
    /**
     * Sample code: Update or define maintenance window.
     *
     * @param manager Entry point to CosmosDBForPostgreSqlManager.
     */
    public static void updateOrDefineMaintenanceWindow(
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager) {
        Cluster resource =
            manager
                .clusters()
                .getByResourceGroupWithResponse("TestGroup", "testcluster", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withMaintenanceWindow(
                new MaintenanceWindow()
                    .withCustomWindow("Enabled")
                    .withStartHour(8)
                    .withStartMinute(0)
                    .withDayOfWeek(0))
            .apply();
    }
}
