// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.VolumeQuotaRulesProperties;
import com.azure.resourcemanager.netapp.models.Type;
import org.junit.jupiter.api.Assertions;

public final class VolumeQuotaRulesPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeQuotaRulesProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"Creating\",\"quotaSizeInKiBs\":7435265632351903503,\"quotaType\":\"DefaultGroupQuota\",\"quotaTarget\":\"kd\"}")
            .toObject(VolumeQuotaRulesProperties.class);
        Assertions.assertEquals(7435265632351903503L, model.quotaSizeInKiBs());
        Assertions.assertEquals(Type.DEFAULT_GROUP_QUOTA, model.quotaType());
        Assertions.assertEquals("kd", model.quotaTarget());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeQuotaRulesProperties model = new VolumeQuotaRulesProperties().withQuotaSizeInKiBs(7435265632351903503L)
            .withQuotaType(Type.DEFAULT_GROUP_QUOTA).withQuotaTarget("kd");
        model = BinaryData.fromObject(model).toObject(VolumeQuotaRulesProperties.class);
        Assertions.assertEquals(7435265632351903503L, model.quotaSizeInKiBs());
        Assertions.assertEquals(Type.DEFAULT_GROUP_QUOTA, model.quotaType());
        Assertions.assertEquals("kd", model.quotaTarget());
    }
}
