package org.venuspj.util.list;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class Lists2 {
    public static <T> List<T> newArrayList() {
        return Lists.newArrayList();
    }

    public static <T> List<T> newArrayList(T... items) {
        ArrayList<T> result = new ArrayList<>(items.length);
        for (T item:items){
            result.add(item);
        }
        return result;
    }
}
