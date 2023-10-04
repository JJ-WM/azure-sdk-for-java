// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.communication.fluent.models.CommunicationServiceResourceInner;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentity;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.communication.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CommunicationServiceResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommunicationServiceResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Updating\",\"hostName\":\"ljfmppee\",\"dataLocation\":\"vmgxsab\",\"notificationHubId\":\"qduujitcjczdz\",\"version\":\"ndhkrw\",\"immutableResourceId\":\"appd\",\"linkedDomains\":[\"kvwrwjfeu\",\"nhutjeltmrldhugj\",\"zdatqxhocdg\"]},\"identity\":{\"principalId\":\"8f41afc7-82c6-4885-a85a-61e476cf754d\",\"tenantId\":\"a2d8ceae-8082-4a91-88ee-303d2794b921\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"icndvkaozwyifty\":{\"principalId\":\"90b9f918-b083-4dff-87f5-4b362457d535\",\"clientId\":\"05d0eefd-38bc-447a-853b-a7960ecf3666\"},\"urokft\":{\"principalId\":\"000a6bec-29fe-46b8-b3b8-eb6e5d400511\",\"clientId\":\"1f529f8e-fa07-4825-bdb2-184613f70ba7\"},\"lniwpwcukjfkgiaw\":{\"principalId\":\"87abf4e7-9a4e-44ff-9408-a9687db4348d\",\"clientId\":\"f16a9c69-28df-4d02-852e-198915fb7c91\"}}},\"location\":\"lryplwckbasyy\",\"tags\":{\"phejkotynqgoulz\":\"dhsgcba\",\"gakeqsr\":\"dlikwyqkgfgibma\",\"qqedqytbciqfou\":\"yb\"},\"id\":\"lmmnkzsmodmglo\",\"name\":\"gpbkwtmut\",\"type\":\"uqktap\"}")
                .toObject(CommunicationServiceResourceInner.class);
        Assertions.assertEquals("lryplwckbasyy", model.location());
        Assertions.assertEquals("dhsgcba", model.tags().get("phejkotynqgoulz"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("vmgxsab", model.dataLocation());
        Assertions.assertEquals("kvwrwjfeu", model.linkedDomains().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommunicationServiceResourceInner model =
            new CommunicationServiceResourceInner()
                .withLocation("lryplwckbasyy")
                .withTags(mapOf("phejkotynqgoulz", "dhsgcba", "gakeqsr", "dlikwyqkgfgibma", "qqedqytbciqfou", "yb"))
                .withIdentity(
                    new ManagedServiceIdentity()
                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                        .withUserAssignedIdentities(
                            mapOf(
                                "icndvkaozwyifty",
                                new UserAssignedIdentity(),
                                "urokft",
                                new UserAssignedIdentity(),
                                "lniwpwcukjfkgiaw",
                                new UserAssignedIdentity())))
                .withDataLocation("vmgxsab")
                .withLinkedDomains(Arrays.asList("kvwrwjfeu", "nhutjeltmrldhugj", "zdatqxhocdg"));
        model = BinaryData.fromObject(model).toObject(CommunicationServiceResourceInner.class);
        Assertions.assertEquals("lryplwckbasyy", model.location());
        Assertions.assertEquals("dhsgcba", model.tags().get("phejkotynqgoulz"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("vmgxsab", model.dataLocation());
        Assertions.assertEquals("kvwrwjfeu", model.linkedDomains().get(0));
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
