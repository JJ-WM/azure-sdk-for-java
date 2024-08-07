// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.messaging;

/**
 * An interface to provide properties by providing key.
 *
 * @param <K> the key type.
 * @param <V> the properties type.
 */
@FunctionalInterface
public interface PropertiesSupplier<K, V> {

    /**
     * Get the properties by the key.
     * @param key the key.
     * @return the properties instance.
     */
    V getProperties(K key);

}
