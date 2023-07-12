// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;

/** Schema of the Data property of an EventGridEvent for a Microsoft.ContainerService.NodePoolRollingStarted event. */
@Fluent
public final class ContainerServiceNodePoolRollingStartedEventData extends ContainerServiceNodePoolRollingEventData {
    /** Creates an instance of ContainerServiceNodePoolRollingStartedEventData class. */
    public ContainerServiceNodePoolRollingStartedEventData() {}

    /** {@inheritDoc} */
    @Override
    public ContainerServiceNodePoolRollingStartedEventData setNodePoolName(String nodePoolName) {
        super.setNodePoolName(nodePoolName);
        return this;
    }
}
