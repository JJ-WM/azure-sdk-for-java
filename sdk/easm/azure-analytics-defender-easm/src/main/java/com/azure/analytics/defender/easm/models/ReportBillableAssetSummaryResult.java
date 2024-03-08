// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ReportBillableAssetSummaryResult model.
 */
@Immutable
public final class ReportBillableAssetSummaryResult {

    /*
     * The assetSummaries property.
     */
    @Generated
    @JsonProperty(value = "assetSummaries")
    private List<ReportBillableAssetSnapshotResult> assetSummaries;

    /**
     * Creates an instance of ReportBillableAssetSummaryResult class.
     */
    @Generated
    private ReportBillableAssetSummaryResult() {
    }

    /**
     * Get the assetSummaries property: The assetSummaries property.
     *
     * @return the assetSummaries value.
     */
    @Generated
    public List<ReportBillableAssetSnapshotResult> getAssetSummaries() {
        return this.assetSummaries;
    }
}
