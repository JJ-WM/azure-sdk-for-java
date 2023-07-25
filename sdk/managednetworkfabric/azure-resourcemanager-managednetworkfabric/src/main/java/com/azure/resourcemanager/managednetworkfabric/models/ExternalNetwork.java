// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.ExternalNetworkInner;

/** An immutable client-side representation of ExternalNetwork. */
public interface ExternalNetwork {
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
     * Gets the networkToNetworkInterconnectId property: Gets the networkToNetworkInterconnectId of the resource.
     *
     * @return the networkToNetworkInterconnectId value.
     */
    String networkToNetworkInterconnectId();

    /**
     * Gets the peeringOption property: Peering option list.
     *
     * @return the peeringOption value.
     */
    PeeringOption peeringOption();

    /**
     * Gets the optionBProperties property: option B properties object.
     *
     * @return the optionBProperties value.
     */
    L3OptionBProperties optionBProperties();

    /**
     * Gets the optionAProperties property: option A properties object.
     *
     * @return the optionAProperties value.
     */
    ExternalNetworkPropertiesOptionAProperties optionAProperties();

    /**
     * Gets the configurationState property: Configuration state of the resource.
     *
     * @return the configurationState value.
     */
    ConfigurationState configurationState();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the administrativeState property: Administrative state of the resource.
     *
     * @return the administrativeState value.
     */
    AdministrativeState administrativeState();

    /**
     * Gets the importRoutePolicyId property: ARM Resource ID of the RoutePolicy. This is used for the backward
     * compatibility.
     *
     * @return the importRoutePolicyId value.
     */
    String importRoutePolicyId();

    /**
     * Gets the exportRoutePolicyId property: ARM Resource ID of the RoutePolicy. This is used for the backward
     * compatibility.
     *
     * @return the exportRoutePolicyId value.
     */
    String exportRoutePolicyId();

    /**
     * Gets the importRoutePolicy property: Import Route Policy either IPv4 or IPv6.
     *
     * @return the importRoutePolicy value.
     */
    ImportRoutePolicy importRoutePolicy();

    /**
     * Gets the exportRoutePolicy property: Export Route Policy either IPv4 or IPv6.
     *
     * @return the exportRoutePolicy value.
     */
    ExportRoutePolicy exportRoutePolicy();

    /**
     * Gets the annotation property: Switch configuration description.
     *
     * @return the annotation value.
     */
    String annotation();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.managednetworkfabric.fluent.models.ExternalNetworkInner object.
     *
     * @return the inner object.
     */
    ExternalNetworkInner innerModel();

    /** The entirety of the ExternalNetwork definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithPeeringOption,
            DefinitionStages.WithCreate {
    }

    /** The ExternalNetwork definition stages. */
    interface DefinitionStages {
        /** The first stage of the ExternalNetwork definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the ExternalNetwork definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, l3IsolationDomainName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param l3IsolationDomainName Name of the L3 Isolation Domain.
             * @return the next definition stage.
             */
            WithPeeringOption withExistingL3IsolationDomain(String resourceGroupName, String l3IsolationDomainName);
        }

        /** The stage of the ExternalNetwork definition allowing to specify peeringOption. */
        interface WithPeeringOption {
            /**
             * Specifies the peeringOption property: Peering option list..
             *
             * @param peeringOption Peering option list.
             * @return the next definition stage.
             */
            WithCreate withPeeringOption(PeeringOption peeringOption);
        }

        /**
         * The stage of the ExternalNetwork definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithOptionBProperties,
                DefinitionStages.WithOptionAProperties,
                DefinitionStages.WithImportRoutePolicyId,
                DefinitionStages.WithExportRoutePolicyId,
                DefinitionStages.WithImportRoutePolicy,
                DefinitionStages.WithExportRoutePolicy,
                DefinitionStages.WithAnnotation {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ExternalNetwork create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ExternalNetwork create(Context context);
        }

        /** The stage of the ExternalNetwork definition allowing to specify optionBProperties. */
        interface WithOptionBProperties {
            /**
             * Specifies the optionBProperties property: option B properties object.
             *
             * @param optionBProperties option B properties object.
             * @return the next definition stage.
             */
            WithCreate withOptionBProperties(L3OptionBProperties optionBProperties);
        }

