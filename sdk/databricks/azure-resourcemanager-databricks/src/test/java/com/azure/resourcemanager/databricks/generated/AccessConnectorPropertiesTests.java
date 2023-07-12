// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databricks.models.AccessConnectorProperties;

public final class AccessConnectorPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccessConnectorProperties model =
            BinaryData.fromString("{\"provisioningState\":\"Ready\"}").toObject(AccessConnectorProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccessConnectorProperties model = new AccessConnectorProperties();
        model = BinaryData.fromObject(model).toObject(AccessConnectorProperties.class);
    }
}
