// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.dynatrace.fluent.models.TagRuleInner;

/** An immutable client-side representation of TagRule. */
public interface TagRule {
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
     * Gets the systemData property: System metadata for this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the logRules property: Set of rules for sending logs for the Monitor resource.
     *
     * @return the logRules value.
     */
    LogRules logRules();

    /**
     * Gets the metricRules property: Set of rules for sending metrics for the Monitor resource.
     *
     * @return the metricRules value.
     */
    MetricRules metricRules();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.dynatrace.fluent.models.TagRuleInner object.
     *
     * @return the inner object.
     */
    TagRuleInner innerModel();

    /** The entirety of the TagRule definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The TagRule definition stages. */
    interface DefinitionStages {
        /** The first stage of the TagRule definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the TagRule definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, monitorName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param monitorName Monitor resource name.
             * @return the next definition stage.
             */
            WithCreate withExistingMonitor(String resourceGroupName, String monitorName);
        }

        /**
         * The stage of the TagRule definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithLogRules, DefinitionStages.WithMetricRules {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            TagRule create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            TagRule create(Context context);
        }

        /** The stage of the TagRule definition allowing to specify logRules. */
        interface WithLogRules {
            /**
             * Specifies the logRules property: Set of rules for sending logs for the Monitor resource..
             *
             * @param logRules Set of rules for sending logs for the Monitor resource.
             * @return the next definition stage.
             */
            WithCreate withLogRules(LogRules logRules);
        }

        /** The stage of the TagRule definition allowing to specify metricRules. */
        interface WithMetricRules {
            /**
             * Specifies the metricRules property: Set of rules for sending metrics for the Monitor resource..
             *
             * @param metricRules Set of rules for sending metrics for the Monitor resource.
             * @return the next definition stage.
             */
            WithCreate withMetricRules(MetricRules metricRules);
        }
    }

    /**
     * Begins update for the TagRule resource.
     *
     * @return the stage of resource update.
     */
    TagRule.Update update();

    /** The template for TagRule update. */
    interface Update extends UpdateStages.WithLogRules, UpdateStages.WithMetricRules {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        TagRule apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        TagRule apply(Context context);
    }

    /** The TagRule update stages. */
    interface UpdateStages {
        /** The stage of the TagRule update allowing to specify logRules. */
        interface WithLogRules {
            /**
             * Specifies the logRules property: Set of rules for sending logs for the Monitor resource..
             *
             * @param logRules Set of rules for sending logs for the Monitor resource.
             * @return the next definition stage.
             */
            Update withLogRules(LogRules logRules);
        }

        /** The stage of the TagRule update allowing to specify metricRules. */
        interface WithMetricRules {
            /**
             * Specifies the metricRules property: Set of rules for sending metrics for the Monitor resource..
             *
             * @param metricRules Set of rules for sending metrics for the Monitor resource.
             * @return the next definition stage.
             */
            Update withMetricRules(MetricRules metricRules);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    TagRule refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    TagRule refresh(Context context);
}
