// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.MachineRunCommandScriptSource;
import com.azure.resourcemanager.hybridcompute.models.RunCommandManagedIdentity;
import org.junit.jupiter.api.Assertions;

public final class MachineRunCommandScriptSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MachineRunCommandScriptSource model = BinaryData.fromString(
            "{\"script\":\"fbtkuwhhmhyk\",\"scriptUri\":\"oxafn\",\"commandId\":\"lpichk\",\"scriptUriManagedIdentity\":{\"clientId\":\"kcdyhbpk\",\"objectId\":\"wdreqnovvqfovl\"}}")
            .toObject(MachineRunCommandScriptSource.class);
        Assertions.assertEquals("fbtkuwhhmhyk", model.script());
        Assertions.assertEquals("oxafn", model.scriptUri());
        Assertions.assertEquals("lpichk", model.commandId());
        Assertions.assertEquals("kcdyhbpk", model.scriptUriManagedIdentity().clientId());
        Assertions.assertEquals("wdreqnovvqfovl", model.scriptUriManagedIdentity().objectId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MachineRunCommandScriptSource model = new MachineRunCommandScriptSource().withScript("fbtkuwhhmhyk")
            .withScriptUri("oxafn")
            .withCommandId("lpichk")
            .withScriptUriManagedIdentity(
                new RunCommandManagedIdentity().withClientId("kcdyhbpk").withObjectId("wdreqnovvqfovl"));
        model = BinaryData.fromObject(model).toObject(MachineRunCommandScriptSource.class);
        Assertions.assertEquals("fbtkuwhhmhyk", model.script());
        Assertions.assertEquals("oxafn", model.scriptUri());
        Assertions.assertEquals("lpichk", model.commandId());
        Assertions.assertEquals("kcdyhbpk", model.scriptUriManagedIdentity().clientId());
        Assertions.assertEquals("wdreqnovvqfovl", model.scriptUriManagedIdentity().objectId());
    }
}
