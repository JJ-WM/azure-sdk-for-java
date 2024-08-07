// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The role management policy authentication context rule.
 */
@Fluent
public final class RoleManagementPolicyAuthenticationContextRule extends RoleManagementPolicyRule {
    /*
     * The type of rule
     */
    private RoleManagementPolicyRuleType ruleType
        = RoleManagementPolicyRuleType.ROLE_MANAGEMENT_POLICY_AUTHENTICATION_CONTEXT_RULE;

    /*
     * The value indicating if rule is enabled.
     */
    private Boolean isEnabled;

    /*
     * The claim value.
     */
    private String claimValue;

    /**
     * Creates an instance of RoleManagementPolicyAuthenticationContextRule class.
     */
    public RoleManagementPolicyAuthenticationContextRule() {
    }

    /**
     * Get the ruleType property: The type of rule.
     * 
     * @return the ruleType value.
     */
    @Override
    public RoleManagementPolicyRuleType ruleType() {
        return this.ruleType;
    }

    /**
     * Get the isEnabled property: The value indicating if rule is enabled.
     * 
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: The value indicating if rule is enabled.
     * 
     * @param isEnabled the isEnabled value to set.
     * @return the RoleManagementPolicyAuthenticationContextRule object itself.
     */
    public RoleManagementPolicyAuthenticationContextRule withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the claimValue property: The claim value.
     * 
     * @return the claimValue value.
     */
    public String claimValue() {
        return this.claimValue;
    }

    /**
     * Set the claimValue property: The claim value.
     * 
     * @param claimValue the claimValue value to set.
     * @return the RoleManagementPolicyAuthenticationContextRule object itself.
     */
    public RoleManagementPolicyAuthenticationContextRule withClaimValue(String claimValue) {
        this.claimValue = claimValue;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleManagementPolicyAuthenticationContextRule withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleManagementPolicyAuthenticationContextRule withTarget(RoleManagementPolicyRuleTarget target) {
        super.withTarget(target);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("target", target());
        jsonWriter.writeStringField("ruleType", this.ruleType == null ? null : this.ruleType.toString());
        jsonWriter.writeBooleanField("isEnabled", this.isEnabled);
        jsonWriter.writeStringField("claimValue", this.claimValue);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoleManagementPolicyAuthenticationContextRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoleManagementPolicyAuthenticationContextRule if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RoleManagementPolicyAuthenticationContextRule.
     */
    public static RoleManagementPolicyAuthenticationContextRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RoleManagementPolicyAuthenticationContextRule deserializedRoleManagementPolicyAuthenticationContextRule
                = new RoleManagementPolicyAuthenticationContextRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRoleManagementPolicyAuthenticationContextRule.withId(reader.getString());
                } else if ("target".equals(fieldName)) {
                    deserializedRoleManagementPolicyAuthenticationContextRule
                        .withTarget(RoleManagementPolicyRuleTarget.fromJson(reader));
                } else if ("ruleType".equals(fieldName)) {
                    deserializedRoleManagementPolicyAuthenticationContextRule.ruleType
                        = RoleManagementPolicyRuleType.fromString(reader.getString());
                } else if ("isEnabled".equals(fieldName)) {
                    deserializedRoleManagementPolicyAuthenticationContextRule.isEnabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("claimValue".equals(fieldName)) {
                    deserializedRoleManagementPolicyAuthenticationContextRule.claimValue = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRoleManagementPolicyAuthenticationContextRule;
        });
    }
}
