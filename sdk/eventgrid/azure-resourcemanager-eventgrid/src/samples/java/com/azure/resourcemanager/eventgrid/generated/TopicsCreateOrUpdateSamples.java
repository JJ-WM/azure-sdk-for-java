// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.resourcemanager.eventgrid.models.ExtendedLocation;
import com.azure.resourcemanager.eventgrid.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.models.InputSchema;
import com.azure.resourcemanager.eventgrid.models.IpActionType;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.models.ResourceKind;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Topics CreateOrUpdate.
 */
public final class TopicsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-12-15-preview/examples/
     * Topics_CreateOrUpdate.json
     */
    /**
     * Sample code: Topics_CreateOrUpdate.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void topicsCreateOrUpdate(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.topics().define("exampletopic1").withRegion("westus2").withExistingResourceGroup("examplerg")
            .withTags(mapOf("tag1", "value1", "tag2", "value2")).withPublicNetworkAccess(PublicNetworkAccess.ENABLED)
            .withInboundIpRules(
                Arrays.asList(new InboundIpRule().withIpMask("12.18.30.15").withAction(IpActionType.ALLOW),
                    new InboundIpRule().withIpMask("12.18.176.1").withAction(IpActionType.ALLOW)))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-12-15-preview/examples/
     * Topics_CreateOrUpdateForAzureArc.json
     */
    /**
     * Sample code: Topics_CreateOrUpdateForAzureArc.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void topicsCreateOrUpdateForAzureArc(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.topics().define("exampletopic1").withRegion("westus2").withExistingResourceGroup("examplerg")
            .withTags(mapOf("tag1", "value1", "tag2", "value2")).withKind(ResourceKind.AZURE_ARC)
            .withExtendedLocation(new ExtendedLocation().withName(
                "/subscriptions/8f6b6269-84f2-4d09-9e31-1127efcd1e40/resourcegroups/examplerg/providers/Microsoft.ExtendedLocation/CustomLocations/exampleCustomLocation")
                .withType("CustomLocation"))
            .withInputSchema(InputSchema.CLOUD_EVENT_SCHEMA_V1_0).create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
