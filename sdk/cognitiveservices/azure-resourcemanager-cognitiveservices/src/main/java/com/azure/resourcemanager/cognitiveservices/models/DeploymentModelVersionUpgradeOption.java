// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Deployment model version upgrade option. */
public final class DeploymentModelVersionUpgradeOption
    extends ExpandableStringEnum<DeploymentModelVersionUpgradeOption> {
    /** Static value OnceNewDefaultVersionAvailable for DeploymentModelVersionUpgradeOption. */
    public static final DeploymentModelVersionUpgradeOption ONCE_NEW_DEFAULT_VERSION_AVAILABLE =
        fromString("OnceNewDefaultVersionAvailable");

    /** Static value OnceCurrentVersionExpired for DeploymentModelVersionUpgradeOption. */
    public static final DeploymentModelVersionUpgradeOption ONCE_CURRENT_VERSION_EXPIRED =
        fromString("OnceCurrentVersionExpired");

    /** Static value NoAutoUpgrade for DeploymentModelVersionUpgradeOption. */
    public static final DeploymentModelVersionUpgradeOption NO_AUTO_UPGRADE = fromString("NoAutoUpgrade");

    /**
     * Creates a new instance of DeploymentModelVersionUpgradeOption value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DeploymentModelVersionUpgradeOption() {
    }

    /**
     * Creates or finds a DeploymentModelVersionUpgradeOption from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeploymentModelVersionUpgradeOption.
     */
    @JsonCreator
    public static DeploymentModelVersionUpgradeOption fromString(String name) {
        return fromString(name, DeploymentModelVersionUpgradeOption.class);
    }

    /**
     * Gets known DeploymentModelVersionUpgradeOption values.
     *
     * @return known DeploymentModelVersionUpgradeOption values.
     */
    public static Collection<DeploymentModelVersionUpgradeOption> values() {
        return values(DeploymentModelVersionUpgradeOption.class);
    }
}
