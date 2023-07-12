// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The week index.
 *
 * <p>Specifies on which week of the month the dayOfWeek applies.
 */
public final class Type extends ExpandableStringEnum<Type> {
    /** Static value First for Type. */
    public static final Type FIRST = fromString("First");

    /** Static value Second for Type. */
    public static final Type SECOND = fromString("Second");

    /** Static value Third for Type. */
    public static final Type THIRD = fromString("Third");

    /** Static value Fourth for Type. */
    public static final Type FOURTH = fromString("Fourth");

    /** Static value Last for Type. */
    public static final Type LAST = fromString("Last");

    /**
     * Creates a new instance of Type value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Type() {
    }

    /**
     * Creates or finds a Type from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Type.
     */
    @JsonCreator
    public static Type fromString(String name) {
        return fromString(name, Type.class);
    }

    /**
     * Gets known Type values.
     *
     * @return known Type values.
     */
    public static Collection<Type> values() {
        return values(Type.class);
    }
}
