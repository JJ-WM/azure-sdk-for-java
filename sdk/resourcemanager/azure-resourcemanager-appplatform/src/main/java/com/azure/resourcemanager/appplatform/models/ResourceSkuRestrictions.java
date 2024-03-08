// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Restrictions where the SKU cannot be used.
 */
@Fluent
public final class ResourceSkuRestrictions {
    /*
     * Gets the type of restrictions. Possible values include: 'Location', 'Zone'
     */
    @JsonProperty(value = "type")
    private ResourceSkuRestrictionsType type;

    /*
     * Gets the value of restrictions. If the restriction type is set to
     * location. This would be different locations where the SKU is restricted.
     */
    @JsonProperty(value = "values")
    private List<String> values;

    /*
     * Gets the information about the restriction where the SKU cannot be used.
     */
    @JsonProperty(value = "restrictionInfo")
    private ResourceSkuRestrictionInfo restrictionInfo;

    /*
     * Gets the reason for restriction. Possible values include: 'QuotaId', 'NotAvailableForSubscription'
     */
    @JsonProperty(value = "reasonCode")
    private ResourceSkuRestrictionsReasonCode reasonCode;

    /**
     * Creates an instance of ResourceSkuRestrictions class.
     */
    public ResourceSkuRestrictions() {
    }

    /**
     * Get the type property: Gets the type of restrictions. Possible values include: 'Location', 'Zone'.
     * 
     * @return the type value.
     */
    public ResourceSkuRestrictionsType type() {
        return this.type;
    }

    /**
     * Set the type property: Gets the type of restrictions. Possible values include: 'Location', 'Zone'.
     * 
     * @param type the type value to set.
     * @return the ResourceSkuRestrictions object itself.
     */
    public ResourceSkuRestrictions withType(ResourceSkuRestrictionsType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the values property: Gets the value of restrictions. If the restriction type is set to
     * location. This would be different locations where the SKU is restricted.
     * 
     * @return the values value.
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set the values property: Gets the value of restrictions. If the restriction type is set to
     * location. This would be different locations where the SKU is restricted.
     * 
     * @param values the values value to set.
     * @return the ResourceSkuRestrictions object itself.
     */
    public ResourceSkuRestrictions withValues(List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * Get the restrictionInfo property: Gets the information about the restriction where the SKU cannot be used.
     * 
     * @return the restrictionInfo value.
     */
    public ResourceSkuRestrictionInfo restrictionInfo() {
        return this.restrictionInfo;
    }

    /**
     * Set the restrictionInfo property: Gets the information about the restriction where the SKU cannot be used.
     * 
     * @param restrictionInfo the restrictionInfo value to set.
     * @return the ResourceSkuRestrictions object itself.
     */
    public ResourceSkuRestrictions withRestrictionInfo(ResourceSkuRestrictionInfo restrictionInfo) {
        this.restrictionInfo = restrictionInfo;
        return this;
    }

    /**
     * Get the reasonCode property: Gets the reason for restriction. Possible values include: 'QuotaId',
     * 'NotAvailableForSubscription'.
     * 
     * @return the reasonCode value.
     */
    public ResourceSkuRestrictionsReasonCode reasonCode() {
        return this.reasonCode;
    }

    /**
     * Set the reasonCode property: Gets the reason for restriction. Possible values include: 'QuotaId',
     * 'NotAvailableForSubscription'.
     * 
     * @param reasonCode the reasonCode value to set.
     * @return the ResourceSkuRestrictions object itself.
     */
    public ResourceSkuRestrictions withReasonCode(ResourceSkuRestrictionsReasonCode reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (restrictionInfo() != null) {
            restrictionInfo().validate();
        }
    }
}
