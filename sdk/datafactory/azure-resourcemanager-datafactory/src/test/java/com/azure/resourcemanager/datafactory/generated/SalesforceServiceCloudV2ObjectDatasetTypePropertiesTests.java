// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.SalesforceServiceCloudV2ObjectDatasetTypeProperties;

public final class SalesforceServiceCloudV2ObjectDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceServiceCloudV2ObjectDatasetTypeProperties model
            = BinaryData.fromString("{\"objectApiName\":\"dataqct\",\"reportId\":\"dataidkxz\"}")
                .toObject(SalesforceServiceCloudV2ObjectDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceServiceCloudV2ObjectDatasetTypeProperties model
            = new SalesforceServiceCloudV2ObjectDatasetTypeProperties().withObjectApiName("dataqct")
                .withReportId("dataidkxz");
        model = BinaryData.fromObject(model).toObject(SalesforceServiceCloudV2ObjectDatasetTypeProperties.class);
    }
}
