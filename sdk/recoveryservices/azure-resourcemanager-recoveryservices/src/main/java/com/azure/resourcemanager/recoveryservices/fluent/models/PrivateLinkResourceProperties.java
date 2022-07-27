// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the private link resource. */
@Immutable
public final class PrivateLinkResourceProperties {
    /*
     * e.g. f9ad6492-33d4-4690-9999-6bfd52a0d081 (Backup) or
     * f9ad6492-33d4-4690-9999-6bfd52a0d082 (SiteRecovery)
     */
    @JsonProperty(value = "groupId", access = JsonProperty.Access.WRITE_ONLY)
    private String groupId;

    /*
     * [backup-ecs1, backup-prot1, backup-prot1b, backup-prot1c, backup-id1]
     */
    @JsonProperty(value = "requiredMembers", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> requiredMembers;

    /*
     * The private link resource Private link DNS zone name.
     */
    @JsonProperty(value = "requiredZoneNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> requiredZoneNames;

    /**
     * Get the groupId property: e.g. f9ad6492-33d4-4690-9999-6bfd52a0d081 (Backup) or
     * f9ad6492-33d4-4690-9999-6bfd52a0d082 (SiteRecovery).
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Get the requiredMembers property: [backup-ecs1, backup-prot1, backup-prot1b, backup-prot1c, backup-id1].
     *
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.requiredMembers;
    }

    /**
     * Get the requiredZoneNames property: The private link resource Private link DNS zone name.
     *
     * @return the requiredZoneNames value.
     */
    public List<String> requiredZoneNames() {
        return this.requiredZoneNames;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}