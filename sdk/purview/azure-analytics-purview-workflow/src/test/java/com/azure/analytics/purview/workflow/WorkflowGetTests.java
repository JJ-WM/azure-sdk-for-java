// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class WorkflowGetTests extends PurviewWorkflowClientTestBase {
    @Test
    public void testWorkflowGetTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                purviewWorkflowClient.getWorkflowWithResponse("4afb5752-e47f-43a1-8ba7-c696bf8d2745", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
    }
}
