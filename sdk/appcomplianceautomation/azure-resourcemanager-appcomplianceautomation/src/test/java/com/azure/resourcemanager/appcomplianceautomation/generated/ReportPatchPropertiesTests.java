// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcomplianceautomation.models.ReportPatchProperties;
import com.azure.resourcemanager.appcomplianceautomation.models.ResourceMetadata;
import com.azure.resourcemanager.appcomplianceautomation.models.ResourceOrigin;
import com.azure.resourcemanager.appcomplianceautomation.models.StorageInfo;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ReportPatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReportPatchProperties model = BinaryData.fromString(
            "{\"triggerTime\":\"2021-09-20T06:05:50Z\",\"timeZone\":\"ymuctqhjfbebrj\",\"resources\":[{\"resourceId\":\"rfuwutt\",\"resourceType\":\"fvjrbirphxepcy\",\"resourceKind\":\"hfnljkyq\",\"resourceOrigin\":\"GCP\",\"accountId\":\"ujqgidok\"},{\"resourceId\":\"jljyoxgv\",\"resourceType\":\"tbgsncghkj\",\"resourceKind\":\"zz\",\"resourceOrigin\":\"AWS\",\"accountId\":\"htxfvgxbfsmxnehm\"},{\"resourceId\":\"vecxgodebfqkk\",\"resourceType\":\"mpukgriw\",\"resourceKind\":\"zlfbxzpuzycispnq\",\"resourceOrigin\":\"GCP\",\"accountId\":\"gkbrpyyd\"}],\"status\":\"Reviewing\",\"errors\":[\"qqkpikadrg\",\"tqagnbuynh\"],\"tenantId\":\"gg\",\"offerGuid\":\"bfs\",\"nextTriggerTime\":\"2021-09-16T13:37:10Z\",\"lastTriggerTime\":\"2021-05-02T05:08:07Z\",\"subscriptions\":[\"cvpnazzmhjrunmpx\",\"tdbhrbnla\",\"kx\",\"yskpbhen\"],\"complianceStatus\":{\"m365\":{\"passedCount\":2016648328,\"failedCount\":83692384,\"manualCount\":17421119,\"notApplicableCount\":782555579,\"pendingCount\":1863766018}},\"storageInfo\":{\"subscriptionId\":\"lqidyby\",\"resourceGroup\":\"zfcl\",\"accountName\":\"axdbabph\",\"location\":\"rqlfktsthsucocmn\"},\"certRecords\":[{\"offerGuid\":\"t\",\"certificationStatus\":\"twwrqp\",\"ingestionStatus\":\"dckzywbiexz\",\"controls\":[{\"controlId\":\"eaxib\",\"controlStatus\":\"jwbhqwalmuz\"},{\"controlId\":\"xaepdkzjancuxr\",\"controlStatus\":\"wbavxbniwdj\"},{\"controlId\":\"zt\",\"controlStatus\":\"bpg\"}]}],\"provisioningState\":\"Canceled\"}")
            .toObject(ReportPatchProperties.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-20T06:05:50Z"), model.triggerTime());
        Assertions.assertEquals("ymuctqhjfbebrj", model.timeZone());
        Assertions.assertEquals("rfuwutt", model.resources().get(0).resourceId());
        Assertions.assertEquals("fvjrbirphxepcy", model.resources().get(0).resourceType());
        Assertions.assertEquals("hfnljkyq", model.resources().get(0).resourceKind());
        Assertions.assertEquals(ResourceOrigin.GCP, model.resources().get(0).resourceOrigin());
        Assertions.assertEquals("ujqgidok", model.resources().get(0).accountId());
        Assertions.assertEquals("bfs", model.offerGuid());
        Assertions.assertEquals("lqidyby", model.storageInfo().subscriptionId());
        Assertions.assertEquals("zfcl", model.storageInfo().resourceGroup());
        Assertions.assertEquals("axdbabph", model.storageInfo().accountName());
        Assertions.assertEquals("rqlfktsthsucocmn", model.storageInfo().location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReportPatchProperties model
            = new ReportPatchProperties().withTriggerTime(OffsetDateTime.parse("2021-09-20T06:05:50Z"))
                .withTimeZone("ymuctqhjfbebrj")
                .withResources(Arrays.asList(
                    new ResourceMetadata().withResourceId("rfuwutt")
                        .withResourceType("fvjrbirphxepcy")
                        .withResourceKind("hfnljkyq")
                        .withResourceOrigin(ResourceOrigin.GCP)
                        .withAccountId("ujqgidok"),
                    new ResourceMetadata().withResourceId("jljyoxgv")
                        .withResourceType("tbgsncghkj")
                        .withResourceKind("zz")
                        .withResourceOrigin(ResourceOrigin.AWS)
                        .withAccountId("htxfvgxbfsmxnehm"),
                    new ResourceMetadata().withResourceId("vecxgodebfqkk")
                        .withResourceType("mpukgriw")
                        .withResourceKind("zlfbxzpuzycispnq")
                        .withResourceOrigin(ResourceOrigin.GCP)
                        .withAccountId("gkbrpyyd")))
                .withOfferGuid("bfs")
                .withStorageInfo(new StorageInfo().withSubscriptionId("lqidyby")
                    .withResourceGroup("zfcl")
                    .withAccountName("axdbabph")
                    .withLocation("rqlfktsthsucocmn"));
        model = BinaryData.fromObject(model).toObject(ReportPatchProperties.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-20T06:05:50Z"), model.triggerTime());
        Assertions.assertEquals("ymuctqhjfbebrj", model.timeZone());
        Assertions.assertEquals("rfuwutt", model.resources().get(0).resourceId());
        Assertions.assertEquals("fvjrbirphxepcy", model.resources().get(0).resourceType());
        Assertions.assertEquals("hfnljkyq", model.resources().get(0).resourceKind());
        Assertions.assertEquals(ResourceOrigin.GCP, model.resources().get(0).resourceOrigin());
        Assertions.assertEquals("ujqgidok", model.resources().get(0).accountId());
        Assertions.assertEquals("bfs", model.offerGuid());
        Assertions.assertEquals("lqidyby", model.storageInfo().subscriptionId());
        Assertions.assertEquals("zfcl", model.storageInfo().resourceGroup());
        Assertions.assertEquals("axdbabph", model.storageInfo().accountName());
        Assertions.assertEquals("rqlfktsthsucocmn", model.storageInfo().location());
    }
}
