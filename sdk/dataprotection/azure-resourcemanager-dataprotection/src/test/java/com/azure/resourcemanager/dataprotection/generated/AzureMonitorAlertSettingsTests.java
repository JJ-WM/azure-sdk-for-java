// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AlertsState;
import com.azure.resourcemanager.dataprotection.models.AzureMonitorAlertSettings;
import org.junit.jupiter.api.Assertions;

public final class AzureMonitorAlertSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMonitorAlertSettings model =
            BinaryData
                .fromString("{\"alertsForAllJobFailures\":\"Enabled\"}")
                .toObject(AzureMonitorAlertSettings.class);
        Assertions.assertEquals(AlertsState.ENABLED, model.alertsForAllJobFailures());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMonitorAlertSettings model =
            new AzureMonitorAlertSettings().withAlertsForAllJobFailures(AlertsState.ENABLED);
        model = BinaryData.fromObject(model).toObject(AzureMonitorAlertSettings.class);
        Assertions.assertEquals(AlertsState.ENABLED, model.alertsForAllJobFailures());
    }
}
