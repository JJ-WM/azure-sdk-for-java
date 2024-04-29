// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.CheckNameAvailabilityRequest;
import org.junit.jupiter.api.Assertions;

public final class CheckNameAvailabilityRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CheckNameAvailabilityRequest model
            = BinaryData.fromString("{\"name\":\"juohminyflnorw\",\"type\":\"uvwpklvxwmyg\"}")
                .toObject(CheckNameAvailabilityRequest.class);
        Assertions.assertEquals("juohminyflnorw", model.name());
        Assertions.assertEquals("uvwpklvxwmyg", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CheckNameAvailabilityRequest model
            = new CheckNameAvailabilityRequest().withName("juohminyflnorw").withType("uvwpklvxwmyg");
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityRequest.class);
        Assertions.assertEquals("juohminyflnorw", model.name());
        Assertions.assertEquals("uvwpklvxwmyg", model.type());
    }
}
