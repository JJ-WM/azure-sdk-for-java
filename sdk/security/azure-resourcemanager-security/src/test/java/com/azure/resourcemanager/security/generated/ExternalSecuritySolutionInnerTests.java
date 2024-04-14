// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.ExternalSecuritySolutionInner;

public final class ExternalSecuritySolutionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExternalSecuritySolutionInner model = BinaryData.fromString(
            "{\"kind\":\"ExternalSecuritySolution\",\"location\":\"lzbnobrqlpbcjt\",\"id\":\"pzuyudivbxnh\",\"name\":\"qeae\",\"type\":\"nqelwgdhuru\"}")
            .toObject(ExternalSecuritySolutionInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExternalSecuritySolutionInner model = new ExternalSecuritySolutionInner();
        model = BinaryData.fromObject(model).toObject(ExternalSecuritySolutionInner.class);
    }
}
