// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.hybridcompute.fluent.models.ProvisioningIssueProperties;
import java.io.IOException;
import java.util.List;

/**
 * Details on issues that occurred during provisioning.
 */
@Immutable
public final class ProvisioningIssue implements JsonSerializable<ProvisioningIssue> {
    /*
     * Name of the provisioning issue.
     */
    private String name;

    /*
     * Provisioning issue properties
     */
    private ProvisioningIssueProperties innerProperties;

    /**
     * Creates an instance of ProvisioningIssue class.
     */
    public ProvisioningIssue() {
    }

    /**
     * Get the name property: Name of the provisioning issue.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the innerProperties property: Provisioning issue properties.
     * 
     * @return the innerProperties value.
     */
    private ProvisioningIssueProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the issueType property: Issue type.
     * 
     * @return the issueType value.
     */
    public ProvisioningIssueType issueType() {
        return this.innerProperties() == null ? null : this.innerProperties().issueType();
    }

    /**
     * Get the severity property: Severity of the provisioning issue.
     * 
     * @return the severity value.
     */
    public ProvisioningIssueSeverity severity() {
        return this.innerProperties() == null ? null : this.innerProperties().severity();
    }

    /**
     * Get the description property: Description of the provisioning issue.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the suggestedResourceIds property: ARM Ids of the resources that can be associated to the same perimeter to
     * remediate the issue.
     * 
     * @return the suggestedResourceIds value.
     */
    public List<String> suggestedResourceIds() {
        return this.innerProperties() == null ? null : this.innerProperties().suggestedResourceIds();
    }

    /**
     * Get the suggestedAccessRules property: Access rules that can be added to the perimeter to remediate the issue.
     * 
     * @return the suggestedAccessRules value.
     */
    public List<AccessRule> suggestedAccessRules() {
        return this.innerProperties() == null ? null : this.innerProperties().suggestedAccessRules();
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProvisioningIssue from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProvisioningIssue if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProvisioningIssue.
     */
    public static ProvisioningIssue fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProvisioningIssue deserializedProvisioningIssue = new ProvisioningIssue();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedProvisioningIssue.name = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedProvisioningIssue.innerProperties = ProvisioningIssueProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProvisioningIssue;
        });
    }
}
