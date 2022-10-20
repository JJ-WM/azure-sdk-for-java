// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting;

import com.azure.core.util.ServiceVersion;

/** Service version of LoadTestingClient. */
public enum LoadTestingServiceVersion implements ServiceVersion {
    /** Enum value 2022-06-01-preview. */
    V2022_06_01_PREVIEW("2022-06-01-preview");

    private final String version;

    LoadTestingServiceVersion(String version) {
        this.version = version;
    }

    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link LoadTestingServiceVersion}.
     */
    public static LoadTestingServiceVersion getLatest() {
        return V2022_06_01_PREVIEW;
    }
}
