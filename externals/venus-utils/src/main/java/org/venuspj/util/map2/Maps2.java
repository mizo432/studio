package org.venuspj.util.map2;

import com.google.common.primitives.Ints;
import org.venuspj.util.collect.CollectPreconditions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Maps2 {

    public static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
        return new HashMap<K, V>(map);
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
        return new LinkedHashMap<K, V>();
    }

    static int capacity(int expectedSize) {
        if (expectedSize < 3) {
            CollectPreconditions.checkNonNegative(expectedSize, "expectedSize");
            return expectedSize + 1;
        }
        if (expectedSize < Ints.MAX_POWER_OF_TWO) {
            // This is the calculation used in JDK8 to resize when a putAll
            // happens; it seems to be the most conservative calculation we
            // can make.  0.75 is the default load factor.
            return (int) ((float) expectedSize / 0.75F + 1.0F);
        }
        return Integer.MAX_VALUE; // any large value
    }

    public static <K, V> Map<K, V> newHashMap() {
        return new HashMap<K, V>();
    }

    public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int expectedSize) {
        return new HashMap<K, V>(capacity(expectedSize));
    }
}
