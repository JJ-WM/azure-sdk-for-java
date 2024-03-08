// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Metric specification of operation.
 */
@Fluent
public final class MetricSpecification {
    /*
     * Name of metric specification.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Display name of metric specification.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Display description of metric specification.
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /*
     * Unit could be Bytes or Count.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * Support metric aggregation type.
     */
    @JsonProperty(value = "supportedAggregationTypes")
    private List<MetricAggregationType> supportedAggregationTypes;

    /*
     * The supported time grain types for the metrics.
     */
    @JsonProperty(value = "supportedTimeGrainTypes")
    private List<String> supportedTimeGrainTypes;

    /*
     * The internal metric name.
     */
    @JsonProperty(value = "internalMetricName")
    private String internalMetricName;

    /*
     * Whether or not the service is using regional MDM accounts.
     */
    @JsonProperty(value = "enableRegionalMdmAccount")
    private Boolean enableRegionalMdmAccount;

    /*
     * The source MDM account.
     */
    @JsonProperty(value = "sourceMdmAccount")
    private String sourceMdmAccount;

    /*
     * The source MDM namespace.
     */
    @JsonProperty(value = "sourceMdmNamespace")
    private String sourceMdmNamespace;

    /*
     * Dimensions of blobs, including blob type and access tier.
     */
    @JsonProperty(value = "dimensions")
    private List<Dimension> dimensions;

    /*
     * Aggregation type could be Average.
     */
    @JsonProperty(value = "aggregationType")
    private String aggregationType;

    /*
     * The property to decide fill gap with zero or not.
     */
    @JsonProperty(value = "fillGapWithZero")
    private Boolean fillGapWithZero;

    /*
     * The category this metric specification belong to, could be Capacity.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * Account Resource Id.
     */
    @JsonProperty(value = "resourceIdDimensionNameOverride")
    private String resourceIdDimensionNameOverride;

    /*
     * Whether the metric is internal.
     */
    @JsonProperty(value = "isInternal")
    private Boolean isInternal;

    /**
     * Creates an instance of MetricSpecification class.
     */
    public MetricSpecification() {
    }

    /**
     * Get the name property: Name of metric specification.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of metric specification.
     * 
     * @param name the name value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Display name of metric specification.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of metric specification.
     * 
     * @param displayName the displayName value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the displayDescription property: Display description of metric specification.
     * 
     * @return the displayDescription value.
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: Display description of metric specification.
     * 
     * @param displayDescription the displayDescription value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the unit property: Unit could be Bytes or Count.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: Unit could be Bytes or Count.
     * 
     * @param unit the unit value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the supportedAggregationTypes property: Support metric aggregation type.
     * 
     * @return the supportedAggregationTypes value.
     */
    public List<MetricAggregationType> supportedAggregationTypes() {
        return this.supportedAggregationTypes;
    }

    /**
     * Set the supportedAggregationTypes property: Support metric aggregation type.
     * 
     * @param supportedAggregationTypes the supportedAggregationTypes value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSupportedAggregationTypes(List<MetricAggregationType> supportedAggregationTypes) {
        this.supportedAggregationTypes = supportedAggregationTypes;
        return this;
    }

    /**
     * Get the supportedTimeGrainTypes property: The supported time grain types for the metrics.
     * 
     * @return the supportedTimeGrainTypes value.
     */
    public List<String> supportedTimeGrainTypes() {
        return this.supportedTimeGrainTypes;
    }

    /**
     * Set the supportedTimeGrainTypes property: The supported time grain types for the metrics.
     * 
     * @param supportedTimeGrainTypes the supportedTimeGrainTypes value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSupportedTimeGrainTypes(List<String> supportedTimeGrainTypes) {
        this.supportedTimeGrainTypes = supportedTimeGrainTypes;
        return this;
    }

    /**
     * Get the internalMetricName property: The internal metric name.
     * 
     * @return the internalMetricName value.
     */
    public String internalMetricName() {
        return this.internalMetricName;
    }

