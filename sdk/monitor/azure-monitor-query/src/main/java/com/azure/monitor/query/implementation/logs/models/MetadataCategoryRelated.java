// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.logs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The related metadata items for the category.
 */
@Fluent
public final class MetadataCategoryRelated {
    /*
     * The tables related to the category
     */
    @JsonProperty(value = "tables")
    private List<String> tables;

    /*
     * The functions related to the category
     */
    @JsonProperty(value = "functions")
    private List<String> functions;

    /*
     * The resource types related to the category
     */
    @JsonProperty(value = "resourceTypes")
    private List<String> resourceTypes;

    /*
     * The saved queries related to the category
     */
    @JsonProperty(value = "queries")
    private List<String> queries;

    /*
     * The Log Analytics solutions related to the category
     */
    @JsonProperty(value = "solutions")
    private List<String> solutions;

    /**
     * Creates an instance of MetadataCategoryRelated class.
     */
    public MetadataCategoryRelated() {
    }

    /**
     * Get the tables property: The tables related to the category.
     * 
     * @return the tables value.
     */
    public List<String> getTables() {
        return this.tables;
    }

    /**
     * Set the tables property: The tables related to the category.
     * 
     * @param tables the tables value to set.
     * @return the MetadataCategoryRelated object itself.
     */
    public MetadataCategoryRelated setTables(List<String> tables) {
        this.tables = tables;
        return this;
    }

    /**
     * Get the functions property: The functions related to the category.
     * 
     * @return the functions value.
     */
    public List<String> getFunctions() {
        return this.functions;
    }

    /**
     * Set the functions property: The functions related to the category.
     * 
     * @param functions the functions value to set.
     * @return the MetadataCategoryRelated object itself.
     */
    public MetadataCategoryRelated setFunctions(List<String> functions) {
        this.functions = functions;
        return this;
    }

    /**
     * Get the resourceTypes property: The resource types related to the category.
     * 
     * @return the resourceTypes value.
     */
    public List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * Set the resourceTypes property: The resource types related to the category.
     * 
     * @param resourceTypes the resourceTypes value to set.
     * @return the MetadataCategoryRelated object itself.
     */
    public MetadataCategoryRelated setResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    /**
     * Get the queries property: The saved queries related to the category.
     * 
     * @return the queries value.
     */
    public List<String> getQueries() {
        return this.queries;
    }

    /**
     * Set the queries property: The saved queries related to the category.
     * 
     * @param queries the queries value to set.
     * @return the MetadataCategoryRelated object itself.
     */
    public MetadataCategoryRelated setQueries(List<String> queries) {
        this.queries = queries;
        return this;
    }

    /**
     * Get the solutions property: The Log Analytics solutions related to the category.
     * 
     * @return the solutions value.
     */
    public List<String> getSolutions() {
        return this.solutions;
    }

    /**
     * Set the solutions property: The Log Analytics solutions related to the category.
     * 
     * @param solutions the solutions value to set.
     * @return the MetadataCategoryRelated object itself.
     */
    public MetadataCategoryRelated setSolutions(List<String> solutions) {
        this.solutions = solutions;
        return this;
    }
}
