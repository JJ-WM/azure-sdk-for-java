// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Start time of a 30-minute weekly maintenance window.
 */
@Fluent
public final class AmlFilesystemUpdatePropertiesMaintenanceWindow {
    /*
     * Day of the week on which the maintenance window will occur.
     */
    @JsonProperty(value = "dayOfWeek")
    private MaintenanceDayOfWeekType dayOfWeek;

    /*
     * The time of day (in UTC) to start the maintenance window.
     */
    @JsonProperty(value = "timeOfDayUTC")
    private String timeOfDayUtc;

    /**
     * Creates an instance of AmlFilesystemUpdatePropertiesMaintenanceWindow class.
     */
    public AmlFilesystemUpdatePropertiesMaintenanceWindow() {
    }

    /**
     * Get the dayOfWeek property: Day of the week on which the maintenance window will occur.
     * 
     * @return the dayOfWeek value.
     */
    public MaintenanceDayOfWeekType dayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * Set the dayOfWeek property: Day of the week on which the maintenance window will occur.
     * 
     * @param dayOfWeek the dayOfWeek value to set.
     * @return the AmlFilesystemUpdatePropertiesMaintenanceWindow object itself.
     */
    public AmlFilesystemUpdatePropertiesMaintenanceWindow withDayOfWeek(MaintenanceDayOfWeekType dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * Get the timeOfDayUtc property: The time of day (in UTC) to start the maintenance window.
     * 
     * @return the timeOfDayUtc value.
     */
    public String timeOfDayUtc() {
        return this.timeOfDayUtc;
    }

    /**
     * Set the timeOfDayUtc property: The time of day (in UTC) to start the maintenance window.
     * 
     * @param timeOfDayUtc the timeOfDayUtc value to set.
     * @return the AmlFilesystemUpdatePropertiesMaintenanceWindow object itself.
     */
    public AmlFilesystemUpdatePropertiesMaintenanceWindow withTimeOfDayUtc(String timeOfDayUtc) {
        this.timeOfDayUtc = timeOfDayUtc;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
