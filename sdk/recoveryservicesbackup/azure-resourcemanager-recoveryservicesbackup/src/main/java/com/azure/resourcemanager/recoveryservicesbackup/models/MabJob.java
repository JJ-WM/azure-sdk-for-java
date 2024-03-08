// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * MAB workload-specific job.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobType")
@JsonTypeName("MabJob")
@Fluent
public final class MabJob extends Job {
    /*
     * Time taken by job to run.
     */
    @JsonProperty(value = "duration")
    private Duration duration;

    /*
     * The state/actions applicable on jobs like cancel/retry.
     */
    @JsonProperty(value = "actionsInfo")
    private List<JobSupportedAction> actionsInfo;

    /*
     * Name of server protecting the DS.
     */
    @JsonProperty(value = "mabServerName")
    private String mabServerName;

    /*
     * Server type of MAB container.
     */
    @JsonProperty(value = "mabServerType")
    private MabServerType mabServerType;

    /*
     * Workload type of backup item.
     */
    @JsonProperty(value = "workloadType")
    private WorkloadType workloadType;

    /*
     * The errors.
     */
    @JsonProperty(value = "errorDetails")
    private List<MabErrorInfo> errorDetails;

    /*
     * Additional information on the job.
     */
    @JsonProperty(value = "extendedInfo")
    private MabJobExtendedInfo extendedInfo;

    /**
     * Creates an instance of MabJob class.
     */
    public MabJob() {
    }

    /**
     * Get the duration property: Time taken by job to run.
     * 
     * @return the duration value.
     */
    public Duration duration() {
        return this.duration;
    }

    /**
     * Set the duration property: Time taken by job to run.
     * 
     * @param duration the duration value to set.
     * @return the MabJob object itself.
     */
    public MabJob withDuration(Duration duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the actionsInfo property: The state/actions applicable on jobs like cancel/retry.
     * 
     * @return the actionsInfo value.
     */
    public List<JobSupportedAction> actionsInfo() {
        return this.actionsInfo;
    }

    /**
     * Set the actionsInfo property: The state/actions applicable on jobs like cancel/retry.
     * 
     * @param actionsInfo the actionsInfo value to set.
     * @return the MabJob object itself.
     */
    public MabJob withActionsInfo(List<JobSupportedAction> actionsInfo) {
        this.actionsInfo = actionsInfo;
        return this;
    }

    /**
     * Get the mabServerName property: Name of server protecting the DS.
     * 
     * @return the mabServerName value.
     */
    public String mabServerName() {
        return this.mabServerName;
    }

    /**
     * Set the mabServerName property: Name of server protecting the DS.
     * 
     * @param mabServerName the mabServerName value to set.
     * @return the MabJob object itself.
     */
    public MabJob withMabServerName(String mabServerName) {
        this.mabServerName = mabServerName;
        return this;
    }

    /**
     * Get the mabServerType property: Server type of MAB container.
     * 
     * @return the mabServerType value.
     */
    public MabServerType mabServerType() {
        return this.mabServerType;
    }

    /**
     * Set the mabServerType property: Server type of MAB container.
     * 
     * @param mabServerType the mabServerType value to set.
     * @return the MabJob object itself.
     */
    public MabJob withMabServerType(MabServerType mabServerType) {
        this.mabServerType = mabServerType;
        return this;
    }

    /**
     * Get the workloadType property: Workload type of backup item.
     * 
     * @return the workloadType value.
     */
    public WorkloadType workloadType() {
        return this.workloadType;
    }

    /**
     * Set the workloadType property: Workload type of backup item.
     * 
     * @param workloadType the workloadType value to set.
     * @return the MabJob object itself.
     */
    public MabJob withWorkloadType(WorkloadType workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * Get the errorDetails property: The errors.
     * 
     * @return the errorDetails value.
     */
    public List<MabErrorInfo> errorDetails() {
        return this.errorDetails;
    }

    /**
     * Set the errorDetails property: The errors.
     * 
     * @param errorDetails the errorDetails value to set.
     * @return the MabJob object itself.
     */
    public MabJob withErrorDetails(List<MabErrorInfo> errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    /**
     * Get the extendedInfo property: Additional information on the job.
     * 
     * @return the extendedInfo value.
     */
    public MabJobExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set the extendedInfo property: Additional information on the job.
     * 
     * @param extendedInfo the extendedInfo value to set.
     * @return the MabJob object itself.
     */
    public MabJob withExtendedInfo(MabJobExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MabJob withEntityFriendlyName(String entityFriendlyName) {
        super.withEntityFriendlyName(entityFriendlyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MabJob withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MabJob withOperation(String operation) {
        super.withOperation(operation);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MabJob withStatus(String status) {
        super.withStatus(status);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MabJob withStartTime(OffsetDateTime startTime) {
        super.withStartTime(startTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MabJob withEndTime(OffsetDateTime endTime) {
        super.withEndTime(endTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MabJob withActivityId(String activityId) {
        super.withActivityId(activityId);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (errorDetails() != null) {
            errorDetails().forEach(e -> e.validate());
        }
        if (extendedInfo() != null) {
            extendedInfo().validate();
        }
    }
}
