package org.venuspj.studio.core.model.momentInterval.momemt.news;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import org.venuspj.util.collect.Lists2;
import org.venuspj.util.objects2.Objects2;

import java.util.List;

/**
 */
public class NewsIds extends AbstractEntityIdentifier<News> {
    List<NewsId> list = Lists2.newArrayList();

    NewsIds() {

    }

    public NewsIds(List<NewsId> anyList) {
        list.addAll(anyList);
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .toString();
    }

}
