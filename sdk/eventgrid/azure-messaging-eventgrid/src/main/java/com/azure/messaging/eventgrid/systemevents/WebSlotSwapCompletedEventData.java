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
 * Schema of the Data property of an EventGridEvent for a Microsoft.Web.SlotSwapCompleted event.
 */
@Fluent
public final class WebSlotSwapCompletedEventData implements JsonSerializable<WebSlotSwapCompletedEventData> {
    /*
     * Detail of action on the app.
     */
    private AppEventTypeDetail appEventTypeDetail;

    /*
     * name of the web site that had this event.
     */
    private String name;

    /*
     * The client request id generated by the app service for the site API operation that triggered this event.
     */
    private String clientRequestId;

    /*
     * The correlation request id generated by the app service for the site API operation that triggered this event.
     */
    private String correlationRequestId;

    /*
     * The request id generated by the app service for the site API operation that triggered this event.
     */
    private String requestId;

    /*
     * HTTP request URL of this operation.
     */
    private String address;

    /*
     * HTTP verb of this operation.
     */
    private String verb;

    /**
     * Creates an instance of WebSlotSwapCompletedEventData class.
     */
    public WebSlotSwapCompletedEventData() {
    }

    /**
     * Get the appEventTypeDetail property: Detail of action on the app.
     * 
     * @return the appEventTypeDetail value.
     */
    public AppEventTypeDetail getAppEventTypeDetail() {
        return this.appEventTypeDetail;
    }

    /**
     * Set the appEventTypeDetail property: Detail of action on the app.
     * 
     * @param appEventTypeDetail the appEventTypeDetail value to set.
     * @return the WebSlotSwapCompletedEventData object itself.
     */
    public WebSlotSwapCompletedEventData setAppEventTypeDetail(AppEventTypeDetail appEventTypeDetail) {
        this.appEventTypeDetail = appEventTypeDetail;
        return this;
    }

    /**
     * Get the name property: name of the web site that had this event.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: name of the web site that had this event.
     * 
     * @param name the name value to set.
     * @return the WebSlotSwapCompletedEventData object itself.
     */
    public WebSlotSwapCompletedEventData setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the clientRequestId property: The client request id generated by the app service for the site API operation
     * that triggered this event.
     * 
     * @return the clientRequestId value.
     */
    public String getClientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId property: The client request id generated by the app service for the site API operation
     * that triggered this event.
     * 
     * @param clientRequestId the clientRequestId value to set.
     * @return the WebSlotSwapCompletedEventData object itself.
     */
    public WebSlotSwapCompletedEventData setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the correlationRequestId property: The correlation request id generated by the app service for the site API
     * operation that triggered this event.
     * 
     * @return the correlationRequestId value.
     */
    public String getCorrelationRequestId() {
        return this.correlationRequestId;
    }

    /**
     * Set the correlationRequestId property: The correlation request id generated by the app service for the site API
     * operation that triggered this event.
     * 
     * @param correlationRequestId the correlationRequestId value to set.
     * @return the WebSlotSwapCompletedEventData object itself.
     */
    public WebSlotSwapCompletedEventData setCorrelationRequestId(String correlationRequestId) {
        this.correlationRequestId = correlationRequestId;
        return this;
    }

    /**
     * Get the requestId property: The request id generated by the app service for the site API operation that
     * triggered this event.
     * 
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: The request id generated by the app service for the site API operation that
     * triggered this event.
     * 
     * @param requestId the requestId value to set.
     * @return the WebSlotSwapCompletedEventData object itself.
     */
    public WebSlotSwapCompletedEventData setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the address property: HTTP request URL of this operation.
     * 
     * @return the address value.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Set the address property: HTTP request URL of this operation.
     * 
     * @param address the address value to set.
     * @return the WebSlotSwapCompletedEventData object itself.
     */
    public WebSlotSwapCompletedEventData setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the verb property: HTTP verb of this operation.
     * 
     * @return the verb value.
     */
    public String getVerb() {
        return this.verb;
    }

    /**
     * Set the verb property: HTTP verb of this operation.
     * 
     * @param verb the verb value to set.
     * @return the WebSlotSwapCompletedEventData object itself.
     */
    public WebSlotSwapCompletedEventData setVerb(String verb) {
        this.verb = verb;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("appEventTypeDetail", this.appEventTypeDetail);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("clientRequestId", this.clientRequestId);
        jsonWriter.writeStringField("correlationRequestId", this.correlationRequestId);
        jsonWriter.writeStringField("requestId", this.requestId);
        jsonWriter.writeStringField("address", this.address);
        jsonWriter.writeStringField("verb", this.verb);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WebSlotSwapCompletedEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WebSlotSwapCompletedEventData if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WebSlotSwapCompletedEventData.
     */
    public static WebSlotSwapCompletedEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WebSlotSwapCompletedEventData deserializedWebSlotSwapCompletedEventData
                = new WebSlotSwapCompletedEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("appEventTypeDetail".equals(fieldName)) {
                    deserializedWebSlotSwapCompletedEventData.appEventTypeDetail = AppEventTypeDetail.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedWebSlotSwapCompletedEventData.name = reader.getString();
                } else if ("clientRequestId".equals(fieldName)) {
                    deserializedWebSlotSwapCompletedEventData.clientRequestId = reader.getString();
                } else if ("correlationRequestId".equals(fieldName)) {
                    deserializedWebSlotSwapCompletedEventData.correlationRequestId = reader.getString();
                } else if ("requestId".equals(fieldName)) {
                    deserializedWebSlotSwapCompletedEventData.requestId = reader.getString();
                } else if ("address".equals(fieldName)) {
                    deserializedWebSlotSwapCompletedEventData.address = reader.getString();
                } else if ("verb".equals(fieldName)) {
                    deserializedWebSlotSwapCompletedEventData.verb = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWebSlotSwapCompletedEventData;
        });
    }
}
