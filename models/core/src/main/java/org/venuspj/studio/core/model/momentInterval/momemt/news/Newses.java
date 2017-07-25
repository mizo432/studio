package org.venuspj.studio.core.model.momentInterval.momemt.news;

import org.venuspj.util.collect.Lists2;
import org.venuspj.util.objects2.Objects2;

import java.util.List;

/**
 */
public class Newses {
    List<News> list = Lists2.newArrayList();

    Newses() {
    }

    public Newses(List<News> anyList) {
        list.addAll(anyList);
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .omitNullValues()
                .toString();
    }
}
