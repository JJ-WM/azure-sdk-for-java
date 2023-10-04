// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.monitor.query;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.monitor.query.models.MetricResult;
import com.azure.monitor.query.models.MetricsBatchResult;
import com.azure.monitor.query.models.MetricsQueryOptions;
import com.azure.monitor.query.models.QueryTimeInterval;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit tests for {@link MetricsBatchQueryClient}.
 */
public class MetricsBatchQueryClientTest extends MetricsBatchQueryTestBase {

    @Test
    public void testMetricsBatchQuery() {
        MetricsBatchQueryClient metricsBatchQueryClient = clientBuilder
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
            .buildClient();
        String resourceId = Configuration.getGlobalConfiguration().get("AZURE_MONITOR_METRICS_RESOURCE_URI_2", FAKE_RESOURCE_ID);
        resourceId = resourceId.substring(resourceId.indexOf("/subscriptions"));

        try {
            configClient.getConfigurationSetting("foo", "bar");
        } catch (HttpResponseException exception) {
            // ignore as this is only to generate some metrics
        }

        MetricsQueryOptions options = new MetricsQueryOptions()
            .setGranularity(Duration.ofMinutes(15))
            .setTop(10)
            .setTimeInterval(new QueryTimeInterval(OffsetDateTime.now().minusDays(1), OffsetDateTime.now()));

        MetricsBatchResult metricsQueryResults = metricsBatchQueryClient.queryBatchWithResponse(
                Arrays.asList(resourceId),
                Arrays.asList("HttpIncomingRequestCount"), "microsoft.appconfiguration/configurationstores", options, Context.NONE)
            .getValue();
        assertEquals(1, metricsQueryResults.getMetricsQueryResults().size());
        assertEquals(1, metricsQueryResults.getMetricsQueryResults().get(0).getMetrics().size());
        MetricResult metricResult = metricsQueryResults.getMetricsQueryResults().get(0).getMetrics().get(0);
        assertEquals("HttpIncomingRequestCount", metricResult.getMetricName());
        assertFalse(CoreUtils.isNullOrEmpty(metricResult.getTimeSeries()));
    }

    @Test
    public void testMetricsBatchQueryDifferentResourceTypes() {
        MetricsBatchQueryClient metricsBatchQueryClient = clientBuilder
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
            .buildClient();
        String resourceId1 = Configuration.getGlobalConfiguration().get("AZURE_MONITOR_METRICS_RESOURCE_URI_1", FAKE_RESOURCE_ID);
        String resourceId2 = Configuration.getGlobalConfiguration().get("AZURE_MONITOR_METRICS_RESOURCE_URI_2", FAKE_RESOURCE_ID);
        String updatedResource1 = resourceId1.substring(resourceId1.indexOf("/subscriptions"));
        String updatedResource2 = resourceId2.substring(resourceId2.indexOf("/subscriptions"));

        assertThrows(HttpResponseException.class, () -> metricsBatchQueryClient.queryBatch(
            Arrays.asList(updatedResource1, updatedResource2),
            Arrays.asList("Successful Requests"), " Microsoft.Eventhub/Namespaces"));

    }

}
