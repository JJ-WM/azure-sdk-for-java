// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.RegulatoryComplianceAssessmentInner;

/**
 * An instance of this class provides access to all the operations defined in RegulatoryComplianceAssessmentsClient.
 */
public interface RegulatoryComplianceAssessmentsClient {
    /**
     * Details and state of assessments mapped to selected regulatory compliance control.
     * 
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance assessment response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RegulatoryComplianceAssessmentInner> list(String regulatoryComplianceStandardName,
        String regulatoryComplianceControlName);

    /**
     * Details and state of assessments mapped to selected regulatory compliance control.
     * 
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @param filter OData filter. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance assessment response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RegulatoryComplianceAssessmentInner> list(String regulatoryComplianceStandardName,
        String regulatoryComplianceControlName, String filter, Context context);

    /**
     * Supported regulatory compliance details and state for selected assessment.
     * 
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @param regulatoryComplianceAssessmentName Name of the regulatory compliance assessment object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance assessment details and state along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RegulatoryComplianceAssessmentInner> getWithResponse(String regulatoryComplianceStandardName,
        String regulatoryComplianceControlName, String regulatoryComplianceAssessmentName, Context context);

    /**
     * Supported regulatory compliance details and state for selected assessment.
     * 
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @param regulatoryComplianceAssessmentName Name of the regulatory compliance assessment object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance assessment details and state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RegulatoryComplianceAssessmentInner get(String regulatoryComplianceStandardName,
        String regulatoryComplianceControlName, String regulatoryComplianceAssessmentName);
}
