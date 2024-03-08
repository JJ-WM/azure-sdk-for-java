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
            "{\"provisioningState\":\"Creating\",\"quotaSizeInKiBs\":4156012930167419412,\"quotaType\":\"DefaultUserQuota\",\"quotaTarget\":\"shfssnrbgyef\"}")
            .toObject(VolumeQuotaRulesProperties.class);
        Assertions.assertEquals(4156012930167419412L, model.quotaSizeInKiBs());
        Assertions.assertEquals(Type.DEFAULT_USER_QUOTA, model.quotaType());
        Assertions.assertEquals("shfssnrbgyef", model.quotaTarget());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeQuotaRulesProperties model = new VolumeQuotaRulesProperties().withQuotaSizeInKiBs(4156012930167419412L)
            .withQuotaType(Type.DEFAULT_USER_QUOTA).withQuotaTarget("shfssnrbgyef");
        model = BinaryData.fromObject(model).toObject(VolumeQuotaRulesProperties.class);
        Assertions.assertEquals(4156012930167419412L, model.quotaSizeInKiBs());
        Assertions.assertEquals(Type.DEFAULT_USER_QUOTA, model.quotaType());
        Assertions.assertEquals("shfssnrbgyef", model.quotaTarget());
    }
}
