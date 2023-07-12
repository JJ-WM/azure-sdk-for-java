// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.networkcloud.fluent.models.AgentPoolInner;
import com.azure.resourcemanager.networkcloud.models.AdministratorConfiguration;
import com.azure.resourcemanager.networkcloud.models.AgentOptions;
import com.azure.resourcemanager.networkcloud.models.AgentPool;
import com.azure.resourcemanager.networkcloud.models.AgentPoolDetailedStatus;
import com.azure.resourcemanager.networkcloud.models.AgentPoolMode;
import com.azure.resourcemanager.networkcloud.models.AgentPoolPatchParameters;
import com.azure.resourcemanager.networkcloud.models.AgentPoolProvisioningState;
import com.azure.resourcemanager.networkcloud.models.AgentPoolUpgradeSettings;
import com.azure.resourcemanager.networkcloud.models.AttachedNetworkConfiguration;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.KubernetesLabel;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class AgentPoolImpl implements AgentPool, AgentPool.Definition, AgentPool.Update {
    private AgentPoolInner innerObject;

    private final com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public AdministratorConfiguration administratorConfiguration() {
        return this.innerModel().administratorConfiguration();
    }

    public AgentOptions agentOptions() {
        return this.innerModel().agentOptions();
    }

    public AttachedNetworkConfiguration attachedNetworkConfiguration() {
        return this.innerModel().attachedNetworkConfiguration();
    }

    public List<String> availabilityZones() {
        List<String> inner = this.innerModel().availabilityZones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public long count() {
        return this.innerModel().count();
    }

    public AgentPoolDetailedStatus detailedStatus() {
        return this.innerModel().detailedStatus();
    }

    public String detailedStatusMessage() {
        return this.innerModel().detailedStatusMessage();
    }

    public String kubernetesVersion() {
        return this.innerModel().kubernetesVersion();
    }

    public List<KubernetesLabel> labels() {
        List<KubernetesLabel> inner = this.innerModel().labels();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AgentPoolMode mode() {
        return this.innerModel().mode();
    }

    public AgentPoolProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<KubernetesLabel> taints() {
        List<KubernetesLabel> inner = this.innerModel().taints();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AgentPoolUpgradeSettings upgradeSettings() {
        return this.innerModel().upgradeSettings();
    }

    public String vmSkuName() {
        return this.innerModel().vmSkuName();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public AgentPoolInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.networkcloud.NetworkCloudManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String kubernetesClusterName;

    private String agentPoolName;

    private AgentPoolPatchParameters updateAgentPoolUpdateParameters;

    public AgentPoolImpl withExistingKubernetesCluster(String resourceGroupName, String kubernetesClusterName) {
        this.resourceGroupName = resourceGroupName;
        this.kubernetesClusterName = kubernetesClusterName;
        return this;
    }

    public AgentPool create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAgentPools()
                .createOrUpdate(
                    resourceGroupName, kubernetesClusterName, agentPoolName, this.innerModel(), Context.NONE);
        return this;
    }

    public AgentPool create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAgentPools()
                .createOrUpdate(resourceGroupName, kubernetesClusterName, agentPoolName, this.innerModel(), context);
        return this;
    }

    AgentPoolImpl(String name, com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager) {
        this.innerObject = new AgentPoolInner();
        this.serviceManager = serviceManager;
        this.agentPoolName = name;
    }

    public AgentPoolImpl update() {
        this.updateAgentPoolUpdateParameters = new AgentPoolPatchParameters();
        return this;
    }

    public AgentPool apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAgentPools()
                .update(
                    resourceGroupName,
                    kubernetesClusterName,
                    agentPoolName,
                    updateAgentPoolUpdateParameters,
                    Context.NONE);
        return this;
    }

    public AgentPool apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAgentPools()
                .update(
                    resourceGroupName, kubernetesClusterName, agentPoolName, updateAgentPoolUpdateParameters, context);
        return this;
    }

    AgentPoolImpl(
        AgentPoolInner innerObject, com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.kubernetesClusterName = Utils.getValueFromIdByName(innerObject.id(), "kubernetesClusters");
        this.agentPoolName = Utils.getValueFromIdByName(innerObject.id(), "agentPools");
    }

    public AgentPool refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAgentPools()
                .getWithResponse(resourceGroupName, kubernetesClusterName, agentPoolName, Context.NONE)
                .getValue();
        return this;
    }

    public AgentPool refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAgentPools()
                .getWithResponse(resourceGroupName, kubernetesClusterName, agentPoolName, context)
                .getValue();
        return this;
    }

    public AgentPoolImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AgentPoolImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AgentPoolImpl withCount(long count) {
        this.innerModel().withCount(count);
        return this;
    }

    public AgentPoolImpl withMode(AgentPoolMode mode) {
        this.innerModel().withMode(mode);
        return this;
    }

    public AgentPoolImpl withVmSkuName(String vmSkuName) {
        this.innerModel().withVmSkuName(vmSkuName);
        return this;
    }

    public AgentPoolImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateAgentPoolUpdateParameters.withTags(tags);
            return this;
        }
    }

    public AgentPoolImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public AgentPoolImpl withAdministratorConfiguration(AdministratorConfiguration administratorConfiguration) {
        this.innerModel().withAdministratorConfiguration(administratorConfiguration);
        return this;
    }

    public AgentPoolImpl withAgentOptions(AgentOptions agentOptions) {
        this.innerModel().withAgentOptions(agentOptions);
        return this;
    }

    public AgentPoolImpl withAttachedNetworkConfiguration(AttachedNetworkConfiguration attachedNetworkConfiguration) {
        this.innerModel().withAttachedNetworkConfiguration(attachedNetworkConfiguration);
        return this;
    }

    public AgentPoolImpl withAvailabilityZones(List<String> availabilityZones) {
        this.innerModel().withAvailabilityZones(availabilityZones);
        return this;
    }

    public AgentPoolImpl withLabels(List<KubernetesLabel> labels) {
        this.innerModel().withLabels(labels);
        return this;
    }

    public AgentPoolImpl withTaints(List<KubernetesLabel> taints) {
        this.innerModel().withTaints(taints);
        return this;
    }

    public AgentPoolImpl withUpgradeSettings(AgentPoolUpgradeSettings upgradeSettings) {
        if (isInCreateMode()) {
            this.innerModel().withUpgradeSettings(upgradeSettings);
            return this;
        } else {
            this.updateAgentPoolUpdateParameters.withUpgradeSettings(upgradeSettings);
            return this;
        }
    }

    public AgentPoolImpl withCount(Long count) {
        this.updateAgentPoolUpdateParameters.withCount(count);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
