// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** Initializes a new instance of the ArtifactsClient type. */
public final class ArtifactsClientImpl {
    /** The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net. */
    private final String endpoint;

    /**
     * Gets The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The LinkConnectionsImpl object to access its operations. */
    private final LinkConnectionsImpl linkConnections;

    /**
     * Gets the LinkConnectionsImpl object to access its operations.
     *
     * @return the LinkConnectionsImpl object.
     */
    public LinkConnectionsImpl getLinkConnections() {
        return this.linkConnections;
    }

    /** The RunNotebooksImpl object to access its operations. */
    private final RunNotebooksImpl runNotebooks;

    /**
     * Gets the RunNotebooksImpl object to access its operations.
     *
     * @return the RunNotebooksImpl object.
     */
    public RunNotebooksImpl getRunNotebooks() {
        return this.runNotebooks;
    }

    /** The KqlScriptsImpl object to access its operations. */
    private final KqlScriptsImpl kqlScripts;

    /**
     * Gets the KqlScriptsImpl object to access its operations.
     *
     * @return the KqlScriptsImpl object.
     */
    public KqlScriptsImpl getKqlScripts() {
        return this.kqlScripts;
    }

    /** The KqlScriptsOperationsImpl object to access its operations. */
    private final KqlScriptsOperationsImpl kqlScriptsOperations;

    /**
     * Gets the KqlScriptsOperationsImpl object to access its operations.
     *
     * @return the KqlScriptsOperationsImpl object.
     */
    public KqlScriptsOperationsImpl getKqlScriptsOperations() {
        return this.kqlScriptsOperations;
    }

    /** The MetastoresImpl object to access its operations. */
    private final MetastoresImpl metastores;

    /**
     * Gets the MetastoresImpl object to access its operations.
     *
     * @return the MetastoresImpl object.
     */
    public MetastoresImpl getMetastores() {
        return this.metastores;
    }

    /** The SparkConfigurationsImpl object to access its operations. */
    private final SparkConfigurationsImpl sparkConfigurations;

    /**
     * Gets the SparkConfigurationsImpl object to access its operations.
     *
     * @return the SparkConfigurationsImpl object.
     */
    public SparkConfigurationsImpl getSparkConfigurations() {
        return this.sparkConfigurations;
    }

    /** The BigDataPoolsImpl object to access its operations. */
    private final BigDataPoolsImpl bigDataPools;

    /**
     * Gets the BigDataPoolsImpl object to access its operations.
     *
     * @return the BigDataPoolsImpl object.
     */
    public BigDataPoolsImpl getBigDataPools() {
        return this.bigDataPools;
    }

    /** The DataFlowsImpl object to access its operations. */
    private final DataFlowsImpl dataFlows;

    /**
     * Gets the DataFlowsImpl object to access its operations.
     *
     * @return the DataFlowsImpl object.
     */
    public DataFlowsImpl getDataFlows() {
        return this.dataFlows;
    }

    /** The DataFlowDebugSessionsImpl object to access its operations. */
    private final DataFlowDebugSessionsImpl dataFlowDebugSessions;

    /**
     * Gets the DataFlowDebugSessionsImpl object to access its operations.
     *
     * @return the DataFlowDebugSessionsImpl object.
     */
    public DataFlowDebugSessionsImpl getDataFlowDebugSessions() {
        return this.dataFlowDebugSessions;
    }

    /** The DatasetsImpl object to access its operations. */
    private final DatasetsImpl datasets;

    /**
     * Gets the DatasetsImpl object to access its operations.
     *
     * @return the DatasetsImpl object.
     */
    public DatasetsImpl getDatasets() {
        return this.datasets;
    }

    /** The WorkspaceGitRepoManagementsImpl object to access its operations. */
    private final WorkspaceGitRepoManagementsImpl workspaceGitRepoManagements;

    /**
     * Gets the WorkspaceGitRepoManagementsImpl object to access its operations.
     *
     * @return the WorkspaceGitRepoManagementsImpl object.
     */
    public WorkspaceGitRepoManagementsImpl getWorkspaceGitRepoManagements() {
        return this.workspaceGitRepoManagements;
    }

    /** The IntegrationRuntimesImpl object to access its operations. */
    private final IntegrationRuntimesImpl integrationRuntimes;

    /**
     * Gets the IntegrationRuntimesImpl object to access its operations.
     *
     * @return the IntegrationRuntimesImpl object.
     */
    public IntegrationRuntimesImpl getIntegrationRuntimes() {
        return this.integrationRuntimes;
    }

    /** The LibrariesImpl object to access its operations. */
    private final LibrariesImpl libraries;

    /**
     * Gets the LibrariesImpl object to access its operations.
     *
     * @return the LibrariesImpl object.
     */
    public LibrariesImpl getLibraries() {
        return this.libraries;
    }

    /** The LinkedServicesImpl object to access its operations. */
    private final LinkedServicesImpl linkedServices;

    /**
     * Gets the LinkedServicesImpl object to access its operations.
     *
     * @return the LinkedServicesImpl object.
     */
    public LinkedServicesImpl getLinkedServices() {
        return this.linkedServices;
    }

    /** The NotebooksImpl object to access its operations. */
    private final NotebooksImpl notebooks;

