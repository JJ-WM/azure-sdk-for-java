// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.fluent.models.LicenseProfileUpdateProperties;
import com.azure.resourcemanager.hybridcompute.models.LicenseProfileProductType;
import com.azure.resourcemanager.hybridcompute.models.LicenseProfileSubscriptionStatusUpdate;
import com.azure.resourcemanager.hybridcompute.models.ProductFeatureUpdate;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LicenseProfileUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LicenseProfileUpdateProperties model = BinaryData.fromString(
            "{\"softwareAssurance\":{\"softwareAssuranceCustomer\":false},\"esuProfile\":{\"assignedLicense\":\"fhir\"},\"productProfile\":{\"subscriptionStatus\":\"Enable\",\"productType\":\"WindowsIoTEnterprise\",\"productFeatures\":[{\"name\":\"pipiwyczuhxac\",\"subscriptionStatus\":\"Enable\"},{\"name\":\"ihhyuspskasd\",\"subscriptionStatus\":\"Enable\"},{\"name\":\"wdgzxulucv\",\"subscriptionStatus\":\"Disable\"}]}}")
            .toObject(LicenseProfileUpdateProperties.class);
        Assertions.assertEquals(false, model.softwareAssuranceCustomer());
        Assertions.assertEquals("fhir", model.assignedLicense());
        Assertions.assertEquals(LicenseProfileSubscriptionStatusUpdate.ENABLE, model.subscriptionStatus());
        Assertions.assertEquals(LicenseProfileProductType.WINDOWS_IO_TENTERPRISE, model.productType());
        Assertions.assertEquals("pipiwyczuhxac", model.productFeatures().get(0).name());
        Assertions.assertEquals(LicenseProfileSubscriptionStatusUpdate.ENABLE,
            model.productFeatures().get(0).subscriptionStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LicenseProfileUpdateProperties model = new LicenseProfileUpdateProperties().withSoftwareAssuranceCustomer(false)
            .withAssignedLicense("fhir")
            .withSubscriptionStatus(LicenseProfileSubscriptionStatusUpdate.ENABLE)
            .withProductType(LicenseProfileProductType.WINDOWS_IO_TENTERPRISE)
            .withProductFeatures(Arrays.asList(
                new ProductFeatureUpdate().withName("pipiwyczuhxac")
                    .withSubscriptionStatus(LicenseProfileSubscriptionStatusUpdate.ENABLE),
                new ProductFeatureUpdate().withName("ihhyuspskasd")
                    .withSubscriptionStatus(LicenseProfileSubscriptionStatusUpdate.ENABLE),
                new ProductFeatureUpdate().withName("wdgzxulucv")
                    .withSubscriptionStatus(LicenseProfileSubscriptionStatusUpdate.DISABLE)));
        model = BinaryData.fromObject(model).toObject(LicenseProfileUpdateProperties.class);
        Assertions.assertEquals(false, model.softwareAssuranceCustomer());
        Assertions.assertEquals("fhir", model.assignedLicense());
        Assertions.assertEquals(LicenseProfileSubscriptionStatusUpdate.ENABLE, model.subscriptionStatus());
        Assertions.assertEquals(LicenseProfileProductType.WINDOWS_IO_TENTERPRISE, model.productType());
        Assertions.assertEquals("pipiwyczuhxac", model.productFeatures().get(0).name());
        Assertions.assertEquals(LicenseProfileSubscriptionStatusUpdate.ENABLE,
            model.productFeatures().get(0).subscriptionStatus());
    }
}
