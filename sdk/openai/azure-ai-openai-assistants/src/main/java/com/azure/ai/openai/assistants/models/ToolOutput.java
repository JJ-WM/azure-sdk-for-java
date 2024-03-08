// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The data provided during a tool outputs submission to resolve pending tool calls and allow the model to continue.
 */
@Fluent
public final class ToolOutput {

    /*
     * The ID of the tool call being resolved, as provided in the tool calls of a required action from a run.
     */
    @Generated
    @JsonProperty(value = "tool_call_id")
    private String toolCallId;

    /*
     * The output from the tool to be submitted.
     */
    @Generated
    @JsonProperty(value = "output")
    private String output;

    /**
     * Creates an instance of ToolOutput class.
     */
    @Generated
    public ToolOutput() {
    }

    /**
     * Get the toolCallId property: The ID of the tool call being resolved, as provided in the tool calls of a required
     * action from a run.
     *
     * @return the toolCallId value.
     */
    @Generated
    public String getToolCallId() {
        return this.toolCallId;
    }

    /**
     * Set the toolCallId property: The ID of the tool call being resolved, as provided in the tool calls of a required
     * action from a run.
     *
     * @param toolCallId the toolCallId value to set.
     * @return the ToolOutput object itself.
     */
    @Generated
    public ToolOutput setToolCallId(String toolCallId) {
        this.toolCallId = toolCallId;
        return this;
    }

    /**
     * Get the output property: The output from the tool to be submitted.
     *
     * @return the output value.
     */
    @Generated
    public String getOutput() {
        return this.output;
    }

    /**
     * Set the output property: The output from the tool to be submitted.
     *
     * @param output the output value to set.
     * @return the ToolOutput object itself.
     */
    @Generated
    public ToolOutput setOutput(String output) {
        this.output = output;
        return this;
    }
}
