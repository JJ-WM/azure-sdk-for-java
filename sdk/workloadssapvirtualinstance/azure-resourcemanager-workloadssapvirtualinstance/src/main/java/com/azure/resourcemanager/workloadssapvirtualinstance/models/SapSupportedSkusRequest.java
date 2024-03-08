// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SAP request to get list of supported SKUs.
 */
@Fluent
public final class SapSupportedSkusRequest {
    /*
     * The geo-location where the resource is to be created.
     */
    @JsonProperty(value = "appLocation", required = true)
    private String appLocation;

    /*
     * Defines the environment type - Production/Non Production.
     */
    @JsonProperty(value = "environment", required = true)
    private SapEnvironmentType environment;

    /*
     * Defines the SAP Product type.
     */
    @JsonProperty(value = "sapProduct", required = true)
    private SapProductType sapProduct;

    /*
     * The deployment type. Eg: SingleServer/ThreeTier
     */
    @JsonProperty(value = "deploymentType", required = true)
    private SapDeploymentType deploymentType;

    /*
     * The database type. Eg: HANA, DB2, etc
     */
    @JsonProperty(value = "databaseType", required = true)
    private SapDatabaseType databaseType;

    /*
     * The high availability type.
     */
    @JsonProperty(value = "highAvailabilityType")
    private SapHighAvailabilityType highAvailabilityType;

    /**
     * Creates an instance of SapSupportedSkusRequest class.
     */
    public SapSupportedSkusRequest() {
    }

    /**
     * Get the appLocation property: The geo-location where the resource is to be created.
     * 
     * @return the appLocation value.
     */
    public String appLocation() {
        return this.appLocation;
    }

    /**
     * Set the appLocation property: The geo-location where the resource is to be created.
     * 
     * @param appLocation the appLocation value to set.
     * @return the SapSupportedSkusRequest object itself.
     */
    public SapSupportedSkusRequest withAppLocation(String appLocation) {
        this.appLocation = appLocation;
        return this;
    }

    /**
     * Get the environment property: Defines the environment type - Production/Non Production.
     * 
     * @return the environment value.
     */
    public SapEnvironmentType environment() {
        return this.environment;
    }

    /**
     * Set the environment property: Defines the environment type - Production/Non Production.
     * 
     * @param environment the environment value to set.
     * @return the SapSupportedSkusRequest object itself.
     */
    public SapSupportedSkusRequest withEnvironment(SapEnvironmentType environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Get the sapProduct property: Defines the SAP Product type.
     * 
     * @return the sapProduct value.
     */
    public SapProductType sapProduct() {
        return this.sapProduct;
    }

    /**
     * Set the sapProduct property: Defines the SAP Product type.
     * 
     * @param sapProduct the sapProduct value to set.
     * @return the SapSupportedSkusRequest object itself.
     */
    public SapSupportedSkusRequest withSapProduct(SapProductType sapProduct) {
        this.sapProduct = sapProduct;
        return this;
    }

    /**
     * Get the deploymentType property: The deployment type. Eg: SingleServer/ThreeTier.
     * 
     * @return the deploymentType value.
     */
    public SapDeploymentType deploymentType() {
        return this.deploymentType;
    }

    /**
     * Set the deploymentType property: The deployment type. Eg: SingleServer/ThreeTier.
     * 
     * @param deploymentType the deploymentType value to set.
     * @return the SapSupportedSkusRequest object itself.
     */
    public SapSupportedSkusRequest withDeploymentType(SapDeploymentType deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    /**
     * Get the databaseType property: The database type. Eg: HANA, DB2, etc.
     * 
     * @return the databaseType value.
     */
    public SapDatabaseType databaseType() {
        return this.databaseType;
    }

    /**
     * Set the databaseType property: The database type. Eg: HANA, DB2, etc.
     * 
     * @param databaseType the databaseType value to set.
     * @return the SapSupportedSkusRequest object itself.
     */
    public SapSupportedSkusRequest withDatabaseType(SapDatabaseType databaseType) {
        this.databaseType = databaseType;
        return this;
    }

    /**
     * Get the highAvailabilityType property: The high availability type.
     * 
     * @return the highAvailabilityType value.
     */
    public SapHighAvailabilityType highAvailabilityType() {
        return this.highAvailabilityType;
    }

    /**
     * Set the highAvailabilityType property: The high availability type.
     * 
     * @param highAvailabilityType the highAvailabilityType value to set.
     * @return the SapSupportedSkusRequest object itself.
     */
    public SapSupportedSkusRequest withHighAvailabilityType(SapHighAvailabilityType highAvailabilityType) {
        this.highAvailabilityType = highAvailabilityType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (appLocation() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property appLocation in model SapSupportedSkusRequest"));
        }
        if (environment() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property environment in model SapSupportedSkusRequest"));
        }
        if (sapProduct() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property sapProduct in model SapSupportedSkusRequest"));
        }
        if (deploymentType() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property deploymentType in model SapSupportedSkusRequest"));
        }
        if (databaseType() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property databaseType in model SapSupportedSkusRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SapSupportedSkusRequest.class);
}
