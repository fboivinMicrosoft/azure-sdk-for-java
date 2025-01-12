// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Solution Invocation with additional params needed for invocation. */
@Fluent
public final class DiagnosticInvocation {
    /*
     * Solution Id to invoke.
     */
    @JsonProperty(value = "solutionId")
    private String solutionId;

    /*
     * Additional parameters required to invoke the solutionId.
     */
    @JsonProperty(value = "additionalParameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> additionalParameters;

    /** Creates an instance of DiagnosticInvocation class. */
    public DiagnosticInvocation() {
    }

    /**
     * Get the solutionId property: Solution Id to invoke.
     *
     * @return the solutionId value.
     */
    public String solutionId() {
        return this.solutionId;
    }

    /**
     * Set the solutionId property: Solution Id to invoke.
     *
     * @param solutionId the solutionId value to set.
     * @return the DiagnosticInvocation object itself.
     */
    public DiagnosticInvocation withSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }

    /**
     * Get the additionalParameters property: Additional parameters required to invoke the solutionId.
     *
     * @return the additionalParameters value.
     */
    public Map<String, String> additionalParameters() {
        return this.additionalParameters;
    }

    /**
     * Set the additionalParameters property: Additional parameters required to invoke the solutionId.
     *
     * @param additionalParameters the additionalParameters value to set.
     * @return the DiagnosticInvocation object itself.
     */
    public DiagnosticInvocation withAdditionalParameters(Map<String, String> additionalParameters) {
        this.additionalParameters = additionalParameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
