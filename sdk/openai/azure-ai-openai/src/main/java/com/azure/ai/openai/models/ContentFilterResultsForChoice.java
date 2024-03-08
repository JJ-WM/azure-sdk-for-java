// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.models.ResponseError;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Information about content filtering evaluated against generated model output.
 */
@Immutable
public final class ContentFilterResultsForChoice {

    /*
     * Describes language related to anatomical organs and genitals, romantic relationships,
     * acts portrayed in erotic or affectionate terms, physical sexual acts, including
     * those portrayed as an assault or a forced sexual violent act against one’s will,
     * prostitution, pornography, and abuse.
     */
    @Generated
    @JsonProperty(value = "sexual")
    private ContentFilterResult sexual;

    /*
     * Describes language related to physical actions intended to hurt, injure, damage, or
     * kill someone or something; describes weapons, etc.
     */
    @Generated
    @JsonProperty(value = "violence")
    private ContentFilterResult violence;

    /*
     * Describes language attacks or uses that include pejorative or discriminatory language
     * with reference to a person or identity group on the basis of certain differentiating
     * attributes of these groups including but not limited to race, ethnicity, nationality,
     * gender identity and expression, sexual orientation, religion, immigration status, ability
     * status, personal appearance, and body size.
     */
    @Generated
    @JsonProperty(value = "hate")
    private ContentFilterResult hate;

    /*
     * Describes language related to physical actions intended to purposely hurt, injure,
     * or damage one’s body, or kill oneself.
     */
    @Generated
    @JsonProperty(value = "self_harm")
    private ContentFilterResult selfHarm;

    /*
     * Describes whether profanity was detected.
     */
    @Generated
    @JsonProperty(value = "profanity")
    private ContentFilterDetectionResult profanity;

    /*
     * Describes detection results against configured custom blocklists.
     */
    @Generated
    @JsonProperty(value = "custom_blocklists")
    private List<ContentFilterBlocklistIdResult> customBlocklists;

    /*
     * Describes an error returned if the content filtering system is
     * down or otherwise unable to complete the operation in time.
     */
    @Generated
    @JsonProperty(value = "error")
    private ResponseError error;

    /*
     * Information about detection of protected text material.
     */
    @Generated
    @JsonProperty(value = "protected_material_text")
    private ContentFilterDetectionResult protectedMaterialText;

    /*
     * Information about detection of protected code material.
     */
    @Generated
    @JsonProperty(value = "protected_material_code")
    private ContentFilterCitedDetectionResult protectedMaterialCode;

    /**
     * Creates an instance of ContentFilterResultsForChoice class.
     */
    @Generated
    private ContentFilterResultsForChoice() {
    }

    /**
     * Get the sexual property: Describes language related to anatomical organs and genitals, romantic relationships,
     * acts portrayed in erotic or affectionate terms, physical sexual acts, including
     * those portrayed as an assault or a forced sexual violent act against one’s will,
     * prostitution, pornography, and abuse.
     *
     * @return the sexual value.
     */
    @Generated
    public ContentFilterResult getSexual() {
        return this.sexual;
    }

    /**
     * Get the violence property: Describes language related to physical actions intended to hurt, injure, damage, or
     * kill someone or something; describes weapons, etc.
     *
     * @return the violence value.
     */
    @Generated
    public ContentFilterResult getViolence() {
        return this.violence;
    }

    /**
     * Get the hate property: Describes language attacks or uses that include pejorative or discriminatory language
     * with reference to a person or identity group on the basis of certain differentiating
     * attributes of these groups including but not limited to race, ethnicity, nationality,
     * gender identity and expression, sexual orientation, religion, immigration status, ability
     * status, personal appearance, and body size.
     *
     * @return the hate value.
     */
    @Generated
    public ContentFilterResult getHate() {
        return this.hate;
    }

    /**
     * Get the selfHarm property: Describes language related to physical actions intended to purposely hurt, injure,
     * or damage one’s body, or kill oneself.
     *
     * @return the selfHarm value.
     */
    @Generated
    public ContentFilterResult getSelfHarm() {
        return this.selfHarm;
    }

    /**
     * Get the profanity property: Describes whether profanity was detected.
     *
     * @return the profanity value.
     */
    @Generated
    public ContentFilterDetectionResult getProfanity() {
        return this.profanity;
    }

    /**
     * Get the customBlocklists property: Describes detection results against configured custom blocklists.
     *
     * @return the customBlocklists value.
     */
    @Generated
    public List<ContentFilterBlocklistIdResult> getCustomBlocklists() {
        return this.customBlocklists;
    }

    /**
     * Get the error property: Describes an error returned if the content filtering system is
     * down or otherwise unable to complete the operation in time.
     *
     * @return the error value.
     */
    @Generated
    public ResponseError getError() {
        return this.error;
    }

    /**
     * Get the protectedMaterialText property: Information about detection of protected text material.
     *
     * @return the protectedMaterialText value.
     */
    @Generated
    public ContentFilterDetectionResult getProtectedMaterialText() {
        return this.protectedMaterialText;
    }

    /**
     * Get the protectedMaterialCode property: Information about detection of protected code material.
     *
     * @return the protectedMaterialCode value.
     */
    @Generated
    public ContentFilterCitedDetectionResult getProtectedMaterialCode() {
        return this.protectedMaterialCode;
    }
}
