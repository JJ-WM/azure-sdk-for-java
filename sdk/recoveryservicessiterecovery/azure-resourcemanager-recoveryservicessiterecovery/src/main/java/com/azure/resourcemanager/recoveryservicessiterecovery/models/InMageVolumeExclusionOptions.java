// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Guest disk signature based disk exclusion option when doing enable protection of virtual machine in InMage provider.
 */
@Fluent
public final class InMageVolumeExclusionOptions {
    /*
     * The volume label. The disk having any volume with this label will be excluded from replication.
     */
    @JsonProperty(value = "volumeLabel")
    private String volumeLabel;

    /*
     * The value indicating whether to exclude multi volume disk or not. If a disk has multiple volumes and one of the
     * volume has label matching with VolumeLabel this disk will be excluded from replication if
     * OnlyExcludeIfSingleVolume is false.
     */
    @JsonProperty(value = "onlyExcludeIfSingleVolume")
    private String onlyExcludeIfSingleVolume;

    /**
     * Creates an instance of InMageVolumeExclusionOptions class.
     */
    public InMageVolumeExclusionOptions() {
    }

    /**
     * Get the volumeLabel property: The volume label. The disk having any volume with this label will be excluded from
     * replication.
     * 
     * @return the volumeLabel value.
     */
    public String volumeLabel() {
        return this.volumeLabel;
    }

    /**
     * Set the volumeLabel property: The volume label. The disk having any volume with this label will be excluded from
     * replication.
     * 
     * @param volumeLabel the volumeLabel value to set.
     * @return the InMageVolumeExclusionOptions object itself.
     */
    public InMageVolumeExclusionOptions withVolumeLabel(String volumeLabel) {
        this.volumeLabel = volumeLabel;
        return this;
    }

    /**
     * Get the onlyExcludeIfSingleVolume property: The value indicating whether to exclude multi volume disk or not. If
     * a disk has multiple volumes and one of the volume has label matching with VolumeLabel this disk will be excluded
     * from replication if OnlyExcludeIfSingleVolume is false.
     * 
     * @return the onlyExcludeIfSingleVolume value.
     */
    public String onlyExcludeIfSingleVolume() {
        return this.onlyExcludeIfSingleVolume;
    }

    /**
     * Set the onlyExcludeIfSingleVolume property: The value indicating whether to exclude multi volume disk or not. If
     * a disk has multiple volumes and one of the volume has label matching with VolumeLabel this disk will be excluded
     * from replication if OnlyExcludeIfSingleVolume is false.
     * 
     * @param onlyExcludeIfSingleVolume the onlyExcludeIfSingleVolume value to set.
     * @return the InMageVolumeExclusionOptions object itself.
     */
    public InMageVolumeExclusionOptions withOnlyExcludeIfSingleVolume(String onlyExcludeIfSingleVolume) {
        this.onlyExcludeIfSingleVolume = onlyExcludeIfSingleVolume;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
