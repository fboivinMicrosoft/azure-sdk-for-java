// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the buildDocumentModel operation. */
public final class BuildDocumentModelResponse extends ResponseBase<BuildDocumentModelHeaders, Void> {
    /**
     * Creates an instance of BuildDocumentModelResponse.
     *
     * @param request the request which resulted in this BuildDocumentModelResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BuildDocumentModelResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Void value,
            BuildDocumentModelHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}