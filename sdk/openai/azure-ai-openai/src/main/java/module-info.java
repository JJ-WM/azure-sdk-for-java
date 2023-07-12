// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.ai.openai {
    requires transitive com.azure.core;
    requires transitive com.azure.core.experimental;

    exports com.azure.ai.openai;
    exports com.azure.ai.openai.models;

    opens com.azure.ai.openai.models to
            com.azure.core,
            com.fasterxml.jackson.databind;
}
