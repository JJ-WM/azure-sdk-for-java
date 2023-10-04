// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlow;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugPackage;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugPackageDebugSettings;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugResource;
import com.azure.resourcemanager.datafactory.models.DataFlowFolder;
import com.azure.resourcemanager.datafactory.models.DataFlowSourceSetting;
import com.azure.resourcemanager.datafactory.models.DataFlowStagingInfo;
import com.azure.resourcemanager.datafactory.models.Dataset;
import com.azure.resourcemanager.datafactory.models.DatasetDebugResource;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.LinkedService;
import com.azure.resourcemanager.datafactory.models.LinkedServiceDebugResource;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DataFlowDebugPackageTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataFlowDebugPackage model =
            BinaryData
                .fromString(
                    "{\"sessionId\":\"ryxynqnzrd\",\"dataFlow\":{\"properties\":{\"type\":\"DataFlow\",\"description\":\"vwxzn\",\"annotations\":[\"dataoeiy\",\"datab\",\"databp\",\"datahv\"],\"folder\":{\"name\":\"kvntjlrigjkskyri\"}},\"name\":\"vzidsxwaab\"},\"dataFlows\":[{\"properties\":{\"type\":\"DataFlow\",\"description\":\"rygznmmaxriz\",\"annotations\":[\"databgopxlhslnel\",\"dataieixynllxe\"],\"folder\":{\"name\":\"rojphslhcawjutif\"}},\"name\":\"fmvigorqjbttzh\"},{\"properties\":{\"type\":\"DataFlow\",\"description\":\"glka\",\"annotations\":[\"datan\",\"datajuj\",\"dataickpz\",\"datacpopmxel\"],\"folder\":{\"name\":\"ltyjedexxmlfmk\"}},\"name\":\"cazuaw\"}],\"datasets\":[{\"properties\":{\"type\":\"Dataset\",\"description\":\"puamwabzxr\",\"structure\":\"datacush\",\"schema\":\"datahaivm\",\"linkedServiceName\":{\"referenceName\":\"yasflvgsgzwy\",\"parameters\":{\"knsmjblmljhlnymz\":\"dataoi\"}},\"parameters\":{\"gtayxonsupeujlz\":{\"type\":\"Bool\",\"defaultValue\":\"datayuzcbmqqvxmvw\"},\"nzoibgsxgnx\":{\"type\":\"SecureString\",\"defaultValue\":\"datacvsql\"},\"bxiqxeiiqbimht\":{\"type\":\"Int\",\"defaultValue\":\"dataonmpqoxwdof\"},\"qpofvwbc\":{\"type\":\"Float\",\"defaultValue\":\"datainheh\"}},\"annotations\":[\"datambnkb\",\"datavqvxk\"],\"folder\":{\"name\":\"qihebw\"},\"\":{\"gi\":\"databzuwfmdurag\",\"igkxkbsazga\":\"datavcjfelisdjubggb\",\"apvu\":\"datagacyrcmjdmspo\",\"zjedmstkvnlv\":\"datarylniofrzg\"}},\"name\":\"c\"}],\"linkedServices\":[{\"properties\":{\"type\":\"LinkedService\",\"connectVia\":{\"referenceName\":\"nktwfansnvpdibmi\",\"parameters\":{\"yls\":\"datatbzbkiwbuqnyophz\"}},\"description\":\"rpfbcunezz\",\"parameters\":{\"psihcla\":{\"type\":\"Bool\",\"defaultValue\":\"datafwyfwlwxjwet\"},\"rsqqwztcm\":{\"type\":\"SecureString\",\"defaultValue\":\"dataaylp\"},\"jexfdeqvhp\":{\"type\":\"Array\",\"defaultValue\":\"datachcxwaxfewzj\"}},\"annotations\":[\"datakkshkbffm\",\"datamxzjrgywwpgjx\",\"datanptfujgi\",\"datagaao\"],\"\":{\"swvr\":\"datataqutdewem\",\"kimrt\":\"dataunzzjgehk\",\"jqepqwhi\":\"dataxokffqyin\"}},\"name\":\"onsts\"}],\"staging\":{\"linkedService\":{\"referenceName\":\"xgvelfclduccbird\",\"parameters\":{\"stmninwjizcilng\":\"datawcobie\"}},\"folderPath\":\"datashejjtbxqm\"},\"debugSettings\":{\"sourceSettings\":[{\"sourceName\":\"xqzv\",\"rowLimit\":411885173,\"\":{\"qbsms\":\"dataycucrwnamikzeb\",\"kzruswh\":\"dataziqgfuh\",\"ycjsx\":\"datahczznvf\",\"xqhndvnoamlds\":\"datawwixzvumw\"}},{\"sourceName\":\"aohdjh\",\"rowLimit\":1043529198,\"\":{\"agltsxoa\":\"datakxcoxpelnje\",\"npbs\":\"dataftgz\"}}],\"parameters\":{\"ipgawtxx\":\"datafloccsrmozih\"},\"datasetParameters\":\"datay\"},\"\":{\"pcycilrmcaykg\":\"datacjxgrytf\",\"pndfcpfnznt\":\"datanoxuztrksx\",\"xuzvoamktcqi\":\"datajtwkjaos\",\"rtltla\":\"datasmgbzahgxqdl\"}}")
                .toObject(DataFlowDebugPackage.class);
        Assertions.assertEquals("ryxynqnzrd", model.sessionId());
        Assertions.assertEquals("vzidsxwaab", model.dataFlow().name());
        Assertions.assertEquals("vwxzn", model.dataFlow().properties().description());
        Assertions.assertEquals("kvntjlrigjkskyri", model.dataFlow().properties().folder().name());
        Assertions.assertEquals("fmvigorqjbttzh", model.dataFlows().get(0).name());
        Assertions.assertEquals("rygznmmaxriz", model.dataFlows().get(0).properties().description());
        Assertions.assertEquals("rojphslhcawjutif", model.dataFlows().get(0).properties().folder().name());
        Assertions.assertEquals("c", model.datasets().get(0).name());
        Assertions.assertEquals("puamwabzxr", model.datasets().get(0).properties().description());
        Assertions
            .assertEquals("yasflvgsgzwy", model.datasets().get(0).properties().linkedServiceName().referenceName());
        Assertions
            .assertEquals(
                ParameterType.BOOL, model.datasets().get(0).properties().parameters().get("gtayxonsupeujlz").type());
        Assertions.assertEquals("qihebw", model.datasets().get(0).properties().folder().name());
        Assertions.assertEquals("onsts", model.linkedServices().get(0).name());
        Assertions
            .assertEquals("nktwfansnvpdibmi", model.linkedServices().get(0).properties().connectVia().referenceName());
        Assertions.assertEquals("rpfbcunezz", model.linkedServices().get(0).properties().description());
        Assertions
            .assertEquals(
                ParameterType.BOOL, model.linkedServices().get(0).properties().parameters().get("psihcla").type());
        Assertions.assertEquals("xgvelfclduccbird", model.staging().linkedService().referenceName());
        Assertions.assertEquals("xqzv", model.debugSettings().sourceSettings().get(0).sourceName());
        Assertions.assertEquals(411885173, model.debugSettings().sourceSettings().get(0).rowLimit());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataFlowDebugPackage model =
            new DataFlowDebugPackage()
                .withSessionId("ryxynqnzrd")
                .withDataFlow(
                    new DataFlowDebugResource()
                        .withName("vzidsxwaab")
                        .withProperties(
                            new DataFlow()
                                .withDescription("vwxzn")
                                .withAnnotations(Arrays.asList("dataoeiy", "datab", "databp", "datahv"))
                                .withFolder(new DataFlowFolder().withName("kvntjlrigjkskyri"))))
                .withDataFlows(
                    Arrays
                        .asList(
                            new DataFlowDebugResource()
                                .withName("fmvigorqjbttzh")
                                .withProperties(
                                    new DataFlow()
                                        .withDescription("rygznmmaxriz")
                                        .withAnnotations(Arrays.asList("databgopxlhslnel", "dataieixynllxe"))
                                        .withFolder(new DataFlowFolder().withName("rojphslhcawjutif"))),
                            new DataFlowDebugResource()
                                .withName("cazuaw")
                                .withProperties(
                                    new DataFlow()
                                        .withDescription("glka")
                                        .withAnnotations(Arrays.asList("datan", "datajuj", "dataickpz", "datacpopmxel"))
                                        .withFolder(new DataFlowFolder().withName("ltyjedexxmlfmk")))))
                .withDatasets(
                    Arrays
                        .asList(
                            new DatasetDebugResource()
                                .withName("c")
                                .withProperties(
                                    new Dataset()
                                        .withDescription("puamwabzxr")
                                        .withStructure("datacush")
                                        .withSchema("datahaivm")
                                        .withLinkedServiceName(
                                            new LinkedServiceReference()
                                                .withReferenceName("yasflvgsgzwy")
                                                .withParameters(mapOf("knsmjblmljhlnymz", "dataoi")))
                                        .withParameters(
                                            mapOf(
                                                "gtayxonsupeujlz",
                                                new ParameterSpecification()
                                                    .withType(ParameterType.BOOL)
                                                    .withDefaultValue("datayuzcbmqqvxmvw"),
                                                "nzoibgsxgnx",
                                                new ParameterSpecification()
                                                    .withType(ParameterType.SECURE_STRING)
                                                    .withDefaultValue("datacvsql"),
                                                "bxiqxeiiqbimht",
                                                new ParameterSpecification()
                                                    .withType(ParameterType.INT)
                                                    .withDefaultValue("dataonmpqoxwdof"),
                                                "qpofvwbc",
                                                new ParameterSpecification()
                                                    .withType(ParameterType.FLOAT)
                                                    .withDefaultValue("datainheh")))
                                        .withAnnotations(Arrays.asList("datambnkb", "datavqvxk"))
                                        .withFolder(new DatasetFolder().withName("qihebw"))
                                        .withAdditionalProperties(mapOf("type", "Dataset")))))
                .withLinkedServices(
                    Arrays
                        .asList(
                            new LinkedServiceDebugResource()
                                .withName("onsts")
                                .withProperties(
                                    new LinkedService()
                                        .withConnectVia(
                                            new IntegrationRuntimeReference()
                                                .withReferenceName("nktwfansnvpdibmi")
                                                .withParameters(mapOf("yls", "datatbzbkiwbuqnyophz")))
                                        .withDescription("rpfbcunezz")
                                        .withParameters(
                                            mapOf(
                                                "psihcla",
                                                new ParameterSpecification()
                                                    .withType(ParameterType.BOOL)
                                                    .withDefaultValue("datafwyfwlwxjwet"),
                                                "rsqqwztcm",
                                                new ParameterSpecification()
                                                    .withType(ParameterType.SECURE_STRING)
                                                    .withDefaultValue("dataaylp"),
                                                "jexfdeqvhp",
                                                new ParameterSpecification()
                                                    .withType(ParameterType.ARRAY)
                                                    .withDefaultValue("datachcxwaxfewzj")))
                                        .withAnnotations(
                                            Arrays
                                                .asList(
                                                    "datakkshkbffm", "datamxzjrgywwpgjx", "datanptfujgi", "datagaao"))
                                        .withAdditionalProperties(mapOf("type", "LinkedService")))))
                .withStaging(
                    new DataFlowStagingInfo()
                        .withLinkedService(
                            new LinkedServiceReference()
                                .withReferenceName("xgvelfclduccbird")
                                .withParameters(mapOf("stmninwjizcilng", "datawcobie")))
                        .withFolderPath("datashejjtbxqm"))
                .withDebugSettings(
                    new DataFlowDebugPackageDebugSettings()
                        .withSourceSettings(
                            Arrays
                                .asList(
                                    new DataFlowSourceSetting()
                                        .withSourceName("xqzv")
                                        .withRowLimit(411885173)
                                        .withAdditionalProperties(mapOf()),
                                    new DataFlowSourceSetting()
                                        .withSourceName("aohdjh")
                                        .withRowLimit(1043529198)
                                        .withAdditionalProperties(mapOf())))
                        .withParameters(mapOf("ipgawtxx", "datafloccsrmozih"))
                        .withDatasetParameters("datay"))
                .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(DataFlowDebugPackage.class);
        Assertions.assertEquals("ryxynqnzrd", model.sessionId());
        Assertions.assertEquals("vzidsxwaab", model.dataFlow().name());
        Assertions.assertEquals("vwxzn", model.dataFlow().properties().description());
        Assertions.assertEquals("kvntjlrigjkskyri", model.dataFlow().properties().folder().name());
        Assertions.assertEquals("fmvigorqjbttzh", model.dataFlows().get(0).name());
        Assertions.assertEquals("rygznmmaxriz", model.dataFlows().get(0).properties().description());
        Assertions.assertEquals("rojphslhcawjutif", model.dataFlows().get(0).properties().folder().name());
        Assertions.assertEquals("c", model.datasets().get(0).name());
        Assertions.assertEquals("puamwabzxr", model.datasets().get(0).properties().description());
        Assertions
            .assertEquals("yasflvgsgzwy", model.datasets().get(0).properties().linkedServiceName().referenceName());
        Assertions
            .assertEquals(
                ParameterType.BOOL, model.datasets().get(0).properties().parameters().get("gtayxonsupeujlz").type());
        Assertions.assertEquals("qihebw", model.datasets().get(0).properties().folder().name());
        Assertions.assertEquals("onsts", model.linkedServices().get(0).name());
        Assertions
            .assertEquals("nktwfansnvpdibmi", model.linkedServices().get(0).properties().connectVia().referenceName());
        Assertions.assertEquals("rpfbcunezz", model.linkedServices().get(0).properties().description());
        Assertions
            .assertEquals(
                ParameterType.BOOL, model.linkedServices().get(0).properties().parameters().get("psihcla").type());
        Assertions.assertEquals("xgvelfclduccbird", model.staging().linkedService().referenceName());
        Assertions.assertEquals("xqzv", model.debugSettings().sourceSettings().get(0).sourceName());
        Assertions.assertEquals(411885173, model.debugSettings().sourceSettings().get(0).rowLimit());
    }

    // Use "Map.of" if available
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
