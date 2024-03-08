// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes virtual machine scale set operating system disk Update Object. This should be used for Updating VMSS OS
 * Disk.
 */
@Fluent
public final class VirtualMachineScaleSetUpdateOSDisk {
    /*
     * The caching type.
     */
    @JsonProperty(value = "caching")
    private CachingTypes caching;

    /*
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     */
    @JsonProperty(value = "writeAcceleratorEnabled")
    private Boolean writeAcceleratorEnabled;

    /*
     * Specifies the size of an empty data disk in gigabytes. This element can be used to overwrite the size of the
     * disk in a virtual machine image. <br><br> diskSizeGB is the number of bytes x 1024^3 for the disk and the value
     * cannot be larger than 1023
     */
    @JsonProperty(value = "diskSizeGB")
    private Integer diskSizeGB;

    /*
     * The Source User Image VirtualHardDisk. This VirtualHardDisk will be copied before using it to attach to the
     * Virtual Machine. If SourceImage is provided, the destination VirtualHardDisk should not exist.
     */
    @JsonProperty(value = "image")
    private VirtualHardDisk image;

    /*
     * The list of virtual hard disk container uris.
     */
    @JsonProperty(value = "vhdContainers")
    private List<String> vhdContainers;

    /*
     * The managed disk parameters.
     */
    @JsonProperty(value = "managedDisk")
    private VirtualMachineScaleSetManagedDiskParameters managedDisk;

    /*
     * Specifies whether OS Disk should be deleted or detached upon VMSS Flex deletion (This feature is available for
     * VMSS with Flexible OrchestrationMode only). <br><br> Possible values: <br><br> **Delete** If this value is used,
     * the OS disk is deleted when VMSS Flex VM is deleted.<br><br> **Detach** If this value is used, the OS disk is
     * retained after VMSS Flex VM is deleted. <br><br> The default value is set to **Delete**. For an Ephemeral OS
     * Disk, the default value is set to **Delete**. User cannot change the delete option for Ephemeral OS Disk.
     */
    @JsonProperty(value = "deleteOption")
    private DiskDeleteOptionTypes deleteOption;

    /**
     * Creates an instance of VirtualMachineScaleSetUpdateOSDisk class.
     */
    public VirtualMachineScaleSetUpdateOSDisk() {
    }

    /**
     * Get the caching property: The caching type.
     * 
     * @return the caching value.
     */
    public CachingTypes caching() {
        return this.caching;
    }

    /**
     * Set the caching property: The caching type.
     * 
     * @param caching the caching value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withCaching(CachingTypes caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the writeAcceleratorEnabled property: Specifies whether writeAccelerator should be enabled or disabled on
     * the disk.
     * 
     * @return the writeAcceleratorEnabled value.
     */
    public Boolean writeAcceleratorEnabled() {
        return this.writeAcceleratorEnabled;
    }

    /**
     * Set the writeAcceleratorEnabled property: Specifies whether writeAccelerator should be enabled or disabled on
     * the disk.
     * 
     * @param writeAcceleratorEnabled the writeAcceleratorEnabled value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withWriteAcceleratorEnabled(Boolean writeAcceleratorEnabled) {
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
        return this;
    }

    /**
     * Get the diskSizeGB property: Specifies the size of an empty data disk in gigabytes. This element can be used to
     * overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; diskSizeGB is the number of
     * bytes x 1024^3 for the disk and the value cannot be larger than 1023.
     * 
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: Specifies the size of an empty data disk in gigabytes. This element can be used to
     * overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; diskSizeGB is the number of
     * bytes x 1024^3 for the disk and the value cannot be larger than 1023.
     * 
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the image property: The Source User Image VirtualHardDisk. This VirtualHardDisk will be copied before using
     * it to attach to the Virtual Machine. If SourceImage is provided, the destination VirtualHardDisk should not
     * exist.
     * 
     * @return the image value.
     */
    public VirtualHardDisk image() {
        return this.image;
    }

    /**
     * Set the image property: The Source User Image VirtualHardDisk. This VirtualHardDisk will be copied before using
     * it to attach to the Virtual Machine. If SourceImage is provided, the destination VirtualHardDisk should not
     * exist.
     * 
     * @param image the image value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withImage(VirtualHardDisk image) {
        this.image = image;
        return this;
    }

    /**
     * Get the vhdContainers property: The list of virtual hard disk container uris.
     * 
     * @return the vhdContainers value.
     */
    public List<String> vhdContainers() {
        return this.vhdContainers;
    }

    /**
     * Set the vhdContainers property: The list of virtual hard disk container uris.
     * 
     * @param vhdContainers the vhdContainers value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withVhdContainers(List<String> vhdContainers) {
        this.vhdContainers = vhdContainers;
        return this;
    }

    /**
     * Get the managedDisk property: The managed disk parameters.
     * 
     * @return the managedDisk value.
     */
    public VirtualMachineScaleSetManagedDiskParameters managedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managedDisk property: The managed disk parameters.
     * 
     * @param managedDisk the managedDisk value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withManagedDisk(VirtualMachineScaleSetManagedDiskParameters managedDisk) {
        this.managedDisk = managedDisk;
        return this;
    }

    /**
     * Get the deleteOption property: Specifies whether OS Disk should be deleted or detached upon VMSS Flex deletion
     * (This feature is available for VMSS with Flexible OrchestrationMode only). &lt;br&gt;&lt;br&gt; Possible values:
     * &lt;br&gt;&lt;br&gt; **Delete** If this value is used, the OS disk is deleted when VMSS Flex VM is
     * deleted.&lt;br&gt;&lt;br&gt; **Detach** If this value is used, the OS disk is retained after VMSS Flex VM is
     * deleted. &lt;br&gt;&lt;br&gt; The default value is set to **Delete**. For an Ephemeral OS Disk, the default
     * value is set to **Delete**. User cannot change the delete option for Ephemeral OS Disk.
     * 
     * @return the deleteOption value.
     */
    public DiskDeleteOptionTypes deleteOption() {
        return this.deleteOption;
    }

    /**
     * Set the deleteOption property: Specifies whether OS Disk should be deleted or detached upon VMSS Flex deletion
     * (This feature is available for VMSS with Flexible OrchestrationMode only). &lt;br&gt;&lt;br&gt; Possible values:
     * &lt;br&gt;&lt;br&gt; **Delete** If this value is used, the OS disk is deleted when VMSS Flex VM is
     * deleted.&lt;br&gt;&lt;br&gt; **Detach** If this value is used, the OS disk is retained after VMSS Flex VM is
     * deleted. &lt;br&gt;&lt;br&gt; The default value is set to **Delete**. For an Ephemeral OS Disk, the default
     * value is set to **Delete**. User cannot change the delete option for Ephemeral OS Disk.
     * 
     * @param deleteOption the deleteOption value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withDeleteOption(DiskDeleteOptionTypes deleteOption) {
        this.deleteOption = deleteOption;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (image() != null) {
            image().validate();
        }
        if (managedDisk() != null) {
            managedDisk().validate();
        }
    }
}
