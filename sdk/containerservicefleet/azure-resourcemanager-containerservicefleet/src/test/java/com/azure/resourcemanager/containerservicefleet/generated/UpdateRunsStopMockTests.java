// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpgradeType;
import com.azure.resourcemanager.containerservicefleet.models.NodeImageSelectionType;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRun;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class UpdateRunsStopMockTests {
    @Test
    public void testStop() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"strategy\":{\"stages\":[{\"name\":\"kotl\",\"groups\":[{\"name\":\"yhgsy\"}],\"afterStageWaitInSeconds\":1150957892}]},\"managedClusterUpdate\":{\"upgrade\":{\"type\":\"NodeImageOnly\",\"kubernetesVersion\":\"ltdtbnnhad\"},\"nodeImageSelection\":{\"type\":\"Consistent\"}},\"status\":{\"status\":{\"startTime\":\"2020-12-23T13:08:39Z\",\"completedTime\":\"2021-09-01T15:57:06Z\",\"state\":\"Stopping\"},\"stages\":[{\"status\":{},\"name\":\"gxqquezik\",\"groups\":[{},{},{},{}],\"afterStageWaitStatus\":{}},{\"status\":{},\"name\":\"allatmelwuipic\",\"groups\":[{},{},{}],\"afterStageWaitStatus\":{}},{\"status\":{},\"name\":\"v\",\"groups\":[{}],\"afterStageWaitStatus\":{}},{\"status\":{},\"name\":\"y\",\"groups\":[{},{},{}],\"afterStageWaitStatus\":{}}],\"nodeImageSelection\":{\"selectedNodeImageVersions\":[{},{}]}}},\"eTag\":\"ueedndrdvs\",\"id\":\"kwqqtchealmf\",\"name\":\"tdaaygdvwvg\",\"type\":\"iohgwxrtfud\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ContainerServiceFleetManager manager =
            ContainerServiceFleetManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        UpdateRun response =
            manager.updateRuns().stop("mwzn", "abikns", "rgjhxb", "dtlwwrlkd", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("kotl", response.strategy().stages().get(0).name());
        Assertions.assertEquals("yhgsy", response.strategy().stages().get(0).groups().get(0).name());
        Assertions.assertEquals(1150957892, response.strategy().stages().get(0).afterStageWaitInSeconds());
        Assertions
            .assertEquals(ManagedClusterUpgradeType.NODE_IMAGE_ONLY, response.managedClusterUpdate().upgrade().type());
        Assertions.assertEquals("ltdtbnnhad", response.managedClusterUpdate().upgrade().kubernetesVersion());
        Assertions
            .assertEquals(
                NodeImageSelectionType.CONSISTENT, response.managedClusterUpdate().nodeImageSelection().type());
    }
}
