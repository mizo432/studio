package org.venuspj.studio.core.model.momentInterval.momemt.news;

/**
 */
public class NewsIdMock {

    public static NewsId createDummy(NewsMock.NewsType aNewsType) {
        return new NewsId(aNewsType.idValue());
    }

}
