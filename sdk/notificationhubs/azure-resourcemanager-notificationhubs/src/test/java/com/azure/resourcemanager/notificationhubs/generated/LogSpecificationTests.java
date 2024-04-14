// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.notificationhubs.models.LogSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LogSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogSpecification model = BinaryData.fromString(
            "{\"name\":\"fm\",\"displayName\":\"gkvtmelmqkrhah\",\"blobDuration\":\"juahaquhcdhmdual\",\"categoryGroups\":[\"qpv\",\"adm\",\"sr\"]}")
            .toObject(LogSpecification.class);
        Assertions.assertEquals("qpv", model.categoryGroups().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogSpecification model = new LogSpecification().withCategoryGroups(Arrays.asList("qpv", "adm", "sr"));
        model = BinaryData.fromObject(model).toObject(LogSpecification.class);
        Assertions.assertEquals("qpv", model.categoryGroups().get(0));
    }
}
