// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Document model info.
 */
@Fluent
public final class DocumentModelDetails implements JsonSerializable<DocumentModelDetails> {
    /*
     * Unique document model name.
     */
    private final String modelId;

    /*
     * Document model description.
     */
    private String description;

    /*
     * Date and time (UTC) when the document model was created.
     */
    private final OffsetDateTime createdDateTime;

    /*
     * Date and time (UTC) when the document model will expire.
     */
    private OffsetDateTime expirationDateTime;

    /*
     * API version used to create this document model.
     */
    private String apiVersion;

    /*
     * List of key-value tag attributes associated with the document model.
     */
    private Map<String, String> tags;

    /*
     * Supported document types.
     */
    private Map<String, DocumentTypeDetails> docTypes;

    /**
     * Creates an instance of DocumentModelDetails class.
     * 
     * @param modelId the modelId value to set.
     * @param createdDateTime the createdDateTime value to set.
     */
    public DocumentModelDetails(String modelId, OffsetDateTime createdDateTime) {
        this.modelId = modelId;
        this.createdDateTime = createdDateTime;
    }

    /**
     * Get the modelId property: Unique document model name.
     * 
     * @return the modelId value.
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * Get the description property: Document model description.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Document model description.
     * 
     * @param description the description value to set.
     * @return the DocumentModelDetails object itself.
     */
    public DocumentModelDetails setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the createdDateTime property: Date and time (UTC) when the document model was created.
     * 
     * @return the createdDateTime value.
     */
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Get the expirationDateTime property: Date and time (UTC) when the document model will expire.
     * 
     * @return the expirationDateTime value.
     */
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }

    /**
     * Set the expirationDateTime property: Date and time (UTC) when the document model will expire.
     * 
     * @param expirationDateTime the expirationDateTime value to set.
     * @return the DocumentModelDetails object itself.
     */
    public DocumentModelDetails setExpirationDateTime(OffsetDateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Get the apiVersion property: API version used to create this document model.
     * 
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Set the apiVersion property: API version used to create this document model.
     * 
     * @param apiVersion the apiVersion value to set.
     * @return the DocumentModelDetails object itself.
     */
    public DocumentModelDetails setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the tags property: List of key-value tag attributes associated with the document model.
     * 
     * @return the tags value.
     */
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: List of key-value tag attributes associated with the document model.
     * 
     * @param tags the tags value to set.
     * @return the DocumentModelDetails object itself.
     */
    public DocumentModelDetails setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the docTypes property: Supported document types.
     * 
     * @return the docTypes value.
     */
    public Map<String, DocumentTypeDetails> getDocTypes() {
        return this.docTypes;
    }

    /**
     * Set the docTypes property: Supported document types.
     * 
     * @param docTypes the docTypes value to set.
     * @return the DocumentModelDetails object itself.
     */
    public DocumentModelDetails setDocTypes(Map<String, DocumentTypeDetails> docTypes) {
        this.docTypes = docTypes;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("modelId", this.modelId);
        jsonWriter.writeStringField("createdDateTime",
            this.createdDateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.createdDateTime));
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("expirationDateTime", this.expirationDateTime == null ? null
            : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.expirationDateTime));
        jsonWriter.writeStringField("apiVersion", this.apiVersion);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("docTypes", this.docTypes, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DocumentModelDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DocumentModelDetails if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DocumentModelDetails.
     */
    public static DocumentModelDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean modelIdFound = false;
            String modelId = null;
            boolean createdDateTimeFound = false;
            OffsetDateTime createdDateTime = null;
            String description = null;
            OffsetDateTime expirationDateTime = null;
            String apiVersion = null;
            Map<String, String> tags = null;
            Map<String, DocumentTypeDetails> docTypes = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("modelId".equals(fieldName)) {
                    modelId = reader.getString();
                    modelIdFound = true;
                } else if ("createdDateTime".equals(fieldName)) {
                    createdDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                    createdDateTimeFound = true;
                } else if ("description".equals(fieldName)) {
                    description = reader.getString();
                } else if ("expirationDateTime".equals(fieldName)) {
                    expirationDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("apiVersion".equals(fieldName)) {
                    apiVersion = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    tags = reader.readMap(reader1 -> reader1.getString());
                } else if ("docTypes".equals(fieldName)) {
                    docTypes = reader.readMap(reader1 -> DocumentTypeDetails.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            if (modelIdFound && createdDateTimeFound) {
                DocumentModelDetails deserializedDocumentModelDetails
                    = new DocumentModelDetails(modelId, createdDateTime);
                deserializedDocumentModelDetails.description = description;
                deserializedDocumentModelDetails.expirationDateTime = expirationDateTime;
                deserializedDocumentModelDetails.apiVersion = apiVersion;
                deserializedDocumentModelDetails.tags = tags;
                deserializedDocumentModelDetails.docTypes = docTypes;

                return deserializedDocumentModelDetails;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!modelIdFound) {
                missingProperties.add("modelId");
            }
            if (!createdDateTimeFound) {
                missingProperties.add("createdDateTime");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
