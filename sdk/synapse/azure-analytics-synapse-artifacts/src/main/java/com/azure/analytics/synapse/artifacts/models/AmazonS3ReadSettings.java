// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Azure data lake store read settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AmazonS3ReadSettings")
@Fluent
public final class AmazonS3ReadSettings extends StoreReadSettings {
    /*
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression
     * with resultType boolean).
     */
    @JsonProperty(value = "recursive")
    private Object recursive;

    /*
     * AmazonS3 wildcardFolderPath. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "wildcardFolderPath")
    private Object wildcardFolderPath;

    /*
     * AmazonS3 wildcardFileName. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "wildcardFileName")
    private Object wildcardFileName;

    /*
     * The prefix filter for the S3 object name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "prefix")
    private Object prefix;

    /*
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to
     * copy. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "fileListPath")
    private Object fileListPath;

    /*
     * Indicates whether to enable partition discovery. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "enablePartitionDiscovery")
    private Object enablePartitionDiscovery;

    /*
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "partitionRootPath")
    private Object partitionRootPath;

    /*
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or
     * Expression with resultType boolean).
     */
    @JsonProperty(value = "deleteFilesAfterCompletion")
    private Object deleteFilesAfterCompletion;

    /*
     * The start of file's modified datetime. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "modifiedDatetimeStart")
    private Object modifiedDatetimeStart;

    /*
     * The end of file's modified datetime. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "modifiedDatetimeEnd")
    private Object modifiedDatetimeEnd;

    /**
     * Creates an instance of AmazonS3ReadSettings class.
     */
    public AmazonS3ReadSettings() {
    }

    /**
     * Get the recursive property: If true, files under the folder path will be read recursively. Default is true.
     * Type: boolean (or Expression with resultType boolean).
     * 
     * @return the recursive value.
     */
    public Object getRecursive() {
        return this.recursive;
    }

    /**
     * Set the recursive property: If true, files under the folder path will be read recursively. Default is true.
     * Type: boolean (or Expression with resultType boolean).
     * 
     * @param recursive the recursive value to set.
     * @return the AmazonS3ReadSettings object itself.
     */
    public AmazonS3ReadSettings setRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * Get the wildcardFolderPath property: AmazonS3 wildcardFolderPath. Type: string (or Expression with resultType
     * string).
     * 
     * @return the wildcardFolderPath value.
     */
    public Object getWildcardFolderPath() {
        return this.wildcardFolderPath;
    }

    /**
     * Set the wildcardFolderPath property: AmazonS3 wildcardFolderPath. Type: string (or Expression with resultType
     * string).
     * 
     * @param wildcardFolderPath the wildcardFolderPath value to set.
     * @return the AmazonS3ReadSettings object itself.
     */
    public AmazonS3ReadSettings setWildcardFolderPath(Object wildcardFolderPath) {
        this.wildcardFolderPath = wildcardFolderPath;
        return this;
    }

    /**
     * Get the wildcardFileName property: AmazonS3 wildcardFileName. Type: string (or Expression with resultType
     * string).
     * 
     * @return the wildcardFileName value.
     */
    public Object getWildcardFileName() {
        return this.wildcardFileName;
    }

    /**
     * Set the wildcardFileName property: AmazonS3 wildcardFileName. Type: string (or Expression with resultType
     * string).
     * 
     * @param wildcardFileName the wildcardFileName value to set.
     * @return the AmazonS3ReadSettings object itself.
     */
    public AmazonS3ReadSettings setWildcardFileName(Object wildcardFileName) {
        this.wildcardFileName = wildcardFileName;
        return this;
    }

    /**
     * Get the prefix property: The prefix filter for the S3 object name. Type: string (or Expression with resultType
     * string).
     * 
     * @return the prefix value.
     */
    public Object getPrefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: The prefix filter for the S3 object name. Type: string (or Expression with resultType
     * string).
     * 
     * @param prefix the prefix value to set.
     * @return the AmazonS3ReadSettings object itself.
     */
    public AmazonS3ReadSettings setPrefix(Object prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the fileListPath property: Point to a text file that lists each file (relative path to the path configured
     * in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     * @return the fileListPath value.
     */
    public Object getFileListPath() {
        return this.fileListPath;
    }

    /**
     * Set the fileListPath property: Point to a text file that lists each file (relative path to the path configured
     * in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     * @param fileListPath the fileListPath value to set.
     * @return the AmazonS3ReadSettings object itself.
     */
    public AmazonS3ReadSettings setFileListPath(Object fileListPath) {
        this.fileListPath = fileListPath;
        return this;
    }

    /**
     * Get the enablePartitionDiscovery property: Indicates whether to enable partition discovery. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @return the enablePartitionDiscovery value.
     */
    public Object getEnablePartitionDiscovery() {
        return this.enablePartitionDiscovery;
    }

    /**
     * Set the enablePartitionDiscovery property: Indicates whether to enable partition discovery. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @param enablePartitionDiscovery the enablePartitionDiscovery value to set.
     * @return the AmazonS3ReadSettings object itself.
     */
    public AmazonS3ReadSettings setEnablePartitionDiscovery(Object enablePartitionDiscovery) {
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        return this;
    }

    /**
     * Get the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string
     * (or Expression with resultType string).
     * 
     * @return the partitionRootPath value.
     */
    public Object getPartitionRootPath() {
        return this.partitionRootPath;
    }

    /**
     * Set the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string
     * (or Expression with resultType string).
     * 
     * @param partitionRootPath the partitionRootPath value to set.
     * @return the AmazonS3ReadSettings object itself.
     */
    public AmazonS3ReadSettings setPartitionRootPath(Object partitionRootPath) {
        this.partitionRootPath = partitionRootPath;
        return this;
    }

    /**
     * Get the deleteFilesAfterCompletion property: Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the deleteFilesAfterCompletion value.
     */
    public Object getDeleteFilesAfterCompletion() {
        return this.deleteFilesAfterCompletion;
    }

    /**
     * Set the deleteFilesAfterCompletion property: Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @param deleteFilesAfterCompletion the deleteFilesAfterCompletion value to set.
     * @return the AmazonS3ReadSettings object itself.
     */
    public AmazonS3ReadSettings setDeleteFilesAfterCompletion(Object deleteFilesAfterCompletion) {
        this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
        return this;
    }

    /**
     * Get the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @return the modifiedDatetimeStart value.
     */
    public Object getModifiedDatetimeStart() {
        return this.modifiedDatetimeStart;
    }

    /**
     * Set the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set.
     * @return the AmazonS3ReadSettings object itself.
     */
    public AmazonS3ReadSettings setModifiedDatetimeStart(Object modifiedDatetimeStart) {
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        return this;
    }

    /**
     * Get the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @return the modifiedDatetimeEnd value.
     */
    public Object getModifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd;
    }

    /**
     * Set the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set.
     * @return the AmazonS3ReadSettings object itself.
     */
    public AmazonS3ReadSettings setModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmazonS3ReadSettings setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
