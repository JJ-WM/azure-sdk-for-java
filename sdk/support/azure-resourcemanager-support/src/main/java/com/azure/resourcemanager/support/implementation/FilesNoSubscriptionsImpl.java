// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.support.fluent.FilesNoSubscriptionsClient;
import com.azure.resourcemanager.support.fluent.models.FileDetailsInner;
import com.azure.resourcemanager.support.models.FileDetails;
import com.azure.resourcemanager.support.models.FilesNoSubscriptions;
import com.azure.resourcemanager.support.models.UploadFile;

public final class FilesNoSubscriptionsImpl implements FilesNoSubscriptions {
    private static final ClientLogger LOGGER = new ClientLogger(FilesNoSubscriptionsImpl.class);

    private final FilesNoSubscriptionsClient innerClient;

    private final com.azure.resourcemanager.support.SupportManager serviceManager;

    public FilesNoSubscriptionsImpl(FilesNoSubscriptionsClient innerClient,
        com.azure.resourcemanager.support.SupportManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<FileDetails> list(String fileWorkspaceName) {
        PagedIterable<FileDetailsInner> inner = this.serviceClient().list(fileWorkspaceName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FileDetailsImpl(inner1, this.manager()));
    }

    public PagedIterable<FileDetails> list(String fileWorkspaceName, Context context) {
        PagedIterable<FileDetailsInner> inner = this.serviceClient().list(fileWorkspaceName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FileDetailsImpl(inner1, this.manager()));
    }

    public Response<FileDetails> getWithResponse(String fileWorkspaceName, String fileName, Context context) {
        Response<FileDetailsInner> inner = this.serviceClient().getWithResponse(fileWorkspaceName, fileName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new FileDetailsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public FileDetails get(String fileWorkspaceName, String fileName) {
        FileDetailsInner inner = this.serviceClient().get(fileWorkspaceName, fileName);
        if (inner != null) {
            return new FileDetailsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<FileDetails> createWithResponse(String fileWorkspaceName, String fileName,
        FileDetailsInner createFileParameters, Context context) {
        Response<FileDetailsInner> inner
            = this.serviceClient().createWithResponse(fileWorkspaceName, fileName, createFileParameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new FileDetailsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public FileDetails create(String fileWorkspaceName, String fileName, FileDetailsInner createFileParameters) {
        FileDetailsInner inner = this.serviceClient().create(fileWorkspaceName, fileName, createFileParameters);
        if (inner != null) {
            return new FileDetailsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> uploadWithResponse(String fileWorkspaceName, String fileName, UploadFile uploadFile,
        Context context) {
        return this.serviceClient().uploadWithResponse(fileWorkspaceName, fileName, uploadFile, context);
    }

    public void upload(String fileWorkspaceName, String fileName, UploadFile uploadFile) {
        this.serviceClient().upload(fileWorkspaceName, fileName, uploadFile);
    }

    private FilesNoSubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.support.SupportManager manager() {
        return this.serviceManager;
    }
}
