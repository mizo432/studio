package org.venuspj.studio.core.model.news;

/**
 */
public class NewsIdMock {

    public static NewsIdentifier createDummy(NewsMock.NewsType aNewsType) {
        return new NewsIdentifier(aNewsType.idValue());
    }

}
