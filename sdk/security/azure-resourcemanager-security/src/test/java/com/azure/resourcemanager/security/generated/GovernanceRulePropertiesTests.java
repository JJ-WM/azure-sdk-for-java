// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.GovernanceRuleProperties;
import com.azure.resourcemanager.security.models.GovernanceRuleEmailNotification;
import com.azure.resourcemanager.security.models.GovernanceRuleMetadata;
import com.azure.resourcemanager.security.models.GovernanceRuleOwnerSource;
import com.azure.resourcemanager.security.models.GovernanceRuleOwnerSourceType;
import com.azure.resourcemanager.security.models.GovernanceRuleSourceResourceType;
import com.azure.resourcemanager.security.models.GovernanceRuleType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class GovernanceRulePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GovernanceRuleProperties model = BinaryData.fromString(
            "{\"tenantId\":\"lbfpncurd\",\"displayName\":\"iwii\",\"description\":\"tywubxcbihwq\",\"remediationTimeframe\":\"fdntwjchrdgoih\",\"isGracePeriod\":true,\"rulePriority\":585676440,\"isDisabled\":false,\"ruleType\":\"Integrated\",\"sourceResourceType\":\"Assessments\",\"excludedScopes\":[\"jl\"],\"conditionSets\":[\"datadfdlwggyts\",\"datawtovvtgsein\"],\"includeMemberScopes\":true,\"ownerSource\":{\"type\":\"Manually\",\"value\":\"qknp\"},\"governanceEmailNotification\":{\"disableManagerEmailNotification\":true,\"disableOwnerEmailNotification\":false},\"metadata\":{\"createdBy\":\"wqmsniffcdmqn\",\"createdOn\":\"2021-09-07T02:26:24Z\",\"updatedBy\":\"pij\",\"updatedOn\":\"2021-06-28T02:21:18Z\"}}")
            .toObject(GovernanceRuleProperties.class);
        Assertions.assertEquals("iwii", model.displayName());
        Assertions.assertEquals("tywubxcbihwq", model.description());
        Assertions.assertEquals("fdntwjchrdgoih", model.remediationTimeframe());
        Assertions.assertEquals(true, model.isGracePeriod());
        Assertions.assertEquals(585676440, model.rulePriority());
        Assertions.assertEquals(false, model.isDisabled());
        Assertions.assertEquals(GovernanceRuleType.INTEGRATED, model.ruleType());
        Assertions.assertEquals(GovernanceRuleSourceResourceType.ASSESSMENTS, model.sourceResourceType());
        Assertions.assertEquals("jl", model.excludedScopes().get(0));
        Assertions.assertEquals(true, model.includeMemberScopes());
        Assertions.assertEquals(GovernanceRuleOwnerSourceType.MANUALLY, model.ownerSource().type());
        Assertions.assertEquals("qknp", model.ownerSource().value());
        Assertions.assertEquals(true, model.governanceEmailNotification().disableManagerEmailNotification());
        Assertions.assertEquals(false, model.governanceEmailNotification().disableOwnerEmailNotification());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GovernanceRuleProperties model = new GovernanceRuleProperties().withDisplayName("iwii")
            .withDescription("tywubxcbihwq").withRemediationTimeframe("fdntwjchrdgoih").withIsGracePeriod(true)
            .withRulePriority(585676440).withIsDisabled(false).withRuleType(GovernanceRuleType.INTEGRATED)
            .withSourceResourceType(GovernanceRuleSourceResourceType.ASSESSMENTS)
            .withExcludedScopes(Arrays.asList("jl"))
            .withConditionSets(Arrays.asList("datadfdlwggyts", "datawtovvtgsein")).withIncludeMemberScopes(true)
            .withOwnerSource(
                new GovernanceRuleOwnerSource().withType(GovernanceRuleOwnerSourceType.MANUALLY).withValue("qknp"))
            .withGovernanceEmailNotification(new GovernanceRuleEmailNotification()
                .withDisableManagerEmailNotification(true).withDisableOwnerEmailNotification(false))
            .withMetadata(new GovernanceRuleMetadata());
        model = BinaryData.fromObject(model).toObject(GovernanceRuleProperties.class);
        Assertions.assertEquals("iwii", model.displayName());
        Assertions.assertEquals("tywubxcbihwq", model.description());
        Assertions.assertEquals("fdntwjchrdgoih", model.remediationTimeframe());
        Assertions.assertEquals(true, model.isGracePeriod());
        Assertions.assertEquals(585676440, model.rulePriority());
        Assertions.assertEquals(false, model.isDisabled());
        Assertions.assertEquals(GovernanceRuleType.INTEGRATED, model.ruleType());
        Assertions.assertEquals(GovernanceRuleSourceResourceType.ASSESSMENTS, model.sourceResourceType());
        Assertions.assertEquals("jl", model.excludedScopes().get(0));
        Assertions.assertEquals(true, model.includeMemberScopes());
        Assertions.assertEquals(GovernanceRuleOwnerSourceType.MANUALLY, model.ownerSource().type());
        Assertions.assertEquals("qknp", model.ownerSource().value());
        Assertions.assertEquals(true, model.governanceEmailNotification().disableManagerEmailNotification());
        Assertions.assertEquals(false, model.governanceEmailNotification().disableOwnerEmailNotification());
    }
}
