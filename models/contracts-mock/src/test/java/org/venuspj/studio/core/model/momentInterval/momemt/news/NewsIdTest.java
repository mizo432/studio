package org.venuspj.studio.core.model.momentInterval.momemt.news;

import org.junit.Test;
import org.venuspj.studio.core.model.event.EventId;
import org.venuspj.studio.core.model.momentInterval.momemt.event.EventIdMock;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class NewsIdTest {

    @Test
    public void toString1() throws Exception {
        NewsId target = NewsIdMock.createDummy(NewsMock.NewsType.DEFAULT);
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isEqualTo("NewsId{kind=org.venuspj.studio.core.model.momentInterval.momemt.news.News, 1}");

    }

    @Test
    public void toString2() throws Exception {
        NewsId target = new NewsId();
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isEqualTo("NewsId{kind=org.venuspj.studio.core.model.momentInterval.momemt.news.News, null}");

    }

    @Test
    public void hashCode1() throws Exception {
        NewsId target = NewsIdMock.createDummy(NewsMock.NewsType.DEFAULT);
        int actual = target.hashCode();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isEqualTo(1155872341);

    }

    @Test
    public void hashCode2() throws Exception {
        NewsId target = new NewsId();
        int actual = target.hashCode();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isEqualTo(1155872340);

    }

    @Test
    public void hashCode3() throws Exception {
        NewsId target = NewsId.defaultNewsId();
        int actual = target.hashCode();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isEqualTo(1155872340);

    }

    @Test
    public void isPresent1() throws Exception {
        NewsId target = NewsId.defaultNewsId();
        boolean actual = target.isPresent();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isFalse();

    }

    @Test
    public void isPresent2() throws Exception {
        NewsId target = NewsIdMock.createDummy(NewsMock.NewsType.DEFAULT);
        boolean actual = target.isPresent();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isTrue();

    }

    @Test
    public void equals1() throws Exception {
        NewsId target = NewsId.defaultNewsId();
        boolean actual = target.equals(null);
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isFalse();

    }

    @Test
    public void equals2() throws Exception {
        NewsId target = NewsId.defaultNewsId();
        boolean actual = target.equals(Integer.valueOf(1));
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isFalse();

    }

    @Test
    public void equals3() throws Exception {
        NewsId target = NewsIdMock.createDummy(NewsMock.NewsType.DEFAULT);
        boolean actual = target.equals(target);
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isTrue();

    }

    @Test
    public void equals4() throws Exception {
        NewsId target = NewsIdMock.createDummy(NewsMock.NewsType.NEWS1);
        boolean actual = target.equals(target);
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isTrue();

    }

    @Test
    public void equals5() throws Exception {
        NewsId target = NewsIdMock.createDummy(NewsMock.NewsType.NEWS1);
        NewsId other = NewsIdMock.createDummy(NewsMock.NewsType.NEWS2);
        boolean actual = target.equals(other);
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isFalse();

    }

    @Test
    public void equals6() throws Exception {
        NewsId target = NewsIdMock.createDummy(NewsMock.NewsType.NEWS1);
        EventId other = EventIdMock.createDummy(EventIdMock.EventIDType.DEFAULT);
        boolean actual = target.equals(other);
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isFalse();

    }

}
