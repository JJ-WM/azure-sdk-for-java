// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.costmanagement.models.OperationStatusType;
import com.azure.resourcemanager.costmanagement.models.ReservationReportSchema;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class OperationStatusInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationStatusInner model =
            BinaryData
                .fromString(
                    "{\"status\":\"Completed\",\"properties\":{\"reportUrl\":\"Kind\",\"validUntil\":\"2021-02-19T20:13:34Z\"}}")
                .toObject(OperationStatusInner.class);
        Assertions.assertEquals(OperationStatusType.COMPLETED, model.status());
        Assertions.assertEquals(ReservationReportSchema.KIND, model.reportUrl());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-19T20:13:34Z"), model.validUntil());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationStatusInner model =
            new OperationStatusInner()
                .withStatus(OperationStatusType.COMPLETED)
                .withReportUrl(ReservationReportSchema.KIND)
                .withValidUntil(OffsetDateTime.parse("2021-02-19T20:13:34Z"));
        model = BinaryData.fromObject(model).toObject(OperationStatusInner.class);
        Assertions.assertEquals(OperationStatusType.COMPLETED, model.status());
        Assertions.assertEquals(ReservationReportSchema.KIND, model.reportUrl());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-19T20:13:34Z"), model.validUntil());
    }
}
