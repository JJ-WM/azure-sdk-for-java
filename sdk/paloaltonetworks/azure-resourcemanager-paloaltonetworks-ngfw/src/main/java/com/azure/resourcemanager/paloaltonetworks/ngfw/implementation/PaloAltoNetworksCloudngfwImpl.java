// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.CertificateObjectGlobalRulestacksClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.CertificateObjectLocalRulestacksClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.FirewallStatusClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.FirewallsClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.FqdnListGlobalRulestacksClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.FqdnListLocalRulestacksClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.GlobalRulestacksClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.LocalRulesClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.LocalRulestacksClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.OperationsClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.PaloAltoNetworksCloudngfw;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.PostRulesClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.PreRulesClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.PrefixListGlobalRulestacksClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.PrefixListLocalRulestacksClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the PaloAltoNetworksCloudngfwImpl type.
 */
@ServiceClient(builder = PaloAltoNetworksCloudngfwBuilder.class)
public final class PaloAltoNetworksCloudngfwImpl implements PaloAltoNetworksCloudngfw {
    /**
     * The ID of the target subscription.
     */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     * 
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * server parameter.
     */
    private final String endpoint;

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Api Version.
     */
    private final String apiVersion;

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The default poll interval for long-running operation.
     */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /**
     * The GlobalRulestacksClient object to access its operations.
     */
    private final GlobalRulestacksClient globalRulestacks;

    /**
     * Gets the GlobalRulestacksClient object to access its operations.
     * 
     * @return the GlobalRulestacksClient object.
     */
    public GlobalRulestacksClient getGlobalRulestacks() {
        return this.globalRulestacks;
    }

    /**
     * The CertificateObjectGlobalRulestacksClient object to access its operations.
     */
    private final CertificateObjectGlobalRulestacksClient certificateObjectGlobalRulestacks;

    /**
     * Gets the CertificateObjectGlobalRulestacksClient object to access its operations.
     * 
     * @return the CertificateObjectGlobalRulestacksClient object.
     */
    public CertificateObjectGlobalRulestacksClient getCertificateObjectGlobalRulestacks() {
        return this.certificateObjectGlobalRulestacks;
    }

    /**
     * The FqdnListGlobalRulestacksClient object to access its operations.
     */
    private final FqdnListGlobalRulestacksClient fqdnListGlobalRulestacks;

    /**
     * Gets the FqdnListGlobalRulestacksClient object to access its operations.
     * 
     * @return the FqdnListGlobalRulestacksClient object.
     */
    public FqdnListGlobalRulestacksClient getFqdnListGlobalRulestacks() {
        return this.fqdnListGlobalRulestacks;
    }

    /**
     * The PostRulesClient object to access its operations.
     */
    private final PostRulesClient postRules;

    /**
     * Gets the PostRulesClient object to access its operations.
     * 
     * @return the PostRulesClient object.
     */
    public PostRulesClient getPostRules() {
        return this.postRules;
    }

    /**
     * The PrefixListGlobalRulestacksClient object to access its operations.
     */
    private final PrefixListGlobalRulestacksClient prefixListGlobalRulestacks;

    /**
     * Gets the PrefixListGlobalRulestacksClient object to access its operations.
     * 
     * @return the PrefixListGlobalRulestacksClient object.
     */
    public PrefixListGlobalRulestacksClient getPrefixListGlobalRulestacks() {
        return this.prefixListGlobalRulestacks;
    }

    /**
     * The PreRulesClient object to access its operations.
     */
    private final PreRulesClient preRules;

    /**
     * Gets the PreRulesClient object to access its operations.
     * 
     * @return the PreRulesClient object.
     */
    public PreRulesClient getPreRules() {
        return this.preRules;
    }

    /**
     * The OperationsClient object to access its operations.
     */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /**
     * The FirewallsClient object to access its operations.
     */
    private final FirewallsClient firewalls;

    /**
     * Gets the FirewallsClient object to access its operations.
     * 
     * @return the FirewallsClient object.
     */
    public FirewallsClient getFirewalls() {
        return this.firewalls;
    }

    /**
     * The LocalRulestacksClient object to access its operations.
     */
    private final LocalRulestacksClient localRulestacks;

