// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The Service model.
 */
@Immutable
public final class Service {

    /*
     * The scheme property.
     */
    @Generated
    @JsonProperty(value = "scheme")
    private String scheme;

    /*
     * The port property.
     */
    @Generated
    @JsonProperty(value = "port")
    private Integer port;

    /*
     * The webComponents property.
     */
    @Generated
    @JsonProperty(value = "webComponents")
    private List<WebComponent> webComponents;

    /*
     * The sslCerts property.
     */
    @Generated
    @JsonProperty(value = "sslCerts")
    private List<SslCertAsset> sslCerts;

    /*
     * The exceptions property.
     */
    @Generated
    @JsonProperty(value = "exceptions")
    private List<ObservedString> exceptions;

    /*
     * The sources property.
     */
    @Generated
    @JsonProperty(value = "sources")
    private List<Source> sources;

    /*
     * The firstSeen property.
     */
    @Generated
    @JsonProperty(value = "firstSeen")
    private OffsetDateTime firstSeen;

    /*
     * The lastSeen property.
     */
    @Generated
    @JsonProperty(value = "lastSeen")
    private OffsetDateTime lastSeen;

    /*
     * The count property.
     */
    @Generated
    @JsonProperty(value = "count")
    private Long count;

    /*
     * The recent property.
     */
    @Generated
    @JsonProperty(value = "recent")
    private Boolean recent;

    /*
     * The portStates property.
     */
    @Generated
    @JsonProperty(value = "portStates")
    private List<ObservedPortState> portStates;

    /**
     * Creates an instance of Service class.
     */
    @Generated
    private Service() {
    }

    /**
     * Get the scheme property: The scheme property.
     *
     * @return the scheme value.
     */
    @Generated
    public String getScheme() {
        return this.scheme;
    }

    /**
     * Get the port property: The port property.
     *
     * @return the port value.
     */
    @Generated
    public Integer getPort() {
        return this.port;
    }

    /**
     * Get the webComponents property: The webComponents property.
     *
     * @return the webComponents value.
     */
    @Generated
    public List<WebComponent> getWebComponents() {
        return this.webComponents;
    }

    /**
     * Get the sslCerts property: The sslCerts property.
     *
     * @return the sslCerts value.
     */
    @Generated
    public List<SslCertAsset> getSslCerts() {
        return this.sslCerts;
    }

    /**
     * Get the exceptions property: The exceptions property.
     *
     * @return the exceptions value.
     */
    @Generated
    public List<ObservedString> getExceptions() {
        return this.exceptions;
    }

    /**
     * Get the sources property: The sources property.
     *
     * @return the sources value.
     */
    @Generated
    public List<Source> getSources() {
        return this.sources;
    }

    /**
     * Get the firstSeen property: The firstSeen property.
     *
     * @return the firstSeen value.
     */
    @Generated
    public OffsetDateTime getFirstSeen() {
        return this.firstSeen;
    }

    /**
     * Get the lastSeen property: The lastSeen property.
     *
     * @return the lastSeen value.
     */
    @Generated
    public OffsetDateTime getLastSeen() {
        return this.lastSeen;
    }

    /**
     * Get the count property: The count property.
     *
     * @return the count value.
     */
    @Generated
    public Long getCount() {
        return this.count;
    }

    /**
     * Get the recent property: The recent property.
     *
     * @return the recent value.
     */
    @Generated
    public Boolean isRecent() {
        return this.recent;
    }

    /**
     * Get the portStates property: The portStates property.
     *
     * @return the portStates value.
     */
    @Generated
    public List<ObservedPortState> getPortStates() {
        return this.portStates;
    }
}
