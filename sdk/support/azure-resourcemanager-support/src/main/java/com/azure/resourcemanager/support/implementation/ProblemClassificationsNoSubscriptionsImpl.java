// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.support.fluent.ProblemClassificationsNoSubscriptionsClient;
import com.azure.resourcemanager.support.fluent.models.ProblemClassificationsClassificationOutputInner;
import com.azure.resourcemanager.support.models.ProblemClassificationsClassificationInput;
import com.azure.resourcemanager.support.models.ProblemClassificationsClassificationOutput;
import com.azure.resourcemanager.support.models.ProblemClassificationsNoSubscriptions;

public final class ProblemClassificationsNoSubscriptionsImpl implements ProblemClassificationsNoSubscriptions {
    private static final ClientLogger LOGGER = new ClientLogger(ProblemClassificationsNoSubscriptionsImpl.class);

    private final ProblemClassificationsNoSubscriptionsClient innerClient;

    private final com.azure.resourcemanager.support.SupportManager serviceManager;

    public ProblemClassificationsNoSubscriptionsImpl(ProblemClassificationsNoSubscriptionsClient innerClient,
        com.azure.resourcemanager.support.SupportManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ProblemClassificationsClassificationOutput> classifyProblemsWithResponse(String problemServiceName,
        ProblemClassificationsClassificationInput problemClassificationsClassificationInput, Context context) {
        Response<ProblemClassificationsClassificationOutputInner> inner = this.serviceClient()
            .classifyProblemsWithResponse(problemServiceName, problemClassificationsClassificationInput, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ProblemClassificationsClassificationOutputImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ProblemClassificationsClassificationOutput classifyProblems(String problemServiceName,
        ProblemClassificationsClassificationInput problemClassificationsClassificationInput) {
        ProblemClassificationsClassificationOutputInner inner
            = this.serviceClient().classifyProblems(problemServiceName, problemClassificationsClassificationInput);
        if (inner != null) {
            return new ProblemClassificationsClassificationOutputImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ProblemClassificationsNoSubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.support.SupportManager manager() {
        return this.serviceManager;
    }
}
