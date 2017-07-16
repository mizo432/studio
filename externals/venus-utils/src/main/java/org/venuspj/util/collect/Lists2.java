package org.venuspj.util.collect;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;

import java.util.*;

import static com.google.common.base.Preconditions.*;

/**
 */
public final class Lists2 {
    public static <T> ArrayList<T> newArrayList() {
        return Lists.newArrayList();
    }

    public static <T> ArrayList<T> newArrayListWithExpectedSize(int length) {
        ArrayList<T> result = new ArrayList<>(length);
        return result;
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

    public static <T> List<T> getPage(List<T> sourceList, int page, int pageSize) {
        if (pageSize <= 0 || page <= 0) {
            throw new IllegalArgumentException(String.format("invalid page:%s page size:%s", pageSize, page));
        }

        int fromIndex = (page - 1) * pageSize;
        if (sourceList == null || sourceList.size() < fromIndex) {
            return newArrayList();
        }

        // toIndex exclusive
        return sourceList.subList(fromIndex, Math.min(fromIndex + pageSize, sourceList.size()));
    }

    public static <T> List<T> unmodifiableList(List<T> list) {
        return Collections.unmodifiableList(list);
    }
}
