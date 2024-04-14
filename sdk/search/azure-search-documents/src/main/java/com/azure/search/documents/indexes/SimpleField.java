// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes;

import com.azure.search.documents.indexes.models.FieldBuilderOptions;
import com.azure.search.documents.indexes.models.LexicalNormalizerName;
import com.azure.search.documents.indexes.models.SearchField;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation that directs {@link SearchIndexAsyncClient#buildSearchFields(Class, FieldBuilderOptions)} to turn the
 * field or method into a non-searchable {@link SearchField field}.
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SimpleField {
    /**
     * Indicates if the field or method should generate as a key {@link SearchField field}.
     *
     * @return A flag indicating if the field or method should generate as a key {@link SearchField field}.
     */
    boolean isKey() default false;

    /**
     * Indicates if the field or method should generate as a hidden {@link SearchField field}.
     *
     * @return A flag indicating if the field or method should generate as a hidden {@link SearchField field}.
     */
    boolean isHidden() default false;

    /**
     * Indicates if the field or method should generate as a facetable {@link SearchField field}.
     *
     * @return A flag indicating if the field or method should generate as a facetable {@link SearchField field}.
     */
    boolean isFacetable() default false;

    /**
     * Indicates if the field or method should generate as a sortable {@link SearchField field}.
     *
     * @return A flag indicating if the field or method should generate as a sortable {@link SearchField field}.
     */
    boolean isSortable() default false;

    /**
     * Indicates if whether the field will be persisted separately on disk to be returned in a search result.
     *
     * @return A flag indicating if the field or method should generate as a stored {@link SearchField field}.
     */
    boolean isStored() default true;

    /**
     * Indicates if the field or method should generate as a filterable {@link SearchField field}.
     *
     * @return A flag indicating if the field or method should generate as a filterable {@link SearchField field}.
     */
    boolean isFilterable() default false;

    /**
     * A {@link LexicalNormalizerName} to associate as the normalizer for the {@link SearchField field}.
     *
     * @return The {@link LexicalNormalizerName} that will be associated as the normalizer for the
     * {@link SearchField field}.
     */
    String normalizerName() default "";
}
