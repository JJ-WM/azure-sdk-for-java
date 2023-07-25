// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** AzureBackup Job Class. */
@Fluent
public final class AzureBackupJob {
    /*
     * Job Activity Id
     */
    @JsonProperty(value = "activityID", required = true)
    private String activityId;

    /*
     * Name of the Backup Instance
     */
    @JsonProperty(value = "backupInstanceFriendlyName", required = true)
    private String backupInstanceFriendlyName;

    /*
     * ARM ID of the Backup Instance
     */
    @JsonProperty(value = "backupInstanceId", access = JsonProperty.Access.WRITE_ONLY)
    private String backupInstanceId;

    /*
     * ARM ID of the DataSource
     */
    @JsonProperty(value = "dataSourceId", required = true)
    private String dataSourceId;

    /*
     * Location of the DataSource
     */
    @JsonProperty(value = "dataSourceLocation", required = true)
    private String dataSourceLocation;

    /*
     * User Friendly Name of the DataSource
     */
    @JsonProperty(value = "dataSourceName", required = true)
    private String dataSourceName;

    /*
     * Data Source Set Name of the DataSource
     */
    @JsonProperty(value = "dataSourceSetName")
    private String dataSourceSetName;

    /*
     * Type of DataSource
     */
    @JsonProperty(value = "dataSourceType", required = true)
    private String dataSourceType;

    /*
     * Total run time of the job. ISO 8601 format.
     */
    @JsonProperty(value = "duration")
    private String duration;

