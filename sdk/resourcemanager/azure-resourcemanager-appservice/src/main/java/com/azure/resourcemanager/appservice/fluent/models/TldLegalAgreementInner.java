// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Legal agreement for a top level domain.
 */
@Fluent
public final class TldLegalAgreementInner {
    /*
     * Unique identifier for the agreement.
     */
    @JsonProperty(value = "agreementKey", required = true)
    private String agreementKey;

    /*
     * Agreement title.
     */
    @JsonProperty(value = "title", required = true)
    private String title;

    /*
     * Agreement details.
     */
    @JsonProperty(value = "content", required = true)
    private String content;

    /*
     * URL where a copy of the agreement details is hosted.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * Creates an instance of TldLegalAgreementInner class.
     */
    public TldLegalAgreementInner() {
    }

    /**
     * Get the agreementKey property: Unique identifier for the agreement.
     * 
     * @return the agreementKey value.
     */
    public String agreementKey() {
        return this.agreementKey;
    }

    /**
     * Set the agreementKey property: Unique identifier for the agreement.
     * 
     * @param agreementKey the agreementKey value to set.
     * @return the TldLegalAgreementInner object itself.
     */
    public TldLegalAgreementInner withAgreementKey(String agreementKey) {
        this.agreementKey = agreementKey;
        return this;
    }

    /**
     * Get the title property: Agreement title.
     * 
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: Agreement title.
     * 
     * @param title the title value to set.
     * @return the TldLegalAgreementInner object itself.
     */
    public TldLegalAgreementInner withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the content property: Agreement details.
     * 
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content property: Agreement details.
     * 
     * @param content the content value to set.
     * @return the TldLegalAgreementInner object itself.
     */
    public TldLegalAgreementInner withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the url property: URL where a copy of the agreement details is hosted.
     * 
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: URL where a copy of the agreement details is hosted.
     * 
     * @param url the url value to set.
     * @return the TldLegalAgreementInner object itself.
     */
    public TldLegalAgreementInner withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (agreementKey() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property agreementKey in model TldLegalAgreementInner"));
        }
        if (title() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property title in model TldLegalAgreementInner"));
        }
        if (content() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property content in model TldLegalAgreementInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TldLegalAgreementInner.class);
}