        /** The stage of the ExternalNetwork definition allowing to specify optionAProperties. */
        interface WithOptionAProperties {
            /**
             * Specifies the optionAProperties property: option A properties object.
             *
             * @param optionAProperties option A properties object.
             * @return the next definition stage.
             */
            WithCreate withOptionAProperties(ExternalNetworkPropertiesOptionAProperties optionAProperties);
        }

        /** The stage of the ExternalNetwork definition allowing to specify importRoutePolicyId. */
        interface WithImportRoutePolicyId {
            /**
             * Specifies the importRoutePolicyId property: ARM Resource ID of the RoutePolicy. This is used for the
             * backward compatibility..
             *
             * @param importRoutePolicyId ARM Resource ID of the RoutePolicy. This is used for the backward
             *     compatibility.
             * @return the next definition stage.
             */
            WithCreate withImportRoutePolicyId(String importRoutePolicyId);
        }

        /** The stage of the ExternalNetwork definition allowing to specify exportRoutePolicyId. */
        interface WithExportRoutePolicyId {
            /**
             * Specifies the exportRoutePolicyId property: ARM Resource ID of the RoutePolicy. This is used for the
             * backward compatibility..
             *
             * @param exportRoutePolicyId ARM Resource ID of the RoutePolicy. This is used for the backward
             *     compatibility.
             * @return the next definition stage.
             */
            WithCreate withExportRoutePolicyId(String exportRoutePolicyId);
        }

        /** The stage of the ExternalNetwork definition allowing to specify importRoutePolicy. */
        interface WithImportRoutePolicy {
            /**
             * Specifies the importRoutePolicy property: Import Route Policy either IPv4 or IPv6..
             *
             * @param importRoutePolicy Import Route Policy either IPv4 or IPv6.
             * @return the next definition stage.
             */
            WithCreate withImportRoutePolicy(ImportRoutePolicy importRoutePolicy);
        }

        /** The stage of the ExternalNetwork definition allowing to specify exportRoutePolicy. */
        interface WithExportRoutePolicy {
            /**
             * Specifies the exportRoutePolicy property: Export Route Policy either IPv4 or IPv6..
             *
             * @param exportRoutePolicy Export Route Policy either IPv4 or IPv6.
             * @return the next definition stage.
             */
            WithCreate withExportRoutePolicy(ExportRoutePolicy exportRoutePolicy);
        }

