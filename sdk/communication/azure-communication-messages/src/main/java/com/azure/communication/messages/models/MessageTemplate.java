// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.messages.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The template object used to create templates.
 */
@Fluent
public final class MessageTemplate {

    /*
     * Name of the template.
     */
    @Generated
    @JsonProperty(value = "name")
    private final String name;

    /*
     * The template's language, in the ISO 639 format, consist of a two-letter language code followed by an optional
     * two-letter country code, e.g., 'en' or 'en_US'.
     */
    @Generated
    @JsonProperty(value = "language")
    private final String language;

    /*
     * The template values.
     */
    @Generated
    @JsonProperty(value = "values")
    private List<MessageTemplateValue> values;

    /*
     * The binding object to link values to the template specific locations
     */
    @Generated
    @JsonProperty(value = "bindings")
    private MessageTemplateBindings bindings;

    /**
     * Creates an instance of MessageTemplate class.
     *
     * @param name the name value to set.
     * @param language the language value to set.
     */
    @Generated
    @JsonCreator
    public MessageTemplate(@JsonProperty(value = "name") String name,
        @JsonProperty(value = "language") String language) {
        this.name = name;
        this.language = language;
    }

    /**
     * Get the name property: Name of the template.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the language property: The template's language, in the ISO 639 format, consist of a two-letter language code
     * followed by an optional two-letter country code, e.g., 'en' or 'en_US'.
     *
     * @return the language value.
     */
    @Generated
    public String getLanguage() {
        return this.language;
    }

    /**
     * Get the values property: The template values.
     *
     * @return the values value.
     */
    @Generated
    public List<MessageTemplateValue> getValues() {
        return this.values;
    }

    /**
     * Set the values property: The template values.
     *
     * @param values the values value to set.
     * @return the MessageTemplate object itself.
     */
    @Generated
    public MessageTemplate setValues(List<MessageTemplateValue> values) {
        this.values = values;
        return this;
    }

    /**
     * Get the bindings property: The binding object to link values to the template specific locations.
     *
     * @return the bindings value.
     */
    @Generated
    public MessageTemplateBindings getBindings() {
        return this.bindings;
    }

    /**
     * Set the bindings property: The binding object to link values to the template specific locations.
     *
     * @param bindings the bindings value to set.
     * @return the MessageTemplate object itself.
     */
    @Generated
    public MessageTemplate setBindings(MessageTemplateBindings bindings) {
        this.bindings = bindings;
        return this;
    }
}
