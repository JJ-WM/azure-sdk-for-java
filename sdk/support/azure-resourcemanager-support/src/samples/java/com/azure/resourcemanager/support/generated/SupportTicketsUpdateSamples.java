// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.resourcemanager.support.models.Consent;
import com.azure.resourcemanager.support.models.PreferredContactMethod;
import com.azure.resourcemanager.support.models.SeverityLevel;
import com.azure.resourcemanager.support.models.Status;
import com.azure.resourcemanager.support.models.SupportTicketDetails;
import com.azure.resourcemanager.support.models.UpdateContactProfile;
import java.util.Arrays;

/**
 * Samples for SupportTickets Update.
 */
public final class SupportTicketsUpdateSamples {
    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/preview/2023-06-01-preview/examples/
     * UpdateAdvancedDiagnosticConsentOfSupportTicketForSubscription.json
     */
    /**
     * Sample code: Update advanced diagnostic consent of a support ticket.
     * 
     * @param manager Entry point to SupportManager.
     */
    public static void
        updateAdvancedDiagnosticConsentOfASupportTicket(com.azure.resourcemanager.support.SupportManager manager) {
        SupportTicketDetails resource
            = manager.supportTickets().getWithResponse("testticket", com.azure.core.util.Context.NONE).getValue();
        resource.update().withAdvancedDiagnosticConsent(Consent.YES).apply();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/preview/2023-06-01-preview/examples/
     * UpdateContactDetailsOfSupportTicketForSubscription.json
     */
    /**
     * Sample code: Update contact details of a subscription scoped support ticket.
     * 
     * @param manager Entry point to SupportManager.
     */
    public static void updateContactDetailsOfASubscriptionScopedSupportTicket(
        com.azure.resourcemanager.support.SupportManager manager) {
        SupportTicketDetails resource
            = manager.supportTickets().getWithResponse("testticket", com.azure.core.util.Context.NONE).getValue();
        resource.update()
            .withContactDetails(new UpdateContactProfile().withFirstName("first name").withLastName("last name")
                .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                .withPrimaryEmailAddress("test.name@contoso.com")
                .withAdditionalEmailAddresses(Arrays.asList("tname@contoso.com", "teamtest@contoso.com"))
                .withPhoneNumber("123-456-7890").withPreferredTimeZone("Pacific Standard Time").withCountry("USA")
                .withPreferredSupportLanguage("en-US"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/preview/2023-06-01-preview/examples/
     * UpdateStatusOfSupportTicketForSubscription.json
     */
    /**
     * Sample code: Update status of a subscription scoped support ticket.
     * 
     * @param manager Entry point to SupportManager.
     */
    public static void
        updateStatusOfASubscriptionScopedSupportTicket(com.azure.resourcemanager.support.SupportManager manager) {
        SupportTicketDetails resource
            = manager.supportTickets().getWithResponse("testticket", com.azure.core.util.Context.NONE).getValue();
        resource.update().withStatus(Status.CLOSED).apply();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/preview/2023-06-01-preview/examples/
     * UpdateSeverityOfSupportTicketForSubscription.json
     */
    /**
     * Sample code: Update severity of a subscription scoped support ticket.
     * 
     * @param manager Entry point to SupportManager.
     */
    public static void
        updateSeverityOfASubscriptionScopedSupportTicket(com.azure.resourcemanager.support.SupportManager manager) {
        SupportTicketDetails resource
            = manager.supportTickets().getWithResponse("testticket", com.azure.core.util.Context.NONE).getValue();
        resource.update().withSeverity(SeverityLevel.CRITICAL).apply();
    }
}
