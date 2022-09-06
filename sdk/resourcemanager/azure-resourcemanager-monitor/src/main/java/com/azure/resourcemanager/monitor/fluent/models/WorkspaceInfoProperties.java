// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Resource properties. */
@Fluent
public final class WorkspaceInfoProperties {
    /*
     * Log Analytics workspace identifier.
     */
    @JsonProperty(value = "customerId", required = true)
    private String customerId;

    /**
     * Get the customerId property: Log Analytics workspace identifier.
     *
     * @return the customerId value.
     */
    public String customerId() {
        return this.customerId;
    }

    /**
     * Set the customerId property: Log Analytics workspace identifier.
     *
     * @param customerId the customerId value to set.
     * @return the WorkspaceInfoProperties object itself.
     */
    public WorkspaceInfoProperties withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customerId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property customerId in model WorkspaceInfoProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WorkspaceInfoProperties.class);
}