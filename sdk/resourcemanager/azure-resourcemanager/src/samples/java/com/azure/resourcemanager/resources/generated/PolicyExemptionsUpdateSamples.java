// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.resourcemanager.resources.models.AssignmentScopeValidation;
import com.azure.resourcemanager.resources.models.PolicyExemptionUpdate;
import com.azure.resourcemanager.resources.models.ResourceSelector;
import com.azure.resourcemanager.resources.models.Selector;
import com.azure.resourcemanager.resources.models.SelectorKind;
import java.util.Arrays;

/**
 * Samples for PolicyExemptions Update.
 */
public final class PolicyExemptionsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Authorization/preview/2022-07-01-preview/examples/
     * updatePolicyExemptionWithResourceSelectors.json
     */
    /**
     * Sample code: Update a policy exemption with resource selectors.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        updateAPolicyExemptionWithResourceSelectors(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.genericResources()
            .manager()
            .policyClient()
            .getPolicyExemptions()
            .updateWithResponse("subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2/resourceGroups/demoCluster",
                "DemoExpensiveVM",
                new PolicyExemptionUpdate()
                    .withResourceSelectors(Arrays.asList(new ResourceSelector().withName("SDPRegions")
                        .withSelectors(Arrays.asList(new Selector().withKind(SelectorKind.RESOURCE_LOCATION)
                            .withIn(Arrays.asList("eastus2euap", "centraluseuap"))))))
                    .withAssignmentScopeValidation(AssignmentScopeValidation.DEFAULT),
                com.azure.core.util.Context.NONE);
    }
}
