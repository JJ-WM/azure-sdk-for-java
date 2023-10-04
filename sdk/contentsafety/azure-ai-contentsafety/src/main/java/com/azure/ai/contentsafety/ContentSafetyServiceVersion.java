// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.contentsafety;

import com.azure.core.util.ServiceVersion;

/** Service version of ContentSafetyClient. */
public enum ContentSafetyServiceVersion implements ServiceVersion {
    /** Enum value 2023-04-30-preview. */
    V2023_04_30_PREVIEW("2023-04-30-preview");

    private final String version;

    ContentSafetyServiceVersion(String version) {
        this.version = version;
    }

    /** {@inheritDoc} */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link ContentSafetyServiceVersion}.
     */
    public static ContentSafetyServiceVersion getLatest() {
        return V2023_04_30_PREVIEW;
    }
}
