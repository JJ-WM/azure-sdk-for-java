// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import javax.xml.stream.XMLStreamException;

/**
 * The URL for the HTTP request.
 */
@Fluent
public final class ResponseLinkImpl implements XmlSerializable<ResponseLinkImpl> {
    private static final String WWW_W3_ORG_TWO_ZERO_ZERO_FIVE_ATOM = "http://www.w3.org/2005/Atom";

    /*
     * The URL of the GET request
     */
    private String href;

    /*
     * What the link href is relative to
     */
    private String rel;

    /**
     * Creates an instance of ResponseLink class.
     */
    public ResponseLinkImpl() {
    }

    /**
     * Get the href property: The URL of the GET request.
     * 
     * @return the href value.
     */
    public String getHref() {
        return this.href;
    }

    /**
     * Set the href property: The URL of the GET request.
     * 
     * @param href the href value to set.
     * @return the ResponseLink object itself.
     */
    public ResponseLinkImpl setHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get the rel property: What the link href is relative to.
     * 
     * @return the rel value.
     */
    public String getRel() {
        return this.rel;
    }

    /**
     * Set the rel property: What the link href is relative to.
     * 
     * @param rel the rel value to set.
     * @return the ResponseLink object itself.
     */
    public ResponseLinkImpl setRel(String rel) {
        this.rel = rel;
        return this;
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "link" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeNamespace(WWW_W3_ORG_TWO_ZERO_ZERO_FIVE_ATOM);
        xmlWriter.writeStringAttribute("href", this.href);
        xmlWriter.writeStringAttribute("rel", this.rel);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of ResponseLink from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of ResponseLink if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the ResponseLink.
     */
    public static ResponseLinkImpl fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of ResponseLink from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of ResponseLink if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the ResponseLink.
     */
    public static ResponseLinkImpl fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "link" : rootElementName;
        return xmlReader.readObject(WWW_W3_ORG_TWO_ZERO_ZERO_FIVE_ATOM, finalRootElementName, reader -> {
            ResponseLinkImpl deserializedResponseLink = new ResponseLinkImpl();
            deserializedResponseLink.href = reader.getStringAttribute(null, "href");
            deserializedResponseLink.rel = reader.getStringAttribute(null, "rel");
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                reader.skipElement();
            }

            return deserializedResponseLink;
        });
    }
}
