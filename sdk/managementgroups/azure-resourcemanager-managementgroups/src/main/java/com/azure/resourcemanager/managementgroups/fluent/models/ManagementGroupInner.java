// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.managementgroups.models.ManagementGroupChildInfo;
import com.azure.resourcemanager.managementgroups.models.ManagementGroupDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The management group details. */
@Fluent
public final class ManagementGroupInner extends ProxyResource {
    /*
     * The generic properties of a management group.
     */
    @JsonProperty(value = "properties")
    private ManagementGroupProperties innerProperties;

    /** Creates an instance of ManagementGroupInner class. */
    public ManagementGroupInner() {
    }

    /**
     * Get the innerProperties property: The generic properties of a management group.
     *
     * @return the innerProperties value.
     */
    private ManagementGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tenantId property: The AAD Tenant ID associated with the management group. For example,
     * 00000000-0000-0000-0000-000000000000.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Set the tenantId property: The AAD Tenant ID associated with the management group. For example,
     * 00000000-0000-0000-0000-000000000000.
     *
     * @param tenantId the tenantId value to set.
     * @return the ManagementGroupInner object itself.
     */
    public ManagementGroupInner withTenantId(String tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagementGroupProperties();
        }
        this.innerProperties().withTenantId(tenantId);
        return this;
    }

    /**
     * Get the displayName property: The friendly name of the management group.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The friendly name of the management group.
     *
     * @param displayName the displayName value to set.
     * @return the ManagementGroupInner object itself.
     */
    public ManagementGroupInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagementGroupProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the details property: The details of a management group.
     *
     * @return the details value.
     */
    public ManagementGroupDetails details() {
        return this.innerProperties() == null ? null : this.innerProperties().details();
    }

    /**
     * Set the details property: The details of a management group.
     *
     * @param details the details value to set.
     * @return the ManagementGroupInner object itself.
     */
    public ManagementGroupInner withDetails(ManagementGroupDetails details) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagementGroupProperties();
        }
        this.innerProperties().withDetails(details);
        return this;
    }

    /**
     * Get the children property: The list of children.
     *
     * @return the children value.
     */
    public List<ManagementGroupChildInfo> children() {
        return this.innerProperties() == null ? null : this.innerProperties().children();
    }

    /**
     * Set the children property: The list of children.
     *
     * @param children the children value to set.
     * @return the ManagementGroupInner object itself.
     */
    public ManagementGroupInner withChildren(List<ManagementGroupChildInfo> children) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagementGroupProperties();
        }
        this.innerProperties().withChildren(children);
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
