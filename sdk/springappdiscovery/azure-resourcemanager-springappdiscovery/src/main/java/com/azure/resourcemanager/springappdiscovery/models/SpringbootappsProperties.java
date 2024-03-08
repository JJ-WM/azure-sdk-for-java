// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.springappdiscovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The springbootapps resource definition.
 */
@Fluent
public final class SpringbootappsProperties {
    /*
     * The name of SpringBootApp.
     */
    @JsonProperty(value = "appName")
    private String appName;

    /*
     * The artifact name of SpringBootApp.
     */
    @JsonProperty(value = "artifactName")
    private String artifactName;

    /*
     * The application port.
     */
    @JsonProperty(value = "appPort")
    private Integer appPort;

    /*
     * The application type, whether it is a SpringBoot app.
     */
    @JsonProperty(value = "appType")
    private String appType;

    /*
     * The application configuration file list.
     */
    @JsonProperty(value = "applicationConfigurations")
    private List<SpringbootappsPropertiesApplicationConfigurationsItem> applicationConfigurations;

    /*
     * The application binding port list.
     */
    @JsonProperty(value = "bindingPorts")
    private List<Integer> bindingPorts;

    /*
     * The jdk version in build.
     */
    @JsonProperty(value = "buildJdkVersion")
    private String buildJdkVersion;

    /*
     * The certificate file list.
     */
    @JsonProperty(value = "certificates")
    private List<String> certificates;

    /*
     * The checksum of jar file.
     */
    @JsonProperty(value = "checksum")
    private String checksum;

    /*
     * The dependency list.
     */
    @JsonProperty(value = "dependencies")
    private List<String> dependencies;

    /*
     * The environment variable list.
     */
    @JsonProperty(value = "environments")
    private List<String> environments;

    /*
     * The total instance count the app deployed.
     */
    @JsonProperty(value = "instanceCount")
    private Integer instanceCount;

    /*
     * The jar file location on the server.
     */
    @JsonProperty(value = "jarFileLocation")
    private String jarFileLocation;

    /*
     * The jvm heap memory allocated.
     */
    @JsonProperty(value = "jvmMemoryInMB")
    private Integer jvmMemoryInMB;

    /*
     * The jvm options.
     */
    @JsonProperty(value = "jvmOptions")
    private List<String> jvmOptions;

    /*
     * The other types of date collected.
     */
    @JsonProperty(value = "miscs")
    private List<SpringbootappsPropertiesMiscsItem> miscs;

    /*
     * The breakdown info for app instances on all the servers
     */
    @JsonProperty(value = "instances")
    private List<SpringbootappsPropertiesInstancesItem> instances;

    /*
     * The jdk version installed on server
     */
    @JsonProperty(value = "runtimeJdkVersion")
    private String runtimeJdkVersion;

    /*
     * The server list the app installed
     */
    @JsonProperty(value = "servers")
    private List<String> servers;

    /*
     * The machine ARM id list the app belongs to.
     */
    @JsonProperty(value = "machineArmIds")
    private List<String> machineArmIds;

    /*
     * The site name.
     */
    @JsonProperty(value = "siteName")
    private String siteName;

    /*
     * The spring boot version.
     */
    @JsonProperty(value = "springBootVersion")
    private String springBootVersion;

    /*
     * The static content location list.
     */
    @JsonProperty(value = "staticContentLocations")
    private List<String> staticContentLocations;

    /*
     * The connection string list.
     */
    @JsonProperty(value = "connectionStrings")
    private List<String> connectionStrings;

    /*
     * Time when this springbootapps jar file was last modified.
     */
    @JsonProperty(value = "lastModifiedTime")
    private OffsetDateTime lastModifiedTime;

    /*
     * Time when this springbootapps instance was last refreshed.
     */
    @JsonProperty(value = "lastUpdatedTime")
    private OffsetDateTime lastUpdatedTime;

    /*
     * The resource provisioning state.
     */
    @JsonProperty(value = "provisioningState")
    private ProvisioningState provisioningState;

    /*
     * The list of errors.
     */
    @JsonProperty(value = "errors")
    private List<Error> errors;

    /**
     * Creates an instance of SpringbootappsProperties class.
     */
    public SpringbootappsProperties() {
    }

    /**
     * Get the appName property: The name of SpringBootApp.
     * 
     * @return the appName value.
     */
    public String appName() {
        return this.appName;
    }

    /**
     * Set the appName property: The name of SpringBootApp.
     * 
     * @param appName the appName value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * Get the artifactName property: The artifact name of SpringBootApp.
     * 
     * @return the artifactName value.
     */
    public String artifactName() {
        return this.artifactName;
    }

    /**
     * Set the artifactName property: The artifact name of SpringBootApp.
     * 
     * @param artifactName the artifactName value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withArtifactName(String artifactName) {
        this.artifactName = artifactName;
        return this;
    }

    /**
     * Get the appPort property: The application port.
     * 
     * @return the appPort value.
     */
    public Integer appPort() {
        return this.appPort;
    }

