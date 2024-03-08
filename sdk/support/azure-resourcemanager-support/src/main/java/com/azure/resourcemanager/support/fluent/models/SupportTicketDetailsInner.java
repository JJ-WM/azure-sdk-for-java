// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.support.models.Consent;
import com.azure.resourcemanager.support.models.ContactProfile;
import com.azure.resourcemanager.support.models.QuotaTicketDetails;
import com.azure.resourcemanager.support.models.SecondaryConsent;
import com.azure.resourcemanager.support.models.ServiceLevelAgreement;
import com.azure.resourcemanager.support.models.SeverityLevel;
import com.azure.resourcemanager.support.models.SupportEngineer;
import com.azure.resourcemanager.support.models.TechnicalTicketDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Object that represents SupportTicketDetails resource. */
@Fluent
public final class SupportTicketDetailsInner extends ProxyResource {
    /*
     * Properties of the resource.
     */
    @JsonProperty(value = "properties")
    private SupportTicketDetailsProperties innerProperties;

    /** Creates an instance of SupportTicketDetailsInner class. */
    public SupportTicketDetailsInner() {
    }

    /**
     * Get the innerProperties property: Properties of the resource.
     *
     * @return the innerProperties value.
     */
    private SupportTicketDetailsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the supportTicketId property: System generated support ticket Id that is unique.
     *
     * @return the supportTicketId value.
     */
    public String supportTicketId() {
        return this.innerProperties() == null ? null : this.innerProperties().supportTicketId();
    }

    /**
     * Set the supportTicketId property: System generated support ticket Id that is unique.
     *
     * @param supportTicketId the supportTicketId value to set.
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withSupportTicketId(String supportTicketId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportTicketDetailsProperties();
        }
        this.innerProperties().withSupportTicketId(supportTicketId);
        return this;
    }

    /**
     * Get the description property: Detailed description of the question or issue.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Detailed description of the question or issue.
     *
     * @param description the description value to set.
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportTicketDetailsProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the problemClassificationId property: Each Azure service has its own set of issue categories, also known as
     * problem classification. This parameter is the unique Id for the type of problem you are experiencing.
     *
     * @return the problemClassificationId value.
     */
    public String problemClassificationId() {
        return this.innerProperties() == null ? null : this.innerProperties().problemClassificationId();
    }

