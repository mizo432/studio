package org.venuspj.studio.core.model.news;

import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class NewsIdentifiersMock {
    public static NewsIdentifiers createDummy(NewsesMock.NewsesType anyNewsesType) {
        List<NewsIdentifier> newsList = newArrayList();

        for (NewsMock.NewsType newsType : anyNewsesType.newsTypes())
            newsList.add(NewsIdentifierMock.createDummy(newsType));

        return new NewsIdentifiers(newsList);
    }
}
