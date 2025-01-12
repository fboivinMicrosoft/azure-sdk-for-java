// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Protocol to be verified on. */
public final class IpFlowProtocol extends ExpandableStringEnum<IpFlowProtocol> {
    /** Static value TCP for IpFlowProtocol. */
    public static final IpFlowProtocol TCP = fromString("TCP");

    /** Static value UDP for IpFlowProtocol. */
    public static final IpFlowProtocol UDP = fromString("UDP");

    /**
     * Creates a new instance of IpFlowProtocol value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IpFlowProtocol() {
    }

    /**
     * Creates or finds a IpFlowProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IpFlowProtocol.
     */
    @JsonCreator
    public static IpFlowProtocol fromString(String name) {
        return fromString(name, IpFlowProtocol.class);
    }

    /**
     * Gets known IpFlowProtocol values.
     *
     * @return known IpFlowProtocol values.
     */
    public static Collection<IpFlowProtocol> values() {
        return values(IpFlowProtocol.class);
    }
}
