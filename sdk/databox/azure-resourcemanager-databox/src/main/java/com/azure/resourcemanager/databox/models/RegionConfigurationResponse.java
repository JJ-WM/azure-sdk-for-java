// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.resourcemanager.databox.fluent.models.RegionConfigurationResponseInner;

/** An immutable client-side representation of RegionConfigurationResponse. */
public interface RegionConfigurationResponse {
    /**
     * Gets the scheduleAvailabilityResponse property: Schedule availability for given sku in a region.
     *
     * @return the scheduleAvailabilityResponse value.
     */
    ScheduleAvailabilityResponse scheduleAvailabilityResponse();

    /**
     * Gets the transportAvailabilityResponse property: Transport options available for given sku in a region.
     *
     * @return the transportAvailabilityResponse value.
     */
    TransportAvailabilityResponse transportAvailabilityResponse();

    /**
     * Gets the datacenterAddressResponse property: Datacenter address for given sku in a region.
     *
     * @return the datacenterAddressResponse value.
     */
    DatacenterAddressResponse datacenterAddressResponse();

    /**
     * Gets the inner com.azure.resourcemanager.databox.fluent.models.RegionConfigurationResponseInner object.
     *
     * @return the inner object.
     */
    RegionConfigurationResponseInner innerModel();
}
