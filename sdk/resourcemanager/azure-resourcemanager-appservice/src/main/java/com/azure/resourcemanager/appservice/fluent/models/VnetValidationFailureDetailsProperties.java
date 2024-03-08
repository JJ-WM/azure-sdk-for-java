// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.VnetValidationTestFailure;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * VnetValidationFailureDetails resource specific properties.
 */
@Fluent
public final class VnetValidationFailureDetailsProperties {
    /*
     * Text describing the validation outcome.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * A flag describing whether or not validation failed.
     */
    @JsonProperty(value = "failed")
    private Boolean failed;

    /*
     * A list of tests that failed in the validation.
     */
    @JsonProperty(value = "failedTests")
    private List<VnetValidationTestFailure> failedTests;

    /*
     * A list of warnings generated during validation.
     */
    @JsonProperty(value = "warnings")
    private List<VnetValidationTestFailure> warnings;

    /**
     * Creates an instance of VnetValidationFailureDetailsProperties class.
     */
    public VnetValidationFailureDetailsProperties() {
    }

    /**
     * Get the message property: Text describing the validation outcome.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Text describing the validation outcome.
     * 
     * @param message the message value to set.
     * @return the VnetValidationFailureDetailsProperties object itself.
     */
    public VnetValidationFailureDetailsProperties withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the failed property: A flag describing whether or not validation failed.
     * 
     * @return the failed value.
     */
    public Boolean failed() {
        return this.failed;
    }

    /**
     * Set the failed property: A flag describing whether or not validation failed.
     * 
     * @param failed the failed value to set.
     * @return the VnetValidationFailureDetailsProperties object itself.
     */
    public VnetValidationFailureDetailsProperties withFailed(Boolean failed) {
        this.failed = failed;
        return this;
    }

    /**
     * Get the failedTests property: A list of tests that failed in the validation.
     * 
     * @return the failedTests value.
     */
    public List<VnetValidationTestFailure> failedTests() {
        return this.failedTests;
    }

    /**
     * Set the failedTests property: A list of tests that failed in the validation.
     * 
     * @param failedTests the failedTests value to set.
     * @return the VnetValidationFailureDetailsProperties object itself.
     */
    public VnetValidationFailureDetailsProperties withFailedTests(List<VnetValidationTestFailure> failedTests) {
        this.failedTests = failedTests;
        return this;
    }

    /**
     * Get the warnings property: A list of warnings generated during validation.
     * 
     * @return the warnings value.
     */
    public List<VnetValidationTestFailure> warnings() {
        return this.warnings;
    }

    /**
     * Set the warnings property: A list of warnings generated during validation.
     * 
     * @param warnings the warnings value to set.
     * @return the VnetValidationFailureDetailsProperties object itself.
     */
    public VnetValidationFailureDetailsProperties withWarnings(List<VnetValidationTestFailure> warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (failedTests() != null) {
            failedTests().forEach(e -> e.validate());
        }
        if (warnings() != null) {
            warnings().forEach(e -> e.validate());
        }
    }
}
