// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** An action that marks a job as cancelled. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("cancel")
@Fluent
public final class CancelExceptionAction extends ExceptionAction {
    /** Creates an instance of CancelExceptionAction class. */
    public CancelExceptionAction() {}

    /*
     * (Optional) A note that will be appended to the jobs' Notes collection
     * with th current timestamp.
     */
    @JsonProperty(value = "note")
    private String note;

    /*
     * (Optional) Indicates the outcome of the job, populate this field with
     * your own custom values.
     */
    @JsonProperty(value = "dispositionCode")
    private String dispositionCode;

    /**
     * Get the note property: (Optional) A note that will be appended to the jobs' Notes collection with th current
     * timestamp.
     *
     * @return the note value.
     */
    public String getNote() {
        return this.note;
    }

    /**
     * Set the note property: (Optional) A note that will be appended to the jobs' Notes collection with th current
     * timestamp.
     *
     * @param note the note value to set.
     * @return the CancelExceptionAction object itself.
     */
    public CancelExceptionAction setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * Get the dispositionCode property: (Optional) Indicates the outcome of the job, populate this field with your own
     * custom values.
     *
     * @return the dispositionCode value.
     */
    public String getDispositionCode() {
        return this.dispositionCode;
    }

    /**
     * Set the dispositionCode property: (Optional) Indicates the outcome of the job, populate this field with your own
     * custom values.
     *
     * @param dispositionCode the dispositionCode value to set.
     * @return the CancelExceptionAction object itself.
     */
    public CancelExceptionAction setDispositionCode(String dispositionCode) {
        this.dispositionCode = dispositionCode;
        return this;
    }
}
