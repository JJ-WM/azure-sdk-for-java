// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.models.TimeSeriesElement;
import com.azure.resourcemanager.monitor.models.Unit;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The result data of a query.
 */
@Fluent
public final class MetricInner {
    /*
     * the metric Id.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * the resource type of the metric resource.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * the name and the display name of the metric, i.e. it is localizable string.
     */
    @JsonProperty(value = "name", required = true)
    private LocalizableStringInner name;

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
    private Unit unit;

    /*
     * the time series returned when a data query is performed.
     */
    @JsonProperty(value = "timeseries", required = true)
    private List<TimeSeriesElement> timeseries;

    /**
     * Creates an instance of MetricInner class.
     */
    public MetricInner() {
    }

    /**
     * Get the id property: the metric Id.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: the metric Id.
     * 
     * @param id the id value to set.
     * @return the MetricInner object itself.
     */
    public MetricInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: the resource type of the metric resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: the resource type of the metric resource.
     * 
     * @param type the type value to set.
     * @return the MetricInner object itself.
     */
    public MetricInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: the name and the display name of the metric, i.e. it is localizable string.
     * 
     * @return the name value.
     */
    public LocalizableStringInner name() {
        return this.name;
    }

    /**
     * Set the name property: the name and the display name of the metric, i.e. it is localizable string.
     * 
     * @param name the name value to set.
     * @return the MetricInner object itself.
     */
    public MetricInner withName(LocalizableStringInner name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayDescription property: Detailed description of this metric.
     * 
     * @return the displayDescription value.
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: Detailed description of this metric.
     * 
     * @param displayDescription the displayDescription value to set.
     * @return the MetricInner object itself.
     */
    public MetricInner withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the errorCode property: 'Success' or the error details on query failures for this metric.
     * 
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: 'Success' or the error details on query failures for this metric.
     * 
     * @param errorCode the errorCode value to set.
     * @return the MetricInner object itself.
     */
    public MetricInner withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the errorMessage property: Error message encountered querying this specific metric.
     * 
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: Error message encountered querying this specific metric.
     * 
     * @param errorMessage the errorMessage value to set.
     * @return the MetricInner object itself.
     */
    public MetricInner withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get the unit property: The unit of the metric.
     * 
     * @return the unit value.
     */
    public Unit unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit of the metric.
     * 
     * @param unit the unit value to set.
     * @return the MetricInner object itself.
     */
    public MetricInner withUnit(Unit unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the timeseries property: the time series returned when a data query is performed.
     * 
     * @return the timeseries value.
     */
    public List<TimeSeriesElement> timeseries() {
        return this.timeseries;
    }

    /**
     * Set the timeseries property: the time series returned when a data query is performed.
     * 
     * @param timeseries the timeseries value to set.
     * @return the MetricInner object itself.
     */
    public MetricInner withTimeseries(List<TimeSeriesElement> timeseries) {
        this.timeseries = timeseries;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property id in model MetricInner"));
        }
        if (type() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property type in model MetricInner"));
        }
        if (name() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property name in model MetricInner"));
        } else {
            name().validate();
        }
        if (unit() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property unit in model MetricInner"));
        }
        if (timeseries() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property timeseries in model MetricInner"));
        } else {
            timeseries().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MetricInner.class);
}
