// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.models.ApplicationEnablement;
import com.azure.resourcemanager.hybridnetwork.models.ArmTemplateMappingRuleProfile;
import com.azure.resourcemanager.hybridnetwork.models.AzureCoreArmTemplateDeployMappingRuleProfile;
import org.junit.jupiter.api.Assertions;

public final class AzureCoreArmTemplateDeployMappingRuleProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureCoreArmTemplateDeployMappingRuleProfile model = BinaryData.fromString(
            "{\"templateMappingRuleProfile\":{\"templateParameters\":\"pphoj\"},\"applicationEnablement\":\"Disabled\"}")
            .toObject(AzureCoreArmTemplateDeployMappingRuleProfile.class);
        Assertions.assertEquals(ApplicationEnablement.DISABLED, model.applicationEnablement());
        Assertions.assertEquals("pphoj", model.templateMappingRuleProfile().templateParameters());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureCoreArmTemplateDeployMappingRuleProfile model = new AzureCoreArmTemplateDeployMappingRuleProfile()
            .withApplicationEnablement(ApplicationEnablement.DISABLED)
            .withTemplateMappingRuleProfile(new ArmTemplateMappingRuleProfile().withTemplateParameters("pphoj"));
        model = BinaryData.fromObject(model).toObject(AzureCoreArmTemplateDeployMappingRuleProfile.class);
        Assertions.assertEquals(ApplicationEnablement.DISABLED, model.applicationEnablement());
        Assertions.assertEquals("pphoj", model.templateMappingRuleProfile().templateParameters());
    }
}
