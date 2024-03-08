// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.communication.jobrouter;

import com.azure.core.util.ServiceVersion;

/**
 * Service version of JobRouterClient.
 */
public enum JobRouterServiceVersion implements ServiceVersion {
    /**
     * Enum value 2023-11-01.
     */
    V2023_11_01("2023-11-01"),

    /**
     * Enum value 2024-01-18-preview.
     */
    V2024_01_18_PREVIEW("2024-01-18-preview");

    private final String version;

    JobRouterServiceVersion(String version) {
        this.version = version;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     * 
     * @return The latest {@link JobRouterServiceVersion}.
     */
    public static JobRouterServiceVersion getLatest() {
        return V2024_01_18_PREVIEW;
    }
}
