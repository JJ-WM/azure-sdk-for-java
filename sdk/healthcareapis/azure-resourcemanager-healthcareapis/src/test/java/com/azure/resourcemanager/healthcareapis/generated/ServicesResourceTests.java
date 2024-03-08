// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.models.Kind;
import com.azure.resourcemanager.healthcareapis.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.healthcareapis.models.ServicesResource;
import com.azure.resourcemanager.healthcareapis.models.ServicesResourceIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ServicesResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServicesResource model = BinaryData.fromString(
            "{\"kind\":\"fhir-Stu3\",\"etag\":\"inpm\",\"identity\":{\"principalId\":\"aqwi\",\"tenantId\":\"sprozvcput\",\"type\":\"SystemAssigned\"},\"location\":\"vwmf\",\"tags\":{\"mkjozkrwf\":\"scmdvpjhulsuu\"},\"id\":\"dio\",\"name\":\"jpslwejd\",\"type\":\"vwryoqpso\"}")
            .toObject(ServicesResource.class);
        Assertions.assertEquals("vwmf", model.location());
        Assertions.assertEquals("scmdvpjhulsuu", model.tags().get("mkjozkrwf"));
        Assertions.assertEquals(Kind.FHIR_STU3, model.kind());
        Assertions.assertEquals("inpm", model.etag());
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServicesResource model = new ServicesResource().withLocation("vwmf")
            .withTags(mapOf("mkjozkrwf", "scmdvpjhulsuu")).withKind(Kind.FHIR_STU3).withEtag("inpm")
            .withIdentity(new ServicesResourceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED));
        model = BinaryData.fromObject(model).toObject(ServicesResource.class);
        Assertions.assertEquals("vwmf", model.location());
        Assertions.assertEquals("scmdvpjhulsuu", model.tags().get("mkjozkrwf"));
        Assertions.assertEquals(Kind.FHIR_STU3, model.kind());
        Assertions.assertEquals("inpm", model.etag());
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
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
