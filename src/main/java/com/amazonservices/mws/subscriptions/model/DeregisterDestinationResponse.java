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
 * Deregister Destination Response
 * API Version: 2013-07-01
 * Library Version: 2014-09-30
 * Generated: Tue Sep 16 08:58:06 PDT 2014
 */
package com.amazonservices.mws.subscriptions.model;

import com.amazonservices.mws.client.*;

/**
 * DeregisterDestinationResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="DeregisterDestinationResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="DeregisterDestinationResult" type="{http://mws.amazonservices.com/schema/Subscriptions/2013-07-01}DeregisterDestinationResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonservices.com/schema/Subscriptions/2013-07-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class DeregisterDestinationResponse extends AbstractMwsObject implements MWSResponse {

    private DeregisterDestinationResult deregisterDestinationResult;

    private ResponseMetadata responseMetadata;

    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of DeregisterDestinationResult.
     *
     * @return The value of DeregisterDestinationResult.
     */
    public DeregisterDestinationResult getDeregisterDestinationResult() {
        return deregisterDestinationResult;
    }

    /**
     * Set the value of DeregisterDestinationResult.
     *
     * @param deregisterDestinationResult
     *            The new value to set.
     */
    public void setDeregisterDestinationResult(DeregisterDestinationResult deregisterDestinationResult) {
        this.deregisterDestinationResult = deregisterDestinationResult;
    }

    /**
     * Check to see if DeregisterDestinationResult is set.
     *
     * @return true if DeregisterDestinationResult is set.
     */
    public boolean isSetDeregisterDestinationResult() {
        return deregisterDestinationResult != null;
    }

    /**
     * Set the value of DeregisterDestinationResult, return this.
     *
     * @param deregisterDestinationResult
     *             The new value to set.
     * @return This instance.
     */
    public DeregisterDestinationResponse withDeregisterDestinationResult(DeregisterDestinationResult deregisterDestinationResult) {
        this.deregisterDestinationResult = deregisterDestinationResult;
        return this;
    }

    /**
     * Get the value of ResponseMetadata.
     *
     * @return The value of ResponseMetadata.
     */
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Set the value of ResponseMetadata.
     *
     * @param responseMetadata
     *            The new value to set.
     */
    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    /**
     * Check to see if ResponseMetadata is set.
     *
     * @return true if ResponseMetadata is set.
     */
    public boolean isSetResponseMetadata() {
        return responseMetadata != null;
    }

    /**
     * Set the value of ResponseMetadata, return this.
     *
     * @param responseMetadata
     *             The new value to set.
     * @return This instance.
     */
    public DeregisterDestinationResponse withResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
        return this;
    }

    /**
     * Get the value of ResponseHeaderMetadata.
     *
     * @return The value of ResponseHeaderMetadata.
     */
    public ResponseHeaderMetadata getResponseHeaderMetadata() {
        return responseHeaderMetadata;
    }

    /**
     * {@inheritDoc}
     *
     * Set the value of ResponseHeaderMetadata.
     */
    public void setResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
    }

    /**
     * Check to see if ResponseHeaderMetadata is set.
     *
     * @return true if ResponseHeaderMetadata is set.
     */
    public boolean isSetResponseHeaderMetadata() {
        return responseHeaderMetadata != null;
    }

    /**
     * Set the value of ResponseHeaderMetadata, return this.
     *
     * @param responseHeaderMetadata
     *             The new value to set.
     * @return This instance.
     */
    public DeregisterDestinationResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        deregisterDestinationResult = r.read("DeregisterDestinationResult", DeregisterDestinationResult.class);
        responseMetadata = r.read("ResponseMetadata", ResponseMetadata.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("DeregisterDestinationResult", deregisterDestinationResult);
        w.write("ResponseMetadata", responseMetadata);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Subscriptions/2013-07-01", "DeregisterDestinationResponse",this);
    }

    /**
     * Value constructor.
     *
     * @param deregisterDestinationResult a {@link com.amazonservices.mws.subscriptions.model.DeregisterDestinationResult} object.
     * @param responseMetadata a {@link com.amazonservices.mws.subscriptions.model.ResponseMetadata} object.
     */
    public DeregisterDestinationResponse(DeregisterDestinationResult deregisterDestinationResult,ResponseMetadata responseMetadata) {
        this.deregisterDestinationResult = deregisterDestinationResult;
        this.responseMetadata = responseMetadata;
    }    
    

    /**
     * Default constructor.
     */
    public DeregisterDestinationResponse() {
        super();
    }

}
