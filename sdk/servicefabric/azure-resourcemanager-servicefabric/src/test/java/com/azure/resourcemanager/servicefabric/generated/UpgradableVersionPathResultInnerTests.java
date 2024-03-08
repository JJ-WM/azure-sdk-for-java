// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.fluent.models.UpgradableVersionPathResultInner;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UpgradableVersionPathResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpgradableVersionPathResultInner model = BinaryData.fromString("{\"supportedPath\":[\"gpbtoqcjmklj\"]}")
            .toObject(UpgradableVersionPathResultInner.class);
        Assertions.assertEquals("gpbtoqcjmklj", model.supportedPath().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpgradableVersionPathResultInner model
            = new UpgradableVersionPathResultInner().withSupportedPath(Arrays.asList("gpbtoqcjmklj"));
        model = BinaryData.fromObject(model).toObject(UpgradableVersionPathResultInner.class);
        Assertions.assertEquals("gpbtoqcjmklj", model.supportedPath().get(0));
    }
}
