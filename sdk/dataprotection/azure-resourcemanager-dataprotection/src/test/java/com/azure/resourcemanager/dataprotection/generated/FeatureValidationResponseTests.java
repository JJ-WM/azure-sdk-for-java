// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.FeatureSupportStatus;
import com.azure.resourcemanager.dataprotection.models.FeatureType;
import com.azure.resourcemanager.dataprotection.models.FeatureValidationResponse;
import com.azure.resourcemanager.dataprotection.models.SupportedFeature;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FeatureValidationResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FeatureValidationResponse model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"FeatureValidationResponse\",\"featureType\":\"DataSourceType\",\"features\":[{\"featureName\":\"wbdsr\",\"supportStatus\":\"NotSupported\",\"exposureControlledFeatures\":[\"hneuyowqkd\",\"ytisibir\",\"gpikpzimejza\"]}]}")
                .toObject(FeatureValidationResponse.class);
        Assertions.assertEquals(FeatureType.DATA_SOURCE_TYPE, model.featureType());
        Assertions.assertEquals("wbdsr", model.features().get(0).featureName());
        Assertions.assertEquals(FeatureSupportStatus.NOT_SUPPORTED, model.features().get(0).supportStatus());
        Assertions.assertEquals("hneuyowqkd", model.features().get(0).exposureControlledFeatures().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FeatureValidationResponse model =
            new FeatureValidationResponse()
                .withFeatureType(FeatureType.DATA_SOURCE_TYPE)
                .withFeatures(
                    Arrays
                        .asList(
                            new SupportedFeature()
                                .withFeatureName("wbdsr")
                                .withSupportStatus(FeatureSupportStatus.NOT_SUPPORTED)
                                .withExposureControlledFeatures(
                                    Arrays.asList("hneuyowqkd", "ytisibir", "gpikpzimejza"))));
        model = BinaryData.fromObject(model).toObject(FeatureValidationResponse.class);
        Assertions.assertEquals(FeatureType.DATA_SOURCE_TYPE, model.featureType());
        Assertions.assertEquals("wbdsr", model.features().get(0).featureName());
        Assertions.assertEquals(FeatureSupportStatus.NOT_SUPPORTED, model.features().get(0).supportStatus());
        Assertions.assertEquals("hneuyowqkd", model.features().get(0).exposureControlledFeatures().get(0));
    }
}
