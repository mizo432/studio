package org.venuspj.studio.core.model.news;

import org.venuspj.util.collect.Lists2;

import java.util.List;

public class NewsIdsMock {
    public static NewsIdentifiers createDummy(NewsesMock.NewsesType anyNewsesType) {
        List<NewsIdentifier> newsList = Lists2.newArrayList();
        for (NewsMock.NewsType newsType : anyNewsesType.newsTypes()) {
            newsList.add(NewsIdMock.createDummy(newsType));
        }
        return new NewsIdentifiers(newsList);
    }
}
