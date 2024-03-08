// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.Summary;
import com.azure.resourcemanager.resourcemover.models.SummaryCollection;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SummaryCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SummaryCollection model =
            BinaryData
                .fromString("{\"fieldName\":\"nzscxa\",\"summary\":[{\"count\":2024300309,\"item\":\"cbonqvpk\"}]}")
                .toObject(SummaryCollection.class);
        Assertions.assertEquals("nzscxa", model.fieldName());
        Assertions.assertEquals(2024300309, model.summary().get(0).count());
        Assertions.assertEquals("cbonqvpk", model.summary().get(0).item());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SummaryCollection model =
            new SummaryCollection()
                .withFieldName("nzscxa")
                .withSummary(Arrays.asList(new Summary().withCount(2024300309).withItem("cbonqvpk")));
        model = BinaryData.fromObject(model).toObject(SummaryCollection.class);
        Assertions.assertEquals("nzscxa", model.fieldName());
        Assertions.assertEquals(2024300309, model.summary().get(0).count());
        Assertions.assertEquals("cbonqvpk", model.summary().get(0).item());
    }
}
