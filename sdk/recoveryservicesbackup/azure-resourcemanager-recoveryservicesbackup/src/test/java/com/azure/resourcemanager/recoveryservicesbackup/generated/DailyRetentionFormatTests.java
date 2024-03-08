// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DailyRetentionFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.Day;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DailyRetentionFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DailyRetentionFormat model = BinaryData.fromString(
            "{\"daysOfTheMonth\":[{\"date\":961484418,\"isLast\":false},{\"date\":32509021,\"isLast\":false},{\"date\":1316408271,\"isLast\":false},{\"date\":1128390927,\"isLast\":true}]}")
            .toObject(DailyRetentionFormat.class);
        Assertions.assertEquals(961484418, model.daysOfTheMonth().get(0).date());
        Assertions.assertEquals(false, model.daysOfTheMonth().get(0).isLast());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DailyRetentionFormat model = new DailyRetentionFormat().withDaysOfTheMonth(Arrays.asList(
            new Day().withDate(961484418).withIsLast(false), new Day().withDate(32509021).withIsLast(false),
            new Day().withDate(1316408271).withIsLast(false), new Day().withDate(1128390927).withIsLast(true)));
        model = BinaryData.fromObject(model).toObject(DailyRetentionFormat.class);
        Assertions.assertEquals(961484418, model.daysOfTheMonth().get(0).date());
        Assertions.assertEquals(false, model.daysOfTheMonth().get(0).isLast());
    }
}
