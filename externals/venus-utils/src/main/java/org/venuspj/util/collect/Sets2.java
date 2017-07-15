package org.venuspj.util.collect;

import java.util.HashSet;

/**
 */
public class Sets2 {
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
    public static <E> HashSet<E> newHashSetWithExpectedSize(int expectedSize) {
        return new HashSet<E>(Maps2.capacity(expectedSize));
    }
}
