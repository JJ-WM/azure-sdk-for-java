// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.streamanalytics.fluent.models.PrivateEndpointInner;

/**
 * An immutable client-side representation of PrivateEndpoint.
 */
public interface PrivateEndpoint {
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
     * Gets the properties property: The properties associated with a private endpoint.
     * 
     * @return the properties value.
     */
    PrivateEndpointProperties properties();

    /**
     * Gets the etag property: Unique opaque string (generally a GUID) that represents the metadata state of the
     * resource (private endpoint) and changes whenever the resource is updated. Required on PUT (CreateOrUpdate)
     * requests.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.streamanalytics.fluent.models.PrivateEndpointInner object.
     * 
     * @return the inner object.
     */
    PrivateEndpointInner innerModel();

    /**
     * The entirety of the PrivateEndpoint definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The PrivateEndpoint definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the PrivateEndpoint definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the PrivateEndpoint definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, clusterName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param clusterName The name of the cluster.
             * @return the next definition stage.
             */
            WithCreate withExistingCluster(String resourceGroupName, String clusterName);
        }

        /**
         * The stage of the PrivateEndpoint definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithProperties, DefinitionStages.WithIfMatch, DefinitionStages.WithIfNoneMatch {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            PrivateEndpoint create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PrivateEndpoint create(Context context);
        }

        /**
         * The stage of the PrivateEndpoint definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties associated with a private endpoint..
             * 
             * @param properties The properties associated with a private endpoint.
             * @return the next definition stage.
             */
            WithCreate withProperties(PrivateEndpointProperties properties);
        }

        /**
         * The stage of the PrivateEndpoint definition allowing to specify ifMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The ETag of the resource. Omit this value to always overwrite the current
             * record set. Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes..
             * 
             * @param ifMatch The ETag of the resource. Omit this value to always overwrite the current record set.
             * Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }

        /**
         * The stage of the PrivateEndpoint definition allowing to specify ifNoneMatch.
         */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: Set to '*' to allow a new resource to be created, but to prevent
             * updating an existing record set. Other values will result in a 412 Pre-condition Failed response..
             * 
             * @param ifNoneMatch Set to '*' to allow a new resource to be created, but to prevent updating an existing
             * record set. Other values will result in a 412 Pre-condition Failed response.
             * @return the next definition stage.
             */
            WithCreate withIfNoneMatch(String ifNoneMatch);
        }
    }

    /**
     * Begins update for the PrivateEndpoint resource.
     * 
     * @return the stage of resource update.
     */
    PrivateEndpoint.Update update();

    /**
     * The template for PrivateEndpoint update.
     */
    interface Update extends UpdateStages.WithProperties, UpdateStages.WithIfMatch, UpdateStages.WithIfNoneMatch {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        PrivateEndpoint apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PrivateEndpoint apply(Context context);
    }

    /**
     * The PrivateEndpoint update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the PrivateEndpoint update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties associated with a private endpoint..
             * 
             * @param properties The properties associated with a private endpoint.
             * @return the next definition stage.
             */
            Update withProperties(PrivateEndpointProperties properties);
        }

        /**
         * The stage of the PrivateEndpoint update allowing to specify ifMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The ETag of the resource. Omit this value to always overwrite the current
             * record set. Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes..
             * 
             * @param ifMatch The ETag of the resource. Omit this value to always overwrite the current record set.
             * Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the PrivateEndpoint update allowing to specify ifNoneMatch.
         */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: Set to '*' to allow a new resource to be created, but to prevent
             * updating an existing record set. Other values will result in a 412 Pre-condition Failed response..
             * 
             * @param ifNoneMatch Set to '*' to allow a new resource to be created, but to prevent updating an existing
             * record set. Other values will result in a 412 Pre-condition Failed response.
             * @return the next definition stage.
             */
            Update withIfNoneMatch(String ifNoneMatch);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    PrivateEndpoint refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PrivateEndpoint refresh(Context context);
}
