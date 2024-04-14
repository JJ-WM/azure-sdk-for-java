// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * A Message object which can be stored in a Queue.
 */
@Fluent
public final class QueueMessage implements XmlSerializable<QueueMessage> {
    /*
     * The content of the message
     */
    private String messageText;

    /**
     * Creates an instance of QueueMessage class.
     */
    public QueueMessage() {
    }

    /**
     * Get the messageText property: The content of the message.
     * 
     * @return the messageText value.
     */
    public String getMessageText() {
        return this.messageText;
    }

    /**
     * Set the messageText property: The content of the message.
     * 
     * @param messageText the messageText value to set.
     * @return the QueueMessage object itself.
     */
    public QueueMessage setMessageText(String messageText) {
        this.messageText = messageText;
        return this;
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "QueueMessage" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeStringElement("MessageText", this.messageText);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of QueueMessage from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of QueueMessage if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     * @throws XMLStreamException If an error occurs while reading the QueueMessage.
     */
    public static QueueMessage fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of QueueMessage from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of QueueMessage if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     * @throws XMLStreamException If an error occurs while reading the QueueMessage.
     */
    public static QueueMessage fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "QueueMessage" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            QueueMessage deserializedQueueMessage = new QueueMessage();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("MessageText".equals(elementName.getLocalPart())) {
                    deserializedQueueMessage.messageText = reader.getStringElement();
                } else {
                    reader.skipElement();
                }
            }

            return deserializedQueueMessage;
        });
    }
}
