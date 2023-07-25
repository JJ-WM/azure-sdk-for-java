// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.BackupPolicyPatch;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BackupPolicyPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupPolicyPatch model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"backupPolicyId\":\"yznkby\",\"provisioningState\":\"t\",\"dailyBackupsToKeep\":1465227251,\"weeklyBackupsToKeep\":951051183,\"monthlyBackupsToKeep\":2014772944,\"volumesAssigned\":71172193,\"enabled\":true,\"volumeBackups\":[{\"volumeName\":\"nfd\",\"backupsCount\":1139028210,\"policyEnabled\":true},{\"volumeName\":\"tdlmkkzevd\",\"backupsCount\":1837577186,\"policyEnabled\":false},{\"volumeName\":\"sdsttwvog\",\"backupsCount\":1374887959,\"policyEnabled\":false},{\"volumeName\":\"cngqqmoakufgmjz\",\"backupsCount\":1463483261,\"policyEnabled\":false}]},\"location\":\"rtwaenuuzko\",\"tags\":{\"hziuiefozbhdms\":\"inrfdwoyu\",\"zqhof\":\"l\"},\"id\":\"rmaequ\",\"name\":\"ah\",\"type\":\"icslfaoq\"}")
                .toObject(BackupPolicyPatch.class);
        Assertions.assertEquals("rtwaenuuzko", model.location());
        Assertions.assertEquals("inrfdwoyu", model.tags().get("hziuiefozbhdms"));
        Assertions.assertEquals(1465227251, model.dailyBackupsToKeep());
        Assertions.assertEquals(951051183, model.weeklyBackupsToKeep());
        Assertions.assertEquals(2014772944, model.monthlyBackupsToKeep());
        Assertions.assertEquals(true, model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupPolicyPatch model =
            new BackupPolicyPatch()
                .withLocation("rtwaenuuzko")
                .withTags(mapOf("hziuiefozbhdms", "inrfdwoyu", "zqhof", "l"))
                .withDailyBackupsToKeep(1465227251)
                .withWeeklyBackupsToKeep(951051183)
                .withMonthlyBackupsToKeep(2014772944)
                .withEnabled(true);
        model = BinaryData.fromObject(model).toObject(BackupPolicyPatch.class);
        Assertions.assertEquals("rtwaenuuzko", model.location());
        Assertions.assertEquals("inrfdwoyu", model.tags().get("hziuiefozbhdms"));
        Assertions.assertEquals(1465227251, model.dailyBackupsToKeep());
        Assertions.assertEquals(951051183, model.weeklyBackupsToKeep());
        Assertions.assertEquals(2014772944, model.monthlyBackupsToKeep());
        Assertions.assertEquals(true, model.enabled());
    }

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
