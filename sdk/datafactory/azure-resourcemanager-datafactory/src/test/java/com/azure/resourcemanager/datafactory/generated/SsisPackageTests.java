// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SsisPackage;
import com.azure.resourcemanager.datafactory.models.SsisParameter;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SsisPackageTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SsisPackage model = BinaryData.fromString(
            "{\"type\":\"Package\",\"folderId\":3556959886109984896,\"projectVersion\":4692852653848740418,\"projectId\":668264090121943233,\"parameters\":[{\"id\":525854716862013224,\"name\":\"ifywxjjylaqhx\",\"description\":\"fdarvjhwgkynxlw\",\"dataType\":\"gotdt\",\"required\":false,\"sensitive\":true,\"designDefaultValue\":\"lh\",\"defaultValue\":\"ybfnkylzrignqlwo\",\"sensitiveDefaultValue\":\"nbjuaiu\",\"valueType\":\"mqcbnk\",\"valueSet\":true,\"variable\":\"i\"}],\"id\":4578072156366697994,\"name\":\"ryywyfcenkbfxqc\",\"description\":\"ggeciradmxokbutb\"}")
            .toObject(SsisPackage.class);
        Assertions.assertEquals(4578072156366697994L, model.id());
        Assertions.assertEquals("ryywyfcenkbfxqc", model.name());
        Assertions.assertEquals("ggeciradmxokbutb", model.description());
        Assertions.assertEquals(3556959886109984896L, model.folderId());
        Assertions.assertEquals(4692852653848740418L, model.projectVersion());
        Assertions.assertEquals(668264090121943233L, model.projectId());
        Assertions.assertEquals(525854716862013224L, model.parameters().get(0).id());
        Assertions.assertEquals("ifywxjjylaqhx", model.parameters().get(0).name());
        Assertions.assertEquals("fdarvjhwgkynxlw", model.parameters().get(0).description());
        Assertions.assertEquals("gotdt", model.parameters().get(0).dataType());
        Assertions.assertEquals(false, model.parameters().get(0).required());
        Assertions.assertEquals(true, model.parameters().get(0).sensitive());
        Assertions.assertEquals("lh", model.parameters().get(0).designDefaultValue());
        Assertions.assertEquals("ybfnkylzrignqlwo", model.parameters().get(0).defaultValue());
        Assertions.assertEquals("nbjuaiu", model.parameters().get(0).sensitiveDefaultValue());
        Assertions.assertEquals("mqcbnk", model.parameters().get(0).valueType());
        Assertions.assertEquals(true, model.parameters().get(0).valueSet());
        Assertions.assertEquals("i", model.parameters().get(0).variable());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SsisPackage model = new SsisPackage().withId(4578072156366697994L).withName("ryywyfcenkbfxqc")
            .withDescription("ggeciradmxokbutb").withFolderId(3556959886109984896L)
            .withProjectVersion(4692852653848740418L).withProjectId(668264090121943233L)
            .withParameters(Arrays.asList(new SsisParameter().withId(525854716862013224L).withName("ifywxjjylaqhx")
                .withDescription("fdarvjhwgkynxlw").withDataType("gotdt").withRequired(false).withSensitive(true)
                .withDesignDefaultValue("lh").withDefaultValue("ybfnkylzrignqlwo").withSensitiveDefaultValue("nbjuaiu")
                .withValueType("mqcbnk").withValueSet(true).withVariable("i")));
        model = BinaryData.fromObject(model).toObject(SsisPackage.class);
        Assertions.assertEquals(4578072156366697994L, model.id());
        Assertions.assertEquals("ryywyfcenkbfxqc", model.name());
        Assertions.assertEquals("ggeciradmxokbutb", model.description());
        Assertions.assertEquals(3556959886109984896L, model.folderId());
        Assertions.assertEquals(4692852653848740418L, model.projectVersion());
        Assertions.assertEquals(668264090121943233L, model.projectId());
        Assertions.assertEquals(525854716862013224L, model.parameters().get(0).id());
        Assertions.assertEquals("ifywxjjylaqhx", model.parameters().get(0).name());
        Assertions.assertEquals("fdarvjhwgkynxlw", model.parameters().get(0).description());
        Assertions.assertEquals("gotdt", model.parameters().get(0).dataType());
        Assertions.assertEquals(false, model.parameters().get(0).required());
        Assertions.assertEquals(true, model.parameters().get(0).sensitive());
        Assertions.assertEquals("lh", model.parameters().get(0).designDefaultValue());
        Assertions.assertEquals("ybfnkylzrignqlwo", model.parameters().get(0).defaultValue());
        Assertions.assertEquals("nbjuaiu", model.parameters().get(0).sensitiveDefaultValue());
        Assertions.assertEquals("mqcbnk", model.parameters().get(0).valueType());
        Assertions.assertEquals(true, model.parameters().get(0).valueSet());
        Assertions.assertEquals("i", model.parameters().get(0).variable());
    }
}
