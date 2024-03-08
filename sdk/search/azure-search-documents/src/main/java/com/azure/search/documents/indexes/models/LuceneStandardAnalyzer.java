// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Standard Apache Lucene analyzer; Composed of the standard tokenizer, lowercase filter and stop filter.
 */
@Fluent
public final class LuceneStandardAnalyzer extends LexicalAnalyzer {

    /*
     * The maximum token length. Default is 255. Tokens longer than the maximum length are split. The maximum token
     * length that can be used is 300 characters.
     */
    private Integer maxTokenLength;

    /*
     * A list of stopwords.
     */
    private List<String> stopwords;

    /**
     * Creates an instance of LuceneStandardAnalyzer class.
     *
     * @param name the name value to set.
     */
    public LuceneStandardAnalyzer(String name) {
        super(name);
    }

    /**
     * Get the maxTokenLength property: The maximum token length. Default is 255. Tokens longer than the maximum length
     * are split. The maximum token length that can be used is 300 characters.
     *
     * @return the maxTokenLength value.
     */
    public Integer getMaxTokenLength() {
        return this.maxTokenLength;
    }

    /**
     * Set the maxTokenLength property: The maximum token length. Default is 255. Tokens longer than the maximum length
     * are split. The maximum token length that can be used is 300 characters.
     *
     * @param maxTokenLength the maxTokenLength value to set.
     * @return the LuceneStandardAnalyzer object itself.
     */
    public LuceneStandardAnalyzer setMaxTokenLength(Integer maxTokenLength) {
        this.maxTokenLength = maxTokenLength;
        return this;
    }

    /**
     * Get the stopwords property: A list of stopwords.
     *
     * @return the stopwords value.
     */
    public List<String> getStopwords() {
        return this.stopwords;
    }

    /**
     * Set the stopwords property: A list of stopwords.
     *
     * @param stopwords the stopwords value to set.
     * @return the LuceneStandardAnalyzer object itself.
     */
    public LuceneStandardAnalyzer setStopwords(List<String> stopwords) {
        this.stopwords = stopwords;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", "#Microsoft.Azure.Search.StandardAnalyzer");
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeNumberField("maxTokenLength", this.maxTokenLength);
        jsonWriter.writeArrayField("stopwords", this.stopwords, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LuceneStandardAnalyzer from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of LuceneStandardAnalyzer if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the LuceneStandardAnalyzer.
     */
    public static LuceneStandardAnalyzer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            Integer maxTokenLength = null;
            List<String> stopwords = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("@odata.type".equals(fieldName)) {
                    String odataType = reader.getString();
                    if (!"#Microsoft.Azure.Search.StandardAnalyzer".equals(odataType)) {
                        throw new IllegalStateException(
                            "'@odata.type' was expected to be non-null and equal to '#Microsoft.Azure.Search.StandardAnalyzer'. The found '@odata.type' was '"
                                + odataType + "'.");
                    }
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("maxTokenLength".equals(fieldName)) {
                    maxTokenLength = reader.getNullable(JsonReader::getInt);
                } else if ("stopwords".equals(fieldName)) {
                    stopwords = reader.readArray(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound) {
                LuceneStandardAnalyzer deserializedLuceneStandardAnalyzer = new LuceneStandardAnalyzer(name);
                deserializedLuceneStandardAnalyzer.maxTokenLength = maxTokenLength;
                deserializedLuceneStandardAnalyzer.stopwords = stopwords;
                return deserializedLuceneStandardAnalyzer;
            }
            throw new IllegalStateException("Missing required property: name");
        });
    }

    /**
     * Set the stopwords property: A list of stopwords.
     *
     * @param stopwords the stopwords value to set.
     * @return the LuceneStandardAnalyzer object itself.
     */
    public LuceneStandardAnalyzer setStopwords(String... stopwords) {
        this.stopwords = (stopwords == null) ? null : java.util.Arrays.asList(stopwords);
        return this;
    }
}
