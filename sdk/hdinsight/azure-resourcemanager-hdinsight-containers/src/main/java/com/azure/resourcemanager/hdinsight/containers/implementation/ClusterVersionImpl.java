// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.implementation;

import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterVersionInner;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterComponentsItem;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterVersion;
import java.util.Collections;
import java.util.List;

public final class ClusterVersionImpl implements ClusterVersion {
    private ClusterVersionInner innerObject;

    private final com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager serviceManager;

    ClusterVersionImpl(
        ClusterVersionInner innerObject,
        com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager serviceManager) {
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

    public String clusterType() {
        return this.innerModel().clusterType();
    }

    public String clusterVersion() {
        return this.innerModel().clusterVersion();
    }

    public String ossVersion() {
        return this.innerModel().ossVersion();
    }

    public String clusterPoolVersion() {
        return this.innerModel().clusterPoolVersion();
    }

    public Boolean isPreview() {
        return this.innerModel().isPreview();
    }

    public List<ClusterComponentsItem> components() {
        List<ClusterComponentsItem> inner = this.innerModel().components();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ClusterVersionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager manager() {
        return this.serviceManager;
    }
}
