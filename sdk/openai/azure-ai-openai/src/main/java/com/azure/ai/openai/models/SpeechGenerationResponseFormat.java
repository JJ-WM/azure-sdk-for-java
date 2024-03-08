// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The supported audio output formats for text-to-speech.
 */
public final class SpeechGenerationResponseFormat extends ExpandableStringEnum<SpeechGenerationResponseFormat> {

    /**
     * Use MP3 as the audio output format. MP3 is the default, general-purpose format.
     */
    @Generated
    public static final SpeechGenerationResponseFormat MP3 = fromString("mp3");

    /**
     * Use Opus as the audio output format. Opus is optimized for internet streaming and low latency.
     */
    @Generated
    public static final SpeechGenerationResponseFormat OPUS = fromString("opus");

    /**
     * Use AAC as the audio output format. AAC is optimized for digital audio compression and is preferred by YouTube,
     * Android, and iOS.
     */
    @Generated
    public static final SpeechGenerationResponseFormat AAC = fromString("aac");

    /**
     * Use FLAC as the audio output format. FLAC is a fully lossless format optimized for maximum quality at the expense
     * of size.
     */
    @Generated
    public static final SpeechGenerationResponseFormat FLAC = fromString("flac");

    /**
     * Creates a new instance of SpeechGenerationResponseFormat value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public SpeechGenerationResponseFormat() {
    }

    /**
     * Creates or finds a SpeechGenerationResponseFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SpeechGenerationResponseFormat.
     */
    @Generated
    @JsonCreator
    public static SpeechGenerationResponseFormat fromString(String name) {
        return fromString(name, SpeechGenerationResponseFormat.class);
    }

    /**
     * Gets known SpeechGenerationResponseFormat values.
     *
     * @return known SpeechGenerationResponseFormat values.
     */
    @Generated
    public static Collection<SpeechGenerationResponseFormat> values() {
        return values(SpeechGenerationResponseFormat.class);
    }
}
