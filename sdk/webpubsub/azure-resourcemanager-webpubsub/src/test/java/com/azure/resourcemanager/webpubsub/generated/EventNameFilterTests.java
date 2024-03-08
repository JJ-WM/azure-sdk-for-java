// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.EventNameFilter;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class EventNameFilterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EventNameFilter model =
            BinaryData
                .fromString(
                    "{\"type\":\"EventName\",\"systemEvents\":[\"ivwzjbhyzs\",\"jrkambtrnegvmnv\",\"q\",\"qvldspastjbkkd\"],\"userEventPattern\":\"lves\"}")
                .toObject(EventNameFilter.class);
        Assertions.assertEquals("ivwzjbhyzs", model.systemEvents().get(0));
        Assertions.assertEquals("lves", model.userEventPattern());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EventNameFilter model =
            new EventNameFilter()
                .withSystemEvents(Arrays.asList("ivwzjbhyzs", "jrkambtrnegvmnv", "q", "qvldspastjbkkd"))
                .withUserEventPattern("lves");
        model = BinaryData.fromObject(model).toObject(EventNameFilter.class);
        Assertions.assertEquals("ivwzjbhyzs", model.systemEvents().get(0));
        Assertions.assertEquals("lves", model.userEventPattern());
    }
}
