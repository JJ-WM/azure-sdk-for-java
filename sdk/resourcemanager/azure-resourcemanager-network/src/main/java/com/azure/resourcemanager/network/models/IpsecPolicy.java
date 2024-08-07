// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An IPSec Policy configuration for a virtual network gateway connection.
 */
@Fluent
public final class IpsecPolicy implements JsonSerializable<IpsecPolicy> {
    /*
     * The IPSec Security Association (also called Quick Mode or Phase 2 SA) lifetime in seconds for a site to site VPN
     * tunnel.
     */
    private int saLifeTimeSeconds;

    /*
     * The IPSec Security Association (also called Quick Mode or Phase 2 SA) payload size in KB for a site to site VPN
     * tunnel.
     */
    private int saDataSizeKilobytes;

    /*
     * The IPSec encryption algorithm (IKE phase 1).
     */
    private IpsecEncryption ipsecEncryption;

    /*
     * The IPSec integrity algorithm (IKE phase 1).
     */
    private IpsecIntegrity ipsecIntegrity;

    /*
     * The IKE encryption algorithm (IKE phase 2).
     */
    private IkeEncryption ikeEncryption;

    /*
     * The IKE integrity algorithm (IKE phase 2).
     */
    private IkeIntegrity ikeIntegrity;

    /*
     * The DH Group used in IKE Phase 1 for initial SA.
     */
    private DhGroup dhGroup;

    /*
     * The Pfs Group used in IKE Phase 2 for new child SA.
     */
    private PfsGroup pfsGroup;

    /**
     * Creates an instance of IpsecPolicy class.
     */
    public IpsecPolicy() {
    }

    /**
     * Get the saLifeTimeSeconds property: The IPSec Security Association (also called Quick Mode or Phase 2 SA)
     * lifetime in seconds for a site to site VPN tunnel.
     * 
     * @return the saLifeTimeSeconds value.
     */
    public int saLifeTimeSeconds() {
        return this.saLifeTimeSeconds;
    }

    /**
     * Set the saLifeTimeSeconds property: The IPSec Security Association (also called Quick Mode or Phase 2 SA)
     * lifetime in seconds for a site to site VPN tunnel.
     * 
     * @param saLifeTimeSeconds the saLifeTimeSeconds value to set.
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withSaLifeTimeSeconds(int saLifeTimeSeconds) {
        this.saLifeTimeSeconds = saLifeTimeSeconds;
        return this;
    }

    /**
     * Get the saDataSizeKilobytes property: The IPSec Security Association (also called Quick Mode or Phase 2 SA)
     * payload size in KB for a site to site VPN tunnel.
     * 
     * @return the saDataSizeKilobytes value.
     */
    public int saDataSizeKilobytes() {
        return this.saDataSizeKilobytes;
    }

    /**
     * Set the saDataSizeKilobytes property: The IPSec Security Association (also called Quick Mode or Phase 2 SA)
     * payload size in KB for a site to site VPN tunnel.
     * 
     * @param saDataSizeKilobytes the saDataSizeKilobytes value to set.
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withSaDataSizeKilobytes(int saDataSizeKilobytes) {
        this.saDataSizeKilobytes = saDataSizeKilobytes;
        return this;
    }

    /**
     * Get the ipsecEncryption property: The IPSec encryption algorithm (IKE phase 1).
     * 
     * @return the ipsecEncryption value.
     */
    public IpsecEncryption ipsecEncryption() {
        return this.ipsecEncryption;
    }

    /**
     * Set the ipsecEncryption property: The IPSec encryption algorithm (IKE phase 1).
     * 
     * @param ipsecEncryption the ipsecEncryption value to set.
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withIpsecEncryption(IpsecEncryption ipsecEncryption) {
        this.ipsecEncryption = ipsecEncryption;
        return this;
    }

    /**
     * Get the ipsecIntegrity property: The IPSec integrity algorithm (IKE phase 1).
     * 
     * @return the ipsecIntegrity value.
     */
    public IpsecIntegrity ipsecIntegrity() {
        return this.ipsecIntegrity;
    }

    /**
     * Set the ipsecIntegrity property: The IPSec integrity algorithm (IKE phase 1).
     * 
     * @param ipsecIntegrity the ipsecIntegrity value to set.
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withIpsecIntegrity(IpsecIntegrity ipsecIntegrity) {
        this.ipsecIntegrity = ipsecIntegrity;
        return this;
    }

    /**
     * Get the ikeEncryption property: The IKE encryption algorithm (IKE phase 2).
     * 
     * @return the ikeEncryption value.
     */
    public IkeEncryption ikeEncryption() {
        return this.ikeEncryption;
    }

