// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.devcenter.fluent.models.ProjectEnvironmentTypeInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of the project environment type list operation. */
@Immutable
public final class ProjectEnvironmentTypeListResult {
    /*
     * Current page of results.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ProjectEnvironmentTypeInner> value;

    /*
     * URL to get the next set of results if there are any.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Current page of results.
     *
     * @return the value value.
     */
    public List<ProjectEnvironmentTypeInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of results if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}