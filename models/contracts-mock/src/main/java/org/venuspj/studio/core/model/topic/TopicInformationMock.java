package org.venuspj.studio.core.model.topic;

import org.venuspj.studio.core.model.topic.infomation.TopicInformation;

public class TopicInformationMock {
    public static TopicInformation create(TopicMock.MockType aMockType) {
        return aMockType.createTopicInformation(aMockType);
    }
}
