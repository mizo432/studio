package org.venuspj.studio.core.model.news;

import org.junit.Test;
import org.venuspj.studio.core.model.event.EventIdentifierMock;
import org.venuspj.studio.core.model.event.EventIdentifier;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class NewsIdentifierTest {

    @Test
    public void hashCode1() throws Exception {
        NewsIdentifier target = NewsIdentifierMock.createDummy(NewsMock.NewsType.DEFAULT);
        int actual = target.hashCode();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isEqualTo(1654085297);

    }

    @Test
    public void hashCode2() throws Exception {
        NewsIdentifier target = new NewsIdentifier();
        int actual = target.hashCode();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isEqualTo(1654085296);

    }

    @Test
    public void hashCode3() throws Exception {
        NewsIdentifier target = NewsIdentifier.defaultNewsId();
        int actual = target.hashCode();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isEqualTo(1654085296);

    }

    @Test
    public void isPresent1() throws Exception {
        NewsIdentifier target = NewsIdentifier.defaultNewsId();
        boolean actual = target.isPresent();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isFalse();

    }

    @Test
    public void isPresent2() throws Exception {
        NewsIdentifier target = NewsIdentifierMock.createDummy(NewsMock.NewsType.DEFAULT);
        boolean actual = target.isPresent();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isTrue();

    }

    @Test
    public void equals1() throws Exception {
        NewsIdentifier target = NewsIdentifier.defaultNewsId();
        boolean actual = target.equals(null);
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isFalse();

    }

    @Test
    public void equals2() throws Exception {
        NewsIdentifier target = NewsIdentifier.defaultNewsId();
        boolean actual = target.equals(Integer.valueOf(1));
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isFalse();

    }

    @Test
    public void equals3() throws Exception {
        NewsIdentifier target = NewsIdentifierMock.createDummy(NewsMock.NewsType.DEFAULT);
        boolean actual = target.equals(target);
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isTrue();

    }

    @Test
    public void equals4() throws Exception {
        NewsIdentifier target = NewsIdentifierMock.createDummy(NewsMock.NewsType.NEWS1);
        boolean actual = target.equals(target);
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isTrue();

    }

    @Test
    public void equals5() throws Exception {
        NewsIdentifier target = NewsIdentifierMock.createDummy(NewsMock.NewsType.NEWS1);
        NewsIdentifier other = NewsIdentifierMock.createDummy(NewsMock.NewsType.NEWS2);
        boolean actual = target.equals(other);
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isFalse();

    }

    @Test
    public void equals6() throws Exception {
        NewsIdentifier target = NewsIdentifierMock.createDummy(NewsMock.NewsType.NEWS1);
        EventIdentifier other = EventIdentifierMock.createDummy(EventIdentifierMock.MockType.DEFAULT);
        boolean actual = target.equals(other);
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isFalse();

    }

}
