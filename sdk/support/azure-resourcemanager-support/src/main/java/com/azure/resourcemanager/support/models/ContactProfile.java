// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Contact information associated with the support ticket.
 */
@Fluent
public final class ContactProfile {
    /*
     * First name.
     */
    @JsonProperty(value = "firstName", required = true)
    private String firstName;

    /*
     * Last name.
     */
    @JsonProperty(value = "lastName", required = true)
    private String lastName;

    /*
     * Preferred contact method.
     */
    @JsonProperty(value = "preferredContactMethod", required = true)
    private PreferredContactMethod preferredContactMethod;

    /*
     * Primary email address.
     */
    @JsonProperty(value = "primaryEmailAddress", required = true)
    private String primaryEmailAddress;

    /*
     * Additional email addresses listed will be copied on any correspondence about the support ticket.
     */
    @JsonProperty(value = "additionalEmailAddresses")
    private List<String> additionalEmailAddresses;

    /*
     * Phone number. This is required if preferred contact method is phone.
     */
    @JsonProperty(value = "phoneNumber")
    private String phoneNumber;

    /*
     * Time zone of the user. This is the name of the time zone from [Microsoft Time Zone Index Values](https://support.microsoft.com/help/973627/microsoft-time-zone-index-values).
     */
    @JsonProperty(value = "preferredTimeZone", required = true)
    private String preferredTimeZone;

    /*
     * Country of the user. This is the ISO 3166-1 alpha-3 code.
     */
    @JsonProperty(value = "country", required = true)
    private String country;

    /*
     * Preferred language of support from Azure. Support languages vary based on the severity you choose for your support ticket. Learn more at [Azure Severity and responsiveness](https://azure.microsoft.com/support/plans/response). Use the standard language-country code. Valid values are 'en-us' for English, 'zh-hans' for Chinese, 'es-es' for Spanish, 'fr-fr' for French, 'ja-jp' for Japanese, 'ko-kr' for Korean, 'ru-ru' for Russian, 'pt-br' for Portuguese, 'it-it' for Italian, 'zh-tw' for Chinese and 'de-de' for German.
     */
    @JsonProperty(value = "preferredSupportLanguage", required = true)
    private String preferredSupportLanguage;

    /**
     * Creates an instance of ContactProfile class.
     */
    public ContactProfile() {
    }

    /**
     * Get the firstName property: First name.
     * 
     * @return the firstName value.
     */
    public String firstName() {
        return this.firstName;
    }

    /**
     * Set the firstName property: First name.
     * 
     * @param firstName the firstName value to set.
     * @return the ContactProfile object itself.
     */
    public ContactProfile withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get the lastName property: Last name.
     * 
     * @return the lastName value.
     */
    public String lastName() {
        return this.lastName;
    }

    /**
     * Set the lastName property: Last name.
     * 
     * @param lastName the lastName value to set.
     * @return the ContactProfile object itself.
     */
    public ContactProfile withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get the preferredContactMethod property: Preferred contact method.
     * 
     * @return the preferredContactMethod value.
     */
    public PreferredContactMethod preferredContactMethod() {
        return this.preferredContactMethod;
    }

    /**
     * Set the preferredContactMethod property: Preferred contact method.
     * 
     * @param preferredContactMethod the preferredContactMethod value to set.
     * @return the ContactProfile object itself.
     */
    public ContactProfile withPreferredContactMethod(PreferredContactMethod preferredContactMethod) {
        this.preferredContactMethod = preferredContactMethod;
        return this;
    }

    /**
     * Get the primaryEmailAddress property: Primary email address.
     * 
     * @return the primaryEmailAddress value.
     */
    public String primaryEmailAddress() {
        return this.primaryEmailAddress;
    }

    /**
     * Set the primaryEmailAddress property: Primary email address.
     * 
     * @param primaryEmailAddress the primaryEmailAddress value to set.
     * @return the ContactProfile object itself.
     */
    public ContactProfile withPrimaryEmailAddress(String primaryEmailAddress) {
        this.primaryEmailAddress = primaryEmailAddress;
        return this;
    }

    /**
     * Get the additionalEmailAddresses property: Additional email addresses listed will be copied on any correspondence
     * about the support ticket.
     * 
     * @return the additionalEmailAddresses value.
     */
    public List<String> additionalEmailAddresses() {
        return this.additionalEmailAddresses;
    }

