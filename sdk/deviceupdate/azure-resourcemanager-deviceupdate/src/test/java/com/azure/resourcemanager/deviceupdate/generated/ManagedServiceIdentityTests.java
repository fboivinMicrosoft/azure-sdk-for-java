// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceupdate.models.ManagedServiceIdentity;
import com.azure.resourcemanager.deviceupdate.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.deviceupdate.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ManagedServiceIdentityTests {
    @Test
    public void testDeserialize() {
        ManagedServiceIdentity model =
            BinaryData
                .fromString(
                    "{\"type\":\"SystemAssigned,UserAssigned\",\"userAssignedIdentities\":{\"wfzitonpeqfpjk\":{},\"ofpdvh\":{},\"xypininmayhuybbk\":{},\"epoo\":{}}}")
                .toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.type());
    }

    @Test
    public void testSerialize() {
        ManagedServiceIdentity model =
            new ManagedServiceIdentity()
                .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                .withUserAssignedIdentities(
                    mapOf(
                        "wfzitonpeqfpjk",
                        new UserAssignedIdentity(),
                        "ofpdvh",
                        new UserAssignedIdentity(),
                        "xypininmayhuybbk",
                        new UserAssignedIdentity(),
                        "epoo",
                        new UserAssignedIdentity()));
        model = BinaryData.fromObject(model).toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.type());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}