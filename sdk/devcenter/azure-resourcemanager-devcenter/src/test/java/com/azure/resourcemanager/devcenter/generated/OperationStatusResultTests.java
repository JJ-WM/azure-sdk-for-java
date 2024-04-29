// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.OperationStatusResult;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationStatusResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationStatusResult model = BinaryData.fromString(
            "{\"id\":\"gg\",\"resourceId\":\"sb\",\"name\":\"ovvtgseinqfiu\",\"status\":\"x\",\"percentComplete\":68.516174,\"startTime\":\"2021-05-31T07:01:39Z\",\"endTime\":\"2021-03-12T06:20:37Z\",\"operations\":[{\"id\":\"ttwqmsni\",\"resourceId\":\"cdm\",\"name\":\"r\",\"status\":\"jlpijnkrx\",\"percentComplete\":64.470695,\"startTime\":\"2021-08-19T01:34:13Z\",\"endTime\":\"2021-01-09T04:43:14Z\",\"operations\":[{\"id\":\"zzronasx\",\"resourceId\":\"tozqyzhftwesgo\",\"name\":\"zhonnxkrlgnyhmo\",\"status\":\"sxkkg\",\"percentComplete\":99.30511,\"startTime\":\"2021-04-03T23:15:39Z\",\"endTime\":\"2021-07-14T05:25:31Z\",\"operations\":[{\"status\":\"dhqxvcx\"},{\"status\":\"frpdsofbshrns\"},{\"status\":\"buswdvzyy\"}]},{\"id\":\"nu\",\"resourceId\":\"jsrtk\",\"name\":\"wnopqgikyzirtx\",\"status\":\"yuxzejntpsewgi\",\"percentComplete\":5.1279726,\"startTime\":\"2021-03-06T20:05:06Z\",\"endTime\":\"2021-10-31T01:38:06Z\",\"operations\":[{\"status\":\"xtqmieoxor\"},{\"status\":\"gufhyaomtbg\"},{\"status\":\"havgrvk\"}]},{\"id\":\"vjzhpjbib\",\"resourceId\":\"mfxumvfcluyovw\",\"name\":\"bkfezzxscyhwzdgi\",\"status\":\"ujb\",\"percentComplete\":46.423805,\"startTime\":\"2021-02-14T17:43:30Z\",\"endTime\":\"2021-12-01T21:22:39Z\",\"operations\":[{\"status\":\"dcqvpn\"},{\"status\":\"yujviylwdshfssn\"},{\"status\":\"bgye\"}]}]},{\"id\":\"sgaojfmwncot\",\"resourceId\":\"fhir\",\"name\":\"ymoxoftpipiwyczu\",\"status\":\"xacpqjli\",\"percentComplete\":49.662262,\"startTime\":\"2021-03-23T23:20:42Z\",\"endTime\":\"2021-01-11T22:34:27Z\",\"operations\":[{\"id\":\"dvlmfwdgzxul\",\"resourceId\":\"vpa\",\"name\":\"sreuzvxurisjnh\",\"status\":\"ytxifqjzgxmrh\",\"percentComplete\":8.54001,\"startTime\":\"2021-09-19T19:58:44Z\",\"endTime\":\"2021-07-03T12:52:54Z\",\"operations\":[{\"status\":\"trgjupauutpwoqh\"}]},{\"id\":\"jqgwzp\",\"resourceId\":\"qntcypsxjvfoimwk\",\"name\":\"ircizjxvy\",\"status\":\"fceacvlhvygd\",\"percentComplete\":1.020509,\"startTime\":\"2021-02-08T02:04:14Z\",\"endTime\":\"2021-02-22T08:30:01Z\",\"operations\":[{\"status\":\"awjs\"},{\"status\":\"biwkojgcyzt\"},{\"status\":\"fmznba\"},{\"status\":\"qphchqnrnrpxehuw\"}]}]},{\"id\":\"gaifmvik\",\"resourceId\":\"ydv\",\"name\":\"bejdznxcv\",\"status\":\"srhnjivo\",\"percentComplete\":96.95902,\"startTime\":\"2021-03-07T07:40:39Z\",\"endTime\":\"2021-09-15T23:45:01Z\",\"operations\":[{\"id\":\"emjdftul\",\"resourceId\":\"tduceamt\",\"name\":\"zuo\",\"status\":\"ejwcwwqiok\",\"percentComplete\":8.696121,\"startTime\":\"2021-04-14T11:00:49Z\",\"endTime\":\"2021-08-22T03:58:36Z\",\"operations\":[{\"status\":\"vpkjpr\"}]},{\"id\":\"cfzq\",\"resourceId\":\"yxgtczh\",\"name\":\"dbsdshm\",\"status\":\"xmaehvbbxu\",\"percentComplete\":56.19762,\"startTime\":\"2021-06-29T01:43:25Z\",\"endTime\":\"2021-08-11T19:12:35Z\",\"operations\":[{\"status\":\"baxk\"},{\"status\":\"xywr\"}]},{\"id\":\"yklyhpluodpvruud\",\"resourceId\":\"zibt\",\"name\":\"stgktst\",\"status\":\"dxeclzedqbcvh\",\"percentComplete\":1.2831509,\"startTime\":\"2021-07-17T21:14:55Z\",\"endTime\":\"2021-02-01T15:52:58Z\",\"operations\":[{\"status\":\"dlwwqfbumlkxt\"}]},{\"id\":\"fsmlmbtxhwgfw\",\"resourceId\":\"tawc\",\"name\":\"zbrhubskhudyg\",\"status\":\"ookk\",\"percentComplete\":70.261795,\"startTime\":\"2021-07-12T13:05:01Z\",\"endTime\":\"2021-03-17T22:00:43Z\",\"operations\":[{\"status\":\"fmluiqtqzfavyvn\"},{\"status\":\"qybaryeua\"},{\"status\":\"jkqa\"}]}]}]}")
            .toObject(OperationStatusResult.class);
        Assertions.assertEquals("gg", model.id());
        Assertions.assertEquals("ovvtgseinqfiu", model.name());
        Assertions.assertEquals("x", model.status());
        Assertions.assertEquals(68.516174F, model.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-31T07:01:39Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-12T06:20:37Z"), model.endTime());
        Assertions.assertEquals("ttwqmsni", model.operations().get(0).id());
        Assertions.assertEquals("r", model.operations().get(0).name());
        Assertions.assertEquals("jlpijnkrx", model.operations().get(0).status());
        Assertions.assertEquals(64.470695F, model.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-19T01:34:13Z"), model.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-09T04:43:14Z"), model.operations().get(0).endTime());
        Assertions.assertEquals("zzronasx", model.operations().get(0).operations().get(0).id());
        Assertions.assertEquals("zhonnxkrlgnyhmo", model.operations().get(0).operations().get(0).name());
        Assertions.assertEquals("sxkkg", model.operations().get(0).operations().get(0).status());
        Assertions.assertEquals(99.30511F, model.operations().get(0).operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-03T23:15:39Z"),
            model.operations().get(0).operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-14T05:25:31Z"),
            model.operations().get(0).operations().get(0).endTime());
        Assertions.assertEquals("dhqxvcx", model.operations().get(0).operations().get(0).operations().get(0).status());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationStatusResult model
            = new OperationStatusResult().withId("gg")
                .withName("ovvtgseinqfiu")
                .withStatus("x")
                .withPercentComplete(68.516174F)
                .withStartTime(OffsetDateTime.parse("2021-05-31T07:01:39Z"))
                .withEndTime(OffsetDateTime.parse("2021-03-12T06:20:37Z"))
                .withOperations(Arrays
                    .asList(
                        new OperationStatusResult()
                            .withId("ttwqmsni")
                            .withName("r")
                            .withStatus("jlpijnkrx")
                            .withPercentComplete(64.470695F)
                            .withStartTime(OffsetDateTime.parse("2021-08-19T01:34:13Z"))
                            .withEndTime(OffsetDateTime.parse("2021-01-09T04:43:14Z"))
                            .withOperations(Arrays.asList(
                                new OperationStatusResult().withId("zzronasx")
                                    .withName("zhonnxkrlgnyhmo")
                                    .withStatus("sxkkg")
                                    .withPercentComplete(99.30511F)
                                    .withStartTime(OffsetDateTime.parse("2021-04-03T23:15:39Z"))
                                    .withEndTime(OffsetDateTime.parse("2021-07-14T05:25:31Z"))
                                    .withOperations(Arrays.asList(new OperationStatusResult().withStatus("dhqxvcx"),
                                        new OperationStatusResult().withStatus("frpdsofbshrns"),
                                        new OperationStatusResult().withStatus("buswdvzyy"))),
                                new OperationStatusResult().withId("nu")
                                    .withName("wnopqgikyzirtx")
                                    .withStatus("yuxzejntpsewgi")
                                    .withPercentComplete(5.1279726F)
                                    .withStartTime(OffsetDateTime.parse("2021-03-06T20:05:06Z"))
                                    .withEndTime(OffsetDateTime.parse("2021-10-31T01:38:06Z"))
                                    .withOperations(Arrays.asList(new OperationStatusResult().withStatus("xtqmieoxor"),
                                        new OperationStatusResult().withStatus("gufhyaomtbg"),
                                        new OperationStatusResult().withStatus("havgrvk"))),
                                new OperationStatusResult().withId("vjzhpjbib")
                                    .withName("bkfezzxscyhwzdgi")
                                    .withStatus("ujb")
                                    .withPercentComplete(46.423805F)
                                    .withStartTime(OffsetDateTime.parse("2021-02-14T17:43:30Z"))
                                    .withEndTime(OffsetDateTime.parse("2021-12-01T21:22:39Z"))
                                    .withOperations(Arrays.asList(new OperationStatusResult().withStatus("dcqvpn"),
                                        new OperationStatusResult().withStatus("yujviylwdshfssn"),
                                        new OperationStatusResult().withStatus("bgye"))))),
                        new OperationStatusResult().withId("sgaojfmwncot")
                            .withName("ymoxoftpipiwyczu")
                            .withStatus("xacpqjli")
                            .withPercentComplete(49.662262F)
                            .withStartTime(OffsetDateTime.parse("2021-03-23T23:20:42Z"))
                            .withEndTime(OffsetDateTime.parse("2021-01-11T22:34:27Z"))
                            .withOperations(
                                Arrays.asList(
                                    new OperationStatusResult().withId("dvlmfwdgzxul")
                                        .withName("sreuzvxurisjnh")
                                        .withStatus("ytxifqjzgxmrh")
                                        .withPercentComplete(8.54001F)
                                        .withStartTime(OffsetDateTime.parse("2021-09-19T19:58:44Z"))
                                        .withEndTime(OffsetDateTime.parse("2021-07-03T12:52:54Z"))
                                        .withOperations(
                                            Arrays.asList(new OperationStatusResult().withStatus("trgjupauutpwoqh"))),
                                    new OperationStatusResult()
                                        .withId("jqgwzp")
                                        .withName("ircizjxvy")
                                        .withStatus("fceacvlhvygd")
                                        .withPercentComplete(1.020509F)
                                        .withStartTime(OffsetDateTime.parse("2021-02-08T02:04:14Z"))
                                        .withEndTime(OffsetDateTime.parse("2021-02-22T08:30:01Z"))
                                        .withOperations(
                                            Arrays.asList(new OperationStatusResult().withStatus("awjs"),
                                                new OperationStatusResult().withStatus("biwkojgcyzt"),
                                                new OperationStatusResult().withStatus("fmznba"),
                                                new OperationStatusResult().withStatus("qphchqnrnrpxehuw"))))),
                        new OperationStatusResult().withId("gaifmvik")
                            .withName("bejdznxcv")
                            .withStatus("srhnjivo")
                            .withPercentComplete(96.95902F)
                            .withStartTime(OffsetDateTime.parse("2021-03-07T07:40:39Z"))
                            .withEndTime(OffsetDateTime.parse("2021-09-15T23:45:01Z"))
                            .withOperations(Arrays.asList(new OperationStatusResult()
                                .withId("emjdftul")
                                .withName("zuo")
                                .withStatus("ejwcwwqiok")
                                .withPercentComplete(8.696121F)
                                .withStartTime(OffsetDateTime.parse("2021-04-14T11:00:49Z"))
                                .withEndTime(OffsetDateTime.parse("2021-08-22T03:58:36Z"))
                                .withOperations(Arrays.asList(new OperationStatusResult().withStatus("vpkjpr"))),
                                new OperationStatusResult().withId("cfzq")
                                    .withName("dbsdshm")
                                    .withStatus("xmaehvbbxu")
                                    .withPercentComplete(56.19762F)
                                    .withStartTime(OffsetDateTime.parse("2021-06-29T01:43:25Z"))
                                    .withEndTime(OffsetDateTime.parse("2021-08-11T19:12:35Z"))
                                    .withOperations(Arrays.asList(new OperationStatusResult().withStatus("baxk"),
                                        new OperationStatusResult().withStatus("xywr"))),
                                new OperationStatusResult()
                                    .withId("yklyhpluodpvruud")
                                    .withName("stgktst")
                                    .withStatus("dxeclzedqbcvh")
                                    .withPercentComplete(1.2831509F)
                                    .withStartTime(OffsetDateTime.parse("2021-07-17T21:14:55Z"))
                                    .withEndTime(OffsetDateTime.parse("2021-02-01T15:52:58Z"))
                                    .withOperations(
                                        Arrays.asList(new OperationStatusResult().withStatus("dlwwqfbumlkxt"))),
                                new OperationStatusResult().withId("fsmlmbtxhwgfw")
                                    .withName("zbrhubskhudyg")
                                    .withStatus("ookk")
                                    .withPercentComplete(70.261795F)
                                    .withStartTime(OffsetDateTime.parse("2021-07-12T13:05:01Z"))
                                    .withEndTime(OffsetDateTime.parse("2021-03-17T22:00:43Z"))
                                    .withOperations(
                                        Arrays.asList(new OperationStatusResult().withStatus("fmluiqtqzfavyvn"),
                                            new OperationStatusResult().withStatus("qybaryeua"),
                                            new OperationStatusResult().withStatus("jkqa")))))));
        model = BinaryData.fromObject(model).toObject(OperationStatusResult.class);
        Assertions.assertEquals("gg", model.id());
        Assertions.assertEquals("ovvtgseinqfiu", model.name());
        Assertions.assertEquals("x", model.status());
        Assertions.assertEquals(68.516174F, model.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-31T07:01:39Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-12T06:20:37Z"), model.endTime());
        Assertions.assertEquals("ttwqmsni", model.operations().get(0).id());
        Assertions.assertEquals("r", model.operations().get(0).name());
        Assertions.assertEquals("jlpijnkrx", model.operations().get(0).status());
        Assertions.assertEquals(64.470695F, model.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-19T01:34:13Z"), model.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-09T04:43:14Z"), model.operations().get(0).endTime());
        Assertions.assertEquals("zzronasx", model.operations().get(0).operations().get(0).id());
        Assertions.assertEquals("zhonnxkrlgnyhmo", model.operations().get(0).operations().get(0).name());
        Assertions.assertEquals("sxkkg", model.operations().get(0).operations().get(0).status());
        Assertions.assertEquals(99.30511F, model.operations().get(0).operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-03T23:15:39Z"),
            model.operations().get(0).operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-14T05:25:31Z"),
            model.operations().get(0).operations().get(0).endTime());
        Assertions.assertEquals("dhqxvcx", model.operations().get(0).operations().get(0).operations().get(0).status());
    }
}