    /**
     * Set the appPort property: The application port.
     * 
     * @param appPort the appPort value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withAppPort(Integer appPort) {
        this.appPort = appPort;
        return this;
    }

    /**
     * Get the appType property: The application type, whether it is a SpringBoot app.
     * 
     * @return the appType value.
     */
    public String appType() {
        return this.appType;
    }

    /**
     * Set the appType property: The application type, whether it is a SpringBoot app.
     * 
     * @param appType the appType value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withAppType(String appType) {
        this.appType = appType;
        return this;
    }

    /**
     * Get the applicationConfigurations property: The application configuration file list.
     * 
     * @return the applicationConfigurations value.
     */
    public List<SpringbootappsPropertiesApplicationConfigurationsItem> applicationConfigurations() {
        return this.applicationConfigurations;
    }

    /**
     * Set the applicationConfigurations property: The application configuration file list.
     * 
     * @param applicationConfigurations the applicationConfigurations value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withApplicationConfigurations(
        List<SpringbootappsPropertiesApplicationConfigurationsItem> applicationConfigurations) {
        this.applicationConfigurations = applicationConfigurations;
        return this;
    }

    /**
     * Get the bindingPorts property: The application binding port list.
     * 
     * @return the bindingPorts value.
     */
    public List<Integer> bindingPorts() {
        return this.bindingPorts;
    }

    /**
     * Set the bindingPorts property: The application binding port list.
     * 
     * @param bindingPorts the bindingPorts value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withBindingPorts(List<Integer> bindingPorts) {
        this.bindingPorts = bindingPorts;
        return this;
    }

    /**
     * Get the buildJdkVersion property: The jdk version in build.
     * 
     * @return the buildJdkVersion value.
     */
    public String buildJdkVersion() {
        return this.buildJdkVersion;
    }

    /**
     * Set the buildJdkVersion property: The jdk version in build.
     * 
     * @param buildJdkVersion the buildJdkVersion value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withBuildJdkVersion(String buildJdkVersion) {
        this.buildJdkVersion = buildJdkVersion;
        return this;
    }

    /**
     * Get the certificates property: The certificate file list.
     * 
     * @return the certificates value.
     */
    public List<String> certificates() {
        return this.certificates;
    }

    /**
     * Set the certificates property: The certificate file list.
     * 
     * @param certificates the certificates value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withCertificates(List<String> certificates) {
        this.certificates = certificates;
        return this;
    }

    /**
     * Get the checksum property: The checksum of jar file.
     * 
     * @return the checksum value.
     */
    public String checksum() {
        return this.checksum;
    }

    /**
     * Set the checksum property: The checksum of jar file.
     * 
     * @param checksum the checksum value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * Get the dependencies property: The dependency list.
     * 
     * @return the dependencies value.
     */
    public List<String> dependencies() {
        return this.dependencies;
    }

    /**
     * Set the dependencies property: The dependency list.
     * 
     * @param dependencies the dependencies value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    /**
     * Get the environments property: The environment variable list.
     * 
     * @return the environments value.
     */
    public List<String> environments() {
        return this.environments;
    }

    /**
     * Set the environments property: The environment variable list.
     * 
     * @param environments the environments value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withEnvironments(List<String> environments) {
        this.environments = environments;
        return this;
    }

    /**
     * Get the instanceCount property: The total instance count the app deployed.
     * 
     * @return the instanceCount value.
     */
    public Integer instanceCount() {
        return this.instanceCount;
    }

    /**
     * Set the instanceCount property: The total instance count the app deployed.
     * 
     * @param instanceCount the instanceCount value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * Get the jarFileLocation property: The jar file location on the server.
     * 
     * @return the jarFileLocation value.
     */
    public String jarFileLocation() {
        return this.jarFileLocation;
    }

    /**
     * Set the jarFileLocation property: The jar file location on the server.
     * 
     * @param jarFileLocation the jarFileLocation value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withJarFileLocation(String jarFileLocation) {
        this.jarFileLocation = jarFileLocation;
        return this;
    }

    /**
     * Get the jvmMemoryInMB property: The jvm heap memory allocated.
     * 
     * @return the jvmMemoryInMB value.
     */
    public Integer jvmMemoryInMB() {
        return this.jvmMemoryInMB;
    }

    /**
     * Set the jvmMemoryInMB property: The jvm heap memory allocated.
     * 
     * @param jvmMemoryInMB the jvmMemoryInMB value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withJvmMemoryInMB(Integer jvmMemoryInMB) {
        this.jvmMemoryInMB = jvmMemoryInMB;
        return this;
    }

    /**
     * Get the jvmOptions property: The jvm options.
     * 
     * @return the jvmOptions value.
     */
    public List<String> jvmOptions() {
        return this.jvmOptions;
    }

    /**
     * Set the jvmOptions property: The jvm options.
     * 
     * @param jvmOptions the jvmOptions value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withJvmOptions(List<String> jvmOptions) {
        this.jvmOptions = jvmOptions;
        return this;
    }

    /**
     * Get the miscs property: The other types of date collected.
     * 
     * @return the miscs value.
     */
    public List<SpringbootappsPropertiesMiscsItem> miscs() {
        return this.miscs;
    }

