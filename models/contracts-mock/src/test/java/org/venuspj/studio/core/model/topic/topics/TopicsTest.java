package org.venuspj.studio.core.model.topic.topics;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class TopicsTest {

    @Test
    public void toString1() throws Exception {
        Topics target = TopicsMock.createDummy(TopicsMock.MockType.EMPTY);
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull();
    }

    @Test
    public void toString2() throws Exception {
        Topics target = TopicsMock.createDummy(TopicsMock.MockType.DEFAULT);
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull();
    }

    @Test
    public void toString3() throws Exception {
        Topics target = new Topics();
        String actual = target.toString();
        System.out.println("actual:" + actual);
        assertThat(actual)
                .isNotNull();
    }

}
