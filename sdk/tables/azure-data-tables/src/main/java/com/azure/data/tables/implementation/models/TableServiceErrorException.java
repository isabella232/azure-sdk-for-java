// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.tables.implementation.models;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/** Exception thrown for an invalid response with TableServiceError information. */
public final class TableServiceErrorException extends HttpResponseException {
    /**
     * Initializes a new instance of the TableServiceErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public TableServiceErrorException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the TableServiceErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public TableServiceErrorException(String message, HttpResponse response, TableServiceError value) {
        super(message, response, value);
    }

    @Override
    public TableServiceError getValue() {
        return (TableServiceError) super.getValue();
    }
}