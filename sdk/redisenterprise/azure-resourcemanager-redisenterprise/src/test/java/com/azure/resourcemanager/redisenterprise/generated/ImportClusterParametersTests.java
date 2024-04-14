// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.redisenterprise.models.ImportClusterParameters;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ImportClusterParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImportClusterParameters model
            = BinaryData.fromString("{\"sasUris\":[\"ionle\",\"x\"]}").toObject(ImportClusterParameters.class);
        Assertions.assertEquals("ionle", model.sasUris().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImportClusterParameters model = new ImportClusterParameters().withSasUris(Arrays.asList("ionle", "x"));
        model = BinaryData.fromObject(model).toObject(ImportClusterParameters.class);
        Assertions.assertEquals("ionle", model.sasUris().get(0));
    }
}
