// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * Full backup operation.
 */
@Fluent
public final class FullBackupOperation implements JsonSerializable<FullBackupOperation> {
    /*
     * Status of the backup operation.
     */
    private String status;

    /*
     * The status details of backup operation.
     */
    private String statusDetails;

    /*
     * Error encountered, if any, during the full backup operation.
     */
    private Error error;

    /*
     * The start time of the backup operation in UTC
     */
    private Long startTime;

    /*
     * The end time of the backup operation in UTC
     */
    private Long endTime;

    /*
     * Identifier for the full backup operation.
     */
    private String jobId;

    /*
     * The Azure blob storage container Uri which contains the full backup
     */
    private String azureStorageBlobContainerUri;

    /**
     * Creates an instance of FullBackupOperation class.
     */
    public FullBackupOperation() {
    }

    /**
     * Get the status property: Status of the backup operation.
     * 
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Status of the backup operation.
     * 
     * @param status the status value to set.
     * @return the FullBackupOperation object itself.
     */
    public FullBackupOperation setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the statusDetails property: The status details of backup operation.
     * 
     * @return the statusDetails value.
     */
    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * Set the statusDetails property: The status details of backup operation.
     * 
     * @param statusDetails the statusDetails value to set.
     * @return the FullBackupOperation object itself.
     */
    public FullBackupOperation setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * Get the error property: Error encountered, if any, during the full backup operation.
     * 
     * @return the error value.
     */
    public Error getError() {
        return this.error;
    }

    /**
     * Set the error property: Error encountered, if any, during the full backup operation.
     * 
     * @param error the error value to set.
     * @return the FullBackupOperation object itself.
     */
    public FullBackupOperation setError(Error error) {
        this.error = error;
        return this;
    }

    /**
     * Get the startTime property: The start time of the backup operation in UTC.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        if (this.startTime == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.startTime), ZoneOffset.UTC);
    }

    /**
     * Set the startTime property: The start time of the backup operation in UTC.
     * 
     * @param startTime the startTime value to set.
     * @return the FullBackupOperation object itself.
     */
    public FullBackupOperation setStartTime(OffsetDateTime startTime) {
        if (startTime == null) {
            this.startTime = null;
        } else {
            this.startTime = startTime.toEpochSecond();
        }
        return this;
    }

    /**
     * Get the endTime property: The end time of the backup operation in UTC.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime getEndTime() {
        if (this.endTime == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.endTime), ZoneOffset.UTC);
    }

    /**
     * Set the endTime property: The end time of the backup operation in UTC.
     * 
     * @param endTime the endTime value to set.
     * @return the FullBackupOperation object itself.
     */
    public FullBackupOperation setEndTime(OffsetDateTime endTime) {
        if (endTime == null) {
            this.endTime = null;
        } else {
            this.endTime = endTime.toEpochSecond();
        }
        return this;
    }

    /**
     * Get the jobId property: Identifier for the full backup operation.
     * 
     * @return the jobId value.
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Set the jobId property: Identifier for the full backup operation.
     * 
     * @param jobId the jobId value to set.
     * @return the FullBackupOperation object itself.
     */
    public FullBackupOperation setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get the azureStorageBlobContainerUri property: The Azure blob storage container Uri which contains the full
     * backup.
     * 
     * @return the azureStorageBlobContainerUri value.
     */
    public String getAzureStorageBlobContainerUri() {
        return this.azureStorageBlobContainerUri;
    }

    /**
     * Set the azureStorageBlobContainerUri property: The Azure blob storage container Uri which contains the full
     * backup.
     * 
     * @param azureStorageBlobContainerUri the azureStorageBlobContainerUri value to set.
     * @return the FullBackupOperation object itself.
     */
    public FullBackupOperation setAzureStorageBlobContainerUri(String azureStorageBlobContainerUri) {
        this.azureStorageBlobContainerUri = azureStorageBlobContainerUri;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("status", this.status);
        jsonWriter.writeStringField("statusDetails", this.statusDetails);
        jsonWriter.writeJsonField("error", this.error);
        jsonWriter.writeNumberField("startTime", this.startTime);
        jsonWriter.writeNumberField("endTime", this.endTime);
        jsonWriter.writeStringField("jobId", this.jobId);
        jsonWriter.writeStringField("azureStorageBlobContainerUri", this.azureStorageBlobContainerUri);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FullBackupOperation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FullBackupOperation if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the FullBackupOperation.
     */
    public static FullBackupOperation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FullBackupOperation deserializedFullBackupOperation = new FullBackupOperation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedFullBackupOperation.status = reader.getString();
                } else if ("statusDetails".equals(fieldName)) {
                    deserializedFullBackupOperation.statusDetails = reader.getString();
                } else if ("error".equals(fieldName)) {
                    deserializedFullBackupOperation.error = Error.fromJson(reader);
                } else if ("startTime".equals(fieldName)) {
                    deserializedFullBackupOperation.startTime = reader.getNullable(JsonReader::getLong);
                } else if ("endTime".equals(fieldName)) {
                    deserializedFullBackupOperation.endTime = reader.getNullable(JsonReader::getLong);
                } else if ("jobId".equals(fieldName)) {
                    deserializedFullBackupOperation.jobId = reader.getString();
                } else if ("azureStorageBlobContainerUri".equals(fieldName)) {
                    deserializedFullBackupOperation.azureStorageBlobContainerUri = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFullBackupOperation;
        });
    }
}
