package org.venuspj.studio.core.model.topic;

/**
 */
public class TopicIdentifierMock {

    public static TopicIdentifier createDummy(TopicMock.MockType aMockType) {
        return new TopicIdentifier(aMockType.idValue());
    }

}
