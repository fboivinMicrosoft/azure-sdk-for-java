// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.ApplyArtifactsRequest;
import com.azure.resourcemanager.devtestlabs.models.ArtifactInstallProperties;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ApplyArtifactsRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplyArtifactsRequest model =
            BinaryData
                .fromString(
                    "{\"artifacts\":[{\"artifactId\":\"bimhtmwwinhe\",\"artifactTitle\":\"qpofvwbc\",\"parameters\":[],\"status\":\"b\",\"deploymentStatusMessage\":\"bwvqvxkdi\",\"vmExtensionStatusMessage\":\"ihebwtsw\",\"installTime\":\"2021-08-25T07:52:53Z\"}]}")
                .toObject(ApplyArtifactsRequest.class);
        Assertions.assertEquals("bimhtmwwinhe", model.artifacts().get(0).artifactId());
        Assertions.assertEquals("qpofvwbc", model.artifacts().get(0).artifactTitle());
        Assertions.assertEquals("b", model.artifacts().get(0).status());
        Assertions.assertEquals("bwvqvxkdi", model.artifacts().get(0).deploymentStatusMessage());
        Assertions.assertEquals("ihebwtsw", model.artifacts().get(0).vmExtensionStatusMessage());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-25T07:52:53Z"), model.artifacts().get(0).installTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplyArtifactsRequest model =
            new ApplyArtifactsRequest()
                .withArtifacts(
                    Arrays
                        .asList(
                            new ArtifactInstallProperties()
                                .withArtifactId("bimhtmwwinhe")
                                .withArtifactTitle("qpofvwbc")
                                .withParameters(Arrays.asList())
                                .withStatus("b")
                                .withDeploymentStatusMessage("bwvqvxkdi")
                                .withVmExtensionStatusMessage("ihebwtsw")
                                .withInstallTime(OffsetDateTime.parse("2021-08-25T07:52:53Z"))));
        model = BinaryData.fromObject(model).toObject(ApplyArtifactsRequest.class);
        Assertions.assertEquals("bimhtmwwinhe", model.artifacts().get(0).artifactId());
        Assertions.assertEquals("qpofvwbc", model.artifacts().get(0).artifactTitle());
        Assertions.assertEquals("b", model.artifacts().get(0).status());
        Assertions.assertEquals("bwvqvxkdi", model.artifacts().get(0).deploymentStatusMessage());
        Assertions.assertEquals("ihebwtsw", model.artifacts().get(0).vmExtensionStatusMessage());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-25T07:52:53Z"), model.artifacts().get(0).installTime());
    }
}
