// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.ActionableRemediationState;
import com.azure.resourcemanager.security.models.AnnotateDefaultBranchState;
import com.azure.resourcemanager.security.models.AzureDevOpsOrg;
import com.azure.resourcemanager.security.models.DevOpsProvisioningState;
import com.azure.resourcemanager.security.models.InheritFromParentState;
import com.azure.resourcemanager.security.models.OnboardingState;
import com.azure.resourcemanager.security.models.RuleCategory;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AzureDevOpsOrgsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningStatusMessage\":\"hujcqg\",\"provisioningStatusUpdateTimeUtc\":\"2021-04-22T05:04:26Z\",\"provisioningState\":\"Failed\",\"onboardingState\":\"OnboardedByOtherConnector\",\"actionableRemediation\":{\"state\":\"Disabled\",\"categoryConfigurations\":[{\"minimumSeverityLevel\":\"klqrljdc\",\"category\":\"IaC\"},{\"minimumSeverityLevel\":\"ax\",\"category\":\"Secrets\"},{\"minimumSeverityLevel\":\"oqovqhgphgxuwudg\",\"category\":\"IaC\"}],\"branchConfiguration\":{\"branchNames\":[\"um\",\"yddnqivah\"],\"annotateDefaultBranch\":\"Enabled\"},\"inheritFromParentState\":\"Disabled\"}},\"id\":\"jzebp\",\"name\":\"cciyoypoedks\",\"type\":\"w\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        SecurityManager manager = SecurityManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<AzureDevOpsOrg> response
            = manager.azureDevOpsOrgs().list("xgbsdzcgcvypj", "ubdmg", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(DevOpsProvisioningState.FAILED,
            response.iterator().next().properties().provisioningState());
        Assertions.assertEquals(OnboardingState.ONBOARDED_BY_OTHER_CONNECTOR,
            response.iterator().next().properties().onboardingState());
        Assertions.assertEquals(ActionableRemediationState.DISABLED,
            response.iterator().next().properties().actionableRemediation().state());
        Assertions.assertEquals("klqrljdc", response.iterator().next().properties().actionableRemediation()
            .categoryConfigurations().get(0).minimumSeverityLevel());
        Assertions.assertEquals(RuleCategory.IAC,
            response.iterator().next().properties().actionableRemediation().categoryConfigurations().get(0).category());
        Assertions.assertEquals("um",
            response.iterator().next().properties().actionableRemediation().branchConfiguration().branchNames().get(0));
        Assertions.assertEquals(AnnotateDefaultBranchState.ENABLED, response.iterator().next().properties()
            .actionableRemediation().branchConfiguration().annotateDefaultBranch());
        Assertions.assertEquals(InheritFromParentState.DISABLED,
            response.iterator().next().properties().actionableRemediation().inheritFromParentState());
    }
}
