package org.venuspj.studio.core.model.topic;

import org.junit.Test;

import static org.venuspj.util.objects2.Objects2.*;

/**
 */
public class TopicTest {

    @Test
    public void toString1() throws Exception {
        Topic target = TopicMock.createDummy(TopicMock.MockType.DEFAULT);
        System.out.println("actual:" + toStringHelper(target).defaultConfig().toString());
    }
}
