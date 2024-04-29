// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.resourcemanager.devcenter.fluent.models.DevCenterSkuInner;
import java.util.List;

/**
 * An immutable client-side representation of DevCenterSku.
 */
public interface DevCenterSku {
    /**
     * Gets the name property: The name of the SKU. Ex - P3. It is typically a letter+number code.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the tier property: This field is required to be implemented by the Resource Provider if the service has more
     * than one tier, but is not required on a PUT.
     * 
     * @return the tier value.
     */
    SkuTier tier();

    /**
     * Gets the size property: The SKU size. When the name field is the combination of tier and some other value, this
     * would be the standalone code.
     * 
     * @return the size value.
     */
    String size();

    /**
     * Gets the family property: If the service has different generations of hardware, for the same SKU, then that can
     * be captured here.
     * 
     * @return the family value.
     */
    String family();

    /**
     * Gets the capacity property: If the SKU supports scale out/in then the capacity integer should be included. If
     * scale out/in is not possible for the resource this may be omitted.
     * 
     * @return the capacity value.
     */
    Integer capacity();

    /**
     * Gets the resourceType property: The name of the resource type.
     * 
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * Gets the locations property: SKU supported locations.
     * 
     * @return the locations value.
     */
    List<String> locations();

    /**
     * Gets the capabilities property: Collection of name/value pairs to describe the SKU capabilities.
     * 
     * @return the capabilities value.
     */
    List<Capability> capabilities();

    /**
     * Gets the inner com.azure.resourcemanager.devcenter.fluent.models.DevCenterSkuInner object.
     * 
     * @return the inner object.
     */
    DevCenterSkuInner innerModel();
}
