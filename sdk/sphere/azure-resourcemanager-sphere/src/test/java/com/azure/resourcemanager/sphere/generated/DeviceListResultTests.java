// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sphere.fluent.models.DeviceInner;
import com.azure.resourcemanager.sphere.models.DeviceListResult;
import com.azure.resourcemanager.sphere.models.DeviceProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DeviceListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeviceListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"deviceId\":\"uxwgipwho\",\"chipSku\":\"wkgshwa\",\"lastAvailableOsVersion\":\"ixzbinjeputtmryw\",\"lastInstalledOsVersion\":\"zoqftiyqzrnkcqvy\",\"lastOsUpdateUtc\":\"2021-11-01T04:15:41Z\",\"lastUpdateRequestUtc\":\"2021-04-08T10:43:47Z\",\"provisioningState\":\"Provisioning\"},\"id\":\"cohoq\",\"name\":\"nwvlryavwhheunmm\",\"type\":\"hgyxzkonoc\"},{\"properties\":{\"deviceId\":\"klyaxuconu\",\"chipSku\":\"zf\",\"lastAvailableOsVersion\":\"eyp\",\"lastInstalledOsVersion\":\"rmjmwvvjektc\",\"lastOsUpdateUtc\":\"2021-04-14T12:00:30Z\",\"lastUpdateRequestUtc\":\"2021-03-21T19:21:01Z\",\"provisioningState\":\"Provisioning\"},\"id\":\"s\",\"name\":\"frzpwvlqdqgb\",\"type\":\"qylihkaetckt\"},{\"properties\":{\"deviceId\":\"ivfsnk\",\"chipSku\":\"uctqhjfbe\",\"lastAvailableOsVersion\":\"jcxerfuwu\",\"lastInstalledOsVersion\":\"txfvjrbirph\",\"lastOsUpdateUtc\":\"2020-12-25T01:34:04Z\",\"lastUpdateRequestUtc\":\"2021-09-05T13:55:56Z\",\"provisioningState\":\"Provisioning\"},\"id\":\"fnljky\",\"name\":\"xjvuujqgidokg\",\"type\":\"ljyoxgvcltb\"},{\"properties\":{\"deviceId\":\"c\",\"chipSku\":\"kjeszz\",\"lastAvailableOsVersion\":\"ijhtxf\",\"lastInstalledOsVersion\":\"xbf\",\"lastOsUpdateUtc\":\"2021-01-19T10:57:10Z\",\"lastUpdateRequestUtc\":\"2021-05-10T05:23:15Z\",\"provisioningState\":\"Failed\"},\"id\":\"vecxgodebfqkk\",\"name\":\"bmpukgriwflz\",\"type\":\"fbxzpuzycisp\"}],\"nextLink\":\"zahmgkbrpyydhibn\"}")
            .toObject(DeviceListResult.class);
        Assertions.assertEquals("uxwgipwho", model.value().get(0).properties().deviceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeviceListResult model = new DeviceListResult()
            .withValue(Arrays.asList(new DeviceInner().withProperties(new DeviceProperties().withDeviceId("uxwgipwho")),
                new DeviceInner().withProperties(new DeviceProperties().withDeviceId("klyaxuconu")),
                new DeviceInner().withProperties(new DeviceProperties().withDeviceId("ivfsnk")),
                new DeviceInner().withProperties(new DeviceProperties().withDeviceId("c"))));
        model = BinaryData.fromObject(model).toObject(DeviceListResult.class);
        Assertions.assertEquals("uxwgipwho", model.value().get(0).properties().deviceId());
    }
}
