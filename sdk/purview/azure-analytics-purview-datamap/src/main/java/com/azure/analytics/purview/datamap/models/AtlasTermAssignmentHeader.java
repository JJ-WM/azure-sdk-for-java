// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The header for term assignment.
 */
@Fluent
public final class AtlasTermAssignmentHeader implements JsonSerializable<AtlasTermAssignmentHeader> {
    /*
     * The confidence of the term assignment.
     */
    @Generated
    private Integer confidence;

    /*
     * The user who created the record.
     */
    @Generated
    private String createdBy;

    /*
     * The description of the term assignment.
     */
    @Generated
    private String description;

    /*
     * The display text.
     */
    @Generated
    private String displayText;

    /*
     * The expression of the term assignment.
     */
    @Generated
    private String expression;

    /*
     * The GUID of the relationship.
     */
    @Generated
    private String relationGuid;

    /*
     * The status of terms assignment.
     */
    @Generated
    private AtlasTermAssignmentStatus status;

    /*
     * The steward of the term.
     */
    @Generated
    private String steward;

    /*
     * The GUID of the term.
     */
    @Generated
    private String termGuid;

    /**
     * Creates an instance of AtlasTermAssignmentHeader class.
     */
    @Generated
    public AtlasTermAssignmentHeader() {
    }

    /**
     * Get the confidence property: The confidence of the term assignment.
     * 
     * @return the confidence value.
     */
    @Generated
    public Integer getConfidence() {
        return this.confidence;
    }

    /**
     * Set the confidence property: The confidence of the term assignment.
     * 
     * @param confidence the confidence value to set.
     * @return the AtlasTermAssignmentHeader object itself.
     */
    @Generated
    public AtlasTermAssignmentHeader setConfidence(Integer confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Get the createdBy property: The user who created the record.
     * 
     * @return the createdBy value.
     */
    @Generated
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Set the createdBy property: The user who created the record.
     * 
     * @param createdBy the createdBy value to set.
     * @return the AtlasTermAssignmentHeader object itself.
     */
    @Generated
    public AtlasTermAssignmentHeader setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the description property: The description of the term assignment.
     * 
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the term assignment.
     * 
     * @param description the description value to set.
     * @return the AtlasTermAssignmentHeader object itself.
     */
    @Generated
    public AtlasTermAssignmentHeader setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayText property: The display text.
     * 
     * @return the displayText value.
     */
    @Generated
    public String getDisplayText() {
        return this.displayText;
    }

    /**
     * Set the displayText property: The display text.
     * 
     * @param displayText the displayText value to set.
     * @return the AtlasTermAssignmentHeader object itself.
     */
    @Generated
    public AtlasTermAssignmentHeader setDisplayText(String displayText) {
        this.displayText = displayText;
        return this;
    }

    /**
     * Get the expression property: The expression of the term assignment.
     * 
     * @return the expression value.
     */
    @Generated
    public String getExpression() {
        return this.expression;
    }

    /**
     * Set the expression property: The expression of the term assignment.
     * 
     * @param expression the expression value to set.
     * @return the AtlasTermAssignmentHeader object itself.
     */
    @Generated
    public AtlasTermAssignmentHeader setExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * Get the relationGuid property: The GUID of the relationship.
     * 
     * @return the relationGuid value.
     */
    @Generated
    public String getRelationGuid() {
        return this.relationGuid;
    }

    /**
     * Set the relationGuid property: The GUID of the relationship.
     * 
     * @param relationGuid the relationGuid value to set.
     * @return the AtlasTermAssignmentHeader object itself.
     */
    @Generated
    public AtlasTermAssignmentHeader setRelationGuid(String relationGuid) {
        this.relationGuid = relationGuid;
        return this;
    }

    /**
     * Get the status property: The status of terms assignment.
     * 
     * @return the status value.
     */
    @Generated
    public AtlasTermAssignmentStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status of terms assignment.
     * 
     * @param status the status value to set.
     * @return the AtlasTermAssignmentHeader object itself.
     */
    @Generated
    public AtlasTermAssignmentHeader setStatus(AtlasTermAssignmentStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the steward property: The steward of the term.
     * 
     * @return the steward value.
     */
    @Generated
    public String getSteward() {
        return this.steward;
    }

    /**
     * Set the steward property: The steward of the term.
     * 
     * @param steward the steward value to set.
     * @return the AtlasTermAssignmentHeader object itself.
     */
    @Generated
    public AtlasTermAssignmentHeader setSteward(String steward) {
        this.steward = steward;
        return this;
    }

    /**
     * Get the termGuid property: The GUID of the term.
     * 
     * @return the termGuid value.
     */
    @Generated
    public String getTermGuid() {
        return this.termGuid;
    }

    /**
     * Set the termGuid property: The GUID of the term.
     * 
     * @param termGuid the termGuid value to set.
     * @return the AtlasTermAssignmentHeader object itself.
     */
    @Generated
    public AtlasTermAssignmentHeader setTermGuid(String termGuid) {
        this.termGuid = termGuid;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("confidence", this.confidence);
        jsonWriter.writeStringField("createdBy", this.createdBy);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("displayText", this.displayText);
        jsonWriter.writeStringField("expression", this.expression);
        jsonWriter.writeStringField("relationGuid", this.relationGuid);
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("steward", this.steward);
        jsonWriter.writeStringField("termGuid", this.termGuid);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AtlasTermAssignmentHeader from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AtlasTermAssignmentHeader if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AtlasTermAssignmentHeader.
     */
    @Generated
    public static AtlasTermAssignmentHeader fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AtlasTermAssignmentHeader deserializedAtlasTermAssignmentHeader = new AtlasTermAssignmentHeader();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("confidence".equals(fieldName)) {
                    deserializedAtlasTermAssignmentHeader.confidence = reader.getNullable(JsonReader::getInt);
                } else if ("createdBy".equals(fieldName)) {
                    deserializedAtlasTermAssignmentHeader.createdBy = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedAtlasTermAssignmentHeader.description = reader.getString();
                } else if ("displayText".equals(fieldName)) {
                    deserializedAtlasTermAssignmentHeader.displayText = reader.getString();
                } else if ("expression".equals(fieldName)) {
                    deserializedAtlasTermAssignmentHeader.expression = reader.getString();
                } else if ("relationGuid".equals(fieldName)) {
                    deserializedAtlasTermAssignmentHeader.relationGuid = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedAtlasTermAssignmentHeader.status
                        = AtlasTermAssignmentStatus.fromString(reader.getString());
                } else if ("steward".equals(fieldName)) {
                    deserializedAtlasTermAssignmentHeader.steward = reader.getString();
                } else if ("termGuid".equals(fieldName)) {
                    deserializedAtlasTermAssignmentHeader.termGuid = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAtlasTermAssignmentHeader;
        });
    }
}
