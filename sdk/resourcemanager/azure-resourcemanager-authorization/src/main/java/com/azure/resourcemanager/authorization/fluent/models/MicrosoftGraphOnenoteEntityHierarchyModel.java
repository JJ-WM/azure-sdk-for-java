// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * onenoteEntityHierarchyModel.
 */
@Fluent
public class MicrosoftGraphOnenoteEntityHierarchyModel extends MicrosoftGraphOnenoteEntitySchemaObjectModel {
    /*
     * identitySet
     */
    private MicrosoftGraphIdentitySet createdBy;

    /*
     * The name of the notebook.
     */
    private String displayName;

    /*
     * identitySet
     */
    private MicrosoftGraphIdentitySet lastModifiedBy;

    /*
     * The date and time when the notebook was last modified. The timestamp represents date and time information using
     * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
     * '2014-01-01T00:00:00Z'. Read-only.
     */
    private OffsetDateTime lastModifiedDateTime;

    /*
     * onenoteEntityHierarchyModel
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphOnenoteEntityHierarchyModel class.
     */
    public MicrosoftGraphOnenoteEntityHierarchyModel() {
    }

    /**
     * Get the createdBy property: identitySet.
     * 
     * @return the createdBy value.
     */
    public MicrosoftGraphIdentitySet createdBy() {
        return this.createdBy;
    }

    /**
     * Set the createdBy property: identitySet.
     * 
     * @param createdBy the createdBy value to set.
     * @return the MicrosoftGraphOnenoteEntityHierarchyModel object itself.
     */
    public MicrosoftGraphOnenoteEntityHierarchyModel withCreatedBy(MicrosoftGraphIdentitySet createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the displayName property: The name of the notebook.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name of the notebook.
     * 
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphOnenoteEntityHierarchyModel object itself.
     */
    public MicrosoftGraphOnenoteEntityHierarchyModel withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the lastModifiedBy property: identitySet.
     * 
     * @return the lastModifiedBy value.
     */
    public MicrosoftGraphIdentitySet lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Set the lastModifiedBy property: identitySet.
     * 
     * @param lastModifiedBy the lastModifiedBy value to set.
     * @return the MicrosoftGraphOnenoteEntityHierarchyModel object itself.
     */
    public MicrosoftGraphOnenoteEntityHierarchyModel withLastModifiedBy(MicrosoftGraphIdentitySet lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Get the lastModifiedDateTime property: The date and time when the notebook was last modified. The timestamp
     * represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC
     * on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     * 
     * @return the lastModifiedDateTime value.
     */
    public OffsetDateTime lastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Set the lastModifiedDateTime property: The date and time when the notebook was last modified. The timestamp
     * represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC
     * on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     * 
     * @param lastModifiedDateTime the lastModifiedDateTime value to set.
     * @return the MicrosoftGraphOnenoteEntityHierarchyModel object itself.
     */
    public MicrosoftGraphOnenoteEntityHierarchyModel withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
        return this;
    }

    /**
     * Get the additionalProperties property: onenoteEntityHierarchyModel.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: onenoteEntityHierarchyModel.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphOnenoteEntityHierarchyModel object itself.
     */
    public MicrosoftGraphOnenoteEntityHierarchyModel
        withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphOnenoteEntityHierarchyModel withCreatedDateTime(OffsetDateTime createdDateTime) {
        super.withCreatedDateTime(createdDateTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphOnenoteEntityHierarchyModel withSelf(String self) {
        super.withSelf(self);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphOnenoteEntityHierarchyModel withId(String id) {
        super.withId(id);
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
        if (createdBy() != null) {
            createdBy().validate();
        }
        if (lastModifiedBy() != null) {
            lastModifiedBy().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeStringField("self", self());
        jsonWriter.writeStringField("createdDateTime",
            createdDateTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(createdDateTime()));
        jsonWriter.writeJsonField("createdBy", this.createdBy);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeJsonField("lastModifiedBy", this.lastModifiedBy);
        jsonWriter.writeStringField("lastModifiedDateTime",
            this.lastModifiedDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastModifiedDateTime));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphOnenoteEntityHierarchyModel from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphOnenoteEntityHierarchyModel if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphOnenoteEntityHierarchyModel.
     */
    public static MicrosoftGraphOnenoteEntityHierarchyModel fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphOnenoteEntityHierarchyModel deserializedMicrosoftGraphOnenoteEntityHierarchyModel
                = new MicrosoftGraphOnenoteEntityHierarchyModel();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenoteEntityHierarchyModel.withId(reader.getString());
                } else if ("self".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenoteEntityHierarchyModel.withSelf(reader.getString());
                } else if ("createdDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenoteEntityHierarchyModel.withCreatedDateTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("createdBy".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenoteEntityHierarchyModel.createdBy
                        = MicrosoftGraphIdentitySet.fromJson(reader);
                } else if ("displayName".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenoteEntityHierarchyModel.displayName = reader.getString();
                } else if ("lastModifiedBy".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenoteEntityHierarchyModel.lastModifiedBy
                        = MicrosoftGraphIdentitySet.fromJson(reader);
                } else if ("lastModifiedDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphOnenoteEntityHierarchyModel.lastModifiedDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphOnenoteEntityHierarchyModel.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphOnenoteEntityHierarchyModel;
        });
    }
}
