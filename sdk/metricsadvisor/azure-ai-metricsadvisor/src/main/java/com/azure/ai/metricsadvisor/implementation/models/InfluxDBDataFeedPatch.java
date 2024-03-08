// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * The InfluxDBDataFeedPatch model.
 */
@Fluent
public final class InfluxDBDataFeedPatch extends DataFeedDetailPatch {
    /*
     * The dataSourceParameter property.
     */
    private InfluxDBParameterPatch dataSourceParameter;

    /**
     * Creates an instance of InfluxDBDataFeedPatch class.
     */
    public InfluxDBDataFeedPatch() {
    }

    /**
     * Get the dataSourceParameter property: The dataSourceParameter property.
     * 
     * @return the dataSourceParameter value.
     */
    public InfluxDBParameterPatch getDataSourceParameter() {
        return this.dataSourceParameter;
    }

    /**
     * Set the dataSourceParameter property: The dataSourceParameter property.
     * 
     * @param dataSourceParameter the dataSourceParameter value to set.
     * @return the InfluxDBDataFeedPatch object itself.
     */
    public InfluxDBDataFeedPatch setDataSourceParameter(InfluxDBParameterPatch dataSourceParameter) {
        this.dataSourceParameter = dataSourceParameter;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setDataFeedName(String dataFeedName) {
        super.setDataFeedName(dataFeedName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setDataFeedDescription(String dataFeedDescription) {
        super.setDataFeedDescription(dataFeedDescription);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setTimestampColumn(String timestampColumn) {
        super.setTimestampColumn(timestampColumn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setDataStartFrom(OffsetDateTime dataStartFrom) {
        super.setDataStartFrom(dataStartFrom);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setStartOffsetInSeconds(Long startOffsetInSeconds) {
        super.setStartOffsetInSeconds(startOffsetInSeconds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setMaxConcurrency(Integer maxConcurrency) {
        super.setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setMinRetryIntervalInSeconds(Long minRetryIntervalInSeconds) {
        super.setMinRetryIntervalInSeconds(minRetryIntervalInSeconds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setStopRetryAfterInSeconds(Long stopRetryAfterInSeconds) {
        super.setStopRetryAfterInSeconds(stopRetryAfterInSeconds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setNeedRollup(NeedRollupEnum needRollup) {
        super.setNeedRollup(needRollup);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setRollUpMethod(RollUpMethod rollUpMethod) {
        super.setRollUpMethod(rollUpMethod);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setRollUpColumns(List<String> rollUpColumns) {
        super.setRollUpColumns(rollUpColumns);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setAllUpIdentification(String allUpIdentification) {
        super.setAllUpIdentification(allUpIdentification);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setFillMissingPointType(FillMissingPointType fillMissingPointType) {
        super.setFillMissingPointType(fillMissingPointType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setFillMissingPointValue(Double fillMissingPointValue) {
        super.setFillMissingPointValue(fillMissingPointValue);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setViewMode(ViewMode viewMode) {
        super.setViewMode(viewMode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setAdmins(List<String> admins) {
        super.setAdmins(admins);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setViewers(List<String> viewers) {
        super.setViewers(viewers);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setStatus(EntityStatus status) {
        super.setStatus(status);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setActionLinkTemplate(String actionLinkTemplate) {
        super.setActionLinkTemplate(actionLinkTemplate);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setAuthenticationType(AuthenticationTypeEnum authenticationType) {
        super.setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfluxDBDataFeedPatch setCredentialId(String credentialId) {
        super.setCredentialId(credentialId);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dataSourceType",
            DataSourceType.INFLUX_DB == null ? null : DataSourceType.INFLUX_DB.toString());
        jsonWriter.writeStringField("dataFeedName", getDataFeedName());
        jsonWriter.writeStringField("dataFeedDescription", getDataFeedDescription());
        jsonWriter.writeStringField("timestampColumn", getTimestampColumn());
        jsonWriter.writeStringField("dataStartFrom",
            getDataStartFrom() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(getDataStartFrom()));
        jsonWriter.writeNumberField("startOffsetInSeconds", getStartOffsetInSeconds());
        jsonWriter.writeNumberField("maxConcurrency", getMaxConcurrency());
        jsonWriter.writeNumberField("minRetryIntervalInSeconds", getMinRetryIntervalInSeconds());
        jsonWriter.writeNumberField("stopRetryAfterInSeconds", getStopRetryAfterInSeconds());
        jsonWriter.writeStringField("needRollup", getNeedRollup() == null ? null : getNeedRollup().toString());
        jsonWriter.writeStringField("rollUpMethod", getRollUpMethod() == null ? null : getRollUpMethod().toString());
        jsonWriter.writeArrayField("rollUpColumns", getRollUpColumns(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("allUpIdentification", getAllUpIdentification());
        jsonWriter.writeStringField("fillMissingPointType",
            getFillMissingPointType() == null ? null : getFillMissingPointType().toString());
        jsonWriter.writeNumberField("fillMissingPointValue", getFillMissingPointValue());
        jsonWriter.writeStringField("viewMode", getViewMode() == null ? null : getViewMode().toString());
        jsonWriter.writeArrayField("admins", getAdmins(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("viewers", getViewers(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("status", getStatus() == null ? null : getStatus().toString());
        jsonWriter.writeStringField("actionLinkTemplate", getActionLinkTemplate());
        jsonWriter.writeStringField("authenticationType",
            getAuthenticationType() == null ? null : getAuthenticationType().toString());
        jsonWriter.writeStringField("credentialId", getCredentialId());
        jsonWriter.writeJsonField("dataSourceParameter", this.dataSourceParameter);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InfluxDBDataFeedPatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InfluxDBDataFeedPatch if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     * @throws IOException If an error occurs while reading the InfluxDBDataFeedPatch.
     */
    public static InfluxDBDataFeedPatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InfluxDBDataFeedPatch deserializedInfluxDBDataFeedPatch = new InfluxDBDataFeedPatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dataSourceType".equals(fieldName)) {
                    String dataSourceType = reader.getString();
                    if (!"InfluxDB".equals(dataSourceType)) {
                        throw new IllegalStateException(
                            "'dataSourceType' was expected to be non-null and equal to 'InfluxDB'. The found 'dataSourceType' was '"
                                + dataSourceType + "'.");
                    }
                } else if ("dataFeedName".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch.setDataFeedName(reader.getString());
                } else if ("dataFeedDescription".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch.setDataFeedDescription(reader.getString());
                } else if ("timestampColumn".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch.setTimestampColumn(reader.getString());
                } else if ("dataStartFrom".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch.setDataStartFrom(
                        reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString())));
                } else if ("startOffsetInSeconds".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch.setStartOffsetInSeconds(reader.getNullable(JsonReader::getLong));
                } else if ("maxConcurrency".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch.setMaxConcurrency(reader.getNullable(JsonReader::getInt));
                } else if ("minRetryIntervalInSeconds".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch
                        .setMinRetryIntervalInSeconds(reader.getNullable(JsonReader::getLong));
                } else if ("stopRetryAfterInSeconds".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch
                        .setStopRetryAfterInSeconds(reader.getNullable(JsonReader::getLong));
                } else if ("needRollup".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch.setNeedRollup(NeedRollupEnum.fromString(reader.getString()));
                } else if ("rollUpMethod".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch.setRollUpMethod(RollUpMethod.fromString(reader.getString()));
                } else if ("rollUpColumns".equals(fieldName)) {
                    List<String> rollUpColumns = reader.readArray(reader1 -> reader1.getString());
                    deserializedInfluxDBDataFeedPatch.setRollUpColumns(rollUpColumns);
                } else if ("allUpIdentification".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch.setAllUpIdentification(reader.getString());
                } else if ("fillMissingPointType".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch
                        .setFillMissingPointType(FillMissingPointType.fromString(reader.getString()));
                } else if ("fillMissingPointValue".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch
                        .setFillMissingPointValue(reader.getNullable(JsonReader::getDouble));
                } else if ("viewMode".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch.setViewMode(ViewMode.fromString(reader.getString()));
                } else if ("admins".equals(fieldName)) {
                    List<String> admins = reader.readArray(reader1 -> reader1.getString());
                    deserializedInfluxDBDataFeedPatch.setAdmins(admins);
                } else if ("viewers".equals(fieldName)) {
                    List<String> viewers = reader.readArray(reader1 -> reader1.getString());
                    deserializedInfluxDBDataFeedPatch.setViewers(viewers);
                } else if ("status".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch.setStatus(EntityStatus.fromString(reader.getString()));
                } else if ("actionLinkTemplate".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch.setActionLinkTemplate(reader.getString());
                } else if ("authenticationType".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch
                        .setAuthenticationType(AuthenticationTypeEnum.fromString(reader.getString()));
                } else if ("credentialId".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch.setCredentialId(reader.getString());
                } else if ("dataSourceParameter".equals(fieldName)) {
                    deserializedInfluxDBDataFeedPatch.dataSourceParameter = InfluxDBParameterPatch.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInfluxDBDataFeedPatch;
        });
    }
}
