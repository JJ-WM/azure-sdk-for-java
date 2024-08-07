// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.dataprotection.DataProtectionManager;
import com.azure.resourcemanager.dataprotection.models.AzureBackupRestoreRequest;
import com.azure.resourcemanager.dataprotection.models.IdentityDetails;
import com.azure.resourcemanager.dataprotection.models.OperationJobExtendedInfo;
import com.azure.resourcemanager.dataprotection.models.RecoveryOption;
import com.azure.resourcemanager.dataprotection.models.RestoreTargetInfoBase;
import com.azure.resourcemanager.dataprotection.models.SourceDataStoreType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BackupInstancesTriggerRestoreMockTests {
    @Test
    public void testTriggerRestore() throws Exception {
        String responseStr = "{\"objectType\":\"OperationJobExtendedInfo\",\"jobId\":\"asylwx\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataProtectionManager manager = DataProtectionManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        OperationJobExtendedInfo response = manager.backupInstances()
            .triggerRestore("a", "llibphbqzmizak", "kan", new AzureBackupRestoreRequest()
                .withRestoreTargetInfo(new RestoreTargetInfoBase().withRecoveryOption(RecoveryOption.FAIL_IF_EXISTS)
                    .withRestoreLocation("dnjzh"))
                .withSourceDataStoreType(SourceDataStoreType.SNAPSHOT_STORE)
                .withSourceResourceId("ylhjlm")
                .withResourceGuardOperationRequests(Arrays.asList("xprimrsop"))
                .withIdentityDetails(
                    new IdentityDetails().withUseSystemAssignedIdentity(true).withUserAssignedIdentityArmUrl("meisls")),
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("asylwx", response.jobId());
    }
}
