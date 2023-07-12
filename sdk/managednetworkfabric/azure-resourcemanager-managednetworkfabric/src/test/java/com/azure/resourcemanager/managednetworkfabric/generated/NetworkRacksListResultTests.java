// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkRackInner;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkRacksListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class NetworkRacksListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkRacksListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"networkRackSku\":\"rkywuhpsvfuu\",\"networkFabricId\":\"utlwexxwla\",\"networkDevices\":[],\"provisioningState\":\"Deleting\",\"annotation\":\"zsrzpgepq\"},\"location\":\"bb\",\"tags\":{\"vl\":\"gdakchz\",\"ibn\":\"xqnrkcxk\",\"swqrntvlwijp\":\"mysu\"},\"id\":\"ttexoqqpwcyyufmh\",\"name\":\"uncuw\",\"type\":\"qspkcdqzhlctd\"},{\"properties\":{\"networkRackSku\":\"unqndyfpchrqb\",\"networkFabricId\":\"jjrcgegydc\",\"networkDevices\":[],\"provisioningState\":\"Failed\",\"annotation\":\"umvq\"},\"location\":\"lihrraiouaubr\",\"tags\":{\"fuojrngif\":\"oq\",\"dfqwmkyoq\":\"rzpasccbiuimzdly\",\"lzo\":\"fdvruz\",\"fnmdxotn\":\"hpc\"},\"id\":\"fdgugeyzi\",\"name\":\"grkyuizabsnmfpph\",\"type\":\"jee\"},{\"properties\":{\"networkRackSku\":\"yhyhsgzfczb\",\"networkFabricId\":\"omfgbeglqgleohib\",\"networkDevices\":[],\"provisioningState\":\"Deleting\",\"annotation\":\"ankrrfxee\"},\"location\":\"tijv\",\"tags\":{\"cevehjkuyxoafg\":\"bmqzbqqxlajrnwx\",\"linmfgv\":\"oqltfae\"},\"id\":\"irpghriypoqeyh\",\"name\":\"qhykprlpyzn\",\"type\":\"ciqdsme\"}],\"nextLink\":\"itdfuxtyasiib\"}")
                .toObject(NetworkRacksListResult.class);
        Assertions.assertEquals("bb", model.value().get(0).location());
        Assertions.assertEquals("gdakchz", model.value().get(0).tags().get("vl"));
        Assertions.assertEquals("rkywuhpsvfuu", model.value().get(0).networkRackSku());
        Assertions.assertEquals("utlwexxwla", model.value().get(0).networkFabricId());
        Assertions.assertEquals("zsrzpgepq", model.value().get(0).annotation());
        Assertions.assertEquals("itdfuxtyasiib", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkRacksListResult model =
            new NetworkRacksListResult()
                .withValue(
                    Arrays
                        .asList(
                            new NetworkRackInner()
                                .withLocation("bb")
                                .withTags(mapOf("vl", "gdakchz", "ibn", "xqnrkcxk", "swqrntvlwijp", "mysu"))
                                .withNetworkRackSku("rkywuhpsvfuu")
                                .withNetworkFabricId("utlwexxwla")
                                .withAnnotation("zsrzpgepq"),
                            new NetworkRackInner()
                                .withLocation("lihrraiouaubr")
                                .withTags(
                                    mapOf(
                                        "fuojrngif",
                                        "oq",
                                        "dfqwmkyoq",
                                        "rzpasccbiuimzdly",
                                        "lzo",
                                        "fdvruz",
                                        "fnmdxotn",
                                        "hpc"))
                                .withNetworkRackSku("unqndyfpchrqb")
                                .withNetworkFabricId("jjrcgegydc")
                                .withAnnotation("umvq"),
                            new NetworkRackInner()
                                .withLocation("tijv")
                                .withTags(mapOf("cevehjkuyxoafg", "bmqzbqqxlajrnwx", "linmfgv", "oqltfae"))
                                .withNetworkRackSku("yhyhsgzfczb")
                                .withNetworkFabricId("omfgbeglqgleohib")
                                .withAnnotation("ankrrfxee")))
                .withNextLink("itdfuxtyasiib");
        model = BinaryData.fromObject(model).toObject(NetworkRacksListResult.class);
        Assertions.assertEquals("bb", model.value().get(0).location());
        Assertions.assertEquals("gdakchz", model.value().get(0).tags().get("vl"));
        Assertions.assertEquals("rkywuhpsvfuu", model.value().get(0).networkRackSku());
        Assertions.assertEquals("utlwexxwla", model.value().get(0).networkFabricId());
        Assertions.assertEquals("zsrzpgepq", model.value().get(0).annotation());
        Assertions.assertEquals("itdfuxtyasiib", model.nextLink());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
