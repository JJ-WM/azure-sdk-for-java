// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.metrics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The result data of a query.
 */
@Fluent
public final class Metric {
    /*
     * The metric Id.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The resource type of the metric resource.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * The name and the display name of the metric, i.e. it is localizable string.
     */
    @JsonProperty(value = "name", required = true)
    private LocalizableString name;

    /*
     * Detailed description of this metric.
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /*
     * 'Success' or the error details on query failures for this metric.
     */
    @JsonProperty(value = "errorCode")
    private String errorCode;

    /*
     * Error message encountered querying this specific metric.
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /*
     * The unit of the metric.
     */
    @JsonProperty(value = "unit", required = true)
    private MetricUnit unit;

    /*
     * The time series returned when a data query is performed.
     */
    @JsonProperty(value = "timeseries", required = true)
    private List<TimeSeriesElement> timeseries;

    /**
     * Creates an instance of Metric class.
     * 
     * @param id the id value to set.
     * @param type the type value to set.
     * @param name the name value to set.
     * @param unit the unit value to set.
     * @param timeseries the timeseries value to set.
     */
    @JsonCreator
    public Metric(@JsonProperty(value = "id", required = true) String id,
        @JsonProperty(value = "type", required = true) String type,
        @JsonProperty(value = "name", required = true) LocalizableString name,
        @JsonProperty(value = "unit", required = true) MetricUnit unit,
        @JsonProperty(value = "timeseries", required = true) List<TimeSeriesElement> timeseries) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.unit = unit;
        this.timeseries = timeseries;
    }

    /**
     * Get the id property: The metric Id.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the type property: The resource type of the metric resource.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Get the name property: The name and the display name of the metric, i.e. it is localizable string.
     * 
     * @return the name value.
     */
    public LocalizableString getName() {
        return this.name;
    }

    /**
     * Get the displayDescription property: Detailed description of this metric.
     * 
     * @return the displayDescription value.
     */
    public String getDisplayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: Detailed description of this metric.
     * 
     * @param displayDescription the displayDescription value to set.
     * @return the Metric object itself.
     */
    public Metric setDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the errorCode property: 'Success' or the error details on query failures for this metric.
     * 
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: 'Success' or the error details on query failures for this metric.
     * 
     * @param errorCode the errorCode value to set.
     * @return the Metric object itself.
     */
    public Metric setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the errorMessage property: Error message encountered querying this specific metric.
     * 
     * @return the errorMessage value.
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: Error message encountered querying this specific metric.
     * 
     * @param errorMessage the errorMessage value to set.
     * @return the Metric object itself.
     */
    public Metric setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get the unit property: The unit of the metric.
     * 
     * @return the unit value.
     */
    public MetricUnit getUnit() {
        return this.unit;
    }

    /**
     * Get the timeseries property: The time series returned when a data query is performed.
     * 
     * @return the timeseries value.
     */
    public List<TimeSeriesElement> getTimeseries() {
        return this.timeseries;
    }
}
