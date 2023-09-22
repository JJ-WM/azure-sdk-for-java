// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.OperationsDiscoveryInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.Display;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.OperationsDiscoveryCollection;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationsDiscoveryCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationsDiscoveryCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"quvgjxpybczme\",\"display\":{\"provider\":\"zopbsphrupidgs\",\"resource\":\"bejhphoycmsxa\",\"operation\":\"hdxbmtqio\",\"description\":\"zehtbmu\"},\"origin\":\"ownoizhw\",\"properties\":\"dataxybqsoqij\"},{\"name\":\"dmbpazlobcufpdz\",\"display\":{\"provider\":\"t\",\"resource\":\"qjnqglhqgnufoooj\",\"operation\":\"ifsqesaagdfmg\",\"description\":\"lhjxr\"},\"origin\":\"kwm\",\"properties\":\"dataktsizntocipaou\"},{\"name\":\"psqucmpoyf\",\"display\":{\"provider\":\"ogknygjofjdd\",\"resource\":\"s\",\"operation\":\"eupewnwreitjz\",\"description\":\"lusarh\"},\"origin\":\"fcqhsmyurkd\",\"properties\":\"datalx\"}],\"nextLink\":\"kuksjtxukcdm\"}")
                .toObject(OperationsDiscoveryCollection.class);
        Assertions.assertEquals("quvgjxpybczme", model.value().get(0).name());
        Assertions.assertEquals("zopbsphrupidgs", model.value().get(0).display().provider());
        Assertions.assertEquals("bejhphoycmsxa", model.value().get(0).display().resource());
        Assertions.assertEquals("hdxbmtqio", model.value().get(0).display().operation());
        Assertions.assertEquals("zehtbmu", model.value().get(0).display().description());
        Assertions.assertEquals("ownoizhw", model.value().get(0).origin());
        Assertions.assertEquals("kuksjtxukcdm", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationsDiscoveryCollection model =
            new OperationsDiscoveryCollection()
                .withValue(
                    Arrays
                        .asList(
                            new OperationsDiscoveryInner()
                                .withName("quvgjxpybczme")
                                .withDisplay(
                                    new Display()
                                        .withProvider("zopbsphrupidgs")
                                        .withResource("bejhphoycmsxa")
                                        .withOperation("hdxbmtqio")
                                        .withDescription("zehtbmu"))
                                .withOrigin("ownoizhw")
                                .withProperties("dataxybqsoqij"),
                            new OperationsDiscoveryInner()
                                .withName("dmbpazlobcufpdz")
                                .withDisplay(
                                    new Display()
                                        .withProvider("t")
                                        .withResource("qjnqglhqgnufoooj")
                                        .withOperation("ifsqesaagdfmg")
                                        .withDescription("lhjxr"))
                                .withOrigin("kwm")
                                .withProperties("dataktsizntocipaou"),
                            new OperationsDiscoveryInner()
                                .withName("psqucmpoyf")
                                .withDisplay(
                                    new Display()
                                        .withProvider("ogknygjofjdd")
                                        .withResource("s")
                                        .withOperation("eupewnwreitjz")
                                        .withDescription("lusarh"))
                                .withOrigin("fcqhsmyurkd")
                                .withProperties("datalx")))
                .withNextLink("kuksjtxukcdm");
        model = BinaryData.fromObject(model).toObject(OperationsDiscoveryCollection.class);
        Assertions.assertEquals("quvgjxpybczme", model.value().get(0).name());
        Assertions.assertEquals("zopbsphrupidgs", model.value().get(0).display().provider());
        Assertions.assertEquals("bejhphoycmsxa", model.value().get(0).display().resource());
        Assertions.assertEquals("hdxbmtqio", model.value().get(0).display().operation());
        Assertions.assertEquals("zehtbmu", model.value().get(0).display().description());
        Assertions.assertEquals("ownoizhw", model.value().get(0).origin());
        Assertions.assertEquals("kuksjtxukcdm", model.nextLink());
    }
}
