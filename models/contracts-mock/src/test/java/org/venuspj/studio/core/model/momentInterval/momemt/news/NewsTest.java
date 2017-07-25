package org.venuspj.studio.core.model.momentInterval.momemt.news;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class NewsTest {

    @Test
    public void toString1() throws Exception {
        News target = NewsMock.createDummy(NewsMock.NewsType.DEFAULT);
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull();
    }
}
