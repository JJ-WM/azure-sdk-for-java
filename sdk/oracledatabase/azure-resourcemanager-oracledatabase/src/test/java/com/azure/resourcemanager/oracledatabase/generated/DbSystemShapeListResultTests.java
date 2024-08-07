// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.DbSystemShapeListResult;
import org.junit.jupiter.api.Assertions;

public final class DbSystemShapeListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DbSystemShapeListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"shapeFamily\":\"t\",\"availableCoreCount\":1491290789,\"minimumCoreCount\":777481009,\"runtimeMinimumCoreCount\":1258750458,\"coreCountIncrement\":1397437100,\"minStorageCount\":1232796575,\"maxStorageCount\":1519275761,\"availableDataStoragePerServerInTbs\":54.5079147632145,\"availableMemoryPerNodeInGbs\":1214313613,\"availableDbNodePerNodeInGbs\":1999029226,\"minCoreCountPerNode\":350152394,\"availableMemoryInGbs\":1115460475,\"minMemoryPerNodeInGbs\":580617744,\"availableDbNodeStorageInGbs\":1773507503,\"minDbNodeStoragePerNodeInGbs\":957944639,\"availableDataStorageInTbs\":1672254683,\"minDataStorageInTbs\":2086388671,\"minimumNodeCount\":351214213,\"maximumNodeCount\":2051758056,\"availableCoreCountPerNode\":1378087535},\"id\":\"bp\",\"name\":\"xqpsrknftguv\",\"type\":\"iuhprwmdyvxqta\"},{\"properties\":{\"shapeFamily\":\"ww\",\"availableCoreCount\":1692678524,\"minimumCoreCount\":1731999756,\"runtimeMinimumCoreCount\":1603221085,\"coreCountIncrement\":591654502,\"minStorageCount\":1070859381,\"maxStorageCount\":75631080,\"availableDataStoragePerServerInTbs\":81.21344104639293,\"availableMemoryPerNodeInGbs\":934632065,\"availableDbNodePerNodeInGbs\":988905675,\"minCoreCountPerNode\":2121055666,\"availableMemoryInGbs\":841332893,\"minMemoryPerNodeInGbs\":1391032405,\"availableDbNodeStorageInGbs\":1995543121,\"minDbNodeStoragePerNodeInGbs\":488274582,\"availableDataStorageInTbs\":673503494,\"minDataStorageInTbs\":2048055130,\"minimumNodeCount\":1125430045,\"maximumNodeCount\":1715507551,\"availableCoreCountPerNode\":1436102139},\"id\":\"zcjrvxdjzlmwlx\",\"name\":\"vu\",\"type\":\"fhzovawjvzunluth\"}],\"nextLink\":\"prnxipeil\"}")
            .toObject(DbSystemShapeListResult.class);
        Assertions.assertEquals("prnxipeil", model.nextLink());
    }
}
