// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabErrorInfo;

public final class MabErrorInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MabErrorInfo model =
            BinaryData
                .fromString(
                    "{\"errorString\":\"bahhpzpofoiyjw\",\"recommendations\":[\"lkmkkholvdndvi\",\"uogphuartvtiuky\"]}")
                .toObject(MabErrorInfo.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MabErrorInfo model = new MabErrorInfo();
        model = BinaryData.fromObject(model).toObject(MabErrorInfo.class);
    }
}
