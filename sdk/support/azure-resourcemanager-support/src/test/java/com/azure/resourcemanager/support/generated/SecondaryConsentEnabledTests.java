// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.models.SecondaryConsentEnabled;
import org.junit.jupiter.api.Assertions;

public final class SecondaryConsentEnabledTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecondaryConsentEnabled model
            = BinaryData.fromString("{\"description\":\"bbjfddgmbmbexp\",\"type\":\"htqqrolfp\"}")
                .toObject(SecondaryConsentEnabled.class);
        Assertions.assertEquals("bbjfddgmbmbexp", model.description());
        Assertions.assertEquals("htqqrolfp", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecondaryConsentEnabled model
            = new SecondaryConsentEnabled().withDescription("bbjfddgmbmbexp").withType("htqqrolfp");
        model = BinaryData.fromObject(model).toObject(SecondaryConsentEnabled.class);
        Assertions.assertEquals("bbjfddgmbmbexp", model.description());
        Assertions.assertEquals("htqqrolfp", model.type());
    }
}