    /**
     * Set the problemClassificationId property: Each Azure service has its own set of issue categories, also known as
     * problem classification. This parameter is the unique Id for the type of problem you are experiencing.
     *
     * @param problemClassificationId the problemClassificationId value to set.
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withProblemClassificationId(String problemClassificationId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportTicketDetailsProperties();
        }
        this.innerProperties().withProblemClassificationId(problemClassificationId);
        return this;
    }

    /**
     * Get the problemClassificationDisplayName property: Localized name of problem classification.
     *
     * @return the problemClassificationDisplayName value.
     */
    public String problemClassificationDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().problemClassificationDisplayName();
    }

    /**
     * Get the severity property: A value that indicates the urgency of the case, which in turn determines the response
     * time according to the service level agreement of the technical support plan you have with Azure. Note: 'Highest
     * critical impact', also known as the 'Emergency - Severe impact' level in the Azure portal is reserved only for
     * our Premium customers.
     *
     * @return the severity value.
     */
    public SeverityLevel severity() {
        return this.innerProperties() == null ? null : this.innerProperties().severity();
    }

    /**
     * Set the severity property: A value that indicates the urgency of the case, which in turn determines the response
     * time according to the service level agreement of the technical support plan you have with Azure. Note: 'Highest
     * critical impact', also known as the 'Emergency - Severe impact' level in the Azure portal is reserved only for
     * our Premium customers.
     *
     * @param severity the severity value to set.
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withSeverity(SeverityLevel severity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportTicketDetailsProperties();
        }
        this.innerProperties().withSeverity(severity);
        return this;
    }

    /**
     * Get the enrollmentId property: Enrollment Id associated with the support ticket.
     *
     * @return the enrollmentId value.
     */
    public String enrollmentId() {
        return this.innerProperties() == null ? null : this.innerProperties().enrollmentId();
    }

    /**
     * Get the require24X7Response property: Indicates if this requires a 24x7 response from Azure.
     *
     * @return the require24X7Response value.
     */
    public Boolean require24X7Response() {
        return this.innerProperties() == null ? null : this.innerProperties().require24X7Response();
    }

    /**
     * Set the require24X7Response property: Indicates if this requires a 24x7 response from Azure.
     *
     * @param require24X7Response the require24X7Response value to set.
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withRequire24X7Response(Boolean require24X7Response) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportTicketDetailsProperties();
        }
        this.innerProperties().withRequire24X7Response(require24X7Response);
        return this;
    }

    /**
     * Get the advancedDiagnosticConsent property: Advanced diagnostic consent to be updated on the support ticket.
     *
     * @return the advancedDiagnosticConsent value.
     */
    public Consent advancedDiagnosticConsent() {
        return this.innerProperties() == null ? null : this.innerProperties().advancedDiagnosticConsent();
    }

    /**
     * Set the advancedDiagnosticConsent property: Advanced diagnostic consent to be updated on the support ticket.
     *
     * @param advancedDiagnosticConsent the advancedDiagnosticConsent value to set.
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withAdvancedDiagnosticConsent(Consent advancedDiagnosticConsent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportTicketDetailsProperties();
        }
        this.innerProperties().withAdvancedDiagnosticConsent(advancedDiagnosticConsent);
        return this;
    }

    /**
     * Get the problemScopingQuestions property: Problem scoping questions associated with the support ticket.
     *
     * @return the problemScopingQuestions value.
     */
    public String problemScopingQuestions() {
        return this.innerProperties() == null ? null : this.innerProperties().problemScopingQuestions();
    }

    /**
     * Set the problemScopingQuestions property: Problem scoping questions associated with the support ticket.
     *
     * @param problemScopingQuestions the problemScopingQuestions value to set.
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withProblemScopingQuestions(String problemScopingQuestions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportTicketDetailsProperties();
        }
        this.innerProperties().withProblemScopingQuestions(problemScopingQuestions);
        return this;
    }

    /**
     * Get the supportPlanId property: Support plan id associated with the support ticket.
     *
     * @return the supportPlanId value.
     */
    public String supportPlanId() {
        return this.innerProperties() == null ? null : this.innerProperties().supportPlanId();
    }

    /**
     * Set the supportPlanId property: Support plan id associated with the support ticket.
     *
     * @param supportPlanId the supportPlanId value to set.
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withSupportPlanId(String supportPlanId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportTicketDetailsProperties();
        }
        this.innerProperties().withSupportPlanId(supportPlanId);
        return this;
    }

    /**
     * Get the contactDetails property: Contact information of the user requesting to create a support ticket.
     *
     * @return the contactDetails value.
     */
    public ContactProfile contactDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().contactDetails();
    }

    /**
     * Set the contactDetails property: Contact information of the user requesting to create a support ticket.
     *
     * @param contactDetails the contactDetails value to set.
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withContactDetails(ContactProfile contactDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportTicketDetailsProperties();
        }
        this.innerProperties().withContactDetails(contactDetails);
        return this;
    }

    /**
     * Get the serviceLevelAgreement property: Service Level Agreement information for this support ticket.
     *
     * @return the serviceLevelAgreement value.
     */
    public ServiceLevelAgreement serviceLevelAgreement() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceLevelAgreement();
    }

    /**
     * Set the serviceLevelAgreement property: Service Level Agreement information for this support ticket.
     *
     * @param serviceLevelAgreement the serviceLevelAgreement value to set.
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withServiceLevelAgreement(ServiceLevelAgreement serviceLevelAgreement) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportTicketDetailsProperties();
        }
        this.innerProperties().withServiceLevelAgreement(serviceLevelAgreement);
        return this;
    }

    /**
     * Get the supportEngineer property: Information about the support engineer working on this support ticket.
     *
     * @return the supportEngineer value.
     */
    public SupportEngineer supportEngineer() {
        return this.innerProperties() == null ? null : this.innerProperties().supportEngineer();
    }

    /**
     * Set the supportEngineer property: Information about the support engineer working on this support ticket.
     *
     * @param supportEngineer the supportEngineer value to set.
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withSupportEngineer(SupportEngineer supportEngineer) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportTicketDetailsProperties();
        }
        this.innerProperties().withSupportEngineer(supportEngineer);
        return this;
    }

    /**
     * Get the supportPlanType property: Support plan type associated with the support ticket.
     *
     * @return the supportPlanType value.
     */
    public String supportPlanType() {
        return this.innerProperties() == null ? null : this.innerProperties().supportPlanType();
    }

    /**
     * Get the supportPlanDisplayName property: Support plan type associated with the support ticket.
     *
     * @return the supportPlanDisplayName value.
     */
    public String supportPlanDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().supportPlanDisplayName();
    }

    /**
     * Get the title property: Title of the support ticket.
     *
     * @return the title value.
     */
    public String title() {
        return this.innerProperties() == null ? null : this.innerProperties().title();
    }

    /**
     * Set the title property: Title of the support ticket.
     *
     * @param title the title value to set.
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withTitle(String title) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportTicketDetailsProperties();
        }
        this.innerProperties().withTitle(title);
        return this;
    }

    /**
     * Get the problemStartTime property: Time in UTC (ISO 8601 format) when the problem started.
     *
     * @return the problemStartTime value.
     */
    public OffsetDateTime problemStartTime() {
        return this.innerProperties() == null ? null : this.innerProperties().problemStartTime();
    }

    /**
     * Set the problemStartTime property: Time in UTC (ISO 8601 format) when the problem started.
     *
     * @param problemStartTime the problemStartTime value to set.
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withProblemStartTime(OffsetDateTime problemStartTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportTicketDetailsProperties();
        }
        this.innerProperties().withProblemStartTime(problemStartTime);
        return this;
    }

    /**
     * Get the serviceId property: This is the resource Id of the Azure service resource associated with the support
     * ticket.
     *
     * @return the serviceId value.
     */
    public String serviceId() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceId();
    }

    /**
     * Set the serviceId property: This is the resource Id of the Azure service resource associated with the support
     * ticket.
     *
     * @param serviceId the serviceId value to set.
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withServiceId(String serviceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportTicketDetailsProperties();
        }
        this.innerProperties().withServiceId(serviceId);
        return this;
    }

    /**
     * Get the serviceDisplayName property: Localized name of the Azure service.
     *
     * @return the serviceDisplayName value.
     */
    public String serviceDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceDisplayName();
    }

    /**
     * Get the status property: Status of the support ticket.
     *
     * @return the status value.
     */
    public String status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the createdDate property: Time in UTC (ISO 8601 format) when the support ticket was created.
     *
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDate();
    }

    /**
     * Get the modifiedDate property: Time in UTC (ISO 8601 format) when the support ticket was last modified.
     *
     * @return the modifiedDate value.
     */
    public OffsetDateTime modifiedDate() {
        return this.innerProperties() == null ? null : this.innerProperties().modifiedDate();
    }

    /**
     * Get the fileWorkspaceName property: File workspace name.
     *
     * @return the fileWorkspaceName value.
     */
    public String fileWorkspaceName() {
        return this.innerProperties() == null ? null : this.innerProperties().fileWorkspaceName();
    }

    /**
     * Set the fileWorkspaceName property: File workspace name.
     *
     * @param fileWorkspaceName the fileWorkspaceName value to set.
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withFileWorkspaceName(String fileWorkspaceName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportTicketDetailsProperties();
        }
        this.innerProperties().withFileWorkspaceName(fileWorkspaceName);
        return this;
    }

    /**
     * Get the technicalTicketDetails property: Additional ticket details associated with a technical support ticket
     * request.
     *
     * @return the technicalTicketDetails value.
     */
    public TechnicalTicketDetails technicalTicketDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().technicalTicketDetails();
    }

    /**
     * Set the technicalTicketDetails property: Additional ticket details associated with a technical support ticket
     * request.
     *
     * @param technicalTicketDetails the technicalTicketDetails value to set.
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withTechnicalTicketDetails(TechnicalTicketDetails technicalTicketDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportTicketDetailsProperties();
        }
        this.innerProperties().withTechnicalTicketDetails(technicalTicketDetails);
        return this;
    }

    /**
     * Get the quotaTicketDetails property: Additional ticket details associated with a quota support ticket request.
     *
     * @return the quotaTicketDetails value.
     */
    public QuotaTicketDetails quotaTicketDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().quotaTicketDetails();
    }

    /**
     * Set the quotaTicketDetails property: Additional ticket details associated with a quota support ticket request.
     *
     * @param quotaTicketDetails the quotaTicketDetails value to set.
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withQuotaTicketDetails(QuotaTicketDetails quotaTicketDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportTicketDetailsProperties();
        }
        this.innerProperties().withQuotaTicketDetails(quotaTicketDetails);
        return this;
    }

    /**
     * Get the secondaryConsent property: This property indicates secondary consents for the support ticket.
     *
     * @return the secondaryConsent value.
     */
    public List<SecondaryConsent> secondaryConsent() {
        return this.innerProperties() == null ? null : this.innerProperties().secondaryConsent();
    }

    /**
     * Set the secondaryConsent property: This property indicates secondary consents for the support ticket.
     *
     * @param secondaryConsent the secondaryConsent value to set.
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withSecondaryConsent(List<SecondaryConsent> secondaryConsent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportTicketDetailsProperties();
        }
        this.innerProperties().withSecondaryConsent(secondaryConsent);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
