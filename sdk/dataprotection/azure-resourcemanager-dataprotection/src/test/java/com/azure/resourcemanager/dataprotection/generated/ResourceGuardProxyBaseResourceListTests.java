// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.fluent.models.ResourceGuardProxyBaseResourceInner;
import com.azure.resourcemanager.dataprotection.models.ResourceGuardOperationDetail;
import com.azure.resourcemanager.dataprotection.models.ResourceGuardProxyBase;
import com.azure.resourcemanager.dataprotection.models.ResourceGuardProxyBaseResourceList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ResourceGuardProxyBaseResourceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceGuardProxyBaseResourceList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"resourceGuardResourceId\":\"hmk\",\"resourceGuardOperationDetails\":[{\"vaultCriticalOperation\":\"auwjuetaebu\",\"defaultResourceRequest\":\"vdmovsmzlxwabm\"},{\"vaultCriticalOperation\":\"efkifr\",\"defaultResourceRequest\":\"puqujmqlgkfbtn\"},{\"vaultCriticalOperation\":\"aongbj\",\"defaultResourceRequest\":\"tujitcjedft\"},{\"vaultCriticalOperation\":\"ae\",\"defaultResourceRequest\":\"ojvdcpzfoqo\"}],\"lastUpdatedTime\":\"cybxa\",\"description\":\"gszufoxciqopid\"},\"id\":\"mciodhkhazxkhn\",\"name\":\"bon\",\"type\":\"wntoegokdwbwh\"},{\"properties\":{\"resourceGuardResourceId\":\"zcmrvexztvb\",\"resourceGuardOperationDetails\":[{\"vaultCriticalOperation\":\"frao\",\"defaultResourceRequest\":\"koowtl\"},{\"vaultCriticalOperation\":\"guxawqaldsyuuxi\",\"defaultResourceRequest\":\"rqf\"},{\"vaultCriticalOperation\":\"wyznkbyku\",\"defaultResourceRequest\":\"pfhpagmhrskdsnfd\"}],\"lastUpdatedTime\":\"oakgtdlmkkzev\",\"description\":\"hewpusdsttwv\"},\"id\":\"vbbejdcng\",\"name\":\"qmoa\",\"type\":\"ufgmjzrwrdg\"},{\"properties\":{\"resourceGuardResourceId\":\"aenuuz\",\"resourceGuardOperationDetails\":[{\"vaultCriticalOperation\":\"minrfdw\",\"defaultResourceRequest\":\"uhhziuiefozbhdm\"},{\"vaultCriticalOperation\":\"l\",\"defaultResourceRequest\":\"qhoftrmaequiah\"}],\"lastUpdatedTime\":\"cslfaoqzpiyylha\",\"description\":\"swhccsphk\"},\"id\":\"vwitqscyw\",\"name\":\"ggwoluhczb\",\"type\":\"emh\"},{\"properties\":{\"resourceGuardResourceId\":\"sbrgz\",\"resourceGuardOperationDetails\":[{\"vaultCriticalOperation\":\"weyp\",\"defaultResourceRequest\":\"dxggicccnxqhuexm\"},{\"vaultCriticalOperation\":\"tlstvlzywem\",\"defaultResourceRequest\":\"rncsdtclu\"},{\"vaultCriticalOperation\":\"ypbsfgytguslfead\",\"defaultResourceRequest\":\"gq\"},{\"vaultCriticalOperation\":\"yhejhzisxgfp\",\"defaultResourceRequest\":\"olppvksrpqvujz\"}],\"lastUpdatedTime\":\"ehtwdwrft\",\"description\":\"iby\"},\"id\":\"dl\",\"name\":\"h\",\"type\":\"hfwpracstwit\"}],\"nextLink\":\"hevxcced\"}")
            .toObject(ResourceGuardProxyBaseResourceList.class);
        Assertions.assertEquals("hevxcced", model.nextLink());
        Assertions.assertEquals("hmk", model.value().get(0).properties().resourceGuardResourceId());
        Assertions.assertEquals("auwjuetaebu",
            model.value().get(0).properties().resourceGuardOperationDetails().get(0).vaultCriticalOperation());
        Assertions.assertEquals("vdmovsmzlxwabm",
            model.value().get(0).properties().resourceGuardOperationDetails().get(0).defaultResourceRequest());
        Assertions.assertEquals("cybxa", model.value().get(0).properties().lastUpdatedTime());
        Assertions.assertEquals("gszufoxciqopid", model.value().get(0).properties().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceGuardProxyBaseResourceList model = new ResourceGuardProxyBaseResourceList().withNextLink("hevxcced")
            .withValue(Arrays.asList(
                new ResourceGuardProxyBaseResourceInner()
                    .withProperties(new ResourceGuardProxyBase().withResourceGuardResourceId("hmk")
                        .withResourceGuardOperationDetails(Arrays.asList(
                            new ResourceGuardOperationDetail().withVaultCriticalOperation("auwjuetaebu")
                                .withDefaultResourceRequest("vdmovsmzlxwabm"),
                            new ResourceGuardOperationDetail().withVaultCriticalOperation("efkifr")
                                .withDefaultResourceRequest("puqujmqlgkfbtn"),
                            new ResourceGuardOperationDetail().withVaultCriticalOperation("aongbj")
                                .withDefaultResourceRequest("tujitcjedft"),
                            new ResourceGuardOperationDetail().withVaultCriticalOperation("ae")
                                .withDefaultResourceRequest("ojvdcpzfoqo")))
                        .withLastUpdatedTime("cybxa").withDescription("gszufoxciqopid")),
                new ResourceGuardProxyBaseResourceInner()
                    .withProperties(new ResourceGuardProxyBase().withResourceGuardResourceId("zcmrvexztvb")
                        .withResourceGuardOperationDetails(Arrays.asList(
                            new ResourceGuardOperationDetail().withVaultCriticalOperation("frao")
                                .withDefaultResourceRequest("koowtl"),
                            new ResourceGuardOperationDetail().withVaultCriticalOperation("guxawqaldsyuuxi")
                                .withDefaultResourceRequest("rqf"),
                            new ResourceGuardOperationDetail().withVaultCriticalOperation("wyznkbyku")
                                .withDefaultResourceRequest("pfhpagmhrskdsnfd")))
                        .withLastUpdatedTime("oakgtdlmkkzev").withDescription("hewpusdsttwv")),
                new ResourceGuardProxyBaseResourceInner()
                    .withProperties(new ResourceGuardProxyBase().withResourceGuardResourceId("aenuuz")
                        .withResourceGuardOperationDetails(Arrays.asList(
                            new ResourceGuardOperationDetail().withVaultCriticalOperation("minrfdw")
                                .withDefaultResourceRequest("uhhziuiefozbhdm"),
                            new ResourceGuardOperationDetail().withVaultCriticalOperation("l")
                                .withDefaultResourceRequest("qhoftrmaequiah")))
                        .withLastUpdatedTime("cslfaoqzpiyylha").withDescription("swhccsphk")),
                new ResourceGuardProxyBaseResourceInner()
                    .withProperties(new ResourceGuardProxyBase().withResourceGuardResourceId("sbrgz")
                        .withResourceGuardOperationDetails(Arrays.asList(
                            new ResourceGuardOperationDetail().withVaultCriticalOperation("weyp")
                                .withDefaultResourceRequest("dxggicccnxqhuexm"),
                            new ResourceGuardOperationDetail().withVaultCriticalOperation("tlstvlzywem")
                                .withDefaultResourceRequest("rncsdtclu"),
                            new ResourceGuardOperationDetail().withVaultCriticalOperation("ypbsfgytguslfead")
                                .withDefaultResourceRequest("gq"),
                            new ResourceGuardOperationDetail().withVaultCriticalOperation("yhejhzisxgfp")
                                .withDefaultResourceRequest("olppvksrpqvujz")))
                        .withLastUpdatedTime("ehtwdwrft").withDescription("iby"))));
        model = BinaryData.fromObject(model).toObject(ResourceGuardProxyBaseResourceList.class);
        Assertions.assertEquals("hevxcced", model.nextLink());
        Assertions.assertEquals("hmk", model.value().get(0).properties().resourceGuardResourceId());
        Assertions.assertEquals("auwjuetaebu",
            model.value().get(0).properties().resourceGuardOperationDetails().get(0).vaultCriticalOperation());
        Assertions.assertEquals("vdmovsmzlxwabm",
            model.value().get(0).properties().resourceGuardOperationDetails().get(0).defaultResourceRequest());
        Assertions.assertEquals("cybxa", model.value().get(0).properties().lastUpdatedTime());
        Assertions.assertEquals("gszufoxciqopid", model.value().get(0).properties().description());
    }
}
