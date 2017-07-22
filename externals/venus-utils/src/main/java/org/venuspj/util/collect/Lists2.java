package org.venuspj.util.collect;

import java.util.*;

import static org.venuspj.util.base.Preconditions.*;


/**
 */
public class Lists2 {

    public static List<String> removeNothing(List<String> aList) {
        List<String> result = newArrayList();
        for (String item : aList) {
            if (!"nothing".equals(item)) {
                result.add(item);
            }

        }

        return result;
    }

    public static <T> List<T> newArrayList() {
        List<T> result = new ArrayList<>();
        return result;
    }

    @SafeVarargs
    public static <T> List<T> newArrayList(T... args) {
        List<T> result = new ArrayList<>();
        for (T arg : args)
            result.add(arg);
        return result;
    }

    public static <E> List<E> newArrayListWithCapacity(int initialArraySize) {
        return new ArrayList<E>(initialArraySize);
    }

    public static <E> List<E> newArrayList(Iterable<? extends E> elements) {
        checkNotNull(elements);
        return (elements instanceof Collection)
                ? new ArrayList<E>(Collections3.cast(elements))
                : newArrayList(elements.iterator());
    }

    public static <E> List<E> newArrayList(Iterator<? extends E> elements) {
        List<E> list = newArrayList();
        Iterators.addAll(list, elements);
        return list;
    }

    public static <T> List<T> unmodifiableList(List<T> list) {
        return Collections.unmodifiableList(list);
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


    public static <T> List<T> newArrayListWithExpectedSize(int length) {
        ArrayList<T> result = new ArrayList<>(length);
        return result;
    }


}

