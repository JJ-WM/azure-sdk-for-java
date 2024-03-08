// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.support.fluent.models.FileDetailsInner;
import com.azure.resourcemanager.support.models.FileDetails;
import com.azure.resourcemanager.support.models.UploadFile;
import java.time.OffsetDateTime;

public final class FileDetailsImpl implements FileDetails, FileDetails.Definition {
    private FileDetailsInner innerObject;

    private final com.azure.resourcemanager.support.SupportManager serviceManager;

    FileDetailsImpl(FileDetailsInner innerObject, com.azure.resourcemanager.support.SupportManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public OffsetDateTime createdOn() {
        return this.innerModel().createdOn();
    }

    public Float chunkSize() {
        return this.innerModel().chunkSize();
    }

    public Float fileSize() {
        return this.innerModel().fileSize();
    }

    public Float numberOfChunks() {
        return this.innerModel().numberOfChunks();
    }

    public FileDetailsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.support.SupportManager manager() {
        return this.serviceManager;
    }

    private String fileWorkspaceName;

    private String fileName;

    public FileDetailsImpl withExistingFileWorkspace(String fileWorkspaceName) {
        this.fileWorkspaceName = fileWorkspaceName;
        return this;
    }

    public FileDetails create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFiles()
                .createWithResponse(fileWorkspaceName, fileName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public FileDetails create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFiles()
                .createWithResponse(fileWorkspaceName, fileName, this.innerModel(), context)
                .getValue();
        return this;
    }

    FileDetailsImpl(String name, com.azure.resourcemanager.support.SupportManager serviceManager) {
        this.innerObject = new FileDetailsInner();
        this.serviceManager = serviceManager;
        this.fileName = name;
    }

    public FileDetails refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFiles()
                .getWithResponse(fileWorkspaceName, fileName, Context.NONE)
                .getValue();
        return this;
    }

    public FileDetails refresh(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getFiles().getWithResponse(fileWorkspaceName, fileName, context).getValue();
        return this;
    }

    public Response<Void> uploadWithResponse(UploadFile uploadFile, Context context) {
        return serviceManager.files().uploadWithResponse(fileWorkspaceName, fileName, uploadFile, context);
    }

    public void upload(UploadFile uploadFile) {
        serviceManager.files().upload(fileWorkspaceName, fileName, uploadFile);
    }

    public FileDetailsImpl withChunkSize(Float chunkSize) {
        this.innerModel().withChunkSize(chunkSize);
        return this;
    }

    public FileDetailsImpl withFileSize(Float fileSize) {
        this.innerModel().withFileSize(fileSize);
        return this;
    }

    public FileDetailsImpl withNumberOfChunks(Float numberOfChunks) {
        this.innerModel().withNumberOfChunks(numberOfChunks);
        return this;
    }
}
