// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.storageactions.StorageActionsManager;
import com.azure.resourcemanager.storageactions.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.storageactions.models.StorageTask;
import com.azure.resourcemanager.storageactions.models.StorageTaskOperationName;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class StorageTasksListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"identity\":{\"principalId\":\"4c60e250-c5b6-4d87-910d-b542d39d05b8\",\"tenantId\":\"6189c58c-c642-4ee3-8f02-e8ab3055ded9\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"knalaulppg\":{\"principalId\":\"91cbe122-a42a-4d9d-bfe6-d40330c4c5e7\",\"clientId\":\"246e7c86-ca17-4c08-8adc-1057c0dd2fee\"},\"pnapnyiropuh\":{\"principalId\":\"ae0824c1-407e-42e1-8825-e533155f1c7e\",\"clientId\":\"14ab147f-43e7-41f1-a34d-928b7b722fb8\"},\"vpgylgqgitxmed\":{\"principalId\":\"18263e01-eae7-46d1-8511-4bfeabf20117\",\"clientId\":\"aa3c943f-54f2-4d47-83ee-577aeab48040\"},\"slynqwwnc\":{\"principalId\":\"94ea7927-27f9-4292-b34b-931f9660825a\",\"clientId\":\"4eff2367-e1ad-491c-94e7-657db2d10db0\"}}},\"properties\":{\"taskVersion\":2313446192917643442,\"enabled\":true,\"description\":\"ktrmgucnapkt\",\"action\":{\"if\":{\"condition\":\"oellwp\",\"operations\":[{\"name\":\"SetBlobImmutabilityPolicy\"},{\"name\":\"SetBlobLegalHold\"},{\"name\":\"SetBlobImmutabilityPolicy\"},{\"name\":\"SetBlobTags\"}]},\"else\":{\"operations\":[{\"name\":\"DeleteBlob\"},{\"name\":\"SetBlobImmutabilityPolicy\"},{\"name\":\"SetBlobTags\"}]}},\"provisioningState\":\"Canceled\",\"creationTimeInUtc\":\"2021-03-25T11:42:18Z\"},\"location\":\"fqrhhuaopppc\",\"tags\":{\"t\":\"xolzdahzx\",\"grcfb\":\"bgbkdmoizpost\",\"bpvjymjhx\":\"nrmfqjhhk\"},\"id\":\"j\",\"name\":\"n\",\"type\":\"u\"}]}";

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

        StorageActionsManager manager = StorageActionsManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<StorageTask> response
            = manager.storageTasks().listByResourceGroup("exznelixhnr", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("fqrhhuaopppc", response.iterator().next().location());
        Assertions.assertEquals("xolzdahzx", response.iterator().next().tags().get("t"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED,
            response.iterator().next().identity().type());
        Assertions.assertEquals(true, response.iterator().next().properties().enabled());
        Assertions.assertEquals("ktrmgucnapkt", response.iterator().next().properties().description());
        Assertions.assertEquals("oellwp", response.iterator().next().properties().action().ifProperty().condition());
        Assertions.assertEquals(StorageTaskOperationName.SET_BLOB_IMMUTABILITY_POLICY,
            response.iterator().next().properties().action().ifProperty().operations().get(0).name());
        Assertions.assertEquals(StorageTaskOperationName.DELETE_BLOB,
            response.iterator().next().properties().action().elseProperty().operations().get(0).name());
    }
}
