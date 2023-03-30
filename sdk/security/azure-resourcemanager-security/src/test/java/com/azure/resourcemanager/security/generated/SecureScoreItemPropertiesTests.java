// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.SecureScoreItemProperties;

public final class SecureScoreItemPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecureScoreItemProperties model =
            BinaryData
                .fromString(
                    "{\"displayName\":\"ohqfzizv\",\"score\":{\"max\":290394700,\"current\":79.43221808867246,\"percentage\":47.38718025336222},\"weight\":6456868144716407636}")
                .toObject(SecureScoreItemProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecureScoreItemProperties model = new SecureScoreItemProperties();
        model = BinaryData.fromObject(model).toObject(SecureScoreItemProperties.class);
    }
}