// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.HttpC2DRejectedMessagesNotInAllowedRange;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class HttpC2DRejectedMessagesNotInAllowedRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HttpC2DRejectedMessagesNotInAllowedRange model = BinaryData.fromString(
            "{\"ruleType\":\"HttpC2DRejectedMessagesNotInAllowedRange\",\"timeWindowSize\":\"PT237H19M3S\",\"minThreshold\":846490102,\"maxThreshold\":1974680731,\"displayName\":\"rk\",\"description\":\"ehzlry\",\"isEnabled\":false}")
            .toObject(HttpC2DRejectedMessagesNotInAllowedRange.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(846490102, model.minThreshold());
        Assertions.assertEquals(1974680731, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT237H19M3S"), model.timeWindowSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HttpC2DRejectedMessagesNotInAllowedRange model
            = new HttpC2DRejectedMessagesNotInAllowedRange().withIsEnabled(false).withMinThreshold(846490102)
                .withMaxThreshold(1974680731).withTimeWindowSize(Duration.parse("PT237H19M3S"));
        model = BinaryData.fromObject(model).toObject(HttpC2DRejectedMessagesNotInAllowedRange.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(846490102, model.minThreshold());
        Assertions.assertEquals(1974680731, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT237H19M3S"), model.timeWindowSize());
    }
}
