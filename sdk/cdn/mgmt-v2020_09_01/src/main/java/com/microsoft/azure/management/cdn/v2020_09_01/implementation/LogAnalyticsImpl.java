/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cdn.v2020_09_01.LogAnalytics;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.cdn.v2020_09_01.MetricsResponse;
import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.cdn.v2020_09_01.RankingsResponse;
import com.microsoft.azure.management.cdn.v2020_09_01.ContinentsResponse;
import com.microsoft.azure.management.cdn.v2020_09_01.ResourcesResponse;
import com.microsoft.azure.management.cdn.v2020_09_01.WafMetricsResponse;
import com.microsoft.azure.management.cdn.v2020_09_01.WafRankingsResponse;

class LogAnalyticsImpl extends WrapperImpl<LogAnalyticsInner> implements LogAnalytics {
    private final CdnManager manager;

    LogAnalyticsImpl(CdnManager manager) {
        super(manager.inner().logAnalytics());
        this.manager = manager;
    }

    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public Observable<MetricsResponse> getLogAnalyticsMetricsAsync(String resourceGroupName, String profileName, List<String> metrics, DateTime dateTimeBegin, DateTime dateTimeEnd, String granularity) {
        LogAnalyticsInner client = this.inner();
        return client.getLogAnalyticsMetricsAsync(resourceGroupName, profileName, metrics, dateTimeBegin, dateTimeEnd, granularity)
        .map(new Func1<MetricsResponseInner, MetricsResponse>() {
            @Override
            public MetricsResponse call(MetricsResponseInner inner) {
                return new MetricsResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RankingsResponse> getLogAnalyticsRankingsAsync(String resourceGroupName, String profileName, List<String> rankings, List<String> metrics, double maxRanking, DateTime dateTimeBegin, DateTime dateTimeEnd) {
        LogAnalyticsInner client = this.inner();
        return client.getLogAnalyticsRankingsAsync(resourceGroupName, profileName, rankings, metrics, maxRanking, dateTimeBegin, dateTimeEnd)
        .map(new Func1<RankingsResponseInner, RankingsResponse>() {
            @Override
            public RankingsResponse call(RankingsResponseInner inner) {
                return new RankingsResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ContinentsResponse> getLogAnalyticsLocationsAsync(String resourceGroupName, String profileName) {
        LogAnalyticsInner client = this.inner();
        return client.getLogAnalyticsLocationsAsync(resourceGroupName, profileName)
        .map(new Func1<ContinentsResponseInner, ContinentsResponse>() {
            @Override
            public ContinentsResponse call(ContinentsResponseInner inner) {
                return new ContinentsResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ResourcesResponse> getLogAnalyticsResourcesAsync(String resourceGroupName, String profileName) {
        LogAnalyticsInner client = this.inner();
        return client.getLogAnalyticsResourcesAsync(resourceGroupName, profileName)
        .map(new Func1<ResourcesResponseInner, ResourcesResponse>() {
            @Override
            public ResourcesResponse call(ResourcesResponseInner inner) {
                return new ResourcesResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<WafMetricsResponse> getWafLogAnalyticsMetricsAsync(String resourceGroupName, String profileName, List<String> metrics, DateTime dateTimeBegin, DateTime dateTimeEnd, String granularity) {
        LogAnalyticsInner client = this.inner();
        return client.getWafLogAnalyticsMetricsAsync(resourceGroupName, profileName, metrics, dateTimeBegin, dateTimeEnd, granularity)
        .map(new Func1<WafMetricsResponseInner, WafMetricsResponse>() {
            @Override
            public WafMetricsResponse call(WafMetricsResponseInner inner) {
                return new WafMetricsResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<WafRankingsResponse> getWafLogAnalyticsRankingsAsync(String resourceGroupName, String profileName, List<String> metrics, DateTime dateTimeBegin, DateTime dateTimeEnd, double maxRanking, List<String> rankings) {
        LogAnalyticsInner client = this.inner();
        return client.getWafLogAnalyticsRankingsAsync(resourceGroupName, profileName, metrics, dateTimeBegin, dateTimeEnd, maxRanking, rankings)
        .map(new Func1<WafRankingsResponseInner, WafRankingsResponse>() {
            @Override
            public WafRankingsResponse call(WafRankingsResponseInner inner) {
                return new WafRankingsResponseImpl(inner, manager());
            }
        });
    }

}
