// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The language codes supported for input text by TextTranslationSkill.
 */
public final class TextTranslationSkillLanguage extends ExpandableStringEnum<TextTranslationSkillLanguage> {
    /**
     * Afrikaans.
     */
    public static final TextTranslationSkillLanguage AF = fromString("af");

    /**
     * Arabic.
     */
    public static final TextTranslationSkillLanguage AR = fromString("ar");

    /**
     * Bangla.
     */
    public static final TextTranslationSkillLanguage BN = fromString("bn");

    /**
     * Bosnian (Latin).
     */
    public static final TextTranslationSkillLanguage BS = fromString("bs");

    /**
     * Bulgarian.
     */
    public static final TextTranslationSkillLanguage BG = fromString("bg");

    /**
     * Cantonese (Traditional).
     */
    public static final TextTranslationSkillLanguage YUE = fromString("yue");

    /**
     * Catalan.
     */
    public static final TextTranslationSkillLanguage CA = fromString("ca");

    /**
     * Chinese Simplified.
     */
    public static final TextTranslationSkillLanguage ZH_HANS = fromString("zh-Hans");

    /**
     * Chinese Traditional.
     */
    public static final TextTranslationSkillLanguage ZH_HANT = fromString("zh-Hant");

    /**
     * Croatian.
     */
    public static final TextTranslationSkillLanguage HR = fromString("hr");

    /**
     * Czech.
     */
    public static final TextTranslationSkillLanguage CS = fromString("cs");

    /**
     * Danish.
     */
    public static final TextTranslationSkillLanguage DA = fromString("da");

    /**
     * Dutch.
     */
    public static final TextTranslationSkillLanguage NL = fromString("nl");

    /**
     * English.
     */
    public static final TextTranslationSkillLanguage EN = fromString("en");

    /**
     * Estonian.
     */
    public static final TextTranslationSkillLanguage ET = fromString("et");

    /**
     * Fijian.
     */
    public static final TextTranslationSkillLanguage FJ = fromString("fj");

    /**
     * Filipino.
     */
    public static final TextTranslationSkillLanguage FIL = fromString("fil");

    /**
     * Finnish.
     */
    public static final TextTranslationSkillLanguage FI = fromString("fi");

    /**
     * French.
     */
    public static final TextTranslationSkillLanguage FR = fromString("fr");

    /**
     * German.
     */
    public static final TextTranslationSkillLanguage DE = fromString("de");

    /**
     * Greek.
     */
    public static final TextTranslationSkillLanguage EL = fromString("el");

    /**
     * Haitian Creole.
     */
    public static final TextTranslationSkillLanguage HT = fromString("ht");

    /**
     * Hebrew.
     */
    public static final TextTranslationSkillLanguage HE = fromString("he");

    /**
     * Hindi.
     */
    public static final TextTranslationSkillLanguage HI = fromString("hi");

    /**
     * Hmong Daw.
     */
    public static final TextTranslationSkillLanguage MWW = fromString("mww");

    /**
     * Hungarian.
     */
    public static final TextTranslationSkillLanguage HU = fromString("hu");

    /**
     * Icelandic.
     */
    public static final TextTranslationSkillLanguage IS = fromString("is");

    /**
     * Indonesian.
     */
    public static final TextTranslationSkillLanguage ID = fromString("id");

    /**
     * Italian.
     */
    public static final TextTranslationSkillLanguage IT = fromString("it");

    /**
     * Japanese.
     */
    public static final TextTranslationSkillLanguage JA = fromString("ja");

    /**
     * Kiswahili.
     */
    public static final TextTranslationSkillLanguage SW = fromString("sw");

    /**
     * Klingon.
     */
    public static final TextTranslationSkillLanguage TLH = fromString("tlh");

    /**
     * Klingon (Latin script).
     */
    public static final TextTranslationSkillLanguage TLH_LATN = fromString("tlh-Latn");

    /**
     * Klingon (Klingon script).
     */
    public static final TextTranslationSkillLanguage TLH_PIQD = fromString("tlh-Piqd");

    /**
     * Korean.
     */
    public static final TextTranslationSkillLanguage KO = fromString("ko");

    /**
     * Latvian.
     */
    public static final TextTranslationSkillLanguage LV = fromString("lv");

    /**
     * Lithuanian.
     */
    public static final TextTranslationSkillLanguage LT = fromString("lt");

    /**
     * Malagasy.
     */
    public static final TextTranslationSkillLanguage MG = fromString("mg");

