// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.models.PreferredContactMethod;
import com.azure.resourcemanager.support.models.UpdateContactProfile;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UpdateContactProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateContactProfile model =
            BinaryData
                .fromString(
                    "{\"firstName\":\"ucww\",\"lastName\":\"ovbvmeueciv\",\"preferredContactMethod\":\"phone\",\"primaryEmailAddress\":\"euojgjrwju\",\"additionalEmailAddresses\":[\"twm\",\"dytdxwitx\"],\"phoneNumber\":\"jawgqwg\",\"preferredTimeZone\":\"ni\",\"country\":\"x\",\"preferredSupportLanguage\":\"kpycgklwndnhjd\"}")
                .toObject(UpdateContactProfile.class);
        Assertions.assertEquals("ucww", model.firstName());
        Assertions.assertEquals("ovbvmeueciv", model.lastName());
        Assertions.assertEquals(PreferredContactMethod.PHONE, model.preferredContactMethod());
        Assertions.assertEquals("euojgjrwju", model.primaryEmailAddress());
        Assertions.assertEquals("twm", model.additionalEmailAddresses().get(0));
        Assertions.assertEquals("jawgqwg", model.phoneNumber());
        Assertions.assertEquals("ni", model.preferredTimeZone());
        Assertions.assertEquals("x", model.country());
        Assertions.assertEquals("kpycgklwndnhjd", model.preferredSupportLanguage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateContactProfile model =
            new UpdateContactProfile()
                .withFirstName("ucww")
                .withLastName("ovbvmeueciv")
                .withPreferredContactMethod(PreferredContactMethod.PHONE)
                .withPrimaryEmailAddress("euojgjrwju")
                .withAdditionalEmailAddresses(Arrays.asList("twm", "dytdxwitx"))
                .withPhoneNumber("jawgqwg")
                .withPreferredTimeZone("ni")
                .withCountry("x")
                .withPreferredSupportLanguage("kpycgklwndnhjd");
        model = BinaryData.fromObject(model).toObject(UpdateContactProfile.class);
        Assertions.assertEquals("ucww", model.firstName());
        Assertions.assertEquals("ovbvmeueciv", model.lastName());
        Assertions.assertEquals(PreferredContactMethod.PHONE, model.preferredContactMethod());
        Assertions.assertEquals("euojgjrwju", model.primaryEmailAddress());
        Assertions.assertEquals("twm", model.additionalEmailAddresses().get(0));
        Assertions.assertEquals("jawgqwg", model.phoneNumber());
        Assertions.assertEquals("ni", model.preferredTimeZone());
        Assertions.assertEquals("x", model.country());
        Assertions.assertEquals("kpycgklwndnhjd", model.preferredSupportLanguage());
    }
}
