package org.venuspj.util.list2;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import org.venuspj.util.collections3.Collections3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import static com.google.common.base.Preconditions.*;

/**
 */
public final class Lists2 {
    public static <T> ArrayList<T> newArrayList() {
        return Lists.newArrayList();
    }

    @SafeVarargs
    public static <T> ArrayList<T> newArrayList(T... items) {
        ArrayList<T> result = new ArrayList<>(items.length);
        for (T item : items) {
            result.add(item);
        }
        return result;
    }

    public static <E> ArrayList<E> newArrayList(Iterable<? extends E> elements) {
        checkNotNull(elements); // for GWT
        // Let ArrayList's sizing logic work, if possible
        return (elements instanceof Collection)
                ? new ArrayList<E>(Collections3.cast(elements))
                : newArrayList(elements.iterator());
    }

    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> elements) {
        ArrayList<E> list = newArrayList();
        Iterators.addAll(list, elements);
        return list;
    }
}
