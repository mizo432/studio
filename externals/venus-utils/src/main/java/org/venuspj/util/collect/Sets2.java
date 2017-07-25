package org.venuspj.util.collect;

import java.util.HashSet;
import java.util.Set;

public final class Sets2 {
    public static <T> Set<T> newHashSet() {
        return new HashSet<>();
    }

    /**
     * 新しいhash setを返却する.
     * <pre>
     *     初期サイズはexpectedSize
     * </pre>
     *
     * @param expectedSize the number of elements you expect to add to the returned set
     * @return a new, empty hash set with enough capacity to hold {@code expectedSize} elements
     * without resizing
     * @throws IllegalArgumentException if {@code expectedSize} is negative
     */
    public static <E> Set<E> newHashSetWithExpectedSize(int expectedSize) {
        return new HashSet<E>(Maps2.capacity(expectedSize));
    }
}
