// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.models.ExperimentExecutionListResult;

public final class ExperimentExecutionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExperimentExecutionListResult model = BinaryData.fromString(
            "{\"value\":[{\"type\":\"nojvknmefqsg\",\"id\":\"ah\",\"name\":\"jyzhpvgq\",\"properties\":{\"status\":\"rvxdjzlmw\",\"startedAt\":\"2021-07-11T22:18:52Z\",\"stoppedAt\":\"2021-11-03T14:53:04Z\"}},{\"type\":\"hzovawjvzunlut\",\"id\":\"n\",\"name\":\"nxipeil\",\"properties\":{\"status\":\"uaejxdultsk\",\"startedAt\":\"2021-11-26T08:31:17Z\",\"stoppedAt\":\"2021-05-16T15:29:03Z\"}},{\"type\":\"umveekgpwozuhkf\",\"id\":\"sjyofdx\",\"name\":\"us\",\"properties\":{\"status\":\"ouwaboekqvkeln\",\"startedAt\":\"2021-02-02T03:25:54Z\",\"stoppedAt\":\"2020-12-28T23:28:21Z\"}},{\"type\":\"yjsflhhcaalnji\",\"id\":\"sxyawjoyaqcs\",\"name\":\"jpkiidzyexznelix\",\"properties\":{\"status\":\"ztfolhbnxk\",\"startedAt\":\"2021-03-24T05:03:40Z\",\"stoppedAt\":\"2021-09-05T19:55:42Z\"}}],\"nextLink\":\"ppg\"}")
            .toObject(ExperimentExecutionListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExperimentExecutionListResult model = new ExperimentExecutionListResult();
        model = BinaryData.fromObject(model).toObject(ExperimentExecutionListResult.class);
    }
}
