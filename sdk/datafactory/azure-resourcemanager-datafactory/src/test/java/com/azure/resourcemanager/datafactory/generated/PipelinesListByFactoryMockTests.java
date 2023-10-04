// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.PipelineResource;
import com.azure.resourcemanager.datafactory.models.VariableType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PipelinesListByFactoryMockTests {
    @Test
    public void testListByFactory() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"description\":\"udromhhs\",\"activities\":[{\"type\":\"Activity\",\"name\":\"fvrakpq\",\"description\":\"toiudveoib\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"jxilbsbhaqsucwdc\",\"dependencyConditions\":[]},{\"activity\":\"dkwwuljv\",\"dependencyConditions\":[]}],\"userProperties\":[{\"name\":\"gsxr\",\"value\":\"datax\"},{\"name\":\"ofmvau\",\"value\":\"datanhmnswlf\"}],\"\":{\"aytvi\":\"dataild\",\"dpssklm\":\"datavejwtzki\"}},{\"type\":\"Activity\",\"name\":\"taeallsxfzantssb\",\"description\":\"oqx\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"gxrfrmdpwpzuxoy\",\"dependencyConditions\":[]}],\"userProperties\":[{\"name\":\"kloqpwsaqcre\",\"value\":\"datakgjdn\"}],\"\":{\"nmanrzjpr\":\"datapvrwecrvkiao\",\"szjb\":\"dataqwjwpej\"}},{\"type\":\"Activity\",\"name\":\"jcvwvycvnowzcli\",\"description\":\"dlhxwwhusrod\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"wqmocwkw\",\"dependencyConditions\":[]}],\"userProperties\":[{\"name\":\"oqldacxo\",\"value\":\"dataaqassukv\"}],\"\":{\"mjzsjfca\":\"datazxznctxoczns\",\"a\":\"datapkpvdiirv\"}}],\"parameters\":{\"omakmi\":{\"type\":\"Float\",\"defaultValue\":\"datahxok\"},\"xyqprch\":{\"type\":\"String\",\"defaultValue\":\"dataduflajsgutgzcb\"}},\"variables\":{\"oaazvm\":{\"type\":\"Array\",\"defaultValue\":\"dataaoytkk\"},\"jtkpocqboyjjfx\":{\"type\":\"String\",\"defaultValue\":\"datadzfypdsrfpihvij\"},\"btux\":{\"type\":\"Bool\",\"defaultValue\":\"dataduyotqbfqt\"}},\"concurrency\":310896649,\"annotations\":[\"dataxolbzjl\",\"datarpsqp\"],\"runDimensions\":{\"xcahfoemcajj\":\"datacoibiodfybafenwv\",\"gnjhxydxicou\":\"datazoykw\",\"ejmjp\":\"datalgtbslagtmkiilc\"},\"folder\":{\"name\":\"bzlmztkzg\"},\"policy\":{\"elapsedTimeMetric\":{\"duration\":\"dataytq\"}}},\"name\":\"szdpto\",\"type\":\"cnxgqovfrtmwyez\",\"etag\":\"xmcawpbifzwo\",\"\":{\"l\":\"datacvjmyinplomejhxf\",\"ialsr\":\"datacbbabi\",\"wrpjoqc\":\"datazatl\"},\"id\":\"wzwshsg\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        DataFactoryManager manager =
            DataFactoryManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PipelineResource> response =
            manager.pipelines().listByFactory("jzlnrellwf", "yabglsarfmjsch", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("wzwshsg", response.iterator().next().id());
        Assertions.assertEquals("udromhhs", response.iterator().next().description());
        Assertions.assertEquals("fvrakpq", response.iterator().next().activities().get(0).name());
        Assertions.assertEquals("toiudveoib", response.iterator().next().activities().get(0).description());
        Assertions.assertEquals(ActivityState.ACTIVE, response.iterator().next().activities().get(0).state());
        Assertions
            .assertEquals(
                ActivityOnInactiveMarkAs.FAILED, response.iterator().next().activities().get(0).onInactiveMarkAs());
        Assertions
            .assertEquals(
                "jxilbsbhaqsucwdc", response.iterator().next().activities().get(0).dependsOn().get(0).activity());
        Assertions.assertEquals("gsxr", response.iterator().next().activities().get(0).userProperties().get(0).name());
        Assertions.assertEquals(ParameterType.FLOAT, response.iterator().next().parameters().get("omakmi").type());
        Assertions.assertEquals(VariableType.ARRAY, response.iterator().next().variables().get("oaazvm").type());
        Assertions.assertEquals(310896649, response.iterator().next().concurrency());
        Assertions.assertEquals("bzlmztkzg", response.iterator().next().folder().name());
    }
}
