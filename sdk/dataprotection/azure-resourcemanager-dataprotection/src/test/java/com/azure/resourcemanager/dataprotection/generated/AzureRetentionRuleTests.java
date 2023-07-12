// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AzureRetentionRule;
import com.azure.resourcemanager.dataprotection.models.DataStoreInfoBase;
import com.azure.resourcemanager.dataprotection.models.DataStoreTypes;
import com.azure.resourcemanager.dataprotection.models.DeleteOption;
import com.azure.resourcemanager.dataprotection.models.SourceLifeCycle;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureRetentionRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureRetentionRule model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureRetentionRule\",\"isDefault\":true,\"lifecycles\":[{\"deleteAfter\":{\"objectType\":\"DeleteOption\",\"duration\":\"wzxltjc\"},\"sourceDataStore\":{\"dataStoreType\":\"OperationalStore\",\"objectType\":\"hlt\"},\"targetDataStoreCopySettings\":[]},{\"deleteAfter\":{\"objectType\":\"DeleteOption\",\"duration\":\"cxnavv\"},\"sourceDataStore\":{\"dataStoreType\":\"VaultStore\",\"objectType\":\"qiby\"},\"targetDataStoreCopySettings\":[]},{\"deleteAfter\":{\"objectType\":\"DeleteOption\",\"duration\":\"y\"},\"sourceDataStore\":{\"dataStoreType\":\"ArchiveStore\",\"objectType\":\"xwlmdjr\"},\"targetDataStoreCopySettings\":[]}],\"name\":\"g\"}")
                .toObject(AzureRetentionRule.class);
        Assertions.assertEquals("g", model.name());
        Assertions.assertEquals(true, model.isDefault());
        Assertions.assertEquals("wzxltjc", model.lifecycles().get(0).deleteAfter().duration());
        Assertions
            .assertEquals(
                DataStoreTypes.OPERATIONAL_STORE, model.lifecycles().get(0).sourceDataStore().dataStoreType());
        Assertions.assertEquals("hlt", model.lifecycles().get(0).sourceDataStore().objectType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureRetentionRule model =
            new AzureRetentionRule()
                .withName("g")
                .withIsDefault(true)
                .withLifecycles(
                    Arrays
                        .asList(
                            new SourceLifeCycle()
                                .withDeleteAfter(new DeleteOption().withDuration("wzxltjc"))
                                .withSourceDataStore(
                                    new DataStoreInfoBase()
                                        .withDataStoreType(DataStoreTypes.OPERATIONAL_STORE)
                                        .withObjectType("hlt"))
                                .withTargetDataStoreCopySettings(Arrays.asList()),
                            new SourceLifeCycle()
                                .withDeleteAfter(new DeleteOption().withDuration("cxnavv"))
                                .withSourceDataStore(
                                    new DataStoreInfoBase()
                                        .withDataStoreType(DataStoreTypes.VAULT_STORE)
                                        .withObjectType("qiby"))
                                .withTargetDataStoreCopySettings(Arrays.asList()),
                            new SourceLifeCycle()
                                .withDeleteAfter(new DeleteOption().withDuration("y"))
                                .withSourceDataStore(
                                    new DataStoreInfoBase()
                                        .withDataStoreType(DataStoreTypes.ARCHIVE_STORE)
                                        .withObjectType("xwlmdjr"))
                                .withTargetDataStoreCopySettings(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(AzureRetentionRule.class);
        Assertions.assertEquals("g", model.name());
        Assertions.assertEquals(true, model.isDefault());
        Assertions.assertEquals("wzxltjc", model.lifecycles().get(0).deleteAfter().duration());
        Assertions
            .assertEquals(
                DataStoreTypes.OPERATIONAL_STORE, model.lifecycles().get(0).sourceDataStore().dataStoreType());
        Assertions.assertEquals("hlt", model.lifecycles().get(0).sourceDataStore().objectType());
    }
}
