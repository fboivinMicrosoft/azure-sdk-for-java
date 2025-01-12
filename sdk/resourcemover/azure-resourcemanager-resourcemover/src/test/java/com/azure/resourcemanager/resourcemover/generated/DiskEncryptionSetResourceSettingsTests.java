// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.DiskEncryptionSetResourceSettings;
import org.junit.jupiter.api.Assertions;

public final class DiskEncryptionSetResourceSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiskEncryptionSetResourceSettings model =
            BinaryData
                .fromString(
                    "{\"resourceType\":\"Microsoft.Compute/diskEncryptionSets\",\"targetResourceName\":\"bexrmcq\"}")
                .toObject(DiskEncryptionSetResourceSettings.class);
        Assertions.assertEquals("bexrmcq", model.targetResourceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiskEncryptionSetResourceSettings model =
            new DiskEncryptionSetResourceSettings().withTargetResourceName("bexrmcq");
        model = BinaryData.fromObject(model).toObject(DiskEncryptionSetResourceSettings.class);
        Assertions.assertEquals("bexrmcq", model.targetResourceName());
    }
}
