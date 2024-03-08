// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Gallery information for a workbook template. */
@Fluent
public final class WorkbookTemplateGallery {
    /*
     * Name of the workbook template in the gallery.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Category for the gallery.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * Type of workbook supported by the workbook template.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Order of the template within the gallery.
     */
    @JsonProperty(value = "order")
    private Integer order;

    /*
     * Azure resource type supported by the gallery.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /** Creates an instance of WorkbookTemplateGallery class. */
    public WorkbookTemplateGallery() {
    }

    /**
     * Get the name property: Name of the workbook template in the gallery.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the workbook template in the gallery.
     *
     * @param name the name value to set.
     * @return the WorkbookTemplateGallery object itself.
     */
    public WorkbookTemplateGallery withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the category property: Category for the gallery.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: Category for the gallery.
     *
     * @param category the category value to set.
     * @return the WorkbookTemplateGallery object itself.
     */
    public WorkbookTemplateGallery withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the type property: Type of workbook supported by the workbook template.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of workbook supported by the workbook template.
     *
     * @param type the type value to set.
     * @return the WorkbookTemplateGallery object itself.
     */
    public WorkbookTemplateGallery withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the order property: Order of the template within the gallery.
     *
     * @return the order value.
     */
    public Integer order() {
        return this.order;
    }

    /**
     * Set the order property: Order of the template within the gallery.
     *
     * @param order the order value to set.
     * @return the WorkbookTemplateGallery object itself.
     */
    public WorkbookTemplateGallery withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * Get the resourceType property: Azure resource type supported by the gallery.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Azure resource type supported by the gallery.
     *
     * @param resourceType the resourceType value to set.
     * @return the WorkbookTemplateGallery object itself.
     */
    public WorkbookTemplateGallery withResourceType(String resourceType) {
        this.resourceType = resourceType;
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
