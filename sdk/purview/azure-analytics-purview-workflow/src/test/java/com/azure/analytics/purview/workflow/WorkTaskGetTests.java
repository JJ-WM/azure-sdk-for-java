// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class WorkTaskGetTests extends PurviewWorkflowClientTestBase {
    @Test
    public void testWorkTaskGetTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                purviewWorkflowClient.getWorkflowTaskWithResponse(
                        "69b57a00-f5de-4a17-a44a-6479adae373d", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
    }
}
