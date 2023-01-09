// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.models.GeoBackupPolicyName;

/** Samples for GeoBackupPolicies Get. */
public final class GeoBackupPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/GeoBackupPoliciesGet.json
     */
    /**
     * Sample code: Gets the specified Geo backup policy.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsTheSpecifiedGeoBackupPolicy(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getGeoBackupPolicies()
            .getWithResponse(
                "sqlcrudtest-4799", "sqlcrudtest-5961", "testdw", GeoBackupPolicyName.DEFAULT, Context.NONE);
    }
}
