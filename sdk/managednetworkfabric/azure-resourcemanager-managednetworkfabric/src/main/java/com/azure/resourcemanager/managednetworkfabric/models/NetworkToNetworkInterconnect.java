// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkToNetworkInterconnectInner;

/** An immutable client-side representation of NetworkToNetworkInterconnect. */
public interface NetworkToNetworkInterconnect {
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
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the nniType property: Type of NNI used. Example: CE | NPB.
     *
     * @return the nniType value.
     */
    NniType nniType();

    /**
     * Gets the administrativeState property: Gets the administrativeState of the resource. Example -Enabled/Disabled.
     *
     * @return the administrativeState value.
     */
    EnabledDisabledState administrativeState();

    /**
     * Gets the isManagementType property: Configuration to use NNI for Infrastructure Management. Example: True/False.
     *
     * @return the isManagementType value.
     */
    BooleanEnumProperty isManagementType();

    /**
     * Gets the useOptionB property: Based on this parameter the layer2/layer3 is made as mandatory. Example:
     * True/False.
     *
     * @return the useOptionB value.
     */
    BooleanEnumProperty useOptionB();

    /**
     * Gets the layer2Configuration property: Common properties for Layer2Configuration.
     *
     * @return the layer2Configuration value.
     */
    Layer2Configuration layer2Configuration();

    /**
     * Gets the layer3Configuration property: Common properties for Layer3Configuration.
     *
     * @return the layer3Configuration value.
     */
    Layer3Configuration layer3Configuration();

    /**
     * Gets the provisioningState property: Gets the provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkToNetworkInterconnectInner
     * object.
     *
     * @return the inner object.
     */
    NetworkToNetworkInterconnectInner innerModel();

    /** The entirety of the NetworkToNetworkInterconnect definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The NetworkToNetworkInterconnect definition stages. */
    interface DefinitionStages {
        /** The first stage of the NetworkToNetworkInterconnect definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the NetworkToNetworkInterconnect definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, networkFabricName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param networkFabricName Name of the NetworkFabric.
             * @return the next definition stage.
             */
            WithCreate withExistingNetworkFabric(String resourceGroupName, String networkFabricName);
        }
        /**
         * The stage of the NetworkToNetworkInterconnect definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithNniType,
                DefinitionStages.WithIsManagementType,
                DefinitionStages.WithUseOptionB,
                DefinitionStages.WithLayer2Configuration,
                DefinitionStages.WithLayer3Configuration {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            NetworkToNetworkInterconnect create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NetworkToNetworkInterconnect create(Context context);
        }
        /** The stage of the NetworkToNetworkInterconnect definition allowing to specify nniType. */
        interface WithNniType {
            /**
             * Specifies the nniType property: Type of NNI used. Example: CE | NPB.
             *
             * @param nniType Type of NNI used. Example: CE | NPB.
             * @return the next definition stage.
             */
            WithCreate withNniType(NniType nniType);
        }
        /** The stage of the NetworkToNetworkInterconnect definition allowing to specify isManagementType. */
        interface WithIsManagementType {
            /**
             * Specifies the isManagementType property: Configuration to use NNI for Infrastructure Management. Example:
             * True/False..
             *
             * @param isManagementType Configuration to use NNI for Infrastructure Management. Example: True/False.
             * @return the next definition stage.
             */
            WithCreate withIsManagementType(BooleanEnumProperty isManagementType);
        }
        /** The stage of the NetworkToNetworkInterconnect definition allowing to specify useOptionB. */
        interface WithUseOptionB {
            /**
             * Specifies the useOptionB property: Based on this parameter the layer2/layer3 is made as mandatory.
             * Example: True/False.
             *
             * @param useOptionB Based on this parameter the layer2/layer3 is made as mandatory. Example: True/False.
             * @return the next definition stage.
             */
            WithCreate withUseOptionB(BooleanEnumProperty useOptionB);
        }
        /** The stage of the NetworkToNetworkInterconnect definition allowing to specify layer2Configuration. */
        interface WithLayer2Configuration {
            /**
             * Specifies the layer2Configuration property: Common properties for Layer2Configuration..
             *
             * @param layer2Configuration Common properties for Layer2Configuration.
             * @return the next definition stage.
             */
            WithCreate withLayer2Configuration(Layer2Configuration layer2Configuration);
        }
        /** The stage of the NetworkToNetworkInterconnect definition allowing to specify layer3Configuration. */
        interface WithLayer3Configuration {
            /**
             * Specifies the layer3Configuration property: Common properties for Layer3Configuration..
             *
             * @param layer3Configuration Common properties for Layer3Configuration.
             * @return the next definition stage.
             */
            WithCreate withLayer3Configuration(Layer3Configuration layer3Configuration);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    NetworkToNetworkInterconnect refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NetworkToNetworkInterconnect refresh(Context context);
}