    /**
     * Set the internalMetricName property: The internal metric name.
     * 
     * @param internalMetricName the internalMetricName value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withInternalMetricName(String internalMetricName) {
        this.internalMetricName = internalMetricName;
        return this;
    }

    /**
     * Get the enableRegionalMdmAccount property: Whether or not the service is using regional MDM accounts.
     * 
     * @return the enableRegionalMdmAccount value.
     */
    public Boolean enableRegionalMdmAccount() {
        return this.enableRegionalMdmAccount;
    }

    /**
     * Set the enableRegionalMdmAccount property: Whether or not the service is using regional MDM accounts.
     * 
     * @param enableRegionalMdmAccount the enableRegionalMdmAccount value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withEnableRegionalMdmAccount(Boolean enableRegionalMdmAccount) {
        this.enableRegionalMdmAccount = enableRegionalMdmAccount;
        return this;
    }

    /**
     * Get the sourceMdmAccount property: The source MDM account.
     * 
     * @return the sourceMdmAccount value.
     */
    public String sourceMdmAccount() {
        return this.sourceMdmAccount;
    }

    /**
     * Set the sourceMdmAccount property: The source MDM account.
     * 
     * @param sourceMdmAccount the sourceMdmAccount value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSourceMdmAccount(String sourceMdmAccount) {
        this.sourceMdmAccount = sourceMdmAccount;
        return this;
    }

    /**
     * Get the sourceMdmNamespace property: The source MDM namespace.
     * 
     * @return the sourceMdmNamespace value.
     */
    public String sourceMdmNamespace() {
        return this.sourceMdmNamespace;
    }

    /**
     * Set the sourceMdmNamespace property: The source MDM namespace.
     * 
     * @param sourceMdmNamespace the sourceMdmNamespace value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSourceMdmNamespace(String sourceMdmNamespace) {
        this.sourceMdmNamespace = sourceMdmNamespace;
        return this;
    }

    /**
     * Get the dimensions property: Dimensions of blobs, including blob type and access tier.
     * 
     * @return the dimensions value.
     */
    public List<Dimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: Dimensions of blobs, including blob type and access tier.
     * 
     * @param dimensions the dimensions value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the aggregationType property: Aggregation type could be Average.
     * 
     * @return the aggregationType value.
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set the aggregationType property: Aggregation type could be Average.
     * 
     * @param aggregationType the aggregationType value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get the fillGapWithZero property: The property to decide fill gap with zero or not.
     * 
     * @return the fillGapWithZero value.
     */
    public Boolean fillGapWithZero() {
        return this.fillGapWithZero;
    }

    /**
     * Set the fillGapWithZero property: The property to decide fill gap with zero or not.
     * 
     * @param fillGapWithZero the fillGapWithZero value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withFillGapWithZero(Boolean fillGapWithZero) {
        this.fillGapWithZero = fillGapWithZero;
        return this;
    }

    /**
     * Get the category property: The category this metric specification belong to, could be Capacity.
     * 
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: The category this metric specification belong to, could be Capacity.
     * 
     * @param category the category value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the resourceIdDimensionNameOverride property: Account Resource Id.
     * 
     * @return the resourceIdDimensionNameOverride value.
     */
    public String resourceIdDimensionNameOverride() {
        return this.resourceIdDimensionNameOverride;
    }

    /**
     * Set the resourceIdDimensionNameOverride property: Account Resource Id.
     * 
     * @param resourceIdDimensionNameOverride the resourceIdDimensionNameOverride value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withResourceIdDimensionNameOverride(String resourceIdDimensionNameOverride) {
        this.resourceIdDimensionNameOverride = resourceIdDimensionNameOverride;
        return this;
    }

    /**
     * Get the isInternal property: Whether the metric is internal.
     * 
     * @return the isInternal value.
     */
    public Boolean isInternal() {
        return this.isInternal;
    }

    /**
     * Set the isInternal property: Whether the metric is internal.
     * 
     * @param isInternal the isInternal value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withIsInternal(Boolean isInternal) {
        this.isInternal = isInternal;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dimensions() != null) {
            dimensions().forEach(e -> e.validate());
        }
    }
}
