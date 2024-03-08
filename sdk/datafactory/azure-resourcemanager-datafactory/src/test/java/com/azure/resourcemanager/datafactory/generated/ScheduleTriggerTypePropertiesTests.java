// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ScheduleTriggerTypeProperties;
import com.azure.resourcemanager.datafactory.models.DayOfWeek;
import com.azure.resourcemanager.datafactory.models.DaysOfWeek;
import com.azure.resourcemanager.datafactory.models.RecurrenceFrequency;
import com.azure.resourcemanager.datafactory.models.RecurrenceSchedule;
import com.azure.resourcemanager.datafactory.models.RecurrenceScheduleOccurrence;
import com.azure.resourcemanager.datafactory.models.ScheduleTriggerRecurrence;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ScheduleTriggerTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleTriggerTypeProperties model = BinaryData.fromString(
            "{\"recurrence\":{\"frequency\":\"Year\",\"interval\":1833658573,\"startTime\":\"2021-08-26T04:22:28Z\",\"endTime\":\"2021-10-03T00:24:41Z\",\"timeZone\":\"bdzo\",\"schedule\":{\"minutes\":[1776980821],\"hours\":[1872232648,706756722],\"weekDays\":[\"Sunday\",\"Tuesday\",\"Monday\"],\"monthDays\":[1611379583,1004950603,1477251733],\"monthlyOccurrences\":[{\"day\":\"Wednesday\",\"occurrence\":458247050,\"\":{\"rmwdofgfspzwa\":\"dataqbyubswzaf\",\"wvjcdjvlwczw\":\"datacu\",\"fckrmrbaoidt\":\"datakkscooqnvht\",\"cbvkoughjsxp\":\"datam\"}}],\"\":{\"vyvscgzqncddaq\":\"datavppfdnihxcijftsb\",\"nex\":\"dataklvyibrohfvbg\",\"j\":\"datalsanglwnkkz\"}},\"\":{\"ajyrhrywucpdzbnt\":\"datarhjj\"}}}")
            .toObject(ScheduleTriggerTypeProperties.class);
        Assertions.assertEquals(RecurrenceFrequency.YEAR, model.recurrence().frequency());
        Assertions.assertEquals(1833658573, model.recurrence().interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-26T04:22:28Z"), model.recurrence().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-03T00:24:41Z"), model.recurrence().endTime());
        Assertions.assertEquals("bdzo", model.recurrence().timeZone());
        Assertions.assertEquals(1776980821, model.recurrence().schedule().minutes().get(0));
        Assertions.assertEquals(1872232648, model.recurrence().schedule().hours().get(0));
        Assertions.assertEquals(DaysOfWeek.SUNDAY, model.recurrence().schedule().weekDays().get(0));
        Assertions.assertEquals(1611379583, model.recurrence().schedule().monthDays().get(0));
        Assertions.assertEquals(DayOfWeek.WEDNESDAY, model.recurrence().schedule().monthlyOccurrences().get(0).day());
        Assertions.assertEquals(458247050, model.recurrence().schedule().monthlyOccurrences().get(0).occurrence());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleTriggerTypeProperties model = new ScheduleTriggerTypeProperties()
            .withRecurrence(new ScheduleTriggerRecurrence().withFrequency(RecurrenceFrequency.YEAR)
                .withInterval(1833658573).withStartTime(OffsetDateTime.parse("2021-08-26T04:22:28Z"))
                .withEndTime(OffsetDateTime.parse("2021-10-03T00:24:41Z")).withTimeZone("bdzo")
                .withSchedule(new RecurrenceSchedule().withMinutes(Arrays.asList(1776980821))
                    .withHours(Arrays.asList(1872232648, 706756722))
                    .withWeekDays(Arrays.asList(DaysOfWeek.SUNDAY, DaysOfWeek.TUESDAY, DaysOfWeek.MONDAY))
                    .withMonthDays(Arrays.asList(1611379583, 1004950603, 1477251733))
                    .withMonthlyOccurrences(Arrays.asList(new RecurrenceScheduleOccurrence()
                        .withDay(DayOfWeek.WEDNESDAY).withOccurrence(458247050).withAdditionalProperties(mapOf())))
                    .withAdditionalProperties(mapOf()))
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(ScheduleTriggerTypeProperties.class);
        Assertions.assertEquals(RecurrenceFrequency.YEAR, model.recurrence().frequency());
        Assertions.assertEquals(1833658573, model.recurrence().interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-26T04:22:28Z"), model.recurrence().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-03T00:24:41Z"), model.recurrence().endTime());
        Assertions.assertEquals("bdzo", model.recurrence().timeZone());
        Assertions.assertEquals(1776980821, model.recurrence().schedule().minutes().get(0));
        Assertions.assertEquals(1872232648, model.recurrence().schedule().hours().get(0));
        Assertions.assertEquals(DaysOfWeek.SUNDAY, model.recurrence().schedule().weekDays().get(0));
        Assertions.assertEquals(1611379583, model.recurrence().schedule().monthDays().get(0));
        Assertions.assertEquals(DayOfWeek.WEDNESDAY, model.recurrence().schedule().monthlyOccurrences().get(0).day());
        Assertions.assertEquals(458247050, model.recurrence().schedule().monthlyOccurrences().get(0).occurrence());
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
