// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.QueuePurgesNotInAllowedRange;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class QueuePurgesNotInAllowedRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QueuePurgesNotInAllowedRange model =
            BinaryData
                .fromString(
                    "{\"ruleType\":\"QueuePurgesNotInAllowedRange\",\"timeWindowSize\":\"PT46H8M28S\",\"minThreshold\":1596956883,\"maxThreshold\":2124553044,\"displayName\":\"xqiubxdukecpx\",\"description\":\"zvdhctmmkosz\",\"isEnabled\":true}")
                .toObject(QueuePurgesNotInAllowedRange.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals(1596956883, model.minThreshold());
        Assertions.assertEquals(2124553044, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT46H8M28S"), model.timeWindowSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QueuePurgesNotInAllowedRange model =
            new QueuePurgesNotInAllowedRange()
                .withIsEnabled(true)
                .withMinThreshold(1596956883)
                .withMaxThreshold(2124553044)
                .withTimeWindowSize(Duration.parse("PT46H8M28S"));
        model = BinaryData.fromObject(model).toObject(QueuePurgesNotInAllowedRange.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals(1596956883, model.minThreshold());
        Assertions.assertEquals(2124553044, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT46H8M28S"), model.timeWindowSize());
    }
}
