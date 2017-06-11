package jp.or.venuspj.util.list2;

import com.google.common.collect.Lists;

import java.util.List;

/**
 */
public class Lists2 {
    public static <T> List<T> newArrayList() {
        return Lists.newArrayList();
    }

    public static <T> List<T> newArrayList(T... items) {
        return Lists.newArrayList(items);
    }
}