    /**
     * Set the miscs property: The other types of date collected.
     * 
     * @param miscs the miscs value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withMiscs(List<SpringbootappsPropertiesMiscsItem> miscs) {
        this.miscs = miscs;
        return this;
    }

    /**
     * Get the instances property: The breakdown info for app instances on all the servers.
     * 
     * @return the instances value.
     */
    public List<SpringbootappsPropertiesInstancesItem> instances() {
        return this.instances;
    }

    /**
     * Set the instances property: The breakdown info for app instances on all the servers.
     * 
     * @param instances the instances value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withInstances(List<SpringbootappsPropertiesInstancesItem> instances) {
        this.instances = instances;
        return this;
    }

    /**
     * Get the runtimeJdkVersion property: The jdk version installed on server.
     * 
     * @return the runtimeJdkVersion value.
     */
    public String runtimeJdkVersion() {
        return this.runtimeJdkVersion;
    }

    /**
     * Set the runtimeJdkVersion property: The jdk version installed on server.
     * 
     * @param runtimeJdkVersion the runtimeJdkVersion value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withRuntimeJdkVersion(String runtimeJdkVersion) {
        this.runtimeJdkVersion = runtimeJdkVersion;
        return this;
    }

    /**
     * Get the servers property: The server list the app installed.
     * 
     * @return the servers value.
     */
    public List<String> servers() {
        return this.servers;
    }

    /**
     * Set the servers property: The server list the app installed.
     * 
     * @param servers the servers value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withServers(List<String> servers) {
        this.servers = servers;
        return this;
    }

    /**
     * Get the machineArmIds property: The machine ARM id list the app belongs to.
     * 
     * @return the machineArmIds value.
     */
    public List<String> machineArmIds() {
        return this.machineArmIds;
    }

    /**
     * Set the machineArmIds property: The machine ARM id list the app belongs to.
     * 
     * @param machineArmIds the machineArmIds value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withMachineArmIds(List<String> machineArmIds) {
        this.machineArmIds = machineArmIds;
        return this;
    }

    /**
     * Get the siteName property: The site name.
     * 
     * @return the siteName value.
     */
    public String siteName() {
        return this.siteName;
    }

    /**
     * Set the siteName property: The site name.
     * 
     * @param siteName the siteName value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    /**
     * Get the springBootVersion property: The spring boot version.
     * 
     * @return the springBootVersion value.
     */
    public String springBootVersion() {
        return this.springBootVersion;
    }

    /**
     * Set the springBootVersion property: The spring boot version.
     * 
     * @param springBootVersion the springBootVersion value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withSpringBootVersion(String springBootVersion) {
        this.springBootVersion = springBootVersion;
        return this;
    }

    /**
     * Get the staticContentLocations property: The static content location list.
     * 
     * @return the staticContentLocations value.
     */
    public List<String> staticContentLocations() {
        return this.staticContentLocations;
    }

    /**
     * Set the staticContentLocations property: The static content location list.
     * 
     * @param staticContentLocations the staticContentLocations value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withStaticContentLocations(List<String> staticContentLocations) {
        this.staticContentLocations = staticContentLocations;
        return this;
    }

    /**
     * Get the connectionStrings property: The connection string list.
     * 
     * @return the connectionStrings value.
     */
    public List<String> connectionStrings() {
        return this.connectionStrings;
    }

    /**
     * Set the connectionStrings property: The connection string list.
     * 
     * @param connectionStrings the connectionStrings value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withConnectionStrings(List<String> connectionStrings) {
        this.connectionStrings = connectionStrings;
        return this;
    }

    /**
     * Get the lastModifiedTime property: Time when this springbootapps jar file was last modified.
     * 
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set the lastModifiedTime property: Time when this springbootapps jar file was last modified.
     * 
     * @param lastModifiedTime the lastModifiedTime value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Get the lastUpdatedTime property: Time when this springbootapps instance was last refreshed.
     * 
     * @return the lastUpdatedTime value.
     */
    public OffsetDateTime lastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * Set the lastUpdatedTime property: Time when this springbootapps instance was last refreshed.
     * 
     * @param lastUpdatedTime the lastUpdatedTime value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withLastUpdatedTime(OffsetDateTime lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * Get the provisioningState property: The resource provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The resource provisioning state.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the errors property: The list of errors.
     * 
     * @return the errors value.
     */
    public List<Error> errors() {
        return this.errors;
    }

    /**
     * Set the errors property: The list of errors.
     * 
     * @param errors the errors value to set.
     * @return the SpringbootappsProperties object itself.
     */
    public SpringbootappsProperties withErrors(List<Error> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (applicationConfigurations() != null) {
            applicationConfigurations().forEach(e -> e.validate());
        }
        if (miscs() != null) {
            miscs().forEach(e -> e.validate());
        }
        if (instances() != null) {
            instances().forEach(e -> e.validate());
        }
        if (errors() != null) {
            errors().forEach(e -> e.validate());
        }
    }
}
