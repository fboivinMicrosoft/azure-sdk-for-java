// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.NotificationChannelProperties;
import com.azure.resourcemanager.devtestlabs.models.Event;
import com.azure.resourcemanager.devtestlabs.models.NotificationChannelEventType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NotificationChannelPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NotificationChannelProperties model =
            BinaryData
                .fromString(
                    "{\"webHookUrl\":\"qxvcxgfrpdsofb\",\"emailRecipient\":\"rnsvbuswd\",\"notificationLocale\":\"yybyc\",\"description\":\"nvjsrtkfa\",\"events\":[{\"eventName\":\"AutoShutdown\"},{\"eventName\":\"Cost\"},{\"eventName\":\"Cost\"},{\"eventName\":\"AutoShutdown\"}],\"createdDate\":\"2021-09-23T00:06:59Z\",\"provisioningState\":\"dyuxzej\",\"uniqueIdentifier\":\"psew\"}")
                .toObject(NotificationChannelProperties.class);
        Assertions.assertEquals("qxvcxgfrpdsofb", model.webhookUrl());
        Assertions.assertEquals("rnsvbuswd", model.emailRecipient());
        Assertions.assertEquals("yybyc", model.notificationLocale());
        Assertions.assertEquals("nvjsrtkfa", model.description());
        Assertions.assertEquals(NotificationChannelEventType.AUTO_SHUTDOWN, model.events().get(0).eventName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NotificationChannelProperties model =
            new NotificationChannelProperties()
                .withWebhookUrl("qxvcxgfrpdsofb")
                .withEmailRecipient("rnsvbuswd")
                .withNotificationLocale("yybyc")
                .withDescription("nvjsrtkfa")
                .withEvents(
                    Arrays
                        .asList(
                            new Event().withEventName(NotificationChannelEventType.AUTO_SHUTDOWN),
                            new Event().withEventName(NotificationChannelEventType.COST),
                            new Event().withEventName(NotificationChannelEventType.COST),
                            new Event().withEventName(NotificationChannelEventType.AUTO_SHUTDOWN)));
        model = BinaryData.fromObject(model).toObject(NotificationChannelProperties.class);
        Assertions.assertEquals("qxvcxgfrpdsofb", model.webhookUrl());
        Assertions.assertEquals("rnsvbuswd", model.emailRecipient());
        Assertions.assertEquals("yybyc", model.notificationLocale());
        Assertions.assertEquals("nvjsrtkfa", model.description());
        Assertions.assertEquals(NotificationChannelEventType.AUTO_SHUTDOWN, model.events().get(0).eventName());
    }
}
