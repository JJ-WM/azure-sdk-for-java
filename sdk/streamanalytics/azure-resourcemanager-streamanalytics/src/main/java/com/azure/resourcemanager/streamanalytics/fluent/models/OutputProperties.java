// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.streamanalytics.models.Diagnostics;
import com.azure.resourcemanager.streamanalytics.models.LastOutputEventTimestamp;
import com.azure.resourcemanager.streamanalytics.models.OutputDataSource;
import com.azure.resourcemanager.streamanalytics.models.OutputWatermarkProperties;
import com.azure.resourcemanager.streamanalytics.models.Serialization;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The properties that are associated with an output.
 */
@Fluent
public final class OutputProperties {
    /*
     * Describes the data source that output will be written to. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "datasource")
    private OutputDataSource datasource;

    /*
     * The time frame for filtering Stream Analytics job outputs.
     */
    @JsonProperty(value = "timeWindow")
    private String timeWindow;

    /*
     * The size window to constrain a Stream Analytics output to.
     */
    @JsonProperty(value = "sizeWindow")
    private Integer sizeWindow;

    /*
     * Describes how data from an input is serialized or how data is serialized when written to an output. Required on
     * PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "serialization")
    private Serialization serialization;

    /*
     * Describes conditions applicable to the Input, Output, or the job overall, that warrant customer attention.
     */
    @JsonProperty(value = "diagnostics", access = JsonProperty.Access.WRITE_ONLY)
    private Diagnostics diagnostics;

    /*
     * The current entity tag for the output. This is an opaque string. You can use it to detect whether the resource
     * has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations
     * for optimistic concurrency.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * A list of the last output event times for each output partition. The index of the array corresponds to the
     * partition number.
     */
    @JsonProperty(value = "lastOutputEventTimestamps", access = JsonProperty.Access.WRITE_ONLY)
    private List<LastOutputEventTimestamp> lastOutputEventTimestamps;

    /*
     * Settings which determine whether to send watermarks to downstream.
     */
    @JsonProperty(value = "watermarkSettings")
    private OutputWatermarkProperties watermarkSettings;

    /**
     * Creates an instance of OutputProperties class.
     */
    public OutputProperties() {
    }

    /**
     * Get the datasource property: Describes the data source that output will be written to. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @return the datasource value.
     */
    public OutputDataSource datasource() {
        return this.datasource;
    }

    /**
     * Set the datasource property: Describes the data source that output will be written to. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @param datasource the datasource value to set.
     * @return the OutputProperties object itself.
     */
    public OutputProperties withDatasource(OutputDataSource datasource) {
        this.datasource = datasource;
        return this;
    }

    /**
     * Get the timeWindow property: The time frame for filtering Stream Analytics job outputs.
     * 
     * @return the timeWindow value.
     */
    public String timeWindow() {
        return this.timeWindow;
    }

    /**
     * Set the timeWindow property: The time frame for filtering Stream Analytics job outputs.
     * 
     * @param timeWindow the timeWindow value to set.
     * @return the OutputProperties object itself.
     */
    public OutputProperties withTimeWindow(String timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }

    /**
     * Get the sizeWindow property: The size window to constrain a Stream Analytics output to.
     * 
     * @return the sizeWindow value.
     */
    public Integer sizeWindow() {
        return this.sizeWindow;
    }

    /**
     * Set the sizeWindow property: The size window to constrain a Stream Analytics output to.
     * 
     * @param sizeWindow the sizeWindow value to set.
     * @return the OutputProperties object itself.
     */
    public OutputProperties withSizeWindow(Integer sizeWindow) {
        this.sizeWindow = sizeWindow;
        return this;
    }

    /**
     * Get the serialization property: Describes how data from an input is serialized or how data is serialized when
     * written to an output. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the serialization value.
     */
    public Serialization serialization() {
        return this.serialization;
    }

    /**
     * Set the serialization property: Describes how data from an input is serialized or how data is serialized when
     * written to an output. Required on PUT (CreateOrReplace) requests.
     * 
     * @param serialization the serialization value to set.
     * @return the OutputProperties object itself.
     */
    public OutputProperties withSerialization(Serialization serialization) {
        this.serialization = serialization;
        return this;
    }

    /**
     * Get the diagnostics property: Describes conditions applicable to the Input, Output, or the job overall, that
     * warrant customer attention.
     * 
     * @return the diagnostics value.
     */
    public Diagnostics diagnostics() {
        return this.diagnostics;
    }

    /**
     * Get the etag property: The current entity tag for the output. This is an opaque string. You can use it to detect
     * whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers
     * for write operations for optimistic concurrency.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the lastOutputEventTimestamps property: A list of the last output event times for each output partition. The
     * index of the array corresponds to the partition number.
     * 
     * @return the lastOutputEventTimestamps value.
     */
    public List<LastOutputEventTimestamp> lastOutputEventTimestamps() {
        return this.lastOutputEventTimestamps;
    }

    /**
     * Get the watermarkSettings property: Settings which determine whether to send watermarks to downstream.
     * 
     * @return the watermarkSettings value.
     */
    public OutputWatermarkProperties watermarkSettings() {
        return this.watermarkSettings;
    }

    /**
     * Set the watermarkSettings property: Settings which determine whether to send watermarks to downstream.
     * 
     * @param watermarkSettings the watermarkSettings value to set.
     * @return the OutputProperties object itself.
     */
    public OutputProperties withWatermarkSettings(OutputWatermarkProperties watermarkSettings) {
        this.watermarkSettings = watermarkSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (datasource() != null) {
            datasource().validate();
        }
        if (serialization() != null) {
            serialization().validate();
        }
        if (diagnostics() != null) {
            diagnostics().validate();
        }
        if (lastOutputEventTimestamps() != null) {
            lastOutputEventTimestamps().forEach(e -> e.validate());
        }
        if (watermarkSettings() != null) {
            watermarkSettings().validate();
        }
    }
}
