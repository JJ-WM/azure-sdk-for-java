// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.maintenance.models.InputPatchConfiguration;
import com.azure.resourcemanager.maintenance.models.MaintenanceScope;
import com.azure.resourcemanager.maintenance.models.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Maintenance configuration record type. */
@Fluent
public final class MaintenanceConfigurationInner extends ProxyResource {
    /*
     * Gets or sets location of the resource
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Gets or sets tags of the resource
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Gets or sets properties of the resource
     */
    @JsonProperty(value = "properties")
    private MaintenanceConfigurationProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of MaintenanceConfigurationInner class. */
    public MaintenanceConfigurationInner() {
    }

    /**
     * Get the location property: Gets or sets location of the resource.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Gets or sets location of the resource.
     *
     * @param location the location value to set.
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Gets or sets tags of the resource.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Gets or sets tags of the resource.
     *
     * @param tags the tags value to set.
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: Gets or sets properties of the resource.
     *
     * @return the innerProperties value.
     */
    private MaintenanceConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the namespace property: Gets or sets namespace of the resource.
     *
     * @return the namespace value.
     */
    public String namespace() {
        return this.innerProperties() == null ? null : this.innerProperties().namespace();
    }

    /**
     * Set the namespace property: Gets or sets namespace of the resource.
     *
     * @param namespace the namespace value to set.
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withNamespace(String namespace) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MaintenanceConfigurationProperties();
        }
        this.innerProperties().withNamespace(namespace);
        return this;
    }

    /**
     * Get the extensionProperties property: Gets or sets extensionProperties of the maintenanceConfiguration.
     *
     * @return the extensionProperties value.
     */
    public Map<String, String> extensionProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().extensionProperties();
    }

    /**
     * Set the extensionProperties property: Gets or sets extensionProperties of the maintenanceConfiguration.
     *
     * @param extensionProperties the extensionProperties value to set.
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withExtensionProperties(Map<String, String> extensionProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MaintenanceConfigurationProperties();
        }
        this.innerProperties().withExtensionProperties(extensionProperties);
        return this;
    }

    /**
     * Get the maintenanceScope property: Gets or sets maintenanceScope of the configuration.
     *
     * @return the maintenanceScope value.
     */
    public MaintenanceScope maintenanceScope() {
        return this.innerProperties() == null ? null : this.innerProperties().maintenanceScope();
    }

    /**
     * Set the maintenanceScope property: Gets or sets maintenanceScope of the configuration.
     *
     * @param maintenanceScope the maintenanceScope value to set.
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withMaintenanceScope(MaintenanceScope maintenanceScope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MaintenanceConfigurationProperties();
        }
        this.innerProperties().withMaintenanceScope(maintenanceScope);
        return this;
    }

    /**
     * Get the visibility property: Gets or sets the visibility of the configuration. The default value is 'Custom'.
     *
     * @return the visibility value.
     */
    public Visibility visibility() {
        return this.innerProperties() == null ? null : this.innerProperties().visibility();
    }

    /**
     * Set the visibility property: Gets or sets the visibility of the configuration. The default value is 'Custom'.
     *
     * @param visibility the visibility value to set.
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withVisibility(Visibility visibility) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MaintenanceConfigurationProperties();
        }
        this.innerProperties().withVisibility(visibility);
        return this;
    }

    /**
     * Get the installPatches property: The input parameters to be passed to the patch run operation.
     *
     * @return the installPatches value.
     */
    public InputPatchConfiguration installPatches() {
        return this.innerProperties() == null ? null : this.innerProperties().installPatches();
    }

    /**
     * Set the installPatches property: The input parameters to be passed to the patch run operation.
     *
     * @param installPatches the installPatches value to set.
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withInstallPatches(InputPatchConfiguration installPatches) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MaintenanceConfigurationProperties();
        }
        this.innerProperties().withInstallPatches(installPatches);
        return this;
    }

    /**
     * Get the startDateTime property: Effective start date of the maintenance window in YYYY-MM-DD hh:mm format. The
     * start date can be set to either the current date or future date. The window will be created in the time zone
     * provided and adjusted to daylight savings according to that time zone.
     *
     * @return the startDateTime value.
     */
    public String startDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startDateTime();
    }

    /**
     * Set the startDateTime property: Effective start date of the maintenance window in YYYY-MM-DD hh:mm format. The
     * start date can be set to either the current date or future date. The window will be created in the time zone
     * provided and adjusted to daylight savings according to that time zone.
     *
     * @param startDateTime the startDateTime value to set.
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withStartDateTime(String startDateTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MaintenanceConfigurationProperties();
        }
        this.innerProperties().withStartDateTime(startDateTime);
        return this;
    }

    /**
     * Get the expirationDateTime property: Effective expiration date of the maintenance window in YYYY-MM-DD hh:mm
     * format. The window will be created in the time zone provided and adjusted to daylight savings according to that
     * time zone. Expiration date must be set to a future date. If not provided, it will be set to the maximum datetime
     * 9999-12-31 23:59:59.
     *
     * @return the expirationDateTime value.
     */
    public String expirationDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationDateTime();
    }

    /**
     * Set the expirationDateTime property: Effective expiration date of the maintenance window in YYYY-MM-DD hh:mm
     * format. The window will be created in the time zone provided and adjusted to daylight savings according to that
     * time zone. Expiration date must be set to a future date. If not provided, it will be set to the maximum datetime
     * 9999-12-31 23:59:59.
     *
     * @param expirationDateTime the expirationDateTime value to set.
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withExpirationDateTime(String expirationDateTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MaintenanceConfigurationProperties();
        }
        this.innerProperties().withExpirationDateTime(expirationDateTime);
        return this;
    }

    /**
     * Get the duration property: Duration of the maintenance window in HH:mm format. If not provided, default value
     * will be used based on maintenance scope provided. Example: 05:00.
     *
     * @return the duration value.
     */
    public String duration() {
        return this.innerProperties() == null ? null : this.innerProperties().duration();
    }

    /**
     * Set the duration property: Duration of the maintenance window in HH:mm format. If not provided, default value
     * will be used based on maintenance scope provided. Example: 05:00.
     *
     * @param duration the duration value to set.
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withDuration(String duration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MaintenanceConfigurationProperties();
        }
        this.innerProperties().withDuration(duration);
        return this;
    }

    /**
     * Get the timeZone property: Name of the timezone. List of timezones can be obtained by executing
     * [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell. Example: Pacific Standard Time, UTC, W. Europe
     * Standard Time, Korea Standard Time, Cen. Australia Standard Time.
     *
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.innerProperties() == null ? null : this.innerProperties().timeZone();
    }

    /**
     * Set the timeZone property: Name of the timezone. List of timezones can be obtained by executing
     * [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell. Example: Pacific Standard Time, UTC, W. Europe
     * Standard Time, Korea Standard Time, Cen. Australia Standard Time.
     *
     * @param timeZone the timeZone value to set.
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withTimeZone(String timeZone) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MaintenanceConfigurationProperties();
        }
        this.innerProperties().withTimeZone(timeZone);
        return this;
    }

    /**
     * Get the recurEvery property: Rate at which a Maintenance window is expected to recur. The rate can be expressed
     * as daily, weekly, or monthly schedules. Daily schedule are formatted as recurEvery: [Frequency as
     * integer]['Day(s)']. If no frequency is provided, the default frequency is 1. Daily schedule examples are
     * recurEvery: Day, recurEvery: 3Days. Weekly schedule are formatted as recurEvery: [Frequency as
     * integer]['Week(s)'] [Optional comma separated list of weekdays Monday-Sunday]. Weekly schedule examples are
     * recurEvery: 3Weeks, recurEvery: Week Saturday,Sunday. Monthly schedules are formatted as [Frequency as
     * integer]['Month(s)'] [Comma separated list of month days] or [Frequency as integer]['Month(s)'] [Week of Month
     * (First, Second, Third, Fourth, Last)] [Weekday Monday-Sunday] [Optional Offset(No. of days)]. Offset value must
     * be between -6 to 6 inclusive. Monthly schedule examples are recurEvery: Month, recurEvery: 2Months, recurEvery:
     * Month day23,day24, recurEvery: Month Last Sunday, recurEvery: Month Fourth Monday, recurEvery: Month Last Sunday
     * Offset-3, recurEvery: Month Third Sunday Offset6.
     *
     * @return the recurEvery value.
     */
    public String recurEvery() {
        return this.innerProperties() == null ? null : this.innerProperties().recurEvery();
    }

    /**
     * Set the recurEvery property: Rate at which a Maintenance window is expected to recur. The rate can be expressed
     * as daily, weekly, or monthly schedules. Daily schedule are formatted as recurEvery: [Frequency as
     * integer]['Day(s)']. If no frequency is provided, the default frequency is 1. Daily schedule examples are
     * recurEvery: Day, recurEvery: 3Days. Weekly schedule are formatted as recurEvery: [Frequency as
     * integer]['Week(s)'] [Optional comma separated list of weekdays Monday-Sunday]. Weekly schedule examples are
     * recurEvery: 3Weeks, recurEvery: Week Saturday,Sunday. Monthly schedules are formatted as [Frequency as
     * integer]['Month(s)'] [Comma separated list of month days] or [Frequency as integer]['Month(s)'] [Week of Month
     * (First, Second, Third, Fourth, Last)] [Weekday Monday-Sunday] [Optional Offset(No. of days)]. Offset value must
     * be between -6 to 6 inclusive. Monthly schedule examples are recurEvery: Month, recurEvery: 2Months, recurEvery:
     * Month day23,day24, recurEvery: Month Last Sunday, recurEvery: Month Fourth Monday, recurEvery: Month Last Sunday
     * Offset-3, recurEvery: Month Third Sunday Offset6.
     *
     * @param recurEvery the recurEvery value to set.
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withRecurEvery(String recurEvery) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MaintenanceConfigurationProperties();
        }
        this.innerProperties().withRecurEvery(recurEvery);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
