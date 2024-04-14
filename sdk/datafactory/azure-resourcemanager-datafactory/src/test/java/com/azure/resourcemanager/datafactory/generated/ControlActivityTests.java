// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.ControlActivity;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ControlActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ControlActivity model = BinaryData.fromString(
            "{\"type\":\"Container\",\"name\":\"xzylqhewhc\",\"description\":\"ex\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"wggmitdwolfmfaz\",\"dependencyConditions\":[\"Succeeded\",\"Failed\"],\"\":{\"jttzfswohddliikk\":\"datad\",\"gemtnbkevuuky\":\"datasqpli\"}},{\"activity\":\"iksncr\",\"dependencyConditions\":[\"Failed\"],\"\":{\"f\":\"databzqtuhga\",\"ivhyujqxyfb\":\"datayftohdlpcixpxxny\"}},{\"activity\":\"azylaya\",\"dependencyConditions\":[\"Completed\",\"Completed\",\"Skipped\"],\"\":{\"nrkmcivhww\":\"dataduwwjohg\",\"wkmrjfs\":\"datayejhwbdfcfy\",\"qowqo\":\"databcfqaqov\",\"sbjhhadndow\":\"dataispasxwiic\"}},{\"activity\":\"x\",\"dependencyConditions\":[\"Completed\",\"Succeeded\",\"Skipped\",\"Succeeded\"],\"\":{\"prygjgyov\":\"dataieehpvqfifrr\",\"g\":\"datapgqiisma\",\"kkcxc\":\"datatcoykr\",\"utyszhzlvkmirn\":\"datajkronxmtrhwwdfnc\"}}],\"userProperties\":[{\"name\":\"zarmep\",\"value\":\"datamo\"},{\"name\":\"tfpkskxsyohfrl\",\"value\":\"dataynkgnychuzhng\"},{\"name\":\"tbhjgliioeodgn\",\"value\":\"dataoewfg\"},{\"name\":\"wmm\",\"value\":\"dataixtyavvexj\"}],\"\":{\"vnoqtwqciq\":\"datakonbgegwxjgkrpp\"}}")
            .toObject(ControlActivity.class);
        Assertions.assertEquals("xzylqhewhc", model.name());
        Assertions.assertEquals("ex", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("wggmitdwolfmfaz", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("zarmep", model.userProperties().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ControlActivity model
            = new ControlActivity().withName("xzylqhewhc").withDescription("ex").withState(ActivityState.INACTIVE)
                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
                .withDependsOn(Arrays.asList(
                    new ActivityDependency().withActivity("wggmitdwolfmfaz")
                        .withDependencyConditions(
                            Arrays.asList(DependencyCondition.SUCCEEDED, DependencyCondition.FAILED))
                        .withAdditionalProperties(mapOf()),
                    new ActivityDependency()
                        .withActivity("iksncr").withDependencyConditions(Arrays.asList(DependencyCondition.FAILED))
                        .withAdditionalProperties(mapOf()),
                    new ActivityDependency().withActivity("azylaya")
                        .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED,
                            DependencyCondition.COMPLETED, DependencyCondition.SKIPPED))
                        .withAdditionalProperties(mapOf()),
                    new ActivityDependency().withActivity("x")
                        .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED,
                            DependencyCondition.SUCCEEDED, DependencyCondition.SKIPPED, DependencyCondition.SUCCEEDED))
                        .withAdditionalProperties(mapOf())))
                .withUserProperties(Arrays.asList(new UserProperty().withName("zarmep").withValue("datamo"),
                    new UserProperty().withName("tfpkskxsyohfrl").withValue("dataynkgnychuzhng"),
                    new UserProperty().withName("tbhjgliioeodgn").withValue("dataoewfg"),
                    new UserProperty().withName("wmm").withValue("dataixtyavvexj")));
        model = BinaryData.fromObject(model).toObject(ControlActivity.class);
        Assertions.assertEquals("xzylqhewhc", model.name());
        Assertions.assertEquals("ex", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("wggmitdwolfmfaz", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("zarmep", model.userProperties().get(0).name());
    }

    // Use "Map.of" if available
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
