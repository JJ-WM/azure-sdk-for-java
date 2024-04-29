// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

/**
 * Samples for Diagnostics Create.
 */
public final class DiagnosticsCreateSamples {
    /*
     * x-ms-original-file: specification/help/resource-manager/Microsoft.Help/preview/2024-03-01-preview/examples/CreateDiagnosticForKeyVaultResource.json
     */
    /**
     * Sample code: Creates a Diagnostic for a KeyVault resource.
     * 
     * @param manager Entry point to SelfHelpManager.
     */
    public static void
        createsADiagnosticForAKeyVaultResource(com.azure.resourcemanager.selfhelp.SelfHelpManager manager) {
        manager.diagnostics()
            .define("VMNotWorkingInsight")
            .withExistingScope(
                "subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourceGroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read")
            .create();
    }
}
