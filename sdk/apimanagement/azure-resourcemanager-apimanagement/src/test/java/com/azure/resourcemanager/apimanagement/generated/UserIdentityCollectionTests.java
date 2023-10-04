// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.UserIdentityContractInner;
import com.azure.resourcemanager.apimanagement.models.UserIdentityCollection;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UserIdentityCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserIdentityCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"provider\":\"sjjfd\",\"id\":\"hrjqfyaytvslyek\"},{\"provider\":\"niuarlcjiwgsxfai\",\"id\":\"wd\"}],\"count\":7376768391428973643,\"nextLink\":\"nfgrzxbarcbpaefz\"}")
                .toObject(UserIdentityCollection.class);
        Assertions.assertEquals("sjjfd", model.value().get(0).provider());
        Assertions.assertEquals("hrjqfyaytvslyek", model.value().get(0).id());
        Assertions.assertEquals(7376768391428973643L, model.count());
        Assertions.assertEquals("nfgrzxbarcbpaefz", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserIdentityCollection model =
            new UserIdentityCollection()
                .withValue(
                    Arrays
                        .asList(
                            new UserIdentityContractInner().withProvider("sjjfd").withId("hrjqfyaytvslyek"),
                            new UserIdentityContractInner().withProvider("niuarlcjiwgsxfai").withId("wd")))
                .withCount(7376768391428973643L)
                .withNextLink("nfgrzxbarcbpaefz");
        model = BinaryData.fromObject(model).toObject(UserIdentityCollection.class);
        Assertions.assertEquals("sjjfd", model.value().get(0).provider());
        Assertions.assertEquals("hrjqfyaytvslyek", model.value().get(0).id());
        Assertions.assertEquals(7376768391428973643L, model.count());
        Assertions.assertEquals("nfgrzxbarcbpaefz", model.nextLink());
    }
}