        /** The stage of the ExternalNetwork definition allowing to specify annotation. */
        interface WithAnnotation {
            /**
             * Specifies the annotation property: Switch configuration description..
             *
             * @param annotation Switch configuration description.
             * @return the next definition stage.
             */
            WithCreate withAnnotation(String annotation);
        }
    }

    /**
     * Begins update for the ExternalNetwork resource.
     *
     * @return the stage of resource update.
     */
    ExternalNetwork.Update update();

    /** The template for ExternalNetwork update. */
    interface Update
        extends UpdateStages.WithPeeringOption,
            UpdateStages.WithOptionBProperties,
            UpdateStages.WithOptionAProperties,
            UpdateStages.WithImportRoutePolicyId,
            UpdateStages.WithExportRoutePolicyId,
            UpdateStages.WithImportRoutePolicy,
            UpdateStages.WithExportRoutePolicy,
            UpdateStages.WithAnnotation {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ExternalNetwork apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ExternalNetwork apply(Context context);
    }

    /** The ExternalNetwork update stages. */
    interface UpdateStages {
        /** The stage of the ExternalNetwork update allowing to specify peeringOption. */
        interface WithPeeringOption {
            /**
             * Specifies the peeringOption property: Peering option list..
             *
             * @param peeringOption Peering option list.
             * @return the next definition stage.
             */
            Update withPeeringOption(PeeringOption peeringOption);
        }

        /** The stage of the ExternalNetwork update allowing to specify optionBProperties. */
        interface WithOptionBProperties {
            /**
             * Specifies the optionBProperties property: option B properties object.
             *
             * @param optionBProperties option B properties object.
             * @return the next definition stage.
             */
            Update withOptionBProperties(L3OptionBProperties optionBProperties);
        }

        /** The stage of the ExternalNetwork update allowing to specify optionAProperties. */
        interface WithOptionAProperties {
            /**
             * Specifies the optionAProperties property: option A properties object.
             *
             * @param optionAProperties option A properties object.
             * @return the next definition stage.
             */
            Update withOptionAProperties(ExternalNetworkPatchPropertiesOptionAProperties optionAProperties);
        }

        /** The stage of the ExternalNetwork update allowing to specify importRoutePolicyId. */
        interface WithImportRoutePolicyId {
            /**
             * Specifies the importRoutePolicyId property: ARM Resource ID of the RoutePolicy. This is used for the
             * backward compatibility..
             *
             * @param importRoutePolicyId ARM Resource ID of the RoutePolicy. This is used for the backward
             *     compatibility.
             * @return the next definition stage.
             */
            Update withImportRoutePolicyId(String importRoutePolicyId);
        }

        /** The stage of the ExternalNetwork update allowing to specify exportRoutePolicyId. */
        interface WithExportRoutePolicyId {
            /**
             * Specifies the exportRoutePolicyId property: ARM Resource ID of the RoutePolicy. This is used for the
             * backward compatibility..
             *
             * @param exportRoutePolicyId ARM Resource ID of the RoutePolicy. This is used for the backward
             *     compatibility.
             * @return the next definition stage.
             */
            Update withExportRoutePolicyId(String exportRoutePolicyId);
        }

        /** The stage of the ExternalNetwork update allowing to specify importRoutePolicy. */
        interface WithImportRoutePolicy {
            /**
             * Specifies the importRoutePolicy property: Import Route Policy either IPv4 or IPv6..
             *
             * @param importRoutePolicy Import Route Policy either IPv4 or IPv6.
             * @return the next definition stage.
             */
            Update withImportRoutePolicy(ImportRoutePolicy importRoutePolicy);
        }

        /** The stage of the ExternalNetwork update allowing to specify exportRoutePolicy. */
        interface WithExportRoutePolicy {
            /**
             * Specifies the exportRoutePolicy property: Export Route Policy either IPv4 or IPv6..
             *
             * @param exportRoutePolicy Export Route Policy either IPv4 or IPv6.
             * @return the next definition stage.
             */
            Update withExportRoutePolicy(ExportRoutePolicy exportRoutePolicy);
        }

        /** The stage of the ExternalNetwork update allowing to specify annotation. */
        interface WithAnnotation {
            /**
             * Specifies the annotation property: Switch configuration description..
             *
             * @param annotation Switch configuration description.
             * @return the next definition stage.
             */
            Update withAnnotation(String annotation);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ExternalNetwork refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ExternalNetwork refresh(Context context);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Executes update operation to enable or disable administrative State for externalNetwork.
     *
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate updateAdministrativeState(UpdateAdministrativeState body);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Executes update operation to enable or disable administrative State for externalNetwork.
     *
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate updateAdministrativeState(UpdateAdministrativeState body, Context context);

    /**
     * Executes Static Route BFD state update operation to the underlying resources.
     *
     * <p>Update Static Route BFD for external Network.
     *
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate updateStaticRouteBfdAdministrativeState(UpdateAdministrativeState body);

    /**
     * Executes Static Route BFD state update operation to the underlying resources.
     *
     * <p>Update Static Route BFD for external Network.
     *
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate updateStaticRouteBfdAdministrativeState(
        UpdateAdministrativeState body, Context context);
}
