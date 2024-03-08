// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.WorkloadProtectableItemResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class BackupProtectableItemsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"protectableItemType\":\"WorkloadProtectableItem\",\"backupManagementType\":\"ekpt\",\"workloadType\":\"aydb\",\"friendlyName\":\"c\",\"protectionState\":\"ProtectionFailed\"},\"eTag\":\"cfnzhmhsurlgw\",\"location\":\"kpmmz\",\"tags\":{\"momsgvvj\":\"auolawiu\",\"dfl\":\"vvlrlohewjjmajn\",\"eq\":\"ionsw\",\"xjoshohtotryegpk\":\"zfz\"},\"id\":\"xrmexznlw\",\"name\":\"bfokxkhu\",\"type\":\"ze\"}]}";

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

        RecoveryServicesBackupManager manager = RecoveryServicesBackupManager.configure().withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<WorkloadProtectableItemResource> response = manager.backupProtectableItems().list("neerzztrknsj",
            "lugdybnhrxlelf", "hkeizcp", "htdm", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("kpmmz", response.iterator().next().location());
        Assertions.assertEquals("auolawiu", response.iterator().next().tags().get("momsgvvj"));
        Assertions.assertEquals("ekpt", response.iterator().next().properties().backupManagementType());
        Assertions.assertEquals("aydb", response.iterator().next().properties().workloadType());
        Assertions.assertEquals("c", response.iterator().next().properties().friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTION_FAILED,
            response.iterator().next().properties().protectionState());
        Assertions.assertEquals("cfnzhmhsurlgw", response.iterator().next().etag());
    }
}
