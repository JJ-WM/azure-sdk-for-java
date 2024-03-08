// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confluent.fluent.models.AccessListRoleBindingsSuccessResponseInner;
import com.azure.resourcemanager.confluent.models.ConfluentListMetadata;
import com.azure.resourcemanager.confluent.models.MetadataEntity;
import com.azure.resourcemanager.confluent.models.RoleBindingRecord;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AccessListRoleBindingsSuccessResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccessListRoleBindingsSuccessResponseInner model = BinaryData.fromString(
            "{\"kind\":\"bzdopcj\",\"metadata\":{\"first\":\"hdldwmgxcxrsl\",\"last\":\"utwu\",\"prev\":\"grpkhjwniyqs\",\"next\":\"i\",\"total_size\":1317619791},\"data\":[{\"kind\":\"zzlvmbmpaxmodfv\",\"id\":\"fy\",\"metadata\":{\"self\":\"pfvmwyhrfou\",\"resource_name\":\"taakc\",\"created_at\":\"iyzvqtmnub\",\"updated_at\":\"kpzksmondjmq\",\"deleted_at\":\"vypomgkopkwho\"},\"principal\":\"pajqgxysm\",\"role_name\":\"mbqfqvmk\",\"crn_pattern\":\"oz\"}]}")
            .toObject(AccessListRoleBindingsSuccessResponseInner.class);
        Assertions.assertEquals("bzdopcj", model.kind());
        Assertions.assertEquals("hdldwmgxcxrsl", model.metadata().first());
        Assertions.assertEquals("utwu", model.metadata().last());
        Assertions.assertEquals("grpkhjwniyqs", model.metadata().prev());
        Assertions.assertEquals("i", model.metadata().next());
        Assertions.assertEquals(1317619791, model.metadata().totalSize());
        Assertions.assertEquals("zzlvmbmpaxmodfv", model.data().get(0).kind());
        Assertions.assertEquals("fy", model.data().get(0).id());
        Assertions.assertEquals("pfvmwyhrfou", model.data().get(0).metadata().self());
        Assertions.assertEquals("taakc", model.data().get(0).metadata().resourceName());
        Assertions.assertEquals("iyzvqtmnub", model.data().get(0).metadata().createdAt());
        Assertions.assertEquals("kpzksmondjmq", model.data().get(0).metadata().updatedAt());
        Assertions.assertEquals("vypomgkopkwho", model.data().get(0).metadata().deletedAt());
        Assertions.assertEquals("pajqgxysm", model.data().get(0).principal());
        Assertions.assertEquals("mbqfqvmk", model.data().get(0).roleName());
        Assertions.assertEquals("oz", model.data().get(0).crnPattern());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccessListRoleBindingsSuccessResponseInner model
            = new AccessListRoleBindingsSuccessResponseInner().withKind("bzdopcj")
                .withMetadata(new ConfluentListMetadata().withFirst("hdldwmgxcxrsl").withLast("utwu")
                    .withPrev("grpkhjwniyqs").withNext("i").withTotalSize(1317619791))
                .withData(Arrays.asList(new RoleBindingRecord().withKind("zzlvmbmpaxmodfv").withId("fy")
                    .withMetadata(new MetadataEntity().withSelf("pfvmwyhrfou").withResourceName("taakc")
                        .withCreatedAt("iyzvqtmnub").withUpdatedAt("kpzksmondjmq").withDeletedAt("vypomgkopkwho"))
                    .withPrincipal("pajqgxysm").withRoleName("mbqfqvmk").withCrnPattern("oz")));
        model = BinaryData.fromObject(model).toObject(AccessListRoleBindingsSuccessResponseInner.class);
        Assertions.assertEquals("bzdopcj", model.kind());
        Assertions.assertEquals("hdldwmgxcxrsl", model.metadata().first());
        Assertions.assertEquals("utwu", model.metadata().last());
        Assertions.assertEquals("grpkhjwniyqs", model.metadata().prev());
        Assertions.assertEquals("i", model.metadata().next());
        Assertions.assertEquals(1317619791, model.metadata().totalSize());
        Assertions.assertEquals("zzlvmbmpaxmodfv", model.data().get(0).kind());
        Assertions.assertEquals("fy", model.data().get(0).id());
        Assertions.assertEquals("pfvmwyhrfou", model.data().get(0).metadata().self());
        Assertions.assertEquals("taakc", model.data().get(0).metadata().resourceName());
        Assertions.assertEquals("iyzvqtmnub", model.data().get(0).metadata().createdAt());
        Assertions.assertEquals("kpzksmondjmq", model.data().get(0).metadata().updatedAt());
        Assertions.assertEquals("vypomgkopkwho", model.data().get(0).metadata().deletedAt());
        Assertions.assertEquals("pajqgxysm", model.data().get(0).principal());
        Assertions.assertEquals("mbqfqvmk", model.data().get(0).roleName());
        Assertions.assertEquals("oz", model.data().get(0).crnPattern());
    }
}