    /**
     * Malay.
     */
    public static final TextTranslationSkillLanguage MS = fromString("ms");

    /**
     * Maltese.
     */
    public static final TextTranslationSkillLanguage MT = fromString("mt");

    /**
     * Norwegian.
     */
    public static final TextTranslationSkillLanguage NB = fromString("nb");

    /**
     * Persian.
     */
    public static final TextTranslationSkillLanguage FA = fromString("fa");

    /**
     * Polish.
     */
    public static final TextTranslationSkillLanguage PL = fromString("pl");

    /**
     * Portuguese.
     */
    public static final TextTranslationSkillLanguage PT = fromString("pt");

    /**
     * Portuguese (Brazil).
     */
    public static final TextTranslationSkillLanguage PT_BR = fromString("pt-br");

    /**
     * Portuguese (Portugal).
     */
    public static final TextTranslationSkillLanguage PT_PT = fromString("pt-PT");

    /**
     * Queretaro Otomi.
     */
    public static final TextTranslationSkillLanguage OTQ = fromString("otq");

    /**
     * Romanian.
     */
    public static final TextTranslationSkillLanguage RO = fromString("ro");

    /**
     * Russian.
     */
    public static final TextTranslationSkillLanguage RU = fromString("ru");

    /**
     * Samoan.
     */
    public static final TextTranslationSkillLanguage SM = fromString("sm");

    /**
     * Serbian (Cyrillic).
     */
    public static final TextTranslationSkillLanguage SR_CYRL = fromString("sr-Cyrl");

    /**
     * Serbian (Latin).
     */
    public static final TextTranslationSkillLanguage SR_LATN = fromString("sr-Latn");

    /**
     * Slovak.
     */
    public static final TextTranslationSkillLanguage SK = fromString("sk");

    /**
     * Slovenian.
     */
    public static final TextTranslationSkillLanguage SL = fromString("sl");

    /**
     * Spanish.
     */
    public static final TextTranslationSkillLanguage ES = fromString("es");

    /**
     * Swedish.
     */
    public static final TextTranslationSkillLanguage SV = fromString("sv");

    /**
     * Tahitian.
     */
    public static final TextTranslationSkillLanguage TY = fromString("ty");

    /**
     * Tamil.
     */
    public static final TextTranslationSkillLanguage TA = fromString("ta");

    /**
     * Telugu.
     */
    public static final TextTranslationSkillLanguage TE = fromString("te");

    /**
     * Thai.
     */
    public static final TextTranslationSkillLanguage TH = fromString("th");

    /**
     * Tongan.
     */
    public static final TextTranslationSkillLanguage TO = fromString("to");

    /**
     * Turkish.
     */
    public static final TextTranslationSkillLanguage TR = fromString("tr");

    /**
     * Ukrainian.
     */
    public static final TextTranslationSkillLanguage UK = fromString("uk");

    /**
     * Urdu.
     */
    public static final TextTranslationSkillLanguage UR = fromString("ur");

    /**
     * Vietnamese.
     */
    public static final TextTranslationSkillLanguage VI = fromString("vi");

    /**
     * Welsh.
     */
    public static final TextTranslationSkillLanguage CY = fromString("cy");

    /**
     * Yucatec Maya.
     */
    public static final TextTranslationSkillLanguage YUA = fromString("yua");

    /**
     * Irish.
     */
    public static final TextTranslationSkillLanguage GA = fromString("ga");

    /**
     * Kannada.
     */
    public static final TextTranslationSkillLanguage KN = fromString("kn");

    /**
     * Maori.
     */
    public static final TextTranslationSkillLanguage MI = fromString("mi");

    /**
     * Malayalam.
     */
    public static final TextTranslationSkillLanguage ML = fromString("ml");

    /**
     * Punjabi.
     */
    public static final TextTranslationSkillLanguage PA = fromString("pa");

    /**
     * Creates a new instance of TextTranslationSkillLanguage value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TextTranslationSkillLanguage() {
    }

    /**
     * Creates or finds a TextTranslationSkillLanguage from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TextTranslationSkillLanguage.
     */
    public static TextTranslationSkillLanguage fromString(String name) {
        return fromString(name, TextTranslationSkillLanguage.class);
    }

    /**
     * Gets known TextTranslationSkillLanguage values.
     * 
     * @return known TextTranslationSkillLanguage values.
     */
    public static Collection<TextTranslationSkillLanguage> values() {
        return values(TextTranslationSkillLanguage.class);
    }
}
