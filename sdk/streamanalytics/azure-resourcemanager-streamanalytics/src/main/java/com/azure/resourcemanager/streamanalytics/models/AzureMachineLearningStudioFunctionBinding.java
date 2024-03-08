// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.streamanalytics.fluent.models.AzureMachineLearningStudioFunctionBindingProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * The binding to an Azure Machine Learning Studio.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Microsoft.MachineLearning/WebService")
@Fluent
public final class AzureMachineLearningStudioFunctionBinding extends FunctionBinding {
    /*
     * The binding properties associated with an Azure Machine learning Studio.
     */
    @JsonProperty(value = "properties")
    private AzureMachineLearningStudioFunctionBindingProperties innerProperties;

    /**
     * Creates an instance of AzureMachineLearningStudioFunctionBinding class.
     */
    public AzureMachineLearningStudioFunctionBinding() {
    }

    /**
     * Get the innerProperties property: The binding properties associated with an Azure Machine learning Studio.
     * 
     * @return the innerProperties value.
     */
    private AzureMachineLearningStudioFunctionBindingProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the endpoint property: The Request-Response execute endpoint of the Azure Machine Learning Studio. Find out
     * more here:
     * https://docs.microsoft.com/en-us/azure/machine-learning/machine-learning-consume-web-services#request-response-service-rrs.
     * 
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().endpoint();
    }

    /**
     * Set the endpoint property: The Request-Response execute endpoint of the Azure Machine Learning Studio. Find out
     * more here:
     * https://docs.microsoft.com/en-us/azure/machine-learning/machine-learning-consume-web-services#request-response-service-rrs.
     * 
     * @param endpoint the endpoint value to set.
     * @return the AzureMachineLearningStudioFunctionBinding object itself.
     */
    public AzureMachineLearningStudioFunctionBinding withEndpoint(String endpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureMachineLearningStudioFunctionBindingProperties();
        }
        this.innerProperties().withEndpoint(endpoint);
        return this;
    }

    /**
     * Get the apiKey property: The API key used to authenticate with Request-Response endpoint.
     * 
     * @return the apiKey value.
     */
    public String apiKey() {
        return this.innerProperties() == null ? null : this.innerProperties().apiKey();
    }

    /**
     * Set the apiKey property: The API key used to authenticate with Request-Response endpoint.
     * 
     * @param apiKey the apiKey value to set.
     * @return the AzureMachineLearningStudioFunctionBinding object itself.
     */
    public AzureMachineLearningStudioFunctionBinding withApiKey(String apiKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureMachineLearningStudioFunctionBindingProperties();
        }
        this.innerProperties().withApiKey(apiKey);
        return this;
    }

    /**
     * Get the inputs property: The inputs for the Azure Machine Learning Studio endpoint.
     * 
     * @return the inputs value.
     */
    public AzureMachineLearningStudioInputs inputs() {
        return this.innerProperties() == null ? null : this.innerProperties().inputs();
    }

    /**
     * Set the inputs property: The inputs for the Azure Machine Learning Studio endpoint.
     * 
     * @param inputs the inputs value to set.
     * @return the AzureMachineLearningStudioFunctionBinding object itself.
     */
    public AzureMachineLearningStudioFunctionBinding withInputs(AzureMachineLearningStudioInputs inputs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureMachineLearningStudioFunctionBindingProperties();
        }
        this.innerProperties().withInputs(inputs);
        return this;
    }

    /**
     * Get the outputs property: A list of outputs from the Azure Machine Learning Studio endpoint execution.
     * 
     * @return the outputs value.
     */
    public List<AzureMachineLearningStudioOutputColumn> outputs() {
        return this.innerProperties() == null ? null : this.innerProperties().outputs();
    }

    /**
     * Set the outputs property: A list of outputs from the Azure Machine Learning Studio endpoint execution.
     * 
     * @param outputs the outputs value to set.
     * @return the AzureMachineLearningStudioFunctionBinding object itself.
     */
    public AzureMachineLearningStudioFunctionBinding withOutputs(List<AzureMachineLearningStudioOutputColumn> outputs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureMachineLearningStudioFunctionBindingProperties();
        }
        this.innerProperties().withOutputs(outputs);
        return this;
    }

    /**
     * Get the batchSize property: Number between 1 and 10000 describing maximum number of rows for every Azure ML RRS
     * execute request. Default is 1000.
     * 
     * @return the batchSize value.
     */
    public Integer batchSize() {
        return this.innerProperties() == null ? null : this.innerProperties().batchSize();
    }

    /**
     * Set the batchSize property: Number between 1 and 10000 describing maximum number of rows for every Azure ML RRS
     * execute request. Default is 1000.
     * 
     * @param batchSize the batchSize value to set.
     * @return the AzureMachineLearningStudioFunctionBinding object itself.
     */
    public AzureMachineLearningStudioFunctionBinding withBatchSize(Integer batchSize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureMachineLearningStudioFunctionBindingProperties();
        }
        this.innerProperties().withBatchSize(batchSize);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
