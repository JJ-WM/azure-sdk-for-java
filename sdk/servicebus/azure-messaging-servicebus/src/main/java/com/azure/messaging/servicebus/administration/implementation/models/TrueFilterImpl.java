// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.servicebus.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.List;

/** The TrueFilter model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("TrueFilter")
@JacksonXmlRootElement(localName = "TrueFilter")
@Fluent
public final class TrueFilterImpl extends SqlFilterImpl {

    /** Creates an instance of TrueFilter class. */
    public TrueFilterImpl() {}

    /** {@inheritDoc} */
    @Override
    public TrueFilterImpl setSqlExpression(String sqlExpression) {
        super.setSqlExpression(sqlExpression);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TrueFilterImpl setCompatibilityLevel(String compatibilityLevel) {
        super.setCompatibilityLevel(compatibilityLevel);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TrueFilterImpl setParameters(List<KeyValueImpl> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TrueFilterImpl setRequiresPreprocessing(Boolean requiresPreprocessing) {
        super.setRequiresPreprocessing(requiresPreprocessing);
        return this;
    }
}
