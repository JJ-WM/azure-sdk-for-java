// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.sas;

import com.azure.storage.common.sas.BaseSasQueryParameters;
import com.azure.storage.common.sas.SasProtocol;
import com.azure.storage.common.implementation.Constants;
import com.azure.storage.common.sas.SasIpRange;
import com.azure.storage.queue.QueueClientBuilder;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Represents the components that make up an Azure Storage SAS' query parameters. This type is not constructed directly
 * by the user; it is only generated by the {@link QueueServiceSasSignatureValues} type. Once generated, it can be set
 * on a {@link QueueClientBuilder} object to be constructed as part of a URL or it can be encoded into a {@code String}
 * and appended to a URL directly (though caution should be taken here in case there are existing query parameters,
 * which might affect the appropriate means of appending these query parameters). NOTE: Instances of this class are
 * immutable to ensure thread safety.
 * @deprecated Please use the generateSas method on the desired queue client after initializing
 * {@link QueueServiceSasSignatureValues}.
 */
@Deprecated
public final class QueueServiceSasQueryParameters extends BaseSasQueryParameters {

    private final String identifier;

    /**
     * Creates a new {@link QueueServiceSasQueryParameters} object.
     *
     * @param queryParametersMap All query parameters for the request as key-value pairs
     * @param removeSasParametersFromMap When {@code true}, the SAS query parameters will be removed from
     * {@code queryParametersMap}
     * @deprecated Please use {@link QueueServiceSasSignatureValues}
     */
    @Deprecated
    public QueueServiceSasQueryParameters(Map<String, String[]> queryParametersMap,
        boolean removeSasParametersFromMap) {
        super(queryParametersMap, removeSasParametersFromMap);

        this.identifier = getQueryParameter(queryParametersMap, Constants.UrlConstants.SAS_SIGNED_IDENTIFIER,
            removeSasParametersFromMap);
    }


    /**
     * Creates a new {@link QueueServiceSasQueryParameters} object. These objects are only created internally by
     * SASSignatureValues classes.
     *
     * @param version A {@code String} representing the storage version.
     * @param protocol A {@code String} representing the allowed HTTP protocol(s) or {@code null}.
     * @param startTime A {@code java.util.Date} representing the start time for this SAS token or {@code null}.
     * @param expiryTime A {@code java.util.Date} representing the expiry time for this SAS token.
     * @param sasIpRange A {@link SasIpRange} representing the range of valid IP addresses for this SAS token or
     * {@code null}.
     * @param identifier A {@code String} representing the signed identifier (only for Service SAS) or {@code null}.
     * @param permissions A {@code String} representing the storage permissions or {@code null}.
     * @param signature A {@code String} representing the signature for the SAS token.
     * @deprecated Please use {@link QueueServiceSasSignatureValues}
     */
    @Deprecated
    QueueServiceSasQueryParameters(String version, SasProtocol protocol, OffsetDateTime startTime,
        OffsetDateTime expiryTime, SasIpRange sasIpRange, String identifier, String permissions, String signature) {
        super(version, protocol, startTime, expiryTime, sasIpRange, permissions, signature);

        this.identifier = identifier;
    }

    /**
     * Gets the signed identifier (only for {@link QueueServiceSasSignatureValues}) or {@code null}.
     *
     * @return The signed identifier (only for {@link QueueServiceSasSignatureValues}) or {@code null}. Please see
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/establishing-a-stored-access-policy">here</a>
     * for more information.
     * @deprecated Please use {@link QueueServiceSasSignatureValues}
     */
    @Deprecated
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Encodes all SAS query parameters into a string that can be appended to a URL.
     *
     * @return A {@code String} representing the SAS query parameters.
     * @deprecated Please use the generateSas method on the desired queue client after initializing
     * {@link QueueServiceSasSignatureValues}.
     */
    @Deprecated
    public String encode() {
        /*
         We should be url-encoding each key and each value, but because we know all the keys and values will encode to
         themselves, we cheat except for the signature value.
         */
        StringBuilder sb = new StringBuilder();

        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SERVICE_VERSION, this.version);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_PROTOCOL, this.protocol);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_START_TIME, formatQueryParameterDate(this.startTime));
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_EXPIRY_TIME, formatQueryParameterDate(this.expiryTime));
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_IP_RANGE, this.sasIpRange);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_IDENTIFIER, this.identifier);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_PERMISSIONS, this.permissions);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNATURE, this.signature);

        return sb.toString();
    }
}
