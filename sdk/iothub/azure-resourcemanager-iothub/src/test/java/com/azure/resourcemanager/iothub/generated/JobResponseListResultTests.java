// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.fluent.models.JobResponseInner;
import com.azure.resourcemanager.iothub.models.JobResponseListResult;
import java.util.Arrays;

public final class JobResponseListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobResponseListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"jobId\":\"wgqwgxhn\",\"startTimeUtc\":\"Sun, 10 Oct 2021 16:17:48"
                        + " GMT\",\"endTimeUtc\":\"Mon, 23 Aug 2021 08:34:37"
                        + " GMT\",\"type\":\"export\",\"status\":\"enqueued\",\"failureReason\":\"gklwn\",\"statusMessage\":\"hjdauwhvylwz\",\"parentJobId\":\"dhxujznbmpo\"},{\"jobId\":\"wpr\",\"startTimeUtc\":\"Sun,"
                        + " 10 Jan 2021 20:10:28 GMT\",\"endTimeUtc\":\"Tue, 11 May 2021 15:12:41"
                        + " GMT\",\"type\":\"import\",\"status\":\"enqueued\",\"failureReason\":\"j\",\"statusMessage\":\"hfxobbcswsrtj\",\"parentJobId\":\"plrbpbewtghf\"}],\"nextLink\":\"lcgwxzvlvqh\"}")
                .toObject(JobResponseListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobResponseListResult model =
            new JobResponseListResult().withValue(Arrays.asList(new JobResponseInner(), new JobResponseInner()));
        model = BinaryData.fromObject(model).toObject(JobResponseListResult.class);
    }
}
