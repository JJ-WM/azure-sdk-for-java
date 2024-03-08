// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Application Gateway protocol.
 */
public final class ApplicationGatewayProtocol extends ExpandableStringEnum<ApplicationGatewayProtocol> {
    /**
     * Static value Http for ApplicationGatewayProtocol.
     */
    public static final ApplicationGatewayProtocol HTTP = fromString("Http");

    /**
     * Static value Https for ApplicationGatewayProtocol.
     */
    public static final ApplicationGatewayProtocol HTTPS = fromString("Https");

    /**
     * Static value Tcp for ApplicationGatewayProtocol.
     */
    public static final ApplicationGatewayProtocol TCP = fromString("Tcp");

    /**
     * Static value Tls for ApplicationGatewayProtocol.
     */
    public static final ApplicationGatewayProtocol TLS = fromString("Tls");

    /**
     * Creates a new instance of ApplicationGatewayProtocol value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ApplicationGatewayProtocol() {
    }

    /**
     * Creates or finds a ApplicationGatewayProtocol from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ApplicationGatewayProtocol.
     */
    @JsonCreator
    public static ApplicationGatewayProtocol fromString(String name) {
        return fromString(name, ApplicationGatewayProtocol.class);
    }

    /**
     * Gets known ApplicationGatewayProtocol values.
     * 
     * @return known ApplicationGatewayProtocol values.
     */
    public static Collection<ApplicationGatewayProtocol> values() {
        return values(ApplicationGatewayProtocol.class);
    }
}
