// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The container settings for a task.
 */
@Fluent
public final class TaskContainerSettings {
    /*
     * Additional options to the container create command.
     * 
     * These additional options are supplied as arguments to the "docker create" command, in addition to those
     * controlled by the Batch Service.
     */
    @JsonProperty(value = "containerRunOptions")
    private String containerRunOptions;

    /*
     * The image to use to create the container in which the task will run.
     * 
     * This is the full image reference, as would be specified to "docker pull". If no tag is provided as part of the
     * image name, the tag ":latest" is used as a default.
     */
    @JsonProperty(value = "imageName", required = true)
    private String imageName;

    /*
     * A private container registry.
     * 
     * This setting can be omitted if was already provided at pool creation.
     */
    @JsonProperty(value = "registry")
    private ContainerRegistry registry;

    /*
     * A flag to indicate where the container task working directory is. The default is 'taskWorkingDirectory'.
     */
    @JsonProperty(value = "workingDirectory")
    private ContainerWorkingDirectory workingDirectory;

    /**
     * Creates an instance of TaskContainerSettings class.
     */
    public TaskContainerSettings() {
    }

    /**
     * Get the containerRunOptions property: Additional options to the container create command.
     * 
     * These additional options are supplied as arguments to the "docker create" command, in addition to those
     * controlled by the Batch Service.
     * 
     * @return the containerRunOptions value.
     */
    public String containerRunOptions() {
        return this.containerRunOptions;
    }

    /**
     * Set the containerRunOptions property: Additional options to the container create command.
     * 
     * These additional options are supplied as arguments to the "docker create" command, in addition to those
     * controlled by the Batch Service.
     * 
     * @param containerRunOptions the containerRunOptions value to set.
     * @return the TaskContainerSettings object itself.
     */
    public TaskContainerSettings withContainerRunOptions(String containerRunOptions) {
        this.containerRunOptions = containerRunOptions;
        return this;
    }

    /**
     * Get the imageName property: The image to use to create the container in which the task will run.
     * 
     * This is the full image reference, as would be specified to "docker pull". If no tag is provided as part of the
     * image name, the tag ":latest" is used as a default.
     * 
     * @return the imageName value.
     */
    public String imageName() {
        return this.imageName;
    }

    /**
     * Set the imageName property: The image to use to create the container in which the task will run.
     * 
     * This is the full image reference, as would be specified to "docker pull". If no tag is provided as part of the
     * image name, the tag ":latest" is used as a default.
     * 
     * @param imageName the imageName value to set.
     * @return the TaskContainerSettings object itself.
     */
    public TaskContainerSettings withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * Get the registry property: A private container registry.
     * 
     * This setting can be omitted if was already provided at pool creation.
     * 
     * @return the registry value.
     */
    public ContainerRegistry registry() {
        return this.registry;
    }

    /**
     * Set the registry property: A private container registry.
     * 
     * This setting can be omitted if was already provided at pool creation.
     * 
     * @param registry the registry value to set.
     * @return the TaskContainerSettings object itself.
     */
    public TaskContainerSettings withRegistry(ContainerRegistry registry) {
        this.registry = registry;
        return this;
    }

    /**
     * Get the workingDirectory property: A flag to indicate where the container task working directory is. The default
     * is 'taskWorkingDirectory'.
     * 
     * @return the workingDirectory value.
     */
    public ContainerWorkingDirectory workingDirectory() {
        return this.workingDirectory;
    }

    /**
     * Set the workingDirectory property: A flag to indicate where the container task working directory is. The default
     * is 'taskWorkingDirectory'.
     * 
     * @param workingDirectory the workingDirectory value to set.
     * @return the TaskContainerSettings object itself.
     */
    public TaskContainerSettings withWorkingDirectory(ContainerWorkingDirectory workingDirectory) {
        this.workingDirectory = workingDirectory;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (imageName() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property imageName in model TaskContainerSettings"));
        }
        if (registry() != null) {
            registry().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TaskContainerSettings.class);
}
