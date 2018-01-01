package org.venuspj.studio.core.model.topic;

import org.junit.Test;
import org.venuspj.studio.core.model.event.EventIdentifier;
import org.venuspj.studio.core.model.event.EventIdentifierMock;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class TopicIdentifierTest {

    @Test
    public void hashCode1() throws Exception {
        TopicIdentifier target = TopicIdentifierMock.createDummy(TopicMock.MockType.DEFAULT);
        int actual = target.hashCode();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isEqualTo(1654085297);

    }

    @Test
    public void hashCode2() throws Exception {
        TopicIdentifier target = new TopicIdentifier();
        int actual = target.hashCode();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isEqualTo(1654085296);

    }

    @Test
    public void hashCode3() throws Exception {
        TopicIdentifier target = TopicIdentifier.defaultNewsId();
        int actual = target.hashCode();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isEqualTo(1654085296);

    }

    @Test
    public void isPresent1() throws Exception {
        TopicIdentifier target = TopicIdentifier.defaultNewsId();
        boolean actual = target.isPresent();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isFalse();

    }

    @Test
    public void isPresent2() throws Exception {
        TopicIdentifier target = TopicIdentifierMock.createDummy(TopicMock.MockType.DEFAULT);
        boolean actual = target.isPresent();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isTrue();

    }

    @Test
    public void equals1() throws Exception {
        TopicIdentifier target = TopicIdentifier.defaultNewsId();
        boolean actual = target.equals(null);
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isFalse();

    }

    @Test
    public void equals2() throws Exception {
        TopicIdentifier target = TopicIdentifier.defaultNewsId();
        boolean actual = target.equals(Integer.valueOf(1));
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isFalse();

    }

    @Test
    public void equals3() throws Exception {
        TopicIdentifier target = TopicIdentifierMock.createDummy(TopicMock.MockType.DEFAULT);
        boolean actual = target.equals(target);
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isTrue();

    }

    @Test
    public void equals4() throws Exception {
        TopicIdentifier target = TopicIdentifierMock.createDummy(TopicMock.MockType.NEWS1);
        boolean actual = target.equals(target);
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isTrue();

    }

    @Test
    public void equals5() throws Exception {
        TopicIdentifier target = TopicIdentifierMock.createDummy(TopicMock.MockType.NEWS1);
        TopicIdentifier other = TopicIdentifierMock.createDummy(TopicMock.MockType.NEWS2);
        boolean actual = target.equals(other);
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isFalse();

    }

    @Test
    public void equals6() throws Exception {
        TopicIdentifier target = TopicIdentifierMock.createDummy(TopicMock.MockType.NEWS1);
        EventIdentifier other = EventIdentifierMock.createDummy(EventIdentifierMock.MockType.DEFAULT);
        boolean actual = target.equals(other);
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull()
                .isFalse();

    }

}
