// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DayOfWeek;
import com.azure.resourcemanager.datafactory.models.DaysOfWeek;
import com.azure.resourcemanager.datafactory.models.RecurrenceSchedule;
import com.azure.resourcemanager.datafactory.models.RecurrenceScheduleOccurrence;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RecurrenceScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecurrenceSchedule model =
            BinaryData
                .fromString(
                    "{\"minutes\":[717518329],\"hours\":[1118044091,660441110,1722243594],\"weekDays\":[\"Thursday\"],\"monthDays\":[878999614],\"monthlyOccurrences\":[{\"day\":\"Monday\",\"occurrence\":580139874,\"\":{\"kidiujfpu\":\"databp\"}},{\"day\":\"Sunday\",\"occurrence\":567692310,\"\":{\"crouakmwvqt\":\"datapksjwaglhwnnfgy\",\"ozvfeljytshjjbo\":\"dataf\",\"yhwo\":\"datauugoujsvhezhe\",\"x\":\"dataayyshf\"}},{\"day\":\"Tuesday\",\"occurrence\":1488114471,\"\":{\"dblredxfcckticwg\":\"dataylthdrnze\",\"bvgcebutskdgsuht\":\"dataivq\",\"ulia\":\"datazomsqebmfopely\"}},{\"day\":\"Wednesday\",\"occurrence\":1030677140,\"\":{\"gmshuyqehbpr\":\"dataxeozgjtuh\",\"mtlfbzlziduq\":\"dataptoentuve\",\"hetrqudxzrbg\":\"dataxwrets\",\"iwpaeumely\":\"datatjjiearyzzxk\"}}],\"\":{\"trnwwwwlvvrditg\":\"datahurzazcukg\",\"nosizerzygkdl\":\"databaqumql\",\"sjlkjvoeuiwyptze\":\"datayltqryaahlttomlp\"}}")
                .toObject(RecurrenceSchedule.class);
        Assertions.assertEquals(717518329, model.minutes().get(0));
        Assertions.assertEquals(1118044091, model.hours().get(0));
        Assertions.assertEquals(DaysOfWeek.THURSDAY, model.weekDays().get(0));
        Assertions.assertEquals(878999614, model.monthDays().get(0));
        Assertions.assertEquals(DayOfWeek.MONDAY, model.monthlyOccurrences().get(0).day());
        Assertions.assertEquals(580139874, model.monthlyOccurrences().get(0).occurrence());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecurrenceSchedule model =
            new RecurrenceSchedule()
                .withMinutes(Arrays.asList(717518329))
                .withHours(Arrays.asList(1118044091, 660441110, 1722243594))
                .withWeekDays(Arrays.asList(DaysOfWeek.THURSDAY))
                .withMonthDays(Arrays.asList(878999614))
                .withMonthlyOccurrences(
                    Arrays
                        .asList(
                            new RecurrenceScheduleOccurrence()
                                .withDay(DayOfWeek.MONDAY)
                                .withOccurrence(580139874)
                                .withAdditionalProperties(mapOf()),
                            new RecurrenceScheduleOccurrence()
                                .withDay(DayOfWeek.SUNDAY)
                                .withOccurrence(567692310)
                                .withAdditionalProperties(mapOf()),
                            new RecurrenceScheduleOccurrence()
                                .withDay(DayOfWeek.TUESDAY)
                                .withOccurrence(1488114471)
                                .withAdditionalProperties(mapOf()),
                            new RecurrenceScheduleOccurrence()
                                .withDay(DayOfWeek.WEDNESDAY)
                                .withOccurrence(1030677140)
                                .withAdditionalProperties(mapOf())))
                .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(RecurrenceSchedule.class);
        Assertions.assertEquals(717518329, model.minutes().get(0));
        Assertions.assertEquals(1118044091, model.hours().get(0));
        Assertions.assertEquals(DaysOfWeek.THURSDAY, model.weekDays().get(0));
        Assertions.assertEquals(878999614, model.monthDays().get(0));
        Assertions.assertEquals(DayOfWeek.MONDAY, model.monthlyOccurrences().get(0).day());
        Assertions.assertEquals(580139874, model.monthlyOccurrences().get(0).occurrence());
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
