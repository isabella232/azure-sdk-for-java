// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PercentileMetricValue model. */
@Immutable
public final class PercentileMetricValue extends MetricValue {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PercentileMetricValue.class);

    /*
     * The 10th percentile value for the metric.
     */
    @JsonProperty(value = "P10", access = JsonProperty.Access.WRITE_ONLY)
    private Double p10;

    /*
     * The 25th percentile value for the metric.
     */
    @JsonProperty(value = "P25", access = JsonProperty.Access.WRITE_ONLY)
    private Double p25;

    /*
     * The 50th percentile value for the metric.
     */
    @JsonProperty(value = "P50", access = JsonProperty.Access.WRITE_ONLY)
    private Double p50;

    /*
     * The 75th percentile value for the metric.
     */
    @JsonProperty(value = "P75", access = JsonProperty.Access.WRITE_ONLY)
    private Double p75;

    /*
     * The 90th percentile value for the metric.
     */
    @JsonProperty(value = "P90", access = JsonProperty.Access.WRITE_ONLY)
    private Double p90;

    /*
     * The 95th percentile value for the metric.
     */
    @JsonProperty(value = "P95", access = JsonProperty.Access.WRITE_ONLY)
    private Double p95;

    /*
     * The 99th percentile value for the metric.
     */
    @JsonProperty(value = "P99", access = JsonProperty.Access.WRITE_ONLY)
    private Double p99;

    /**
     * Get the p10 property: The 10th percentile value for the metric.
     *
     * @return the p10 value.
     */
    public Double p10() {
        return this.p10;
    }

    /**
     * Get the p25 property: The 25th percentile value for the metric.
     *
     * @return the p25 value.
     */
    public Double p25() {
        return this.p25;
    }

    /**
     * Get the p50 property: The 50th percentile value for the metric.
     *
     * @return the p50 value.
     */
    public Double p50() {
        return this.p50;
    }

    /**
     * Get the p75 property: The 75th percentile value for the metric.
     *
     * @return the p75 value.
     */
    public Double p75() {
        return this.p75;
    }

    /**
     * Get the p90 property: The 90th percentile value for the metric.
     *
     * @return the p90 value.
     */
    public Double p90() {
        return this.p90;
    }

    /**
     * Get the p95 property: The 95th percentile value for the metric.
     *
     * @return the p95 value.
     */
    public Double p95() {
        return this.p95;
    }

    /**
     * Get the p99 property: The 99th percentile value for the metric.
     *
     * @return the p99 value.
     */
    public Double p99() {
        return this.p99;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}