// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PasswordCredentialListResult model. */
@Fluent
public final class PasswordCredentialListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PasswordCredentialListResultInner.class);

    /*
     * A collection of PasswordCredentials.
     */
    @JsonProperty(value = "value")
    private List<PasswordCredentialInner> value;

    /**
     * Get the value property: A collection of PasswordCredentials.
     *
     * @return the value value.
     */
    public List<PasswordCredentialInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of PasswordCredentials.
     *
     * @param value the value value to set.
     * @return the PasswordCredentialListResultInner object itself.
     */
    public PasswordCredentialListResultInner withValue(List<PasswordCredentialInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}