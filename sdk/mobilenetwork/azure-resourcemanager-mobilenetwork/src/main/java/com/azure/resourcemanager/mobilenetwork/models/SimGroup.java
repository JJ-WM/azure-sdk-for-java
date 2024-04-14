// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimGroupInner;
import java.util.Map;

/**
 * An immutable client-side representation of SimGroup.
 */
public interface SimGroup {
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
     * Gets the identity property: The identity used to retrieve the encryption key from Azure key vault.
     * 
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The provisioning state of the SIM group resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the encryptionKey property: A key to encrypt the SIM data that belongs to this SIM group.
     * 
     * @return the encryptionKey value.
     */
    KeyVaultKey encryptionKey();

    /**
     * Gets the mobileNetwork property: Mobile network that this SIM group belongs to. The mobile network must be in the
     * same location as the SIM group.
     * 
     * @return the mobileNetwork value.
     */
    MobileNetworkResourceId mobileNetwork();

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
     * Gets the inner com.azure.resourcemanager.mobilenetwork.fluent.models.SimGroupInner object.
     * 
     * @return the inner object.
     */
    SimGroupInner innerModel();

    /**
     * The entirety of the SimGroup definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The SimGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the SimGroup definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the SimGroup definition allowing to specify location.
         */
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

        /**
         * The stage of the SimGroup definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the SimGroup definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithIdentity,
            DefinitionStages.WithEncryptionKey, DefinitionStages.WithMobileNetwork {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            SimGroup create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SimGroup create(Context context);
        }

        /**
         * The stage of the SimGroup definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the SimGroup definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity used to retrieve the encryption key from Azure key vault..
             * 
             * @param identity The identity used to retrieve the encryption key from Azure key vault.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the SimGroup definition allowing to specify encryptionKey.
         */
        interface WithEncryptionKey {
            /**
             * Specifies the encryptionKey property: A key to encrypt the SIM data that belongs to this SIM group..
             * 
             * @param encryptionKey A key to encrypt the SIM data that belongs to this SIM group.
             * @return the next definition stage.
             */
            WithCreate withEncryptionKey(KeyVaultKey encryptionKey);
        }

        /**
         * The stage of the SimGroup definition allowing to specify mobileNetwork.
         */
        interface WithMobileNetwork {
            /**
             * Specifies the mobileNetwork property: Mobile network that this SIM group belongs to. The mobile network
             * must be in the same location as the SIM group..
             * 
             * @param mobileNetwork Mobile network that this SIM group belongs to. The mobile network must be in the
             * same location as the SIM group.
             * @return the next definition stage.
             */
            WithCreate withMobileNetwork(MobileNetworkResourceId mobileNetwork);
        }
    }

    /**
     * Begins update for the SimGroup resource.
     * 
     * @return the stage of resource update.
     */
    SimGroup.Update update();

    /**
     * The template for SimGroup update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        SimGroup apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SimGroup apply(Context context);
    }

    /**
     * The SimGroup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the SimGroup update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the SimGroup update allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The managed service identity associated with this resource..
             * 
             * @param identity The managed service identity associated with this resource.
             * @return the next definition stage.
             */
            Update withIdentity(ManagedServiceIdentity identity);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    SimGroup refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SimGroup refresh(Context context);
}
