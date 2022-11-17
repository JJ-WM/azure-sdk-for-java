// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.BillingMeters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BillingMetersTests {
    @Test
    public void testDeserialize() {
        BillingMeters model =
            BinaryData
                .fromString("{\"meterParameter\":\"t\",\"meter\":\"fhpagmhrskdsnf\",\"unit\":\"doakgtdlmkkzevdl\"}")
                .toObject(BillingMeters.class);
        Assertions.assertEquals("t", model.meterParameter());
        Assertions.assertEquals("fhpagmhrskdsnf", model.meter());
        Assertions.assertEquals("doakgtdlmkkzevdl", model.unit());
    }

    @Test
    public void testSerialize() {
        BillingMeters model =
            new BillingMeters().withMeterParameter("t").withMeter("fhpagmhrskdsnf").withUnit("doakgtdlmkkzevdl");
        model = BinaryData.fromObject(model).toObject(BillingMeters.class);
        Assertions.assertEquals("t", model.meterParameter());
        Assertions.assertEquals("fhpagmhrskdsnf", model.meter());
        Assertions.assertEquals("doakgtdlmkkzevdl", model.unit());
    }
}