    /**
     * Gets the NotebooksImpl object to access its operations.
     *
     * @return the NotebooksImpl object.
     */
    public NotebooksImpl getNotebooks() {
        return this.notebooks;
    }

    /** The NotebookOperationResultsImpl object to access its operations. */
    private final NotebookOperationResultsImpl notebookOperationResults;

    /**
     * Gets the NotebookOperationResultsImpl object to access its operations.
     *
     * @return the NotebookOperationResultsImpl object.
     */
    public NotebookOperationResultsImpl getNotebookOperationResults() {
        return this.notebookOperationResults;
    }

    /** The PipelinesImpl object to access its operations. */
    private final PipelinesImpl pipelines;

    /**
     * Gets the PipelinesImpl object to access its operations.
     *
     * @return the PipelinesImpl object.
     */
    public PipelinesImpl getPipelines() {
        return this.pipelines;
    }

    /** The PipelineRunsImpl object to access its operations. */
    private final PipelineRunsImpl pipelineRuns;

    /**
     * Gets the PipelineRunsImpl object to access its operations.
     *
     * @return the PipelineRunsImpl object.
     */
    public PipelineRunsImpl getPipelineRuns() {
        return this.pipelineRuns;
    }

    /** The SparkJobDefinitionsImpl object to access its operations. */
    private final SparkJobDefinitionsImpl sparkJobDefinitions;

    /**
     * Gets the SparkJobDefinitionsImpl object to access its operations.
     *
     * @return the SparkJobDefinitionsImpl object.
     */
    public SparkJobDefinitionsImpl getSparkJobDefinitions() {
        return this.sparkJobDefinitions;
    }

    /** The SqlPoolsImpl object to access its operations. */
    private final SqlPoolsImpl sqlPools;

    /**
     * Gets the SqlPoolsImpl object to access its operations.
     *
     * @return the SqlPoolsImpl object.
     */
    public SqlPoolsImpl getSqlPools() {
        return this.sqlPools;
    }

    /** The SqlScriptsImpl object to access its operations. */
    private final SqlScriptsImpl sqlScripts;

    /**
     * Gets the SqlScriptsImpl object to access its operations.
     *
     * @return the SqlScriptsImpl object.
     */
    public SqlScriptsImpl getSqlScripts() {
        return this.sqlScripts;
    }

    /** The TriggersImpl object to access its operations. */
    private final TriggersImpl triggers;

    /**
     * Gets the TriggersImpl object to access its operations.
     *
     * @return the TriggersImpl object.
     */
    public TriggersImpl getTriggers() {
        return this.triggers;
    }

    /** The TriggerRunsImpl object to access its operations. */
    private final TriggerRunsImpl triggerRuns;

    /**
     * Gets the TriggerRunsImpl object to access its operations.
     *
     * @return the TriggerRunsImpl object.
     */
    public TriggerRunsImpl getTriggerRuns() {
        return this.triggerRuns;
    }

    /** The WorkspacesImpl object to access its operations. */
    private final WorkspacesImpl workspaces;

    /**
     * Gets the WorkspacesImpl object to access its operations.
     *
     * @return the WorkspacesImpl object.
     */
    public WorkspacesImpl getWorkspaces() {
        return this.workspaces;
    }

    /**
     * Initializes an instance of ArtifactsClient client.
     *
     * @param endpoint The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     */
    public ArtifactsClientImpl(String endpoint) {
        this(
                new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                endpoint);
    }

    /**
     * Initializes an instance of ArtifactsClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     */
    public ArtifactsClientImpl(HttpPipeline httpPipeline, String endpoint) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint);
    }

    /**
     * Initializes an instance of ArtifactsClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     */
    public ArtifactsClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.linkConnections = new LinkConnectionsImpl(this);
        this.runNotebooks = new RunNotebooksImpl(this);
        this.kqlScripts = new KqlScriptsImpl(this);
        this.kqlScriptsOperations = new KqlScriptsOperationsImpl(this);
        this.metastores = new MetastoresImpl(this);
        this.sparkConfigurations = new SparkConfigurationsImpl(this);
        this.bigDataPools = new BigDataPoolsImpl(this);
        this.dataFlows = new DataFlowsImpl(this);
        this.dataFlowDebugSessions = new DataFlowDebugSessionsImpl(this);
        this.datasets = new DatasetsImpl(this);
        this.workspaceGitRepoManagements = new WorkspaceGitRepoManagementsImpl(this);
        this.integrationRuntimes = new IntegrationRuntimesImpl(this);
        this.libraries = new LibrariesImpl(this);
        this.linkedServices = new LinkedServicesImpl(this);
        this.notebooks = new NotebooksImpl(this);
        this.notebookOperationResults = new NotebookOperationResultsImpl(this);
        this.pipelines = new PipelinesImpl(this);
        this.pipelineRuns = new PipelineRunsImpl(this);
        this.sparkJobDefinitions = new SparkJobDefinitionsImpl(this);
        this.sqlPools = new SqlPoolsImpl(this);
        this.sqlScripts = new SqlScriptsImpl(this);
        this.triggers = new TriggersImpl(this);
        this.triggerRuns = new TriggerRunsImpl(this);
        this.workspaces = new WorkspacesImpl(this);
    }
}
