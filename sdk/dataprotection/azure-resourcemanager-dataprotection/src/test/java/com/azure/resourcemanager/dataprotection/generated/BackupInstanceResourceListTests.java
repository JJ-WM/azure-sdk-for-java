// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.fluent.models.BackupInstanceResourceInner;
import com.azure.resourcemanager.dataprotection.models.BackupInstance;
import com.azure.resourcemanager.dataprotection.models.BackupInstanceResourceList;
import com.azure.resourcemanager.dataprotection.models.ValidationType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BackupInstanceResourceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupInstanceResourceList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"friendlyName\":\"fbowskanyk\",\"currentProtectionState\":\"BackupSchedulesSuspended\",\"provisioningState\":\"wgqyw\",\"validationType\":\"DeepValidation\",\"objectType\":\"vynhzgpphrcg\"},\"tags\":{\"fsxlzevgbmqjqa\":\"ocpecfvmmco\",\"pmivkwlzu\":\"c\",\"ebxetqgtzxdp\":\"ccfwnfnbacfion\",\"feallnwsu\":\"qbqqwxr\"},\"id\":\"snjampmng\",\"name\":\"zscxaqwo\",\"type\":\"chcbonqvpkvlrxnj\"}],\"nextLink\":\"seiphe\"}")
                .toObject(BackupInstanceResourceList.class);
        Assertions.assertEquals("seiphe", model.nextLink());
        Assertions.assertEquals("ocpecfvmmco", model.value().get(0).tags().get("fsxlzevgbmqjqa"));
        Assertions.assertEquals("fbowskanyk", model.value().get(0).properties().friendlyName());
        Assertions.assertEquals(ValidationType.DEEP_VALIDATION, model.value().get(0).properties().validationType());
        Assertions.assertEquals("vynhzgpphrcg", model.value().get(0).properties().objectType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupInstanceResourceList model =
            new BackupInstanceResourceList()
                .withNextLink("seiphe")
                .withValue(
                    Arrays
                        .asList(
                            new BackupInstanceResourceInner()
                                .withTags(
                                    mapOf(
                                        "fsxlzevgbmqjqa",
                                        "ocpecfvmmco",
                                        "pmivkwlzu",
                                        "c",
                                        "ebxetqgtzxdp",
                                        "ccfwnfnbacfion",
                                        "feallnwsu",
                                        "qbqqwxr"))
                                .withProperties(
                                    new BackupInstance()
                                        .withFriendlyName("fbowskanyk")
                                        .withValidationType(ValidationType.DEEP_VALIDATION)
                                        .withObjectType("vynhzgpphrcg"))));
        model = BinaryData.fromObject(model).toObject(BackupInstanceResourceList.class);
        Assertions.assertEquals("seiphe", model.nextLink());
        Assertions.assertEquals("ocpecfvmmco", model.value().get(0).tags().get("fsxlzevgbmqjqa"));
        Assertions.assertEquals("fbowskanyk", model.value().get(0).properties().friendlyName());
        Assertions.assertEquals(ValidationType.DEEP_VALIDATION, model.value().get(0).properties().validationType());
        Assertions.assertEquals("vynhzgpphrcg", model.value().get(0).properties().objectType());
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
