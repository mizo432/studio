package org.venuspj.studio.core.model.topic;

import org.junit.Test;
import org.venuspj.studio.core.model.topic.topics.TopicsMock;

import static org.assertj.core.api.Java6Assertions.*;

public class TopicIdentifiersTest {
    @Test
    public void toString1() throws Exception {
        TopicIdentifiers target = TopicIdentifiersMock.createDummy(TopicsMock.MockType.EMPTY);
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull();
    }

    @Test
    public void toString2() throws Exception {
        TopicIdentifiers target = TopicIdentifiersMock.createDummy(TopicsMock.MockType.DEFAULT);
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull();
    }

    @Test
    public void toString3() throws Exception {
        TopicIdentifiers target = new TopicIdentifiers();
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull();
    }
}
