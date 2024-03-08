// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.applicationinsights.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.applicationinsights.models.UserAssignedIdentity;
import com.azure.resourcemanager.applicationinsights.models.WorkbookResource;
import com.azure.resourcemanager.applicationinsights.models.WorkbookResourceIdentity;
import com.azure.resourcemanager.applicationinsights.models.WorkbookSharedTypeKind;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class WorkbookResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkbookResource model =
            BinaryData
                .fromString(
                    "{\"identity\":{\"principalId\":\"b7deb4ee-efa9-46c9-8c77-7a9290d6e3d7\",\"tenantId\":\"5f85f425-298e-477d-9cf5-2db2e1840718\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"k\":{\"principalId\":\"607bf139-ac9a-4744-b8bd-146929c27749\",\"clientId\":\"8700282f-6aac-4911-bd44-095729a39ac6\"}}},\"kind\":\"shared\",\"etag\":\"jervtia\",\"location\":\"xsdszuempsb\",\"tags\":{\"eyvpnqicvinvkj\":\"z\"},\"id\":\"xdxr\",\"name\":\"uukzclewyhmlw\",\"type\":\"aztz\"}")
                .toObject(WorkbookResource.class);
        Assertions.assertEquals("xsdszuempsb", model.location());
        Assertions.assertEquals("z", model.tags().get("eyvpnqicvinvkj"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals(WorkbookSharedTypeKind.SHARED, model.kind());
        Assertions.assertEquals("jervtia", model.etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkbookResource model =
            new WorkbookResource()
                .withLocation("xsdszuempsb")
                .withTags(mapOf("eyvpnqicvinvkj", "z"))
                .withIdentity(
                    new WorkbookResourceIdentity()
                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                        .withUserAssignedIdentities(mapOf("k", new UserAssignedIdentity())))
                .withKind(WorkbookSharedTypeKind.SHARED)
                .withEtag("jervtia");
        model = BinaryData.fromObject(model).toObject(WorkbookResource.class);
        Assertions.assertEquals("xsdszuempsb", model.location());
        Assertions.assertEquals("z", model.tags().get("eyvpnqicvinvkj"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals(WorkbookSharedTypeKind.SHARED, model.kind());
        Assertions.assertEquals("jervtia", model.etag());
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
