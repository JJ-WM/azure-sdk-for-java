// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.developer.devcenter.DevCenterClientTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class EnvironmentsListCatalogsByProjectTests extends DevCenterClientTestBase {
    @Test
    @Disabled
    public void testEnvironmentsListCatalogsByProjectTests() {
        RequestOptions requestOptions = new RequestOptions();

        PagedIterable<BinaryData> response = deploymentEnvironmentsClient.listCatalogs(projectName, requestOptions);
        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());
        Assertions.assertEquals(
            BinaryData.fromString(String.format("{\"name\":\"%s\"}", catalogName)).toObject(Object.class),
            response.iterator().next().toObject(Object.class));
    }
}
