// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.fluent.models.FleetMemberInner;
import com.azure.resourcemanager.containerservicefleet.models.FleetMemberListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FleetMemberListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FleetMemberListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"clusterResourceId\":\"kocrcjdkwtnhx\",\"group\":\"jbiksqrglssai\",\"provisioningState\":\"Leaving\"},\"eTag\":\"wnzlljfmppeeb\",\"id\":\"gxsabkyq\",\"name\":\"uujitcjc\",\"type\":\"dzevndhkrw\"},{\"properties\":{\"clusterResourceId\":\"appd\",\"group\":\"dkvwrwjfe\",\"provisioningState\":\"Succeeded\"},\"eTag\":\"utjeltmrldhugj\",\"id\":\"datqxhocdgeabl\",\"name\":\"phut\",\"type\":\"cndvkaozwyiftyhx\"}],\"nextLink\":\"rokft\"}")
                .toObject(FleetMemberListResult.class);
        Assertions.assertEquals("kocrcjdkwtnhx", model.value().get(0).clusterResourceId());
        Assertions.assertEquals("jbiksqrglssai", model.value().get(0).group());
        Assertions.assertEquals("rokft", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FleetMemberListResult model =
            new FleetMemberListResult()
                .withValue(
                    Arrays
                        .asList(
                            new FleetMemberInner().withClusterResourceId("kocrcjdkwtnhx").withGroup("jbiksqrglssai"),
                            new FleetMemberInner().withClusterResourceId("appd").withGroup("dkvwrwjfe")))
                .withNextLink("rokft");
        model = BinaryData.fromObject(model).toObject(FleetMemberListResult.class);
        Assertions.assertEquals("kocrcjdkwtnhx", model.value().get(0).clusterResourceId());
        Assertions.assertEquals("jbiksqrglssai", model.value().get(0).group());
        Assertions.assertEquals("rokft", model.nextLink());
    }
}
