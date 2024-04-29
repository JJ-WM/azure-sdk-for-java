// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

/**
 * Samples for FirewallRules Delete.
 */
public final class FirewallRulesDeleteSamples {
    /*
     * x-ms-original-file: specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/preview/2023-12-01-preview/examples/FirewallRuleDelete.json
     */
    /**
     * Sample code: FirewallRuleDelete.
     * 
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void
        firewallRuleDelete(com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.firewallRules().delete("testrg", "testserver", "rule1", com.azure.core.util.Context.NONE);
    }
}
