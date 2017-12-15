package org.venuspj.studio.core.model.news;

/**
 */
public class NewsIdentifierMock {

    public static NewsIdentifier createDummy(NewsMock.NewsType aNewsType) {
        return new NewsIdentifier(aNewsType.idValue());
    }

}
