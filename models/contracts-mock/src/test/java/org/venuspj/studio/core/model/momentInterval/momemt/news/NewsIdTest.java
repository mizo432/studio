package org.venuspj.studio.core.model.momentInterval.momemt.news;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class NewsIdTest {

    @Test
    public void toString1() throws Exception {
        NewsId target = NewsIdMock.createDummy(NewsIdMock.NewsIdType.DEFAULT);
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isEqualTo("NewsId{kind=org.venuspj.studio.core.model.momentInterval.momemt.news.News, 1}");

    }
}
