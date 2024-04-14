// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.BinaryData;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import java.time.OffsetDateTime;
import java.util.Objects;

/** The object returned in the QueueMessageList array when calling Peek Messages on a Queue. */
@Fluent
public final class PeekedMessageItem implements XmlSerializable<PeekedMessageItem> {
    /*
     * The Id of the Message.
     */
    private String messageId;

    /*
     * The time the Message was inserted into the Queue.
     */
    private DateTimeRfc1123 insertionTime;

    /*
     * The time that the Message will expire and be automatically deleted.
     */
    private DateTimeRfc1123 expirationTime;

    /*
     * The number of times the message has been dequeued.
     */
    private long dequeueCount;

    /*
     * The content of the Message.
     */
    private BinaryData body;

    /**
     * Creates an instance of PeekedMessageItem.
     */
    public PeekedMessageItem() {
    }

    /**
     * Get the messageId property: The Id of the Message.
     *
     * @return the messageId value.
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * Set the messageId property: The Id of the Message.
     *
     * @param messageId the messageId value to set.
     * @return the PeekedMessageItem object itself.
     */
    public PeekedMessageItem setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the insertionTime property: The time the Message was inserted into the Queue.
     *
     * @return the insertionTime value.
     */
    public OffsetDateTime getInsertionTime() {
        if (this.insertionTime == null) {
            return null;
        }
        return this.insertionTime.getDateTime();
    }

    /**
     * Set the insertionTime property: The time the Message was inserted into the Queue.
     *
     * @param insertionTime the insertionTime value to set.
     * @return the PeekedMessageItem object itself.
     */
    public PeekedMessageItem setInsertionTime(OffsetDateTime insertionTime) {
        if (insertionTime == null) {
            this.insertionTime = null;
        } else {
            this.insertionTime = new DateTimeRfc1123(insertionTime);
        }
        return this;
    }

    /**
     * Get the expirationTime property: The time that the Message will expire and be automatically deleted.
     *
     * @return the expirationTime value.
     */
    public OffsetDateTime getExpirationTime() {
        if (this.expirationTime == null) {
            return null;
        }
        return this.expirationTime.getDateTime();
    }

    /**
     * Set the expirationTime property: The time that the Message will expire and be automatically deleted.
     *
     * @param expirationTime the expirationTime value to set.
     * @return the PeekedMessageItem object itself.
     */
    public PeekedMessageItem setExpirationTime(OffsetDateTime expirationTime) {
        if (expirationTime == null) {
            this.expirationTime = null;
        } else {
            this.expirationTime = new DateTimeRfc1123(expirationTime);
        }
        return this;
    }

    /**
     * Get the dequeueCount property: The number of times the message has been dequeued.
     *
     * @return the dequeueCount value.
     */
    public long getDequeueCount() {
        return this.dequeueCount;
    }

    /**
     * Set the dequeueCount property: The number of times the message has been dequeued.
     *
     * @param dequeueCount the dequeueCount value to set.
     * @return the PeekedMessageItem object itself.
     */
    public PeekedMessageItem setDequeueCount(long dequeueCount) {
        this.dequeueCount = dequeueCount;
        return this;
    }

    /**
     * Get the messageText property: The content of the Message.
     *
     * @return the messageText value.
     * @deprecated use {@link #getBody()} instead.
     */
    @Deprecated
    public String getMessageText() {
        return this.body == null ? null : this.body.toString();
    }

    /**
     * Set the messageText property: The content of the Message.
     *
     * @param messageText the messageText value to set.
     * @return the PeekedMessageItem object itself.
     * @deprecated use {@link #setBody(BinaryData)} instead.
     */
    @Deprecated
    public PeekedMessageItem setMessageText(String messageText) {
        this.body = messageText == null ? null : BinaryData.fromString(messageText);
        return this;
    }


    /**
     * Get the body property: The content of the Message.
     *
     * @return the body value.
     */
    public BinaryData getBody() {
        return this.body;
    }

    /**
     * Set the body property: The content of the Message.
     *
     * @param body the body value to set.
     * @return the PeekedMessageItem object itself.
     */
    public PeekedMessageItem setBody(BinaryData body) {
        this.body = body;
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
        xmlWriter.writeStringElement("MessageId", this.messageId);
        xmlWriter.writeStringElement("InsertionTime", Objects.toString(this.insertionTime, null));
        xmlWriter.writeStringElement("ExpirationTime", Objects.toString(this.expirationTime, null));
        xmlWriter.writeLongElement("DequeueCount", this.dequeueCount);
        // TODO (alzimmer): What does Jackson do with 'BinaryData body' when this model is serialized?
        // xmlWriter.writeStringElement("MessageText", this.messageText);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of PeekedMessageItem from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @return An instance of PeekedMessageItem if the XmlReader was pointing to an instance of it, or null if
     * it was pointing to XML null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     * @throws XMLStreamException If an error occurs while reading the PeekedMessageItem.
     */
    public static PeekedMessageItem fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of PeekedMessageItem from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of PeekedMessageItem if the XmlReader was pointing to an instance of it, or null if
     * it was pointing to XML null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     * @throws XMLStreamException If an error occurs while reading the PeekedMessageItem.
     */
    public static PeekedMessageItem fromXml(XmlReader xmlReader, String rootElementName)
        throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "QueueMessage" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            PeekedMessageItem deserializedPeekedMessageItem = new PeekedMessageItem();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("MessageId".equals(elementName.getLocalPart())) {
                    deserializedPeekedMessageItem.messageId = reader.getStringElement();
                } else if ("InsertionTime".equals(elementName.getLocalPart())) {
                    deserializedPeekedMessageItem.insertionTime
                        = reader.getNullableElement(DateTimeRfc1123::new);
                } else if ("ExpirationTime".equals(elementName.getLocalPart())) {
                    deserializedPeekedMessageItem.expirationTime
                        = reader.getNullableElement(DateTimeRfc1123::new);
                } else if ("DequeueCount".equals(elementName.getLocalPart())) {
                    deserializedPeekedMessageItem.dequeueCount = reader.getLongElement();
                } else if ("MessageText".equals(elementName.getLocalPart())) {
                    deserializedPeekedMessageItem.setMessageText(reader.getStringElement());
                } else {
                    reader.skipElement();
                }
            }

            return deserializedPeekedMessageItem;
        });
    }
}