    /**
     * Gets the LocalRulestacksClient object to access its operations.
     * 
     * @return the LocalRulestacksClient object.
     */
    public LocalRulestacksClient getLocalRulestacks() {
        return this.localRulestacks;
    }

    /**
     * The FirewallStatusClient object to access its operations.
     */
    private final FirewallStatusClient firewallStatus;

    /**
     * Gets the FirewallStatusClient object to access its operations.
     * 
     * @return the FirewallStatusClient object.
     */
    public FirewallStatusClient getFirewallStatus() {
        return this.firewallStatus;
    }

    /**
     * The CertificateObjectLocalRulestacksClient object to access its operations.
     */
    private final CertificateObjectLocalRulestacksClient certificateObjectLocalRulestacks;

    /**
     * Gets the CertificateObjectLocalRulestacksClient object to access its operations.
     * 
     * @return the CertificateObjectLocalRulestacksClient object.
     */
    public CertificateObjectLocalRulestacksClient getCertificateObjectLocalRulestacks() {
        return this.certificateObjectLocalRulestacks;
    }

    /**
     * The FqdnListLocalRulestacksClient object to access its operations.
     */
    private final FqdnListLocalRulestacksClient fqdnListLocalRulestacks;

    /**
     * Gets the FqdnListLocalRulestacksClient object to access its operations.
     * 
     * @return the FqdnListLocalRulestacksClient object.
     */
    public FqdnListLocalRulestacksClient getFqdnListLocalRulestacks() {
        return this.fqdnListLocalRulestacks;
    }

    /**
     * The LocalRulesClient object to access its operations.
     */
    private final LocalRulesClient localRules;

    /**
     * Gets the LocalRulesClient object to access its operations.
     * 
     * @return the LocalRulesClient object.
     */
    public LocalRulesClient getLocalRules() {
        return this.localRules;
    }

    /**
     * The PrefixListLocalRulestacksClient object to access its operations.
     */
    private final PrefixListLocalRulestacksClient prefixListLocalRulestacks;

    /**
     * Gets the PrefixListLocalRulestacksClient object to access its operations.
     * 
     * @return the PrefixListLocalRulestacksClient object.
     */
    public PrefixListLocalRulestacksClient getPrefixListLocalRulestacks() {
        return this.prefixListLocalRulestacks;
    }

    /**
     * Initializes an instance of PaloAltoNetworksCloudngfw client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription.
     * @param endpoint server parameter.
     */
    PaloAltoNetworksCloudngfwImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter,
        Duration defaultPollInterval, AzureEnvironment environment, String subscriptionId, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2023-09-01";
        this.globalRulestacks = new GlobalRulestacksClientImpl(this);
        this.certificateObjectGlobalRulestacks = new CertificateObjectGlobalRulestacksClientImpl(this);
        this.fqdnListGlobalRulestacks = new FqdnListGlobalRulestacksClientImpl(this);
        this.postRules = new PostRulesClientImpl(this);
        this.prefixListGlobalRulestacks = new PrefixListGlobalRulestacksClientImpl(this);
        this.preRules = new PreRulesClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.firewalls = new FirewallsClientImpl(this);
        this.localRulestacks = new LocalRulestacksClientImpl(this);
        this.firewallStatus = new FirewallStatusClientImpl(this);
        this.certificateObjectLocalRulestacks = new CertificateObjectLocalRulestacksClientImpl(this);
        this.fqdnListLocalRulestacks = new FqdnListLocalRulestacksClientImpl(this);
        this.localRules = new LocalRulesClientImpl(this);
        this.prefixListLocalRulestacks = new PrefixListLocalRulestacksClientImpl(this);
    }

    /**
     * Gets default client context.
     * 
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     * 
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        return CoreUtils.mergeContexts(this.getContext(), context);
    }

    /**
     * Gets long running operation result.
     * 
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline, Type pollResultType, Type finalResultType, Context context) {
        return PollerFactory.create(serializerAdapter, httpPipeline, pollResultType, finalResultType,
            defaultPollInterval, activationResponse, context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     * 
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse = new HttpResponseImpl(lroError.getResponseStatusCode(), lroError.getResponseHeaders(),
                    lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError = this.getSerializerAdapter().deserialize(errorBody, ManagementError.class,
                            SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        LOGGER.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(s);
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PaloAltoNetworksCloudngfwImpl.class);
}
