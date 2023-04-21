// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Kubernetes version profile for given major.minor release. */
@Fluent
public final class KubernetesVersion {
    /*
     * major.minor version of Kubernetes release
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * Capabilities on this Kubernetes version.
     */
    @JsonProperty(value = "capabilities")
    private KubernetesVersionCapabilities capabilities;

    /*
     * Whether this version is in preview mode.
     */
    @JsonProperty(value = "isPreview")
    private Boolean isPreview;

    /*
     * Patch versions of Kubernetes release
     */
    @JsonProperty(value = "patchVersions")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, KubernetesPatchVersion> patchVersions;

    /** Creates an instance of KubernetesVersion class. */
    public KubernetesVersion() {
    }

    /**
     * Get the version property: major.minor version of Kubernetes release.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: major.minor version of Kubernetes release.
     *
     * @param version the version value to set.
     * @return the KubernetesVersion object itself.
     */
    public KubernetesVersion withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the capabilities property: Capabilities on this Kubernetes version.
     *
     * @return the capabilities value.
     */
    public KubernetesVersionCapabilities capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: Capabilities on this Kubernetes version.
     *
     * @param capabilities the capabilities value to set.
     * @return the KubernetesVersion object itself.
     */
    public KubernetesVersion withCapabilities(KubernetesVersionCapabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the isPreview property: Whether this version is in preview mode.
     *
     * @return the isPreview value.
     */
    public Boolean isPreview() {
        return this.isPreview;
    }

    /**
     * Set the isPreview property: Whether this version is in preview mode.
     *
     * @param isPreview the isPreview value to set.
     * @return the KubernetesVersion object itself.
     */
    public KubernetesVersion withIsPreview(Boolean isPreview) {
        this.isPreview = isPreview;
        return this;
    }

    /**
     * Get the patchVersions property: Patch versions of Kubernetes release.
     *
     * @return the patchVersions value.
     */
    public Map<String, KubernetesPatchVersion> patchVersions() {
        return this.patchVersions;
    }

    /**
     * Set the patchVersions property: Patch versions of Kubernetes release.
     *
     * @param patchVersions the patchVersions value to set.
     * @return the KubernetesVersion object itself.
     */
    public KubernetesVersion withPatchVersions(Map<String, KubernetesPatchVersion> patchVersions) {
        this.patchVersions = patchVersions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capabilities() != null) {
            capabilities().validate();
        }
        if (patchVersions() != null) {
            patchVersions()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}