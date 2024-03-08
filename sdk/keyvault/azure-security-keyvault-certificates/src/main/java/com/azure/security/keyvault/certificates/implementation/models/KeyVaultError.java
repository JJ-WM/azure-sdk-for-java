// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.certificates.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.security.keyvault.certificates.models.CertificateOperationError;
import java.io.IOException;

/** The key vault error exception. */
@Immutable
public final class KeyVaultError implements JsonSerializable<KeyVaultError> {
    /*
     * The key vault server error.
     */
    private CertificateOperationError error;

    /** Creates an instance of KeyVaultError class. */
    public KeyVaultError() {}

    /**
     * Get the error property: The key vault server error.
     *
     * @return the error value.
     */
    public CertificateOperationError getError() {
        return this.error;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyVaultError from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyVaultError if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IOException If an error occurs while reading the KeyVaultError.
     */
    public static KeyVaultError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    KeyVaultError deserializedKeyVaultError = new KeyVaultError();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("error".equals(fieldName)) {
                            deserializedKeyVaultError.error = CertificateOperationError.fromJson(reader);
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedKeyVaultError;
                });
    }
}
