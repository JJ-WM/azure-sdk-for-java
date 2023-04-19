// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.confidentialledger.fluent.models.ConfidentialLedgerInner;
import java.util.Map;

/** An immutable client-side representation of ConfidentialLedger. */
public interface ConfidentialLedger {
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
     * Gets the runningState property: Object representing RunningState for Ledger.
     *
     * @return the runningState value.
     */
    RunningState runningState();

    /**
     * Gets the properties property: LedgerProperties
     *
     * <p>Properties of Confidential Ledger Resource.
     *
     * @return the properties value.
     */
    LedgerProperties properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the tags property: Additional tags for Confidential Ledger.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

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
     * Gets the inner com.azure.resourcemanager.confidentialledger.fluent.models.ConfidentialLedgerInner object.
     *
     * @return the inner object.
     */
    ConfidentialLedgerInner innerModel();

    /** The entirety of the ConfidentialLedger definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The ConfidentialLedger definition stages. */
    interface DefinitionStages {
        /** The first stage of the ConfidentialLedger definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ConfidentialLedger definition allowing to specify location. */
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
        /** The stage of the ConfidentialLedger definition allowing to specify parent resource. */
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
         * The stage of the ConfidentialLedger definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithRunningState, DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ConfidentialLedger create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ConfidentialLedger create(Context context);
        }
        /** The stage of the ConfidentialLedger definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Additional tags for Confidential Ledger.
             *
             * @param tags Additional tags for Confidential Ledger.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ConfidentialLedger definition allowing to specify runningState. */
        interface WithRunningState {
            /**
             * Specifies the runningState property: Object representing RunningState for Ledger..
             *
             * @param runningState Object representing RunningState for Ledger.
             * @return the next definition stage.
             */
            WithCreate withRunningState(RunningState runningState);
        }
        /** The stage of the ConfidentialLedger definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: LedgerProperties
             *
             * <p>Properties of Confidential Ledger Resource..
             *
             * @param properties LedgerProperties
             *     <p>Properties of Confidential Ledger Resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(LedgerProperties properties);
        }
    }
    /**
     * Begins update for the ConfidentialLedger resource.
     *
     * @return the stage of resource update.
     */
    ConfidentialLedger.Update update();

    /** The template for ConfidentialLedger update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithRunningState, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ConfidentialLedger apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ConfidentialLedger apply(Context context);
    }
    /** The ConfidentialLedger update stages. */
    interface UpdateStages {
        /** The stage of the ConfidentialLedger update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Additional tags for Confidential Ledger.
             *
             * @param tags Additional tags for Confidential Ledger.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the ConfidentialLedger update allowing to specify runningState. */
        interface WithRunningState {
            /**
             * Specifies the runningState property: Object representing RunningState for Ledger..
             *
             * @param runningState Object representing RunningState for Ledger.
             * @return the next definition stage.
             */
            Update withRunningState(RunningState runningState);
        }
        /** The stage of the ConfidentialLedger update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: LedgerProperties
             *
             * <p>Properties of Confidential Ledger Resource..
             *
             * @param properties LedgerProperties
             *     <p>Properties of Confidential Ledger Resource.
             * @return the next definition stage.
             */
            Update withProperties(LedgerProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ConfidentialLedger refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ConfidentialLedger refresh(Context context);
}
