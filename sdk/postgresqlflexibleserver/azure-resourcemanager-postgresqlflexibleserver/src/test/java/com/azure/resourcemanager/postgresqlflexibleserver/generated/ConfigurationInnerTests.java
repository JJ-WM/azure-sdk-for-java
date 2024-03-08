// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.ConfigurationInner;
import org.junit.jupiter.api.Assertions;

public final class ConfigurationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfigurationInner model = BinaryData.fromString(
            "{\"properties\":{\"value\":\"rywn\",\"description\":\"oqftiyqzrnkcq\",\"defaultValue\":\"xlwhzlsicoh\",\"dataType\":\"Numeric\",\"allowedValues\":\"wvl\",\"source\":\"avwhheunm\",\"isDynamicConfig\":true,\"isReadOnly\":false,\"isConfigPendingRestart\":false,\"unit\":\"onocukok\",\"documentationLink\":\"axuconuq\"},\"id\":\"fkbey\",\"name\":\"ewrmjmwvvjektc\",\"type\":\"senhwlrs\"}")
            .toObject(ConfigurationInner.class);
        Assertions.assertEquals("rywn", model.value());
        Assertions.assertEquals("avwhheunm", model.source());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfigurationInner model = new ConfigurationInner().withValue("rywn").withSource("avwhheunm");
        model = BinaryData.fromObject(model).toObject(ConfigurationInner.class);
        Assertions.assertEquals("rywn", model.value());
        Assertions.assertEquals("avwhheunm", model.source());
    }
}
