// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.SecurityServices;
import org.junit.jupiter.api.Assertions;

public final class SecurityServicesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecurityServices model = BinaryData.fromString(
            "{\"vulnerabilityProfile\":\"sfqpteehz\",\"antiSpywareProfile\":\"ypyqrimzinp\",\"antiVirusProfile\":\"wjdk\",\"urlFilteringProfile\":\"soodqxhcrmnoh\",\"fileBlockingProfile\":\"ckwhds\",\"dnsSubscription\":\"fiyipjxsqwpgrj\",\"outboundUnTrustCertificate\":\"norcjxvsnbyxqab\",\"outboundTrustCertificate\":\"ocpcy\"}")
            .toObject(SecurityServices.class);
        Assertions.assertEquals("sfqpteehz", model.vulnerabilityProfile());
        Assertions.assertEquals("ypyqrimzinp", model.antiSpywareProfile());
        Assertions.assertEquals("wjdk", model.antiVirusProfile());
        Assertions.assertEquals("soodqxhcrmnoh", model.urlFilteringProfile());
        Assertions.assertEquals("ckwhds", model.fileBlockingProfile());
        Assertions.assertEquals("fiyipjxsqwpgrj", model.dnsSubscription());
        Assertions.assertEquals("norcjxvsnbyxqab", model.outboundUnTrustCertificate());
        Assertions.assertEquals("ocpcy", model.outboundTrustCertificate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecurityServices model = new SecurityServices().withVulnerabilityProfile("sfqpteehz")
            .withAntiSpywareProfile("ypyqrimzinp").withAntiVirusProfile("wjdk").withUrlFilteringProfile("soodqxhcrmnoh")
            .withFileBlockingProfile("ckwhds").withDnsSubscription("fiyipjxsqwpgrj")
            .withOutboundUnTrustCertificate("norcjxvsnbyxqab").withOutboundTrustCertificate("ocpcy");
        model = BinaryData.fromObject(model).toObject(SecurityServices.class);
        Assertions.assertEquals("sfqpteehz", model.vulnerabilityProfile());
        Assertions.assertEquals("ypyqrimzinp", model.antiSpywareProfile());
        Assertions.assertEquals("wjdk", model.antiVirusProfile());
        Assertions.assertEquals("soodqxhcrmnoh", model.urlFilteringProfile());
        Assertions.assertEquals("ckwhds", model.fileBlockingProfile());
        Assertions.assertEquals("fiyipjxsqwpgrj", model.dnsSubscription());
        Assertions.assertEquals("norcjxvsnbyxqab", model.outboundUnTrustCertificate());
        Assertions.assertEquals("ocpcy", model.outboundTrustCertificate());
    }
}
