// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Position and estimated wait time for a job.
 */
@Immutable
public final class RouterJobPositionDetails {

    /*
     * Id of the job these details are about.
     */
    @Generated
    @JsonProperty(value = "jobId")
    private final String jobId;

    /*
     * Position of the job in question within that queue.
     */
    @Generated
    @JsonProperty(value = "position")
    private final int position;

    /*
     * Id of the queue this job is enqueued in.
     */
    @Generated
    @JsonProperty(value = "queueId")
    private final String queueId;

    /*
     * Length of the queue: total number of enqueued jobs.
     */
    @Generated
    @JsonProperty(value = "queueLength")
    private final int queueLength;

    /*
     * Estimated wait time of the job rounded up to the nearest minute.
     */
    @Generated
    @JsonProperty(value = "estimatedWaitTimeMinutes")
    private final double estimatedWaitTimeMinutes;

    /**
     * Creates an instance of RouterJobPositionDetails class.
     *
     * @param jobId the jobId value to set.
     * @param position the position value to set.
     * @param queueId the queueId value to set.
     * @param queueLength the queueLength value to set.
     * @param estimatedWaitTimeMinutes the estimatedWaitTimeMinutes value to set.
     */
    @Generated
    @JsonCreator
    private RouterJobPositionDetails(@JsonProperty(value = "jobId") String jobId,
        @JsonProperty(value = "position") int position, @JsonProperty(value = "queueId") String queueId,
        @JsonProperty(value = "queueLength") int queueLength,
        @JsonProperty(value = "estimatedWaitTimeMinutes") double estimatedWaitTimeMinutes) {
        this.jobId = jobId;
        this.position = position;
        this.queueId = queueId;
        this.queueLength = queueLength;
        this.estimatedWaitTimeMinutes = estimatedWaitTimeMinutes;
    }

    /**
     * Get the jobId property: Id of the job these details are about.
     *
     * @return the jobId value.
     */
    @Generated
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Get the position property: Position of the job in question within that queue.
     *
     * @return the position value.
     */
    @Generated
    public int getPosition() {
        return this.position;
    }

    /**
     * Get the queueId property: Id of the queue this job is enqueued in.
     *
     * @return the queueId value.
     */
    @Generated
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * Get the queueLength property: Length of the queue: total number of enqueued jobs.
     *
     * @return the queueLength value.
     */
    @Generated
    public int getQueueLength() {
        return this.queueLength;
    }

    /**
     * Get the estimatedWaitTimeMinutes property: Estimated wait time of the job rounded up to the nearest minute.
     *
     * @return the estimatedWaitTimeMinutes value.
     */
    @Generated
    public double getEstimatedWaitTimeMinutes() {
        return this.estimatedWaitTimeMinutes;
    }
}
