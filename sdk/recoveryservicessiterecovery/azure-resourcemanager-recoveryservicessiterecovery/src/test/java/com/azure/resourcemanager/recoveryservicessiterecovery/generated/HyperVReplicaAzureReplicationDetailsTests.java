// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AzureVmDiskDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.HyperVReplicaAzureManagedDiskDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.HyperVReplicaAzureReplicationDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InitialReplicationDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.IpConfigDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.OSDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.OSUpgradeSupportedVersions;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VMNicDetails;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HyperVReplicaAzureReplicationDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HyperVReplicaAzureReplicationDetails model = BinaryData.fromString(
            "{\"instanceType\":\"HyperVReplicaAzure\",\"azureVmDiskDetails\":[{\"vhdType\":\"qkwaruwd\",\"vhdId\":\"qzxoebwgjxbi\",\"diskId\":\"nbau\",\"vhdName\":\"tzvp\",\"maxSizeMB\":\"lozkxbzrp\",\"targetDiskLocation\":\"plssanbtttk\",\"targetDiskName\":\"uxunrswg\",\"lunId\":\"jhboyikebhuhks\",\"diskEncryptionSetId\":\"wlokhueoijyzcq\",\"customTargetDiskName\":\"zqzu\"}],\"recoveryAzureVmName\":\"s\",\"recoveryAzureVMSize\":\"ej\",\"recoveryAzureStorageAccount\":\"dwtfx\",\"recoveryAzureLogStorageAccountId\":\"pqa\",\"lastReplicatedTime\":\"2021-12-08T02:26:36Z\",\"rpoInSeconds\":5044054827498032259,\"lastRpoCalculatedTime\":\"2021-10-17T04:21:19Z\",\"vmId\":\"bmxsnxoc\",\"vmProtectionState\":\"llojkpoyhgwwdj\",\"vmProtectionStateDescription\":\"dbdljz\",\"initialReplicationDetails\":{\"initialReplicationType\":\"rcvuqbsgzlrqhb\",\"initialReplicationProgressPercentage\":\"qogdx\"},\"vmNics\":[{\"nicId\":\"p\",\"replicaNicId\":\"x\",\"sourceNicArmId\":\"lflec\",\"vMNetworkName\":\"inxojjlux\",\"recoveryVMNetworkId\":\"hilzzdzzq\",\"ipConfigs\":[{\"name\":\"za\",\"isPrimary\":true,\"subnetName\":\"ibqlotokhtvwtaz\",\"staticIPAddress\":\"cqwwxwj\",\"ipAddressType\":\"fgwhnkbtlwljs\",\"isSeletedForFailover\":true,\"recoverySubnetName\":\"sn\",\"recoveryStaticIPAddress\":\"kpwolg\",\"recoveryIPAddressType\":\"ubxbteogfgfiijr\",\"recoveryPublicIPAddressId\":\"wlefksxqceazfpxg\",\"recoveryLBBackendAddressPoolIds\":[\"vzvluyq\",\"aiossscyvaifp\"],\"tfoSubnetName\":\"acvfyeowps\",\"tfoStaticIPAddress\":\"tjdhsoymhpvtyq\",\"tfoPublicIPAddressId\":\"tehdpboujs\",\"tfoLBBackendAddressPoolIds\":[\"vvdshxcdedsue\",\"ygnxcgjtfrnqukt\",\"fnslnlrxsmy\",\"trwntfmtbgw\"]},{\"name\":\"xwnaz\",\"isPrimary\":true,\"subnetName\":\"drey\",\"staticIPAddress\":\"whsetwwjwzzqs\",\"ipAddressType\":\"zuukykcyqhyqq\",\"isSeletedForFailover\":false,\"recoverySubnetName\":\"ykeys\",\"recoveryStaticIPAddress\":\"wfopazdazg\",\"recoveryIPAddressType\":\"qgpewqcfutmdpvoz\",\"recoveryPublicIPAddressId\":\"qjbknl\",\"recoveryLBBackendAddressPoolIds\":[\"ctzeyowmndc\",\"v\",\"wzqauxzanhmkvf\",\"uwkudrbcp\"],\"tfoSubnetName\":\"xudqyemebunaucmc\",\"tfoStaticIPAddress\":\"tneemmjauwcgxef\",\"tfoPublicIPAddressId\":\"haitranize\",\"tfoLBBackendAddressPoolIds\":[\"udasmxubvfbng\",\"coce\",\"hpriylfm\"]}],\"selectionType\":\"trauds\",\"recoveryNetworkSecurityGroupId\":\"lcdculregpq\",\"enableAcceleratedNetworkingOnRecovery\":false,\"tfoVMNetworkId\":\"hvrztnvg\",\"tfoNetworkSecurityGroupId\":\"hqrdgrtwmewjzlpy\",\"enableAcceleratedNetworkingOnTfo\":false,\"recoveryNicName\":\"zzwjcayerzrran\",\"recoveryNicResourceGroupName\":\"bylpolwzr\",\"reuseExistingNic\":true,\"tfoRecoveryNicName\":\"l\",\"tfoRecoveryNicResourceGroupName\":\"nkfscjfn\",\"tfoReuseExistingNic\":true,\"targetNicName\":\"uagfqwtltngv\"},{\"nicId\":\"e\",\"replicaNicId\":\"trklzmijajwol\",\"sourceNicArmId\":\"s\",\"vMNetworkName\":\"ghmp\",\"recoveryVMNetworkId\":\"wl\",\"ipConfigs\":[{\"name\":\"igt\",\"isPrimary\":true,\"subnetName\":\"bxqla\",\"staticIPAddress\":\"nssovyxpav\",\"ipAddressType\":\"nievwffc\",\"isSeletedForFailover\":false,\"recoverySubnetName\":\"zslp\",\"recoveryStaticIPAddress\":\"gcbdsvalpnptw\",\"recoveryIPAddressType\":\"kx\",\"recoveryPublicIPAddressId\":\"azwu\",\"recoveryLBBackendAddressPoolIds\":[\"qvn\",\"obfelhldiuhz\",\"gqlmfaewzgi\"],\"tfoSubnetName\":\"jpxpqhttqhnmhkre\",\"tfoStaticIPAddress\":\"dsuxheqdgcrux\",\"tfoPublicIPAddressId\":\"inymmqgwokmikp\",\"tfoLBBackendAddressPoolIds\":[\"bmjxuvjipf\",\"vhax\",\"vwzaehp\"]},{\"name\":\"thd\",\"isPrimary\":true,\"subnetName\":\"etatlakf\",\"staticIPAddress\":\"ixwgiksbbvtooxrp\",\"ipAddressType\":\"wp\",\"isSeletedForFailover\":true,\"recoverySubnetName\":\"jtnhtukfac\",\"recoveryStaticIPAddress\":\"mbf\",\"recoveryIPAddressType\":\"umeezbxvqxb\",\"recoveryPublicIPAddressId\":\"vwcga\",\"recoveryLBBackendAddressPoolIds\":[\"mtmjzw\",\"uqgovsxpwwztjfm\",\"khtgfredmlscgrll\",\"cnaovjo\"],\"tfoSubnetName\":\"zhpabac\",\"tfoStaticIPAddress\":\"lyotg\",\"tfoPublicIPAddressId\":\"sxnsrqorcge\",\"tfoLBBackendAddressPoolIds\":[\"c\",\"bxeetqujxcxxqn\",\"cqjkedwqu\",\"cgojmrv\"]},{\"name\":\"wjongzs\",\"isPrimary\":false,\"subnetName\":\"rsilcchskxxkansb\",\"staticIPAddress\":\"ia\",\"ipAddressType\":\"vtojrulfuctejr\",\"isSeletedForFailover\":false,\"recoverySubnetName\":\"jzhxlyubqjrost\",\"recoveryStaticIPAddress\":\"jeqmtzzbeqrzt\",\"recoveryIPAddressType\":\"alx\",\"recoveryPublicIPAddressId\":\"habsrwrsnrh\",\"recoveryLBBackendAddressPoolIds\":[\"tiwkkvyan\"],\"tfoSubnetName\":\"vvcsemsvuvdjkqxe\",\"tfoStaticIPAddress\":\"mmlivrjjxnw\",\"tfoPublicIPAddressId\":\"chp\",\"tfoLBBackendAddressPoolIds\":[\"lehzlxpgfq\",\"wzpwiibel\",\"cerwkwbpjxljtxbu\",\"qtbxxniuisdzh\"]}],\"selectionType\":\"d\",\"recoveryNetworkSecurityGroupId\":\"pagsecnad\",\"enableAcceleratedNetworkingOnRecovery\":true,\"tfoVMNetworkId\":\"r\",\"tfoNetworkSecurityGroupId\":\"fllmqiy\",\"enableAcceleratedNetworkingOnTfo\":true,\"recoveryNicName\":\"ellnkkii\",\"recoveryNicResourceGroupName\":\"mtum\",\"reuseExistingNic\":false,\"tfoRecoveryNicName\":\"djf\",\"tfoRecoveryNicResourceGroupName\":\"xroq\",\"tfoReuseExistingNic\":true,\"targetNicName\":\"lr\"}],\"selectedRecoveryAzureNetworkId\":\"ncanlduwzor\",\"selectedSourceNicId\":\"bm\",\"encryption\":\"qk\",\"oSDetails\":{\"osType\":\"mxkqvf\",\"productType\":\"pdxcltuubwy\",\"osEdition\":\"jbowcpj\",\"oSVersion\":\"uqgixex\",\"oSMajorVersion\":\"dfbwljav\",\"oSMinorVersion\":\"erkjddv\"},\"sourceVmRamSizeInMB\":436483933,\"sourceVmCpuCount\":1692980760,\"enableRdpOnTargetOption\":\"ftcvbii\",\"recoveryAzureResourceGroupId\":\"ksdwgdnk\",\"recoveryAvailabilitySetId\":\"gmwdh\",\"targetAvailabilityZone\":\"buvczldbglzoutb\",\"targetProximityPlacementGroupId\":\"qgz\",\"useManagedDisks\":\"ajclyzgsnorbjg\",\"licenseType\":\"zjotvmrxkhlo\",\"sqlServerLicenseType\":\"vjb\",\"lastRecoveryPointReceived\":\"2021-05-11T18:13:33Z\",\"targetVmTags\":{\"iyu\":\"qayfl\",\"rswhbuubpyro\":\"snuudtelvhyibdr\"},\"seedManagedDiskTags\":{\"czevjnn\":\"oxztfwfqch\",\"mhzcgkrepdqh\":\"tagfyvrtpqp\",\"mvxqab\":\"yhwqw\",\"eoxinhgre\":\"km\"},\"targetManagedDiskTags\":{\"angp\":\"whlpuzjpceezn\",\"phmsexroq\":\"bfaxyxzlbc\",\"nfee\":\"ndktxfv\"},\"targetNicTags\":{\"bgnixxoww\":\"krie\",\"p\":\"kyfwnwpiwxeiicr\",\"dm\":\"pk\"},\"protectedManagedDisks\":[{\"diskId\":\"jvskwsdgkjg\",\"seedManagedDiskId\":\"cwrase\",\"replicaDiskType\":\"efcvo\",\"diskEncryptionSetId\":\"woqartwy\"},{\"diskId\":\"i\",\"seedManagedDiskId\":\"advatdavuqmcb\",\"replicaDiskType\":\"sfobjl\",\"diskEncryptionSetId\":\"vjezcjumvpsim\"},{\"diskId\":\"yoi\",\"seedManagedDiskId\":\"kmi\",\"replicaDiskType\":\"nnraclibbfqpspkl\",\"diskEncryptionSetId\":\"ydgnha\"},{\"diskId\":\"wuk\",\"seedManagedDiskId\":\"zgpmnma\",\"replicaDiskType\":\"ddqil\",\"diskEncryptionSetId\":\"d\"}],\"allAvailableOSUpgradeConfigurations\":[{\"supportedSourceOsVersion\":\"fpcvstclgqrvwerf\",\"supportedTargetOsVersions\":[\"smtbljjehhcif\",\"wdv\",\"tbrekqhsqhtf\"]}]}")
            .toObject(HyperVReplicaAzureReplicationDetails.class);
        Assertions.assertEquals("qkwaruwd", model.azureVmDiskDetails().get(0).vhdType());
        Assertions.assertEquals("qzxoebwgjxbi", model.azureVmDiskDetails().get(0).vhdId());
        Assertions.assertEquals("nbau", model.azureVmDiskDetails().get(0).diskId());
        Assertions.assertEquals("tzvp", model.azureVmDiskDetails().get(0).vhdName());
        Assertions.assertEquals("lozkxbzrp", model.azureVmDiskDetails().get(0).maxSizeMB());
        Assertions.assertEquals("plssanbtttk", model.azureVmDiskDetails().get(0).targetDiskLocation());
        Assertions.assertEquals("uxunrswg", model.azureVmDiskDetails().get(0).targetDiskName());
        Assertions.assertEquals("jhboyikebhuhks", model.azureVmDiskDetails().get(0).lunId());
        Assertions.assertEquals("wlokhueoijyzcq", model.azureVmDiskDetails().get(0).diskEncryptionSetId());
        Assertions.assertEquals("zqzu", model.azureVmDiskDetails().get(0).customTargetDiskName());
        Assertions.assertEquals("s", model.recoveryAzureVmName());
        Assertions.assertEquals("ej", model.recoveryAzureVMSize());
        Assertions.assertEquals("dwtfx", model.recoveryAzureStorageAccount());
        Assertions.assertEquals("pqa", model.recoveryAzureLogStorageAccountId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-08T02:26:36Z"), model.lastReplicatedTime());
        Assertions.assertEquals(5044054827498032259L, model.rpoInSeconds());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-17T04:21:19Z"), model.lastRpoCalculatedTime());
        Assertions.assertEquals("bmxsnxoc", model.vmId());
        Assertions.assertEquals("llojkpoyhgwwdj", model.vmProtectionState());
        Assertions.assertEquals("dbdljz", model.vmProtectionStateDescription());
        Assertions.assertEquals("rcvuqbsgzlrqhb", model.initialReplicationDetails().initialReplicationType());
        Assertions.assertEquals("qogdx", model.initialReplicationDetails().initialReplicationProgressPercentage());
        Assertions.assertEquals("p", model.vmNics().get(0).nicId());
        Assertions.assertEquals("x", model.vmNics().get(0).replicaNicId());
        Assertions.assertEquals("lflec", model.vmNics().get(0).sourceNicArmId());
        Assertions.assertEquals("inxojjlux", model.vmNics().get(0).vMNetworkName());
        Assertions.assertEquals("hilzzdzzq", model.vmNics().get(0).recoveryVMNetworkId());
        Assertions.assertEquals("za", model.vmNics().get(0).ipConfigs().get(0).name());
        Assertions.assertEquals(true, model.vmNics().get(0).ipConfigs().get(0).isPrimary());
        Assertions.assertEquals("ibqlotokhtvwtaz", model.vmNics().get(0).ipConfigs().get(0).subnetName());
        Assertions.assertEquals("cqwwxwj", model.vmNics().get(0).ipConfigs().get(0).staticIpAddress());
        Assertions.assertEquals("fgwhnkbtlwljs", model.vmNics().get(0).ipConfigs().get(0).ipAddressType());
        Assertions.assertEquals(true, model.vmNics().get(0).ipConfigs().get(0).isSeletedForFailover());
        Assertions.assertEquals("sn", model.vmNics().get(0).ipConfigs().get(0).recoverySubnetName());
        Assertions.assertEquals("kpwolg", model.vmNics().get(0).ipConfigs().get(0).recoveryStaticIpAddress());
        Assertions.assertEquals("ubxbteogfgfiijr", model.vmNics().get(0).ipConfigs().get(0).recoveryIpAddressType());
        Assertions.assertEquals("wlefksxqceazfpxg",
            model.vmNics().get(0).ipConfigs().get(0).recoveryPublicIpAddressId());
        Assertions.assertEquals("vzvluyq",
            model.vmNics().get(0).ipConfigs().get(0).recoveryLBBackendAddressPoolIds().get(0));
        Assertions.assertEquals("acvfyeowps", model.vmNics().get(0).ipConfigs().get(0).tfoSubnetName());
        Assertions.assertEquals("tjdhsoymhpvtyq", model.vmNics().get(0).ipConfigs().get(0).tfoStaticIpAddress());
        Assertions.assertEquals("tehdpboujs", model.vmNics().get(0).ipConfigs().get(0).tfoPublicIpAddressId());
        Assertions.assertEquals("vvdshxcdedsue",
            model.vmNics().get(0).ipConfigs().get(0).tfoLBBackendAddressPoolIds().get(0));
        Assertions.assertEquals("trauds", model.vmNics().get(0).selectionType());
        Assertions.assertEquals("lcdculregpq", model.vmNics().get(0).recoveryNetworkSecurityGroupId());
        Assertions.assertEquals(false, model.vmNics().get(0).enableAcceleratedNetworkingOnRecovery());
        Assertions.assertEquals("hvrztnvg", model.vmNics().get(0).tfoVMNetworkId());
        Assertions.assertEquals("hqrdgrtwmewjzlpy", model.vmNics().get(0).tfoNetworkSecurityGroupId());
        Assertions.assertEquals(false, model.vmNics().get(0).enableAcceleratedNetworkingOnTfo());
        Assertions.assertEquals("zzwjcayerzrran", model.vmNics().get(0).recoveryNicName());
        Assertions.assertEquals("bylpolwzr", model.vmNics().get(0).recoveryNicResourceGroupName());
        Assertions.assertEquals(true, model.vmNics().get(0).reuseExistingNic());
        Assertions.assertEquals("l", model.vmNics().get(0).tfoRecoveryNicName());
        Assertions.assertEquals("nkfscjfn", model.vmNics().get(0).tfoRecoveryNicResourceGroupName());
        Assertions.assertEquals(true, model.vmNics().get(0).tfoReuseExistingNic());
        Assertions.assertEquals("uagfqwtltngv", model.vmNics().get(0).targetNicName());
        Assertions.assertEquals("ncanlduwzor", model.selectedRecoveryAzureNetworkId());
        Assertions.assertEquals("bm", model.selectedSourceNicId());
        Assertions.assertEquals("qk", model.encryption());
        Assertions.assertEquals("mxkqvf", model.oSDetails().osType());
        Assertions.assertEquals("pdxcltuubwy", model.oSDetails().productType());
        Assertions.assertEquals("jbowcpj", model.oSDetails().osEdition());
        Assertions.assertEquals("uqgixex", model.oSDetails().oSVersion());
        Assertions.assertEquals("dfbwljav", model.oSDetails().oSMajorVersion());
        Assertions.assertEquals("erkjddv", model.oSDetails().oSMinorVersion());
        Assertions.assertEquals(436483933, model.sourceVmRamSizeInMB());
        Assertions.assertEquals(1692980760, model.sourceVmCpuCount());
        Assertions.assertEquals("ftcvbii", model.enableRdpOnTargetOption());
        Assertions.assertEquals("ksdwgdnk", model.recoveryAzureResourceGroupId());
        Assertions.assertEquals("gmwdh", model.recoveryAvailabilitySetId());
        Assertions.assertEquals("buvczldbglzoutb", model.targetAvailabilityZone());
        Assertions.assertEquals("qgz", model.targetProximityPlacementGroupId());
        Assertions.assertEquals("ajclyzgsnorbjg", model.useManagedDisks());
        Assertions.assertEquals("zjotvmrxkhlo", model.licenseType());
        Assertions.assertEquals("vjb", model.sqlServerLicenseType());
        Assertions.assertEquals("qayfl", model.targetVmTags().get("iyu"));
        Assertions.assertEquals("oxztfwfqch", model.seedManagedDiskTags().get("czevjnn"));
        Assertions.assertEquals("whlpuzjpceezn", model.targetManagedDiskTags().get("angp"));
        Assertions.assertEquals("krie", model.targetNicTags().get("bgnixxoww"));
        Assertions.assertEquals("jvskwsdgkjg", model.protectedManagedDisks().get(0).diskId());
        Assertions.assertEquals("cwrase", model.protectedManagedDisks().get(0).seedManagedDiskId());
        Assertions.assertEquals("efcvo", model.protectedManagedDisks().get(0).replicaDiskType());
        Assertions.assertEquals("woqartwy", model.protectedManagedDisks().get(0).diskEncryptionSetId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HyperVReplicaAzureReplicationDetails model = new HyperVReplicaAzureReplicationDetails()
            .withAzureVmDiskDetails(Arrays.asList(new AzureVmDiskDetails().withVhdType("qkwaruwd")
                .withVhdId("qzxoebwgjxbi").withDiskId("nbau").withVhdName("tzvp").withMaxSizeMB("lozkxbzrp")
                .withTargetDiskLocation("plssanbtttk").withTargetDiskName("uxunrswg").withLunId("jhboyikebhuhks")
                .withDiskEncryptionSetId("wlokhueoijyzcq").withCustomTargetDiskName("zqzu")))
            .withRecoveryAzureVmName("s").withRecoveryAzureVMSize("ej").withRecoveryAzureStorageAccount("dwtfx")
            .withRecoveryAzureLogStorageAccountId(
                "pqa")
            .withLastReplicatedTime(OffsetDateTime.parse("2021-12-08T02:26:36Z")).withRpoInSeconds(5044054827498032259L)
            .withLastRpoCalculatedTime(OffsetDateTime.parse("2021-10-17T04:21:19Z")).withVmId("bmxsnxoc")
            .withVmProtectionState(
                "llojkpoyhgwwdj")
            .withVmProtectionStateDescription(
                "dbdljz")
            .withInitialReplicationDetails(
                new InitialReplicationDetails().withInitialReplicationType(
                    "rcvuqbsgzlrqhb").withInitialReplicationProgressPercentage(
                        "qogdx"))
            .withVmNics(
                Arrays.asList(new VMNicDetails()
                    .withNicId("p").withReplicaNicId("x").withSourceNicArmId("lflec").withVMNetworkName(
                        "inxojjlux")
                    .withRecoveryVMNetworkId("hilzzdzzq")
                    .withIpConfigs(Arrays.asList(
                        new IpConfigDetails().withName("za").withIsPrimary(true).withSubnetName("ibqlotokhtvwtaz")
                            .withStaticIpAddress("cqwwxwj").withIpAddressType("fgwhnkbtlwljs")
                            .withIsSeletedForFailover(true).withRecoverySubnetName("sn")
                            .withRecoveryStaticIpAddress("kpwolg").withRecoveryIpAddressType("ubxbteogfgfiijr")
                            .withRecoveryPublicIpAddressId("wlefksxqceazfpxg")
                            .withRecoveryLBBackendAddressPoolIds(Arrays.asList("vzvluyq", "aiossscyvaifp"))
                            .withTfoSubnetName("acvfyeowps").withTfoStaticIpAddress("tjdhsoymhpvtyq")
                            .withTfoPublicIpAddressId("tehdpboujs").withTfoLBBackendAddressPoolIds(
                                Arrays.asList("vvdshxcdedsue", "ygnxcgjtfrnqukt", "fnslnlrxsmy", "trwntfmtbgw")),
                        new IpConfigDetails().withName("xwnaz").withIsPrimary(true).withSubnetName("drey")
                            .withStaticIpAddress("whsetwwjwzzqs").withIpAddressType("zuukykcyqhyqq")
                            .withIsSeletedForFailover(false).withRecoverySubnetName("ykeys")
                            .withRecoveryStaticIpAddress("wfopazdazg").withRecoveryIpAddressType("qgpewqcfutmdpvoz")
                            .withRecoveryPublicIpAddressId("qjbknl")
                            .withRecoveryLBBackendAddressPoolIds(
                                Arrays.asList("ctzeyowmndc", "v", "wzqauxzanhmkvf", "uwkudrbcp"))
                            .withTfoSubnetName("xudqyemebunaucmc").withTfoStaticIpAddress("tneemmjauwcgxef")
                            .withTfoPublicIpAddressId("haitranize")
                            .withTfoLBBackendAddressPoolIds(Arrays.asList("udasmxubvfbng", "coce", "hpriylfm"))))
                    .withSelectionType("trauds").withRecoveryNetworkSecurityGroupId("lcdculregpq")
                    .withEnableAcceleratedNetworkingOnRecovery(
                        false)
                    .withTfoVMNetworkId(
                        "hvrztnvg")
                    .withTfoNetworkSecurityGroupId(
                        "hqrdgrtwmewjzlpy")
                    .withEnableAcceleratedNetworkingOnTfo(
                        false)
                    .withRecoveryNicName(
                        "zzwjcayerzrran")
                    .withRecoveryNicResourceGroupName(
                        "bylpolwzr")
                    .withReuseExistingNic(
                        true)
                    .withTfoRecoveryNicName("l").withTfoRecoveryNicResourceGroupName("nkfscjfn")
                    .withTfoReuseExistingNic(true).withTargetNicName("uagfqwtltngv"),
                    new VMNicDetails().withNicId("e").withReplicaNicId("trklzmijajwol").withSourceNicArmId("s")
                        .withVMNetworkName("ghmp").withRecoveryVMNetworkId("wl")
                        .withIpConfigs(Arrays.asList(
                            new IpConfigDetails().withName("igt").withIsPrimary(true).withSubnetName("bxqla")
                                .withStaticIpAddress("nssovyxpav").withIpAddressType("nievwffc")
                                .withIsSeletedForFailover(false).withRecoverySubnetName("zslp")
                                .withRecoveryStaticIpAddress("gcbdsvalpnptw").withRecoveryIpAddressType("kx")
                                .withRecoveryPublicIpAddressId("azwu")
                                .withRecoveryLBBackendAddressPoolIds(
                                    Arrays.asList("qvn", "obfelhldiuhz", "gqlmfaewzgi"))
                                .withTfoSubnetName("jpxpqhttqhnmhkre").withTfoStaticIpAddress("dsuxheqdgcrux")
                                .withTfoPublicIpAddressId("inymmqgwokmikp")
                                .withTfoLBBackendAddressPoolIds(Arrays.asList("bmjxuvjipf", "vhax", "vwzaehp")),
                            new IpConfigDetails().withName("thd").withIsPrimary(true).withSubnetName("etatlakf")
                                .withStaticIpAddress("ixwgiksbbvtooxrp").withIpAddressType("wp")
                                .withIsSeletedForFailover(true).withRecoverySubnetName("jtnhtukfac")
                                .withRecoveryStaticIpAddress("mbf").withRecoveryIpAddressType("umeezbxvqxb")
                                .withRecoveryPublicIpAddressId("vwcga")
                                .withRecoveryLBBackendAddressPoolIds(
                                    Arrays.asList("mtmjzw", "uqgovsxpwwztjfm", "khtgfredmlscgrll", "cnaovjo"))
                                .withTfoSubnetName("zhpabac").withTfoStaticIpAddress("lyotg")
                                .withTfoPublicIpAddressId("sxnsrqorcge").withTfoLBBackendAddressPoolIds(
                                    Arrays.asList("c", "bxeetqujxcxxqn", "cqjkedwqu", "cgojmrv")),
                            new IpConfigDetails().withName("wjongzs").withIsPrimary(false)
                                .withSubnetName("rsilcchskxxkansb").withStaticIpAddress("ia")
                                .withIpAddressType("vtojrulfuctejr").withIsSeletedForFailover(false)
                                .withRecoverySubnetName("jzhxlyubqjrost").withRecoveryStaticIpAddress("jeqmtzzbeqrzt")
                                .withRecoveryIpAddressType("alx").withRecoveryPublicIpAddressId("habsrwrsnrh")
                                .withRecoveryLBBackendAddressPoolIds(Arrays.asList("tiwkkvyan"))
                                .withTfoSubnetName("vvcsemsvuvdjkqxe").withTfoStaticIpAddress("mmlivrjjxnw")
                                .withTfoPublicIpAddressId("chp").withTfoLBBackendAddressPoolIds(
                                    Arrays.asList("lehzlxpgfq", "wzpwiibel", "cerwkwbpjxljtxbu", "qtbxxniuisdzh"))))
                        .withSelectionType("d").withRecoveryNetworkSecurityGroupId("pagsecnad")
                        .withEnableAcceleratedNetworkingOnRecovery(true).withTfoVMNetworkId("r")
                        .withTfoNetworkSecurityGroupId("fllmqiy").withEnableAcceleratedNetworkingOnTfo(true)
                        .withRecoveryNicName("ellnkkii").withRecoveryNicResourceGroupName("mtum")
                        .withReuseExistingNic(false).withTfoRecoveryNicName("djf")
                        .withTfoRecoveryNicResourceGroupName("xroq").withTfoReuseExistingNic(true)
                        .withTargetNicName("lr")))
            .withSelectedRecoveryAzureNetworkId("ncanlduwzor").withSelectedSourceNicId("bm").withEncryption("qk")
            .withOSDetails(new OSDetails().withOsType("mxkqvf").withProductType("pdxcltuubwy").withOsEdition("jbowcpj")
                .withOSVersion("uqgixex").withOSMajorVersion("dfbwljav").withOSMinorVersion("erkjddv"))
            .withSourceVmRamSizeInMB(436483933).withSourceVmCpuCount(1692980760).withEnableRdpOnTargetOption("ftcvbii")
            .withRecoveryAzureResourceGroupId("ksdwgdnk").withRecoveryAvailabilitySetId("gmwdh")
            .withTargetAvailabilityZone("buvczldbglzoutb").withTargetProximityPlacementGroupId("qgz")
            .withUseManagedDisks("ajclyzgsnorbjg").withLicenseType("zjotvmrxkhlo").withSqlServerLicenseType("vjb")
            .withTargetVmTags(mapOf("iyu", "qayfl", "rswhbuubpyro", "snuudtelvhyibdr"))
            .withSeedManagedDiskTags(
                mapOf("czevjnn", "oxztfwfqch", "mhzcgkrepdqh", "tagfyvrtpqp", "mvxqab", "yhwqw", "eoxinhgre", "km"))
            .withTargetManagedDiskTags(mapOf("angp", "whlpuzjpceezn", "phmsexroq", "bfaxyxzlbc", "nfee", "ndktxfv"))
            .withTargetNicTags(mapOf("bgnixxoww", "krie", "p", "kyfwnwpiwxeiicr", "dm", "pk"))
            .withProtectedManagedDisks(Arrays.asList(
                new HyperVReplicaAzureManagedDiskDetails().withDiskId("jvskwsdgkjg").withSeedManagedDiskId("cwrase")
                    .withReplicaDiskType("efcvo").withDiskEncryptionSetId("woqartwy"),
                new HyperVReplicaAzureManagedDiskDetails().withDiskId("i").withSeedManagedDiskId("advatdavuqmcb")
                    .withReplicaDiskType("sfobjl").withDiskEncryptionSetId("vjezcjumvpsim"),
                new HyperVReplicaAzureManagedDiskDetails().withDiskId("yoi").withSeedManagedDiskId("kmi")
                    .withReplicaDiskType("nnraclibbfqpspkl").withDiskEncryptionSetId("ydgnha"),
                new HyperVReplicaAzureManagedDiskDetails().withDiskId("wuk").withSeedManagedDiskId("zgpmnma")
                    .withReplicaDiskType("ddqil").withDiskEncryptionSetId("d")))
            .withAllAvailableOSUpgradeConfigurations(Arrays.asList(new OSUpgradeSupportedVersions()));
        model = BinaryData.fromObject(model).toObject(HyperVReplicaAzureReplicationDetails.class);
        Assertions.assertEquals("qkwaruwd", model.azureVmDiskDetails().get(0).vhdType());
        Assertions.assertEquals("qzxoebwgjxbi", model.azureVmDiskDetails().get(0).vhdId());
        Assertions.assertEquals("nbau", model.azureVmDiskDetails().get(0).diskId());
        Assertions.assertEquals("tzvp", model.azureVmDiskDetails().get(0).vhdName());
        Assertions.assertEquals("lozkxbzrp", model.azureVmDiskDetails().get(0).maxSizeMB());
        Assertions.assertEquals("plssanbtttk", model.azureVmDiskDetails().get(0).targetDiskLocation());
        Assertions.assertEquals("uxunrswg", model.azureVmDiskDetails().get(0).targetDiskName());
        Assertions.assertEquals("jhboyikebhuhks", model.azureVmDiskDetails().get(0).lunId());
        Assertions.assertEquals("wlokhueoijyzcq", model.azureVmDiskDetails().get(0).diskEncryptionSetId());
        Assertions.assertEquals("zqzu", model.azureVmDiskDetails().get(0).customTargetDiskName());
        Assertions.assertEquals("s", model.recoveryAzureVmName());
        Assertions.assertEquals("ej", model.recoveryAzureVMSize());
        Assertions.assertEquals("dwtfx", model.recoveryAzureStorageAccount());
        Assertions.assertEquals("pqa", model.recoveryAzureLogStorageAccountId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-08T02:26:36Z"), model.lastReplicatedTime());
        Assertions.assertEquals(5044054827498032259L, model.rpoInSeconds());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-17T04:21:19Z"), model.lastRpoCalculatedTime());
        Assertions.assertEquals("bmxsnxoc", model.vmId());
        Assertions.assertEquals("llojkpoyhgwwdj", model.vmProtectionState());
        Assertions.assertEquals("dbdljz", model.vmProtectionStateDescription());
        Assertions.assertEquals("rcvuqbsgzlrqhb", model.initialReplicationDetails().initialReplicationType());
        Assertions.assertEquals("qogdx", model.initialReplicationDetails().initialReplicationProgressPercentage());
        Assertions.assertEquals("p", model.vmNics().get(0).nicId());
        Assertions.assertEquals("x", model.vmNics().get(0).replicaNicId());
        Assertions.assertEquals("lflec", model.vmNics().get(0).sourceNicArmId());
        Assertions.assertEquals("inxojjlux", model.vmNics().get(0).vMNetworkName());
        Assertions.assertEquals("hilzzdzzq", model.vmNics().get(0).recoveryVMNetworkId());
        Assertions.assertEquals("za", model.vmNics().get(0).ipConfigs().get(0).name());
        Assertions.assertEquals(true, model.vmNics().get(0).ipConfigs().get(0).isPrimary());
        Assertions.assertEquals("ibqlotokhtvwtaz", model.vmNics().get(0).ipConfigs().get(0).subnetName());
        Assertions.assertEquals("cqwwxwj", model.vmNics().get(0).ipConfigs().get(0).staticIpAddress());
        Assertions.assertEquals("fgwhnkbtlwljs", model.vmNics().get(0).ipConfigs().get(0).ipAddressType());
        Assertions.assertEquals(true, model.vmNics().get(0).ipConfigs().get(0).isSeletedForFailover());
        Assertions.assertEquals("sn", model.vmNics().get(0).ipConfigs().get(0).recoverySubnetName());
        Assertions.assertEquals("kpwolg", model.vmNics().get(0).ipConfigs().get(0).recoveryStaticIpAddress());
        Assertions.assertEquals("ubxbteogfgfiijr", model.vmNics().get(0).ipConfigs().get(0).recoveryIpAddressType());
        Assertions.assertEquals("wlefksxqceazfpxg",
            model.vmNics().get(0).ipConfigs().get(0).recoveryPublicIpAddressId());
        Assertions.assertEquals("vzvluyq",
            model.vmNics().get(0).ipConfigs().get(0).recoveryLBBackendAddressPoolIds().get(0));
        Assertions.assertEquals("acvfyeowps", model.vmNics().get(0).ipConfigs().get(0).tfoSubnetName());
        Assertions.assertEquals("tjdhsoymhpvtyq", model.vmNics().get(0).ipConfigs().get(0).tfoStaticIpAddress());
        Assertions.assertEquals("tehdpboujs", model.vmNics().get(0).ipConfigs().get(0).tfoPublicIpAddressId());
        Assertions.assertEquals("vvdshxcdedsue",
            model.vmNics().get(0).ipConfigs().get(0).tfoLBBackendAddressPoolIds().get(0));
        Assertions.assertEquals("trauds", model.vmNics().get(0).selectionType());
        Assertions.assertEquals("lcdculregpq", model.vmNics().get(0).recoveryNetworkSecurityGroupId());
        Assertions.assertEquals(false, model.vmNics().get(0).enableAcceleratedNetworkingOnRecovery());
        Assertions.assertEquals("hvrztnvg", model.vmNics().get(0).tfoVMNetworkId());
        Assertions.assertEquals("hqrdgrtwmewjzlpy", model.vmNics().get(0).tfoNetworkSecurityGroupId());
        Assertions.assertEquals(false, model.vmNics().get(0).enableAcceleratedNetworkingOnTfo());
        Assertions.assertEquals("zzwjcayerzrran", model.vmNics().get(0).recoveryNicName());
        Assertions.assertEquals("bylpolwzr", model.vmNics().get(0).recoveryNicResourceGroupName());
        Assertions.assertEquals(true, model.vmNics().get(0).reuseExistingNic());
        Assertions.assertEquals("l", model.vmNics().get(0).tfoRecoveryNicName());
        Assertions.assertEquals("nkfscjfn", model.vmNics().get(0).tfoRecoveryNicResourceGroupName());
        Assertions.assertEquals(true, model.vmNics().get(0).tfoReuseExistingNic());
        Assertions.assertEquals("uagfqwtltngv", model.vmNics().get(0).targetNicName());
        Assertions.assertEquals("ncanlduwzor", model.selectedRecoveryAzureNetworkId());
        Assertions.assertEquals("bm", model.selectedSourceNicId());
        Assertions.assertEquals("qk", model.encryption());
        Assertions.assertEquals("mxkqvf", model.oSDetails().osType());
        Assertions.assertEquals("pdxcltuubwy", model.oSDetails().productType());
        Assertions.assertEquals("jbowcpj", model.oSDetails().osEdition());
        Assertions.assertEquals("uqgixex", model.oSDetails().oSVersion());
        Assertions.assertEquals("dfbwljav", model.oSDetails().oSMajorVersion());
        Assertions.assertEquals("erkjddv", model.oSDetails().oSMinorVersion());
        Assertions.assertEquals(436483933, model.sourceVmRamSizeInMB());
        Assertions.assertEquals(1692980760, model.sourceVmCpuCount());
        Assertions.assertEquals("ftcvbii", model.enableRdpOnTargetOption());
        Assertions.assertEquals("ksdwgdnk", model.recoveryAzureResourceGroupId());
        Assertions.assertEquals("gmwdh", model.recoveryAvailabilitySetId());
        Assertions.assertEquals("buvczldbglzoutb", model.targetAvailabilityZone());
        Assertions.assertEquals("qgz", model.targetProximityPlacementGroupId());
        Assertions.assertEquals("ajclyzgsnorbjg", model.useManagedDisks());
        Assertions.assertEquals("zjotvmrxkhlo", model.licenseType());
        Assertions.assertEquals("vjb", model.sqlServerLicenseType());
        Assertions.assertEquals("qayfl", model.targetVmTags().get("iyu"));
        Assertions.assertEquals("oxztfwfqch", model.seedManagedDiskTags().get("czevjnn"));
        Assertions.assertEquals("whlpuzjpceezn", model.targetManagedDiskTags().get("angp"));
        Assertions.assertEquals("krie", model.targetNicTags().get("bgnixxoww"));
        Assertions.assertEquals("jvskwsdgkjg", model.protectedManagedDisks().get(0).diskId());
        Assertions.assertEquals("cwrase", model.protectedManagedDisks().get(0).seedManagedDiskId());
        Assertions.assertEquals("efcvo", model.protectedManagedDisks().get(0).replicaDiskType());
        Assertions.assertEquals("woqartwy", model.protectedManagedDisks().get(0).diskEncryptionSetId());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
