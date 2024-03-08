// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentWebTestLocationInner;

public final class ApplicationInsightsComponentWebTestLocationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationInsightsComponentWebTestLocationInner model =
            BinaryData
                .fromString("{\"DisplayName\":\"qfbow\",\"Tag\":\"anyktzlcuiywg\"}")
                .toObject(ApplicationInsightsComponentWebTestLocationInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationInsightsComponentWebTestLocationInner model = new ApplicationInsightsComponentWebTestLocationInner();
        model = BinaryData.fromObject(model).toObject(ApplicationInsightsComponentWebTestLocationInner.class);
    }
}
