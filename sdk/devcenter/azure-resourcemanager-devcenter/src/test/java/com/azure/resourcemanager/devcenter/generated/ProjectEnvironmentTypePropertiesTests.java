// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.ProjectEnvironmentTypeProperties;
import com.azure.resourcemanager.devcenter.models.EnvironmentRole;
import com.azure.resourcemanager.devcenter.models.EnvironmentTypeEnableStatus;
import com.azure.resourcemanager.devcenter.models.ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment;
import com.azure.resourcemanager.devcenter.models.UserRoleAssignmentValue;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ProjectEnvironmentTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProjectEnvironmentTypeProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Updated\",\"displayName\":\"eyvjusrtslhspkde\",\"environmentCount\":812184412,\"deploymentTargetId\":\"fm\",\"status\":\"Disabled\",\"creatorRoleAssignment\":{\"roles\":{\"uhcdhm\":{\"roleName\":\"elmqk\",\"description\":\"ahvljuaha\"}}},\"userRoleAssignments\":{\"isgwbnbbeldawkz\":{\"roles\":{\"lf\":{\"roleName\":\"xqpvfadmw\",\"description\":\"crgvxpvgom\"}}},\"bkpyc\":{\"roles\":{\"i\":{\"roleName\":\"ourqhakau\",\"description\":\"shsfwxosowzxcu\"},\"zceuojgjrw\":{\"roleName\":\"ooxdjebwpuc\",\"description\":\"fvovbvmeuecivy\"},\"qwgxhniskx\":{\"roleName\":\"eiotwmcdytdx\",\"description\":\"txnrjaw\"}}},\"ow\":{\"roles\":{\"bm\":{\"roleName\":\"ndnhj\",\"description\":\"uwhvylwzbtdhxujz\"}}},\"wyzmhtxon\":{\"roles\":{\"lrbpbewtghfgbl\":{\"roleName\":\"zqlveualupjmkhf\",\"description\":\"bbcswsrtjri\"},\"cgwrtzjuz\":{\"roleName\":\"wxzvlvqhjkb\",\"description\":\"ibtnmxiebwwaloay\"}}}}}")
                .toObject(ProjectEnvironmentTypeProperties.class);
        Assertions.assertEquals("fm", model.deploymentTargetId());
        Assertions.assertEquals(EnvironmentTypeEnableStatus.DISABLED, model.status());
        Assertions.assertEquals("eyvjusrtslhspkde", model.displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProjectEnvironmentTypeProperties model =
            new ProjectEnvironmentTypeProperties()
                .withDeploymentTargetId("fm")
                .withStatus(EnvironmentTypeEnableStatus.DISABLED)
                .withCreatorRoleAssignment(
                    new ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment()
                        .withRoles(mapOf("uhcdhm", new EnvironmentRole())))
                .withUserRoleAssignments(
                    mapOf(
                        "isgwbnbbeldawkz",
                        new UserRoleAssignmentValue().withRoles(mapOf("lf", new EnvironmentRole())),
                        "bkpyc",
                        new UserRoleAssignmentValue()
                            .withRoles(
                                mapOf(
                                    "i",
                                    new EnvironmentRole(),
                                    "zceuojgjrw",
                                    new EnvironmentRole(),
                                    "qwgxhniskx",
                                    new EnvironmentRole())),
                        "ow",
                        new UserRoleAssignmentValue().withRoles(mapOf("bm", new EnvironmentRole())),
                        "wyzmhtxon",
                        new UserRoleAssignmentValue()
                            .withRoles(
                                mapOf("lrbpbewtghfgbl", new EnvironmentRole(), "cgwrtzjuz", new EnvironmentRole()))))
                .withDisplayName("eyvjusrtslhspkde");
        model = BinaryData.fromObject(model).toObject(ProjectEnvironmentTypeProperties.class);
        Assertions.assertEquals("fm", model.deploymentTargetId());
        Assertions.assertEquals(EnvironmentTypeEnableStatus.DISABLED, model.status());
        Assertions.assertEquals("eyvjusrtslhspkde", model.displayName());
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
