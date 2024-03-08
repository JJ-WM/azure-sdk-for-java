// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.datafactory.fluent.models.SelfHostedIntegrationRuntimeNodeInner;
import com.azure.resourcemanager.datafactory.fluent.models.SelfHostedIntegrationRuntimeStatusTypeProperties;
import com.azure.resourcemanager.datafactory.models.LinkedIntegrationRuntime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class SelfHostedIntegrationRuntimeStatusTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SelfHostedIntegrationRuntimeStatusTypeProperties model = BinaryData.fromString(
            "{\"createTime\":\"2021-07-18T03:37:51Z\",\"taskQueueId\":\"frvsizfwgnp\",\"internalChannelEncryption\":\"SslEncrypted\",\"version\":\"affwcgjjioqw\",\"nodes\":[{\"nodeName\":\"dkpnmwrfuqjdeby\",\"machineName\":\"ucnbgibklscw\",\"hostServiceUri\":\"ouzyv\",\"status\":\"Online\",\"capabilities\":{\"xm\":\"f\",\"tsnyr\":\"smgkr\"},\"versionStatus\":\"ulbyzzcxs\",\"version\":\"aoymyckdpzb\",\"registerTime\":\"2021-08-26T04:54:27Z\",\"lastConnectTime\":\"2021-04-27T18:45:48Z\",\"expiryTime\":\"2021-03-06T04:59:11Z\",\"lastStartTime\":\"2020-12-23T10:34:23Z\",\"lastStopTime\":\"2021-04-09T22:30:41Z\",\"lastUpdateResult\":\"Succeed\",\"lastStartUpdateTime\":\"2021-08-29T14:58:42Z\",\"lastEndUpdateTime\":\"2021-10-18T07:17:24Z\",\"isActiveDispatcher\":true,\"concurrentJobsLimit\":1193471045,\"maxConcurrentJobs\":415008463,\"\":{\"twqtkpd\":\"dataimqoacfqzxjziqcs\",\"nddaxaogsk\":\"datadefqoermgm\"}},{\"nodeName\":\"mmmbipyse\",\"machineName\":\"ybobfjcvmkk\",\"hostServiceUri\":\"gdiwdyyhdtie\",\"status\":\"Upgrading\",\"capabilities\":{\"lbtbxhy\":\"wvcwcehzrtrgp\",\"e\":\"wjfqktuzrlt\"},\"versionStatus\":\"dkbqfzbvttqj\",\"version\":\"vhnjpbhjlug\",\"registerTime\":\"2021-01-18T14:59:38Z\",\"lastConnectTime\":\"2021-06-12T17:39:08Z\",\"expiryTime\":\"2021-02-16T08:11:21Z\",\"lastStartTime\":\"2021-05-12T22:34:43Z\",\"lastStopTime\":\"2021-03-22T08:29:26Z\",\"lastUpdateResult\":\"None\",\"lastStartUpdateTime\":\"2021-04-06T11:32:41Z\",\"lastEndUpdateTime\":\"2021-05-05T20:56:27Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":1100917041,\"maxConcurrentJobs\":982181883,\"\":{\"qu\":\"datawlynxzhgbspdxbh\",\"xqomzdfaupqve\":\"datak\",\"modwhqu\":\"datadzwnkbjqp\"}}],\"scheduledUpdateDate\":\"2021-05-17T05:14:18Z\",\"updateDelayOffset\":\"htux\",\"localTimeZoneOffset\":\"e\",\"capabilities\":{\"bx\":\"q\",\"z\":\"ynslcvynavwtttsm\",\"o\":\"oddcaqi\",\"qtkfjacktav\":\"nbjmjxkhbucmz\"},\"serviceUrls\":[\"godjfyplavb\",\"secedsoqwexi\",\"bnzot\",\"ikf\"],\"autoUpdate\":\"Off\",\"versionStatus\":\"fadgywylavetq\",\"links\":[{\"name\":\"ys\",\"subscriptionId\":\"gjtpbtkogf\",\"dataFactoryName\":\"ylyz\",\"dataFactoryLocation\":\"rvwsgseq\",\"createTime\":\"2021-11-02T03:12:25Z\"},{\"name\":\"axir\",\"subscriptionId\":\"isw\",\"dataFactoryName\":\"y\",\"dataFactoryLocation\":\"vsobamtarirdzdgv\",\"createTime\":\"2021-07-25T07:36:54Z\"},{\"name\":\"zukego\",\"subscriptionId\":\"xpypbmzqs\",\"dataFactoryName\":\"lmnxrxkuly\",\"dataFactoryLocation\":\"vviyqonbxxyf\",\"createTime\":\"2021-03-06T16:14:23Z\"},{\"name\":\"od\",\"subscriptionId\":\"xjikfrxvlusedpn\",\"dataFactoryName\":\"imqaxtmvmycvjpa\",\"dataFactoryLocation\":\"dqvv\",\"createTime\":\"2021-05-23T17:50:07Z\"}],\"pushedVersion\":\"yvn\",\"latestVersion\":\"ngoqmr\",\"autoUpdateETA\":\"2021-09-10T09:59:19Z\",\"selfContainedInteractiveAuthoringEnabled\":false}")
            .toObject(SelfHostedIntegrationRuntimeStatusTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SelfHostedIntegrationRuntimeStatusTypeProperties model = new SelfHostedIntegrationRuntimeStatusTypeProperties()
            .withNodes(Arrays.asList(
                new SelfHostedIntegrationRuntimeNodeInner().withAdditionalProperties(mapOf("nodeName",
                    "dkpnmwrfuqjdeby", "lastStartUpdateTime", "2021-08-29T14:58:42Z", "lastConnectTime",
                    "2021-04-27T18:45:48Z", "capabilities",
                    JacksonAdapter.createDefaultSerializerAdapter().deserialize("{\"xm\":\"f\",\"tsnyr\":\"smgkr\"}",
                        Object.class, SerializerEncoding.JSON),
                    "hostServiceUri", "ouzyv", "registerTime", "2021-08-26T04:54:27Z", "maxConcurrentJobs", 415008463,
                    "lastStopTime", "2021-04-09T22:30:41Z", "version", "aoymyckdpzb", "machineName", "ucnbgibklscw",
                    "versionStatus", "ulbyzzcxs", "concurrentJobsLimit", 1193471045, "lastEndUpdateTime",
                    "2021-10-18T07:17:24Z", "expiryTime", "2021-03-06T04:59:11Z", "lastStartTime",
                    "2020-12-23T10:34:23Z", "lastUpdateResult", "Succeed", "isActiveDispatcher", true, "status",
                    "Online")),
                new SelfHostedIntegrationRuntimeNodeInner().withAdditionalProperties(mapOf("nodeName", "mmmbipyse",
                    "lastStartUpdateTime", "2021-04-06T11:32:41Z", "lastConnectTime", "2021-06-12T17:39:08Z",
                    "capabilities",
                    JacksonAdapter.createDefaultSerializerAdapter().deserialize(
                        "{\"lbtbxhy\":\"wvcwcehzrtrgp\",\"e\":\"wjfqktuzrlt\"}", Object.class, SerializerEncoding.JSON),
                    "hostServiceUri", "gdiwdyyhdtie", "registerTime", "2021-01-18T14:59:38Z", "maxConcurrentJobs",
                    982181883, "lastStopTime", "2021-03-22T08:29:26Z", "version", "vhnjpbhjlug", "machineName",
                    "ybobfjcvmkk", "versionStatus", "dkbqfzbvttqj", "concurrentJobsLimit", 1100917041,
                    "lastEndUpdateTime", "2021-05-05T20:56:27Z", "expiryTime", "2021-02-16T08:11:21Z", "lastStartTime",
                    "2021-05-12T22:34:43Z", "lastUpdateResult", "None", "isActiveDispatcher", false, "status",
                    "Upgrading"))))
            .withLinks(Arrays.asList(new LinkedIntegrationRuntime(), new LinkedIntegrationRuntime(),
                new LinkedIntegrationRuntime(), new LinkedIntegrationRuntime()));
        model = BinaryData.fromObject(model).toObject(SelfHostedIntegrationRuntimeStatusTypeProperties.class);
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
