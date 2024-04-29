// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.standbypool.StandbyPoolManager;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolResource;
import com.azure.resourcemanager.standbypool.models.VirtualMachineState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class StandbyVirtualMachinePoolsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"elasticityProfile\":{\"maxReadyCapacity\":4492808256673380449},\"virtualMachineState\":\"Running\",\"attachedVirtualMachineScaleSetId\":\"axcfjpgddtocjjx\",\"provisioningState\":\"Canceled\"},\"location\":\"o\",\"tags\":{\"xibqeojnx\":\"hd\",\"dntwndeicbtw\":\"bzv\",\"cffcyddglmj\":\"pzaoqvuhr\",\"wpyeicxmqciwqvh\":\"hjq\"},\"id\":\"hix\",\"name\":\"igdtopbob\",\"type\":\"og\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        StandbyPoolManager manager = StandbyPoolManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<StandbyVirtualMachinePoolResource> response = manager.standbyVirtualMachinePools()
            .listByResourceGroup("bkbfkgukdkex", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("o", response.iterator().next().location());
        Assertions.assertEquals("hd", response.iterator().next().tags().get("xibqeojnx"));
        Assertions.assertEquals(4492808256673380449L,
            response.iterator().next().properties().elasticityProfile().maxReadyCapacity());
        Assertions.assertEquals(VirtualMachineState.RUNNING,
            response.iterator().next().properties().virtualMachineState());
        Assertions.assertEquals("axcfjpgddtocjjx",
            response.iterator().next().properties().attachedVirtualMachineScaleSetId());
    }
}
