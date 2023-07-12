// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.models.ForecastAggregation;
import com.azure.resourcemanager.costmanagement.models.ForecastComparisonExpression;
import com.azure.resourcemanager.costmanagement.models.ForecastDataset;
import com.azure.resourcemanager.costmanagement.models.ForecastDatasetConfiguration;
import com.azure.resourcemanager.costmanagement.models.ForecastFilter;
import com.azure.resourcemanager.costmanagement.models.ForecastOperatorType;
import com.azure.resourcemanager.costmanagement.models.FunctionName;
import com.azure.resourcemanager.costmanagement.models.FunctionType;
import com.azure.resourcemanager.costmanagement.models.GranularityType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ForecastDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ForecastDataset model =
            BinaryData
                .fromString(
                    "{\"granularity\":\"Daily\",\"configuration\":{\"columns\":[\"iuebbaumny\",\"upedeojnabckhs\",\"txp\",\"ie\"]},\"aggregation\":{\"vpesapskrdqmhjjd\":{\"name\":\"CostUSD\",\"function\":\"Sum\"},\"dwkyzxuu\":{\"name\":\"CostUSD\",\"function\":\"Sum\"},\"cwscwsvlx\":{\"name\":\"PreTaxCostUSD\",\"function\":\"Sum\"},\"g\":{\"name\":\"PreTaxCostUSD\",\"function\":\"Sum\"}},\"filter\":{\"and\":[{\"and\":[],\"or\":[]},{\"and\":[],\"or\":[]}],\"or\":[{\"and\":[],\"or\":[]},{\"and\":[],\"or\":[]},{\"and\":[],\"or\":[]}],\"dimensions\":{\"name\":\"tyfjfcnjbkcnxdhb\",\"operator\":\"In\",\"values\":[\"phywpnvj\",\"oqnermclfpl\",\"hoxus\"]},\"tags\":{\"name\":\"pabgyeps\",\"operator\":\"In\",\"values\":[\"azqugxywpmueefj\",\"wfqkquj\",\"dsuyonobgla\",\"cq\"]}}}")
                .toObject(ForecastDataset.class);
        Assertions.assertEquals(GranularityType.DAILY, model.granularity());
        Assertions.assertEquals("iuebbaumny", model.configuration().columns().get(0));
        Assertions.assertEquals(FunctionName.COST_USD, model.aggregation().get("vpesapskrdqmhjjd").name());
        Assertions.assertEquals(FunctionType.SUM, model.aggregation().get("vpesapskrdqmhjjd").function());
        Assertions.assertEquals("tyfjfcnjbkcnxdhb", model.filter().dimensions().name());
        Assertions.assertEquals(ForecastOperatorType.IN, model.filter().dimensions().operator());
        Assertions.assertEquals("phywpnvj", model.filter().dimensions().values().get(0));
        Assertions.assertEquals("pabgyeps", model.filter().tags().name());
        Assertions.assertEquals(ForecastOperatorType.IN, model.filter().tags().operator());
        Assertions.assertEquals("azqugxywpmueefj", model.filter().tags().values().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ForecastDataset model =
            new ForecastDataset()
                .withGranularity(GranularityType.DAILY)
                .withConfiguration(
                    new ForecastDatasetConfiguration()
                        .withColumns(Arrays.asList("iuebbaumny", "upedeojnabckhs", "txp", "ie")))
                .withAggregation(
                    mapOf(
                        "vpesapskrdqmhjjd",
                        new ForecastAggregation().withName(FunctionName.COST_USD).withFunction(FunctionType.SUM),
                        "dwkyzxuu",
                        new ForecastAggregation().withName(FunctionName.COST_USD).withFunction(FunctionType.SUM),
                        "cwscwsvlx",
                        new ForecastAggregation()
                            .withName(FunctionName.PRE_TAX_COST_USD)
                            .withFunction(FunctionType.SUM),
                        "g",
                        new ForecastAggregation()
                            .withName(FunctionName.PRE_TAX_COST_USD)
                            .withFunction(FunctionType.SUM)))
                .withFilter(
                    new ForecastFilter()
                        .withAnd(
                            Arrays
                                .asList(
                                    new ForecastFilter().withAnd(Arrays.asList()).withOr(Arrays.asList()),
                                    new ForecastFilter().withAnd(Arrays.asList()).withOr(Arrays.asList())))
                        .withOr(
                            Arrays
                                .asList(
                                    new ForecastFilter().withAnd(Arrays.asList()).withOr(Arrays.asList()),
                                    new ForecastFilter().withAnd(Arrays.asList()).withOr(Arrays.asList()),
                                    new ForecastFilter().withAnd(Arrays.asList()).withOr(Arrays.asList())))
                        .withDimensions(
                            new ForecastComparisonExpression()
                                .withName("tyfjfcnjbkcnxdhb")
                                .withOperator(ForecastOperatorType.IN)
                                .withValues(Arrays.asList("phywpnvj", "oqnermclfpl", "hoxus")))
                        .withTags(
                            new ForecastComparisonExpression()
                                .withName("pabgyeps")
                                .withOperator(ForecastOperatorType.IN)
                                .withValues(Arrays.asList("azqugxywpmueefj", "wfqkquj", "dsuyonobgla", "cq"))));
        model = BinaryData.fromObject(model).toObject(ForecastDataset.class);
        Assertions.assertEquals(GranularityType.DAILY, model.granularity());
        Assertions.assertEquals("iuebbaumny", model.configuration().columns().get(0));
        Assertions.assertEquals(FunctionName.COST_USD, model.aggregation().get("vpesapskrdqmhjjd").name());
        Assertions.assertEquals(FunctionType.SUM, model.aggregation().get("vpesapskrdqmhjjd").function());
        Assertions.assertEquals("tyfjfcnjbkcnxdhb", model.filter().dimensions().name());
        Assertions.assertEquals(ForecastOperatorType.IN, model.filter().dimensions().operator());
        Assertions.assertEquals("phywpnvj", model.filter().dimensions().values().get(0));
        Assertions.assertEquals("pabgyeps", model.filter().tags().name());
        Assertions.assertEquals(ForecastOperatorType.IN, model.filter().tags().operator());
        Assertions.assertEquals("azqugxywpmueefj", model.filter().tags().values().get(0));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
