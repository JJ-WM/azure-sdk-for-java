// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.security.models.IoTSecurityAggregatedAlertPropertiesTopDevicesListItem;
import com.azure.resourcemanager.security.models.ReportedSeverity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * Security Solution Aggregated Alert information.
 */
@Fluent
public final class IoTSecurityAggregatedAlertInner extends ProxyResource {
    /*
     * IoT Security solution aggregated alert details.
     */
    @JsonProperty(value = "properties")
    private IoTSecurityAggregatedAlertProperties innerProperties;

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Creates an instance of IoTSecurityAggregatedAlertInner class.
     */
    public IoTSecurityAggregatedAlertInner() {
    }

    /**
     * Get the innerProperties property: IoT Security solution aggregated alert details.
     * 
     * @return the innerProperties value.
     */
    private IoTSecurityAggregatedAlertProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the IoTSecurityAggregatedAlertInner object itself.
     */
    public IoTSecurityAggregatedAlertInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the alertType property: Name of the alert type.
     * 
     * @return the alertType value.
     */
    public String alertType() {
        return this.innerProperties() == null ? null : this.innerProperties().alertType();
    }

    /**
     * Get the alertDisplayName property: Display name of the alert type.
     * 
     * @return the alertDisplayName value.
     */
    public String alertDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().alertDisplayName();
    }

    /**
     * Get the aggregatedDateUtc property: Date of detection.
     * 
     * @return the aggregatedDateUtc value.
     */
    public LocalDate aggregatedDateUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().aggregatedDateUtc();
    }

    /**
     * Get the vendorName property: Name of the organization that raised the alert.
     * 
     * @return the vendorName value.
     */
    public String vendorName() {
        return this.innerProperties() == null ? null : this.innerProperties().vendorName();
    }

    /**
     * Get the reportedSeverity property: Assessed alert severity.
     * 
     * @return the reportedSeverity value.
     */
    public ReportedSeverity reportedSeverity() {
        return this.innerProperties() == null ? null : this.innerProperties().reportedSeverity();
    }

    /**
     * Get the remediationSteps property: Recommended steps for remediation.
     * 
     * @return the remediationSteps value.
     */
    public String remediationSteps() {
        return this.innerProperties() == null ? null : this.innerProperties().remediationSteps();
    }

    /**
     * Get the description property: Description of the suspected vulnerability and meaning.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the count property: Number of alerts occurrences within the aggregated time window.
     * 
     * @return the count value.
     */
    public Long count() {
        return this.innerProperties() == null ? null : this.innerProperties().count();
    }

    /**
     * Get the effectedResourceType property: Azure resource ID of the resource that received the alerts.
     * 
     * @return the effectedResourceType value.
     */
    public String effectedResourceType() {
        return this.innerProperties() == null ? null : this.innerProperties().effectedResourceType();
    }

    /**
     * Get the systemSource property: The type of the alerted resource (Azure, Non-Azure).
     * 
     * @return the systemSource value.
     */
    public String systemSource() {
        return this.innerProperties() == null ? null : this.innerProperties().systemSource();
    }

    /**
     * Get the actionTaken property: IoT Security solution alert response.
     * 
     * @return the actionTaken value.
     */
    public String actionTaken() {
        return this.innerProperties() == null ? null : this.innerProperties().actionTaken();
    }

    /**
     * Get the logAnalyticsQuery property: Log analytics query for getting the list of affected devices/alerts.
     * 
     * @return the logAnalyticsQuery value.
     */
    public String logAnalyticsQuery() {
        return this.innerProperties() == null ? null : this.innerProperties().logAnalyticsQuery();
    }

    /**
     * Get the topDevicesList property: 10 devices with the highest number of occurrences of this alert type, on this
     * day.
     * 
     * @return the topDevicesList value.
     */
    public List<IoTSecurityAggregatedAlertPropertiesTopDevicesListItem> topDevicesList() {
        return this.innerProperties() == null ? null : this.innerProperties().topDevicesList();
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
