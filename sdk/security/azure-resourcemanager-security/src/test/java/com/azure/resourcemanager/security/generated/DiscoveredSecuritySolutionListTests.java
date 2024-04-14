// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.DiscoveredSecuritySolutionInner;
import com.azure.resourcemanager.security.models.DiscoveredSecuritySolutionList;
import com.azure.resourcemanager.security.models.SecurityFamily;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DiscoveredSecuritySolutionListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiscoveredSecuritySolutionList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"securityFamily\":\"Ngfw\",\"offer\":\"xfvonfeeqg\",\"publisher\":\"krie\",\"sku\":\"bgnixxoww\"},\"location\":\"yfwnw\",\"id\":\"iwxeiicrmpep\",\"name\":\"ldmaxxijvskwsdgk\",\"type\":\"gyacwrasekwef\"},{\"properties\":{\"securityFamily\":\"Ngfw\",\"offer\":\"o\",\"publisher\":\"nwoqartwy\",\"sku\":\"qicladv\"},\"location\":\"davuqmcbyms\",\"id\":\"ob\",\"name\":\"lquvjezcjumvp\",\"type\":\"imioyo\"},{\"properties\":{\"securityFamily\":\"SaasWaf\",\"offer\":\"l\",\"publisher\":\"miqwnnrac\",\"sku\":\"ibb\"},\"location\":\"pspkladydgnhautw\",\"id\":\"kexzgpmnmabeddqi\",\"name\":\"wg\",\"type\":\"fpfqf\"}],\"nextLink\":\"vstclg\"}")
            .toObject(DiscoveredSecuritySolutionList.class);
        Assertions.assertEquals(SecurityFamily.NGFW, model.value().get(0).securityFamily());
        Assertions.assertEquals("xfvonfeeqg", model.value().get(0).offer());
        Assertions.assertEquals("krie", model.value().get(0).publisher());
        Assertions.assertEquals("bgnixxoww", model.value().get(0).sku());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiscoveredSecuritySolutionList model = new DiscoveredSecuritySolutionList().withValue(Arrays.asList(
            new DiscoveredSecuritySolutionInner().withSecurityFamily(SecurityFamily.NGFW).withOffer("xfvonfeeqg")
                .withPublisher("krie").withSku("bgnixxoww"),
            new DiscoveredSecuritySolutionInner().withSecurityFamily(SecurityFamily.NGFW).withOffer("o")
                .withPublisher("nwoqartwy").withSku("qicladv"),
            new DiscoveredSecuritySolutionInner().withSecurityFamily(SecurityFamily.SAAS_WAF).withOffer("l")
                .withPublisher("miqwnnrac").withSku("ibb")));
        model = BinaryData.fromObject(model).toObject(DiscoveredSecuritySolutionList.class);
        Assertions.assertEquals(SecurityFamily.NGFW, model.value().get(0).securityFamily());
        Assertions.assertEquals("xfvonfeeqg", model.value().get(0).offer());
        Assertions.assertEquals("krie", model.value().get(0).publisher());
        Assertions.assertEquals("bgnixxoww", model.value().get(0).sku());
    }
}
