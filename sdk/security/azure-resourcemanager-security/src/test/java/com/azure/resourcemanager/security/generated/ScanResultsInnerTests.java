// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.ScanResultInner;
import com.azure.resourcemanager.security.fluent.models.ScanResultsInner;
import com.azure.resourcemanager.security.models.Baseline;
import com.azure.resourcemanager.security.models.BaselineAdjustedResult;
import com.azure.resourcemanager.security.models.BenchmarkReference;
import com.azure.resourcemanager.security.models.QueryCheck;
import com.azure.resourcemanager.security.models.Remediation;
import com.azure.resourcemanager.security.models.RuleSeverity;
import com.azure.resourcemanager.security.models.RuleStatus;
import com.azure.resourcemanager.security.models.RuleType;
import com.azure.resourcemanager.security.models.ScanResultProperties;
import com.azure.resourcemanager.security.models.VaRule;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScanResultsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScanResultsInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"ruleId\":\"tpiymerteea\",\"status\":\"NonFinding\",\"isTrimmed\":true,\"queryResults\":[[\"kzddrtkgdojbmxva\",\"refdee\",\"vecuijpx\",\"xs\"]],\"remediation\":{\"description\":\"rtujwsawddjibab\",\"scripts\":[\"titvtzeexavox\",\"fglecdmdqbwp\",\"pqtgsfjac\",\"slhhxudbxv\"],\"automated\":false,\"portalLink\":\"nsiru\"},\"baselineAdjustedResult\":{\"baseline\":{\"expectedResults\":[[]],\"updatedTime\":\"2021-01-18T07:47:20Z\"},\"status\":\"InternalError\",\"resultsNotInBaseline\":[[\"agzrcxfa\",\"lc\",\"xwmdboxd\",\"gsftufqobrjlnacg\"],[\"kknhxkizvytnrzv\",\"lj\",\"aaeranokqgukk\"]],\"resultsOnlyInBaseline\":[[\"broyla\",\"xulcdisdos\",\"jbjsvgjrwh\"],[\"vyc\",\"t\",\"c\",\"xgccknfnw\"],[\"tmvpdvjdhtt\",\"a\",\"fedxihchrphkm\",\"rjdqnsdfzp\"]]},\"ruleMetadata\":{\"ruleId\":\"gkylkdghr\",\"severity\":\"High\",\"category\":\"tl\",\"ruleType\":\"Binary\",\"title\":\"w\",\"description\":\"okvbwnhhtqlgehg\",\"rationale\":\"ipifhpfeoajvg\",\"queryCheck\":{\"query\":\"xjcsheafidltu\",\"expectedResult\":[[],[],[],[]],\"columnNames\":[\"mks\",\"jhoiftxfkfweg\"]},\"benchmarkReferences\":[{}]}},\"id\":\"ptil\",\"name\":\"ucb\",\"type\":\"qtgdqohmcwsl\"},{\"properties\":{\"ruleId\":\"zetpwbra\",\"status\":\"InternalError\",\"isTrimmed\":true,\"queryResults\":[[\"qzmiza\",\"a\",\"ankjpdnjzh\"],[\"oylhjlmuoyxprimr\",\"opteecj\"],[\"islstv\",\"sylwxdzaumweooh\",\"uufuz\",\"oyjathwtzol\"],[\"emwmdxmebwjs\"]],\"remediation\":{\"description\":\"ahlxveabfqxnm\",\"scripts\":[\"tibxyijddtvqctt\",\"dija\",\"ukm\"],\"automated\":true,\"portalLink\":\"ekpndzaapmudq\"},\"baselineAdjustedResult\":{\"baseline\":{\"expectedResults\":[[],[]],\"updatedTime\":\"2021-01-22T13:34:38Z\"},\"status\":\"Finding\",\"resultsNotInBaseline\":[[\"wyxebeybpmzz\",\"rtffyaqitmh\",\"eioqaqhvse\"],[\"uqyrxpdl\",\"gql\",\"ismjqfrddgamqu\",\"iosrsjuivfcdis\"]],\"resultsOnlyInBaseline\":[[\"xzhczexrxz\",\"ujrtrhqvwr\"],[\"khgn\"]]},\"ruleMetadata\":{\"ruleId\":\"onzlr\",\"severity\":\"Low\",\"category\":\"wncvjtszcofiz\",\"ruleType\":\"PositiveList\",\"title\":\"hgbjkvrelje\",\"description\":\"urvzmlovuanashc\",\"rationale\":\"pmjerbdkelvidiz\",\"queryCheck\":{\"query\":\"db\",\"expectedResult\":[[],[]],\"columnNames\":[\"on\",\"dgnwncypuuwwlt\",\"uqj\",\"tzenk\"]},\"benchmarkReferences\":[{},{},{}]}},\"id\":\"zzhmkd\",\"name\":\"svflyhbxcudch\",\"type\":\"gsrboldforobw\"},{\"properties\":{\"ruleId\":\"izbfhfovvacq\",\"status\":\"InternalError\",\"isTrimmed\":true,\"queryResults\":[[\"szabbelawu\",\"ua\",\"lzkwrrwoy\",\"qucwyhahnom\"]],\"remediation\":{\"description\":\"ywuhpsvfuur\",\"scripts\":[\"we\",\"xwlalniexzsrzpg\"],\"automated\":false,\"portalLink\":\"yb\"},\"baselineAdjustedResult\":{\"baseline\":{\"expectedResults\":[[],[]],\"updatedTime\":\"2021-08-07T11:45:57Z\"},\"status\":\"InternalError\",\"resultsNotInBaseline\":[[\"vl\",\"xqnrkcxk\",\"ibn\"],[\"ysux\"]],\"resultsOnlyInBaseline\":[[\"ntvlwijpsttexo\",\"qpwcyyufmh\",\"uncuw\"],[\"spkcdqzh\",\"ctddun\",\"ndy\",\"pchrqbn\"]]},\"ruleMetadata\":{\"ruleId\":\"cgegydcwbo\",\"severity\":\"Informational\",\"category\":\"vqqolih\",\"ruleType\":\"PositiveList\",\"title\":\"ouau\",\"description\":\"jtlo\",\"rationale\":\"fuojrngif\",\"queryCheck\":{\"query\":\"pasccbi\",\"expectedResult\":[[],[],[],[]],\"columnNames\":[\"lyjdfqwm\",\"yoqufdvruz\"]},\"benchmarkReferences\":[{},{},{}]}},\"id\":\"ojhp\",\"name\":\"tfnmdx\",\"type\":\"tngfdgugeyzihgr\"},{\"properties\":{\"ruleId\":\"i\",\"status\":\"InternalError\",\"isTrimmed\":false,\"queryResults\":[[\"phojeevyhy\",\"sgzfczbg\"],[\"fgbegl\"]],\"remediation\":{\"description\":\"eohibet\",\"scripts\":[\"ankrrfxee\",\"btijvacvbm\",\"z\"],\"automated\":false,\"portalLink\":\"lajrnwxacevehj\"},\"baselineAdjustedResult\":{\"baseline\":{\"expectedResults\":[[],[]],\"updatedTime\":\"2021-01-24T22:21:10Z\"},\"status\":\"InternalError\",\"resultsNotInBaseline\":[[\"tfaeyl\"],[\"mfgvxirpghriypo\"]],\"resultsOnlyInBaseline\":[[\"lqhykprlpyz\",\"uciqdsme\",\"iitdfuxt\"],[\"siibmiybnnustgn\",\"jh\",\"mgixhcmavmqfou\",\"or\"],[\"gyyprotwy\",\"undmbx\"],[\"gcmjkavl\",\"or\",\"mftpmdtz\",\"jltfvnzcyjtotpv\"]]},\"ruleMetadata\":{\"ruleId\":\"pbdbzqgqqi\",\"severity\":\"Obsolete\",\"category\":\"vqwt\",\"ruleType\":\"Binary\",\"title\":\"ibcysihsgqc\",\"description\":\"hohsd\",\"rationale\":\"cdzsu\",\"queryCheck\":{\"query\":\"hdxbzlm\",\"expectedResult\":[[],[],[],[]],\"columnNames\":[\"cvhd\",\"evwqqxeyskonq\",\"inkfkbgbz\",\"owxeqocljmy\"]},\"benchmarkReferences\":[{}]}},\"id\":\"zqkjjeokbzefe\",\"name\":\"rx\",\"type\":\"czurtlei\"}]}")
            .toObject(ScanResultsInner.class);
        Assertions.assertEquals("tpiymerteea", model.value().get(0).properties().ruleId());
        Assertions.assertEquals(RuleStatus.NON_FINDING, model.value().get(0).properties().status());
        Assertions.assertEquals(true, model.value().get(0).properties().isTrimmed());
        Assertions.assertEquals("kzddrtkgdojbmxva", model.value().get(0).properties().queryResults().get(0).get(0));
        Assertions.assertEquals("rtujwsawddjibab", model.value().get(0).properties().remediation().description());
        Assertions.assertEquals("titvtzeexavox", model.value().get(0).properties().remediation().scripts().get(0));
        Assertions.assertEquals(false, model.value().get(0).properties().remediation().automated());
        Assertions.assertEquals("nsiru", model.value().get(0).properties().remediation().portalLink());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-18T07:47:20Z"),
            model.value().get(0).properties().baselineAdjustedResult().baseline().updatedTime());
        Assertions.assertEquals(RuleStatus.INTERNAL_ERROR,
            model.value().get(0).properties().baselineAdjustedResult().status());
        Assertions.assertEquals("agzrcxfa",
            model.value().get(0).properties().baselineAdjustedResult().resultsNotInBaseline().get(0).get(0));
        Assertions.assertEquals("broyla",
            model.value().get(0).properties().baselineAdjustedResult().resultsOnlyInBaseline().get(0).get(0));
        Assertions.assertEquals("gkylkdghr", model.value().get(0).properties().ruleMetadata().ruleId());
        Assertions.assertEquals(RuleSeverity.HIGH, model.value().get(0).properties().ruleMetadata().severity());
        Assertions.assertEquals("tl", model.value().get(0).properties().ruleMetadata().category());
        Assertions.assertEquals(RuleType.BINARY, model.value().get(0).properties().ruleMetadata().ruleType());
        Assertions.assertEquals("w", model.value().get(0).properties().ruleMetadata().title());
        Assertions.assertEquals("okvbwnhhtqlgehg", model.value().get(0).properties().ruleMetadata().description());
        Assertions.assertEquals("ipifhpfeoajvg", model.value().get(0).properties().ruleMetadata().rationale());
        Assertions.assertEquals("xjcsheafidltu", model.value().get(0).properties().ruleMetadata().queryCheck().query());
        Assertions.assertEquals("mks",
            model.value().get(0).properties().ruleMetadata().queryCheck().columnNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScanResultsInner model = new ScanResultsInner().withValue(Arrays.asList(new ScanResultInner().withProperties(
            new ScanResultProperties().withRuleId("tpiymerteea").withStatus(RuleStatus.NON_FINDING).withIsTrimmed(true)
                .withQueryResults(Arrays.asList(Arrays.asList("kzddrtkgdojbmxva", "refdee", "vecuijpx", "xs")))
                .withRemediation(new Remediation().withDescription("rtujwsawddjibab")
                    .withScripts(Arrays.asList("titvtzeexavox", "fglecdmdqbwp", "pqtgsfjac", "slhhxudbxv"))
                    .withAutomated(false).withPortalLink("nsiru"))
                .withBaselineAdjustedResult(new BaselineAdjustedResult()
                    .withBaseline(new Baseline().withExpectedResults(Arrays.asList(Arrays.asList()))
                        .withUpdatedTime(OffsetDateTime.parse("2021-01-18T07:47:20Z")))
                    .withStatus(RuleStatus.INTERNAL_ERROR)
                    .withResultsNotInBaseline(
                        Arrays.asList(Arrays.asList("agzrcxfa", "lc", "xwmdboxd", "gsftufqobrjlnacg"),
                            Arrays.asList("kknhxkizvytnrzv", "lj", "aaeranokqgukk")))
                    .withResultsOnlyInBaseline(Arrays.asList(Arrays.asList("broyla", "xulcdisdos", "jbjsvgjrwh"),
                        Arrays.asList("vyc", "t", "c", "xgccknfnw"),
                        Arrays.asList("tmvpdvjdhtt", "a", "fedxihchrphkm", "rjdqnsdfzp"))))
                .withRuleMetadata(
                    new VaRule().withRuleId("gkylkdghr").withSeverity(RuleSeverity.HIGH).withCategory("tl")
                        .withRuleType(RuleType.BINARY).withTitle("w").withDescription("okvbwnhhtqlgehg")
                        .withRationale("ipifhpfeoajvg")
                        .withQueryCheck(new QueryCheck().withQuery("xjcsheafidltu")
                            .withExpectedResult(
                                Arrays.asList(Arrays.asList(), Arrays.asList(), Arrays.asList(), Arrays.asList()))
                            .withColumnNames(Arrays.asList("mks", "jhoiftxfkfweg")))
                        .withBenchmarkReferences(Arrays.asList(new BenchmarkReference())))),
            new ScanResultInner().withProperties(new ScanResultProperties().withRuleId("zetpwbra")
                .withStatus(RuleStatus.INTERNAL_ERROR).withIsTrimmed(true)
                .withQueryResults(Arrays.asList(Arrays.asList("qzmiza", "a", "ankjpdnjzh"),
                    Arrays.asList("oylhjlmuoyxprimr", "opteecj"), Arrays.asList("islstv", "sylwxdzaumweooh", "uufuz",
                        "oyjathwtzol"),
                    Arrays.asList("emwmdxmebwjs")))
                .withRemediation(new Remediation().withDescription("ahlxveabfqxnm")
                    .withScripts(Arrays.asList("tibxyijddtvqctt", "dija", "ukm")).withAutomated(true)
                    .withPortalLink("ekpndzaapmudq"))
                .withBaselineAdjustedResult(new BaselineAdjustedResult()
                    .withBaseline(new Baseline().withExpectedResults(Arrays.asList(Arrays.asList(), Arrays.asList()))
                        .withUpdatedTime(OffsetDateTime.parse("2021-01-22T13:34:38Z")))
                    .withStatus(RuleStatus.FINDING)
                    .withResultsNotInBaseline(Arrays.asList(Arrays.asList("wyxebeybpmzz", "rtffyaqitmh", "eioqaqhvse"),
                        Arrays.asList("uqyrxpdl", "gql", "ismjqfrddgamqu", "iosrsjuivfcdis")))
                    .withResultsOnlyInBaseline(
                        Arrays.asList(Arrays.asList("xzhczexrxz", "ujrtrhqvwr"), Arrays.asList("khgn"))))
                .withRuleMetadata(new VaRule().withRuleId("onzlr").withSeverity(RuleSeverity.LOW)
                    .withCategory("wncvjtszcofiz").withRuleType(RuleType.POSITIVE_LIST).withTitle("hgbjkvrelje")
                    .withDescription("urvzmlovuanashc").withRationale("pmjerbdkelvidiz")
                    .withQueryCheck(new QueryCheck().withQuery("db")
                        .withExpectedResult(Arrays.asList(Arrays.asList(), Arrays.asList()))
                        .withColumnNames(Arrays.asList("on", "dgnwncypuuwwlt", "uqj", "tzenk")))
                    .withBenchmarkReferences(
                        Arrays.asList(new BenchmarkReference(), new BenchmarkReference(), new BenchmarkReference())))),
            new ScanResultInner().withProperties(new ScanResultProperties()
                .withRuleId("izbfhfovvacq").withStatus(RuleStatus.INTERNAL_ERROR).withIsTrimmed(
                    true)
                .withQueryResults(Arrays.asList(Arrays.asList("szabbelawu", "ua", "lzkwrrwoy", "qucwyhahnom")))
                .withRemediation(new Remediation().withDescription("ywuhpsvfuur")
                    .withScripts(Arrays.asList("we", "xwlalniexzsrzpg")).withAutomated(false).withPortalLink("yb"))
                .withBaselineAdjustedResult(new BaselineAdjustedResult()
                    .withBaseline(new Baseline().withExpectedResults(Arrays.asList(Arrays.asList(), Arrays.asList()))
                        .withUpdatedTime(OffsetDateTime.parse("2021-08-07T11:45:57Z")))
                    .withStatus(RuleStatus.INTERNAL_ERROR)
                    .withResultsNotInBaseline(
                        Arrays.asList(Arrays.asList("vl", "xqnrkcxk", "ibn"), Arrays.asList("ysux")))
                    .withResultsOnlyInBaseline(Arrays.asList(Arrays.asList("ntvlwijpsttexo", "qpwcyyufmh", "uncuw"),
                        Arrays.asList("spkcdqzh", "ctddun", "ndy", "pchrqbn"))))
                .withRuleMetadata(new VaRule().withRuleId("cgegydcwbo").withSeverity(RuleSeverity.INFORMATIONAL)
                    .withCategory("vqqolih").withRuleType(RuleType.POSITIVE_LIST).withTitle("ouau")
                    .withDescription("jtlo").withRationale("fuojrngif")
                    .withQueryCheck(new QueryCheck().withQuery("pasccbi")
                        .withExpectedResult(
                            Arrays.asList(Arrays.asList(), Arrays.asList(), Arrays.asList(), Arrays.asList()))
                        .withColumnNames(Arrays.asList("lyjdfqwm", "yoqufdvruz")))
                    .withBenchmarkReferences(Arrays.asList(new BenchmarkReference(), new BenchmarkReference(),
                        new BenchmarkReference())))),
            new ScanResultInner()
                .withProperties(
                    new ScanResultProperties().withRuleId("i").withStatus(RuleStatus.INTERNAL_ERROR)
                        .withIsTrimmed(false)
                        .withQueryResults(
                            Arrays.asList(Arrays.asList("phojeevyhy", "sgzfczbg"), Arrays.asList("fgbegl")))
                        .withRemediation(
                            new Remediation().withDescription("eohibet")
                                .withScripts(Arrays.asList("ankrrfxee", "btijvacvbm", "z")).withAutomated(
                                    false)
                                .withPortalLink("lajrnwxacevehj"))
                        .withBaselineAdjustedResult(new BaselineAdjustedResult()
                            .withBaseline(
                                new Baseline().withExpectedResults(Arrays.asList(Arrays.asList(), Arrays.asList()))
                                    .withUpdatedTime(OffsetDateTime.parse("2021-01-24T22:21:10Z")))
                            .withStatus(RuleStatus.INTERNAL_ERROR)
                            .withResultsNotInBaseline(
                                Arrays.asList(Arrays.asList("tfaeyl"), Arrays.asList("mfgvxirpghriypo")))
                            .withResultsOnlyInBaseline(
                                Arrays.asList(Arrays.asList("lqhykprlpyz", "uciqdsme", "iitdfuxt"),
                                    Arrays.asList("siibmiybnnustgn", "jh", "mgixhcmavmqfou", "or"),
                                    Arrays.asList("gyyprotwy", "undmbx"),
                                    Arrays.asList("gcmjkavl", "or", "mftpmdtz", "jltfvnzcyjtotpv"))))
                        .withRuleMetadata(new VaRule().withRuleId("pbdbzqgqqi").withSeverity(RuleSeverity.OBSOLETE)
                            .withCategory("vqwt").withRuleType(RuleType.BINARY).withTitle("ibcysihsgqc")
                            .withDescription("hohsd").withRationale("cdzsu")
                            .withQueryCheck(new QueryCheck().withQuery("hdxbzlm")
                                .withExpectedResult(
                                    Arrays.asList(Arrays.asList(), Arrays.asList(), Arrays.asList(), Arrays.asList()))
                                .withColumnNames(Arrays.asList("cvhd", "evwqqxeyskonq", "inkfkbgbz", "owxeqocljmy")))
                            .withBenchmarkReferences(Arrays.asList(new BenchmarkReference()))))));
        model = BinaryData.fromObject(model).toObject(ScanResultsInner.class);
        Assertions.assertEquals("tpiymerteea", model.value().get(0).properties().ruleId());
        Assertions.assertEquals(RuleStatus.NON_FINDING, model.value().get(0).properties().status());
        Assertions.assertEquals(true, model.value().get(0).properties().isTrimmed());
        Assertions.assertEquals("kzddrtkgdojbmxva", model.value().get(0).properties().queryResults().get(0).get(0));
        Assertions.assertEquals("rtujwsawddjibab", model.value().get(0).properties().remediation().description());
        Assertions.assertEquals("titvtzeexavox", model.value().get(0).properties().remediation().scripts().get(0));
        Assertions.assertEquals(false, model.value().get(0).properties().remediation().automated());
        Assertions.assertEquals("nsiru", model.value().get(0).properties().remediation().portalLink());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-18T07:47:20Z"),
            model.value().get(0).properties().baselineAdjustedResult().baseline().updatedTime());
        Assertions.assertEquals(RuleStatus.INTERNAL_ERROR,
            model.value().get(0).properties().baselineAdjustedResult().status());
        Assertions.assertEquals("agzrcxfa",
            model.value().get(0).properties().baselineAdjustedResult().resultsNotInBaseline().get(0).get(0));
        Assertions.assertEquals("broyla",
            model.value().get(0).properties().baselineAdjustedResult().resultsOnlyInBaseline().get(0).get(0));
        Assertions.assertEquals("gkylkdghr", model.value().get(0).properties().ruleMetadata().ruleId());
        Assertions.assertEquals(RuleSeverity.HIGH, model.value().get(0).properties().ruleMetadata().severity());
        Assertions.assertEquals("tl", model.value().get(0).properties().ruleMetadata().category());
        Assertions.assertEquals(RuleType.BINARY, model.value().get(0).properties().ruleMetadata().ruleType());
        Assertions.assertEquals("w", model.value().get(0).properties().ruleMetadata().title());
        Assertions.assertEquals("okvbwnhhtqlgehg", model.value().get(0).properties().ruleMetadata().description());
        Assertions.assertEquals("ipifhpfeoajvg", model.value().get(0).properties().ruleMetadata().rationale());
        Assertions.assertEquals("xjcsheafidltu", model.value().get(0).properties().ruleMetadata().queryCheck().query());
        Assertions.assertEquals("mks",
            model.value().get(0).properties().ruleMetadata().queryCheck().columnNames().get(0));
    }
}
