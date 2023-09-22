// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DiskDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.OSDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PresenceStatus;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VmmVirtualMachineDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VmmVirtualMachineDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VmmVirtualMachineDetails model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"VmmVirtualMachine\",\"sourceItemId\":\"mmofbnivdqtkyk\",\"generation\":\"xnlsf\",\"osDetails\":{\"osType\":\"scaccptbz\",\"productType\":\"x\",\"osEdition\":\"xxicee\",\"oSVersion\":\"jwyuveox\",\"oSMajorVersion\":\"z\",\"oSMinorVersion\":\"ahdr\"},\"diskDetails\":[{\"maxSizeMB\":2901220119484364811,\"vhdType\":\"xbiv\",\"vhdId\":\"gxmbrygmwibiosiq\",\"vhdName\":\"kqfdqwdrtx\"}],\"hasPhysicalDisk\":\"NotPresent\",\"hasFibreChannelAdapter\":\"Unknown\",\"hasSharedVhd\":\"Present\",\"hyperVHostId\":\"co\"}")
                .toObject(VmmVirtualMachineDetails.class);
        Assertions.assertEquals("mmofbnivdqtkyk", model.sourceItemId());
        Assertions.assertEquals("xnlsf", model.generation());
        Assertions.assertEquals("scaccptbz", model.osDetails().osType());
        Assertions.assertEquals("x", model.osDetails().productType());
        Assertions.assertEquals("xxicee", model.osDetails().osEdition());
        Assertions.assertEquals("jwyuveox", model.osDetails().oSVersion());
        Assertions.assertEquals("z", model.osDetails().oSMajorVersion());
        Assertions.assertEquals("ahdr", model.osDetails().oSMinorVersion());
        Assertions.assertEquals(2901220119484364811L, model.diskDetails().get(0).maxSizeMB());
        Assertions.assertEquals("xbiv", model.diskDetails().get(0).vhdType());
        Assertions.assertEquals("gxmbrygmwibiosiq", model.diskDetails().get(0).vhdId());
        Assertions.assertEquals("kqfdqwdrtx", model.diskDetails().get(0).vhdName());
        Assertions.assertEquals(PresenceStatus.NOT_PRESENT, model.hasPhysicalDisk());
        Assertions.assertEquals(PresenceStatus.UNKNOWN, model.hasFibreChannelAdapter());
        Assertions.assertEquals(PresenceStatus.PRESENT, model.hasSharedVhd());
        Assertions.assertEquals("co", model.hyperVHostId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VmmVirtualMachineDetails model =
            new VmmVirtualMachineDetails()
                .withSourceItemId("mmofbnivdqtkyk")
                .withGeneration("xnlsf")
                .withOsDetails(
                    new OSDetails()
                        .withOsType("scaccptbz")
                        .withProductType("x")
                        .withOsEdition("xxicee")
                        .withOSVersion("jwyuveox")
                        .withOSMajorVersion("z")
                        .withOSMinorVersion("ahdr"))
                .withDiskDetails(
                    Arrays
                        .asList(
                            new DiskDetails()
                                .withMaxSizeMB(2901220119484364811L)
                                .withVhdType("xbiv")
                                .withVhdId("gxmbrygmwibiosiq")
                                .withVhdName("kqfdqwdrtx")))
                .withHasPhysicalDisk(PresenceStatus.NOT_PRESENT)
                .withHasFibreChannelAdapter(PresenceStatus.UNKNOWN)
                .withHasSharedVhd(PresenceStatus.PRESENT)
                .withHyperVHostId("co");
        model = BinaryData.fromObject(model).toObject(VmmVirtualMachineDetails.class);
        Assertions.assertEquals("mmofbnivdqtkyk", model.sourceItemId());
        Assertions.assertEquals("xnlsf", model.generation());
        Assertions.assertEquals("scaccptbz", model.osDetails().osType());
        Assertions.assertEquals("x", model.osDetails().productType());
        Assertions.assertEquals("xxicee", model.osDetails().osEdition());
        Assertions.assertEquals("jwyuveox", model.osDetails().oSVersion());
        Assertions.assertEquals("z", model.osDetails().oSMajorVersion());
        Assertions.assertEquals("ahdr", model.osDetails().oSMinorVersion());
        Assertions.assertEquals(2901220119484364811L, model.diskDetails().get(0).maxSizeMB());
        Assertions.assertEquals("xbiv", model.diskDetails().get(0).vhdType());
        Assertions.assertEquals("gxmbrygmwibiosiq", model.diskDetails().get(0).vhdId());
        Assertions.assertEquals("kqfdqwdrtx", model.diskDetails().get(0).vhdName());
        Assertions.assertEquals(PresenceStatus.NOT_PRESENT, model.hasPhysicalDisk());
        Assertions.assertEquals(PresenceStatus.UNKNOWN, model.hasFibreChannelAdapter());
        Assertions.assertEquals(PresenceStatus.PRESENT, model.hasSharedVhd());
        Assertions.assertEquals("co", model.hyperVHostId());
    }
}
