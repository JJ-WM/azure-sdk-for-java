// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.TabularSource;

public final class TabularSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TabularSource model = BinaryData.fromString(
            "{\"type\":\"TabularSource\",\"queryTimeout\":\"datanycchpcjztz\",\"additionalColumns\":\"datauuyvpcfvinjxc\",\"sourceRetryCount\":\"datanetcxgdgqkletlw\",\"sourceRetryWait\":\"datatzbphxxvftj\",\"maxConcurrentConnections\":\"dataqg\",\"disableMetricsCollection\":\"datanmok\",\"\":{\"eeyskbqlcakle\":\"datatdnym\",\"okhbqmx\":\"datajgxdhgezyhph\",\"tyx\":\"dataglkqitpbyn\"}}")
            .toObject(TabularSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TabularSource model
            = new TabularSource().withSourceRetryCount("datanetcxgdgqkletlw").withSourceRetryWait("datatzbphxxvftj")
                .withMaxConcurrentConnections("dataqg").withDisableMetricsCollection("datanmok")
                .withQueryTimeout("datanycchpcjztz").withAdditionalColumns("datauuyvpcfvinjxc");
        model = BinaryData.fromObject(model).toObject(TabularSource.class);
    }
}
