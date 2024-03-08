// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The agent that initiated the event. For most situations, this could be from the authorization context of the
 * request.
 */
@Fluent
public final class ContainerRegistryEventActor implements JsonSerializable<ContainerRegistryEventActor> {
    /*
     * The subject or username associated with the request context that generated the event.
     */
    private String name;

    /**
     * Creates an instance of ContainerRegistryEventActor class.
     */
    public ContainerRegistryEventActor() {
    }

    /**
     * Get the name property: The subject or username associated with the request context that generated the event.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The subject or username associated with the request context that generated the event.
     * 
     * @param name the name value to set.
     * @return the ContainerRegistryEventActor object itself.
     */
    public ContainerRegistryEventActor setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContainerRegistryEventActor from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContainerRegistryEventActor if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ContainerRegistryEventActor.
     */
    public static ContainerRegistryEventActor fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContainerRegistryEventActor deserializedContainerRegistryEventActor = new ContainerRegistryEventActor();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedContainerRegistryEventActor.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContainerRegistryEventActor;
        });
    }
}
