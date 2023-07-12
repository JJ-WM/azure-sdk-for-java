// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AdhocBasedTaggingCriteria;
import com.azure.resourcemanager.dataprotection.models.AdhocBasedTriggerContext;
import com.azure.resourcemanager.dataprotection.models.RetentionTag;
import org.junit.jupiter.api.Assertions;

public final class AdhocBasedTriggerContextTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AdhocBasedTriggerContext model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AdhocBasedTriggerContext\",\"taggingCriteria\":{\"tagInfo\":{\"eTag\":\"qugjhkycube\",\"id\":\"gssofwq\",\"tagName\":\"zqalkrmnjijpx\"}}}")
                .toObject(AdhocBasedTriggerContext.class);
        Assertions.assertEquals("zqalkrmnjijpx", model.taggingCriteria().tagInfo().tagName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AdhocBasedTriggerContext model =
            new AdhocBasedTriggerContext()
                .withTaggingCriteria(
                    new AdhocBasedTaggingCriteria().withTagInfo(new RetentionTag().withTagName("zqalkrmnjijpx")));
        model = BinaryData.fromObject(model).toObject(AdhocBasedTriggerContext.class);
        Assertions.assertEquals("zqalkrmnjijpx", model.taggingCriteria().tagInfo().tagName());
    }
}
