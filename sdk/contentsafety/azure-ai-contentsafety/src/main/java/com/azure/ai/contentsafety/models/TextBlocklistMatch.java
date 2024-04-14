// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.contentsafety.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The result of blocklist match.
 */
@Immutable
public final class TextBlocklistMatch implements JsonSerializable<TextBlocklistMatch> {

    /*
     * The name of the matched blocklist.
     */
    @Generated
    private final String blocklistName;

    /*
     * The ID of the matched item.
     */
    @Generated
    private final String blocklistItemId;

    /*
     * The content of the matched item.
     */
    @Generated
    private final String blocklistItemText;

    /**
     * Creates an instance of TextBlocklistMatch class.
     *
     * @param blocklistName the blocklistName value to set.
     * @param blocklistItemId the blocklistItemId value to set.
     * @param blocklistItemText the blocklistItemText value to set.
     */
    @Generated
    private TextBlocklistMatch(String blocklistName, String blocklistItemId, String blocklistItemText) {
        this.blocklistName = blocklistName;
        this.blocklistItemId = blocklistItemId;
        this.blocklistItemText = blocklistItemText;
    }

    /**
     * Get the blocklistName property: The name of the matched blocklist.
     *
     * @return the blocklistName value.
     */
    @Generated
    public String getBlocklistName() {
        return this.blocklistName;
    }

    /**
     * Get the blocklistItemId property: The ID of the matched item.
     *
     * @return the blocklistItemId value.
     */
    @Generated
    public String getBlocklistItemId() {
        return this.blocklistItemId;
    }

    /**
     * Get the blocklistItemText property: The content of the matched item.
     *
     * @return the blocklistItemText value.
     */
    @Generated
    public String getBlocklistItemText() {
        return this.blocklistItemText;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("blocklistName", this.blocklistName);
        jsonWriter.writeStringField("blocklistItemId", this.blocklistItemId);
        jsonWriter.writeStringField("blocklistItemText", this.blocklistItemText);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TextBlocklistMatch from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of TextBlocklistMatch if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TextBlocklistMatch.
     */
    @Generated
    public static TextBlocklistMatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String blocklistName = null;
            String blocklistItemId = null;
            String blocklistItemText = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("blocklistName".equals(fieldName)) {
                    blocklistName = reader.getString();
                } else if ("blocklistItemId".equals(fieldName)) {
                    blocklistItemId = reader.getString();
                } else if ("blocklistItemText".equals(fieldName)) {
                    blocklistItemText = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new TextBlocklistMatch(blocklistName, blocklistItemId, blocklistItemText);
        });
    }
}
