package org.venuspj.util.collect;

import static org.venuspj.util.collect.CollectPreconditions.checkEntryNotNull;

class ImmutableMapEntry<K, V> extends ImmutableEntry<K, V> {
    static <K, V> ImmutableMapEntry<K, V>[] createEntryArray(int size) {
        return new ImmutableMapEntry[size];
    }

    ImmutableMapEntry(K key, V value) {
        super(key, value);
        checkEntryNotNull(key, value);
    }

    ImmutableMapEntry(ImmutableMapEntry<K, V> contents) {
        super(contents.getKey(), contents.getValue());
        // null check would be redundant
    }

    ImmutableMapEntry<K, V> getNextInKeyBucket() {
        return null;
    }

    ImmutableMapEntry<K, V> getNextInValueBucket() {
        return null;
    }

    /**
     * Returns true if this entry has no bucket links and can safely be reused as a terminal
     * entry in a bucket in another map.
     */
    boolean isReusable() {
        return true;
    }

    static class NonTerminalImmutableMapEntry<K, V> extends ImmutableMapEntry<K, V> {
        private final transient ImmutableMapEntry<K, V> nextInKeyBucket;

        NonTerminalImmutableMapEntry(K key, V value, ImmutableMapEntry<K, V> nextInKeyBucket) {
            super(key, value);
            this.nextInKeyBucket = nextInKeyBucket;
        }

        @Override
        final ImmutableMapEntry<K, V> getNextInKeyBucket() {
            return nextInKeyBucket;
        }

        @Override
        final boolean isReusable() {
            return false;
        }
    }

    static final class NonTerminalImmutableBiMapEntry<K, V>
            extends NonTerminalImmutableMapEntry<K, V> {
        private final transient ImmutableMapEntry<K, V> nextInValueBucket;

        NonTerminalImmutableBiMapEntry(
                K key,
                V value,
                ImmutableMapEntry<K, V> nextInKeyBucket,
                ImmutableMapEntry<K, V> nextInValueBucket) {
            super(key, value, nextInKeyBucket);
            this.nextInValueBucket = nextInValueBucket;
        }

        @Override
        ImmutableMapEntry<K, V> getNextInValueBucket() {
            return nextInValueBucket;
        }
    }
}