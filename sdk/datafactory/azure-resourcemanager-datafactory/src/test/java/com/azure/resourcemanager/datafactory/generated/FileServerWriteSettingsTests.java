// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.FileServerWriteSettings;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import java.util.Arrays;

public final class FileServerWriteSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FileServerWriteSettings model = BinaryData.fromString(
            "{\"type\":\"FileServerWriteSettings\",\"maxConcurrentConnections\":\"datasqvubwwqgiyu\",\"disableMetricsCollection\":\"datarvwjxmwal\",\"copyBehavior\":\"datajtnsnbpiuvqho\",\"metadata\":[{\"name\":\"datartrsnpbsung\",\"value\":\"datakkmkzfbjucg\"},{\"name\":\"datazjyrdiiwhmrhzq\",\"value\":\"datapjydwm\"}],\"\":{\"pqupdcsvzugiur\":\"dataytjpua\",\"jzscrjtnq\":\"datagqlvl\"}}")
            .toObject(FileServerWriteSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FileServerWriteSettings model = new FileServerWriteSettings().withMaxConcurrentConnections("datasqvubwwqgiyu")
            .withDisableMetricsCollection("datarvwjxmwal").withCopyBehavior("datajtnsnbpiuvqho")
            .withMetadata(Arrays.asList(new MetadataItem().withName("datartrsnpbsung").withValue("datakkmkzfbjucg"),
                new MetadataItem().withName("datazjyrdiiwhmrhzq").withValue("datapjydwm")));
        model = BinaryData.fromObject(model).toObject(FileServerWriteSettings.class);
    }
}
