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
 * Schema of the Data property of an EventGridEvent for a Microsoft.ApiManagement.GatewayAPIAdded event.
 */
@Fluent
public final class ApiManagementGatewayApiAddedEventData
    implements JsonSerializable<ApiManagementGatewayApiAddedEventData> {
    /*
     * The fully qualified ID of the resource that the compliance state change is for, including the resource name and
     * resource type. Uses the format,
     * `/subscriptions/<SubscriptionID>/resourceGroups/<ResourceGroup>/Microsoft.ApiManagement/service/<ServiceName>/
     * gateways/<GatewayName>/apis/<ResourceName>`
     */
    private String resourceUri;

    /**
     * Creates an instance of ApiManagementGatewayApiAddedEventData class.
     */
    public ApiManagementGatewayApiAddedEventData() {
    }

    /**
     * Get the resourceUri property: The fully qualified ID of the resource that the compliance state change is for,
     * including the resource name and resource type. Uses the format,
     * `/subscriptions/&lt;SubscriptionID&gt;/resourceGroups/&lt;ResourceGroup&gt;/Microsoft.ApiManagement/service/&lt;ServiceName&gt;/gateways/&lt;GatewayName&gt;/apis/&lt;ResourceName&gt;`.
     * 
     * @return the resourceUri value.
     */
    public String getResourceUri() {
        return this.resourceUri;
    }

    /**
     * Set the resourceUri property: The fully qualified ID of the resource that the compliance state change is for,
     * including the resource name and resource type. Uses the format,
     * `/subscriptions/&lt;SubscriptionID&gt;/resourceGroups/&lt;ResourceGroup&gt;/Microsoft.ApiManagement/service/&lt;ServiceName&gt;/gateways/&lt;GatewayName&gt;/apis/&lt;ResourceName&gt;`.
     * 
     * @param resourceUri the resourceUri value to set.
     * @return the ApiManagementGatewayApiAddedEventData object itself.
     */
    public ApiManagementGatewayApiAddedEventData setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("resourceUri", this.resourceUri);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApiManagementGatewayApiAddedEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApiManagementGatewayApiAddedEventData if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApiManagementGatewayApiAddedEventData.
     */
    public static ApiManagementGatewayApiAddedEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApiManagementGatewayApiAddedEventData deserializedApiManagementGatewayApiAddedEventData
                = new ApiManagementGatewayApiAddedEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceUri".equals(fieldName)) {
                    deserializedApiManagementGatewayApiAddedEventData.resourceUri = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApiManagementGatewayApiAddedEventData;
        });
    }
}
