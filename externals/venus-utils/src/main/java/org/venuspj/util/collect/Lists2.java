package org.venuspj.util.collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.base.Preconditions.checkNotNull;

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
}