    /**
     * Set the ikeEncryption property: The IKE encryption algorithm (IKE phase 2).
     * 
     * @param ikeEncryption the ikeEncryption value to set.
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withIkeEncryption(IkeEncryption ikeEncryption) {
        this.ikeEncryption = ikeEncryption;
        return this;
    }

    /**
     * Get the ikeIntegrity property: The IKE integrity algorithm (IKE phase 2).
     * 
     * @return the ikeIntegrity value.
     */
    public IkeIntegrity ikeIntegrity() {
        return this.ikeIntegrity;
    }

    /**
     * Set the ikeIntegrity property: The IKE integrity algorithm (IKE phase 2).
     * 
     * @param ikeIntegrity the ikeIntegrity value to set.
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withIkeIntegrity(IkeIntegrity ikeIntegrity) {
        this.ikeIntegrity = ikeIntegrity;
        return this;
    }

    /**
     * Get the dhGroup property: The DH Group used in IKE Phase 1 for initial SA.
     * 
     * @return the dhGroup value.
     */
    public DhGroup dhGroup() {
        return this.dhGroup;
    }

    /**
     * Set the dhGroup property: The DH Group used in IKE Phase 1 for initial SA.
     * 
     * @param dhGroup the dhGroup value to set.
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withDhGroup(DhGroup dhGroup) {
        this.dhGroup = dhGroup;
        return this;
    }

    /**
     * Get the pfsGroup property: The Pfs Group used in IKE Phase 2 for new child SA.
     * 
     * @return the pfsGroup value.
     */
    public PfsGroup pfsGroup() {
        return this.pfsGroup;
    }

    /**
     * Set the pfsGroup property: The Pfs Group used in IKE Phase 2 for new child SA.
     * 
     * @param pfsGroup the pfsGroup value to set.
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withPfsGroup(PfsGroup pfsGroup) {
        this.pfsGroup = pfsGroup;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipsecEncryption() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property ipsecEncryption in model IpsecPolicy"));
        }
        if (ipsecIntegrity() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property ipsecIntegrity in model IpsecPolicy"));
        }
        if (ikeEncryption() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property ikeEncryption in model IpsecPolicy"));
        }
        if (ikeIntegrity() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property ikeIntegrity in model IpsecPolicy"));
        }
        if (dhGroup() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property dhGroup in model IpsecPolicy"));
        }
        if (pfsGroup() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property pfsGroup in model IpsecPolicy"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IpsecPolicy.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("saLifeTimeSeconds", this.saLifeTimeSeconds);
        jsonWriter.writeIntField("saDataSizeKilobytes", this.saDataSizeKilobytes);
        jsonWriter.writeStringField("ipsecEncryption",
            this.ipsecEncryption == null ? null : this.ipsecEncryption.toString());
        jsonWriter.writeStringField("ipsecIntegrity",
            this.ipsecIntegrity == null ? null : this.ipsecIntegrity.toString());
        jsonWriter.writeStringField("ikeEncryption", this.ikeEncryption == null ? null : this.ikeEncryption.toString());
        jsonWriter.writeStringField("ikeIntegrity", this.ikeIntegrity == null ? null : this.ikeIntegrity.toString());
        jsonWriter.writeStringField("dhGroup", this.dhGroup == null ? null : this.dhGroup.toString());
        jsonWriter.writeStringField("pfsGroup", this.pfsGroup == null ? null : this.pfsGroup.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IpsecPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IpsecPolicy if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IpsecPolicy.
     */
    public static IpsecPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IpsecPolicy deserializedIpsecPolicy = new IpsecPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("saLifeTimeSeconds".equals(fieldName)) {
                    deserializedIpsecPolicy.saLifeTimeSeconds = reader.getInt();
                } else if ("saDataSizeKilobytes".equals(fieldName)) {
                    deserializedIpsecPolicy.saDataSizeKilobytes = reader.getInt();
                } else if ("ipsecEncryption".equals(fieldName)) {
                    deserializedIpsecPolicy.ipsecEncryption = IpsecEncryption.fromString(reader.getString());
                } else if ("ipsecIntegrity".equals(fieldName)) {
                    deserializedIpsecPolicy.ipsecIntegrity = IpsecIntegrity.fromString(reader.getString());
                } else if ("ikeEncryption".equals(fieldName)) {
                    deserializedIpsecPolicy.ikeEncryption = IkeEncryption.fromString(reader.getString());
                } else if ("ikeIntegrity".equals(fieldName)) {
                    deserializedIpsecPolicy.ikeIntegrity = IkeIntegrity.fromString(reader.getString());
                } else if ("dhGroup".equals(fieldName)) {
                    deserializedIpsecPolicy.dhGroup = DhGroup.fromString(reader.getString());
                } else if ("pfsGroup".equals(fieldName)) {
                    deserializedIpsecPolicy.pfsGroup = PfsGroup.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIpsecPolicy;
        });
    }
}
