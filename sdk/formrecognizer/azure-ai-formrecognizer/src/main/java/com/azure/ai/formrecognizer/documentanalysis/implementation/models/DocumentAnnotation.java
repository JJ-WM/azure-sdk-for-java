// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.ai.formrecognizer.documentanalysis.models.DocumentAnnotationKind;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An annotation object that represents a visual annotation in the document, such as checks ✓ and crosses X. */
@Immutable
public final class DocumentAnnotation {
    /*
     * Annotation kind.
     */
    @JsonProperty(value = "kind", required = true)
    private DocumentAnnotationKind kind;

    /*
     * Bounding polygon of the annotation.
     */
    @JsonProperty(value = "polygon", required = true)
    private List<Float> polygon;

    /*
     * Confidence of correctly extracting the annotation.
     */
    @JsonProperty(value = "confidence", required = true)
    private float confidence;

    /**
     * Creates an instance of DocumentAnnotation class.
     *
     * @param kind the kind value to set.
     * @param polygon the polygon value to set.
     * @param confidence the confidence value to set.
     */
    @JsonCreator
    private DocumentAnnotation(
            @JsonProperty(value = "kind", required = true) DocumentAnnotationKind kind,
            @JsonProperty(value = "polygon", required = true) List<Float> polygon,
            @JsonProperty(value = "confidence", required = true) float confidence) {
        this.kind = kind;
        this.polygon = polygon;
        this.confidence = confidence;
    }

    /**
     * Get the kind property: Annotation kind.
     *
     * @return the kind value.
     */
    public DocumentAnnotationKind getKind() {
        return this.kind;
    }

    /**
     * Get the polygon property: Bounding polygon of the annotation.
     *
     * @return the polygon value.
     */
    public List<Float> getPolygon() {
        return this.polygon;
    }

    /**
     * Get the confidence property: Confidence of correctly extracting the annotation.
     *
     * @return the confidence value.
     */
    public float getConfidence() {
        return this.confidence;
    }
}
