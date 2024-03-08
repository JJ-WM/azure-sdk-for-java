// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.serializer.TypeReference;
import com.azure.developer.devcenter.DevCenterClientTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Map;

public final class EnvironmentsListEnvironmentsTests extends DevCenterClientTestBase {
    @Test
    @Disabled
    public void testEnvironmentsListEnvironmentsTests() {
        String environmentName = createEnvironment();

        RequestOptions requestOptions = new RequestOptions();
        PagedIterable<BinaryData> response =
                deploymentEnvironmentsClient.listAllEnvironments(projectName, requestOptions);
        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());

        int numberOfEnvironments = 0;
        for (BinaryData data : response) {
            numberOfEnvironments++;
            Map<String, Object> envType = data.toObject(new TypeReference<Map<String, Object>>() {});
            Assertions.assertEquals(environmentName, envType.get("name"));
        }

        Assertions.assertEquals(1, numberOfEnvironments);
        deleteEnvironment(environmentName);
    }
}
