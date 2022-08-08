// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.automanage.fluent.HciReportsClient;
import com.azure.resourcemanager.automanage.fluent.models.ReportInner;
import com.azure.resourcemanager.automanage.models.ReportList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in HciReportsClient. */
public final class HciReportsClientImpl implements HciReportsClient {
    /** The proxy service used to perform REST calls. */
    private final HciReportsService service;

    /** The service client containing this operation class. */
    private final AutomanageClientImpl client;

    /**
     * Initializes an instance of HciReportsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    HciReportsClientImpl(AutomanageClientImpl client) {
        this.service =
            RestProxy.create(HciReportsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutomanageClientHciReports to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutomanageClientHciR")
    private interface HciReportsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.AzureStackHci"
                + "/clusters/{clusterName}/providers/Microsoft.Automanage/configurationProfileAssignments"
                + "/{configurationProfileAssignmentName}/reports/{reportName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ReportInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("clusterName") String clusterName,
            @PathParam("configurationProfileAssignmentName") String configurationProfileAssignmentName,
            @PathParam("reportName") String reportName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.AzureStackHci"
                + "/clusters/{clusterName}/providers/Microsoft.Automanage/configurationProfileAssignments"
                + "/{configurationProfileAssignmentName}/reports")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ReportList>> listByConfigurationProfileAssignments(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("clusterName") String clusterName,
            @PathParam("configurationProfileAssignmentName") String configurationProfileAssignmentName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get information about a report associated with a configuration profile assignment run.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName The configuration profile assignment name.
     * @param reportName The report name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a report associated with a configuration profile assignment run along with {@link
     *     Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ReportInner>> getWithResponseAsync(
        String resourceGroupName, String clusterName, String configurationProfileAssignmentName, String reportName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        if (configurationProfileAssignmentName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter configurationProfileAssignmentName is required and cannot be null."));
        }
        if (reportName == null) {
            return Mono.error(new IllegalArgumentException("Parameter reportName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            clusterName,
                            configurationProfileAssignmentName,
                            reportName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get information about a report associated with a configuration profile assignment run.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName The configuration profile assignment name.
     * @param reportName The report name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a report associated with a configuration profile assignment run along with {@link
     *     Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ReportInner>> getWithResponseAsync(
        String resourceGroupName,
        String clusterName,
        String configurationProfileAssignmentName,
        String reportName,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        if (configurationProfileAssignmentName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter configurationProfileAssignmentName is required and cannot be null."));
        }
        if (reportName == null) {
            return Mono.error(new IllegalArgumentException("Parameter reportName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                this.client.getSubscriptionId(),
                clusterName,
                configurationProfileAssignmentName,
                reportName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Get information about a report associated with a configuration profile assignment run.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName The configuration profile assignment name.
     * @param reportName The report name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a report associated with a configuration profile assignment run on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ReportInner> getAsync(
        String resourceGroupName, String clusterName, String configurationProfileAssignmentName, String reportName) {
        return getWithResponseAsync(resourceGroupName, clusterName, configurationProfileAssignmentName, reportName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get information about a report associated with a configuration profile assignment run.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName The configuration profile assignment name.
     * @param reportName The report name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a report associated with a configuration profile assignment run.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ReportInner get(
        String resourceGroupName, String clusterName, String configurationProfileAssignmentName, String reportName) {
        return getAsync(resourceGroupName, clusterName, configurationProfileAssignmentName, reportName).block();
    }

    /**
     * Get information about a report associated with a configuration profile assignment run.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName The configuration profile assignment name.
     * @param reportName The report name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a report associated with a configuration profile assignment run along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ReportInner> getWithResponse(
        String resourceGroupName,
        String clusterName,
        String configurationProfileAssignmentName,
        String reportName,
        Context context) {
        return getWithResponseAsync(
                resourceGroupName, clusterName, configurationProfileAssignmentName, reportName, context)
            .block();
    }

    /**
     * Retrieve a list of reports within a given configuration profile assignment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName The configuration profile assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the list report operation along with {@link PagedResponse} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ReportInner>> listByConfigurationProfileAssignmentsSinglePageAsync(
        String resourceGroupName, String clusterName, String configurationProfileAssignmentName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        if (configurationProfileAssignmentName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter configurationProfileAssignmentName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByConfigurationProfileAssignments(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            clusterName,
                            configurationProfileAssignmentName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<ReportInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieve a list of reports within a given configuration profile assignment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName The configuration profile assignment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the list report operation along with {@link PagedResponse} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ReportInner>> listByConfigurationProfileAssignmentsSinglePageAsync(
        String resourceGroupName, String clusterName, String configurationProfileAssignmentName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        if (configurationProfileAssignmentName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter configurationProfileAssignmentName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByConfigurationProfileAssignments(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                clusterName,
                configurationProfileAssignmentName,
                this.client.getApiVersion(),
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Retrieve a list of reports within a given configuration profile assignment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName The configuration profile assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the list report operation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ReportInner> listByConfigurationProfileAssignmentsAsync(
        String resourceGroupName, String clusterName, String configurationProfileAssignmentName) {
        return new PagedFlux<>(
            () ->
                listByConfigurationProfileAssignmentsSinglePageAsync(
                    resourceGroupName, clusterName, configurationProfileAssignmentName));
    }

    /**
     * Retrieve a list of reports within a given configuration profile assignment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName The configuration profile assignment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the list report operation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ReportInner> listByConfigurationProfileAssignmentsAsync(
        String resourceGroupName, String clusterName, String configurationProfileAssignmentName, Context context) {
        return new PagedFlux<>(
            () ->
                listByConfigurationProfileAssignmentsSinglePageAsync(
                    resourceGroupName, clusterName, configurationProfileAssignmentName, context));
    }

    /**
     * Retrieve a list of reports within a given configuration profile assignment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName The configuration profile assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the list report operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ReportInner> listByConfigurationProfileAssignments(
        String resourceGroupName, String clusterName, String configurationProfileAssignmentName) {
        return new PagedIterable<>(
            listByConfigurationProfileAssignmentsAsync(
                resourceGroupName, clusterName, configurationProfileAssignmentName));
    }

    /**
     * Retrieve a list of reports within a given configuration profile assignment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName The configuration profile assignment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the list report operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ReportInner> listByConfigurationProfileAssignments(
        String resourceGroupName, String clusterName, String configurationProfileAssignmentName, Context context) {
        return new PagedIterable<>(
            listByConfigurationProfileAssignmentsAsync(
                resourceGroupName, clusterName, configurationProfileAssignmentName, context));
    }
}