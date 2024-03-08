// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Response from a get service statistics request. If successful, it includes service level counters and limits.
 */
@Immutable
public final class SearchServiceStatistics implements JsonSerializable<SearchServiceStatistics> {
    /*
     * Service level resource counters.
     */
    private final SearchServiceCounters counters;

    /*
     * Service level general limits.
     */
    private final SearchServiceLimits limits;

    /**
     * Creates an instance of SearchServiceStatistics class.
     * 
     * @param counters the counters value to set.
     * @param limits the limits value to set.
     */
    public SearchServiceStatistics(SearchServiceCounters counters, SearchServiceLimits limits) {
        this.counters = counters;
        this.limits = limits;
    }

    /**
     * Get the counters property: Service level resource counters.
     * 
     * @return the counters value.
     */
    public SearchServiceCounters getCounters() {
        return this.counters;
    }

    /**
     * Get the limits property: Service level general limits.
     * 
     * @return the limits value.
     */
    public SearchServiceLimits getLimits() {
        return this.limits;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("counters", this.counters);
        jsonWriter.writeJsonField("limits", this.limits);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchServiceStatistics from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchServiceStatistics if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SearchServiceStatistics.
     */
    public static SearchServiceStatistics fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean countersFound = false;
            SearchServiceCounters counters = null;
            boolean limitsFound = false;
            SearchServiceLimits limits = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("counters".equals(fieldName)) {
                    counters = SearchServiceCounters.fromJson(reader);
                    countersFound = true;
                } else if ("limits".equals(fieldName)) {
                    limits = SearchServiceLimits.fromJson(reader);
                    limitsFound = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (countersFound && limitsFound) {
                return new SearchServiceStatistics(counters, limits);
            }
            List<String> missingProperties = new ArrayList<>();
            if (!countersFound) {
                missingProperties.add("counters");
            }
            if (!limitsFound) {
                missingProperties.add("limits");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
