// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Service mesh profile for a managed cluster.
 */
@Fluent
public final class ServiceMeshProfile implements JsonSerializable<ServiceMeshProfile> {
    /*
     * Mode of the service mesh.
     */
    private ServiceMeshMode mode;

    /*
     * Istio service mesh configuration.
     */
    private IstioServiceMesh istio;

    /**
     * Creates an instance of ServiceMeshProfile class.
     */
    public ServiceMeshProfile() {
    }

    /**
     * Get the mode property: Mode of the service mesh.
     * 
     * @return the mode value.
     */
    public ServiceMeshMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: Mode of the service mesh.
     * 
     * @param mode the mode value to set.
     * @return the ServiceMeshProfile object itself.
     */
    public ServiceMeshProfile withMode(ServiceMeshMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the istio property: Istio service mesh configuration.
     * 
     * @return the istio value.
     */
    public IstioServiceMesh istio() {
        return this.istio;
    }

    /**
     * Set the istio property: Istio service mesh configuration.
     * 
     * @param istio the istio value to set.
     * @return the ServiceMeshProfile object itself.
     */
    public ServiceMeshProfile withIstio(IstioServiceMesh istio) {
        this.istio = istio;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (mode() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property mode in model ServiceMeshProfile"));
        }
        if (istio() != null) {
            istio().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServiceMeshProfile.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("mode", this.mode == null ? null : this.mode.toString());
        jsonWriter.writeJsonField("istio", this.istio);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceMeshProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceMeshProfile if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ServiceMeshProfile.
     */
    public static ServiceMeshProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceMeshProfile deserializedServiceMeshProfile = new ServiceMeshProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("mode".equals(fieldName)) {
                    deserializedServiceMeshProfile.mode = ServiceMeshMode.fromString(reader.getString());
                } else if ("istio".equals(fieldName)) {
                    deserializedServiceMeshProfile.istio = IstioServiceMesh.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceMeshProfile;
        });
    }
}
