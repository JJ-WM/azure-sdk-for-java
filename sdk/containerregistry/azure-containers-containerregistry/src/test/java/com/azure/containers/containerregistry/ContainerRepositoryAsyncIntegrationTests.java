// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.containers.containerregistry.models.ArtifactManifestOrder;
import com.azure.containers.containerregistry.models.ContainerRepositoryProperties;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpClient;
import com.azure.core.test.TestMode;
import com.azure.core.test.http.AssertingHttpClientBuilder;
import com.azure.core.util.Context;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import reactor.test.StepVerifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static com.azure.containers.containerregistry.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;
import static com.azure.containers.containerregistry.TestUtils.HELLO_WORLD_REPOSITORY_NAME;
import static com.azure.containers.containerregistry.TestUtils.LATEST_TAG_NAME;
import static com.azure.containers.containerregistry.TestUtils.PAGESIZE_2;
import static com.azure.containers.containerregistry.TestUtils.REGISTRY_ENDPOINT;
import static com.azure.containers.containerregistry.TestUtils.REGISTRY_ENDPOINT_PLAYBACK;
import static com.azure.containers.containerregistry.TestUtils.TAG_UNKNOWN;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Execution(ExecutionMode.SAME_THREAD)
public class ContainerRepositoryAsyncIntegrationTests extends ContainerRegistryClientsTestBase {

    private ContainerRepositoryAsync asyncClient;
    private ContainerRepository client;
    private ContainerRepositoryProperties contentProperties;

    @BeforeEach
    void beforeEach() {
        TestUtils.importImage(getTestMode(), HELLO_WORLD_REPOSITORY_NAME, Arrays.asList("latest", "v1", "v2", "v3", "v4"));
    }

    @AfterEach
    void afterEach() {
        if (getTestMode() == TestMode.PLAYBACK) {
            return;
        }

        if (contentProperties == null) {
            return;
        }

        client = getContainerRepository(HttpClient.createDefault());
        client.updateProperties(defaultRepoWriteableProperties);
    }

    private HttpClient buildAsyncAssertingClient(HttpClient httpClient) {
        return new AssertingHttpClientBuilder(httpClient)
            .assertAsync()
            .build();
    }

    private HttpClient buildSyncAssertingClient(HttpClient httpClient) {
        return new AssertingHttpClientBuilder(httpClient)
            .assertSync()
            .build();
    }

    private ContainerRepositoryAsync getContainerRepositoryAsync(HttpClient httpClient) {
        return getContainerRegistryBuilder(buildAsyncAssertingClient(interceptorManager.isPlaybackMode() ? interceptorManager.getPlaybackClient() : httpClient))
            .buildAsyncClient()
            .getRepository(HELLO_WORLD_REPOSITORY_NAME);
    }

    private ContainerRepositoryAsync getUnknownContainerRepositoryAsync(HttpClient httpClient) {
        return getContainerRegistryBuilder(buildAsyncAssertingClient(interceptorManager.isPlaybackMode() ? interceptorManager.getPlaybackClient() : httpClient))
            .buildAsyncClient()
            .getRepository(TAG_UNKNOWN);
    }

    private ContainerRepository getContainerRepository(HttpClient httpClient) {
        return getContainerRegistryBuilder(buildSyncAssertingClient(interceptorManager.isPlaybackMode() ? interceptorManager.getPlaybackClient() : httpClient))
            .buildClient()
            .getRepository(HELLO_WORLD_REPOSITORY_NAME);
    }

