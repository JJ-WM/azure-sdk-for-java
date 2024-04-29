// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeResourceInner;
import com.azure.resourcemanager.datafactory.models.CreateLinkedIntegrationRuntimeRequest;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntime;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeAuthKeys;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeAutoUpdate;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeConnectionInfo;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeMonitoringData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeRegenerateKeyParameters;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeResource;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeStatusResponse;
import com.azure.resourcemanager.datafactory.models.LinkedIntegrationRuntimeRequest;
import com.azure.resourcemanager.datafactory.models.UpdateIntegrationRuntimeRequest;

public final class IntegrationRuntimeResourceImpl
    implements IntegrationRuntimeResource, IntegrationRuntimeResource.Definition, IntegrationRuntimeResource.Update {
    private IntegrationRuntimeResourceInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public IntegrationRuntime properties() {
        return this.innerModel().properties();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public IntegrationRuntimeResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String factoryName;

    private String integrationRuntimeName;

    private String createIfMatch;

    private UpdateIntegrationRuntimeRequest updateUpdateIntegrationRuntimeRequest;

    public IntegrationRuntimeResourceImpl withExistingFactory(String resourceGroupName, String factoryName) {
        this.resourceGroupName = resourceGroupName;
        this.factoryName = factoryName;
        return this;
    }

    public IntegrationRuntimeResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getIntegrationRuntimes()
            .createOrUpdateWithResponse(resourceGroupName, factoryName, integrationRuntimeName, this.innerModel(),
                createIfMatch, Context.NONE)
            .getValue();
        return this;
    }

    public IntegrationRuntimeResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getIntegrationRuntimes()
            .createOrUpdateWithResponse(resourceGroupName, factoryName, integrationRuntimeName, this.innerModel(),
                createIfMatch, context)
            .getValue();
        return this;
    }

    IntegrationRuntimeResourceImpl(String name,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = new IntegrationRuntimeResourceInner();
        this.serviceManager = serviceManager;
        this.integrationRuntimeName = name;
        this.createIfMatch = null;
    }

    public IntegrationRuntimeResourceImpl update() {
        this.updateUpdateIntegrationRuntimeRequest = new UpdateIntegrationRuntimeRequest();
        return this;
    }

    public IntegrationRuntimeResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getIntegrationRuntimes()
            .updateWithResponse(resourceGroupName, factoryName, integrationRuntimeName,
                updateUpdateIntegrationRuntimeRequest, Context.NONE)
            .getValue();
        return this;
    }

    public IntegrationRuntimeResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getIntegrationRuntimes()
            .updateWithResponse(resourceGroupName, factoryName, integrationRuntimeName,
                updateUpdateIntegrationRuntimeRequest, context)
            .getValue();
        return this;
    }

    IntegrationRuntimeResourceImpl(IntegrationRuntimeResourceInner innerObject,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.factoryName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "factories");
        this.integrationRuntimeName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "integrationRuntimes");
    }

    public IntegrationRuntimeResource refresh() {
        String localIfNoneMatch = null;
        this.innerObject = serviceManager.serviceClient()
            .getIntegrationRuntimes()
            .getWithResponse(resourceGroupName, factoryName, integrationRuntimeName, localIfNoneMatch, Context.NONE)
            .getValue();
        return this;
    }

    public IntegrationRuntimeResource refresh(Context context) {
        String localIfNoneMatch = null;
        this.innerObject = serviceManager.serviceClient()
            .getIntegrationRuntimes()
            .getWithResponse(resourceGroupName, factoryName, integrationRuntimeName, localIfNoneMatch, context)
            .getValue();
        return this;
    }

    public Response<IntegrationRuntimeStatusResponse> getStatusWithResponse(Context context) {
        return serviceManager.integrationRuntimes()
            .getStatusWithResponse(resourceGroupName, factoryName, integrationRuntimeName, context);
    }

    public IntegrationRuntimeStatusResponse getStatus() {
        return serviceManager.integrationRuntimes().getStatus(resourceGroupName, factoryName, integrationRuntimeName);
    }

    public Response<IntegrationRuntimeConnectionInfo> getConnectionInfoWithResponse(Context context) {
        return serviceManager.integrationRuntimes()
            .getConnectionInfoWithResponse(resourceGroupName, factoryName, integrationRuntimeName, context);
    }

    public IntegrationRuntimeConnectionInfo getConnectionInfo() {
        return serviceManager.integrationRuntimes()
            .getConnectionInfo(resourceGroupName, factoryName, integrationRuntimeName);
    }

    public Response<IntegrationRuntimeAuthKeys> regenerateAuthKeyWithResponse(
        IntegrationRuntimeRegenerateKeyParameters regenerateKeyParameters, Context context) {
        return serviceManager.integrationRuntimes()
            .regenerateAuthKeyWithResponse(resourceGroupName, factoryName, integrationRuntimeName,
                regenerateKeyParameters, context);
    }

    public IntegrationRuntimeAuthKeys
        regenerateAuthKey(IntegrationRuntimeRegenerateKeyParameters regenerateKeyParameters) {
        return serviceManager.integrationRuntimes()
            .regenerateAuthKey(resourceGroupName, factoryName, integrationRuntimeName, regenerateKeyParameters);
    }

    public Response<IntegrationRuntimeAuthKeys> listAuthKeysWithResponse(Context context) {
        return serviceManager.integrationRuntimes()
            .listAuthKeysWithResponse(resourceGroupName, factoryName, integrationRuntimeName, context);
    }

    public IntegrationRuntimeAuthKeys listAuthKeys() {
        return serviceManager.integrationRuntimes()
            .listAuthKeys(resourceGroupName, factoryName, integrationRuntimeName);
    }

    public IntegrationRuntimeStatusResponse start() {
        return serviceManager.integrationRuntimes().start(resourceGroupName, factoryName, integrationRuntimeName);
    }

    public IntegrationRuntimeStatusResponse start(Context context) {
        return serviceManager.integrationRuntimes()
            .start(resourceGroupName, factoryName, integrationRuntimeName, context);
    }

    public void stop() {
        serviceManager.integrationRuntimes().stop(resourceGroupName, factoryName, integrationRuntimeName);
    }

    public void stop(Context context) {
        serviceManager.integrationRuntimes().stop(resourceGroupName, factoryName, integrationRuntimeName, context);
    }

    public Response<Void> syncCredentialsWithResponse(Context context) {
        return serviceManager.integrationRuntimes()
            .syncCredentialsWithResponse(resourceGroupName, factoryName, integrationRuntimeName, context);
    }

    public void syncCredentials() {
        serviceManager.integrationRuntimes().syncCredentials(resourceGroupName, factoryName, integrationRuntimeName);
    }

    public Response<IntegrationRuntimeMonitoringData> getMonitoringDataWithResponse(Context context) {
        return serviceManager.integrationRuntimes()
            .getMonitoringDataWithResponse(resourceGroupName, factoryName, integrationRuntimeName, context);
    }

    public IntegrationRuntimeMonitoringData getMonitoringData() {
        return serviceManager.integrationRuntimes()
            .getMonitoringData(resourceGroupName, factoryName, integrationRuntimeName);
    }

    public Response<Void> upgradeWithResponse(Context context) {
        return serviceManager.integrationRuntimes()
            .upgradeWithResponse(resourceGroupName, factoryName, integrationRuntimeName, context);
    }

    public void upgrade() {
        serviceManager.integrationRuntimes().upgrade(resourceGroupName, factoryName, integrationRuntimeName);
    }

    public Response<Void> removeLinksWithResponse(LinkedIntegrationRuntimeRequest linkedIntegrationRuntimeRequest,
        Context context) {
        return serviceManager.integrationRuntimes()
            .removeLinksWithResponse(resourceGroupName, factoryName, integrationRuntimeName,
                linkedIntegrationRuntimeRequest, context);
    }

    public void removeLinks(LinkedIntegrationRuntimeRequest linkedIntegrationRuntimeRequest) {
        serviceManager.integrationRuntimes()
            .removeLinks(resourceGroupName, factoryName, integrationRuntimeName, linkedIntegrationRuntimeRequest);
    }

    public Response<IntegrationRuntimeStatusResponse> createLinkedIntegrationRuntimeWithResponse(
        CreateLinkedIntegrationRuntimeRequest createLinkedIntegrationRuntimeRequest, Context context) {
        return serviceManager.integrationRuntimes()
            .createLinkedIntegrationRuntimeWithResponse(resourceGroupName, factoryName, integrationRuntimeName,
                createLinkedIntegrationRuntimeRequest, context);
    }

    public IntegrationRuntimeStatusResponse
        createLinkedIntegrationRuntime(CreateLinkedIntegrationRuntimeRequest createLinkedIntegrationRuntimeRequest) {
        return serviceManager.integrationRuntimes()
            .createLinkedIntegrationRuntime(resourceGroupName, factoryName, integrationRuntimeName,
                createLinkedIntegrationRuntimeRequest);
    }

    public IntegrationRuntimeResourceImpl withProperties(IntegrationRuntime properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public IntegrationRuntimeResourceImpl withIfMatch(String ifMatch) {
        this.createIfMatch = ifMatch;
        return this;
    }

    public IntegrationRuntimeResourceImpl withAutoUpdate(IntegrationRuntimeAutoUpdate autoUpdate) {
        this.updateUpdateIntegrationRuntimeRequest.withAutoUpdate(autoUpdate);
        return this;
    }

    public IntegrationRuntimeResourceImpl withUpdateDelayOffset(String updateDelayOffset) {
        this.updateUpdateIntegrationRuntimeRequest.withUpdateDelayOffset(updateDelayOffset);
        return this;
    }
}
