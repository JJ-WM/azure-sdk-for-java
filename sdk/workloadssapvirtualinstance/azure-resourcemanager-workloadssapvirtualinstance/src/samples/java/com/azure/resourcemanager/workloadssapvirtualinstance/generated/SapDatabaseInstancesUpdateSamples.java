// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.generated;

import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapDatabaseInstance;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for SapDatabaseInstances Update.
 */
public final class SapDatabaseInstancesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/
     * examples/sapdatabaseinstances/SAPDatabaseInstances_Update.json
     */
    /**
     * Sample code: SAPDatabaseInstances_Update.
     * 
     * @param manager Entry point to WorkloadsSapVirtualInstanceManager.
     */
    public static void sAPDatabaseInstancesUpdate(
        com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager manager) {
        SapDatabaseInstance resource = manager.sapDatabaseInstances()
            .getWithResponse("test-rg", "X00", "databaseServer", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("key1", "fakeTokenPlaceholder")).apply();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
