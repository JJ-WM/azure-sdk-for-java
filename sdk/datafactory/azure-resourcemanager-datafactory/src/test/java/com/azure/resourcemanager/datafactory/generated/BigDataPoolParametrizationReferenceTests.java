// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.BigDataPoolParametrizationReference;
import com.azure.resourcemanager.datafactory.models.BigDataPoolReferenceType;
import org.junit.jupiter.api.Assertions;

public final class BigDataPoolParametrizationReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BigDataPoolParametrizationReference model
            = BinaryData.fromString("{\"type\":\"BigDataPoolReference\",\"referenceName\":\"datacuiipnszrrmq\"}")
                .toObject(BigDataPoolParametrizationReference.class);
        Assertions.assertEquals(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BigDataPoolParametrizationReference model = new BigDataPoolParametrizationReference()
            .withType(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE).withReferenceName("datacuiipnszrrmq");
        model = BinaryData.fromObject(model).toObject(BigDataPoolParametrizationReference.class);
        Assertions.assertEquals(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE, model.type());
    }
}
