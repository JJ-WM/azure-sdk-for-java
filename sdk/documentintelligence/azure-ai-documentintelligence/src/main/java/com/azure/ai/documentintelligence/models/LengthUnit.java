// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The unit used by the width, height, and polygon properties. For images, the unit is "pixel". For PDF, the unit is
 * "inch".
 */
public final class LengthUnit extends ExpandableStringEnum<LengthUnit> {
    /**
     * Length unit for image files.
     */
    @Generated
    public static final LengthUnit PIXEL = fromString("pixel");

    /**
     * Length unit for PDF files.
     */
    @Generated
    public static final LengthUnit INCH = fromString("inch");

    /**
     * Creates a new instance of LengthUnit value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public LengthUnit() {
    }

    /**
     * Creates or finds a LengthUnit from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LengthUnit.
     */
    @Generated
    public static LengthUnit fromString(String name) {
        return fromString(name, LengthUnit.class);
    }

    /**
     * Gets known LengthUnit values.
     * 
     * @return known LengthUnit values.
     */
    @Generated
    public static Collection<LengthUnit> values() {
        return values(LengthUnit.class);
    }
}
