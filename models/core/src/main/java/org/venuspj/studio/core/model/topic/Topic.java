package org.venuspj.studio.core.model.topic;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.studio.core.model.topic.infomation.TopicInformation;

/**
 */
public class Topic extends AbstractEntity<Topic> {


    private final TopicInformation topicInformation;

    Topic() {
        super(TopicIdentifier.defaultNewsId());
        topicInformation = TopicInformation.create();
    }

    public Topic(TopicIdentifier aTopicIdentifier, TopicInformation aTopicInformation) {
        super(aTopicIdentifier);
        topicInformation = aTopicInformation;
    }

    public TopicInformation getTopicInformation() {
        return topicInformation;
    }

    public TopicIdentifier getTopicIdentifier() {
        return (TopicIdentifier) identifier();

    }
}
