// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * This parameter is only valid if the query type is 'semantic'. If set, the query returns answers extracted from key
 * passages in the highest ranked documents. The number of answers returned can be configured by appending the pipe
 * character '|' followed by the 'count-&lt;number of answers&gt;' option after the answers parameter value, such as
 * 'extractive|count-3'. Default count is 1. The confidence threshold can be configured by appending the pipe character
 * '|' followed by the 'threshold-&lt;confidence threshold&gt;' option after the answers parameter value, such as
 * 'extractive|threshold-0.9'. Default threshold is 0.7.
 */
public final class QueryAnswerType extends ExpandableStringEnum<QueryAnswerType> {
    /** Do not return answers for the query. */
    public static final QueryAnswerType NONE = fromString("none");

    /**
     * Extracts answer candidates from the contents of the documents returned in response to a query expressed as a
     * question in natural language.
     */
    public static final QueryAnswerType EXTRACTIVE = fromString("extractive");

    /**
     * Creates a new instance of QueryAnswerType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public QueryAnswerType() {}

    /**
     * Creates or finds a QueryAnswerType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding QueryAnswerType.
     */
    public static QueryAnswerType fromString(String name) {
        return fromString(name, QueryAnswerType.class);
    }

    /**
     * Gets known QueryAnswerType values.
     *
     * @return known QueryAnswerType values.
     */
    public static Collection<QueryAnswerType> values() {
        return values(QueryAnswerType.class);
    }
}
