// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * An object representing a figure in the document.
 */
@Immutable
public final class DocumentFigure implements JsonSerializable<DocumentFigure> {
    /*
     * Bounding regions covering the figure.
     */
    @Generated
    private List<BoundingRegion> boundingRegions;

    /*
     * Location of the figure in the reading order concatenated content.
     */
    @Generated
    private final List<DocumentSpan> spans;

    /*
     * Child elements of the figure, excluding any caption or footnotes.
     */
    @Generated
    private List<String> elements;

    /*
     * Caption associated with the figure.
     */
    @Generated
    private DocumentCaption caption;

    /*
     * List of footnotes associated with the figure.
     */
    @Generated
    private List<DocumentFootnote> footnotes;

    /**
     * Creates an instance of DocumentFigure class.
     * 
     * @param spans the spans value to set.
     */
    @Generated
    private DocumentFigure(List<DocumentSpan> spans) {
        this.spans = spans;
    }

    /**
     * Get the boundingRegions property: Bounding regions covering the figure.
     * 
     * @return the boundingRegions value.
     */
    @Generated
    public List<BoundingRegion> getBoundingRegions() {
        return this.boundingRegions;
    }

    /**
     * Get the spans property: Location of the figure in the reading order concatenated content.
     * 
     * @return the spans value.
     */
    @Generated
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Get the elements property: Child elements of the figure, excluding any caption or footnotes.
     * 
     * @return the elements value.
     */
    @Generated
    public List<String> getElements() {
        return this.elements;
    }

    /**
     * Get the caption property: Caption associated with the figure.
     * 
     * @return the caption value.
     */
    @Generated
    public DocumentCaption getCaption() {
        return this.caption;
    }

    /**
     * Get the footnotes property: List of footnotes associated with the figure.
     * 
     * @return the footnotes value.
     */
    @Generated
    public List<DocumentFootnote> getFootnotes() {
        return this.footnotes;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("spans", this.spans, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("boundingRegions", this.boundingRegions,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("elements", this.elements, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("caption", this.caption);
        jsonWriter.writeArrayField("footnotes", this.footnotes, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DocumentFigure from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DocumentFigure if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DocumentFigure.
     */
    @Generated
    public static DocumentFigure fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<DocumentSpan> spans = null;
            List<BoundingRegion> boundingRegions = null;
            List<String> elements = null;
            DocumentCaption caption = null;
            List<DocumentFootnote> footnotes = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("spans".equals(fieldName)) {
                    spans = reader.readArray(reader1 -> DocumentSpan.fromJson(reader1));
                } else if ("boundingRegions".equals(fieldName)) {
                    boundingRegions = reader.readArray(reader1 -> BoundingRegion.fromJson(reader1));
                } else if ("elements".equals(fieldName)) {
                    elements = reader.readArray(reader1 -> reader1.getString());
                } else if ("caption".equals(fieldName)) {
                    caption = DocumentCaption.fromJson(reader);
                } else if ("footnotes".equals(fieldName)) {
                    footnotes = reader.readArray(reader1 -> DocumentFootnote.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            DocumentFigure deserializedDocumentFigure = new DocumentFigure(spans);
            deserializedDocumentFigure.boundingRegions = boundingRegions;
            deserializedDocumentFigure.elements = elements;
            deserializedDocumentFigure.caption = caption;
            deserializedDocumentFigure.footnotes = footnotes;

            return deserializedDocumentFigure;
        });
    }
}
