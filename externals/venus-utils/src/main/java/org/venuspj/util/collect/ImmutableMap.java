package org.venuspj.util.collect;

import java.io.Serializable;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.venuspj.util.base.Preconditions.checkNotNull;
import static org.venuspj.util.base.Preconditions.checkState;
import static org.venuspj.util.collect.CollectPreconditions.checkEntryNotNull;
import static org.venuspj.util.collect.CollectPreconditions.checkNonNegative;

@SuppressWarnings("serial")
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(
            Function<? super T, ? extends K> keyFunction,
            Function<? super T, ? extends V> valueFunction) {
        return CollectCollectors.toImmutableMap(keyFunction, valueFunction);
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(
            Function<? super T, ? extends K> keyFunction,
            Function<? super T, ? extends V> valueFunction,
            BinaryOperator<V> mergeFunction) {
        checkNotNull(keyFunction);
        checkNotNull(valueFunction);
        checkNotNull(mergeFunction);
        return Collectors.collectingAndThen(
                Collectors.toMap(keyFunction, valueFunction, mergeFunction, LinkedHashMap::new),
                ImmutableMap::copyOf);
    }

    @SuppressWarnings("unchecked")
    public static <K, V> ImmutableMap<K, V> of() {
        return (ImmutableMap<K, V>) RegularImmutableMap.EMPTY;
    }

    public static <K, V> ImmutableMap<K, V> of(K k1, V v1) {
        return ImmutableBiMap.of(k1, v1);
    }

    public static <K, V> ImmutableMap<K, V> of(K k1, V v1, K k2, V v2) {
        return RegularImmutableMap.fromEntries(entryOf(k1, v1), entryOf(k2, v2));
    }

    public static <K, V> ImmutableMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3) {
        return RegularImmutableMap.fromEntries(entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3));
    }

    public static <K, V> ImmutableMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        return RegularImmutableMap.fromEntries(
                entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4));
    }

    public static <K, V> ImmutableMap<K, V> of(
            K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return RegularImmutableMap.fromEntries(
                entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5));
    }

    static <K, V> Entry<K, V> entryOf(K key, V value) {
        checkEntryNotNull(key, value);
        return new AbstractMap.SimpleImmutableEntry<>(key, value);
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> Builder<K, V> builderWithExpectedSize(int expectedSize) {
        checkNonNegative(expectedSize, "expectedSize");
        return new Builder<>(expectedSize);
    }

    static void checkNoConflict(
            boolean safe, String conflictDescription, Entry<?, ?> entry1, Entry<?, ?> entry2) {
        if (!safe) {
            throw new IllegalArgumentException(
                    "Multiple entries with same " + conflictDescription + ": " + entry1 + " and " + entry2);
        }
    }

    public static class Builder<K, V> {
        Comparator<? super V> valueComparator;
        Entry<K, V>[] entries;
        int size;
        boolean entriesUsed;

        public Builder() {
            this(ImmutableCollection.Builder.DEFAULT_INITIAL_CAPACITY);
        }

        @SuppressWarnings("unchecked")
        Builder(int initialCapacity) {
            this.entries = new Entry[initialCapacity];
            this.size = 0;
            this.entriesUsed = false;
        }

        private void ensureCapacity(int minCapacity) {
            if (minCapacity > entries.length) {
                entries =
                        Arrays.copyOf(
                                entries, ImmutableCollection.Builder.expandedCapacity(entries.length, minCapacity));
                entriesUsed = false;
            }
        }

        public Builder<K, V> put(K key, V value) {
            ensureCapacity(size + 1);
            Entry<K, V> entry = entryOf(key, value);
            // don't inline this: we want to fail atomically if key or value is null
            entries[size++] = entry;
            return this;
        }

        public Builder<K, V> put(Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }

        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            return putAll(map.entrySet());
        }

        public Builder<K, V> putAll(Iterable<? extends Entry<? extends K, ? extends V>> entries) {
            if (entries instanceof Collection) {
                ensureCapacity(size + ((Collection<?>) entries).size());
            }
            for (Entry<? extends K, ? extends V> entry : entries) {
                put(entry);
            }
            return this;
        }

        public Builder<K, V> orderEntriesByValue(Comparator<? super V> valueComparator) {
            checkState(this.valueComparator == null, "valueComparator was already set");
            this.valueComparator = checkNotNull(valueComparator, "valueComparator");
            return this;
        }

        Builder<K, V> combine(Builder<K, V> other) {
            checkNotNull(other);
            ensureCapacity(this.size + other.size);
            System.arraycopy(other.entries, 0, this.entries, this.size, other.size);
            this.size += other.size;
            return this;
        }

    /*
     * TODO(kevinb): Should build() and the ImmutableBiMap & ImmutableSortedMap
     * versions throw an IllegalStateException instead?
     */

        /**
         * Returns a newly-created immutable map.  The iteration order of the returned map is
         * the order in which entries were inserted into the builder, unless
         * {@link #orderEntriesByValue} was called, in which case entries are sorted by value.
         *
         * @throws IllegalArgumentException if duplicate keys were added
         */
        public ImmutableMap<K, V> build() {
      /*
       * If entries is full, then this implementation may end up using the entries array
       * directly and writing over the entry objects with non-terminal entries, but this is
       * safe; if this Builder is used further, it will grow the entries array (so it can't
       * affect the original array), and future build() calls will always copy any entry
       * objects that cannot be safely reused.
       */
            if (valueComparator != null) {
                if (entriesUsed) {
                    entries = Arrays.copyOf(entries, size);
                }
                Arrays.sort(
                        entries,
                        0,
                        size,
                        Ordering.from(valueComparator).onResultOf(Maps.<V>valueFunction()));
            }
            entriesUsed = size == entries.length;
            switch (size) {
                case 0:
                    return of();
                case 1:
                    return of(entries[0].getKey(), entries[0].getValue());
                default:
                    return RegularImmutableMap.fromEntryArray(size, entries);
            }
        }
    }

    /**
     * Returns an immutable map containing the same entries as {@code map}. The returned map iterates
     * over entries in the same order as the {@code entrySet} of the original map.  If {@code map}
     * somehow contains entries with duplicate keys (for example, if it is a {@code SortedMap}
     * whose comparator is not <i>consistent with equals</i>), the results of this method are
     * undefined.
     *
     * <p>Despite the method name, this method attempts to avoid actually copying
     * the data when it is safe to do so. The exact circumstances under which a
     * copy will or will not be performed are undocumented and subject to change.
     *
     * @throws NullPointerException if any key or value in {@code map} is null
     */
    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            @SuppressWarnings("unchecked") // safe since map is not writable
                    ImmutableMap<K, V> kvMap = (ImmutableMap<K, V>) map;
            if (!kvMap.isPartialView()) {
                return kvMap;
            }
        } else if (map instanceof EnumMap) {
            @SuppressWarnings("unchecked") // safe since map is not writable
                    ImmutableMap<K, V> kvMap = (ImmutableMap<K, V>) copyOfEnumMap((EnumMap<?, ?>) map);
            return kvMap;
        }
        return copyOf(map.entrySet());
    }

    /**
     * Returns an immutable map containing the specified entries.  The returned
     * map iterates over entries in the same order as the original iterable.
     *
     * @throws NullPointerException if any key, value, or entry is null
     * @throws IllegalArgumentException if two entries have the same key
     * @since 19.0
     */
    @Beta
    public static <K, V> ImmutableMap<K, V> copyOf(
            Iterable<? extends Entry<? extends K, ? extends V>> entries) {
        @SuppressWarnings("unchecked") // we'll only be using getKey and getValue, which are covariant
                Entry<K, V>[] entryArray = (Entry<K, V>[]) Iterables.toArray(entries, EMPTY_ENTRY_ARRAY);
        switch (entryArray.length) {
            case 0:
                return of();
            case 1:
                Entry<K, V> onlyEntry = entryArray[0];
                return of(onlyEntry.getKey(), onlyEntry.getValue());
            default:
        /*
         * The current implementation will end up using entryArray directly, though it will write
         * over the (arbitrary, potentially mutable) Entry objects actually stored in entryArray.
         */
                return RegularImmutableMap.fromEntries(entryArray);
        }
    }

    private static <K extends Enum<K>, V> ImmutableMap<K, V> copyOfEnumMap(
            EnumMap<K, ? extends V> original) {
        EnumMap<K, V> copy = new EnumMap<>(original);
        for (Map.Entry<?, ?> entry : copy.entrySet()) {
            checkEntryNotNull(entry.getKey(), entry.getValue());
        }
        return ImmutableEnumMap.asImmutable(copy);
    }

    static final Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Entry<?, ?>[0];

    abstract static class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        abstract UnmodifiableIterator<Entry<K, V>> entryIterator();

        Spliterator<Entry<K, V>> entrySpliterator() {
            return Spliterators.spliterator(
                    entryIterator(),
                    size(),
                    Spliterator.DISTINCT | Spliterator.NONNULL | Spliterator.IMMUTABLE | Spliterator.ORDERED);
        }

        @Override
        ImmutableSet<K> createKeySet() {
            return new ImmutableMapKeySet<>(this);
        }

        @Override
        ImmutableSet<Entry<K, V>> createEntrySet() {
            @WeakOuter
            class EntrySetImpl extends ImmutableMapEntrySet<K, V> {
                @Override
                ImmutableMap<K, V> map() {
                    return IteratorBasedImmutableMap.this;
                }

                @Override
                public UnmodifiableIterator<Entry<K, V>> iterator() {
                    return entryIterator();
                }
            }
            return new EntrySetImpl();
        }

        @Override
        ImmutableCollection<V> createValues() {
            return new ImmutableMapValues<>(this);
        }
    }

    ImmutableMap() {}

    /**
     * Guaranteed to throw an exception and leave the map unmodified.
     *
     * @throws UnsupportedOperationException always
     * @deprecated Unsupported operation.
     */
    @CanIgnoreReturnValue
    @Deprecated
    @Override
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    /**
     * Guaranteed to throw an exception and leave the map unmodified.
     *
     * @throws UnsupportedOperationException always
     * @deprecated Unsupported operation.
     */
    @CanIgnoreReturnValue
    @Deprecated
    @Override
    public final V putIfAbsent(K key, V value) {
        throw new UnsupportedOperationException();
    }

    /**
     * Guaranteed to throw an exception and leave the map unmodified.
     *
     * @throws UnsupportedOperationException always
     * @deprecated Unsupported operation.
     */
    @Deprecated
    @Override
    public final boolean replace(K key, V oldValue, V newValue) {
        throw new UnsupportedOperationException();
    }

    /**
     * Guaranteed to throw an exception and leave the map unmodified.
     *
     * @throws UnsupportedOperationException always
     * @deprecated Unsupported operation.
     */
    @Deprecated
    @Override
    public final V replace(K key, V value) {
        throw new UnsupportedOperationException();
    }

    /**
     * Guaranteed to throw an exception and leave the map unmodified.
     *
     * @throws UnsupportedOperationException always
     * @deprecated Unsupported operation.
     */
    @Deprecated
    @Override
    public final V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
        throw new UnsupportedOperationException();
    }

    /**
     * Guaranteed to throw an exception and leave the map unmodified.
     *
     * @throws UnsupportedOperationException always
     * @deprecated Unsupported operation.
     */
    @Deprecated
    @Override
    public final V computeIfPresent(
            K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        throw new UnsupportedOperationException();
    }

    /**
     * Guaranteed to throw an exception and leave the map unmodified.
     *
     * @throws UnsupportedOperationException always
     * @deprecated Unsupported operation.
     */
    @Deprecated
    @Override
    public final V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        throw new UnsupportedOperationException();
    }

    /**
     * Guaranteed to throw an exception and leave the map unmodified.
     *
     * @throws UnsupportedOperationException always
     * @deprecated Unsupported operation.
     */
    @Deprecated
    @Override
    public final V merge(
            K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        throw new UnsupportedOperationException();
    }

    /**
     * Guaranteed to throw an exception and leave the map unmodified.
     *
     * @throws UnsupportedOperationException always
     * @deprecated Unsupported operation.
     */
    @Deprecated
    @Override
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    /**
     * Guaranteed to throw an exception and leave the map unmodified.
     *
     * @throws UnsupportedOperationException always
     * @deprecated Unsupported operation.
     */
    @Deprecated
    @Override
    public final void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
        throw new UnsupportedOperationException();
    }

    /**
     * Guaranteed to throw an exception and leave the map unmodified.
     *
     * @throws UnsupportedOperationException always
     * @deprecated Unsupported operation.
     */
    @Deprecated
    @Override
    public final V remove(Object o) {
        throw new UnsupportedOperationException();
    }

    /**
     * Guaranteed to throw an exception and leave the map unmodified.
     *
     * @throws UnsupportedOperationException always
     * @deprecated Unsupported operation.
     */
    @Deprecated
    @Override
    public final boolean remove(Object key, Object value) {
        throw new UnsupportedOperationException();
    }

    /**
     * Guaranteed to throw an exception and leave the map unmodified.
     *
     * @throws UnsupportedOperationException always
     * @deprecated Unsupported operation.
     */
    @Deprecated
    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean containsKey(@Nullable Object key) {
        return get(key) != null;
    }

    @Override
    public boolean containsValue(@Nullable Object value) {
        return values().contains(value);
    }

    // Overriding to mark it Nullable
    @Override
    public abstract V get(@Nullable Object key);

    @Override
    public final V getOrDefault(@Nullable Object key, @Nullable V defaultValue) {
        V result = get(key);
        return (result != null) ? result : defaultValue;
    }

    @LazyInit
    private transient ImmutableSet<Entry<K, V>> entrySet;

    /**
     * Returns an immutable set of the mappings in this map.  The iteration order is specified by
     * the method used to create this map.  Typically, this is insertion order.
     */
    @Override
    public ImmutableSet<Entry<K, V>> entrySet() {
        ImmutableSet<Entry<K, V>> result = entrySet;
        return (result == null) ? entrySet = createEntrySet() : result;
    }

    abstract ImmutableSet<Entry<K, V>> createEntrySet();

    @LazyInit
    private transient ImmutableSet<K> keySet;

    /**
     * Returns an immutable set of the keys in this map, in the same order that they appear in
     * {@link #entrySet}.
     */
    @Override
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> result = keySet;
        return (result == null) ? keySet = createKeySet() : result;
    }

    /*
     * This could have a good default implementation of return new ImmutableKeySet<K, V>(this),
     * but ProGuard can't figure out how to eliminate that default when RegularImmutableMap
     * overrides it.
     */
    abstract ImmutableSet<K> createKeySet();

    UnmodifiableIterator<K> keyIterator() {
        final UnmodifiableIterator<Entry<K, V>> entryIterator = entrySet().iterator();
        return new UnmodifiableIterator<K>() {
            @Override
            public boolean hasNext() {
                return entryIterator.hasNext();
            }

            @Override
            public K next() {
                return entryIterator.next().getKey();
            }
        };
    }

    Spliterator<K> keySpliterator() {
        return CollectSpliterators.map(entrySet().spliterator(), Entry::getKey);
    }

    @LazyInit
    private transient ImmutableCollection<V> values;

    /**
     * Returns an immutable collection of the values in this map, in the same order that they appear
     * in {@link #entrySet}.
     */
    @Override
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> result = values;
        return (result == null) ? values = createValues() : result;
    }

    /*
     * This could have a good default implementation of {@code return new
     * ImmutableMapValues<K, V>(this)}, but ProGuard can't figure out how to eliminate that default
     * when RegularImmutableMap overrides it.
     */
    abstract ImmutableCollection<V> createValues();

    // cached so that this.multimapView().inverse() only computes inverse once
    @LazyInit
    private transient ImmutableSetMultimap<K, V> multimapView;

    /**
     * Returns a multimap view of the map.
     *
     * @since 14.0
     */
    public ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return ImmutableSetMultimap.of();
        }
        ImmutableSetMultimap<K, V> result = multimapView;
        return (result == null)
                ? (multimapView =
                new ImmutableSetMultimap<>(new MapViewOfValuesAsSingletonSets(), size(), null))
                : result;
    }

    @WeakOuter
    private final class MapViewOfValuesAsSingletonSets
            extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {

        @Override
        public int size() {
            return ImmutableMap.this.size();
        }

        @Override
        ImmutableSet<K> createKeySet() {
            return ImmutableMap.this.keySet();
        }

        @Override
        public boolean containsKey(@Nullable Object key) {
            return ImmutableMap.this.containsKey(key);
        }

        @Override
        public ImmutableSet<V> get(@Nullable Object key) {
            V outerValue = ImmutableMap.this.get(key);
            return (outerValue == null) ? null : ImmutableSet.of(outerValue);
        }

        @Override
        boolean isPartialView() {
            return ImmutableMap.this.isPartialView();
        }

        @Override
        public int hashCode() {
            // ImmutableSet.of(value).hashCode() == value.hashCode(), so the hashes are the same
            return ImmutableMap.this.hashCode();
        }

        @Override
        boolean isHashCodeFast() {
            return ImmutableMap.this.isHashCodeFast();
        }

        @Override
        UnmodifiableIterator<Entry<K, ImmutableSet<V>>> entryIterator() {
            final Iterator<Entry<K, V>> backingIterator = ImmutableMap.this.entrySet().iterator();
            return new UnmodifiableIterator<Entry<K, ImmutableSet<V>>>() {
                @Override
                public boolean hasNext() {
                    return backingIterator.hasNext();
                }

                @Override
                public Entry<K, ImmutableSet<V>> next() {
                    final Entry<K, V> backingEntry = backingIterator.next();
                    return new AbstractMapEntry<K, ImmutableSet<V>>() {
                        @Override
                        public K getKey() {
                            return backingEntry.getKey();
                        }

                        @Override
                        public ImmutableSet<V> getValue() {
                            return ImmutableSet.of(backingEntry.getValue());
                        }
                    };
                }
            };
        }
    }

    @Override
    public boolean equals(@Nullable Object object) {
        return Maps.equalsImpl(this, object);
    }

    abstract boolean isPartialView();

    @Override
    public int hashCode() {
        return Sets.hashCodeImpl(entrySet());
    }

    boolean isHashCodeFast() {
        return false;
    }

    @Override
    public String toString() {
        return Maps.toStringImpl(this);
    }

    /**
     * Serialized type for all ImmutableMap instances. It captures the logical
     * contents and they are reconstructed using public factory methods. This
     * ensures that the implementation types remain as implementation details.
     */
    static class SerializedForm implements Serializable {
        private final Object[] keys;
        private final Object[] values;

        SerializedForm(ImmutableMap<?, ?> map) {
            keys = new Object[map.size()];
            values = new Object[map.size()];
            int i = 0;
            for (Entry<?, ?> entry : map.entrySet()) {
                keys[i] = entry.getKey();
                values[i] = entry.getValue();
                i++;
            }
        }

        Object readResolve() {
            Builder<Object, Object> builder = new Builder<>(keys.length);
            return createMap(builder);
        }

        Object createMap(Builder<Object, Object> builder) {
            for (int i = 0; i < keys.length; i++) {
                builder.put(keys[i], values[i]);
            }
            return builder.build();
        }

        private static final long serialVersionUID = 0;
    }

    Object writeReplace() {
        return new SerializedForm(this);
    }
}