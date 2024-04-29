// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.selfhelp.models.QuestionType;
import com.azure.resourcemanager.selfhelp.models.TroubleshooterResponse;
import org.junit.jupiter.api.Assertions;

public final class TroubleshooterResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TroubleshooterResponse model = BinaryData
            .fromString(
                "{\"questionId\":\"cxogaokonzm\",\"questionType\":\"DateTimePicker\",\"response\":\"vmkqzeqq\"}")
            .toObject(TroubleshooterResponse.class);
        Assertions.assertEquals("cxogaokonzm", model.questionId());
        Assertions.assertEquals(QuestionType.DATE_TIME_PICKER, model.questionType());
        Assertions.assertEquals("vmkqzeqq", model.response());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TroubleshooterResponse model = new TroubleshooterResponse().withQuestionId("cxogaokonzm")
            .withQuestionType(QuestionType.DATE_TIME_PICKER)
            .withResponse("vmkqzeqq");
        model = BinaryData.fromObject(model).toObject(TroubleshooterResponse.class);
        Assertions.assertEquals("cxogaokonzm", model.questionId());
        Assertions.assertEquals(QuestionType.DATE_TIME_PICKER, model.questionType());
        Assertions.assertEquals("vmkqzeqq", model.response());
    }
}
