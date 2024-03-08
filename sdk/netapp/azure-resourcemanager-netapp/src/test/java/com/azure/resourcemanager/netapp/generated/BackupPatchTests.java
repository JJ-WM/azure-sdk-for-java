// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.BackupPatch;
import org.junit.jupiter.api.Assertions;

public final class BackupPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupPatch model
            = BinaryData.fromString("{\"properties\":{\"label\":\"lffhmouwqlg\"}}").toObject(BackupPatch.class);
        Assertions.assertEquals("lffhmouwqlg", model.label());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupPatch model = new BackupPatch().withLabel("lffhmouwqlg");
        model = BinaryData.fromObject(model).toObject(BackupPatch.class);
        Assertions.assertEquals("lffhmouwqlg", model.label());
    }
}
