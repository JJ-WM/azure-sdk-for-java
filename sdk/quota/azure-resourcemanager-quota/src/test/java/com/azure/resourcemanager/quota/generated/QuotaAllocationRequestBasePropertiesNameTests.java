// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quota.fluent.models.QuotaAllocationRequestBasePropertiesName;

public final class QuotaAllocationRequestBasePropertiesNameTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QuotaAllocationRequestBasePropertiesName model
            = BinaryData.fromString("{\"value\":\"yggdtjixh\",\"localizedValue\":\"uofqwe\"}")
                .toObject(QuotaAllocationRequestBasePropertiesName.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QuotaAllocationRequestBasePropertiesName model = new QuotaAllocationRequestBasePropertiesName();
        model = BinaryData.fromObject(model).toObject(QuotaAllocationRequestBasePropertiesName.class);
    }
}
