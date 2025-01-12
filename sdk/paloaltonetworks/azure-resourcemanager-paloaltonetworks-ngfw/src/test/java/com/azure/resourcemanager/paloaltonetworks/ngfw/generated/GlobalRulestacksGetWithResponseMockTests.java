// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DefaultMode;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.GlobalRulestackResource;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ManagedIdentityType;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ScopeType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class GlobalRulestacksGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"panEtag\":\"snfepgfewetwlyx\",\"panLocation\":\"cxy\",\"scope\":\"GLOBAL\",\"associatedSubscriptions\":[\"h\",\"immbcx\",\"h\",\"cporxvxcjz\"],\"description\":\"izxfpxt\",\"defaultMode\":\"FIREWALL\",\"minAppIdVersion\":\"javftjuhdqa\",\"provisioningState\":\"Deleted\",\"securityServices\":{\"vulnerabilityProfile\":\"guwpi\",\"antiSpywareProfile\":\"ajc\",\"antiVirusProfile\":\"m\",\"urlFilteringProfile\":\"hfcf\",\"fileBlockingProfile\":\"rxgkne\",\"dnsSubscription\":\"yinzqodfvpgs\",\"outboundUnTrustCertificate\":\"xgsg\",\"outboundTrustCertificate\":\"fgzdjtxvz\"}},\"location\":\"lbqvgaqvlgafcqu\",\"identity\":{\"tenantId\":\"vetnwsdtutn\",\"principalId\":\"duy\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{}},\"id\":\"yrmewipmvekdx\",\"name\":\"kuqgsjjxundxgket\",\"type\":\"zhhzjhfjmhvvmu\"}";

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

        PaloAltoNetworksNgfwManager manager =
            PaloAltoNetworksNgfwManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        GlobalRulestackResource response =
            manager.globalRulestacks().getWithResponse("fb", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("lbqvgaqvlgafcqu", response.location());
        Assertions.assertEquals(ManagedIdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals("snfepgfewetwlyx", response.panEtag());
        Assertions.assertEquals("cxy", response.panLocation());
        Assertions.assertEquals(ScopeType.GLOBAL, response.scope());
        Assertions.assertEquals("h", response.associatedSubscriptions().get(0));
        Assertions.assertEquals("izxfpxt", response.description());
        Assertions.assertEquals(DefaultMode.FIREWALL, response.defaultMode());
        Assertions.assertEquals("javftjuhdqa", response.minAppIdVersion());
        Assertions.assertEquals("guwpi", response.securityServices().vulnerabilityProfile());
        Assertions.assertEquals("ajc", response.securityServices().antiSpywareProfile());
        Assertions.assertEquals("m", response.securityServices().antiVirusProfile());
        Assertions.assertEquals("hfcf", response.securityServices().urlFilteringProfile());
        Assertions.assertEquals("rxgkne", response.securityServices().fileBlockingProfile());
        Assertions.assertEquals("yinzqodfvpgs", response.securityServices().dnsSubscription());
        Assertions.assertEquals("xgsg", response.securityServices().outboundUnTrustCertificate());
        Assertions.assertEquals("fgzdjtxvz", response.securityServices().outboundTrustCertificate());
    }
}
