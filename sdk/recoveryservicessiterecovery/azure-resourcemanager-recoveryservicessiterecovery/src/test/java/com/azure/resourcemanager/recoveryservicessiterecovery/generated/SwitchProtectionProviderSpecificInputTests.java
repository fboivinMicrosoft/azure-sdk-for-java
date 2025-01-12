// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SwitchProtectionProviderSpecificInput;

public final class SwitchProtectionProviderSpecificInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SwitchProtectionProviderSpecificInput model =
            BinaryData
                .fromString("{\"instanceType\":\"SwitchProtectionProviderSpecificInput\"}")
                .toObject(SwitchProtectionProviderSpecificInput.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SwitchProtectionProviderSpecificInput model = new SwitchProtectionProviderSpecificInput();
        model = BinaryData.fromObject(model).toObject(SwitchProtectionProviderSpecificInput.class);
    }
}
