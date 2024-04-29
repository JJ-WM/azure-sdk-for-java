// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.quota.fluent.models.GroupQuotaDetailsName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Group Quota details.
 */
@Fluent
public final class GroupQuotaDetails {
    /*
     * Location/Azure region for the quota requested for resource.
     */
    @JsonProperty(value = "region")
    private String region;

    /*
     * The current Group Quota Limit at the parentId level.
     */
    @JsonProperty(value = "limit")
    private Long limit;

    /*
     * Any comment related to quota request.
     */
    @JsonProperty(value = "comment")
    private String comment;

    /*
     * Name of the resource provided by the resource provider. This property is already included in the request URI, so it is a readonly property returned in the response.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private GroupQuotaDetailsName innerName;

    /*
     *  The usages units, such as Count and Bytes. When requesting quota, use the **unit** value returned in the GET response in the request body of your PUT operation.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /*
     * The available Group Quota Limit at the MG level. This Group quota can be allocated to subscription(s).
     */
    @JsonProperty(value = "availableLimit", access = JsonProperty.Access.WRITE_ONLY)
    private Long availableLimit;

    /*
     * Quota allocated to subscriptions
     */
    @JsonProperty(value = "allocatedToSubscriptions", access = JsonProperty.Access.WRITE_ONLY)
    private AllocatedQuotaToSubscriptionList allocatedToSubscriptions;

    /**
     * Creates an instance of GroupQuotaDetails class.
     */
    public GroupQuotaDetails() {
    }

    /**
     * Get the region property: Location/Azure region for the quota requested for resource.
     * 
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: Location/Azure region for the quota requested for resource.
     * 
     * @param region the region value to set.
     * @return the GroupQuotaDetails object itself.
     */
    public GroupQuotaDetails withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the limit property: The current Group Quota Limit at the parentId level.
     * 
     * @return the limit value.
     */
    public Long limit() {
        return this.limit;
    }

    /**
     * Set the limit property: The current Group Quota Limit at the parentId level.
     * 
     * @param limit the limit value to set.
     * @return the GroupQuotaDetails object itself.
     */
    public GroupQuotaDetails withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the comment property: Any comment related to quota request.
     * 
     * @return the comment value.
     */
    public String comment() {
        return this.comment;
    }

    /**
     * Set the comment property: Any comment related to quota request.
     * 
     * @param comment the comment value to set.
     * @return the GroupQuotaDetails object itself.
     */
    public GroupQuotaDetails withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Get the innerName property: Name of the resource provided by the resource provider. This property is already
     * included in the request URI, so it is a readonly property returned in the response.
     * 
     * @return the innerName value.
     */
    private GroupQuotaDetailsName innerName() {
        return this.innerName;
    }

    /**
     * Get the unit property: The usages units, such as Count and Bytes. When requesting quota, use the **unit** value
     * returned in the GET response in the request body of your PUT operation.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the availableLimit property: The available Group Quota Limit at the MG level. This Group quota can be
     * allocated to subscription(s).
     * 
     * @return the availableLimit value.
     */
    public Long availableLimit() {
        return this.availableLimit;
    }

    /**
     * Get the allocatedToSubscriptions property: Quota allocated to subscriptions.
     * 
     * @return the allocatedToSubscriptions value.
     */
    public AllocatedQuotaToSubscriptionList allocatedToSubscriptions() {
        return this.allocatedToSubscriptions;
    }

    /**
     * Get the value property: Resource name.
     * 
     * @return the value value.
     */
    public String value() {
        return this.innerName() == null ? null : this.innerName().value();
    }

    /**
     * Get the localizedValue property: Resource display name.
     * 
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.innerName() == null ? null : this.innerName().localizedValue();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerName() != null) {
            innerName().validate();
        }
        if (allocatedToSubscriptions() != null) {
            allocatedToSubscriptions().validate();
        }
    }
}
