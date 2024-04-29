// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

/**
 * Samples for GroupQuotaSubscriptionAllocation Get.
 */
public final class GroupQuotaSubscriptionAllocationGetSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/SubscriptionQuotaAllocation/SubscriptionQuotaAllocation_Get-Compute.json
     */
    /**
     * Sample code: SubscriptionQuotaAllocation_Get_Request_ForCompute.
     * 
     * @param manager Entry point to QuotaManager.
     */
    public static void
        subscriptionQuotaAllocationGetRequestForCompute(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager.groupQuotaSubscriptionAllocations()
            .getWithResponse("E7EC67B3-7657-4966-BFFC-41EFD36BAA09", "groupquota1", "standardav2family",
                "provider eq Microsoft.Compute & location eq westus", com.azure.core.util.Context.NONE);
    }
}
