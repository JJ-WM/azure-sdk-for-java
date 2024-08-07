// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Configuration Options for Spot instances in Compute Fleet.
 */
@Fluent
public final class SpotPriorityProfile implements JsonSerializable<SpotPriorityProfile> {
    /*
     * Total capacity to achieve. It is currently in terms of number of VMs.
     */
    private Integer capacity;

    /*
     * Minimum capacity to achieve which cannot be updated. If we will not be able to "guarantee" minimum capacity, we
     * will reject the request in the sync path itself.
     */
    private Integer minCapacity;

    /*
     * Price per hour of each Spot VM will never exceed this.
     */
    private Double maxPricePerVM;

    /*
     * Eviction Policy to follow when evicting Spot VMs.
     */
    private EvictionPolicy evictionPolicy;

    /*
     * Allocation strategy to follow when determining the VM sizes distribution for Spot VMs.
     */
    private SpotAllocationStrategy allocationStrategy;

    /*
     * Flag to enable/disable continuous goal seeking for the desired capacity and restoration of evicted Spot VMs.
     * If maintain is enabled, AzureFleetRP will use all VM sizes in vmSizesProfile to create new VMs (if VMs are
     * evicted deleted)
     * or update existing VMs with new VM sizes (if VMs are evicted deallocated or failed to allocate due to capacity
     * constraint) in order to achieve the desired capacity.
     * Maintain is enabled by default.
     */
    private Boolean maintain;

    /**
     * Creates an instance of SpotPriorityProfile class.
     */
    public SpotPriorityProfile() {
    }

    /**
     * Get the capacity property: Total capacity to achieve. It is currently in terms of number of VMs.
     * 
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Total capacity to achieve. It is currently in terms of number of VMs.
     * 
     * @param capacity the capacity value to set.
     * @return the SpotPriorityProfile object itself.
     */
    public SpotPriorityProfile withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the minCapacity property: Minimum capacity to achieve which cannot be updated. If we will not be able to
     * "guarantee" minimum capacity, we will reject the request in the sync path itself.
     * 
     * @return the minCapacity value.
     */
    public Integer minCapacity() {
        return this.minCapacity;
    }

    /**
     * Set the minCapacity property: Minimum capacity to achieve which cannot be updated. If we will not be able to
     * "guarantee" minimum capacity, we will reject the request in the sync path itself.
     * 
     * @param minCapacity the minCapacity value to set.
     * @return the SpotPriorityProfile object itself.
     */
    public SpotPriorityProfile withMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * Get the maxPricePerVM property: Price per hour of each Spot VM will never exceed this.
     * 
     * @return the maxPricePerVM value.
     */
    public Double maxPricePerVM() {
        return this.maxPricePerVM;
    }

    /**
     * Set the maxPricePerVM property: Price per hour of each Spot VM will never exceed this.
     * 
     * @param maxPricePerVM the maxPricePerVM value to set.
     * @return the SpotPriorityProfile object itself.
     */
    public SpotPriorityProfile withMaxPricePerVM(Double maxPricePerVM) {
        this.maxPricePerVM = maxPricePerVM;
        return this;
    }

    /**
     * Get the evictionPolicy property: Eviction Policy to follow when evicting Spot VMs.
     * 
     * @return the evictionPolicy value.
     */
    public EvictionPolicy evictionPolicy() {
        return this.evictionPolicy;
    }

    /**
     * Set the evictionPolicy property: Eviction Policy to follow when evicting Spot VMs.
     * 
     * @param evictionPolicy the evictionPolicy value to set.
     * @return the SpotPriorityProfile object itself.
     */
    public SpotPriorityProfile withEvictionPolicy(EvictionPolicy evictionPolicy) {
        this.evictionPolicy = evictionPolicy;
        return this;
    }

    /**
     * Get the allocationStrategy property: Allocation strategy to follow when determining the VM sizes distribution for
     * Spot VMs.
     * 
     * @return the allocationStrategy value.
     */
    public SpotAllocationStrategy allocationStrategy() {
        return this.allocationStrategy;
    }

    /**
     * Set the allocationStrategy property: Allocation strategy to follow when determining the VM sizes distribution for
     * Spot VMs.
     * 
     * @param allocationStrategy the allocationStrategy value to set.
     * @return the SpotPriorityProfile object itself.
     */
    public SpotPriorityProfile withAllocationStrategy(SpotAllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }

    /**
     * Get the maintain property: Flag to enable/disable continuous goal seeking for the desired capacity and
     * restoration of evicted Spot VMs.
     * If maintain is enabled, AzureFleetRP will use all VM sizes in vmSizesProfile to create new VMs (if VMs are
     * evicted deleted)
     * or update existing VMs with new VM sizes (if VMs are evicted deallocated or failed to allocate due to capacity
     * constraint) in order to achieve the desired capacity.
     * Maintain is enabled by default.
     * 
     * @return the maintain value.
     */
    public Boolean maintain() {
        return this.maintain;
    }

    /**
     * Set the maintain property: Flag to enable/disable continuous goal seeking for the desired capacity and
     * restoration of evicted Spot VMs.
     * If maintain is enabled, AzureFleetRP will use all VM sizes in vmSizesProfile to create new VMs (if VMs are
     * evicted deleted)
     * or update existing VMs with new VM sizes (if VMs are evicted deallocated or failed to allocate due to capacity
     * constraint) in order to achieve the desired capacity.
     * Maintain is enabled by default.
     * 
     * @param maintain the maintain value to set.
     * @return the SpotPriorityProfile object itself.
     */
    public SpotPriorityProfile withMaintain(Boolean maintain) {
        this.maintain = maintain;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("capacity", this.capacity);
        jsonWriter.writeNumberField("minCapacity", this.minCapacity);
        jsonWriter.writeNumberField("maxPricePerVM", this.maxPricePerVM);
        jsonWriter.writeStringField("evictionPolicy",
            this.evictionPolicy == null ? null : this.evictionPolicy.toString());
        jsonWriter.writeStringField("allocationStrategy",
            this.allocationStrategy == null ? null : this.allocationStrategy.toString());
        jsonWriter.writeBooleanField("maintain", this.maintain);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SpotPriorityProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SpotPriorityProfile if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SpotPriorityProfile.
     */
    public static SpotPriorityProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SpotPriorityProfile deserializedSpotPriorityProfile = new SpotPriorityProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("capacity".equals(fieldName)) {
                    deserializedSpotPriorityProfile.capacity = reader.getNullable(JsonReader::getInt);
                } else if ("minCapacity".equals(fieldName)) {
                    deserializedSpotPriorityProfile.minCapacity = reader.getNullable(JsonReader::getInt);
                } else if ("maxPricePerVM".equals(fieldName)) {
                    deserializedSpotPriorityProfile.maxPricePerVM = reader.getNullable(JsonReader::getDouble);
                } else if ("evictionPolicy".equals(fieldName)) {
                    deserializedSpotPriorityProfile.evictionPolicy = EvictionPolicy.fromString(reader.getString());
                } else if ("allocationStrategy".equals(fieldName)) {
                    deserializedSpotPriorityProfile.allocationStrategy
                        = SpotAllocationStrategy.fromString(reader.getString());
                } else if ("maintain".equals(fieldName)) {
                    deserializedSpotPriorityProfile.maintain = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSpotPriorityProfile;
        });
    }
}
