// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmDiscoveredProtectedVmDetails;

public final class InMageRcmDiscoveredProtectedVmDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageRcmDiscoveredProtectedVmDetails model =
            BinaryData
                .fromString(
                    "{\"vCenterId\":\"l\",\"vCenterFqdn\":\"ewikfyaqandmym\",\"datastores\":[\"qjumovs\",\"bpbvzopaxmf\"],\"ipAddresses\":[\"mcwoxfaxd\",\"nqifb\",\"atroiaue\"],\"vmwareToolsStatus\":\"gmocpcjycboelrgt\",\"powerStatus\":\"fldsiuorin\",\"vmFqdn\":\"cedpksriwmmtmqrx\",\"osName\":\"qvvyczyay\",\"createdTimestamp\":\"2021-05-28T18:44:37Z\",\"updatedTimestamp\":\"2021-06-17T16:30:32Z\",\"isDeleted\":false,\"lastDiscoveryTimeInUtc\":\"2020-12-27T23:56:34Z\"}")
                .toObject(InMageRcmDiscoveredProtectedVmDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageRcmDiscoveredProtectedVmDetails model = new InMageRcmDiscoveredProtectedVmDetails();
        model = BinaryData.fromObject(model).toObject(InMageRcmDiscoveredProtectedVmDetails.class);
    }
}
