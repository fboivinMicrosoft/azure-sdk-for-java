// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LoadBalancerType. */
public final class LoadBalancerType extends ExpandableStringEnum<LoadBalancerType> {
    /** Static value ApplicationGateway for LoadBalancerType. */
    public static final LoadBalancerType APPLICATION_GATEWAY = fromString("ApplicationGateway");

    /** Static value LoadBalancer for LoadBalancerType. */
    public static final LoadBalancerType LOAD_BALANCER = fromString("LoadBalancer");

    /**
     * Creates or finds a LoadBalancerType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LoadBalancerType.
     */
    @JsonCreator
    public static LoadBalancerType fromString(String name) {
        return fromString(name, LoadBalancerType.class);
    }

    /**
     * Gets known LoadBalancerType values.
     *
     * @return known LoadBalancerType values.
     */
    public static Collection<LoadBalancerType> values() {
        return values(LoadBalancerType.class);
    }
}