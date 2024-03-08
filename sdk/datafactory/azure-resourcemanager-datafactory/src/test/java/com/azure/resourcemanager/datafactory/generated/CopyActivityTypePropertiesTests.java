// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.CopyActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.CopyActivityLogSettings;
import com.azure.resourcemanager.datafactory.models.CopySink;
import com.azure.resourcemanager.datafactory.models.CopySource;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.LogLocationSettings;
import com.azure.resourcemanager.datafactory.models.LogSettings;
import com.azure.resourcemanager.datafactory.models.LogStorageSettings;
import com.azure.resourcemanager.datafactory.models.RedirectIncompatibleRowSettings;
import com.azure.resourcemanager.datafactory.models.SkipErrorFile;
import com.azure.resourcemanager.datafactory.models.StagingSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CopyActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CopyActivityTypeProperties model = BinaryData.fromString(
            "{\"source\":{\"type\":\"CopySource\",\"sourceRetryCount\":\"datapuotmkbofuhmhk\",\"sourceRetryWait\":\"dataouzvegtnphnotr\",\"maxConcurrentConnections\":\"datayje\",\"disableMetricsCollection\":\"dataovjdunbaetsdufe\",\"\":{\"gzrzubdtzsac\":\"datavkuz\",\"kbxkzcfios\":\"datamhzpurnp\",\"d\":\"dataalbx\",\"fpqfpkrmlbkv\":\"datanluvcwuafbhxoa\"}},\"sink\":{\"type\":\"CopySink\",\"writeBatchSize\":\"datagzawfoqdnxu\",\"writeBatchTimeout\":\"datafvnvscyutqwsynt\",\"sinkRetryCount\":\"datarluqaqn\",\"sinkRetryWait\":\"datag\",\"maxConcurrentConnections\":\"datab\",\"disableMetricsCollection\":\"datajbozkl\",\"\":{\"sm\":\"datafv\",\"auwmsnplqfivx\":\"datak\"}},\"translator\":\"datamdjzgovmkplrjk\",\"enableStaging\":\"dataaxoe\",\"stagingSettings\":{\"linkedServiceName\":{\"referenceName\":\"pofaogvmq\",\"parameters\":{\"pkdpnjldwcxjvexl\":\"datarqcqhwfskmkd\",\"yypvhdulds\":\"datatxcmcccotqocn\",\"zzbr\":\"datal\",\"lkpvaagrdf\":\"datafke\"}},\"path\":\"dataglqdsphvosucryh\",\"enableCompression\":\"datahthzfotfrfhrjkah\",\"\":{\"ppnitrmzvnrfkzn\":\"datashgmqxw\",\"rnxrjmilogcn\":\"dataaittbmobrxhwpg\",\"plrtxhzt\":\"datafgqibb\"}},\"parallelCopies\":\"datawyrsfj\",\"dataIntegrationUnits\":\"dataoyusrbuydeyh\",\"enableSkipIncompatibleRow\":\"datattkdrblehenj\",\"redirectIncompatibleRowSettings\":{\"linkedServiceName\":\"dataiwdeosbijikjf\",\"path\":\"databuwhbpojuj\",\"\":{\"viwxola\":\"dataxtgrxavfj\"}},\"logStorageSettings\":{\"linkedServiceName\":{\"referenceName\":\"rwchp\",\"parameters\":{\"xlncohywfvyria\":\"datauvrsczw\",\"bdo\":\"datafwwsgd\",\"pfwmfcorto\":\"datas\"}},\"path\":\"datathjyyirybuqmkm\",\"logLevel\":\"dataoknvyilhoso\",\"enableReliableLogging\":\"dataioxgsrhxoyrg\",\"\":{\"glbplqhbrar\":\"datacctm\",\"xufyqc\":\"datakdep\"}},\"logSettings\":{\"enableCopyActivityLog\":\"datauhyeyxgxbgochpxp\",\"copyActivityLogSettings\":{\"logLevel\":\"datawwsioozrugbdkxl\",\"enableReliableLogging\":\"datakuvlzkzjjtapv\"},\"logLocationSettings\":{\"linkedServiceName\":{\"referenceName\":\"jebtdpsgkeexs\",\"parameters\":{\"vtytwtfqpmpywwy\":\"datakvy\",\"cdqun\":\"dataukqmjcwdo\",\"chdxjrrby\":\"datauqco\",\"uoup\":\"databnkqps\"}},\"path\":\"datagdtuhdoimojcm\"}},\"preserveRules\":[\"datadxwvorzhzfocgf\"],\"preserve\":[\"dataornvbhuyolw\",\"datafbdwyvvcywb\",\"datavkthrexzve\",\"dataqzy\"],\"validateDataConsistency\":\"datakloke\",\"skipErrorFile\":{\"fileMissing\":\"datawbpi\",\"dataInconsistency\":\"datahvg\"}}")
            .toObject(CopyActivityTypeProperties.class);
        Assertions.assertEquals("pofaogvmq", model.stagingSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("rwchp", model.logStorageSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("jebtdpsgkeexs",
            model.logSettings().logLocationSettings().linkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CopyActivityTypeProperties model = new CopyActivityTypeProperties()
            .withSource(
                new CopySource().withSourceRetryCount("datapuotmkbofuhmhk").withSourceRetryWait("dataouzvegtnphnotr")
                    .withMaxConcurrentConnections("datayje").withDisableMetricsCollection("dataovjdunbaetsdufe")
                    .withAdditionalProperties(mapOf("type", "CopySource")))
            .withSink(new CopySink().withWriteBatchSize("datagzawfoqdnxu").withWriteBatchTimeout("datafvnvscyutqwsynt")
                .withSinkRetryCount("datarluqaqn").withSinkRetryWait("datag").withMaxConcurrentConnections("datab")
                .withDisableMetricsCollection("datajbozkl").withAdditionalProperties(mapOf("type", "CopySink")))
            .withTranslator("datamdjzgovmkplrjk").withEnableStaging("dataaxoe")
            .withStagingSettings(new StagingSettings()
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("pofaogvmq")
                    .withParameters(mapOf("pkdpnjldwcxjvexl", "datarqcqhwfskmkd", "yypvhdulds", "datatxcmcccotqocn",
                        "zzbr", "datal", "lkpvaagrdf", "datafke")))
                .withPath("dataglqdsphvosucryh").withEnableCompression("datahthzfotfrfhrjkah")
                .withAdditionalProperties(mapOf()))
            .withParallelCopies("datawyrsfj").withDataIntegrationUnits("dataoyusrbuydeyh")
            .withEnableSkipIncompatibleRow("datattkdrblehenj")
            .withRedirectIncompatibleRowSettings(
                new RedirectIncompatibleRowSettings()
                    .withLinkedServiceName("dataiwdeosbijikjf").withPath("databuwhbpojuj").withAdditionalProperties(
                        mapOf()))
            .withLogStorageSettings(new LogStorageSettings()
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("rwchp")
                    .withParameters(mapOf("xlncohywfvyria", "datauvrsczw", "bdo", "datafwwsgd", "pfwmfcorto", "datas")))
                .withPath("datathjyyirybuqmkm").withLogLevel("dataoknvyilhoso")
                .withEnableReliableLogging("dataioxgsrhxoyrg").withAdditionalProperties(mapOf()))
            .withLogSettings(
                new LogSettings().withEnableCopyActivityLog("datauhyeyxgxbgochpxp")
                    .withCopyActivityLogSettings(
                        new CopyActivityLogSettings().withLogLevel("datawwsioozrugbdkxl")
                            .withEnableReliableLogging("datakuvlzkzjjtapv"))
                    .withLogLocationSettings(new LogLocationSettings()
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("jebtdpsgkeexs")
                            .withParameters(mapOf("vtytwtfqpmpywwy", "datakvy", "cdqun", "dataukqmjcwdo", "chdxjrrby",
                                "datauqco", "uoup", "databnkqps")))
                        .withPath("datagdtuhdoimojcm")))
            .withPreserveRules(Arrays.asList("datadxwvorzhzfocgf"))
            .withPreserve(Arrays.asList("dataornvbhuyolw", "datafbdwyvvcywb", "datavkthrexzve", "dataqzy"))
            .withValidateDataConsistency("datakloke")
            .withSkipErrorFile(new SkipErrorFile().withFileMissing("datawbpi").withDataInconsistency("datahvg"));
        model = BinaryData.fromObject(model).toObject(CopyActivityTypeProperties.class);
        Assertions.assertEquals("pofaogvmq", model.stagingSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("rwchp", model.logStorageSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("jebtdpsgkeexs",
            model.logSettings().logLocationSettings().linkedServiceName().referenceName());
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
