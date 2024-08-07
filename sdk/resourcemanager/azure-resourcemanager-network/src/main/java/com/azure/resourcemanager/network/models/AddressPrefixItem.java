// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Address prefix item.
 */
@Fluent
public final class AddressPrefixItem implements JsonSerializable<AddressPrefixItem> {
    /*
     * Address prefix.
     */
    private String addressPrefix;

    /*
     * Address prefix type.
     */
    private AddressPrefixType addressPrefixType;

    /**
     * Creates an instance of AddressPrefixItem class.
     */
    public AddressPrefixItem() {
    }

    /**
     * Get the addressPrefix property: Address prefix.
     * 
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: Address prefix.
     * 
     * @param addressPrefix the addressPrefix value to set.
     * @return the AddressPrefixItem object itself.
     */
    public AddressPrefixItem withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the addressPrefixType property: Address prefix type.
     * 
     * @return the addressPrefixType value.
     */
    public AddressPrefixType addressPrefixType() {
        return this.addressPrefixType;
    }

    /**
     * Set the addressPrefixType property: Address prefix type.
     * 
     * @param addressPrefixType the addressPrefixType value to set.
     * @return the AddressPrefixItem object itself.
     */
    public AddressPrefixItem withAddressPrefixType(AddressPrefixType addressPrefixType) {
        this.addressPrefixType = addressPrefixType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("addressPrefix", this.addressPrefix);
        jsonWriter.writeStringField("addressPrefixType",
            this.addressPrefixType == null ? null : this.addressPrefixType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AddressPrefixItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AddressPrefixItem if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AddressPrefixItem.
     */
    public static AddressPrefixItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AddressPrefixItem deserializedAddressPrefixItem = new AddressPrefixItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("addressPrefix".equals(fieldName)) {
                    deserializedAddressPrefixItem.addressPrefix = reader.getString();
                } else if ("addressPrefixType".equals(fieldName)) {
                    deserializedAddressPrefixItem.addressPrefixType = AddressPrefixType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAddressPrefixItem;
        });
    }
}
