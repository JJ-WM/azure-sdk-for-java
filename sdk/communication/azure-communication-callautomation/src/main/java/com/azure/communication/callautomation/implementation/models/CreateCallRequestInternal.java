// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The request payload for creating the call. */
@Fluent
public final class CreateCallRequestInternal {
    /*
     * The targets of the call.
     */
    @JsonProperty(value = "targets", required = true)
    private List<CommunicationIdentifierModel> targets;

    /*
     * The source caller Id, a phone number, that's shown to the PSTN
     * participant being invited.
     * Required only when calling a PSTN callee.
     */
    @JsonProperty(value = "sourceCallerIdNumber")
    private PhoneNumberIdentifierModel sourceCallerIdNumber;

    /*
     * Display name of the call if dialing out to a pstn number
     */
    @JsonProperty(value = "sourceDisplayName")
    private String sourceDisplayName;

    /*
     * The identifier of the source of the call
     */
    @JsonProperty(value = "sourceIdentity")
    private CommunicationUserIdentifierModel sourceIdentity;

    /*
     * A customer set value used to track the answering of a call.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /*
     * The callback URI.
     */
    @JsonProperty(value = "callbackUri", required = true)
    private String callbackUri;

    /*
     * Media Streaming Configuration.
     */
    @JsonProperty(value = "mediaStreamingConfiguration")
    private MediaStreamingConfigurationInternal mediaStreamingConfiguration;

    /*
     * Live Transcription Configuration.
     */
    @JsonProperty(value = "transcriptionConfiguration")
    private TranscriptionConfiguration transcriptionConfiguration;

    /*
     * The identifier of the Cognitive Service resource assigned to this call.
     */
    @JsonProperty(value = "azureCognitiveServicesEndpointUrl")
    private String azureCognitiveServicesEndpointUrl;

    /*
     * Used by customer to send custom context to targets
     */
    @JsonProperty(value = "customContext")
    private CustomContext customContext;

    /**
     * Get the targets property: The targets of the call.
     *
     * @return the targets value.
     */
    public List<CommunicationIdentifierModel> getTargets() {
        return this.targets;
    }

    /**
     * Set the targets property: The targets of the call.
     *
     * @param targets the targets value to set.
     * @return the CreateCallRequestInternal object itself.
     */
    public CreateCallRequestInternal setTargets(List<CommunicationIdentifierModel> targets) {
        this.targets = targets;
        return this;
    }

    /**
     * Get the sourceCallerIdNumber property: The source caller Id, a phone number, that's shown to the PSTN participant
     * being invited. Required only when calling a PSTN callee.
     *
     * @return the sourceCallerIdNumber value.
     */
    public PhoneNumberIdentifierModel getSourceCallerIdNumber() {
        return this.sourceCallerIdNumber;
    }

    /**
     * Set the sourceCallerIdNumber property: The source caller Id, a phone number, that's shown to the PSTN participant
     * being invited. Required only when calling a PSTN callee.
     *
     * @param sourceCallerIdNumber the sourceCallerIdNumber value to set.
     * @return the CreateCallRequestInternal object itself.
     */
    public CreateCallRequestInternal setSourceCallerIdNumber(PhoneNumberIdentifierModel sourceCallerIdNumber) {
        this.sourceCallerIdNumber = sourceCallerIdNumber;
        return this;
    }

    /**
     * Get the sourceDisplayName property: Display name of the call if dialing out to a pstn number.
     *
     * @return the sourceDisplayName value.
     */
    public String getSourceDisplayName() {
        return this.sourceDisplayName;
    }

    /**
     * Set the sourceDisplayName property: Display name of the call if dialing out to a pstn number.
     *
     * @param sourceDisplayName the sourceDisplayName value to set.
     * @return the CreateCallRequestInternal object itself.
     */
    public CreateCallRequestInternal setSourceDisplayName(String sourceDisplayName) {
        this.sourceDisplayName = sourceDisplayName;
        return this;
    }

    /**
     * Get the sourceIdentity property: The identifier of the source of the call.
     *
     * @return the sourceIdentity value.
     */
    public CommunicationUserIdentifierModel getSourceIdentity() {
        return this.sourceIdentity;
    }

