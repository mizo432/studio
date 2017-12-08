package org.venuspj.studio.core.model.news;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class NewsesTest {

    @Test
    public void toString1() throws Exception {
        Newses target = NewsesMock.createDummy(NewsesMock.NewsesType.EMPTY);
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull();
    }
    @Test
    public void toString2() throws Exception {
        Newses target = NewsesMock.createDummy(NewsesMock.NewsesType.DEFAULT);
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull();
    }
    @Test
    public void toString3() throws Exception {
        Newses target = new Newses();
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull();
    }

}
