// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

import com.azure.resourcemanager.monitor.fluent.models.DiagnosticSettingsResourceInner;
import com.azure.resourcemanager.monitor.models.LogSettings;
import com.azure.resourcemanager.monitor.models.MetricSettings;
import com.azure.resourcemanager.monitor.models.RetentionPolicy;
import java.util.Arrays;

/**
 * Samples for DiagnosticSettingsOperation CreateOrUpdate.
 */
public final class DiagnosticSettingsOperationCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2021-05-01-preview/examples/
     * createOrUpdateDiagnosticSetting.json
     */
    /**
     * Sample code: Creates or Updates the diagnostic setting.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createsOrUpdatesTheDiagnosticSetting(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.diagnosticSettings().manager().serviceClient().getDiagnosticSettingsOperations()
            .createOrUpdateWithResponse(
                "subscriptions/1a66ce04-b633-4a0b-b2bc-a912ec8986a6/resourcegroups/viruela1/providers/microsoft.logic/workflows/viruela6",
                "mysetting",
                new DiagnosticSettingsResourceInner().withStorageAccountId(
                    "/subscriptions/df602c9c-7aa0-407d-a6fb-eb20c8bd1192/resourceGroups/apptest/providers/Microsoft.Storage/storageAccounts/appteststorage1")
                    .withEventHubAuthorizationRuleId("fakeTokenPlaceholder").withEventHubName("myeventhub")
                    .withMetrics(Arrays.asList(new MetricSettings().withCategory("WorkflowMetrics").withEnabled(true)
                        .withRetentionPolicy(new RetentionPolicy().withEnabled(false).withDays(0))))
                    .withLogs(Arrays.asList(new LogSettings().withCategoryGroup("allLogs").withEnabled(true)
                        .withRetentionPolicy(new RetentionPolicy().withEnabled(false).withDays(0))))
                    .withWorkspaceId("")
                    .withMarketplacePartnerId(
                        "/subscriptions/abcdeabc-1234-1234-ab12-123a1234567a/resourceGroups/test-rg/providers/Microsoft.Datadog/monitors/dd1")
                    .withLogAnalyticsDestinationType("Dedicated"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2021-05-01-preview/examples/
     * createOrUpdateDiagnosticSettingCategory.json
     */
    /**
     * Sample code: Creates or Updates the diagnostic setting for category.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        createsOrUpdatesTheDiagnosticSettingForCategory(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.diagnosticSettings().manager().serviceClient().getDiagnosticSettingsOperations()
            .createOrUpdateWithResponse(
                "subscriptions/1a66ce04-b633-4a0b-b2bc-a912ec8986a6/resourcegroups/viruela1/providers/microsoft.logic/workflows/viruela6",
                "mysetting",
                new DiagnosticSettingsResourceInner().withStorageAccountId(
                    "/subscriptions/df602c9c-7aa0-407d-a6fb-eb20c8bd1192/resourceGroups/apptest/providers/Microsoft.Storage/storageAccounts/appteststorage1")
                    .withEventHubAuthorizationRuleId("fakeTokenPlaceholder").withEventHubName("myeventhub")
                    .withMetrics(Arrays.asList(new MetricSettings().withCategory("WorkflowMetrics").withEnabled(true)
                        .withRetentionPolicy(new RetentionPolicy().withEnabled(false).withDays(0))))
                    .withLogs(Arrays.asList(new LogSettings().withCategory("WorkflowRuntime").withEnabled(true)
                        .withRetentionPolicy(new RetentionPolicy().withEnabled(false).withDays(0))))
                    .withWorkspaceId("")
                    .withMarketplacePartnerId(
                        "/subscriptions/abcdeabc-1234-1234-ab12-123a1234567a/resourceGroups/test-rg/providers/Microsoft.Datadog/monitors/dd1")
                    .withLogAnalyticsDestinationType("Dedicated"),
                com.azure.core.util.Context.NONE);
    }
}
