// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.resourcemanager.recoveryservicessiterecovery.models.ResumeJobParams;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ResumeJobParamsProperties;

/** Samples for ReplicationJobs Resume. */
public final class ReplicationJobsResumeSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2023-06-01/examples/ReplicationJobs_Resume.json
     */
    /**
     * Sample code: Resumes the specified job.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void resumesTheSpecifiedJob(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationJobs()
            .resume(
                "vault1",
                "resourceGroupPS1",
                "58776d0b-3141-48b2-a377-9ad863eb160d",
                new ResumeJobParams().withProperties(new ResumeJobParamsProperties().withComments(" ")),
                com.azure.core.util.Context.NONE);
    }
}
