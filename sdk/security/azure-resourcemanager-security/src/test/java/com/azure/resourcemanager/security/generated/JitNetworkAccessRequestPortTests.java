// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.JitNetworkAccessRequestPort;
import com.azure.resourcemanager.security.models.Status;
import com.azure.resourcemanager.security.models.StatusReason;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class JitNetworkAccessRequestPortTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JitNetworkAccessRequestPort model = BinaryData.fromString(
            "{\"number\":1818762005,\"allowedSourceAddressPrefix\":\"zeajbk\",\"allowedSourceAddressPrefixes\":[\"cyizy\",\"dcvxodkrvfsxxby\",\"e\"],\"endTimeUtc\":\"2021-07-31T03:11:58Z\",\"status\":\"Initiated\",\"statusReason\":\"Expired\",\"mappedPort\":1484033472}")
            .toObject(JitNetworkAccessRequestPort.class);
        Assertions.assertEquals(1818762005, model.number());
        Assertions.assertEquals("zeajbk", model.allowedSourceAddressPrefix());
        Assertions.assertEquals("cyizy", model.allowedSourceAddressPrefixes().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-31T03:11:58Z"), model.endTimeUtc());
        Assertions.assertEquals(Status.INITIATED, model.status());
        Assertions.assertEquals(StatusReason.EXPIRED, model.statusReason());
        Assertions.assertEquals(1484033472, model.mappedPort());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JitNetworkAccessRequestPort model
            = new JitNetworkAccessRequestPort().withNumber(1818762005).withAllowedSourceAddressPrefix("zeajbk")
                .withAllowedSourceAddressPrefixes(Arrays.asList("cyizy", "dcvxodkrvfsxxby", "e"))
                .withEndTimeUtc(OffsetDateTime.parse("2021-07-31T03:11:58Z")).withStatus(Status.INITIATED)
                .withStatusReason(StatusReason.EXPIRED).withMappedPort(1484033472);
        model = BinaryData.fromObject(model).toObject(JitNetworkAccessRequestPort.class);
        Assertions.assertEquals(1818762005, model.number());
        Assertions.assertEquals("zeajbk", model.allowedSourceAddressPrefix());
        Assertions.assertEquals("cyizy", model.allowedSourceAddressPrefixes().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-31T03:11:58Z"), model.endTimeUtc());
        Assertions.assertEquals(Status.INITIATED, model.status());
        Assertions.assertEquals(StatusReason.EXPIRED, model.statusReason());
        Assertions.assertEquals(1484033472, model.mappedPort());
    }
}
