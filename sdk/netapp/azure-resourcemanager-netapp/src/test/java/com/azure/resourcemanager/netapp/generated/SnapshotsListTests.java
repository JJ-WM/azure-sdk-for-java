// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SnapshotInner;
import com.azure.resourcemanager.netapp.models.SnapshotsList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SnapshotsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnapshotsList model = BinaryData.fromString(
            "{\"value\":[{\"location\":\"q\",\"properties\":{\"snapshotId\":\"vq\",\"created\":\"2021-03-26T11:46:42Z\",\"provisioningState\":\"jxywsuws\"},\"id\":\"s\",\"name\":\"dsytgadgvr\",\"type\":\"ea\"},{\"location\":\"neqn\",\"properties\":{\"snapshotId\":\"rwlqu\",\"created\":\"2021-04-01T07:49:28Z\",\"provisioningState\":\"qkacewii\"},\"id\":\"pubjibw\",\"name\":\"iftohqkvpu\",\"type\":\"ksgplsa\"},{\"location\":\"nynfsynljphuo\",\"properties\":{\"snapshotId\":\"dlqiyntorzih\",\"created\":\"2021-04-08T02:51:20Z\",\"provisioningState\":\"jswsrmslyz\"},\"id\":\"zbchckqqzqioxiy\",\"name\":\"uiizynke\",\"type\":\"yatrwy\"}]}")
            .toObject(SnapshotsList.class);
        Assertions.assertEquals("q", model.value().get(0).location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnapshotsList model = new SnapshotsList().withValue(Arrays.asList(new SnapshotInner().withLocation("q"),
            new SnapshotInner().withLocation("neqn"), new SnapshotInner().withLocation("nynfsynljphuo")));
        model = BinaryData.fromObject(model).toObject(SnapshotsList.class);
        Assertions.assertEquals("q", model.value().get(0).location());
    }
}
