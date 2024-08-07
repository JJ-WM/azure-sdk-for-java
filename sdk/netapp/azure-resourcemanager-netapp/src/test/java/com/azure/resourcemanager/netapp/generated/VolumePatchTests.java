// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.ChownMode;
import com.azure.resourcemanager.netapp.models.CoolAccessRetrievalPolicy;
import com.azure.resourcemanager.netapp.models.ExportPolicyRule;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import com.azure.resourcemanager.netapp.models.SmbAccessBasedEnumeration;
import com.azure.resourcemanager.netapp.models.SmbNonBrowsable;
import com.azure.resourcemanager.netapp.models.VolumeBackupProperties;
import com.azure.resourcemanager.netapp.models.VolumePatch;
import com.azure.resourcemanager.netapp.models.VolumePatchPropertiesDataProtection;
import com.azure.resourcemanager.netapp.models.VolumePatchPropertiesExportPolicy;
import com.azure.resourcemanager.netapp.models.VolumeSnapshotProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VolumePatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumePatch model = BinaryData.fromString(
            "{\"properties\":{\"serviceLevel\":\"Premium\",\"usageThreshold\":651752597881008375,\"exportPolicy\":{\"rules\":[{\"ruleIndex\":267122524,\"unixReadOnly\":false,\"unixReadWrite\":false,\"kerberos5ReadOnly\":true,\"kerberos5ReadWrite\":true,\"kerberos5iReadOnly\":true,\"kerberos5iReadWrite\":true,\"kerberos5pReadOnly\":true,\"kerberos5pReadWrite\":false,\"cifs\":false,\"nfsv3\":true,\"nfsv41\":true,\"allowedClients\":\"r\",\"hasRootAccess\":false,\"chownMode\":\"Unrestricted\"},{\"ruleIndex\":1463995661,\"unixReadOnly\":true,\"unixReadWrite\":true,\"kerberos5ReadOnly\":true,\"kerberos5ReadWrite\":true,\"kerberos5iReadOnly\":false,\"kerberos5iReadWrite\":false,\"kerberos5pReadOnly\":false,\"kerberos5pReadWrite\":true,\"cifs\":false,\"nfsv3\":false,\"nfsv41\":true,\"allowedClients\":\"fthnzdn\",\"hasRootAccess\":false,\"chownMode\":\"Restricted\"},{\"ruleIndex\":424120477,\"unixReadOnly\":true,\"unixReadWrite\":false,\"kerberos5ReadOnly\":true,\"kerberos5ReadWrite\":true,\"kerberos5iReadOnly\":true,\"kerberos5iReadWrite\":false,\"kerberos5pReadOnly\":true,\"kerberos5pReadWrite\":true,\"cifs\":true,\"nfsv3\":false,\"nfsv41\":false,\"allowedClients\":\"gycdu\",\"hasRootAccess\":false,\"chownMode\":\"Unrestricted\"},{\"ruleIndex\":626119368,\"unixReadOnly\":false,\"unixReadWrite\":false,\"kerberos5ReadOnly\":false,\"kerberos5ReadWrite\":false,\"kerberos5iReadOnly\":false,\"kerberos5iReadWrite\":true,\"kerberos5pReadOnly\":true,\"kerberos5pReadWrite\":true,\"cifs\":true,\"nfsv3\":true,\"nfsv41\":true,\"allowedClients\":\"swiydmcwyhzdx\",\"hasRootAccess\":true,\"chownMode\":\"Unrestricted\"}]},\"protocolTypes\":[\"nvdfznuda\",\"dvxzbncblylpst\"],\"throughputMibps\":11.346394,\"dataProtection\":{\"backup\":{\"backupPolicyId\":\"rzdzucerscdnt\",\"policyEnforced\":true,\"backupVaultId\":\"iwjmygtdssls\"},\"snapshot\":{\"snapshotPolicyId\":\"weriofzpyqsem\"}},\"isDefaultQuotaEnabled\":false,\"defaultUserQuotaInKiBs\":3402387353941065061,\"defaultGroupQuotaInKiBs\":5305211622418226559,\"unixPermissions\":\"zhedplvwiw\",\"coolAccess\":false,\"coolnessPeriod\":1072723853,\"coolAccessRetrievalPolicy\":\"Never\",\"snapshotDirectoryVisible\":true,\"smbAccessBasedEnumeration\":\"Disabled\",\"smbNonBrowsable\":\"Disabled\"},\"location\":\"wtppjflcxogaoko\",\"tags\":{\"fzxmhhvhgureodkw\":\"nsikvmkqzeqqkdl\"},\"id\":\"bdagxt\",\"name\":\"bqdxbx\",\"type\":\"akbogqxndlkzgxh\"}")
            .toObject(VolumePatch.class);
        Assertions.assertEquals("wtppjflcxogaoko", model.location());
        Assertions.assertEquals("nsikvmkqzeqqkdl", model.tags().get("fzxmhhvhgureodkw"));
        Assertions.assertEquals(ServiceLevel.PREMIUM, model.serviceLevel());
        Assertions.assertEquals(651752597881008375L, model.usageThreshold());
        Assertions.assertEquals(267122524, model.exportPolicy().rules().get(0).ruleIndex());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).unixReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).unixReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5ReadOnly());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5ReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5IReadOnly());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5IReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5PReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5PReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).cifs());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).nfsv3());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).nfsv41());
        Assertions.assertEquals("r", model.exportPolicy().rules().get(0).allowedClients());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).hasRootAccess());
        Assertions.assertEquals(ChownMode.UNRESTRICTED, model.exportPolicy().rules().get(0).chownMode());
        Assertions.assertEquals("nvdfznuda", model.protocolTypes().get(0));
        Assertions.assertEquals(11.346394F, model.throughputMibps());
        Assertions.assertEquals("rzdzucerscdnt", model.dataProtection().backup().backupPolicyId());
        Assertions.assertEquals(true, model.dataProtection().backup().policyEnforced());
        Assertions.assertEquals("iwjmygtdssls", model.dataProtection().backup().backupVaultId());
        Assertions.assertEquals("weriofzpyqsem", model.dataProtection().snapshot().snapshotPolicyId());
        Assertions.assertEquals(false, model.isDefaultQuotaEnabled());
        Assertions.assertEquals(3402387353941065061L, model.defaultUserQuotaInKiBs());
        Assertions.assertEquals(5305211622418226559L, model.defaultGroupQuotaInKiBs());
        Assertions.assertEquals("zhedplvwiw", model.unixPermissions());
        Assertions.assertEquals(false, model.coolAccess());
        Assertions.assertEquals(1072723853, model.coolnessPeriod());
        Assertions.assertEquals(CoolAccessRetrievalPolicy.NEVER, model.coolAccessRetrievalPolicy());
        Assertions.assertEquals(true, model.snapshotDirectoryVisible());
        Assertions.assertEquals(SmbAccessBasedEnumeration.DISABLED, model.smbAccessBasedEnumeration());
        Assertions.assertEquals(SmbNonBrowsable.DISABLED, model.smbNonBrowsable());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumePatch model = new VolumePatch().withLocation("wtppjflcxogaoko")
            .withTags(mapOf("fzxmhhvhgureodkw", "nsikvmkqzeqqkdl"))
            .withServiceLevel(ServiceLevel.PREMIUM)
            .withUsageThreshold(651752597881008375L)
            .withExportPolicy(new VolumePatchPropertiesExportPolicy().withRules(Arrays.asList(
                new ExportPolicyRule().withRuleIndex(267122524)
                    .withUnixReadOnly(false)
                    .withUnixReadWrite(false)
                    .withKerberos5ReadOnly(true)
                    .withKerberos5ReadWrite(true)
                    .withKerberos5IReadOnly(true)
                    .withKerberos5IReadWrite(true)
                    .withKerberos5PReadOnly(true)
                    .withKerberos5PReadWrite(false)
                    .withCifs(false)
                    .withNfsv3(true)
                    .withNfsv41(true)
                    .withAllowedClients("r")
                    .withHasRootAccess(false)
                    .withChownMode(ChownMode.UNRESTRICTED),
                new ExportPolicyRule().withRuleIndex(1463995661)
                    .withUnixReadOnly(true)
                    .withUnixReadWrite(true)
                    .withKerberos5ReadOnly(true)
                    .withKerberos5ReadWrite(true)
                    .withKerberos5IReadOnly(false)
                    .withKerberos5IReadWrite(false)
                    .withKerberos5PReadOnly(false)
                    .withKerberos5PReadWrite(true)
                    .withCifs(false)
                    .withNfsv3(false)
                    .withNfsv41(true)
                    .withAllowedClients("fthnzdn")
                    .withHasRootAccess(false)
                    .withChownMode(ChownMode.RESTRICTED),
                new ExportPolicyRule().withRuleIndex(424120477)
                    .withUnixReadOnly(true)
                    .withUnixReadWrite(false)
                    .withKerberos5ReadOnly(true)
                    .withKerberos5ReadWrite(true)
                    .withKerberos5IReadOnly(true)
                    .withKerberos5IReadWrite(false)
                    .withKerberos5PReadOnly(true)
                    .withKerberos5PReadWrite(true)
                    .withCifs(true)
                    .withNfsv3(false)
                    .withNfsv41(false)
                    .withAllowedClients("gycdu")
                    .withHasRootAccess(false)
                    .withChownMode(ChownMode.UNRESTRICTED),
                new ExportPolicyRule().withRuleIndex(626119368)
                    .withUnixReadOnly(false)
                    .withUnixReadWrite(false)
                    .withKerberos5ReadOnly(false)
                    .withKerberos5ReadWrite(false)
                    .withKerberos5IReadOnly(false)
                    .withKerberos5IReadWrite(true)
                    .withKerberos5PReadOnly(true)
                    .withKerberos5PReadWrite(true)
                    .withCifs(true)
                    .withNfsv3(true)
                    .withNfsv41(true)
                    .withAllowedClients("swiydmcwyhzdx")
                    .withHasRootAccess(true)
                    .withChownMode(ChownMode.UNRESTRICTED))))
            .withProtocolTypes(Arrays.asList("nvdfznuda", "dvxzbncblylpst"))
            .withThroughputMibps(11.346394F)
            .withDataProtection(new VolumePatchPropertiesDataProtection()
                .withBackup(new VolumeBackupProperties().withBackupPolicyId("rzdzucerscdnt")
                    .withPolicyEnforced(true)
                    .withBackupVaultId("iwjmygtdssls"))
                .withSnapshot(new VolumeSnapshotProperties().withSnapshotPolicyId("weriofzpyqsem")))
            .withIsDefaultQuotaEnabled(false)
            .withDefaultUserQuotaInKiBs(3402387353941065061L)
            .withDefaultGroupQuotaInKiBs(5305211622418226559L)
            .withUnixPermissions("zhedplvwiw")
            .withCoolAccess(false)
            .withCoolnessPeriod(1072723853)
            .withCoolAccessRetrievalPolicy(CoolAccessRetrievalPolicy.NEVER)
            .withSnapshotDirectoryVisible(true)
            .withSmbAccessBasedEnumeration(SmbAccessBasedEnumeration.DISABLED)
            .withSmbNonBrowsable(SmbNonBrowsable.DISABLED);
        model = BinaryData.fromObject(model).toObject(VolumePatch.class);
        Assertions.assertEquals("wtppjflcxogaoko", model.location());
        Assertions.assertEquals("nsikvmkqzeqqkdl", model.tags().get("fzxmhhvhgureodkw"));
        Assertions.assertEquals(ServiceLevel.PREMIUM, model.serviceLevel());
        Assertions.assertEquals(651752597881008375L, model.usageThreshold());
        Assertions.assertEquals(267122524, model.exportPolicy().rules().get(0).ruleIndex());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).unixReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).unixReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5ReadOnly());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5ReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5IReadOnly());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5IReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5PReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5PReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).cifs());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).nfsv3());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).nfsv41());
        Assertions.assertEquals("r", model.exportPolicy().rules().get(0).allowedClients());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).hasRootAccess());
        Assertions.assertEquals(ChownMode.UNRESTRICTED, model.exportPolicy().rules().get(0).chownMode());
        Assertions.assertEquals("nvdfznuda", model.protocolTypes().get(0));
        Assertions.assertEquals(11.346394F, model.throughputMibps());
        Assertions.assertEquals("rzdzucerscdnt", model.dataProtection().backup().backupPolicyId());
        Assertions.assertEquals(true, model.dataProtection().backup().policyEnforced());
        Assertions.assertEquals("iwjmygtdssls", model.dataProtection().backup().backupVaultId());
        Assertions.assertEquals("weriofzpyqsem", model.dataProtection().snapshot().snapshotPolicyId());
        Assertions.assertEquals(false, model.isDefaultQuotaEnabled());
        Assertions.assertEquals(3402387353941065061L, model.defaultUserQuotaInKiBs());
        Assertions.assertEquals(5305211622418226559L, model.defaultGroupQuotaInKiBs());
        Assertions.assertEquals("zhedplvwiw", model.unixPermissions());
        Assertions.assertEquals(false, model.coolAccess());
        Assertions.assertEquals(1072723853, model.coolnessPeriod());
        Assertions.assertEquals(CoolAccessRetrievalPolicy.NEVER, model.coolAccessRetrievalPolicy());
        Assertions.assertEquals(true, model.snapshotDirectoryVisible());
        Assertions.assertEquals(SmbAccessBasedEnumeration.DISABLED, model.smbAccessBasedEnumeration());
        Assertions.assertEquals(SmbNonBrowsable.DISABLED, model.smbNonBrowsable());
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
