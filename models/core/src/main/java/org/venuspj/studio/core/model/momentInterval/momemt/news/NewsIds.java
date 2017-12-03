package org.venuspj.studio.core.model.momentInterval.momemt.news;

import org.venuspj.ddd.model.value.AbstractListValue;

import java.util.Collection;

/**
 */
public class NewsIds extends AbstractListValue<NewsId> {

    NewsIds() {

    }

    public NewsIds(Collection<? extends NewsId> anyList) {
        super(anyList);
    }

}
