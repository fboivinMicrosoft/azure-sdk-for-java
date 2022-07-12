// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.confidentialledger;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous ConfidentialLedgerClient type. */
@ServiceClient(builder = ConfidentialLedgerClientBuilder.class)
public final class ConfidentialLedgerClient {
    @Generated private final ConfidentialLedgerAsyncClient client;

    /**
     * Initializes an instance of ConfidentialLedgerClient class.
     *
     * @param client the async client.
     */
    @Generated
    ConfidentialLedgerClient(ConfidentialLedgerAsyncClient client) {
        this.client = client;
    }

    /**
     * The constitution is a script that assesses and applies proposals from consortium members.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     digest: String
     *     script: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the governance script for the application along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getConstitutionWithResponse(RequestOptions requestOptions) {
        return this.client.getConstitutionWithResponse(requestOptions).block();
    }

    /**
     * Consortium members can manage the Confidential Ledger.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     members: [
     *         {
     *             certificate: String
     *             id: String
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return list of members in the consortium along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getConsortiumMembersWithResponse(RequestOptions requestOptions) {
        return this.client.getConsortiumMembersWithResponse(requestOptions).block();
    }

    /**
     * A quote is an SGX enclave measurement that can be used to verify the validity of a node and its enclave.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     currentNodeId: String
     *     enclaveQuotes: {
     *         String: {
     *             nodeId: String
     *             mrenclave: String
     *             quoteVersion: String
     *             raw: String
     *         }
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return information about the enclaves running the Confidential Ledger along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getEnclaveQuotesWithResponse(RequestOptions requestOptions) {
        return this.client.getEnclaveQuotesWithResponse(requestOptions).block();
    }

    /**
     * Collection ids are user-created collections of ledger entries.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     collections: [
     *         {
     *             collectionId: String
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a group of ledger collections along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> listCollectionsWithResponse(RequestOptions requestOptions) {
        return this.client.listCollectionsWithResponse(requestOptions).block();
    }

    /**
     * A collection id may optionally be specified. Only entries in the specified (or default) collection will be
     * returned.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>collectionId</td><td>String</td><td>No</td><td>The collection id.</td></tr>
     *     <tr><td>fromTransactionId</td><td>String</td><td>No</td><td>Specify the first transaction ID in a range.</td></tr>
     *     <tr><td>toTransactionId</td><td>String</td><td>No</td><td>Specify the last transaction ID in a range.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     state: String(Loading/Ready)
     *     nextLink: String
     *     entries: [
     *         {
     *             contents: String
     *             collectionId: String
     *             transactionId: String
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paginated ledger entries returned in response to a query as paginated response with {@link
     *     PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listLedgerEntries(RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.listLedgerEntries(requestOptions));
    }

    /**
     * A collection id may optionally be specified.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>collectionId</td><td>String</td><td>No</td><td>The collection id.</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     contents: String
     *     collectionId: String
     *     transactionId: String
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     collectionId: String
     * }
     * }</pre>
     *
     * @param entry Ledger entry.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return returned as a result of a write to the Confidential Ledger, the transaction id in the response indicates
     *     when the write will become durable along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> postLedgerEntryWithResponse(BinaryData entry, RequestOptions requestOptions) {
        return this.client.postLedgerEntryWithResponse(entry, requestOptions).block();
    }

    /**
     * To return older ledger entries, the relevant sections of the ledger must be read from disk and validated. To
     * prevent blocking within the enclave, the response will indicate whether the entry is ready and part of the
     * response, or if the loading is still ongoing.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>collectionId</td><td>String</td><td>No</td><td>The collection id.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     state: String(Loading/Ready)
     *     entry: {
     *         contents: String
     *         collectionId: String
     *         transactionId: String
     *     }
     * }
     * }</pre>
     *
     * @param transactionId Identifies a write transaction.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of querying for a ledger entry from an older transaction id along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getLedgerEntryWithResponse(String transactionId, RequestOptions requestOptions) {
        return this.client.getLedgerEntryWithResponse(transactionId, requestOptions).block();
    }

    /**
     * Gets a receipt certifying ledger contents at a particular transaction id.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     receipt: {
     *         cert: String
     *         leaf: String
     *         leafComponents: {
     *             claimsDigest: String
     *             commitEvidence: String
     *             writeSetDigest: String
     *         }
     *         nodeId: String
     *         proof: [
     *             {
     *                 left: String
     *                 right: String
     *             }
     *         ]
     *         root: String
     *         serviceEndorsements: [
     *             String
     *         ]
     *         signature: String
     *     }
     *     state: String(Loading/Ready)
     *     transactionId: String
     * }
     * }</pre>
     *
     * @param transactionId Identifies a write transaction.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a receipt certifying ledger contents at a particular transaction id along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getReceiptWithResponse(String transactionId, RequestOptions requestOptions) {
        return this.client.getReceiptWithResponse(transactionId, requestOptions).block();
    }

    /**
     * Gets the status of an entry identified by a transaction id.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     state: String(Committed/Pending)
     *     transactionId: String
     * }
     * }</pre>
     *
     * @param transactionId Identifies a write transaction.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the status of an entry identified by a transaction id along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getTransactionStatusWithResponse(String transactionId, RequestOptions requestOptions) {
        return this.client.getTransactionStatusWithResponse(transactionId, requestOptions).block();
    }

    /**
     * A collection id may optionally be specified.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>collectionId</td><td>String</td><td>No</td><td>The collection id.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     contents: String
     *     collectionId: String
     *     transactionId: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return an entry in the ledger along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getCurrentLedgerEntryWithResponse(RequestOptions requestOptions) {
        return this.client.getCurrentLedgerEntryWithResponse(requestOptions).block();
    }

    /**
     * Deletes a user from the Confidential Ledger.
     *
     * @param userId The user id, either an AAD object ID or certificate fingerprint.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteUserWithResponse(String userId, RequestOptions requestOptions) {
        return this.client.deleteUserWithResponse(userId, requestOptions).block();
    }

    /**
     * Gets a user.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     assignedRole: String(Administrator/Contributor/Reader)
     *     userId: String
     * }
     * }</pre>
     *
     * @param userId The user id, either an AAD object ID or certificate fingerprint.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a user along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getUserWithResponse(String userId, RequestOptions requestOptions) {
        return this.client.getUserWithResponse(userId, requestOptions).block();
    }

    /**
     * A JSON merge patch is applied for existing users.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     assignedRole: String(Administrator/Contributor/Reader)
     *     userId: String
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     assignedRole: String(Administrator/Contributor/Reader)
     *     userId: String
     * }
     * }</pre>
     *
     * @param userId The user id, either an AAD object ID or certificate fingerprint.
     * @param userDetails Details about a Confidential Ledger user.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return details about a Confidential Ledger user along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateUserWithResponse(
            String userId, BinaryData userDetails, RequestOptions requestOptions) {
        return this.client.createOrUpdateUserWithResponse(userId, userDetails, requestOptions).block();
    }
}