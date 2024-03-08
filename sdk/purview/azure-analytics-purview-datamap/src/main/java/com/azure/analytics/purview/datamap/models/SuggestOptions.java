// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The payload of suggest request.
 */
@Fluent
public final class SuggestOptions {
    /*
     * The keywords applied to all fields that support suggest operation. It must be
     * at least 1 character, and no more than 100 characters. In the index schema we
     * defined a default suggester which lists all the supported fields and specifies
     * a search mode.
     */
    @Generated
    @JsonProperty(value = "keywords")
    private String keywords;

    /*
     * The number of suggestions we hope to return. The default value is 5. The value
     * must be a number between 1 and 100.
     */
    @Generated
    @JsonProperty(value = "limit")
    private Integer limit;

    /*
     * The filter for the search.
     */
    @Generated
    @JsonProperty(value = "filter")
    private Object filter;

    /**
     * Creates an instance of SuggestOptions class.
     */
    @Generated
    public SuggestOptions() {
    }

    /**
     * Get the keywords property: The keywords applied to all fields that support suggest operation. It must be
     * at least 1 character, and no more than 100 characters. In the index schema we
     * defined a default suggester which lists all the supported fields and specifies
     * a search mode.
     * 
     * @return the keywords value.
     */
    @Generated
    public String getKeywords() {
        return this.keywords;
    }

    /**
     * Set the keywords property: The keywords applied to all fields that support suggest operation. It must be
     * at least 1 character, and no more than 100 characters. In the index schema we
     * defined a default suggester which lists all the supported fields and specifies
     * a search mode.
     * 
     * @param keywords the keywords value to set.
     * @return the SuggestOptions object itself.
     */
    @Generated
    public SuggestOptions setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    /**
     * Get the limit property: The number of suggestions we hope to return. The default value is 5. The value
     * must be a number between 1 and 100.
     * 
     * @return the limit value.
     */
    @Generated
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * Set the limit property: The number of suggestions we hope to return. The default value is 5. The value
     * must be a number between 1 and 100.
     * 
     * @param limit the limit value to set.
     * @return the SuggestOptions object itself.
     */
    @Generated
    public SuggestOptions setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the filter property: The filter for the search.
     * 
     * @return the filter value.
     */
    @Generated
    public Object getFilter() {
        return this.filter;
    }

    /**
     * Set the filter property: The filter for the search.
     * 
     * @param filter the filter value to set.
     * @return the SuggestOptions object itself.
     */
    @Generated
    public SuggestOptions setFilter(Object filter) {
        this.filter = filter;
        return this;
    }
}
