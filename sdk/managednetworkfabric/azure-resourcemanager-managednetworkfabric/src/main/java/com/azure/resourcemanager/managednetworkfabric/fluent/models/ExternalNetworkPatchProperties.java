// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managednetworkfabric.models.AnnotationResource;
import com.azure.resourcemanager.managednetworkfabric.models.ExportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.ExternalNetworkPatchPropertiesOptionAProperties;
import com.azure.resourcemanager.managednetworkfabric.models.ImportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.L3OptionBProperties;
import com.azure.resourcemanager.managednetworkfabric.models.PeeringOption;
import com.fasterxml.jackson.annotation.JsonProperty;

/** External Network Patch properties. */
@Fluent
public final class ExternalNetworkPatchProperties extends AnnotationResource {
    /*
     * Peering option list.
     */
    @JsonProperty(value = "peeringOption")
    private PeeringOption peeringOption;

    /*
     * option B properties object
     */
    @JsonProperty(value = "optionBProperties")
    private L3OptionBProperties optionBProperties;

    /*
     * option A properties object
     */
    @JsonProperty(value = "optionAProperties")
    private ExternalNetworkPatchPropertiesOptionAProperties optionAProperties;

    /*
     * ARM Resource ID of the RoutePolicy. This is used for the backward compatibility.
     */
    @JsonProperty(value = "importRoutePolicyId")
    private String importRoutePolicyId;

    /*
     * ARM Resource ID of the RoutePolicy. This is used for the backward compatibility.
     */
    @JsonProperty(value = "exportRoutePolicyId")
    private String exportRoutePolicyId;

    /*
     * Import Route Policy either IPv4 or IPv6.
     */
    @JsonProperty(value = "importRoutePolicy")
    private ImportRoutePolicy importRoutePolicy;

    /*
     * Export Route Policy either IPv4 or IPv6.
     */
    @JsonProperty(value = "exportRoutePolicy")
    private ExportRoutePolicy exportRoutePolicy;

    /** Creates an instance of ExternalNetworkPatchProperties class. */
    public ExternalNetworkPatchProperties() {
    }

    /**
     * Get the peeringOption property: Peering option list.
     *
     * @return the peeringOption value.
     */
    public PeeringOption peeringOption() {
        return this.peeringOption;
    }

    /**
     * Set the peeringOption property: Peering option list.
     *
     * @param peeringOption the peeringOption value to set.
     * @return the ExternalNetworkPatchProperties object itself.
     */
    public ExternalNetworkPatchProperties withPeeringOption(PeeringOption peeringOption) {
        this.peeringOption = peeringOption;
        return this;
    }

    /**
     * Get the optionBProperties property: option B properties object.
     *
     * @return the optionBProperties value.
     */
    public L3OptionBProperties optionBProperties() {
        return this.optionBProperties;
    }

    /**
     * Set the optionBProperties property: option B properties object.
     *
     * @param optionBProperties the optionBProperties value to set.
     * @return the ExternalNetworkPatchProperties object itself.
     */
    public ExternalNetworkPatchProperties withOptionBProperties(L3OptionBProperties optionBProperties) {
        this.optionBProperties = optionBProperties;
        return this;
    }

    /**
     * Get the optionAProperties property: option A properties object.
     *
     * @return the optionAProperties value.
     */
    public ExternalNetworkPatchPropertiesOptionAProperties optionAProperties() {
        return this.optionAProperties;
    }

    /**
     * Set the optionAProperties property: option A properties object.
     *
     * @param optionAProperties the optionAProperties value to set.
     * @return the ExternalNetworkPatchProperties object itself.
     */
    public ExternalNetworkPatchProperties withOptionAProperties(
        ExternalNetworkPatchPropertiesOptionAProperties optionAProperties) {
        this.optionAProperties = optionAProperties;
        return this;
    }

    /**
     * Get the importRoutePolicyId property: ARM Resource ID of the RoutePolicy. This is used for the backward
     * compatibility.
     *
     * @return the importRoutePolicyId value.
     */
    public String importRoutePolicyId() {
        return this.importRoutePolicyId;
    }

    /**
     * Set the importRoutePolicyId property: ARM Resource ID of the RoutePolicy. This is used for the backward
     * compatibility.
     *
     * @param importRoutePolicyId the importRoutePolicyId value to set.
     * @return the ExternalNetworkPatchProperties object itself.
     */
    public ExternalNetworkPatchProperties withImportRoutePolicyId(String importRoutePolicyId) {
        this.importRoutePolicyId = importRoutePolicyId;
        return this;
    }

    /**
     * Get the exportRoutePolicyId property: ARM Resource ID of the RoutePolicy. This is used for the backward
     * compatibility.
     *
     * @return the exportRoutePolicyId value.
     */
    public String exportRoutePolicyId() {
        return this.exportRoutePolicyId;
    }

    /**
     * Set the exportRoutePolicyId property: ARM Resource ID of the RoutePolicy. This is used for the backward
     * compatibility.
     *
     * @param exportRoutePolicyId the exportRoutePolicyId value to set.
     * @return the ExternalNetworkPatchProperties object itself.
     */
    public ExternalNetworkPatchProperties withExportRoutePolicyId(String exportRoutePolicyId) {
        this.exportRoutePolicyId = exportRoutePolicyId;
        return this;
    }

    /**
     * Get the importRoutePolicy property: Import Route Policy either IPv4 or IPv6.
     *
     * @return the importRoutePolicy value.
     */
    public ImportRoutePolicy importRoutePolicy() {
        return this.importRoutePolicy;
    }

    /**
     * Set the importRoutePolicy property: Import Route Policy either IPv4 or IPv6.
     *
     * @param importRoutePolicy the importRoutePolicy value to set.
     * @return the ExternalNetworkPatchProperties object itself.
     */
    public ExternalNetworkPatchProperties withImportRoutePolicy(ImportRoutePolicy importRoutePolicy) {
        this.importRoutePolicy = importRoutePolicy;
        return this;
    }

    /**
     * Get the exportRoutePolicy property: Export Route Policy either IPv4 or IPv6.
     *
     * @return the exportRoutePolicy value.
     */
    public ExportRoutePolicy exportRoutePolicy() {
        return this.exportRoutePolicy;
    }

    /**
     * Set the exportRoutePolicy property: Export Route Policy either IPv4 or IPv6.
     *
     * @param exportRoutePolicy the exportRoutePolicy value to set.
     * @return the ExternalNetworkPatchProperties object itself.
     */
    public ExternalNetworkPatchProperties withExportRoutePolicy(ExportRoutePolicy exportRoutePolicy) {
        this.exportRoutePolicy = exportRoutePolicy;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExternalNetworkPatchProperties withAnnotation(String annotation) {
        super.withAnnotation(annotation);
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
        if (optionBProperties() != null) {
            optionBProperties().validate();
        }
        if (optionAProperties() != null) {
            optionAProperties().validate();
        }
        if (importRoutePolicy() != null) {
            importRoutePolicy().validate();
        }
        if (exportRoutePolicy() != null) {
            exportRoutePolicy().validate();
        }
    }
}
