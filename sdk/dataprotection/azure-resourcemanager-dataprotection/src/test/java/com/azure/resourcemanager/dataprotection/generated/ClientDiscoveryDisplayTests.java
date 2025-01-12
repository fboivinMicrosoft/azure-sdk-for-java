// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.ClientDiscoveryDisplay;
import org.junit.jupiter.api.Assertions;

public final class ClientDiscoveryDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClientDiscoveryDisplay model =
            BinaryData
                .fromString(
                    "{\"description\":\"hezrkgq\",\"operation\":\"jrefovgmkqsle\",\"provider\":\"vxyqjpkcattpngjc\",\"resource\":\"czsqpjhvm\"}")
                .toObject(ClientDiscoveryDisplay.class);
        Assertions.assertEquals("hezrkgq", model.description());
        Assertions.assertEquals("jrefovgmkqsle", model.operation());
        Assertions.assertEquals("vxyqjpkcattpngjc", model.provider());
        Assertions.assertEquals("czsqpjhvm", model.resource());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClientDiscoveryDisplay model =
            new ClientDiscoveryDisplay()
                .withDescription("hezrkgq")
                .withOperation("jrefovgmkqsle")
                .withProvider("vxyqjpkcattpngjc")
                .withResource("czsqpjhvm");
        model = BinaryData.fromObject(model).toObject(ClientDiscoveryDisplay.class);
        Assertions.assertEquals("hezrkgq", model.description());
        Assertions.assertEquals("jrefovgmkqsle", model.operation());
        Assertions.assertEquals("vxyqjpkcattpngjc", model.provider());
        Assertions.assertEquals("czsqpjhvm", model.resource());
    }
}
