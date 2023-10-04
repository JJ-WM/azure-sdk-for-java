// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Type of cluster job. */
public final class JobType extends ExpandableStringEnum<JobType> {
    /** Static value FlinkJob for JobType. */
    public static final JobType FLINK_JOB = fromString("FlinkJob");

    /**
     * Creates a new instance of JobType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public JobType() {
    }

    /**
     * Creates or finds a JobType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JobType.
     */
    @JsonCreator
    public static JobType fromString(String name) {
        return fromString(name, JobType.class);
    }

    /**
     * Gets known JobType values.
     *
     * @return known JobType values.
     */
    public static Collection<JobType> values() {
        return values(JobType.class);
    }
}
