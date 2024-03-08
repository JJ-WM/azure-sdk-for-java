// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.springappdiscovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.springappdiscovery.models.SpringbootsitesModelExtendedLocation;
import org.junit.jupiter.api.Assertions;

public final class SpringbootsitesModelExtendedLocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SpringbootsitesModelExtendedLocation model = BinaryData.fromString("{\"type\":\"mrvktsizntoc\",\"name\":\"a\"}")
            .toObject(SpringbootsitesModelExtendedLocation.class);
        Assertions.assertEquals("mrvktsizntoc", model.type());
        Assertions.assertEquals("a", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SpringbootsitesModelExtendedLocation model
            = new SpringbootsitesModelExtendedLocation().withType("mrvktsizntoc").withName("a");
        model = BinaryData.fromObject(model).toObject(SpringbootsitesModelExtendedLocation.class);
        Assertions.assertEquals("mrvktsizntoc", model.type());
        Assertions.assertEquals("a", model.name());
    }
}
