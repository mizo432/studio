package org.venuspj.studio.core.model.topic;

import org.junit.Test;
import org.venuspj.studio.core.model.topic.infomation.Title;

import static org.assertj.core.api.Java6Assertions.*;

public class TitleTest {

    @Test
    public void asText1() throws Exception {
        Title target = TitleMock.createDummy(TopicMock.MockType.DEFAULT);
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
