// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DayOfWeek;
import com.azure.resourcemanager.datafactory.models.DaysOfWeek;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import com.azure.resourcemanager.datafactory.models.RecurrenceFrequency;
import com.azure.resourcemanager.datafactory.models.RecurrenceSchedule;
import com.azure.resourcemanager.datafactory.models.RecurrenceScheduleOccurrence;
import com.azure.resourcemanager.datafactory.models.ScheduleTrigger;
import com.azure.resourcemanager.datafactory.models.ScheduleTriggerRecurrence;
import com.azure.resourcemanager.datafactory.models.TriggerPipelineReference;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ScheduleTriggerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleTrigger model = BinaryData.fromString(
            "{\"type\":\"ScheduleTrigger\",\"typeProperties\":{\"recurrence\":{\"frequency\":\"Minute\",\"interval\":1427518805,\"startTime\":\"2021-04-27T23:49:15Z\",\"endTime\":\"2021-06-28T00:05:17Z\",\"timeZone\":\"rnb\",\"schedule\":{\"minutes\":[1119797804],\"hours\":[999351737,732651337],\"weekDays\":[\"Tuesday\",\"Thursday\",\"Thursday\",\"Tuesday\"],\"monthDays\":[466726136,431958697,2021158859,959950633],\"monthlyOccurrences\":[{\"day\":\"Thursday\",\"occurrence\":104057412,\"\":{\"mnfavllbskl\":\"datahwaadcz\",\"kcea\":\"dataakkihxpofv\"}},{\"day\":\"Tuesday\",\"occurrence\":1036046655,\"\":{\"tg\":\"datadvaw\",\"naeclrjscdoqocdr\":\"dataqteg\"}},{\"day\":\"Thursday\",\"occurrence\":1417547783,\"\":{\"uuboyrfqyjtollug\":\"dataroaedswhbse\",\"kasbda\":\"datasvzi\",\"mutwmarfbsz\":\"datadsvdbdl\"}},{\"day\":\"Friday\",\"occurrence\":10999242,\"\":{\"hc\":\"datardmbebxmkwokl\"}}],\"\":{\"bfweezzrzfytq\":\"datagutitjwvvvapdsh\",\"hidh\":\"datanbxgofiphlwyzd\"}},\"\":{\"xcbfrnttlrumvi\":\"dataslczkzlbztsgklue\"}}},\"pipelines\":[{\"pipelineReference\":{\"referenceName\":\"dcavvj\",\"name\":\"nnhafed\"},\"parameters\":{\"vmuqxsoc\":\"dataxbauzvxejicpmgl\",\"djpugais\":\"datakjrtcifxl\",\"dmnvtpbohzcaaq\":\"datavsj\"}},{\"pipelineReference\":{\"referenceName\":\"daqfvplfy\",\"name\":\"b\"},\"parameters\":{\"bbvqsqw\":\"datashmqn\",\"ilqscjxpro\":\"datawxtqdtve\",\"iytkeqjviawspvbc\":\"datafyddrsairxnw\"}}],\"description\":\"heelmiuprfqyrwtd\",\"runtimeState\":\"Stopped\",\"annotations\":[\"datahewd\",\"dataualgkfo\",\"datanqmdtuyimdoprkp\",\"dataghqs\"],\"\":{\"hox\":\"dataebxjedyyeng\"}}")
            .toObject(ScheduleTrigger.class);
        Assertions.assertEquals("heelmiuprfqyrwtd", model.description());
        Assertions.assertEquals("dcavvj", model.pipelines().get(0).pipelineReference().referenceName());
        Assertions.assertEquals("nnhafed", model.pipelines().get(0).pipelineReference().name());
        Assertions.assertEquals(RecurrenceFrequency.MINUTE, model.recurrence().frequency());
        Assertions.assertEquals(1427518805, model.recurrence().interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-27T23:49:15Z"), model.recurrence().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-28T00:05:17Z"), model.recurrence().endTime());
        Assertions.assertEquals("rnb", model.recurrence().timeZone());
        Assertions.assertEquals(1119797804, model.recurrence().schedule().minutes().get(0));
        Assertions.assertEquals(999351737, model.recurrence().schedule().hours().get(0));
        Assertions.assertEquals(DaysOfWeek.TUESDAY, model.recurrence().schedule().weekDays().get(0));
        Assertions.assertEquals(466726136, model.recurrence().schedule().monthDays().get(0));
        Assertions.assertEquals(DayOfWeek.THURSDAY, model.recurrence().schedule().monthlyOccurrences().get(0).day());
        Assertions.assertEquals(104057412, model.recurrence().schedule().monthlyOccurrences().get(0).occurrence());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleTrigger model = new ScheduleTrigger().withDescription("heelmiuprfqyrwtd")
            .withAnnotations(Arrays.asList("datahewd", "dataualgkfo", "datanqmdtuyimdoprkp", "dataghqs"))
            .withPipelines(Arrays.asList(
                new TriggerPipelineReference()
                    .withPipelineReference(new PipelineReference().withReferenceName("dcavvj").withName("nnhafed"))
                    .withParameters(mapOf("vmuqxsoc", "dataxbauzvxejicpmgl", "djpugais", "datakjrtcifxl",
                        "dmnvtpbohzcaaq", "datavsj")),
                new TriggerPipelineReference()
                    .withPipelineReference(new PipelineReference().withReferenceName("daqfvplfy").withName("b"))
                    .withParameters(mapOf("bbvqsqw", "datashmqn", "ilqscjxpro", "datawxtqdtve", "iytkeqjviawspvbc",
                        "datafyddrsairxnw"))))
            .withRecurrence(new ScheduleTriggerRecurrence().withFrequency(RecurrenceFrequency.MINUTE)
                .withInterval(1427518805).withStartTime(OffsetDateTime.parse("2021-04-27T23:49:15Z"))
                .withEndTime(OffsetDateTime.parse("2021-06-28T00:05:17Z")).withTimeZone("rnb")
                .withSchedule(new RecurrenceSchedule().withMinutes(Arrays.asList(1119797804))
                    .withHours(Arrays.asList(999351737, 732651337))
                    .withWeekDays(
                        Arrays.asList(DaysOfWeek.TUESDAY, DaysOfWeek.THURSDAY, DaysOfWeek.THURSDAY, DaysOfWeek.TUESDAY))
                    .withMonthDays(Arrays.asList(466726136, 431958697, 2021158859, 959950633))
                    .withMonthlyOccurrences(Arrays.asList(
                        new RecurrenceScheduleOccurrence().withDay(DayOfWeek.THURSDAY).withOccurrence(104057412)
                            .withAdditionalProperties(mapOf()),
                        new RecurrenceScheduleOccurrence().withDay(DayOfWeek.TUESDAY).withOccurrence(1036046655)
                            .withAdditionalProperties(mapOf()),
                        new RecurrenceScheduleOccurrence().withDay(DayOfWeek.THURSDAY).withOccurrence(1417547783)
                            .withAdditionalProperties(mapOf()),
                        new RecurrenceScheduleOccurrence().withDay(DayOfWeek.FRIDAY).withOccurrence(10999242)
                            .withAdditionalProperties(mapOf())))
                    .withAdditionalProperties(mapOf()))
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(ScheduleTrigger.class);
        Assertions.assertEquals("heelmiuprfqyrwtd", model.description());
        Assertions.assertEquals("dcavvj", model.pipelines().get(0).pipelineReference().referenceName());
        Assertions.assertEquals("nnhafed", model.pipelines().get(0).pipelineReference().name());
        Assertions.assertEquals(RecurrenceFrequency.MINUTE, model.recurrence().frequency());
        Assertions.assertEquals(1427518805, model.recurrence().interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-27T23:49:15Z"), model.recurrence().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-28T00:05:17Z"), model.recurrence().endTime());
        Assertions.assertEquals("rnb", model.recurrence().timeZone());
        Assertions.assertEquals(1119797804, model.recurrence().schedule().minutes().get(0));
        Assertions.assertEquals(999351737, model.recurrence().schedule().hours().get(0));
        Assertions.assertEquals(DaysOfWeek.TUESDAY, model.recurrence().schedule().weekDays().get(0));
        Assertions.assertEquals(466726136, model.recurrence().schedule().monthDays().get(0));
        Assertions.assertEquals(DayOfWeek.THURSDAY, model.recurrence().schedule().monthlyOccurrences().get(0).day());
        Assertions.assertEquals(104057412, model.recurrence().schedule().monthlyOccurrences().get(0).occurrence());
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
