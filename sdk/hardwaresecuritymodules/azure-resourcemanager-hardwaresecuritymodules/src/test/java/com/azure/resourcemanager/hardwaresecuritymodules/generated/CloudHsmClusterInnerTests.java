// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hardwaresecuritymodules.fluent.models.CloudHsmClusterInner;
import com.azure.resourcemanager.hardwaresecuritymodules.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.hardwaresecuritymodules.models.BackupProperties;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterProperties;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterSecurityDomainProperties;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterSku;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterSkuFamily;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterSkuName;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmProperties;
import com.azure.resourcemanager.hardwaresecuritymodules.models.ManagedServiceIdentity;
import com.azure.resourcemanager.hardwaresecuritymodules.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.hardwaresecuritymodules.models.PrivateEndpoint;
import com.azure.resourcemanager.hardwaresecuritymodules.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.hardwaresecuritymodules.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.hardwaresecuritymodules.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.hardwaresecuritymodules.models.ProvisioningState;
import com.azure.resourcemanager.hardwaresecuritymodules.models.RestoreProperties;
import com.azure.resourcemanager.hardwaresecuritymodules.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CloudHsmClusterInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudHsmClusterInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Provisioning\",\"autoGeneratedDomainNameLabelScope\":\"uv\",\"securityDomain\":{\"fipsState\":1513244275,\"activationStatus\":\"bczmeh\"},\"hsms\":[{\"fqdn\":\"pbsphrupidgs\",\"state\":\"bejhphoycmsxa\",\"stateMessage\":\"hdxbmtqio\"},{\"fqdn\":\"zehtbmu\",\"state\":\"ownoizhw\",\"stateMessage\":\"xybqsoqij\"},{\"fqdn\":\"dmbpazlobcufpdz\",\"state\":\"btcqq\",\"stateMessage\":\"qglhq\"},{\"fqdn\":\"ufo\",\"state\":\"jywif\",\"stateMessage\":\"esaagdfm\"}],\"publicNetworkAccess\":\"zlhjxrifkwmrvkt\",\"privateEndpointConnections\":[{\"properties\":{\"privateEndpoint\":{\"id\":\"cipaouaj\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"cmpoyfdkfogkny\",\"actionsRequired\":\"ofjdde\"},\"provisioningState\":\"Failed\",\"groupIds\":[\"upewnwreitjzy\",\"lusarh\",\"ofcqhsm\",\"urkdtmlx\"]},\"etag\":\"kuksjtxukcdm\",\"id\":\"rcryuanzwuxzdxta\",\"name\":\"rlhm\",\"type\":\"hfpmrqobmtukknr\"},{\"properties\":{\"privateEndpoint\":{\"id\":\"hfx\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"pzvgnwzsymglzufc\",\"actionsRequired\":\"kohdbiha\"},\"provisioningState\":\"Failed\",\"groupIds\":[\"cbjy\",\"a\",\"ithxqhabifpi\",\"xwczbyscnp\"]},\"etag\":\"uhivyqniw\",\"id\":\"br\",\"name\":\"xvd\",\"type\":\"mjgr\"},{\"properties\":{\"privateEndpoint\":{\"id\":\"ukxgaud\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"h\",\"actionsRequired\":\"cnyejhkryhtnapcz\"},\"provisioningState\":\"Creating\",\"groupIds\":[\"yemkkvnip\"]},\"etag\":\"xzjnchgejs\",\"id\":\"dmailzydehojw\",\"name\":\"ahuxinpm\",\"type\":\"njaqwixjspro\"},{\"properties\":{\"privateEndpoint\":{\"id\":\"utegjvwmfdats\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"pjhulsuuvmkj\",\"actionsRequired\":\"k\"},\"provisioningState\":\"Creating\",\"groupIds\":[\"iodjp\"]},\"etag\":\"w\",\"id\":\"dpvwryoqpsoaccta\",\"name\":\"akl\",\"type\":\"lahbcryff\"}],\"statusMessage\":\"dosyg\",\"restoreProperties\":{\"foldername\":\"aojakhmsbzjhcrz\",\"azureStorageResourceUri\":\"dphlxaolt\"},\"backupProperties\":{\"azureStorageResourceUri\":\"rgqjbpfzfsinzg\",\"lastBackupDateTime\":\"2021-07-30T11:45:35Z\",\"lastBackupStatus\":\"rwzoxxjtfelluwf\"}},\"sku\":{\"family\":\"B\",\"name\":\"Standard B10\",\"capacity\":180815183},\"identity\":{\"principalId\":\"d4132b5b-840f-4b60-aa32-ebbe463c10cd\",\"tenantId\":\"56fe722a-e024-4325-9cd0-b8710376b9c0\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"xofpdvhpfxxypi\":{\"principalId\":\"6e8aaa07-1deb-4c82-ad40-6a8138c1b842\",\"clientId\":\"4164ac8f-7944-4891-987b-b27412833d98\"},\"mayhuybbkpodepoo\":{\"principalId\":\"77e60bb2-9490-416b-a494-1e371b37d56d\",\"clientId\":\"ec5ac12d-8dbd-44f1-bdc4-56bf3e159110\"},\"uvamiheognarxzxt\":{\"principalId\":\"67c03063-901f-4c56-8e88-38fd9f82abfe\",\"clientId\":\"06580a3a-15d3-40d4-85a0-1f12312acd30\"}}},\"location\":\"o\",\"tags\":{\"bwjzr\":\"ivyevcciqihnhun\"},\"id\":\"fygxgispemvtzfk\",\"name\":\"fublj\",\"type\":\"fxqeof\"}")
            .toObject(CloudHsmClusterInner.class);
        Assertions.assertEquals("o", model.location());
        Assertions.assertEquals("ivyevcciqihnhun", model.tags().get("bwjzr"));
        Assertions.assertEquals(CloudHsmClusterSkuFamily.B, model.sku().family());
        Assertions.assertEquals(CloudHsmClusterSkuName.STANDARD_B10, model.sku().name());
        Assertions.assertEquals(180815183, model.sku().capacity());
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals(ProvisioningState.PROVISIONING, model.properties().provisioningState());
        Assertions.assertEquals("uv", model.properties().autoGeneratedDomainNameLabelScope());
        Assertions.assertEquals(1513244275, model.properties().securityDomain().fipsState());
        Assertions.assertEquals("bczmeh", model.properties().securityDomain().activationStatus());
        Assertions.assertEquals("pbsphrupidgs", model.properties().hsms().get(0).fqdn());
        Assertions.assertEquals("bejhphoycmsxa", model.properties().hsms().get(0).state());
        Assertions.assertEquals("hdxbmtqio", model.properties().hsms().get(0).stateMessage());
        Assertions.assertEquals("zlhjxrifkwmrvkt", model.properties().publicNetworkAccess());
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED, model.properties()
            .privateEndpointConnections().get(0).properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("cmpoyfdkfogkny", model.properties().privateEndpointConnections().get(0).properties()
            .privateLinkServiceConnectionState().description());
        Assertions.assertEquals("ofjdde", model.properties().privateEndpointConnections().get(0).properties()
            .privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("kuksjtxukcdm", model.properties().privateEndpointConnections().get(0).etag());
        Assertions.assertEquals("aojakhmsbzjhcrz", model.properties().restoreProperties().foldername());
        Assertions.assertEquals("dphlxaolt", model.properties().restoreProperties().azureStorageResourceUri());
        Assertions.assertEquals("rgqjbpfzfsinzg", model.properties().backupProperties().azureStorageResourceUri());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudHsmClusterInner model
            = new CloudHsmClusterInner().withLocation("o").withTags(mapOf("bwjzr", "ivyevcciqihnhun"))
                .withSku(
                    new CloudHsmClusterSku().withFamily(CloudHsmClusterSkuFamily.B)
                        .withName(CloudHsmClusterSkuName.STANDARD_B10).withCapacity(180815183))
                .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(mapOf("xofpdvhpfxxypi", new UserAssignedIdentity(), "mayhuybbkpodepoo",
                        new UserAssignedIdentity(), "uvamiheognarxzxt", new UserAssignedIdentity())))
                .withProperties(
                    new CloudHsmClusterProperties().withProvisioningState(ProvisioningState.PROVISIONING)
                        .withAutoGeneratedDomainNameLabelScope("uv")
                        .withSecurityDomain(new CloudHsmClusterSecurityDomainProperties().withFipsState(1513244275)
                            .withActivationStatus("bczmeh"))
                        .withHsms(
                            Arrays.asList(
                                new CloudHsmProperties().withFqdn("pbsphrupidgs").withState("bejhphoycmsxa")
                                    .withStateMessage("hdxbmtqio"),
                                new CloudHsmProperties().withFqdn("zehtbmu").withState("ownoizhw")
                                    .withStateMessage("xybqsoqij"),
                                new CloudHsmProperties().withFqdn("dmbpazlobcufpdz").withState("btcqq")
                                    .withStateMessage("qglhq"),
                                new CloudHsmProperties().withFqdn("ufo").withState("jywif")
                                    .withStateMessage("esaagdfm")))
                        .withPublicNetworkAccess("zlhjxrifkwmrvkt")
                        .withPrivateEndpointConnections(Arrays.asList(
                            new PrivateEndpointConnectionInner()
                                .withProperties(new PrivateEndpointConnectionProperties()
                                    .withPrivateEndpoint(new PrivateEndpoint())
                                    .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                                        .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                                        .withDescription("cmpoyfdkfogkny").withActionsRequired("ofjdde")))
                                .withEtag("kuksjtxukcdm"),
                            new PrivateEndpointConnectionInner()
                                .withProperties(
                                    new PrivateEndpointConnectionProperties().withPrivateEndpoint(new PrivateEndpoint())
                                        .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                                            .withStatus(PrivateEndpointServiceConnectionStatus.REJECTED)
                                            .withDescription("pzvgnwzsymglzufc").withActionsRequired("kohdbiha")))
                                .withEtag("uhivyqniw"),
                            new PrivateEndpointConnectionInner()
                                .withProperties(
                                    new PrivateEndpointConnectionProperties().withPrivateEndpoint(new PrivateEndpoint())
                                        .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                                            .withStatus(PrivateEndpointServiceConnectionStatus.PENDING)
                                            .withDescription("h").withActionsRequired("cnyejhkryhtnapcz")))
                                .withEtag("xzjnchgejs"),
                            new PrivateEndpointConnectionInner().withProperties(
                                new PrivateEndpointConnectionProperties().withPrivateEndpoint(new PrivateEndpoint())
                                    .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                                        .withStatus(PrivateEndpointServiceConnectionStatus.REJECTED)
                                        .withDescription("pjhulsuuvmkj").withActionsRequired("k")))
                                .withEtag("w")))
                        .withRestoreProperties(new RestoreProperties().withFoldername("aojakhmsbzjhcrz")
                            .withAzureStorageResourceUri("dphlxaolt"))
                        .withBackupProperties(new BackupProperties().withAzureStorageResourceUri("rgqjbpfzfsinzg")));
        model = BinaryData.fromObject(model).toObject(CloudHsmClusterInner.class);
        Assertions.assertEquals("o", model.location());
        Assertions.assertEquals("ivyevcciqihnhun", model.tags().get("bwjzr"));
        Assertions.assertEquals(CloudHsmClusterSkuFamily.B, model.sku().family());
        Assertions.assertEquals(CloudHsmClusterSkuName.STANDARD_B10, model.sku().name());
        Assertions.assertEquals(180815183, model.sku().capacity());
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals(ProvisioningState.PROVISIONING, model.properties().provisioningState());
        Assertions.assertEquals("uv", model.properties().autoGeneratedDomainNameLabelScope());
        Assertions.assertEquals(1513244275, model.properties().securityDomain().fipsState());
        Assertions.assertEquals("bczmeh", model.properties().securityDomain().activationStatus());
        Assertions.assertEquals("pbsphrupidgs", model.properties().hsms().get(0).fqdn());
        Assertions.assertEquals("bejhphoycmsxa", model.properties().hsms().get(0).state());
        Assertions.assertEquals("hdxbmtqio", model.properties().hsms().get(0).stateMessage());
        Assertions.assertEquals("zlhjxrifkwmrvkt", model.properties().publicNetworkAccess());
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED, model.properties()
            .privateEndpointConnections().get(0).properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("cmpoyfdkfogkny", model.properties().privateEndpointConnections().get(0).properties()
            .privateLinkServiceConnectionState().description());
        Assertions.assertEquals("ofjdde", model.properties().privateEndpointConnections().get(0).properties()
            .privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("kuksjtxukcdm", model.properties().privateEndpointConnections().get(0).etag());
        Assertions.assertEquals("aojakhmsbzjhcrz", model.properties().restoreProperties().foldername());
        Assertions.assertEquals("dphlxaolt", model.properties().restoreProperties().azureStorageResourceUri());
        Assertions.assertEquals("rgqjbpfzfsinzg", model.properties().backupProperties().azureStorageResourceUri());
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
