// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VMwareCbtResyncInput;
import org.junit.jupiter.api.Assertions;

public final class VMwareCbtResyncInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VMwareCbtResyncInput model =
            BinaryData
                .fromString("{\"instanceType\":\"VMwareCbt\",\"skipCbtReset\":\"wgsqufmjxcyoseqc\"}")
                .toObject(VMwareCbtResyncInput.class);
        Assertions.assertEquals("wgsqufmjxcyoseqc", model.skipCbtReset());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VMwareCbtResyncInput model = new VMwareCbtResyncInput().withSkipCbtReset("wgsqufmjxcyoseqc");
        model = BinaryData.fromObject(model).toObject(VMwareCbtResyncInput.class);
        Assertions.assertEquals("wgsqufmjxcyoseqc", model.skipCbtReset());
    }
}
