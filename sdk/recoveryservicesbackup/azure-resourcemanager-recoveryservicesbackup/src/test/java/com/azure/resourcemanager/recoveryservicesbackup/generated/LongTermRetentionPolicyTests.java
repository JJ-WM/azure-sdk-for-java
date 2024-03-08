// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DailyRetentionFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.DailyRetentionSchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.Day;
import com.azure.resourcemanager.recoveryservicesbackup.models.DayOfWeek;
import com.azure.resourcemanager.recoveryservicesbackup.models.LongTermRetentionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.MonthOfYear;
import com.azure.resourcemanager.recoveryservicesbackup.models.MonthlyRetentionSchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDuration;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDurationType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionScheduleFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeekOfMonth;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeeklyRetentionFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeeklyRetentionSchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.YearlyRetentionSchedule;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LongTermRetentionPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LongTermRetentionPolicy model = BinaryData.fromString(
            "{\"retentionPolicyType\":\"LongTermRetentionPolicy\",\"dailySchedule\":{\"retentionTimes\":[\"2021-08-04T05:58:11Z\",\"2021-03-21T10:03:04Z\",\"2021-03-01T11:00:51Z\"],\"retentionDuration\":{\"count\":477398510,\"durationType\":\"Months\"}},\"weeklySchedule\":{\"daysOfTheWeek\":[\"Wednesday\",\"Tuesday\"],\"retentionTimes\":[\"2021-10-22T02:54:53Z\",\"2021-09-14T20:40:58Z\",\"2021-07-15T16:39:33Z\"],\"retentionDuration\":{\"count\":1724104669,\"durationType\":\"Weeks\"}},\"monthlySchedule\":{\"retentionScheduleFormatType\":\"Daily\",\"retentionScheduleDaily\":{\"daysOfTheMonth\":[{\"date\":746800344,\"isLast\":true},{\"date\":2134608057,\"isLast\":false}]},\"retentionScheduleWeekly\":{\"daysOfTheWeek\":[\"Monday\",\"Sunday\",\"Friday\",\"Wednesday\"],\"weeksOfTheMonth\":[\"Last\",\"Fourth\"]},\"retentionTimes\":[\"2021-09-12T02:19:35Z\",\"2021-01-29T05:35:31Z\",\"2021-08-23T00:24:23Z\",\"2021-07-06T17:13:42Z\"],\"retentionDuration\":{\"count\":704768693,\"durationType\":\"Weeks\"}},\"yearlySchedule\":{\"retentionScheduleFormatType\":\"Invalid\",\"monthsOfYear\":[\"August\",\"June\"],\"retentionScheduleDaily\":{\"daysOfTheMonth\":[{\"date\":2049992940,\"isLast\":true},{\"date\":2060279442,\"isLast\":true}]},\"retentionScheduleWeekly\":{\"daysOfTheWeek\":[\"Sunday\",\"Friday\"],\"weeksOfTheMonth\":[\"Fourth\",\"Fourth\",\"Last\"]},\"retentionTimes\":[\"2021-01-17T11:13:52Z\",\"2021-11-16T13:27:21Z\"],\"retentionDuration\":{\"count\":1449522388,\"durationType\":\"Invalid\"}}}")
            .toObject(LongTermRetentionPolicy.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-04T05:58:11Z"),
            model.dailySchedule().retentionTimes().get(0));
        Assertions.assertEquals(477398510, model.dailySchedule().retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.MONTHS, model.dailySchedule().retentionDuration().durationType());
        Assertions.assertEquals(DayOfWeek.WEDNESDAY, model.weeklySchedule().daysOfTheWeek().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-22T02:54:53Z"),
            model.weeklySchedule().retentionTimes().get(0));
        Assertions.assertEquals(1724104669, model.weeklySchedule().retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.WEEKS, model.weeklySchedule().retentionDuration().durationType());
        Assertions.assertEquals(RetentionScheduleFormat.DAILY, model.monthlySchedule().retentionScheduleFormatType());
        Assertions.assertEquals(746800344,
            model.monthlySchedule().retentionScheduleDaily().daysOfTheMonth().get(0).date());
        Assertions.assertEquals(true,
            model.monthlySchedule().retentionScheduleDaily().daysOfTheMonth().get(0).isLast());
        Assertions.assertEquals(DayOfWeek.MONDAY,
            model.monthlySchedule().retentionScheduleWeekly().daysOfTheWeek().get(0));
        Assertions.assertEquals(WeekOfMonth.LAST,
            model.monthlySchedule().retentionScheduleWeekly().weeksOfTheMonth().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-12T02:19:35Z"),
            model.monthlySchedule().retentionTimes().get(0));
        Assertions.assertEquals(704768693, model.monthlySchedule().retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.WEEKS,
            model.monthlySchedule().retentionDuration().durationType());
        Assertions.assertEquals(RetentionScheduleFormat.INVALID, model.yearlySchedule().retentionScheduleFormatType());
        Assertions.assertEquals(MonthOfYear.AUGUST, model.yearlySchedule().monthsOfYear().get(0));
        Assertions.assertEquals(2049992940,
            model.yearlySchedule().retentionScheduleDaily().daysOfTheMonth().get(0).date());
        Assertions.assertEquals(true, model.yearlySchedule().retentionScheduleDaily().daysOfTheMonth().get(0).isLast());
        Assertions.assertEquals(DayOfWeek.SUNDAY,
            model.yearlySchedule().retentionScheduleWeekly().daysOfTheWeek().get(0));
        Assertions.assertEquals(WeekOfMonth.FOURTH,
            model.yearlySchedule().retentionScheduleWeekly().weeksOfTheMonth().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-17T11:13:52Z"),
            model.yearlySchedule().retentionTimes().get(0));
        Assertions.assertEquals(1449522388, model.yearlySchedule().retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.INVALID,
            model.yearlySchedule().retentionDuration().durationType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LongTermRetentionPolicy model = new LongTermRetentionPolicy()
            .withDailySchedule(new DailyRetentionSchedule()
                .withRetentionTimes(Arrays.asList(OffsetDateTime.parse("2021-08-04T05:58:11Z"),
                    OffsetDateTime.parse("2021-03-21T10:03:04Z"), OffsetDateTime.parse("2021-03-01T11:00:51Z")))
                .withRetentionDuration(
                    new RetentionDuration().withCount(477398510).withDurationType(RetentionDurationType.MONTHS)))
            .withWeeklySchedule(
                new WeeklyRetentionSchedule().withDaysOfTheWeek(Arrays.asList(DayOfWeek.WEDNESDAY, DayOfWeek.TUESDAY))
                    .withRetentionTimes(
                        Arrays.asList(OffsetDateTime.parse("2021-10-22T02:54:53Z"),
                            OffsetDateTime.parse("2021-09-14T20:40:58Z"), OffsetDateTime.parse("2021-07-15T16:39:33Z")))
                    .withRetentionDuration(
                        new RetentionDuration().withCount(1724104669).withDurationType(RetentionDurationType.WEEKS)))
            .withMonthlySchedule(new MonthlyRetentionSchedule()
                .withRetentionScheduleFormatType(RetentionScheduleFormat.DAILY)
                .withRetentionScheduleDaily(new DailyRetentionFormat().withDaysOfTheMonth(Arrays.asList(
                    new Day().withDate(746800344).withIsLast(true), new Day().withDate(2134608057).withIsLast(false))))
                .withRetentionScheduleWeekly(new WeeklyRetentionFormat()
                    .withDaysOfTheWeek(
                        Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.SUNDAY, DayOfWeek.FRIDAY, DayOfWeek.WEDNESDAY))
                    .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.LAST, WeekOfMonth.FOURTH)))
                .withRetentionTimes(Arrays.asList(OffsetDateTime.parse("2021-09-12T02:19:35Z"),
                    OffsetDateTime.parse("2021-01-29T05:35:31Z"), OffsetDateTime.parse("2021-08-23T00:24:23Z"),
                    OffsetDateTime.parse("2021-07-06T17:13:42Z")))
                .withRetentionDuration(
                    new RetentionDuration().withCount(704768693).withDurationType(RetentionDurationType.WEEKS)))
            .withYearlySchedule(new YearlyRetentionSchedule()
                .withRetentionScheduleFormatType(RetentionScheduleFormat.INVALID)
                .withMonthsOfYear(Arrays.asList(MonthOfYear.AUGUST, MonthOfYear.JUNE))
                .withRetentionScheduleDaily(new DailyRetentionFormat().withDaysOfTheMonth(Arrays.asList(
                    new Day().withDate(2049992940).withIsLast(true), new Day().withDate(2060279442).withIsLast(true))))
                .withRetentionScheduleWeekly(
                    new WeeklyRetentionFormat().withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY, DayOfWeek.FRIDAY))
                        .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.FOURTH, WeekOfMonth.FOURTH, WeekOfMonth.LAST)))
                .withRetentionTimes(Arrays.asList(OffsetDateTime.parse("2021-01-17T11:13:52Z"),
                    OffsetDateTime.parse("2021-11-16T13:27:21Z")))
                .withRetentionDuration(
                    new RetentionDuration().withCount(1449522388).withDurationType(RetentionDurationType.INVALID)));
        model = BinaryData.fromObject(model).toObject(LongTermRetentionPolicy.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-04T05:58:11Z"),
            model.dailySchedule().retentionTimes().get(0));
        Assertions.assertEquals(477398510, model.dailySchedule().retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.MONTHS, model.dailySchedule().retentionDuration().durationType());
        Assertions.assertEquals(DayOfWeek.WEDNESDAY, model.weeklySchedule().daysOfTheWeek().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-22T02:54:53Z"),
            model.weeklySchedule().retentionTimes().get(0));
        Assertions.assertEquals(1724104669, model.weeklySchedule().retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.WEEKS, model.weeklySchedule().retentionDuration().durationType());
        Assertions.assertEquals(RetentionScheduleFormat.DAILY, model.monthlySchedule().retentionScheduleFormatType());
        Assertions.assertEquals(746800344,
            model.monthlySchedule().retentionScheduleDaily().daysOfTheMonth().get(0).date());
        Assertions.assertEquals(true,
            model.monthlySchedule().retentionScheduleDaily().daysOfTheMonth().get(0).isLast());
        Assertions.assertEquals(DayOfWeek.MONDAY,
            model.monthlySchedule().retentionScheduleWeekly().daysOfTheWeek().get(0));
        Assertions.assertEquals(WeekOfMonth.LAST,
            model.monthlySchedule().retentionScheduleWeekly().weeksOfTheMonth().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-12T02:19:35Z"),
            model.monthlySchedule().retentionTimes().get(0));
        Assertions.assertEquals(704768693, model.monthlySchedule().retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.WEEKS,
            model.monthlySchedule().retentionDuration().durationType());
        Assertions.assertEquals(RetentionScheduleFormat.INVALID, model.yearlySchedule().retentionScheduleFormatType());
        Assertions.assertEquals(MonthOfYear.AUGUST, model.yearlySchedule().monthsOfYear().get(0));
        Assertions.assertEquals(2049992940,
            model.yearlySchedule().retentionScheduleDaily().daysOfTheMonth().get(0).date());
        Assertions.assertEquals(true, model.yearlySchedule().retentionScheduleDaily().daysOfTheMonth().get(0).isLast());
        Assertions.assertEquals(DayOfWeek.SUNDAY,
            model.yearlySchedule().retentionScheduleWeekly().daysOfTheWeek().get(0));
        Assertions.assertEquals(WeekOfMonth.FOURTH,
            model.yearlySchedule().retentionScheduleWeekly().weeksOfTheMonth().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-17T11:13:52Z"),
            model.yearlySchedule().retentionTimes().get(0));
        Assertions.assertEquals(1449522388, model.yearlySchedule().retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.INVALID,
            model.yearlySchedule().retentionDuration().durationType());
    }
}
