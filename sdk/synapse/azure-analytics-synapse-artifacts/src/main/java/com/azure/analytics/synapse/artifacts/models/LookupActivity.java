// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Lookup activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Lookup")
@JsonFlatten
@Fluent
public class LookupActivity extends ExecutionActivity {
    /*
     * Dataset-specific source properties, same as copy activity source.
     */
    @JsonProperty(value = "typeProperties.source", required = true)
    private CopySource source;

    /*
     * Lookup activity dataset reference.
     */
    @JsonProperty(value = "typeProperties.dataset", required = true)
    private DatasetReference dataset;

    /*
     * Whether to return first row or all rows. Default value is true. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "typeProperties.firstRowOnly")
    private Object firstRowOnly;

    /**
     * Creates an instance of LookupActivity class.
     */
    public LookupActivity() {
    }

    /**
     * Get the source property: Dataset-specific source properties, same as copy activity source.
     * 
     * @return the source value.
     */
    public CopySource getSource() {
        return this.source;
    }

    /**
     * Set the source property: Dataset-specific source properties, same as copy activity source.
     * 
     * @param source the source value to set.
     * @return the LookupActivity object itself.
     */
    public LookupActivity setSource(CopySource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the dataset property: Lookup activity dataset reference.
     * 
     * @return the dataset value.
     */
    public DatasetReference getDataset() {
        return this.dataset;
    }

    /**
     * Set the dataset property: Lookup activity dataset reference.
     * 
     * @param dataset the dataset value to set.
     * @return the LookupActivity object itself.
     */
    public LookupActivity setDataset(DatasetReference dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Get the firstRowOnly property: Whether to return first row or all rows. Default value is true. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @return the firstRowOnly value.
     */
    public Object getFirstRowOnly() {
        return this.firstRowOnly;
    }

    /**
     * Set the firstRowOnly property: Whether to return first row or all rows. Default value is true. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @param firstRowOnly the firstRowOnly value to set.
     * @return the LookupActivity object itself.
     */
    public LookupActivity setFirstRowOnly(Object firstRowOnly) {
        this.firstRowOnly = firstRowOnly;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LookupActivity setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LookupActivity setPolicy(ActivityPolicy policy) {
        super.setPolicy(policy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LookupActivity setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LookupActivity setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LookupActivity setState(ActivityState state) {
        super.setState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LookupActivity setOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.setOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LookupActivity setDependsOn(List<ActivityDependency> dependsOn) {
        super.setDependsOn(dependsOn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LookupActivity setUserProperties(List<UserProperty> userProperties) {
        super.setUserProperties(userProperties);
        return this;
    }
}
