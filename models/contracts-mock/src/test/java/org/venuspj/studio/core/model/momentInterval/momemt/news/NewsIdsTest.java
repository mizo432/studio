package org.venuspj.studio.core.model.momentInterval.momemt.news;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class NewsIdsTest {
    @Test
    public void toString1() throws Exception {
        NewsIds target = NewsIdsMock.createDummy(NewsesMock.NewsesType.EMPTY);
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull();
    }

    @Test
    public void toString2() throws Exception {
        NewsIds target = NewsIdsMock.createDummy(NewsesMock.NewsesType.DEFAULT);
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull();
    }
    @Test
    public void toString3() throws Exception {
        NewsIds target = new NewsIds();
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull();
    }
}
