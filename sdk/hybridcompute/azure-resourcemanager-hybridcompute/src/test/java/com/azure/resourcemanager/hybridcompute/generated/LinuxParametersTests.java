// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.LinuxParameters;
import com.azure.resourcemanager.hybridcompute.models.VMGuestPatchClassificationLinux;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LinuxParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LinuxParameters model =
            BinaryData
                .fromString(
                    "{\"classificationsToInclude\":[\"Other\",\"Other\",\"Security\"],\"packageNameMasksToInclude\":[\"bfs\"],\"packageNameMasksToExclude\":[\"butr\"]}")
                .toObject(LinuxParameters.class);
        Assertions.assertEquals(VMGuestPatchClassificationLinux.OTHER, model.classificationsToInclude().get(0));
        Assertions.assertEquals("bfs", model.packageNameMasksToInclude().get(0));
        Assertions.assertEquals("butr", model.packageNameMasksToExclude().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LinuxParameters model =
            new LinuxParameters()
                .withClassificationsToInclude(
                    Arrays
                        .asList(
                            VMGuestPatchClassificationLinux.OTHER,
                            VMGuestPatchClassificationLinux.OTHER,
                            VMGuestPatchClassificationLinux.SECURITY))
                .withPackageNameMasksToInclude(Arrays.asList("bfs"))
                .withPackageNameMasksToExclude(Arrays.asList("butr"));
        model = BinaryData.fromObject(model).toObject(LinuxParameters.class);
        Assertions.assertEquals(VMGuestPatchClassificationLinux.OTHER, model.classificationsToInclude().get(0));
        Assertions.assertEquals("bfs", model.packageNameMasksToInclude().get(0));
        Assertions.assertEquals("butr", model.packageNameMasksToExclude().get(0));
    }
}
