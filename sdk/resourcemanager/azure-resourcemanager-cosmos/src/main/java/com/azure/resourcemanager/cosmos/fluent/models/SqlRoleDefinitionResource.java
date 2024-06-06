// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.models.Permission;
import com.azure.resourcemanager.cosmos.models.RoleDefinitionType;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Azure Cosmos DB SQL Role Definition resource object.
 */
@Fluent
public final class SqlRoleDefinitionResource {
    /*
     * A user-friendly name for the Role Definition. Must be unique for the database account.
     */
    @JsonProperty(value = "roleName")
    private String roleName;

    /*
     * Indicates whether the Role Definition was built-in or user created.
     */
    @JsonProperty(value = "type")
    private RoleDefinitionType type;

    /*
     * A set of fully qualified Scopes at or below which Role Assignments may be created using this Role Definition. This will allow application of this Role Definition on the entire database account or any underlying Database / Collection. Must have at least one element. Scopes higher than Database account are not enforceable as assignable Scopes. Note that resources referenced in assignable Scopes need not exist.
     */
    @JsonProperty(value = "assignableScopes")
    private List<String> assignableScopes;

    /*
     * The set of operations allowed through this Role Definition.
     */
    @JsonProperty(value = "permissions")
    private List<Permission> permissions;

    /**
     * Creates an instance of SqlRoleDefinitionResource class.
     */
    public SqlRoleDefinitionResource() {
    }

    /**
     * Get the roleName property: A user-friendly name for the Role Definition. Must be unique for the database account.
     *
     * @return the roleName value.
     */
    public String roleName() {
        return this.roleName;
    }

    /**
     * Set the roleName property: A user-friendly name for the Role Definition. Must be unique for the database account.
     *
     * @param roleName the roleName value to set.
     * @return the SqlRoleDefinitionResource object itself.
     */
    public SqlRoleDefinitionResource withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * Get the type property: Indicates whether the Role Definition was built-in or user created.
     *
     * @return the type value.
     */
    public RoleDefinitionType type() {
        return this.type;
    }

    /**
     * Set the type property: Indicates whether the Role Definition was built-in or user created.
     *
     * @param type the type value to set.
     * @return the SqlRoleDefinitionResource object itself.
     */
    public SqlRoleDefinitionResource withType(RoleDefinitionType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the assignableScopes property: A set of fully qualified Scopes at or below which Role Assignments may be
     * created using this Role Definition. This will allow application of this Role Definition on the entire database
     * account or any underlying Database / Collection. Must have at least one element. Scopes higher than Database
     * account are not enforceable as assignable Scopes. Note that resources referenced in assignable Scopes need not
     * exist.
     *
     * @return the assignableScopes value.
     */
    public List<String> assignableScopes() {
        return this.assignableScopes;
    }

    /**
     * Set the assignableScopes property: A set of fully qualified Scopes at or below which Role Assignments may be
     * created using this Role Definition. This will allow application of this Role Definition on the entire database
     * account or any underlying Database / Collection. Must have at least one element. Scopes higher than Database
     * account are not enforceable as assignable Scopes. Note that resources referenced in assignable Scopes need not
     * exist.
     *
     * @param assignableScopes the assignableScopes value to set.
     * @return the SqlRoleDefinitionResource object itself.
     */
    public SqlRoleDefinitionResource withAssignableScopes(List<String> assignableScopes) {
        this.assignableScopes = assignableScopes;
        return this;
    }

    /**
     * Get the permissions property: The set of operations allowed through this Role Definition.
     *
     * @return the permissions value.
     */
    public List<Permission> permissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: The set of operations allowed through this Role Definition.
     *
     * @param permissions the permissions value to set.
     * @return the SqlRoleDefinitionResource object itself.
     */
    public SqlRoleDefinitionResource withPermissions(List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (permissions() != null) {
            permissions().forEach(e -> e.validate());
        }
    }
}
