// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of the create certificate operation. */
@Fluent
public final class CertificateCreateOrUpdateProperties {
    /*
     * Gets or sets the base64 encoded value of the certificate.
     */
    @JsonProperty(value = "base64Value", required = true)
    private String base64Value;

    /*
     * Gets or sets the description of the certificate.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Gets or sets the thumbprint of the certificate.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /*
     * Gets or sets the is exportable flag of the certificate.
     */
    @JsonProperty(value = "isExportable")
    private Boolean isExportable;

    /**
     * Get the base64Value property: Gets or sets the base64 encoded value of the certificate.
     *
     * @return the base64Value value.
     */
    public String base64Value() {
        return this.base64Value;
    }

    /**
     * Set the base64Value property: Gets or sets the base64 encoded value of the certificate.
     *
     * @param base64Value the base64Value value to set.
     * @return the CertificateCreateOrUpdateProperties object itself.
     */
    public CertificateCreateOrUpdateProperties withBase64Value(String base64Value) {
        this.base64Value = base64Value;
        return this;
    }

    /**
     * Get the description property: Gets or sets the description of the certificate.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Gets or sets the description of the certificate.
     *
     * @param description the description value to set.
     * @return the CertificateCreateOrUpdateProperties object itself.
     */
    public CertificateCreateOrUpdateProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the thumbprint property: Gets or sets the thumbprint of the certificate.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: Gets or sets the thumbprint of the certificate.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the CertificateCreateOrUpdateProperties object itself.
     */
    public CertificateCreateOrUpdateProperties withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the isExportable property: Gets or sets the is exportable flag of the certificate.
     *
     * @return the isExportable value.
     */
    public Boolean isExportable() {
        return this.isExportable;
    }

    /**
     * Set the isExportable property: Gets or sets the is exportable flag of the certificate.
     *
     * @param isExportable the isExportable value to set.
     * @return the CertificateCreateOrUpdateProperties object itself.
     */
    public CertificateCreateOrUpdateProperties withIsExportable(Boolean isExportable) {
        this.isExportable = isExportable;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (base64Value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property base64Value in model CertificateCreateOrUpdateProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CertificateCreateOrUpdateProperties.class);
}