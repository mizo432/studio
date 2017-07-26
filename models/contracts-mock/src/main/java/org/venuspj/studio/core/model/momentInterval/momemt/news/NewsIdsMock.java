package org.venuspj.studio.core.model.momentInterval.momemt.news;

import org.venuspj.util.collect.Lists2;

import java.util.List;

public class NewsIdsMock {
    public static NewsIds createDummy(NewsesMock.NewsesType anyNewsesType) {
        List<NewsId> newsList = Lists2.newArrayList();
        for (NewsMock.NewsType newsType : anyNewsesType.newsTypes()) {
            newsList.add(NewsIdMock.createDummy(newsType));
        }
        return new NewsIds(newsList);
    }
}
