// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.HealthReportInner;

/** An instance of this class provides access to all the operations defined in HealthReportOperationsClient. */
public interface HealthReportOperationsClient {
    /**
     * Get health report of resource.
     *
     * @param resourceId The identifier of the resource.
     * @param healthReportName The health report Key - Unique key for the health report type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return health report of resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HealthReportInner> getWithResponse(String resourceId, String healthReportName, Context context);

    /**
     * Get health report of resource.
     *
     * @param resourceId The identifier of the resource.
     * @param healthReportName The health report Key - Unique key for the health report type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return health report of resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HealthReportInner get(String resourceId, String healthReportName);
}
