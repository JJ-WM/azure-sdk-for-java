// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines the type of external storage. */
public final class RecordingStorageTypeInternal extends ExpandableStringEnum<RecordingStorageTypeInternal> {
    /** Static value acs for RecordingStorageTypeInternal. */
    public static final RecordingStorageTypeInternal ACS = fromString("acs");

    /** Static value blobStorage for RecordingStorageTypeInternal. */
    public static final RecordingStorageTypeInternal BLOB_STORAGE = fromString("blobStorage");

    /**
     * Creates a new instance of RecordingStorageTypeInternal value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RecordingStorageTypeInternal() {}

    /**
     * Creates or finds a RecordingStorageTypeInternal from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RecordingStorageTypeInternal.
     */
    @JsonCreator
    public static RecordingStorageTypeInternal fromString(String name) {
        return fromString(name, RecordingStorageTypeInternal.class);
    }

    /**
     * Gets known RecordingStorageTypeInternal values.
     *
     * @return known RecordingStorageTypeInternal values.
     */
    public static Collection<RecordingStorageTypeInternal> values() {
        return values(RecordingStorageTypeInternal.class);
    }
}
