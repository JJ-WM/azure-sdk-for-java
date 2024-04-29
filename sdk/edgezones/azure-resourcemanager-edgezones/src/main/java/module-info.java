// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.edgezones {
    requires transitive com.azure.core.management;
    exports com.azure.resourcemanager.edgezones;
    exports com.azure.resourcemanager.edgezones.fluent;
    exports com.azure.resourcemanager.edgezones.fluent.models;
    exports com.azure.resourcemanager.edgezones.models;
    opens com.azure.resourcemanager.edgezones.fluent.models to com.azure.core, com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.edgezones.models to com.azure.core, com.fasterxml.jackson.databind;
}