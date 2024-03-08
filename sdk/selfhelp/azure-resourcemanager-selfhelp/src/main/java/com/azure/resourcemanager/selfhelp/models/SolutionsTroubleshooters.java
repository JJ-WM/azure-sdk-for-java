// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Troubleshooters in Solutions.
 */
@Fluent
public final class SolutionsTroubleshooters {
    /*
     * Solution Id to identify single Solutions Troubleshooter
     */
    @JsonProperty(value = "solutionId")
    private String solutionId;

    /*
     * Troubleshooter title
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * Troubleshooter summary
     */
    @JsonProperty(value = "summary")
    private String summary;

    /**
     * Creates an instance of SolutionsTroubleshooters class.
     */
    public SolutionsTroubleshooters() {
    }

    /**
     * Get the solutionId property: Solution Id to identify single Solutions Troubleshooter.
     * 
     * @return the solutionId value.
     */
    public String solutionId() {
        return this.solutionId;
    }

    /**
     * Set the solutionId property: Solution Id to identify single Solutions Troubleshooter.
     * 
     * @param solutionId the solutionId value to set.
     * @return the SolutionsTroubleshooters object itself.
     */
    public SolutionsTroubleshooters withSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }

    /**
     * Get the title property: Troubleshooter title.
     * 
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: Troubleshooter title.
     * 
     * @param title the title value to set.
     * @return the SolutionsTroubleshooters object itself.
     */
    public SolutionsTroubleshooters withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the summary property: Troubleshooter summary.
     * 
     * @return the summary value.
     */
    public String summary() {
        return this.summary;
    }

    /**
     * Set the summary property: Troubleshooter summary.
     * 
     * @param summary the summary value to set.
     * @return the SolutionsTroubleshooters object itself.
     */
    public SolutionsTroubleshooters withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
