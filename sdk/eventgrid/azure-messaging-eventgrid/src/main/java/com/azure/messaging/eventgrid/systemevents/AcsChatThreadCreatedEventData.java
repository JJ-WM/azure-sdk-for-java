// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.Communication.ChatThreadCreated event.
 */
@Fluent
public final class AcsChatThreadCreatedEventData extends AcsChatThreadEventInThreadBaseProperties {
    /*
     * The communication identifier of the user who created the thread
     */
    private CommunicationIdentifierModel createdByCommunicationIdentifier;

    /*
     * The thread properties
     */
    private Map<String, Object> properties;

    /*
     * The chat thread created metadata
     */
    private Map<String, String> metadata;

    /*
     * The list of properties of participants who are part of the thread
     */
    private List<AcsChatThreadParticipantProperties> participants;

    /**
     * Creates an instance of AcsChatThreadCreatedEventData class.
     */
    public AcsChatThreadCreatedEventData() {
    }

    /**
     * Get the createdByCommunicationIdentifier property: The communication identifier of the user who created the
     * thread.
     * 
     * @return the createdByCommunicationIdentifier value.
     */
    public CommunicationIdentifierModel getCreatedByCommunicationIdentifier() {
        return this.createdByCommunicationIdentifier;
    }

    /**
     * Set the createdByCommunicationIdentifier property: The communication identifier of the user who created the
     * thread.
     * 
     * @param createdByCommunicationIdentifier the createdByCommunicationIdentifier value to set.
     * @return the AcsChatThreadCreatedEventData object itself.
     */
    public AcsChatThreadCreatedEventData
        setCreatedByCommunicationIdentifier(CommunicationIdentifierModel createdByCommunicationIdentifier) {
        this.createdByCommunicationIdentifier = createdByCommunicationIdentifier;
        return this;
    }

    /**
     * Get the properties property: The thread properties.
     * 
     * @return the properties value.
     */
    public Map<String, Object> getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: The thread properties.
     * 
     * @param properties the properties value to set.
     * @return the AcsChatThreadCreatedEventData object itself.
     */
    public AcsChatThreadCreatedEventData setProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the metadata property: The chat thread created metadata.
     * 
     * @return the metadata value.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The chat thread created metadata.
     * 
     * @param metadata the metadata value to set.
     * @return the AcsChatThreadCreatedEventData object itself.
     */
    public AcsChatThreadCreatedEventData setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the participants property: The list of properties of participants who are part of the thread.
     * 
     * @return the participants value.
     */
    public List<AcsChatThreadParticipantProperties> getParticipants() {
        return this.participants;
    }

    /**
     * Set the participants property: The list of properties of participants who are part of the thread.
     * 
     * @param participants the participants value to set.
     * @return the AcsChatThreadCreatedEventData object itself.
     */
    public AcsChatThreadCreatedEventData setParticipants(List<AcsChatThreadParticipantProperties> participants) {
        this.participants = participants;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcsChatThreadCreatedEventData setCreateTime(OffsetDateTime createTime) {
        super.setCreateTime(createTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcsChatThreadCreatedEventData setVersion(Long version) {
        super.setVersion(version);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcsChatThreadCreatedEventData setTransactionId(String transactionId) {
        super.setTransactionId(transactionId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcsChatThreadCreatedEventData setThreadId(String threadId) {
        super.setThreadId(threadId);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("transactionId", getTransactionId());
        jsonWriter.writeStringField("threadId", getThreadId());
        jsonWriter.writeStringField("createTime",
            getCreateTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(getCreateTime()));
        jsonWriter.writeNumberField("version", getVersion());
        jsonWriter.writeJsonField("createdByCommunicationIdentifier", this.createdByCommunicationIdentifier);
        jsonWriter.writeMapField("properties", this.properties, (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeMapField("metadata", this.metadata, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("participants", this.participants, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsChatThreadCreatedEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsChatThreadCreatedEventData if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AcsChatThreadCreatedEventData.
     */
    public static AcsChatThreadCreatedEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AcsChatThreadCreatedEventData deserializedAcsChatThreadCreatedEventData
                = new AcsChatThreadCreatedEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("transactionId".equals(fieldName)) {
                    deserializedAcsChatThreadCreatedEventData.setTransactionId(reader.getString());
                } else if ("threadId".equals(fieldName)) {
                    deserializedAcsChatThreadCreatedEventData.setThreadId(reader.getString());
                } else if ("createTime".equals(fieldName)) {
                    deserializedAcsChatThreadCreatedEventData.setCreateTime(
                        reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString())));
                } else if ("version".equals(fieldName)) {
                    deserializedAcsChatThreadCreatedEventData.setVersion(reader.getNullable(JsonReader::getLong));
                } else if ("createdByCommunicationIdentifier".equals(fieldName)) {
                    deserializedAcsChatThreadCreatedEventData.createdByCommunicationIdentifier
                        = CommunicationIdentifierModel.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    Map<String, Object> properties = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedAcsChatThreadCreatedEventData.properties = properties;
                } else if ("metadata".equals(fieldName)) {
                    Map<String, String> metadata = reader.readMap(reader1 -> reader1.getString());
                    deserializedAcsChatThreadCreatedEventData.metadata = metadata;
                } else if ("participants".equals(fieldName)) {
                    List<AcsChatThreadParticipantProperties> participants
                        = reader.readArray(reader1 -> AcsChatThreadParticipantProperties.fromJson(reader1));
                    deserializedAcsChatThreadCreatedEventData.participants = participants;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAcsChatThreadCreatedEventData;
        });
    }
}
