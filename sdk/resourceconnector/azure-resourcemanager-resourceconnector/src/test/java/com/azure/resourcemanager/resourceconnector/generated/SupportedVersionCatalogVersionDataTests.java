// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourceconnector.models.SupportedVersionCatalogVersionData;

public final class SupportedVersionCatalogVersionDataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SupportedVersionCatalogVersionData model =
            BinaryData
                .fromString(
                    "{\"audience\":\"itnwuizgazxufi\",\"catalog\":\"ckyfih\",\"offer\":\"idf\",\"version\":\"wdzuhtymwisd\"}")
                .toObject(SupportedVersionCatalogVersionData.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SupportedVersionCatalogVersionData model = new SupportedVersionCatalogVersionData();
        model = BinaryData.fromObject(model).toObject(SupportedVersionCatalogVersionData.class);
    }
}
