package org.venuspj.studio.core.model.momentInterval.momemt.news;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class TitleTest {
    @Test
    public void toString1() throws Exception {
        Title target = TitleMock.createDummy(NewsMock.NewsType.DEFAULT);
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Title{DEFAULT_TITLE}");

    }
    @Test
    public void toString2() throws Exception {
        Title target = new Title();
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Title{null}");

    }
    @Test
    public void asText1() throws Exception {
        Title target = TitleMock.createDummy(NewsMock.NewsType.DEFAULT);
        String actual = target.asText();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isEqualTo("DEFAULT_TITLE");

    }

    @Test
    public void asText2() throws Exception {
        Title target = new Title();
        String actual = target.asText();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNull();

    }

}
