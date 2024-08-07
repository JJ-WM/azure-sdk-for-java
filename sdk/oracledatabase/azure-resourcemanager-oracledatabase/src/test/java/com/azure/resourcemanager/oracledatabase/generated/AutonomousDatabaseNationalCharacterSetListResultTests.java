// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.AutonomousDatabaseNationalCharacterSetListResult;
import org.junit.jupiter.api.Assertions;

public final class AutonomousDatabaseNationalCharacterSetListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutonomousDatabaseNationalCharacterSetListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"characterSet\":\"yvpycanuzbpzk\"},\"id\":\"kuwbcrnwb\",\"name\":\"ehhseyvjusrts\",\"type\":\"hspkdeemao\"},{\"properties\":{\"characterSet\":\"ag\"},\"id\":\"t\",\"name\":\"elmqk\",\"type\":\"hahvljuahaq\"},{\"properties\":{\"characterSet\":\"dhmdua\"},\"id\":\"exq\",\"name\":\"vfadmws\",\"type\":\"crgvxpvgom\"},{\"properties\":{\"characterSet\":\"misgwbnb\"},\"id\":\"ldawkzbaliourqha\",\"name\":\"auhashsfwx\",\"type\":\"sowzxcugi\"}],\"nextLink\":\"ooxdjebwpuc\"}")
            .toObject(AutonomousDatabaseNationalCharacterSetListResult.class);
        Assertions.assertEquals("ooxdjebwpuc", model.nextLink());
    }
}
