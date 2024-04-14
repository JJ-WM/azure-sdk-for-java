// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.GovernanceRule;
import com.azure.resourcemanager.security.models.GovernanceRuleOwnerSourceType;
import com.azure.resourcemanager.security.models.GovernanceRuleSourceResourceType;
import com.azure.resourcemanager.security.models.GovernanceRuleType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class GovernanceRulesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"tenantId\":\"bajadknm\",\"displayName\":\"tbdoprwkampy\",\"description\":\"pbldz\",\"remediationTimeframe\":\"udrcycm\",\"isGracePeriod\":true,\"rulePriority\":591345317,\"isDisabled\":false,\"ruleType\":\"Integrated\",\"sourceResourceType\":\"Assessments\",\"excludedScopes\":[\"hqkn\"],\"conditionSets\":[\"datakmnbzko\",\"dataaiildcpud\",\"datahquxsyjofpgv\",\"datadrobujnjgy\"],\"includeMemberScopes\":true,\"ownerSource\":{\"type\":\"ByTag\",\"value\":\"igidulln\"},\"governanceEmailNotification\":{\"disableManagerEmailNotification\":false,\"disableOwnerEmailNotification\":true},\"metadata\":{\"createdBy\":\"hnytsl\",\"createdOn\":\"2021-11-06T10:08:06Z\",\"updatedBy\":\"uqzng\",\"updatedOn\":\"2021-06-08T10:23:45Z\"}},\"id\":\"kyqzjsdkpvnr\",\"name\":\"zwpf\",\"type\":\"xsfybntmveho\"}";

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

        GovernanceRule response = manager.governanceRules()
            .getWithResponse("w", "zpddarcbcdwhs", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("tbdoprwkampy", response.displayName());
        Assertions.assertEquals("pbldz", response.description());
        Assertions.assertEquals("udrcycm", response.remediationTimeframe());
        Assertions.assertEquals(true, response.isGracePeriod());
        Assertions.assertEquals(591345317, response.rulePriority());
        Assertions.assertEquals(false, response.isDisabled());
        Assertions.assertEquals(GovernanceRuleType.INTEGRATED, response.ruleType());
        Assertions.assertEquals(GovernanceRuleSourceResourceType.ASSESSMENTS, response.sourceResourceType());
        Assertions.assertEquals("hqkn", response.excludedScopes().get(0));
        Assertions.assertEquals(true, response.includeMemberScopes());
        Assertions.assertEquals(GovernanceRuleOwnerSourceType.BY_TAG, response.ownerSource().type());
        Assertions.assertEquals("igidulln", response.ownerSource().value());
        Assertions.assertEquals(false, response.governanceEmailNotification().disableManagerEmailNotification());
        Assertions.assertEquals(true, response.governanceEmailNotification().disableOwnerEmailNotification());
    }
}
