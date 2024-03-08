// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.connectedvmware.fluent.models.DatastoreInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Datastore. */
public interface Datastore {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the extendedLocation property: Gets or sets the extended location.
     *
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the systemData property: The system data.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the kind property: Metadata used by portal/tooling/etc to render different UX experiences for resources of
     * the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type. If supported, the resource provider must
     * validate and persist this value.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the uuid property: Gets or sets a unique identifier for this resource.
     *
     * @return the uuid value.
     */
    String uuid();

    /**
     * Gets the vCenterId property: Gets or sets the ARM Id of the vCenter resource in which this datastore resides.
     *
     * @return the vCenterId value.
     */
    String vCenterId();

    /**
     * Gets the moRefId property: Gets or sets the vCenter MoRef (Managed Object Reference) ID for the datastore.
     *
     * @return the moRefId value.
     */
    String moRefId();

    /**
     * Gets the inventoryItemId property: Gets or sets the inventory Item ID for the datastore.
     *
     * @return the inventoryItemId value.
     */
    String inventoryItemId();

    /**
     * Gets the moName property: Gets or sets the vCenter Managed Object name for the datastore.
     *
     * @return the moName value.
     */
    String moName();

    /**
     * Gets the statuses property: The resource status information.
     *
     * @return the statuses value.
     */
    List<ResourceStatus> statuses();

    /**
     * Gets the customResourceName property: Gets the name of the corresponding resource in Kubernetes.
     *
     * @return the customResourceName value.
     */
    String customResourceName();

    /**
     * Gets the capacityGB property: Gets or sets Maximum capacity of this datastore in GBs.
     *
     * @return the capacityGB value.
     */
    Long capacityGB();

    /**
     * Gets the freeSpaceGB property: Gets or sets Available space of this datastore in GBs.
     *
     * @return the freeSpaceGB value.
     */
    Long freeSpaceGB();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.connectedvmware.fluent.models.DatastoreInner object.
     *
     * @return the inner object.
     */
    DatastoreInner innerModel();

    /** The entirety of the Datastore definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }

    /** The Datastore definition stages. */
    interface DefinitionStages {
        /** The first stage of the Datastore definition. */
        interface Blank extends WithLocation {
        }

        /** The stage of the Datastore definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /** The stage of the Datastore definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The Resource Group Name.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the Datastore definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithExtendedLocation,
                DefinitionStages.WithKind,
                DefinitionStages.WithVCenterId,
                DefinitionStages.WithMoRefId,
                DefinitionStages.WithInventoryItemId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Datastore create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Datastore create(Context context);
        }

        /** The stage of the Datastore definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /** The stage of the Datastore definition allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: Gets or sets the extended location..
             *
             * @param extendedLocation Gets or sets the extended location.
             * @return the next definition stage.
             */
            WithCreate withExtendedLocation(ExtendedLocation extendedLocation);
        }

        /** The stage of the Datastore definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Metadata used by portal/tooling/etc to render different UX experiences for
             * resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type. If supported, the
             * resource provider must validate and persist this value..
             *
             * @param kind Metadata used by portal/tooling/etc to render different UX experiences for resources of the
             *     same type; e.g. ApiApps are a kind of Microsoft.Web/sites type. If supported, the resource provider
             *     must validate and persist this value.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }

        /** The stage of the Datastore definition allowing to specify vCenterId. */
        interface WithVCenterId {
            /**
             * Specifies the vCenterId property: Gets or sets the ARM Id of the vCenter resource in which this datastore
             * resides..
             *
             * @param vCenterId Gets or sets the ARM Id of the vCenter resource in which this datastore resides.
             * @return the next definition stage.
             */
            WithCreate withVCenterId(String vCenterId);
        }

        /** The stage of the Datastore definition allowing to specify moRefId. */
        interface WithMoRefId {
            /**
             * Specifies the moRefId property: Gets or sets the vCenter MoRef (Managed Object Reference) ID for the
             * datastore..
             *
             * @param moRefId Gets or sets the vCenter MoRef (Managed Object Reference) ID for the datastore.
             * @return the next definition stage.
             */
            WithCreate withMoRefId(String moRefId);
        }

        /** The stage of the Datastore definition allowing to specify inventoryItemId. */
        interface WithInventoryItemId {
            /**
             * Specifies the inventoryItemId property: Gets or sets the inventory Item ID for the datastore..
             *
             * @param inventoryItemId Gets or sets the inventory Item ID for the datastore.
             * @return the next definition stage.
             */
            WithCreate withInventoryItemId(String inventoryItemId);
        }
    }

    /**
     * Begins update for the Datastore resource.
     *
     * @return the stage of resource update.
     */
    Datastore.Update update();

    /** The template for Datastore update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Datastore apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Datastore apply(Context context);
    }

    /** The Datastore update stages. */
    interface UpdateStages {
        /** The stage of the Datastore update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Datastore refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Datastore refresh(Context context);
}