    /**
     * Set the additionalEmailAddresses property: Additional email addresses listed will be copied on any correspondence
     * about the support ticket.
     * 
     * @param additionalEmailAddresses the additionalEmailAddresses value to set.
     * @return the ContactProfile object itself.
     */
    public ContactProfile withAdditionalEmailAddresses(List<String> additionalEmailAddresses) {
        this.additionalEmailAddresses = additionalEmailAddresses;
        return this;
    }

    /**
     * Get the phoneNumber property: Phone number. This is required if preferred contact method is phone.
     * 
     * @return the phoneNumber value.
     */
    public String phoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Set the phoneNumber property: Phone number. This is required if preferred contact method is phone.
     * 
     * @param phoneNumber the phoneNumber value to set.
     * @return the ContactProfile object itself.
     */
    public ContactProfile withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get the preferredTimeZone property: Time zone of the user. This is the name of the time zone from [Microsoft Time
     * Zone Index Values](https://support.microsoft.com/help/973627/microsoft-time-zone-index-values).
     * 
     * @return the preferredTimeZone value.
     */
    public String preferredTimeZone() {
        return this.preferredTimeZone;
    }

    /**
     * Set the preferredTimeZone property: Time zone of the user. This is the name of the time zone from [Microsoft Time
     * Zone Index Values](https://support.microsoft.com/help/973627/microsoft-time-zone-index-values).
     * 
     * @param preferredTimeZone the preferredTimeZone value to set.
     * @return the ContactProfile object itself.
     */
    public ContactProfile withPreferredTimeZone(String preferredTimeZone) {
        this.preferredTimeZone = preferredTimeZone;
        return this;
    }

    /**
     * Get the country property: Country of the user. This is the ISO 3166-1 alpha-3 code.
     * 
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country property: Country of the user. This is the ISO 3166-1 alpha-3 code.
     * 
     * @param country the country value to set.
     * @return the ContactProfile object itself.
     */
    public ContactProfile withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the preferredSupportLanguage property: Preferred language of support from Azure. Support languages vary based
     * on the severity you choose for your support ticket. Learn more at [Azure Severity and
     * responsiveness](https://azure.microsoft.com/support/plans/response). Use the standard language-country code.
     * Valid values are 'en-us' for English, 'zh-hans' for Chinese, 'es-es' for Spanish, 'fr-fr' for French, 'ja-jp' for
     * Japanese, 'ko-kr' for Korean, 'ru-ru' for Russian, 'pt-br' for Portuguese, 'it-it' for Italian, 'zh-tw' for
     * Chinese and 'de-de' for German.
     * 
     * @return the preferredSupportLanguage value.
     */
    public String preferredSupportLanguage() {
        return this.preferredSupportLanguage;
    }

    /**
     * Set the preferredSupportLanguage property: Preferred language of support from Azure. Support languages vary based
     * on the severity you choose for your support ticket. Learn more at [Azure Severity and
     * responsiveness](https://azure.microsoft.com/support/plans/response). Use the standard language-country code.
     * Valid values are 'en-us' for English, 'zh-hans' for Chinese, 'es-es' for Spanish, 'fr-fr' for French, 'ja-jp' for
     * Japanese, 'ko-kr' for Korean, 'ru-ru' for Russian, 'pt-br' for Portuguese, 'it-it' for Italian, 'zh-tw' for
     * Chinese and 'de-de' for German.
     * 
     * @param preferredSupportLanguage the preferredSupportLanguage value to set.
     * @return the ContactProfile object itself.
     */
    public ContactProfile withPreferredSupportLanguage(String preferredSupportLanguage) {
        this.preferredSupportLanguage = preferredSupportLanguage;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (firstName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property firstName in model ContactProfile"));
        }
        if (lastName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property lastName in model ContactProfile"));
        }
        if (preferredContactMethod() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property preferredContactMethod in model ContactProfile"));
        }
        if (primaryEmailAddress() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property primaryEmailAddress in model ContactProfile"));
        }
        if (preferredTimeZone() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property preferredTimeZone in model ContactProfile"));
        }
        if (country() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property country in model ContactProfile"));
        }
        if (preferredSupportLanguage() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property preferredSupportLanguage in model ContactProfile"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContactProfile.class);
}
