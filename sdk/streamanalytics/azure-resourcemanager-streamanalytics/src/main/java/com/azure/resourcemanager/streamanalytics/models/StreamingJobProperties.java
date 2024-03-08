// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.resourcemanager.streamanalytics.fluent.models.StreamingJobPropertiesInner;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * An immutable client-side representation of StreamingJobProperties.
 */
public interface StreamingJobProperties {
    /**
     * Gets the sku property: Describes the SKU of the streaming job. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the jobId property: A GUID uniquely identifying the streaming job. This GUID is generated upon creation of
     * the streaming job.
     * 
     * @return the jobId value.
     */
    String jobId();

    /**
     * Gets the provisioningState property: Describes the provisioning status of the streaming job.
     * 
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the jobState property: Describes the state of the streaming job.
     * 
     * @return the jobState value.
     */
    String jobState();

    /**
     * Gets the jobType property: Describes the type of the job. Valid modes are `Cloud` and 'Edge'.
     * 
     * @return the jobType value.
     */
    JobType jobType();

    /**
     * Gets the outputStartMode property: This property should only be utilized when it is desired that the job be
     * started immediately upon creation. Value may be JobStartTime, CustomTime, or LastOutputEventTime to indicate
     * whether the starting point of the output event stream should start whenever the job is started, start at a custom
     * user time stamp specified via the outputStartTime property, or start from the last event output time.
     * 
     * @return the outputStartMode value.
     */
    OutputStartMode outputStartMode();

    /**
     * Gets the outputStartTime property: Value is either an ISO-8601 formatted time stamp that indicates the starting
     * point of the output event stream, or null to indicate that the output event stream will start whenever the
     * streaming job is started. This property must have a value if outputStartMode is set to CustomTime.
     * 
     * @return the outputStartTime value.
     */
    OffsetDateTime outputStartTime();

    /**
     * Gets the lastOutputEventTime property: Value is either an ISO-8601 formatted timestamp indicating the last output
     * event time of the streaming job or null indicating that output has not yet been produced. In case of multiple
     * outputs or multiple streams, this shows the latest value in that set.
     * 
     * @return the lastOutputEventTime value.
     */
    OffsetDateTime lastOutputEventTime();

    /**
     * Gets the eventsOutOfOrderPolicy property: Indicates the policy to apply to events that arrive out of order in the
     * input event stream.
     * 
     * @return the eventsOutOfOrderPolicy value.
     */
    EventsOutOfOrderPolicy eventsOutOfOrderPolicy();

    /**
     * Gets the outputErrorPolicy property: Indicates the policy to apply to events that arrive at the output and cannot
     * be written to the external storage due to being malformed (missing column values, column values of wrong type or
     * size).
     * 
     * @return the outputErrorPolicy value.
     */
    OutputErrorPolicy outputErrorPolicy();

    /**
     * Gets the eventsOutOfOrderMaxDelayInSeconds property: The maximum tolerable delay in seconds where out-of-order
     * events can be adjusted to be back in order.
     * 
     * @return the eventsOutOfOrderMaxDelayInSeconds value.
     */
    Integer eventsOutOfOrderMaxDelayInSeconds();

    /**
     * Gets the eventsLateArrivalMaxDelayInSeconds property: The maximum tolerable delay in seconds where events
     * arriving late could be included. Supported range is -1 to 1814399 (20.23:59:59 days) and -1 is used to specify
     * wait indefinitely. If the property is absent, it is interpreted to have a value of -1.
     * 
     * @return the eventsLateArrivalMaxDelayInSeconds value.
     */
    Integer eventsLateArrivalMaxDelayInSeconds();

    /**
     * Gets the dataLocale property: The data locale of the stream analytics job. Value should be the name of a
     * supported .NET Culture from the set
     * https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx. Defaults to 'en-US' if
     * none specified.
     * 
     * @return the dataLocale value.
     */
    String dataLocale();

    /**
     * Gets the compatibilityLevel property: Controls certain runtime behaviors of the streaming job.
     * 
     * @return the compatibilityLevel value.
     */
    CompatibilityLevel compatibilityLevel();

    /**
     * Gets the createdDate property: Value is an ISO-8601 formatted UTC timestamp indicating when the streaming job was
     * created.
     * 
     * @return the createdDate value.
     */
    OffsetDateTime createdDate();

    /**
     * Gets the inputs property: A list of one or more inputs to the streaming job. The name property for each input is
     * required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation.
     * You must use the PATCH API available for the individual input.
     * 
     * @return the inputs value.
     */
    List<Input> inputs();

    /**
     * Gets the transformation property: Indicates the query and the number of streaming units to use for the streaming
     * job. The name property of the transformation is required when specifying this property in a PUT request. This
     * property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual
     * transformation.
     * 
     * @return the transformation value.
     */
    Transformation transformation();

    /**
     * Gets the outputs property: A list of one or more outputs for the streaming job. The name property for each output
     * is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation.
     * You must use the PATCH API available for the individual output.
     * 
     * @return the outputs value.
     */
    List<Output> outputs();

    /**
     * Gets the functions property: A list of one or more functions for the streaming job. The name property for each
     * function is required when specifying this property in a PUT request. This property cannot be modify via a PATCH
     * operation. You must use the PATCH API available for the individual transformation.
     * 
     * @return the functions value.
     */
    List<Function> functions();

    /**
     * Gets the etag property: The current entity tag for the streaming job. This is an opaque string. You can use it to
     * detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match
     * headers for write operations for optimistic concurrency.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the jobStorageAccount property: The properties that are associated with an Azure Storage account with MSI.
     * 
     * @return the jobStorageAccount value.
     */
    JobStorageAccount jobStorageAccount();

    /**
     * Gets the contentStoragePolicy property: Valid values are JobStorageAccount and SystemAccount. If set to
     * JobStorageAccount, this requires the user to also specify jobStorageAccount property. .
     * 
     * @return the contentStoragePolicy value.
     */
    ContentStoragePolicy contentStoragePolicy();

    /**
     * Gets the externals property: The storage account where the custom code artifacts are located.
     * 
     * @return the externals value.
     */
    External externals();

    /**
     * Gets the cluster property: The cluster which streaming jobs will run on.
     * 
     * @return the cluster value.
     */
    ClusterInfo cluster();

    /**
     * Gets the inner com.azure.resourcemanager.streamanalytics.fluent.models.StreamingJobPropertiesInner object.
     * 
     * @return the inner object.
     */
    StreamingJobPropertiesInner innerModel();
}
