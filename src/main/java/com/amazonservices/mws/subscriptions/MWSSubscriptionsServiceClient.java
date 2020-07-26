/*******************************************************************************
 * Copyright 2009-2014 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * MWS Subscriptions Service
 * API Version: 2013-07-01
 * Library Version: 2014-09-30
 * Generated: Tue Sep 16 08:58:06 PDT 2014
 */
package com.amazonservices.mws.subscriptions;

import com.amazonservices.mws.subscriptions.model.*;
import com.amazonservices.mws.client.*;

/**
 * <p>MWSSubscriptionsServiceClient class.</p>
 */
public class MWSSubscriptionsServiceClient implements MWSSubscriptionsService {

    private static final String libraryName = "MWSSubscriptionsService";

    private static final String libraryVersion = "2014-09-30";

    protected String servicePath;

    protected final MwsConnection connection;

    /**
     * <p>Constructor for MWSSubscriptionsServiceClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param config a {@link com.amazonservices.mws.subscriptions.MWSSubscriptionsServiceConfig} object.
     */
    public MWSSubscriptionsServiceClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSSubscriptionsServiceConfig config) {
        connection = config.copyConnection();
        connection.setAwsAccessKeyId(accessKey);
        connection.setAwsSecretKeyId(secretKey);
        connection.setApplicationName(applicationName);
        connection.setApplicationVersion(applicationVersion);
        connection.setLibraryVersion(libraryVersion);
        servicePath = config.getServicePath();
    }

    /**
     * <p>Constructor for MWSSubscriptionsServiceClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param config a {@link com.amazonservices.mws.subscriptions.MWSSubscriptionsServiceConfig} object.
     */
    public MWSSubscriptionsServiceClient(
            String accessKey,
            String secretKey,
            MWSSubscriptionsServiceConfig config) {
        this(accessKey, secretKey, libraryName, libraryVersion, config);
    }

    /**
     * <p>Constructor for MWSSubscriptionsServiceClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     */
    public MWSSubscriptionsServiceClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        this(accessKey, secretKey, applicationName, 
                applicationVersion, new MWSSubscriptionsServiceConfig());
    }

    /** {@inheritDoc} */
    public CreateSubscriptionResponse createSubscription(CreateSubscriptionInput request) {
        return connection.call(
            new RequestType("CreateSubscription", CreateSubscriptionResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public DeleteSubscriptionResponse deleteSubscription(DeleteSubscriptionInput request) {
        return connection.call(
            new RequestType("DeleteSubscription", DeleteSubscriptionResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public DeregisterDestinationResponse deregisterDestination(DeregisterDestinationInput request) {
        return connection.call(
            new RequestType("DeregisterDestination", DeregisterDestinationResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public GetSubscriptionResponse getSubscription(GetSubscriptionInput request) {
        return connection.call(
            new RequestType("GetSubscription", GetSubscriptionResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public ListRegisteredDestinationsResponse listRegisteredDestinations(ListRegisteredDestinationsInput request) {
        return connection.call(
            new RequestType("ListRegisteredDestinations", ListRegisteredDestinationsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public ListSubscriptionsResponse listSubscriptions(ListSubscriptionsInput request) {
        return connection.call(
            new RequestType("ListSubscriptions", ListSubscriptionsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public RegisterDestinationResponse registerDestination(RegisterDestinationInput request) {
        return connection.call(
            new RequestType("RegisterDestination", RegisterDestinationResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public SendTestNotificationToDestinationResponse sendTestNotificationToDestination(SendTestNotificationToDestinationInput request) {
        return connection.call(
            new RequestType("SendTestNotificationToDestination", SendTestNotificationToDestinationResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionInput request) {
        return connection.call(
            new RequestType("UpdateSubscription", UpdateSubscriptionResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) {
        return connection.call(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }

    /**
     * <p>quoteAppName.</p>
     *
     * @param s a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String quoteAppName(String s) {
        return MwsUtl.escapeAppName(s);
    }

    /**
     * <p>quoteAppVersion.</p>
     *
     * @param s a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String quoteAppVersion(String s) {
        return MwsUtl.escapeAppVersion(s);
    }

    /**
     * <p>quoteAttributeName.</p>
     *
     * @param s a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String quoteAttributeName(String s) {
        return MwsUtl.escapeAttributeName(s);
    }

    /**
     * <p>quoteAttributeValue.</p>
     *
     * @param s a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String quoteAttributeValue(String s) {
        return MwsUtl.escapeAttributeValue(s);
    }

    protected static class RequestType implements MwsRequestType {

        private final String operationName;
        private final Class<? extends MWSResponse> responseClass;
        private final String servicePath;

        public RequestType(String operationName, Class<? extends MWSResponse> responseClass, String servicePath) {
            this.operationName = operationName;
            this.responseClass = responseClass;
            this.servicePath = servicePath;
        }

        @Override
        public String getServicePath() {
            return this.servicePath;
        }

        @Override
        public String getOperationName() {
            return this.operationName;
        }

        @Override
        public Class<? extends MwsObject> getResponseClass() {
            return this.responseClass;
        }

        @Override
        public MwsException wrapException(Throwable cause) {
            return new MWSSubscriptionsServiceException(cause);
        }

        @Override
        public void setRHMD(MwsObject response, MwsResponseHeaderMetadata rhmd) {
            ((MWSResponse)response).setResponseHeaderMetadata(new ResponseHeaderMetadata(rhmd));
        }
    }

}
