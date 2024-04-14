// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confluent.fluent.models.ClusterProperties;
import com.azure.resourcemanager.confluent.models.ClusterConfigEntity;
import com.azure.resourcemanager.confluent.models.ClusterStatusEntity;
import com.azure.resourcemanager.confluent.models.SCClusterByokEntity;
import com.azure.resourcemanager.confluent.models.SCClusterNetworkEnvironmentEntity;
import com.azure.resourcemanager.confluent.models.SCClusterSpecEntity;
import com.azure.resourcemanager.confluent.models.SCMetadataEntity;
import org.junit.jupiter.api.Assertions;

public final class ClusterPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterProperties model = BinaryData.fromString(
            "{\"metadata\":{\"self\":\"vxccedcp\",\"resourceName\":\"dyodnwzxltj\",\"createdTimestamp\":\"nhltiugcxn\",\"updatedTimestamp\":\"vwxqibyqunyo\",\"deletedTimestamp\":\"wlmdjrkv\"},\"spec\":{\"name\":\"vfvpdbodaciz\",\"availability\":\"q\",\"cloud\":\"krribdeibqi\",\"zone\":\"kghv\",\"region\":\"dzwmkrefajpj\",\"kafkaBootstrapEndpoint\":\"wkqnyhg\",\"httpEndpoint\":\"j\",\"apiEndpoint\":\"ivfxzsjabibsyst\",\"config\":{\"kind\":\"sdjpvkvp\"},\"environment\":{\"id\":\"bkzbzkd\",\"environment\":\"cjabudurgkakmo\",\"related\":\"hjjklff\",\"resourceName\":\"ouw\"},\"network\":{\"id\":\"zrfze\",\"environment\":\"ebizikayuh\",\"related\":\"bjbsybb\",\"resourceName\":\"r\"},\"byok\":{\"id\":\"dgmfpgvmpipasl\",\"related\":\"aqfxss\",\"resourceName\":\"u\"}},\"status\":{\"phase\":\"dsrezpdrhneuyow\",\"cku\":150720980}}")
            .toObject(ClusterProperties.class);
        Assertions.assertEquals("vxccedcp", model.metadata().self());
        Assertions.assertEquals("dyodnwzxltj", model.metadata().resourceName());
        Assertions.assertEquals("nhltiugcxn", model.metadata().createdTimestamp());
        Assertions.assertEquals("vwxqibyqunyo", model.metadata().updatedTimestamp());
        Assertions.assertEquals("wlmdjrkv", model.metadata().deletedTimestamp());
        Assertions.assertEquals("vfvpdbodaciz", model.spec().name());
        Assertions.assertEquals("q", model.spec().availability());
        Assertions.assertEquals("krribdeibqi", model.spec().cloud());
        Assertions.assertEquals("kghv", model.spec().zone());
        Assertions.assertEquals("dzwmkrefajpj", model.spec().region());
        Assertions.assertEquals("wkqnyhg", model.spec().kafkaBootstrapEndpoint());
        Assertions.assertEquals("j", model.spec().httpEndpoint());
        Assertions.assertEquals("ivfxzsjabibsyst", model.spec().apiEndpoint());
        Assertions.assertEquals("sdjpvkvp", model.spec().config().kind());
        Assertions.assertEquals("bkzbzkd", model.spec().environment().id());
        Assertions.assertEquals("cjabudurgkakmo", model.spec().environment().environment());
        Assertions.assertEquals("hjjklff", model.spec().environment().related());
        Assertions.assertEquals("ouw", model.spec().environment().resourceName());
        Assertions.assertEquals("zrfze", model.spec().network().id());
        Assertions.assertEquals("ebizikayuh", model.spec().network().environment());
        Assertions.assertEquals("bjbsybb", model.spec().network().related());
        Assertions.assertEquals("r", model.spec().network().resourceName());
        Assertions.assertEquals("dgmfpgvmpipasl", model.spec().byok().id());
        Assertions.assertEquals("aqfxss", model.spec().byok().related());
        Assertions.assertEquals("u", model.spec().byok().resourceName());
        Assertions.assertEquals("dsrezpdrhneuyow", model.status().phase());
        Assertions.assertEquals(150720980, model.status().cku());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterProperties model = new ClusterProperties()
            .withMetadata(new SCMetadataEntity().withSelf("vxccedcp").withResourceName("dyodnwzxltj")
                .withCreatedTimestamp("nhltiugcxn").withUpdatedTimestamp("vwxqibyqunyo")
                .withDeletedTimestamp("wlmdjrkv"))
            .withSpec(new SCClusterSpecEntity().withName("vfvpdbodaciz").withAvailability("q").withCloud("krribdeibqi")
                .withZone("kghv").withRegion("dzwmkrefajpj").withKafkaBootstrapEndpoint("wkqnyhg").withHttpEndpoint("j")
                .withApiEndpoint("ivfxzsjabibsyst").withConfig(new ClusterConfigEntity().withKind("sdjpvkvp"))
                .withEnvironment(new SCClusterNetworkEnvironmentEntity().withId("bkzbzkd")
                    .withEnvironment("cjabudurgkakmo").withRelated("hjjklff").withResourceName("ouw"))
                .withNetwork(new SCClusterNetworkEnvironmentEntity().withId("zrfze").withEnvironment("ebizikayuh")
                    .withRelated("bjbsybb").withResourceName("r"))
                .withByok(
                    new SCClusterByokEntity().withId("dgmfpgvmpipasl").withRelated("aqfxss").withResourceName("u")))
            .withStatus(new ClusterStatusEntity().withPhase("dsrezpdrhneuyow").withCku(150720980));
        model = BinaryData.fromObject(model).toObject(ClusterProperties.class);
        Assertions.assertEquals("vxccedcp", model.metadata().self());
        Assertions.assertEquals("dyodnwzxltj", model.metadata().resourceName());
        Assertions.assertEquals("nhltiugcxn", model.metadata().createdTimestamp());
        Assertions.assertEquals("vwxqibyqunyo", model.metadata().updatedTimestamp());
        Assertions.assertEquals("wlmdjrkv", model.metadata().deletedTimestamp());
        Assertions.assertEquals("vfvpdbodaciz", model.spec().name());
        Assertions.assertEquals("q", model.spec().availability());
        Assertions.assertEquals("krribdeibqi", model.spec().cloud());
        Assertions.assertEquals("kghv", model.spec().zone());
        Assertions.assertEquals("dzwmkrefajpj", model.spec().region());
        Assertions.assertEquals("wkqnyhg", model.spec().kafkaBootstrapEndpoint());
        Assertions.assertEquals("j", model.spec().httpEndpoint());
        Assertions.assertEquals("ivfxzsjabibsyst", model.spec().apiEndpoint());
        Assertions.assertEquals("sdjpvkvp", model.spec().config().kind());
        Assertions.assertEquals("bkzbzkd", model.spec().environment().id());
        Assertions.assertEquals("cjabudurgkakmo", model.spec().environment().environment());
        Assertions.assertEquals("hjjklff", model.spec().environment().related());
        Assertions.assertEquals("ouw", model.spec().environment().resourceName());
        Assertions.assertEquals("zrfze", model.spec().network().id());
        Assertions.assertEquals("ebizikayuh", model.spec().network().environment());
        Assertions.assertEquals("bjbsybb", model.spec().network().related());
        Assertions.assertEquals("r", model.spec().network().resourceName());
        Assertions.assertEquals("dgmfpgvmpipasl", model.spec().byok().id());
        Assertions.assertEquals("aqfxss", model.spec().byok().related());
        Assertions.assertEquals("u", model.spec().byok().resourceName());
        Assertions.assertEquals("dsrezpdrhneuyow", model.status().phase());
        Assertions.assertEquals(150720980, model.status().cku());
    }
}