    /**
     * Set the sourceIdentity property: The identifier of the source of the call.
     *
     * @param sourceIdentity the sourceIdentity value to set.
     * @return the CreateCallRequestInternal object itself.
     */
    public CreateCallRequestInternal setSourceIdentity(CommunicationUserIdentifierModel sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
        return this;
    }

    /**
     * Get the operationContext property: A customer set value used to track the answering of a call.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: A customer set value used to track the answering of a call.
     *
     * @param operationContext the operationContext value to set.
     * @return the CreateCallRequestInternal object itself.
     */
    public CreateCallRequestInternal setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }

    /**
     * Get the callbackUri property: The callback URI.
     *
     * @return the callbackUri value.
     */
    public String getCallbackUri() {
        return this.callbackUri;
    }

    /**
     * Set the callbackUri property: The callback URI.
     *
     * @param callbackUri the callbackUri value to set.
     * @return the CreateCallRequestInternal object itself.
     */
    public CreateCallRequestInternal setCallbackUri(String callbackUri) {
        this.callbackUri = callbackUri;
        return this;
    }

    /**
     * Get the mediaStreamingConfiguration property: Media Streaming Configuration.
     *
     * @return the mediaStreamingConfiguration value.
     */
    public MediaStreamingConfigurationInternal getMediaStreamingConfiguration() {
        return this.mediaStreamingConfiguration;
    }

    /**
     * Set the mediaStreamingConfiguration property: Media Streaming Configuration.
     *
     * @param mediaStreamingConfiguration the mediaStreamingConfiguration value to set.
     * @return the CreateCallRequestInternal object itself.
     */
    public CreateCallRequestInternal setMediaStreamingConfiguration(
            MediaStreamingConfigurationInternal mediaStreamingConfiguration) {
        this.mediaStreamingConfiguration = mediaStreamingConfiguration;
        return this;
    }

    /**
     * Get the transcriptionConfiguration property: Live Transcription Configuration.
     *
     * @return the transcriptionConfiguration value.
     */
    public TranscriptionConfiguration getTranscriptionConfiguration() {
        return this.transcriptionConfiguration;
    }

    /**
     * Set the transcriptionConfiguration property: Live Transcription Configuration.
     *
     * @param transcriptionConfiguration the transcriptionConfiguration value to set.
     * @return the CreateCallRequestInternal object itself.
     */
    public CreateCallRequestInternal setTranscriptionConfiguration(
            TranscriptionConfiguration transcriptionConfiguration) {
        this.transcriptionConfiguration = transcriptionConfiguration;
        return this;
    }

    /**
     * Get the azureCognitiveServicesEndpointUrl property: The identifier of the Cognitive Service resource assigned to
     * this call.
     *
     * @return the azureCognitiveServicesEndpointUrl value.
     */
    public String getAzureCognitiveServicesEndpointUrl() {
        return this.azureCognitiveServicesEndpointUrl;
    }

    /**
     * Set the azureCognitiveServicesEndpointUrl property: The identifier of the Cognitive Service resource assigned to
     * this call.
     *
     * @param azureCognitiveServicesEndpointUrl the azureCognitiveServicesEndpointUrl value to set.
     * @return the CreateCallRequestInternal object itself.
     */
    public CreateCallRequestInternal setAzureCognitiveServicesEndpointUrl(String azureCognitiveServicesEndpointUrl) {
        this.azureCognitiveServicesEndpointUrl = azureCognitiveServicesEndpointUrl;
        return this;
    }

    /**
     * Get the customContext property: Used by customer to send custom context to targets.
     *
     * @return the customContext value.
     */
    public CustomContext getCustomContext() {
        return this.customContext;
    }

    /**
     * Set the customContext property: Used by customer to send custom context to targets.
     *
     * @param customContext the customContext value to set.
     * @return the CreateCallRequestInternal object itself.
     */
    public CreateCallRequestInternal setCustomContext(CustomContext customContext) {
        this.customContext = customContext;
        return this;
    }
}
