// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

/**
 * Samples for DataFlows ListByFactory.
 */
public final class DataFlowsListByFactorySamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/DataFlows_ListByFactory.json
     */
    /**
     * Sample code: DataFlows_ListByFactory.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void dataFlowsListByFactory(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.dataFlows()
            .listByFactory("exampleResourceGroup", "exampleFactoryName", com.azure.core.util.Context.NONE);
    }
}
