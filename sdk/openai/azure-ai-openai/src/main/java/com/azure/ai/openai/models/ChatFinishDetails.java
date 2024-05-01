// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An abstract representation of structured information about why a chat completions response terminated.
 */
@Immutable
public class ChatFinishDetails implements JsonSerializable<ChatFinishDetails> {

    /**
     * Creates an instance of ChatFinishDetails class.
     */
    @Generated
    protected ChatFinishDetails() {
        this.type = "ChatFinishDetails";
    }

    /*
     * The object type.
     */
    @Generated
    private String type;

    /**
     * Get the type property: The object type.
     *
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatFinishDetails from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatFinishDetails if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ChatFinishDetails.
     */
    @Generated
    public static ChatFinishDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                // Prepare for reading
                readerToUse.nextToken();
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("stop".equals(discriminatorValue)) {
                    return StopFinishDetails.fromJson(readerToUse.reset());
                } else if ("max_tokens".equals(discriminatorValue)) {
                    return MaxTokensFinishDetails.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static ChatFinishDetails fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ChatFinishDetails deserializedChatFinishDetails = new ChatFinishDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("type".equals(fieldName)) {
                    deserializedChatFinishDetails.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedChatFinishDetails;
        });
    }
}
