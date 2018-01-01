package org.venuspj.studio.core.model.topic;

import org.venuspj.studio.core.model.topic.infomation.Title;

public class TitleMock {

    public static Title createDummy(TopicMock.MockType aMockType) {
        return new Title(aMockType.newsTitle());
    }
}
