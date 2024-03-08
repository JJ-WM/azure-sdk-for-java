// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.DppResource;

public final class DppResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DppResource model
            = BinaryData.fromString("{\"id\":\"dwtiukbldngkp\",\"name\":\"cipazyxoegukgjnp\",\"type\":\"ucgygevqz\"}")
                .toObject(DppResource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DppResource model = new DppResource();
        model = BinaryData.fromObject(model).toObject(DppResource.class);
    }
}
