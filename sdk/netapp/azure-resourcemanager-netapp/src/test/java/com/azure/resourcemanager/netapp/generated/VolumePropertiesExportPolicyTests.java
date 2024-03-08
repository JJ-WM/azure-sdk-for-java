// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.ChownMode;
import com.azure.resourcemanager.netapp.models.ExportPolicyRule;
import com.azure.resourcemanager.netapp.models.VolumePropertiesExportPolicy;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VolumePropertiesExportPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumePropertiesExportPolicy model = BinaryData.fromString(
            "{\"rules\":[{\"ruleIndex\":561759175,\"unixReadOnly\":false,\"unixReadWrite\":true,\"kerberos5ReadOnly\":false,\"kerberos5ReadWrite\":false,\"kerberos5iReadOnly\":false,\"kerberos5iReadWrite\":true,\"kerberos5pReadOnly\":false,\"kerberos5pReadWrite\":false,\"cifs\":true,\"nfsv3\":true,\"nfsv41\":false,\"allowedClients\":\"jzbexilzznfq\",\"hasRootAccess\":false,\"chownMode\":\"Restricted\"}]}")
            .toObject(VolumePropertiesExportPolicy.class);
        Assertions.assertEquals(561759175, model.rules().get(0).ruleIndex());
        Assertions.assertEquals(false, model.rules().get(0).unixReadOnly());
        Assertions.assertEquals(true, model.rules().get(0).unixReadWrite());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5ReadOnly());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5ReadWrite());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5IReadOnly());
        Assertions.assertEquals(true, model.rules().get(0).kerberos5IReadWrite());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5PReadOnly());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5PReadWrite());
        Assertions.assertEquals(true, model.rules().get(0).cifs());
        Assertions.assertEquals(true, model.rules().get(0).nfsv3());
        Assertions.assertEquals(false, model.rules().get(0).nfsv41());
        Assertions.assertEquals("jzbexilzznfq", model.rules().get(0).allowedClients());
        Assertions.assertEquals(false, model.rules().get(0).hasRootAccess());
        Assertions.assertEquals(ChownMode.RESTRICTED, model.rules().get(0).chownMode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumePropertiesExportPolicy model = new VolumePropertiesExportPolicy()
            .withRules(Arrays.asList(new ExportPolicyRule().withRuleIndex(561759175).withUnixReadOnly(false)
                .withUnixReadWrite(true).withKerberos5ReadOnly(false).withKerberos5ReadWrite(false)
                .withKerberos5IReadOnly(false).withKerberos5IReadWrite(true).withKerberos5PReadOnly(false)
                .withKerberos5PReadWrite(false).withCifs(true).withNfsv3(true).withNfsv41(false)
                .withAllowedClients("jzbexilzznfq").withHasRootAccess(false).withChownMode(ChownMode.RESTRICTED)));
        model = BinaryData.fromObject(model).toObject(VolumePropertiesExportPolicy.class);
        Assertions.assertEquals(561759175, model.rules().get(0).ruleIndex());
        Assertions.assertEquals(false, model.rules().get(0).unixReadOnly());
        Assertions.assertEquals(true, model.rules().get(0).unixReadWrite());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5ReadOnly());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5ReadWrite());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5IReadOnly());
        Assertions.assertEquals(true, model.rules().get(0).kerberos5IReadWrite());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5PReadOnly());
        Assertions.assertEquals(false, model.rules().get(0).kerberos5PReadWrite());
        Assertions.assertEquals(true, model.rules().get(0).cifs());
        Assertions.assertEquals(true, model.rules().get(0).nfsv3());
        Assertions.assertEquals(false, model.rules().get(0).nfsv41());
        Assertions.assertEquals("jzbexilzznfq", model.rules().get(0).allowedClients());
        Assertions.assertEquals(false, model.rules().get(0).hasRootAccess());
        Assertions.assertEquals(ChownMode.RESTRICTED, model.rules().get(0).chownMode());
    }
}
