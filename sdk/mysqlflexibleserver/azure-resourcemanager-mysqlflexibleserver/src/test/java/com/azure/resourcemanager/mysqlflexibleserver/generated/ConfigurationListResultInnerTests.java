// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ConfigurationInner;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ConfigurationListResultInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.ConfigurationSource;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ConfigurationListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfigurationListResultInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"value\":\"szdnr\",\"currentValue\":\"qguhmuo\",\"description\":\"f\",\"documentationLink\":\"wzwbnguitn\",\"defaultValue\":\"izgazxu\",\"dataType\":\"zuckyfi\",\"allowedValues\":\"fidfvzw\",\"source\":\"system-default\",\"isReadOnly\":\"True\",\"isConfigPendingRestart\":\"False\",\"isDynamicConfig\":\"False\"},\"id\":\"dkfthwxmnt\",\"name\":\"i\",\"type\":\"aop\"}],\"nextLink\":\"mijcmmxdcufufs\"}")
            .toObject(ConfigurationListResultInner.class);
        Assertions.assertEquals("szdnr", model.value().get(0).value());
        Assertions.assertEquals("qguhmuo", model.value().get(0).currentValue());
        Assertions.assertEquals(ConfigurationSource.SYSTEM_DEFAULT, model.value().get(0).source());
        Assertions.assertEquals("mijcmmxdcufufs", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfigurationListResultInner model
            = new ConfigurationListResultInner().withValue(Arrays.asList(new ConfigurationInner().withValue("szdnr")
                .withCurrentValue("qguhmuo")
                .withSource(ConfigurationSource.SYSTEM_DEFAULT))).withNextLink("mijcmmxdcufufs");
        model = BinaryData.fromObject(model).toObject(ConfigurationListResultInner.class);
        Assertions.assertEquals("szdnr", model.value().get(0).value());
        Assertions.assertEquals("qguhmuo", model.value().get(0).currentValue());
        Assertions.assertEquals(ConfigurationSource.SYSTEM_DEFAULT, model.value().get(0).source());
        Assertions.assertEquals("mijcmmxdcufufs", model.nextLink());
    }
}
