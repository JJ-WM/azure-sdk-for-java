// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Describes image deprecation status properties on the image.
 */
@Fluent
public final class ImageDeprecationStatus {
    /*
     * Describes the state of the image.
     */
    @JsonProperty(value = "imageState")
    private ImageState imageState;

    /*
     * The time, in future, at which this image will be marked as deprecated. This scheduled time is chosen by the
     * Publisher.
     */
    @JsonProperty(value = "scheduledDeprecationTime")
    private OffsetDateTime scheduledDeprecationTime;

    /*
     * Describes the alternative option specified by the Publisher for this image when this image is deprecated.
     */
    @JsonProperty(value = "alternativeOption")
    private AlternativeOption alternativeOption;

    /**
     * Creates an instance of ImageDeprecationStatus class.
     */
    public ImageDeprecationStatus() {
    }

    /**
     * Get the imageState property: Describes the state of the image.
     * 
     * @return the imageState value.
     */
    public ImageState imageState() {
        return this.imageState;
    }

    /**
     * Set the imageState property: Describes the state of the image.
     * 
     * @param imageState the imageState value to set.
     * @return the ImageDeprecationStatus object itself.
     */
    public ImageDeprecationStatus withImageState(ImageState imageState) {
        this.imageState = imageState;
        return this;
    }

    /**
     * Get the scheduledDeprecationTime property: The time, in future, at which this image will be marked as
     * deprecated. This scheduled time is chosen by the Publisher.
     * 
     * @return the scheduledDeprecationTime value.
     */
    public OffsetDateTime scheduledDeprecationTime() {
        return this.scheduledDeprecationTime;
    }

    /**
     * Set the scheduledDeprecationTime property: The time, in future, at which this image will be marked as
     * deprecated. This scheduled time is chosen by the Publisher.
     * 
     * @param scheduledDeprecationTime the scheduledDeprecationTime value to set.
     * @return the ImageDeprecationStatus object itself.
     */
    public ImageDeprecationStatus withScheduledDeprecationTime(OffsetDateTime scheduledDeprecationTime) {
        this.scheduledDeprecationTime = scheduledDeprecationTime;
        return this;
    }

    /**
     * Get the alternativeOption property: Describes the alternative option specified by the Publisher for this image
     * when this image is deprecated.
     * 
     * @return the alternativeOption value.
     */
    public AlternativeOption alternativeOption() {
        return this.alternativeOption;
    }

    /**
     * Set the alternativeOption property: Describes the alternative option specified by the Publisher for this image
     * when this image is deprecated.
     * 
     * @param alternativeOption the alternativeOption value to set.
     * @return the ImageDeprecationStatus object itself.
     */
    public ImageDeprecationStatus withAlternativeOption(AlternativeOption alternativeOption) {
        this.alternativeOption = alternativeOption;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (alternativeOption() != null) {
            alternativeOption().validate();
        }
    }
}