    /*
     * EndTime of the job(in UTC)
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /*
     * A List, detailing the errors related to the job
     */
    @JsonProperty(value = "errorDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<UserFacingError> errorDetails;

    /*
     * Extended Information about the job
     */
    @JsonProperty(value = "extendedInfo", access = JsonProperty.Access.WRITE_ONLY)
    private JobExtendedInfo extendedInfo;

    /*
     * Indicated that whether the job is adhoc(true) or scheduled(false)
     */
    @JsonProperty(value = "isUserTriggered", required = true)
    private boolean isUserTriggered;

    /*
     * It indicates the type of Job i.e. Backup:full/log/diff ;Restore:ALR/OLR; Tiering:Backup/Archive ;
     * Management:ConfigureProtection/UnConfigure
     */
    @JsonProperty(value = "operation", required = true)
    private String operation;

    /*
     * It indicates the type of Job i.e. Backup/Restore/Tiering/Management
     */
    @JsonProperty(value = "operationCategory", required = true)
    private String operationCategory;

    /*
     * ARM ID of the policy
     */
    @JsonProperty(value = "policyId", access = JsonProperty.Access.WRITE_ONLY)
    private String policyId;

    /*
     * Name of the policy
     */
    @JsonProperty(value = "policyName", access = JsonProperty.Access.WRITE_ONLY)
    private String policyName;

    /*
     * Indicated whether progress is enabled for the job
     */
    @JsonProperty(value = "progressEnabled", required = true)
    private boolean progressEnabled;

    /*
     * Url which contains job's progress
     */
    @JsonProperty(value = "progressUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String progressUrl;

    /*
     * Priority to be used for rehydration
     */
    @JsonProperty(value = "rehydrationPriority", access = JsonProperty.Access.WRITE_ONLY)
    private String rehydrationPriority;

    /*
     * It indicates the sub type of operation i.e. in case of Restore it can be ALR/OLR
     */
    @JsonProperty(value = "restoreType", access = JsonProperty.Access.WRITE_ONLY)
    private String restoreType;

    /*
     * Resource Group Name of the Datasource
     */
    @JsonProperty(value = "sourceResourceGroup", required = true)
    private String sourceResourceGroup;

    /*
     * SubscriptionId corresponding to the DataSource
     */
    @JsonProperty(value = "sourceSubscriptionID", required = true)
    private String sourceSubscriptionId;

    /*
     * StartTime of the job(in UTC)
     */
    @JsonProperty(value = "startTime", required = true)
    private OffsetDateTime startTime;

    /*
     * Status of the job like InProgress/Success/Failed/Cancelled/SuccessWithWarning
     */
    @JsonProperty(value = "status", required = true)
    private String status;

    /*
     * Subscription Id of the corresponding backup vault
     */
    @JsonProperty(value = "subscriptionId", required = true)
    private String subscriptionId;

    /*
     * List of supported actions
     */
    @JsonProperty(value = "supportedActions", required = true)
    private List<String> supportedActions;

    /*
     * Name of the vault
     */
    @JsonProperty(value = "vaultName", required = true)
    private String vaultName;

    /*
     * The etag property.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * The sourceDataStoreName property.
     */
    @JsonProperty(value = "sourceDataStoreName")
    private String sourceDataStoreName;

    /*
     * The destinationDataStoreName property.
     */
    @JsonProperty(value = "destinationDataStoreName")
    private String destinationDataStoreName;

    /** Creates an instance of AzureBackupJob class. */
    public AzureBackupJob() {
    }

    /**
     * Get the activityId property: Job Activity Id.
     *
     * @return the activityId value.
     */
    public String activityId() {
        return this.activityId;
    }

    /**
     * Set the activityId property: Job Activity Id.
     *
     * @param activityId the activityId value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    /**
     * Get the backupInstanceFriendlyName property: Name of the Backup Instance.
     *
     * @return the backupInstanceFriendlyName value.
     */
    public String backupInstanceFriendlyName() {
        return this.backupInstanceFriendlyName;
    }

    /**
     * Set the backupInstanceFriendlyName property: Name of the Backup Instance.
     *
     * @param backupInstanceFriendlyName the backupInstanceFriendlyName value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withBackupInstanceFriendlyName(String backupInstanceFriendlyName) {
        this.backupInstanceFriendlyName = backupInstanceFriendlyName;
        return this;
    }

    /**
     * Get the backupInstanceId property: ARM ID of the Backup Instance.
     *
     * @return the backupInstanceId value.
     */
    public String backupInstanceId() {
        return this.backupInstanceId;
    }

    /**
     * Get the dataSourceId property: ARM ID of the DataSource.
     *
     * @return the dataSourceId value.
     */
    public String dataSourceId() {
        return this.dataSourceId;
    }

    /**
     * Set the dataSourceId property: ARM ID of the DataSource.
     *
     * @param dataSourceId the dataSourceId value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * Get the dataSourceLocation property: Location of the DataSource.
     *
     * @return the dataSourceLocation value.
     */
    public String dataSourceLocation() {
        return this.dataSourceLocation;
    }

    /**
     * Set the dataSourceLocation property: Location of the DataSource.
     *
     * @param dataSourceLocation the dataSourceLocation value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withDataSourceLocation(String dataSourceLocation) {
        this.dataSourceLocation = dataSourceLocation;
        return this;
    }

    /**
     * Get the dataSourceName property: User Friendly Name of the DataSource.
     *
     * @return the dataSourceName value.
     */
    public String dataSourceName() {
        return this.dataSourceName;
    }

    /**
     * Set the dataSourceName property: User Friendly Name of the DataSource.
     *
     * @param dataSourceName the dataSourceName value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }

    /**
     * Get the dataSourceSetName property: Data Source Set Name of the DataSource.
     *
     * @return the dataSourceSetName value.
     */
    public String dataSourceSetName() {
        return this.dataSourceSetName;
    }

    /**
     * Set the dataSourceSetName property: Data Source Set Name of the DataSource.
     *
     * @param dataSourceSetName the dataSourceSetName value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withDataSourceSetName(String dataSourceSetName) {
        this.dataSourceSetName = dataSourceSetName;
        return this;
    }

    /**
     * Get the dataSourceType property: Type of DataSource.
     *
     * @return the dataSourceType value.
     */
    public String dataSourceType() {
        return this.dataSourceType;
    }

    /**
     * Set the dataSourceType property: Type of DataSource.
     *
     * @param dataSourceType the dataSourceType value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }

    /**
     * Get the duration property: Total run time of the job. ISO 8601 format.
     *
     * @return the duration value.
     */
    public String duration() {
        return this.duration;
    }

    /**
     * Set the duration property: Total run time of the job. ISO 8601 format.
     *
     * @param duration the duration value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the endTime property: EndTime of the job(in UTC).
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the errorDetails property: A List, detailing the errors related to the job.
     *
     * @return the errorDetails value.
     */
    public List<UserFacingError> errorDetails() {
        return this.errorDetails;
    }

    /**
     * Get the extendedInfo property: Extended Information about the job.
     *
     * @return the extendedInfo value.
     */
    public JobExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Get the isUserTriggered property: Indicated that whether the job is adhoc(true) or scheduled(false).
     *
     * @return the isUserTriggered value.
     */
    public boolean isUserTriggered() {
        return this.isUserTriggered;
    }

    /**
     * Set the isUserTriggered property: Indicated that whether the job is adhoc(true) or scheduled(false).
     *
     * @param isUserTriggered the isUserTriggered value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withIsUserTriggered(boolean isUserTriggered) {
        this.isUserTriggered = isUserTriggered;
        return this;
    }

    /**
     * Get the operation property: It indicates the type of Job i.e. Backup:full/log/diff ;Restore:ALR/OLR;
     * Tiering:Backup/Archive ; Management:ConfigureProtection/UnConfigure.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: It indicates the type of Job i.e. Backup:full/log/diff ;Restore:ALR/OLR;
     * Tiering:Backup/Archive ; Management:ConfigureProtection/UnConfigure.
     *
     * @param operation the operation value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the operationCategory property: It indicates the type of Job i.e. Backup/Restore/Tiering/Management.
     *
     * @return the operationCategory value.
     */
    public String operationCategory() {
        return this.operationCategory;
    }

    /**
     * Set the operationCategory property: It indicates the type of Job i.e. Backup/Restore/Tiering/Management.
     *
     * @param operationCategory the operationCategory value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withOperationCategory(String operationCategory) {
        this.operationCategory = operationCategory;
        return this;
    }

    /**
     * Get the policyId property: ARM ID of the policy.
     *
     * @return the policyId value.
     */
    public String policyId() {
        return this.policyId;
    }

    /**
     * Get the policyName property: Name of the policy.
     *
     * @return the policyName value.
     */
    public String policyName() {
        return this.policyName;
    }

    /**
     * Get the progressEnabled property: Indicated whether progress is enabled for the job.
     *
     * @return the progressEnabled value.
     */
    public boolean progressEnabled() {
        return this.progressEnabled;
    }

    /**
     * Set the progressEnabled property: Indicated whether progress is enabled for the job.
     *
     * @param progressEnabled the progressEnabled value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withProgressEnabled(boolean progressEnabled) {
        this.progressEnabled = progressEnabled;
        return this;
    }

    /**
     * Get the progressUrl property: Url which contains job's progress.
     *
     * @return the progressUrl value.
     */
    public String progressUrl() {
        return this.progressUrl;
    }

    /**
     * Get the rehydrationPriority property: Priority to be used for rehydration.
     *
     * @return the rehydrationPriority value.
     */
    public String rehydrationPriority() {
        return this.rehydrationPriority;
    }

    /**
     * Get the restoreType property: It indicates the sub type of operation i.e. in case of Restore it can be ALR/OLR.
     *
     * @return the restoreType value.
     */
    public String restoreType() {
        return this.restoreType;
    }

    /**
     * Get the sourceResourceGroup property: Resource Group Name of the Datasource.
     *
     * @return the sourceResourceGroup value.
     */
    public String sourceResourceGroup() {
        return this.sourceResourceGroup;
    }

    /**
     * Set the sourceResourceGroup property: Resource Group Name of the Datasource.
     *
     * @param sourceResourceGroup the sourceResourceGroup value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withSourceResourceGroup(String sourceResourceGroup) {
        this.sourceResourceGroup = sourceResourceGroup;
        return this;
    }

    /**
     * Get the sourceSubscriptionId property: SubscriptionId corresponding to the DataSource.
     *
     * @return the sourceSubscriptionId value.
     */
    public String sourceSubscriptionId() {
        return this.sourceSubscriptionId;
    }

    /**
     * Set the sourceSubscriptionId property: SubscriptionId corresponding to the DataSource.
     *
     * @param sourceSubscriptionId the sourceSubscriptionId value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withSourceSubscriptionId(String sourceSubscriptionId) {
        this.sourceSubscriptionId = sourceSubscriptionId;
        return this;
    }

    /**
     * Get the startTime property: StartTime of the job(in UTC).
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: StartTime of the job(in UTC).
     *
     * @param startTime the startTime value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the status property: Status of the job like InProgress/Success/Failed/Cancelled/SuccessWithWarning.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the job like InProgress/Success/Failed/Cancelled/SuccessWithWarning.
     *
     * @param status the status value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the subscriptionId property: Subscription Id of the corresponding backup vault.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Subscription Id of the corresponding backup vault.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the supportedActions property: List of supported actions.
     *
     * @return the supportedActions value.
     */
    public List<String> supportedActions() {
        return this.supportedActions;
    }

    /**
     * Set the supportedActions property: List of supported actions.
     *
     * @param supportedActions the supportedActions value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withSupportedActions(List<String> supportedActions) {
        this.supportedActions = supportedActions;
        return this;
    }

    /**
     * Get the vaultName property: Name of the vault.
     *
     * @return the vaultName value.
     */
    public String vaultName() {
        return this.vaultName;
    }

    /**
     * Set the vaultName property: Name of the vault.
     *
     * @param vaultName the vaultName value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * Get the etag property: The etag property.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The etag property.
     *
     * @param etag the etag value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the sourceDataStoreName property: The sourceDataStoreName property.
     *
     * @return the sourceDataStoreName value.
     */
    public String sourceDataStoreName() {
        return this.sourceDataStoreName;
    }

    /**
     * Set the sourceDataStoreName property: The sourceDataStoreName property.
     *
     * @param sourceDataStoreName the sourceDataStoreName value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withSourceDataStoreName(String sourceDataStoreName) {
        this.sourceDataStoreName = sourceDataStoreName;
        return this;
    }

    /**
     * Get the destinationDataStoreName property: The destinationDataStoreName property.
     *
     * @return the destinationDataStoreName value.
     */
    public String destinationDataStoreName() {
        return this.destinationDataStoreName;
    }

    /**
     * Set the destinationDataStoreName property: The destinationDataStoreName property.
     *
     * @param destinationDataStoreName the destinationDataStoreName value to set.
     * @return the AzureBackupJob object itself.
     */
    public AzureBackupJob withDestinationDataStoreName(String destinationDataStoreName) {
        this.destinationDataStoreName = destinationDataStoreName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (activityId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property activityId in model AzureBackupJob"));
        }
        if (backupInstanceFriendlyName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property backupInstanceFriendlyName in model AzureBackupJob"));
        }
        if (dataSourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property dataSourceId in model AzureBackupJob"));
        }
        if (dataSourceLocation() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dataSourceLocation in model AzureBackupJob"));
        }
        if (dataSourceName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property dataSourceName in model AzureBackupJob"));
        }
        if (dataSourceType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property dataSourceType in model AzureBackupJob"));
        }
        if (errorDetails() != null) {
            errorDetails().forEach(e -> e.validate());
        }
        if (extendedInfo() != null) {
            extendedInfo().validate();
        }
        if (operation() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property operation in model AzureBackupJob"));
        }
        if (operationCategory() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property operationCategory in model AzureBackupJob"));
        }
        if (sourceResourceGroup() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceResourceGroup in model AzureBackupJob"));
        }
        if (sourceSubscriptionId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceSubscriptionId in model AzureBackupJob"));
        }
        if (startTime() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property startTime in model AzureBackupJob"));
        }
        if (status() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property status in model AzureBackupJob"));
        }
        if (subscriptionId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property subscriptionId in model AzureBackupJob"));
        }
        if (supportedActions() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property supportedActions in model AzureBackupJob"));
        }
        if (vaultName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property vaultName in model AzureBackupJob"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureBackupJob.class);
}
