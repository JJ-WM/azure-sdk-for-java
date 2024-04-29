// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * An Azure Storage file range.
 */
@Fluent
public final class Range implements XmlSerializable<Range> {
    /*
     * Start of the range.
     */
    private long start;

    /*
     * End of the range.
     */
    private long end;

    /**
     * Get the start property: Start of the range.
     *
     * @return the start value.
     */
    public long getStart() {
        return this.start;
    }

    /**
     * Set the start property: Start of the range.
     *
     * @param start the start value to set.
     * @return the Range object itself.
     */
    public Range setStart(long start) {
        this.start = start;
        return this;
    }

    /**
     * Get the end property: End of the range.
     *
     * @return the end value.
     */
    public long getEnd() {
        return this.end;
    }

    /**
     * Set the end property: End of the range.
     *
     * @param end the end value to set.
     * @return the Range object itself.
     */
    public Range setEnd(long end) {
        this.end = end;
        return this;
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Range" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);

        xmlWriter.writeLongElement("Start", start);
        xmlWriter.writeLongElement("End", end);

        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of Range from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @return An instance of Range if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     * @throws XMLStreamException If an error occurs while reading the Range.
     */
    public static Range fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of Range from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of Range if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     * @throws XMLStreamException If an error occurs while reading the Range.
     */
    public static Range fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Range" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            Range deserializedRange = new Range();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("Start".equals(elementName.getLocalPart())) {
                    deserializedRange.start = reader.getLongElement();
                } else if ("End".equals(elementName.getLocalPart())) {
                    deserializedRange.end = reader.getLongElement();
                } else {
                    reader.skipElement();
                }
            }

            return deserializedRange;
        });
    }
}
