// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.fluent.models.ApiOperationProperties;
import com.azure.resourcemanager.storagecache.models.ApiOperationPropertiesServiceSpecification;
import com.azure.resourcemanager.storagecache.models.LogSpecification;
import com.azure.resourcemanager.storagecache.models.MetricAggregationType;
import com.azure.resourcemanager.storagecache.models.MetricDimension;
import com.azure.resourcemanager.storagecache.models.MetricSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ApiOperationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiOperationProperties model = BinaryData.fromString(
            "{\"serviceSpecification\":{\"metricSpecifications\":[{\"name\":\"c\",\"displayName\":\"xdcu\",\"displayDescription\":\"fsrpymzidnse\",\"unit\":\"xtbzsgfyccsne\",\"aggregationType\":\"dwzjeiach\",\"supportedAggregationTypes\":[\"Count\",\"None\"],\"metricClass\":\"nrosfqpte\",\"dimensions\":[{\"name\":\"vypyqrimzinpv\",\"displayName\":\"jdkirsoodqx\",\"internalName\":\"rmnohj\",\"toBeExportedForShoebox\":false},{\"name\":\"h\",\"displayName\":\"oifiyipjxsqwpgr\",\"internalName\":\"znorcj\",\"toBeExportedForShoebox\":false},{\"name\":\"byxqabn\",\"displayName\":\"cpc\",\"internalName\":\"hurzafblj\",\"toBeExportedForShoebox\":true},{\"name\":\"toqcjmklja\",\"displayName\":\"qidtqajzyu\",\"internalName\":\"kudjkrlkhb\",\"toBeExportedForShoebox\":false}]},{\"name\":\"pgzgq\",\"displayName\":\"zloc\",\"displayDescription\":\"c\",\"unit\":\"ierhhbcsglummaj\",\"aggregationType\":\"aodxo\",\"supportedAggregationTypes\":[\"None\",\"Maximum\",\"Maximum\"],\"metricClass\":\"pxokajionp\",\"dimensions\":[{\"name\":\"gstxgcp\",\"displayName\":\"gmaajrm\",\"internalName\":\"jwzrl\",\"toBeExportedForShoebox\":false}]}],\"logSpecifications\":[{\"name\":\"hijco\",\"displayName\":\"ctbzaq\"},{\"name\":\"sycbkbfk\",\"displayName\":\"kdkexxp\"},{\"name\":\"fmxa\",\"displayName\":\"fjpgddtocjjxhvp\"},{\"name\":\"uexhdzx\",\"displayName\":\"qeojnxqbzvddntw\"}]}}")
            .toObject(ApiOperationProperties.class);
        Assertions.assertEquals("c", model.serviceSpecification().metricSpecifications().get(0).name());
        Assertions.assertEquals("xdcu", model.serviceSpecification().metricSpecifications().get(0).displayName());
        Assertions.assertEquals("fsrpymzidnse",
            model.serviceSpecification().metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("xtbzsgfyccsne", model.serviceSpecification().metricSpecifications().get(0).unit());
        Assertions.assertEquals("dwzjeiach",
            model.serviceSpecification().metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals(MetricAggregationType.COUNT,
            model.serviceSpecification().metricSpecifications().get(0).supportedAggregationTypes().get(0));
        Assertions.assertEquals("nrosfqpte", model.serviceSpecification().metricSpecifications().get(0).metricClass());
        Assertions.assertEquals("vypyqrimzinpv",
            model.serviceSpecification().metricSpecifications().get(0).dimensions().get(0).name());
        Assertions.assertEquals("jdkirsoodqx",
            model.serviceSpecification().metricSpecifications().get(0).dimensions().get(0).displayName());
        Assertions.assertEquals("rmnohj",
            model.serviceSpecification().metricSpecifications().get(0).dimensions().get(0).internalName());
        Assertions.assertEquals(false,
            model.serviceSpecification().metricSpecifications().get(0).dimensions().get(0).toBeExportedForShoebox());
        Assertions.assertEquals("hijco", model.serviceSpecification().logSpecifications().get(0).name());
        Assertions.assertEquals("ctbzaq", model.serviceSpecification().logSpecifications().get(0).displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiOperationProperties model
            = new ApiOperationProperties().withServiceSpecification(new ApiOperationPropertiesServiceSpecification()
                .withMetricSpecifications(Arrays.asList(
                    new MetricSpecification().withName("c").withDisplayName("xdcu")
                        .withDisplayDescription("fsrpymzidnse").withUnit("xtbzsgfyccsne")
                        .withAggregationType("dwzjeiach")
                        .withSupportedAggregationTypes(
                            Arrays.asList(MetricAggregationType.COUNT, MetricAggregationType.NONE))
                        .withMetricClass("nrosfqpte")
                        .withDimensions(Arrays.asList(
                            new MetricDimension().withName("vypyqrimzinpv").withDisplayName("jdkirsoodqx")
                                .withInternalName("rmnohj").withToBeExportedForShoebox(false),
                            new MetricDimension().withName("h").withDisplayName("oifiyipjxsqwpgr")
                                .withInternalName("znorcj").withToBeExportedForShoebox(false),
                            new MetricDimension().withName("byxqabn").withDisplayName("cpc")
                                .withInternalName("hurzafblj").withToBeExportedForShoebox(true),
                            new MetricDimension().withName("toqcjmklja").withDisplayName("qidtqajzyu")
                                .withInternalName("kudjkrlkhb").withToBeExportedForShoebox(false))),
                    new MetricSpecification().withName("pgzgq").withDisplayName("zloc").withDisplayDescription("c")
                        .withUnit("ierhhbcsglummaj").withAggregationType("aodxo")
                        .withSupportedAggregationTypes(Arrays.asList(
                            MetricAggregationType.NONE, MetricAggregationType.MAXIMUM, MetricAggregationType.MAXIMUM))
                        .withMetricClass("pxokajionp")
                        .withDimensions(Arrays.asList(new MetricDimension().withName("gstxgcp")
                            .withDisplayName("gmaajrm").withInternalName("jwzrl").withToBeExportedForShoebox(false)))))
                .withLogSpecifications(Arrays.asList(new LogSpecification().withName("hijco").withDisplayName("ctbzaq"),
                    new LogSpecification().withName("sycbkbfk").withDisplayName("kdkexxp"),
                    new LogSpecification().withName("fmxa").withDisplayName("fjpgddtocjjxhvp"),
                    new LogSpecification().withName("uexhdzx").withDisplayName("qeojnxqbzvddntw"))));
        model = BinaryData.fromObject(model).toObject(ApiOperationProperties.class);
        Assertions.assertEquals("c", model.serviceSpecification().metricSpecifications().get(0).name());
        Assertions.assertEquals("xdcu", model.serviceSpecification().metricSpecifications().get(0).displayName());
        Assertions.assertEquals("fsrpymzidnse",
            model.serviceSpecification().metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("xtbzsgfyccsne", model.serviceSpecification().metricSpecifications().get(0).unit());
        Assertions.assertEquals("dwzjeiach",
            model.serviceSpecification().metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals(MetricAggregationType.COUNT,
            model.serviceSpecification().metricSpecifications().get(0).supportedAggregationTypes().get(0));
        Assertions.assertEquals("nrosfqpte", model.serviceSpecification().metricSpecifications().get(0).metricClass());
        Assertions.assertEquals("vypyqrimzinpv",
            model.serviceSpecification().metricSpecifications().get(0).dimensions().get(0).name());
        Assertions.assertEquals("jdkirsoodqx",
            model.serviceSpecification().metricSpecifications().get(0).dimensions().get(0).displayName());
        Assertions.assertEquals("rmnohj",
            model.serviceSpecification().metricSpecifications().get(0).dimensions().get(0).internalName());
        Assertions.assertEquals(false,
            model.serviceSpecification().metricSpecifications().get(0).dimensions().get(0).toBeExportedForShoebox());
        Assertions.assertEquals("hijco", model.serviceSpecification().logSpecifications().get(0).name());
        Assertions.assertEquals("ctbzaq", model.serviceSpecification().logSpecifications().get(0).displayName());
    }
}
