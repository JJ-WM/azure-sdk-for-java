// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.ListRecoveryPointsRecommendedForMoveRequest;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ListRecoveryPointsRecommendedForMoveRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ListRecoveryPointsRecommendedForMoveRequest model
            = BinaryData.fromString("{\"objectType\":\"elvezrypq\",\"excludedRPList\":[\"eokerqwkyhkobopg\"]}")
                .toObject(ListRecoveryPointsRecommendedForMoveRequest.class);
        Assertions.assertEquals("elvezrypq", model.objectType());
        Assertions.assertEquals("eokerqwkyhkobopg", model.excludedRPList().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ListRecoveryPointsRecommendedForMoveRequest model
            = new ListRecoveryPointsRecommendedForMoveRequest().withObjectType("elvezrypq")
                .withExcludedRPList(Arrays.asList("eokerqwkyhkobopg"));
        model = BinaryData.fromObject(model).toObject(ListRecoveryPointsRecommendedForMoveRequest.class);
        Assertions.assertEquals("elvezrypq", model.objectType());
        Assertions.assertEquals("eokerqwkyhkobopg", model.excludedRPList().get(0));
    }
}
