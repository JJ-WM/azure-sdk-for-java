// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.resourcemanager.storagecache.models.BlobNfsTarget;
import com.azure.resourcemanager.storagecache.models.NamespaceJunction;
import com.azure.resourcemanager.storagecache.models.Nfs3Target;
import com.azure.resourcemanager.storagecache.models.StorageTargetType;
import java.util.Arrays;

/**
 * Samples for StorageTargets CreateOrUpdate.
 */
public final class StorageTargetsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/storagecache/resource-manager/Microsoft.StorageCache/preview/2023-11-01-preview/examples/
     * StorageTargets_CreateOrUpdate.json
     */
    /**
     * Sample code: StorageTargets_CreateOrUpdate.
     * 
     * @param manager Entry point to StorageCacheManager.
     */
    public static void
        storageTargetsCreateOrUpdate(com.azure.resourcemanager.storagecache.StorageCacheManager manager) {
        manager.storageTargets().define("st1").withExistingCache("scgroup", "sc1")
            .withJunctions(Arrays.asList(
                new NamespaceJunction().withNamespacePath("/path/on/cache").withTargetPath("/path/on/exp1")
                    .withNfsExport("exp1").withNfsAccessPolicy("default"),
                new NamespaceJunction().withNamespacePath("/path2/on/cache").withTargetPath("/path2/on/exp2")
                    .withNfsExport("exp2").withNfsAccessPolicy("rootSquash")))
            .withTargetType(StorageTargetType.NFS3)
            .withNfs3(new Nfs3Target().withTarget("10.0.44.44").withUsageModel("READ_ONLY").withVerificationTimer(30))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/storagecache/resource-manager/Microsoft.StorageCache/preview/2023-11-01-preview/examples/
     * StorageTargets_CreateOrUpdate_BlobNfs.json
     */
    /**
     * Sample code: StorageTargets_CreateOrUpdate_BlobNfs.
     * 
     * @param manager Entry point to StorageCacheManager.
     */
    public static void
        storageTargetsCreateOrUpdateBlobNfs(com.azure.resourcemanager.storagecache.StorageCacheManager manager) {
        manager.storageTargets().define("st1").withExistingCache("scgroup", "sc1")
            .withJunctions(Arrays.asList(new NamespaceJunction().withNamespacePath("/blobnfs")))
            .withTargetType(StorageTargetType.BLOB_NFS)
            .withBlobNfs(new BlobNfsTarget().withTarget(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/scgroup/providers/Microsoft.Storage/storageAccounts/blofnfs/blobServices/default/containers/blobnfs")
                .withUsageModel("READ_WRITE").withVerificationTimer(28800).withWriteBackTimer(3600))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/storagecache/resource-manager/Microsoft.StorageCache/preview/2023-11-01-preview/examples/
     * StorageTargets_CreateOrUpdate_NoJunctions.json
     */
    /**
     * Sample code: StorageTargets_CreateOrUpdate_NoJunctions.
     * 
     * @param manager Entry point to StorageCacheManager.
     */
    public static void
        storageTargetsCreateOrUpdateNoJunctions(com.azure.resourcemanager.storagecache.StorageCacheManager manager) {
        manager.storageTargets().define("st1").withExistingCache("scgroup", "sc1")
            .withTargetType(StorageTargetType.NFS3)
            .withNfs3(new Nfs3Target().withTarget("10.0.44.44").withUsageModel("READ_ONLY").withVerificationTimer(30))
            .create();
    }
}