    private ContainerRepository getUnknownContainerRepository(HttpClient httpClient) {
        return getContainerRegistryBuilder(buildSyncAssertingClient(interceptorManager.isPlaybackMode() ? interceptorManager.getPlaybackClient() : httpClient))
            .buildClient()
            .getRepository(TAG_UNKNOWN);
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void getPropertiesWithResponse(HttpClient httpClient) {
        asyncClient = getContainerRepositoryAsync(httpClient);
        client = getContainerRepository(httpClient);

        StepVerifier.create(asyncClient.getPropertiesWithResponse())
            .assertNext(this::validateProperties)
            .verifyComplete();

        StepVerifier.create(asyncClient.getProperties())
            .assertNext(this::validateProperties)
            .verifyComplete();

        validateProperties(client.getProperties());
        validateProperties(client.getPropertiesWithResponse(Context.NONE));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void getUnknownRepositoryPropertiesWithResponse(HttpClient httpClient) {
        asyncClient = getUnknownContainerRepositoryAsync(httpClient);
        client = getUnknownContainerRepository(httpClient);

        StepVerifier.create(asyncClient.getPropertiesWithResponse())
            .verifyError(ResourceNotFoundException.class);


        StepVerifier.create(asyncClient.getProperties())
            .verifyError(ResourceNotFoundException.class);

        assertThrows(ResourceNotFoundException.class, () -> client.getPropertiesWithResponse(Context.NONE));
        assertThrows(ResourceNotFoundException.class, () -> client.getProperties());
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listArtifacts(HttpClient httpClient) {
        asyncClient = getContainerRepositoryAsync(httpClient);
        client = getContainerRepository(httpClient);

        StepVerifier.create(asyncClient.listManifestProperties())
            .recordWith(ArrayList::new)
            .thenConsumeWhile(x -> true)
            .expectRecordedMatches(artifacts -> {
                validateListArtifacts(artifacts);
                return true;
            })
            .verifyComplete();

        validateListArtifacts(client.listManifestProperties().stream().collect(Collectors.toList()));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listArtifactsWithPageSize(HttpClient httpClient) {
        asyncClient = getContainerRepositoryAsync(httpClient);
        client = getContainerRepository(httpClient);

        StepVerifier.create(asyncClient.listManifestProperties().byPage(PAGESIZE_2))
            .recordWith(ArrayList::new)
            .thenConsumeWhile(x -> true)
            .expectRecordedMatches(this::validateListArtifactsByPage).verifyComplete();

        validateListArtifactsByPage(client.listManifestProperties().streamByPage(PAGESIZE_2).collect(Collectors.toList()));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listArtifactsWithInvalidPageSize(HttpClient httpClient) {
        ContainerRepositoryAsync client = getContainerRepositoryAsync(httpClient);
        StepVerifier.create(client.listManifestProperties().byPage(-1)).expectError(IllegalArgumentException.class).verify();
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listArtifactsWithPageSizeAndOrderBy(HttpClient httpClient) {
        asyncClient = getContainerRepositoryAsync(httpClient);
        client = getContainerRepository(httpClient);

        StepVerifier.create(asyncClient.listManifestProperties(ArtifactManifestOrder.LAST_UPDATED_ON_ASCENDING).byPage(PAGESIZE_2))
            .recordWith(ArrayList::new)
            .thenConsumeWhile(x -> true)
            .expectRecordedMatches(pagedResList -> validateListArtifactsByPage(pagedResList, true))
            .verifyComplete();

        validateListArtifactsByPage(
            client.listManifestProperties(ArtifactManifestOrder.LAST_UPDATED_ON_ASCENDING, Context.NONE).streamByPage(PAGESIZE_2).collect(Collectors.toList()),
            true);

        validateListArtifactsByPage(
            client.listManifestProperties(ArtifactManifestOrder.LAST_UPDATED_ON_ASCENDING).streamByPage(PAGESIZE_2).collect(Collectors.toList()),
            true);
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listArtifactsWithPageSizeNoOrderBy(HttpClient httpClient) {
        asyncClient = getContainerRepositoryAsync(httpClient);
        client = getContainerRepository(httpClient);

        StepVerifier.create(asyncClient.listManifestProperties(ArtifactManifestOrder.NONE).byPage(PAGESIZE_2))
            .recordWith(ArrayList::new)
            .thenConsumeWhile(x -> true)
            .expectRecordedMatches(this::validateListArtifactsByPage)
            .verifyComplete();

        validateListArtifactsByPage(client.listManifestProperties(ArtifactManifestOrder.NONE, Context.NONE).streamByPage(PAGESIZE_2).collect(Collectors.toList()));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void updateProperties(HttpClient httpClient) {
        asyncClient = getContainerRepositoryAsync(httpClient);
        client = getContainerRepository(httpClient);

        contentProperties = repoWriteableProperties;

        StepVerifier.create(asyncClient.updatePropertiesWithResponse(repoWriteableProperties))
            .assertNext(res -> validateRepoContentProperties(res.getValue()))
            .verifyComplete();

        StepVerifier.create(asyncClient.updateProperties(repoWriteableProperties))
            .assertNext(this::validateRepoContentProperties)
            .verifyComplete();

        validateRepoContentProperties(client.updateProperties(repoWriteableProperties));
        validateRepoContentProperties(client.updatePropertiesWithResponse(repoWriteableProperties, Context.NONE).getValue());

        StepVerifier.create(asyncClient.updateProperties(null))
            .expectError(NullPointerException.class)
            .verify();

        StepVerifier.create(asyncClient.updatePropertiesWithResponse(null))
            .expectError(NullPointerException.class)
            .verify();
        assertThrows(NullPointerException.class, () -> client.updateProperties(null));
        assertThrows(NullPointerException.class, () -> client.updatePropertiesWithResponse(null, Context.NONE));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void getArtifactRegistry(HttpClient httpClient) {
        asyncClient = getContainerRepositoryAsync(httpClient);
        client = getContainerRepository(httpClient);

        RegistryArtifactAsync registryArtifactAsync = asyncClient.getArtifact(LATEST_TAG_NAME);
        assertNotNull(registryArtifactAsync);
        StepVerifier.create(registryArtifactAsync.getManifestProperties())
            .assertNext(res -> validateManifestProperties(res, true, false))
            .verifyComplete();

        RegistryArtifact registryArtifact = client.getArtifact(LATEST_TAG_NAME);
        assertNotNull(registryArtifact);
        validateManifestProperties(registryArtifact.getManifestProperties(), true, false);
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void getArtifactTestThrows(HttpClient httpClient) {
        asyncClient = getContainerRepositoryAsync(httpClient);
        client = getContainerRepository(httpClient);

        assertThrows(NullPointerException.class, () -> client.getArtifact(null));
        assertThrows(IllegalArgumentException.class, () -> client.getArtifact(""));
        assertThrows(NullPointerException.class, () -> asyncClient.getArtifact(null));
        assertThrows(IllegalArgumentException.class, () -> asyncClient.getArtifact(""));

    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void convenienceMethods(HttpClient httpClient) {
        asyncClient = getContainerRepositoryAsync(httpClient);
        client = getContainerRepository(httpClient);

        String registryEndpoint = REGISTRY_ENDPOINT;
        if (getTestMode() == TestMode.PLAYBACK) {
            registryEndpoint = REGISTRY_ENDPOINT_PLAYBACK;
        }

        assertEquals(HELLO_WORLD_REPOSITORY_NAME, asyncClient.getName());
        assertEquals(HELLO_WORLD_REPOSITORY_NAME, client.getName());

        assertEquals(registryEndpoint, asyncClient.getRegistryEndpoint());
        assertEquals(registryEndpoint, client.getRegistryEndpoint());
    }
}
