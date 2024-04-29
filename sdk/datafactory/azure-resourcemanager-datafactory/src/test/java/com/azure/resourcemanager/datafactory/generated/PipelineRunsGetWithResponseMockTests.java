// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.PipelineRun;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PipelineRunsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"runId\":\"myzoievdb\",\"runGroupId\":\"msndoxuzfapzqj\",\"isLatest\":true,\"pipelineName\":\"hlxq\",\"parameters\":{\"sftjrdilnxbtwm\":\"jgosvcoldyt\",\"mwwsya\":\"xledkjcysfluufvn\",\"ugrlnk\":\"hbikvcy\",\"ucflada\":\"ylgwceickwz\"},\"runDimensions\":{\"bmjzdtxolxzlx\":\"edbhnmbqro\",\"ohsitdlsem\":\"kyrrmrylt\"},\"invokedBy\":{\"name\":\"aakncigyqatvcwtp\",\"id\":\"cdda\",\"invokedByType\":\"ppcypjhnfld\",\"pipelineName\":\"jzvigszgfw\",\"pipelineRunId\":\"ztkldwaqftfbkd\"},\"lastUpdated\":\"2021-10-19T14:15:09Z\",\"runStart\":\"2021-03-29T20:28:40Z\",\"runEnd\":\"2021-05-20T13:13:37Z\",\"durationInMs\":403018461,\"status\":\"esasnpedvq\",\"message\":\"ljmvjojplxyolgsh\",\"\":{\"xfemixxqbrsmomr\":\"datayzizyl\",\"mjcqwgc\":\"datadq\"}}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PipelineRun response = manager.pipelineRuns()
            .getWithResponse("au", "bkihr", "sdsmmdpn", com.azure.core.util.Context.NONE)
            .getValue();

    }
}
