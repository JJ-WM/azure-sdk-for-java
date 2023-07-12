// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AzureBackupFindRestorableTimeRangesRequest;
import com.azure.resourcemanager.dataprotection.models.AzureBackupFindRestorableTimeRangesRequestResource;
import com.azure.resourcemanager.dataprotection.models.RestoreSourceDataStoreType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureBackupFindRestorableTimeRangesRequestResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupFindRestorableTimeRangesRequestResource model =
            BinaryData
                .fromString(
                    "{\"content\":{\"sourceDataStoreType\":\"ArchiveStore\",\"startTime\":\"xrbuukzclew\",\"endTime\":\"mlwpazt\"},\"subscriptionId\":\"ofncckwyfzqwhxxb\",\"uri\":\"qa\",\"headers\":{\"iolxor\":[\"qztpp\"],\"obqwcsdbnwdcfh\":[\"lt\",\"lmncw\"],\"t\":[\"qdpfuvglsbjjca\",\"vxb\"]},\"supportedGroupVersions\":[\"utncorm\"],\"cultureInfo\":\"xqtvcofu\",\"parameters\":{\"u\":\"vkg\",\"aznqntoru\":\"gdknnqv\"},\"httpMethod\":\"gsahmkycgrauw\"}")
                .toObject(AzureBackupFindRestorableTimeRangesRequestResource.class);
        Assertions.assertEquals("ofncckwyfzqwhxxb", model.subscriptionId());
        Assertions.assertEquals("qa", model.uri());
        Assertions.assertEquals("qztpp", model.headers().get("iolxor").get(0));
        Assertions.assertEquals("utncorm", model.supportedGroupVersions().get(0));
        Assertions.assertEquals("xqtvcofu", model.cultureInfo());
        Assertions.assertEquals("vkg", model.parameters().get("u"));
        Assertions.assertEquals("gsahmkycgrauw", model.httpMethod());
        Assertions.assertEquals(RestoreSourceDataStoreType.ARCHIVE_STORE, model.content().sourceDataStoreType());
        Assertions.assertEquals("xrbuukzclew", model.content().startTime());
        Assertions.assertEquals("mlwpazt", model.content().endTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupFindRestorableTimeRangesRequestResource model =
            new AzureBackupFindRestorableTimeRangesRequestResource()
                .withSubscriptionId("ofncckwyfzqwhxxb")
                .withUri("qa")
                .withHeaders(
                    mapOf(
                        "iolxor",
                        Arrays.asList("qztpp"),
                        "obqwcsdbnwdcfh",
                        Arrays.asList("lt", "lmncw"),
                        "t",
                        Arrays.asList("qdpfuvglsbjjca", "vxb")))
                .withSupportedGroupVersions(Arrays.asList("utncorm"))
                .withCultureInfo("xqtvcofu")
                .withParameters(mapOf("u", "vkg", "aznqntoru", "gdknnqv"))
                .withHttpMethod("gsahmkycgrauw")
                .withContent(
                    new AzureBackupFindRestorableTimeRangesRequest()
                        .withSourceDataStoreType(RestoreSourceDataStoreType.ARCHIVE_STORE)
                        .withStartTime("xrbuukzclew")
                        .withEndTime("mlwpazt"));
        model = BinaryData.fromObject(model).toObject(AzureBackupFindRestorableTimeRangesRequestResource.class);
        Assertions.assertEquals("ofncckwyfzqwhxxb", model.subscriptionId());
        Assertions.assertEquals("qa", model.uri());
        Assertions.assertEquals("qztpp", model.headers().get("iolxor").get(0));
        Assertions.assertEquals("utncorm", model.supportedGroupVersions().get(0));
        Assertions.assertEquals("xqtvcofu", model.cultureInfo());
        Assertions.assertEquals("vkg", model.parameters().get("u"));
        Assertions.assertEquals("gsahmkycgrauw", model.httpMethod());
        Assertions.assertEquals(RestoreSourceDataStoreType.ARCHIVE_STORE, model.content().sourceDataStoreType());
        Assertions.assertEquals("xrbuukzclew", model.content().startTime());
        Assertions.assertEquals("mlwpazt", model.content().endTime());
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
