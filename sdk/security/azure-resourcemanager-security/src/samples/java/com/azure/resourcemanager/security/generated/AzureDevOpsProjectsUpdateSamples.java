// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.resourcemanager.security.models.ActionableRemediation;
import com.azure.resourcemanager.security.models.ActionableRemediationState;
import com.azure.resourcemanager.security.models.AzureDevOpsProject;
import com.azure.resourcemanager.security.models.AzureDevOpsProjectProperties;
import com.azure.resourcemanager.security.models.OnboardingState;

/**
 * Samples for AzureDevOpsProjects Update.
 */
public final class AzureDevOpsProjectsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2023-09-01-preview/examples/
     * SecurityConnectorsDevOps/UpdateAzureDevOpsProjects_example.json
     */
    /**
     * Sample code: Update_AzureDevOpsProjects.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void updateAzureDevOpsProjects(com.azure.resourcemanager.security.SecurityManager manager) {
        AzureDevOpsProject resource = manager.azureDevOpsProjects().getWithResponse("myRg", "mySecurityConnectorName",
            "myAzDevOpsOrg", "myAzDevOpsProject", com.azure.core.util.Context.NONE).getValue();
        resource.update()
            .withProperties(new AzureDevOpsProjectProperties().withOnboardingState(OnboardingState.NOT_APPLICABLE)
                .withActionableRemediation(new ActionableRemediation().withState(ActionableRemediationState.ENABLED)))
            .apply();
    }
}
