// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.BackendServiceFabricClusterProperties;
import com.azure.resourcemanager.apimanagement.models.X509CertificateName;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class BackendServiceFabricClusterPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackendServiceFabricClusterProperties model =
            BinaryData
                .fromString(
                    "{\"clientCertificateId\":\"exyionofninbd\",\"clientCertificatethumbprint\":\"s\",\"maxPartitionResolutionRetries\":1883901064,\"managementEndpoints\":[\"qrs\",\"pcbbprtugav\",\"zbcyksiv\",\"fogdrtbfcm\"],\"serverCertificateThumbprints\":[\"tsjcwjjxs\",\"mb\"],\"serverX509Names\":[{\"name\":\"fdxkecifhocjxwkl\",\"issuerCertificateThumbprint\":\"zrvtx\"},{\"name\":\"mufun\",\"issuerCertificateThumbprint\":\"px\"},{\"name\":\"ir\",\"issuerCertificateThumbprint\":\"yngjgvrquvpygglp\"},{\"name\":\"rdcueljtiahx\",\"issuerCertificateThumbprint\":\"q\"}]}")
                .toObject(BackendServiceFabricClusterProperties.class);
        Assertions.assertEquals("exyionofninbd", model.clientCertificateId());
        Assertions.assertEquals("s", model.clientCertificatethumbprint());
        Assertions.assertEquals(1883901064, model.maxPartitionResolutionRetries());
        Assertions.assertEquals("qrs", model.managementEndpoints().get(0));
        Assertions.assertEquals("tsjcwjjxs", model.serverCertificateThumbprints().get(0));
        Assertions.assertEquals("fdxkecifhocjxwkl", model.serverX509Names().get(0).name());
        Assertions.assertEquals("zrvtx", model.serverX509Names().get(0).issuerCertificateThumbprint());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackendServiceFabricClusterProperties model =
            new BackendServiceFabricClusterProperties()
                .withClientCertificateId("exyionofninbd")
                .withClientCertificatethumbprint("s")
                .withMaxPartitionResolutionRetries(1883901064)
                .withManagementEndpoints(Arrays.asList("qrs", "pcbbprtugav", "zbcyksiv", "fogdrtbfcm"))
                .withServerCertificateThumbprints(Arrays.asList("tsjcwjjxs", "mb"))
                .withServerX509Names(
                    Arrays
                        .asList(
                            new X509CertificateName()
                                .withName("fdxkecifhocjxwkl")
                                .withIssuerCertificateThumbprint("zrvtx"),
                            new X509CertificateName().withName("mufun").withIssuerCertificateThumbprint("px"),
                            new X509CertificateName()
                                .withName("ir")
                                .withIssuerCertificateThumbprint("yngjgvrquvpygglp"),
                            new X509CertificateName().withName("rdcueljtiahx").withIssuerCertificateThumbprint("q")));
        model = BinaryData.fromObject(model).toObject(BackendServiceFabricClusterProperties.class);
        Assertions.assertEquals("exyionofninbd", model.clientCertificateId());
        Assertions.assertEquals("s", model.clientCertificatethumbprint());
        Assertions.assertEquals(1883901064, model.maxPartitionResolutionRetries());
        Assertions.assertEquals("qrs", model.managementEndpoints().get(0));
        Assertions.assertEquals("tsjcwjjxs", model.serverCertificateThumbprints().get(0));
        Assertions.assertEquals("fdxkecifhocjxwkl", model.serverX509Names().get(0).name());
        Assertions.assertEquals("zrvtx", model.serverX509Names().get(0).issuerCertificateThumbprint());
    }
}
