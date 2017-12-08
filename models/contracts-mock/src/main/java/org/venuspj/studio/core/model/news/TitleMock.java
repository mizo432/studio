package org.venuspj.studio.core.model.news;

public class TitleMock {
    public static Title createDummy(NewsMock.NewsType aNewsType) {
        return new Title(aNewsType.newsTitle());
    }
}
