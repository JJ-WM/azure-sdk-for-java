// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.costmanagement.fluent.models.OperationStatusInner;

/**
 * An instance of this class provides access to all the operations defined in GenerateReservationDetailsReportsClient.
 */
public interface GenerateReservationDetailsReportsClient {
    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id. The
     * Reservation usage details can be viewed only by certain enterprise roles. For more details on the roles see,
     * https://docs.microsoft.com/azure/cost-management-billing/manage/understand-ea-roles#usage-and-costs-access-by-role.
     *
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OperationStatusInner>, OperationStatusInner> beginByBillingAccountId(
        String billingAccountId, String startDate, String endDate);

    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id. The
     * Reservation usage details can be viewed only by certain enterprise roles. For more details on the roles see,
     * https://docs.microsoft.com/azure/cost-management-billing/manage/understand-ea-roles#usage-and-costs-access-by-role.
     *
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OperationStatusInner>, OperationStatusInner> beginByBillingAccountId(
        String billingAccountId, String startDate, String endDate, Context context);

    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id. The
     * Reservation usage details can be viewed only by certain enterprise roles. For more details on the roles see,
     * https://docs.microsoft.com/azure/cost-management-billing/manage/understand-ea-roles#usage-and-costs-access-by-role.
     *
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusInner byBillingAccountId(String billingAccountId, String startDate, String endDate);

    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id. The
     * Reservation usage details can be viewed only by certain enterprise roles. For more details on the roles see,
     * https://docs.microsoft.com/azure/cost-management-billing/manage/understand-ea-roles#usage-and-costs-access-by-role.
     *
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusInner byBillingAccountId(String billingAccountId, String startDate, String endDate, Context context);

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile. The
     * Reservation usage details can be viewed by only certain enterprise roles by default. For more details on the
     * roles see,
     * https://docs.microsoft.com/azure/cost-management-billing/reservations/reservation-utilization#view-utilization-in-the-azure-portal-with-azure-rbac-access.
     *
     * @param billingAccountId Billing account ID.
     * @param billingProfileId Billing profile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OperationStatusInner>, OperationStatusInner> beginByBillingProfileId(
        String billingAccountId, String billingProfileId, String startDate, String endDate);

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile. The
     * Reservation usage details can be viewed by only certain enterprise roles by default. For more details on the
     * roles see,
     * https://docs.microsoft.com/azure/cost-management-billing/reservations/reservation-utilization#view-utilization-in-the-azure-portal-with-azure-rbac-access.
     *
     * @param billingAccountId Billing account ID.
     * @param billingProfileId Billing profile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OperationStatusInner>, OperationStatusInner> beginByBillingProfileId(
        String billingAccountId, String billingProfileId, String startDate, String endDate, Context context);

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile. The
     * Reservation usage details can be viewed by only certain enterprise roles by default. For more details on the
     * roles see,
     * https://docs.microsoft.com/azure/cost-management-billing/reservations/reservation-utilization#view-utilization-in-the-azure-portal-with-azure-rbac-access.
     *
     * @param billingAccountId Billing account ID.
     * @param billingProfileId Billing profile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusInner byBillingProfileId(
        String billingAccountId, String billingProfileId, String startDate, String endDate);

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile. The
     * Reservation usage details can be viewed by only certain enterprise roles by default. For more details on the
     * roles see,
     * https://docs.microsoft.com/azure/cost-management-billing/reservations/reservation-utilization#view-utilization-in-the-azure-portal-with-azure-rbac-access.
     *
     * @param billingAccountId Billing account ID.
     * @param billingProfileId Billing profile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusInner byBillingProfileId(
        String billingAccountId, String billingProfileId, String startDate, String endDate, Context context);
}
