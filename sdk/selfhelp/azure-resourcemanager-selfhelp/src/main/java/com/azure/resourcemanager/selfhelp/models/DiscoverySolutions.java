// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of DiscoverySolutions.
 */
public interface DiscoverySolutions {
    /**
     * Lists the relevant Azure Diagnostics, Solutions and Troubleshooters using [problemClassification
     * API](https://learn.microsoft.com/rest/api/support/problem-classifications/list?tabs=HTTP)) AND resourceUri or
     * resourceType.&lt;br/&gt; Discovery Solutions is the initial entry point within Help API, which identifies
     * relevant Azure diagnostics and solutions. &lt;br/&gt;&lt;br/&gt; Required Input : problemClassificationId (Use
     * the [problemClassification
     * API](https://learn.microsoft.com/rest/api/support/problem-classifications/list?tabs=HTTP)) &lt;br/&gt;Optional
     * input: resourceUri OR resource Type &lt;br/&gt;&lt;br/&gt; &lt;b&gt;Note: &lt;/b&gt; ‘requiredInputs’ from
     * Discovery solutions response must be passed via ‘additionalParameters’ as an input to Diagnostics and Solutions
     * API.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return discovery response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SolutionMetadataResource> list();

    /**
     * Lists the relevant Azure Diagnostics, Solutions and Troubleshooters using [problemClassification
     * API](https://learn.microsoft.com/rest/api/support/problem-classifications/list?tabs=HTTP)) AND resourceUri or
     * resourceType.&lt;br/&gt; Discovery Solutions is the initial entry point within Help API, which identifies
     * relevant Azure diagnostics and solutions. &lt;br/&gt;&lt;br/&gt; Required Input : problemClassificationId (Use
     * the [problemClassification
     * API](https://learn.microsoft.com/rest/api/support/problem-classifications/list?tabs=HTTP)) &lt;br/&gt;Optional
     * input: resourceUri OR resource Type &lt;br/&gt;&lt;br/&gt; &lt;b&gt;Note: &lt;/b&gt; ‘requiredInputs’ from
     * Discovery solutions response must be passed via ‘additionalParameters’ as an input to Diagnostics and Solutions
     * API.
     * 
     * @param filter 'ProblemClassificationId' is a mandatory filter to get solutions ids. It also supports optional
     * 'ResourceType' and 'SolutionType' filters. The
     * [$filter](https://learn.microsoft.com/en-us/odata/webapi/first-odata-api#filter) supports only 'and', 'or' and
     * 'eq' operators. Example: $filter=ProblemClassificationId eq '1ddda5b4-cf6c-4d4f-91ad-bc38ab0e811e'.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return discovery response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SolutionMetadataResource> list(String filter, String skiptoken, Context context);
}
