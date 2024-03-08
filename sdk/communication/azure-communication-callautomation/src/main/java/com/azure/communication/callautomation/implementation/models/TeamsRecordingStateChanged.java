// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The TeamsRecordingStateChanged model. */
@Fluent
public final class TeamsRecordingStateChanged {
    /*
     * The call recording id
     */
    @JsonProperty(value = "recordingId", access = JsonProperty.Access.WRITE_ONLY)
    private String recordingId;

    /*
     * The state property.
     */
    @JsonProperty(value = "state")
    private RecordingStateInternal state;

    /*
     * The time of the recording started
     */
    @JsonProperty(value = "startDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startDateTime;

    /*
     * The recordingType property.
     */
    @JsonProperty(value = "recordingType")
    private RecordingType recordingType;

    /*
     * Call connection ID.
     */
    @JsonProperty(value = "callConnectionId", access = JsonProperty.Access.WRITE_ONLY)
    private String callConnectionId;

    /*
     * Server call ID.
     */
    @JsonProperty(value = "serverCallId", access = JsonProperty.Access.WRITE_ONLY)
    private String serverCallId;

    /*
     * Correlation ID for event to call correlation. Also called ChainId for
     * skype chain ID.
     */
    @JsonProperty(value = "correlationId", access = JsonProperty.Access.WRITE_ONLY)
    private String correlationId;

    /**
     * Get the recordingId property: The call recording id.
     *
     * @return the recordingId value.
     */
    public String getRecordingId() {
        return this.recordingId;
    }

    /**
     * Get the state property: The state property.
     *
     * @return the state value.
     */
    public RecordingStateInternal getState() {
        return this.state;
    }

    /**
     * Set the state property: The state property.
     *
     * @param state the state value to set.
     * @return the TeamsRecordingStateChanged object itself.
     */
    public TeamsRecordingStateChanged setState(RecordingStateInternal state) {
        this.state = state;
        return this;
    }

    /**
     * Get the startDateTime property: The time of the recording started.
     *
     * @return the startDateTime value.
     */
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * Get the recordingType property: The recordingType property.
     *
     * @return the recordingType value.
     */
    public RecordingType getRecordingType() {
        return this.recordingType;
    }

    /**
     * Set the recordingType property: The recordingType property.
     *
     * @param recordingType the recordingType value to set.
     * @return the TeamsRecordingStateChanged object itself.
     */
    public TeamsRecordingStateChanged setRecordingType(RecordingType recordingType) {
        this.recordingType = recordingType;
        return this;
    }

    /**
     * Get the callConnectionId property: Call connection ID.
     *
     * @return the callConnectionId value.
     */
    public String getCallConnectionId() {
        return this.callConnectionId;
    }

    /**
     * Get the serverCallId property: Server call ID.
     *
     * @return the serverCallId value.
     */
    public String getServerCallId() {
        return this.serverCallId;
    }

    /**
     * Get the correlationId property: Correlation ID for event to call correlation. Also called ChainId for skype chain
     * ID.
     *
     * @return the correlationId value.
     */
    public String getCorrelationId() {
        return this.correlationId;
    }
}
