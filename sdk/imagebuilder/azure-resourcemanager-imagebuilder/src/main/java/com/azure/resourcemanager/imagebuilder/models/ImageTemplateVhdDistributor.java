// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/**
 * Distribute via VHD in a storage account.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("VHD")
@Fluent
public final class ImageTemplateVhdDistributor extends ImageTemplateDistributor {
    /*
     * Optional Azure Storage URI for the distributed VHD blob. Omit to use the default (empty string) in which case
     * VHD would be published to the storage account in the staging resource group.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /**
     * Creates an instance of ImageTemplateVhdDistributor class.
     */
    public ImageTemplateVhdDistributor() {
    }

    /**
     * Get the uri property: Optional Azure Storage URI for the distributed VHD blob. Omit to use the default (empty
     * string) in which case VHD would be published to the storage account in the staging resource group.
     * 
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: Optional Azure Storage URI for the distributed VHD blob. Omit to use the default (empty
     * string) in which case VHD would be published to the storage account in the staging resource group.
     * 
     * @param uri the uri value to set.
     * @return the ImageTemplateVhdDistributor object itself.
     */
    public ImageTemplateVhdDistributor withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageTemplateVhdDistributor withRunOutputName(String runOutputName) {
        super.withRunOutputName(runOutputName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageTemplateVhdDistributor withArtifactTags(Map<String, String> artifactTags) {
        super.withArtifactTags(artifactTags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
