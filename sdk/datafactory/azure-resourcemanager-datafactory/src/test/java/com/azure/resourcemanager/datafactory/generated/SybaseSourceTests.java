// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SybaseSource;

public final class SybaseSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SybaseSource model = BinaryData.fromString(
            "{\"type\":\"SybaseSource\",\"query\":\"databro\",\"queryTimeout\":\"datamufaz\",\"additionalColumns\":\"datawzbew\",\"sourceRetryCount\":\"datasspe\",\"sourceRetryWait\":\"datajhwpn\",\"maxConcurrentConnections\":\"dataoucjzbovuvmdzdqt\",\"disableMetricsCollection\":\"dataguajsrdecbowkh\",\"\":{\"sujx\":\"datafllpdn\",\"aeykueat\":\"dataueqljzkhn\",\"ahvlzgsqwiubgb\":\"datatnprnshln\",\"cuxuxaihheg\":\"datatjyisjscuwylukt\"}}")
            .toObject(SybaseSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SybaseSource model = new SybaseSource().withSourceRetryCount("datasspe").withSourceRetryWait("datajhwpn")
            .withMaxConcurrentConnections("dataoucjzbovuvmdzdqt").withDisableMetricsCollection("dataguajsrdecbowkh")
            .withQueryTimeout("datamufaz").withAdditionalColumns("datawzbew").withQuery("databro");
        model = BinaryData.fromObject(model).toObject(SybaseSource.class);
    }
}
