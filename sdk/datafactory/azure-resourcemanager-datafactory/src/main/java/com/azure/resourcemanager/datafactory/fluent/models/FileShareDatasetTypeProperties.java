// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetStorageFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * On-premises file system dataset properties.
 */
@Fluent
public final class FileShareDatasetTypeProperties {
    /*
     * The path of the on-premises file system. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "folderPath")
    private Object folderPath;

    /*
     * The name of the on-premises file system. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "fileName")
    private Object fileName;

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

    /*
     * The format of the files.
     */
    @JsonProperty(value = "format")
    private DatasetStorageFormat format;

    /*
     * Specify a filter to be used to select a subset of files in the folderPath rather than all files. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "fileFilter")
    private Object fileFilter;

    /*
     * The data compression method used for the file system.
     */
    @JsonProperty(value = "compression")
    private DatasetCompression compression;

    /**
     * Creates an instance of FileShareDatasetTypeProperties class.
     */
    public FileShareDatasetTypeProperties() {
    }

    /**
     * Get the folderPath property: The path of the on-premises file system. Type: string (or Expression with resultType
     * string).
     * 
     * @return the folderPath value.
     */
    public Object folderPath() {
        return this.folderPath;
    }

    /**
     * Set the folderPath property: The path of the on-premises file system. Type: string (or Expression with resultType
     * string).
     * 
     * @param folderPath the folderPath value to set.
     * @return the FileShareDatasetTypeProperties object itself.
     */
    public FileShareDatasetTypeProperties withFolderPath(Object folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the fileName property: The name of the on-premises file system. Type: string (or Expression with resultType
     * string).
     * 
     * @return the fileName value.
     */
    public Object fileName() {
        return this.fileName;
    }

    /**
     * Set the fileName property: The name of the on-premises file system. Type: string (or Expression with resultType
     * string).
     * 
     * @param fileName the fileName value to set.
     * @return the FileShareDatasetTypeProperties object itself.
     */
    public FileShareDatasetTypeProperties withFileName(Object fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @return the modifiedDatetimeStart value.
     */
    public Object modifiedDatetimeStart() {
        return this.modifiedDatetimeStart;
    }

    /**
     * Set the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set.
     * @return the FileShareDatasetTypeProperties object itself.
     */
    public FileShareDatasetTypeProperties withModifiedDatetimeStart(Object modifiedDatetimeStart) {
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        return this;
    }

    /**
     * Get the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @return the modifiedDatetimeEnd value.
     */
    public Object modifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd;
    }

    /**
     * Set the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set.
     * @return the FileShareDatasetTypeProperties object itself.
     */
    public FileShareDatasetTypeProperties withModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        return this;
    }

    /**
     * Get the format property: The format of the files.
     * 
     * @return the format value.
     */
    public DatasetStorageFormat format() {
        return this.format;
    }

    /**
     * Set the format property: The format of the files.
     * 
     * @param format the format value to set.
     * @return the FileShareDatasetTypeProperties object itself.
     */
    public FileShareDatasetTypeProperties withFormat(DatasetStorageFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the fileFilter property: Specify a filter to be used to select a subset of files in the folderPath rather
     * than all files. Type: string (or Expression with resultType string).
     * 
     * @return the fileFilter value.
     */
    public Object fileFilter() {
        return this.fileFilter;
    }

    /**
     * Set the fileFilter property: Specify a filter to be used to select a subset of files in the folderPath rather
     * than all files. Type: string (or Expression with resultType string).
     * 
     * @param fileFilter the fileFilter value to set.
     * @return the FileShareDatasetTypeProperties object itself.
     */
    public FileShareDatasetTypeProperties withFileFilter(Object fileFilter) {
        this.fileFilter = fileFilter;
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the file system.
     * 
     * @return the compression value.
     */
    public DatasetCompression compression() {
        return this.compression;
    }

    /**
     * Set the compression property: The data compression method used for the file system.
     * 
     * @param compression the compression value to set.
     * @return the FileShareDatasetTypeProperties object itself.
     */
    public FileShareDatasetTypeProperties withCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (format() != null) {
            format().validate();
        }
        if (compression() != null) {
            compression().validate();
        }
    }
}
