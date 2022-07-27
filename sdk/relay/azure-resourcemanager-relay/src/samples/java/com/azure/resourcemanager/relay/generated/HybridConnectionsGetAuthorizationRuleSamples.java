// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated;

import com.azure.core.util.Context;

/** Samples for HybridConnections GetAuthorizationRule. */
public final class HybridConnectionsGetAuthorizationRuleSamples {
    /*
     * x-ms-original-file: specification/relay/resource-manager/Microsoft.Relay/stable/2017-04-01/examples/HybridConnection/RelayHybridConnectionAutorizationRuleGet.json
     */
    /**
     * Sample code: RelayHybridConnectionAutorizationRuleGet.
     *
     * @param manager Entry point to RelayManager.
     */
    public static void relayHybridConnectionAutorizationRuleGet(com.azure.resourcemanager.relay.RelayManager manager) {
        manager
            .hybridConnections()
            .getAuthorizationRuleWithResponse(
                "resourcegroup",
                "example-RelayNamespace-01",
                "example-Relay-Hybrid-01",
                "example-RelayAuthRules-01",
                Context.NONE);
    }
}