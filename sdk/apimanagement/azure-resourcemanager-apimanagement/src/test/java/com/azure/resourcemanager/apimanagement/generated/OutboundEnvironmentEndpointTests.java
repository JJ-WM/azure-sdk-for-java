// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.EndpointDependency;
import com.azure.resourcemanager.apimanagement.models.EndpointDetail;
import com.azure.resourcemanager.apimanagement.models.OutboundEnvironmentEndpoint;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OutboundEnvironmentEndpointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OutboundEnvironmentEndpoint model =
            BinaryData
                .fromString(
                    "{\"category\":\"feothxu\",\"endpoints\":[{\"domainName\":\"rjdljlkqhvkrb\",\"endpointDetails\":[{\"port\":1722206304,\"region\":\"axklpruulh\"}]},{\"domainName\":\"t\",\"endpointDetails\":[{\"port\":844024628,\"region\":\"scksgfyyskye\"},{\"port\":1092816776,\"region\":\"xczvfcckwrtwle\"},{\"port\":899181529,\"region\":\"szrtlhpdhwynct\"}]},{\"domainName\":\"zcnjfmbbfnvjxit\",\"endpointDetails\":[{\"port\":951827318,\"region\":\"tiklsm\"}]},{\"domainName\":\"hql\",\"endpointDetails\":[{\"port\":688911413,\"region\":\"ii\"},{\"port\":882355775,\"region\":\"wbgbudav\"},{\"port\":638512610,\"region\":\"bccqcdhthojvl\"},{\"port\":1482007887,\"region\":\"ucosawrdt\"}]}]}")
                .toObject(OutboundEnvironmentEndpoint.class);
        Assertions.assertEquals("feothxu", model.category());
        Assertions.assertEquals("rjdljlkqhvkrb", model.endpoints().get(0).domainName());
        Assertions.assertEquals(1722206304, model.endpoints().get(0).endpointDetails().get(0).port());
        Assertions.assertEquals("axklpruulh", model.endpoints().get(0).endpointDetails().get(0).region());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OutboundEnvironmentEndpoint model =
            new OutboundEnvironmentEndpoint()
                .withCategory("feothxu")
                .withEndpoints(
                    Arrays
                        .asList(
                            new EndpointDependency()
                                .withDomainName("rjdljlkqhvkrb")
                                .withEndpointDetails(
                                    Arrays.asList(new EndpointDetail().withPort(1722206304).withRegion("axklpruulh"))),
                            new EndpointDependency()
                                .withDomainName("t")
                                .withEndpointDetails(
                                    Arrays
                                        .asList(
                                            new EndpointDetail().withPort(844024628).withRegion("scksgfyyskye"),
                                            new EndpointDetail().withPort(1092816776).withRegion("xczvfcckwrtwle"),
                                            new EndpointDetail().withPort(899181529).withRegion("szrtlhpdhwynct"))),
                            new EndpointDependency()
                                .withDomainName("zcnjfmbbfnvjxit")
                                .withEndpointDetails(
                                    Arrays.asList(new EndpointDetail().withPort(951827318).withRegion("tiklsm"))),
                            new EndpointDependency()
                                .withDomainName("hql")
                                .withEndpointDetails(
                                    Arrays
                                        .asList(
                                            new EndpointDetail().withPort(688911413).withRegion("ii"),
                                            new EndpointDetail().withPort(882355775).withRegion("wbgbudav"),
                                            new EndpointDetail().withPort(638512610).withRegion("bccqcdhthojvl"),
                                            new EndpointDetail().withPort(1482007887).withRegion("ucosawrdt")))));
        model = BinaryData.fromObject(model).toObject(OutboundEnvironmentEndpoint.class);
        Assertions.assertEquals("feothxu", model.category());
        Assertions.assertEquals("rjdljlkqhvkrb", model.endpoints().get(0).domainName());
        Assertions.assertEquals(1722206304, model.endpoints().get(0).endpointDetails().get(0).port());
        Assertions.assertEquals("axklpruulh", model.endpoints().get(0).endpointDetails().get(0).region());
    }
}
