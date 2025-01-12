// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BackupParameters
 *
 * <p>BackupParameters base.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = BackupParameters.class)
@JsonTypeName("BackupParameters")
@JsonSubTypes({@JsonSubTypes.Type(name = "AzureBackupParams", value = AzureBackupParams.class)})
@Immutable
public class BackupParameters {
    /** Creates an instance of BackupParameters class. */
    public BackupParameters() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
