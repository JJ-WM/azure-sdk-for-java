// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.resourcemanager.kusto.fluent.models.LanguageExtensionInner;
import com.azure.resourcemanager.kusto.models.LanguageExtensionName;
import com.azure.resourcemanager.kusto.models.LanguageExtensionsList;
import java.util.Arrays;

/** Samples for Clusters RemoveLanguageExtensions. */
public final class ClustersRemoveLanguageExtensionsSamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2023-05-02/examples/KustoClusterRemoveLanguageExtensions.json
     */
    /**
     * Sample code: KustoClusterRemoveLanguageExtensions.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoClusterRemoveLanguageExtensions(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .clusters()
            .removeLanguageExtensions(
                "kustorptest",
                "kustoCluster",
                new LanguageExtensionsList()
                    .withValue(
                        Arrays
                            .asList(
                                new LanguageExtensionInner().withLanguageExtensionName(LanguageExtensionName.PYTHON),
                                new LanguageExtensionInner().withLanguageExtensionName(LanguageExtensionName.R))),
                com.azure.core.util.Context.NONE);
    }
}
