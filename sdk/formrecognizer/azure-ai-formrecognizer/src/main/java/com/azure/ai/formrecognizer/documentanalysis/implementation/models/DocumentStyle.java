// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.ai.formrecognizer.documentanalysis.models.FontStyle;
import com.azure.ai.formrecognizer.documentanalysis.models.FontWeight;
import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object representing observed text styles.
 */
@Fluent
public final class DocumentStyle implements JsonSerializable<DocumentStyle> {
    /*
     * Is content handwritten?
     */
    private Boolean isHandwritten;

    /*
     * Visually most similar font from among the set of supported font families, with fallback fonts following CSS
     * convention (ex. 'Arial, sans-serif').
     */
    private String similarFontFamily;

    /*
     * Font style.
     */
    private FontStyle fontStyle;

    /*
     * Font weight.
     */
    private FontWeight fontWeight;

    /*
     * Foreground color in #rrggbb hexadecimal format.
     */
    private String color;

    /*
     * Background color in #rrggbb hexadecimal format..
     */
    private String backgroundColor;

    /*
     * Location of the text elements in the concatenated content the style applies to.
     */
    private final List<DocumentSpan> spans;

    /*
     * Confidence of correctly identifying the style.
     */
    private final float confidence;

    /**
     * Creates an instance of DocumentStyle class.
     * 
     * @param spans the spans value to set.
     * @param confidence the confidence value to set.
     */
    public DocumentStyle(List<DocumentSpan> spans, float confidence) {
        this.spans = spans;
        this.confidence = confidence;
    }

    /**
     * Get the isHandwritten property: Is content handwritten?.
     * 
     * @return the isHandwritten value.
     */
    public Boolean isHandwritten() {
        return this.isHandwritten;
    }

    /**
     * Set the isHandwritten property: Is content handwritten?.
     * 
     * @param isHandwritten the isHandwritten value to set.
     * @return the DocumentStyle object itself.
     */
    public DocumentStyle setIsHandwritten(Boolean isHandwritten) {
        this.isHandwritten = isHandwritten;
        return this;
    }

    /**
     * Get the similarFontFamily property: Visually most similar font from among the set of supported font families,
     * with fallback fonts following CSS convention (ex. 'Arial, sans-serif').
     * 
     * @return the similarFontFamily value.
     */
    public String getSimilarFontFamily() {
        return this.similarFontFamily;
    }

    /**
     * Set the similarFontFamily property: Visually most similar font from among the set of supported font families,
     * with fallback fonts following CSS convention (ex. 'Arial, sans-serif').
     * 
     * @param similarFontFamily the similarFontFamily value to set.
     * @return the DocumentStyle object itself.
     */
    public DocumentStyle setSimilarFontFamily(String similarFontFamily) {
        this.similarFontFamily = similarFontFamily;
        return this;
    }

    /**
     * Get the fontStyle property: Font style.
     * 
     * @return the fontStyle value.
     */
    public FontStyle getFontStyle() {
        return this.fontStyle;
    }

    /**
     * Set the fontStyle property: Font style.
     * 
     * @param fontStyle the fontStyle value to set.
     * @return the DocumentStyle object itself.
     */
    public DocumentStyle setFontStyle(FontStyle fontStyle) {
        this.fontStyle = fontStyle;
        return this;
    }

    /**
     * Get the fontWeight property: Font weight.
     * 
     * @return the fontWeight value.
     */
    public FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /**
     * Set the fontWeight property: Font weight.
     * 
     * @param fontWeight the fontWeight value to set.
     * @return the DocumentStyle object itself.
     */
    public DocumentStyle setFontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
        return this;
    }

    /**
     * Get the color property: Foreground color in #rrggbb hexadecimal format.
     * 
     * @return the color value.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Set the color property: Foreground color in #rrggbb hexadecimal format.
     * 
     * @param color the color value to set.
     * @return the DocumentStyle object itself.
     */
    public DocumentStyle setColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * Get the backgroundColor property: Background color in #rrggbb hexadecimal format..
     * 
     * @return the backgroundColor value.
     */
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    /**
     * Set the backgroundColor property: Background color in #rrggbb hexadecimal format..
     * 
     * @param backgroundColor the backgroundColor value to set.
     * @return the DocumentStyle object itself.
     */
    public DocumentStyle setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    /**
     * Get the spans property: Location of the text elements in the concatenated content the style applies to.
     * 
     * @return the spans value.
     */
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Get the confidence property: Confidence of correctly identifying the style.
     * 
     * @return the confidence value.
     */
    public float getConfidence() {
        return this.confidence;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("spans", this.spans, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeFloatField("confidence", this.confidence);
        jsonWriter.writeBooleanField("isHandwritten", this.isHandwritten);
        jsonWriter.writeStringField("similarFontFamily", this.similarFontFamily);
        jsonWriter.writeStringField("fontStyle", this.fontStyle == null ? null : this.fontStyle.toString());
        jsonWriter.writeStringField("fontWeight", this.fontWeight == null ? null : this.fontWeight.toString());
        jsonWriter.writeStringField("color", this.color);
        jsonWriter.writeStringField("backgroundColor", this.backgroundColor);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DocumentStyle from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DocumentStyle if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DocumentStyle.
     */
    public static DocumentStyle fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean spansFound = false;
            List<DocumentSpan> spans = null;
            boolean confidenceFound = false;
            float confidence = 0.0f;
            Boolean isHandwritten = null;
            String similarFontFamily = null;
            FontStyle fontStyle = null;
            FontWeight fontWeight = null;
            String color = null;
            String backgroundColor = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("spans".equals(fieldName)) {
                    spans = reader.readArray(reader1 -> DocumentSpan.fromJson(reader1));
                    spansFound = true;
                } else if ("confidence".equals(fieldName)) {
                    confidence = reader.getFloat();
                    confidenceFound = true;
                } else if ("isHandwritten".equals(fieldName)) {
                    isHandwritten = reader.getNullable(JsonReader::getBoolean);
                } else if ("similarFontFamily".equals(fieldName)) {
                    similarFontFamily = reader.getString();
                } else if ("fontStyle".equals(fieldName)) {
                    fontStyle = FontStyle.fromString(reader.getString());
                } else if ("fontWeight".equals(fieldName)) {
                    fontWeight = FontWeight.fromString(reader.getString());
                } else if ("color".equals(fieldName)) {
                    color = reader.getString();
                } else if ("backgroundColor".equals(fieldName)) {
                    backgroundColor = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            if (spansFound && confidenceFound) {
                DocumentStyle deserializedDocumentStyle = new DocumentStyle(spans, confidence);
                deserializedDocumentStyle.isHandwritten = isHandwritten;
                deserializedDocumentStyle.similarFontFamily = similarFontFamily;
                deserializedDocumentStyle.fontStyle = fontStyle;
                deserializedDocumentStyle.fontWeight = fontWeight;
                deserializedDocumentStyle.color = color;
                deserializedDocumentStyle.backgroundColor = backgroundColor;

                return deserializedDocumentStyle;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!spansFound) {
                missingProperties.add("spans");
            }
            if (!confidenceFound) {
                missingProperties.add("confidence");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
