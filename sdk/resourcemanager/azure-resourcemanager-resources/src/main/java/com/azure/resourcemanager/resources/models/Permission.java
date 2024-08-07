// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Role definition permissions.
 */
@Fluent
public final class Permission implements JsonSerializable<Permission> {
    /*
     * Allowed actions.
     */
    private List<String> actions;

    /*
     * Denied actions.
     */
    private List<String> notActions;

    /*
     * Allowed Data actions.
     */
    private List<String> dataActions;

    /*
     * Denied Data actions.
     */
    private List<String> notDataActions;

    /**
     * Creates an instance of Permission class.
     */
    public Permission() {
    }

    /**
     * Get the actions property: Allowed actions.
     * 
     * @return the actions value.
     */
    public List<String> actions() {
        return this.actions;
    }

    /**
     * Set the actions property: Allowed actions.
     * 
     * @param actions the actions value to set.
     * @return the Permission object itself.
     */
    public Permission withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the notActions property: Denied actions.
     * 
     * @return the notActions value.
     */
    public List<String> notActions() {
        return this.notActions;
    }

    /**
     * Set the notActions property: Denied actions.
     * 
     * @param notActions the notActions value to set.
     * @return the Permission object itself.
     */
    public Permission withNotActions(List<String> notActions) {
        this.notActions = notActions;
        return this;
    }

    /**
     * Get the dataActions property: Allowed Data actions.
     * 
     * @return the dataActions value.
     */
    public List<String> dataActions() {
        return this.dataActions;
    }

    /**
     * Set the dataActions property: Allowed Data actions.
     * 
     * @param dataActions the dataActions value to set.
     * @return the Permission object itself.
     */
    public Permission withDataActions(List<String> dataActions) {
        this.dataActions = dataActions;
        return this;
    }

    /**
     * Get the notDataActions property: Denied Data actions.
     * 
     * @return the notDataActions value.
     */
    public List<String> notDataActions() {
        return this.notDataActions;
    }

    /**
     * Set the notDataActions property: Denied Data actions.
     * 
     * @param notDataActions the notDataActions value to set.
     * @return the Permission object itself.
     */
    public Permission withNotDataActions(List<String> notDataActions) {
        this.notDataActions = notDataActions;
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
        jsonWriter.writeArrayField("actions", this.actions, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("notActions", this.notActions, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("dataActions", this.dataActions, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("notDataActions", this.notDataActions,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Permission from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Permission if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Permission.
     */
    public static Permission fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Permission deserializedPermission = new Permission();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("actions".equals(fieldName)) {
                    List<String> actions = reader.readArray(reader1 -> reader1.getString());
                    deserializedPermission.actions = actions;
                } else if ("notActions".equals(fieldName)) {
                    List<String> notActions = reader.readArray(reader1 -> reader1.getString());
                    deserializedPermission.notActions = notActions;
                } else if ("dataActions".equals(fieldName)) {
                    List<String> dataActions = reader.readArray(reader1 -> reader1.getString());
                    deserializedPermission.dataActions = dataActions;
                } else if ("notDataActions".equals(fieldName)) {
                    List<String> notDataActions = reader.readArray(reader1 -> reader1.getString());
                    deserializedPermission.notDataActions = notDataActions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPermission;
        });
    }
}
