package org.venuspj.studio.core.model.momentInterval.momemt.news;

import org.venuspj.util.collect.Lists2;

import java.util.List;

public class NewsesMock {
    public static Newses createDummy(NewsesType anyNewsesType) {
        List<News> newsList = Lists2.newArrayList();
        for (NewsMock.NewsType newsType : anyNewsesType.newsTypes()) {
            newsList.add(NewsMock.createDummy(newsType));
        }
        return new Newses(newsList);
    }


    public enum NewsesType {
        EMPTY {
            @Override
            public NewsMock.NewsType[] newsTypes() {
                return new NewsMock.NewsType[0];
            }
        }, DEFAULT {
            @Override
            public NewsMock.NewsType[] newsTypes() {
                return new NewsMock.NewsType[]{
                        NewsMock.NewsType.NEWS1,
                        NewsMock.NewsType.NEWS2,
                        NewsMock.NewsType.NEWS3,
                        NewsMock.NewsType.NEWS4,
                        NewsMock.NewsType.NEWS5,
                        NewsMock.NewsType.NEWS6,
                        NewsMock.NewsType.NEWS7,
                        NewsMock.NewsType.NEWS8,
                        NewsMock.NewsType.NEWS9,
                        NewsMock.NewsType.NEWS10,
                };
            }
        };

        public abstract NewsMock.NewsType[] newsTypes();
    }
}
