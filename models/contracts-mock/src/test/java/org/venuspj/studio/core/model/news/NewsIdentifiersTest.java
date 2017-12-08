package org.venuspj.studio.core.model.news;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class NewsIdentifiersTest {
    @Test
    public void toString1() throws Exception {
        NewsIdentifiers target = NewsIdsMock.createDummy(NewsesMock.NewsesType.EMPTY);
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull();
    }

    @Test
    public void toString2() throws Exception {
        NewsIdentifiers target = NewsIdsMock.createDummy(NewsesMock.NewsesType.DEFAULT);
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull();
    }
    @Test
    public void toString3() throws Exception {
        NewsIdentifiers target = new NewsIdentifiers();
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull();
    }
}
