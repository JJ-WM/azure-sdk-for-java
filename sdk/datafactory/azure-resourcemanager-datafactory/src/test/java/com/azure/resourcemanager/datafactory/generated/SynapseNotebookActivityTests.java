// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.BigDataPoolParametrizationReference;
import com.azure.resourcemanager.datafactory.models.BigDataPoolReferenceType;
import com.azure.resourcemanager.datafactory.models.ConfigurationType;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.NotebookParameter;
import com.azure.resourcemanager.datafactory.models.NotebookParameterType;
import com.azure.resourcemanager.datafactory.models.NotebookReferenceType;
import com.azure.resourcemanager.datafactory.models.SparkConfigurationParametrizationReference;
import com.azure.resourcemanager.datafactory.models.SparkConfigurationReferenceType;
import com.azure.resourcemanager.datafactory.models.SynapseNotebookActivity;
import com.azure.resourcemanager.datafactory.models.SynapseNotebookReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SynapseNotebookActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SynapseNotebookActivity model = BinaryData.fromString(
            "{\"type\":\"SynapseNotebook\",\"typeProperties\":{\"notebook\":{\"type\":\"NotebookReference\",\"referenceName\":\"datamcblmza\"},\"sparkPool\":{\"type\":\"BigDataPoolReference\",\"referenceName\":\"datasmpcajx\"},\"parameters\":{\"pysg\":{\"value\":\"datapdkrjlwrqhehnazc\",\"type\":\"int\"},\"iumccomjxx\":{\"value\":\"dataivoahek\",\"type\":\"bool\"},\"hrkhfyaxiw\":{\"value\":\"dataaf\",\"type\":\"float\"},\"rbogzwwyub\":{\"value\":\"datazsimbgvrksjjq\",\"type\":\"string\"}},\"executorSize\":\"datapocjyjqem\",\"conf\":\"datakjxuxmkkgbyjfe\",\"driverSize\":\"databnwfekpgllezvr\",\"numExecutors\":\"datawsffk\",\"configurationType\":\"Customized\",\"targetSparkConfiguration\":{\"type\":\"SparkConfigurationReference\",\"referenceName\":\"databsvkijynvguh\"},\"sparkConfig\":{\"sclrvquwhmncewcf\":\"datan\",\"xsybtpqgxzogclu\":\"datansoim\",\"i\":\"dataicnckdxflg\"}},\"linkedServiceName\":{\"referenceName\":\"ce\",\"parameters\":{\"mrsbgjjuhzf\":\"datacerrpal\"}},\"policy\":{\"timeout\":\"dataabyvmchhkwlmit\",\"retry\":\"databivhkdxhnv\",\"retryIntervalInSeconds\":559455759,\"secureInput\":true,\"secureOutput\":true,\"\":{\"bgv\":\"datas\",\"vvhovkadmih\":\"datazzukhl\",\"nl\":\"datab\",\"fjqobbpjlrvxryjx\":\"datajzdahckijvikpgz\"}},\"name\":\"dlgignja\",\"description\":\"cixwtwzgbuhcrwqr\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"mfufs\",\"dependencyConditions\":[\"Failed\",\"Failed\",\"Skipped\",\"Skipped\"],\"\":{\"lcqaafuwxeho\":\"datae\",\"q\":\"dataazbgcbd\",\"vtimyccdognhw\":\"datay\"}},{\"activity\":\"vgowkak\",\"dependencyConditions\":[\"Skipped\"],\"\":{\"dv\":\"datajiykwbytuzhcpx\",\"y\":\"datafxvrfez\"}},{\"activity\":\"iyovcrmoalvea\",\"dependencyConditions\":[\"Failed\"],\"\":{\"jpedowmhgzrri\":\"datazr\",\"qqfycw\":\"datavyugxnopd\",\"ki\":\"dataupxf\"}},{\"activity\":\"mhvpxptq\",\"dependencyConditions\":[\"Skipped\",\"Skipped\",\"Failed\",\"Failed\"],\"\":{\"spnsbbhdjee\":\"datamxnjk\"}}],\"userProperties\":[{\"name\":\"cykihym\",\"value\":\"datagukf\"},{\"name\":\"kqok\",\"value\":\"datavxknygimoh\"},{\"name\":\"llxjyxhwv\",\"value\":\"datayupszch\"},{\"name\":\"wnudd\",\"value\":\"dataazvsmnxblc\"}],\"\":{\"yn\":\"dataymgfwdxukmeoxe\",\"uqm\":\"datarbwvai\",\"ztorvwgpjxdii\":\"dataaqoqjnvmfmrymk\"}}")
            .toObject(SynapseNotebookActivity.class);
        Assertions.assertEquals("dlgignja", model.name());
        Assertions.assertEquals("cixwtwzgbuhcrwqr", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.onInactiveMarkAs());
        Assertions.assertEquals("mfufs", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("cykihym", model.userProperties().get(0).name());
        Assertions.assertEquals("ce", model.linkedServiceName().referenceName());
        Assertions.assertEquals(559455759, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals(NotebookReferenceType.NOTEBOOK_REFERENCE, model.notebook().type());
        Assertions.assertEquals(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE, model.sparkPool().type());
        Assertions.assertEquals(NotebookParameterType.INT, model.parameters().get("pysg").type());
        Assertions.assertEquals(ConfigurationType.CUSTOMIZED, model.configurationType());
        Assertions.assertEquals(SparkConfigurationReferenceType.SPARK_CONFIGURATION_REFERENCE,
            model.targetSparkConfiguration().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SynapseNotebookActivity model = new SynapseNotebookActivity().withName("dlgignja")
            .withDescription("cixwtwzgbuhcrwqr").withState(ActivityState.INACTIVE)
            .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
            .withDependsOn(Arrays.asList(
                new ActivityDependency().withActivity("mfufs")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED, DependencyCondition.FAILED,
                        DependencyCondition.SKIPPED, DependencyCondition.SKIPPED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("vgowkak")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("iyovcrmoalvea")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("mhvpxptq")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.SKIPPED,
                        DependencyCondition.FAILED, DependencyCondition.FAILED))
                    .withAdditionalProperties(mapOf())))
            .withUserProperties(Arrays.asList(new UserProperty().withName("cykihym").withValue("datagukf"),
                new UserProperty().withName("kqok").withValue("datavxknygimoh"),
                new UserProperty().withName("llxjyxhwv").withValue("datayupszch"),
                new UserProperty().withName("wnudd").withValue("dataazvsmnxblc")))
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("ce")
                .withParameters(mapOf("mrsbgjjuhzf", "datacerrpal")))
            .withPolicy(new ActivityPolicy().withTimeout("dataabyvmchhkwlmit").withRetry("databivhkdxhnv")
                .withRetryIntervalInSeconds(559455759).withSecureInput(true).withSecureOutput(true)
                .withAdditionalProperties(mapOf()))
            .withNotebook(new SynapseNotebookReference().withType(NotebookReferenceType.NOTEBOOK_REFERENCE)
                .withReferenceName("datamcblmza"))
            .withSparkPool(new BigDataPoolParametrizationReference()
                .withType(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE).withReferenceName("datasmpcajx"))
            .withParameters(mapOf("pysg",
                new NotebookParameter().withValue("datapdkrjlwrqhehnazc").withType(NotebookParameterType.INT),
                "iumccomjxx", new NotebookParameter().withValue("dataivoahek").withType(NotebookParameterType.BOOL),
                "hrkhfyaxiw", new NotebookParameter().withValue("dataaf").withType(NotebookParameterType.FLOAT),
                "rbogzwwyub",
                new NotebookParameter().withValue("datazsimbgvrksjjq").withType(NotebookParameterType.STRING)))
            .withExecutorSize("datapocjyjqem").withConf("datakjxuxmkkgbyjfe").withDriverSize("databnwfekpgllezvr")
            .withNumExecutors("datawsffk").withConfigurationType(ConfigurationType.CUSTOMIZED)
            .withTargetSparkConfiguration(new SparkConfigurationParametrizationReference()
                .withType(SparkConfigurationReferenceType.SPARK_CONFIGURATION_REFERENCE)
                .withReferenceName("databsvkijynvguh"))
            .withSparkConfig(mapOf("sclrvquwhmncewcf", "datan", "xsybtpqgxzogclu", "datansoim", "i", "dataicnckdxflg"));
        model = BinaryData.fromObject(model).toObject(SynapseNotebookActivity.class);
        Assertions.assertEquals("dlgignja", model.name());
        Assertions.assertEquals("cixwtwzgbuhcrwqr", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.onInactiveMarkAs());
        Assertions.assertEquals("mfufs", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("cykihym", model.userProperties().get(0).name());
        Assertions.assertEquals("ce", model.linkedServiceName().referenceName());
        Assertions.assertEquals(559455759, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals(NotebookReferenceType.NOTEBOOK_REFERENCE, model.notebook().type());
        Assertions.assertEquals(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE, model.sparkPool().type());
        Assertions.assertEquals(NotebookParameterType.INT, model.parameters().get("pysg").type());
        Assertions.assertEquals(ConfigurationType.CUSTOMIZED, model.configurationType());
        Assertions.assertEquals(SparkConfigurationReferenceType.SPARK_CONFIGURATION_REFERENCE,
            model.targetSparkConfiguration().type());
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
