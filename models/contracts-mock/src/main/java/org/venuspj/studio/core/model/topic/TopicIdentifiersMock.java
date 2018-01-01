package org.venuspj.studio.core.model.topic;

import org.venuspj.studio.core.model.topic.topics.TopicsMock;

import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class TopicIdentifiersMock {
    public static TopicIdentifiers createDummy(TopicsMock.MockType anyMockType) {
        List<TopicIdentifier> newsList = newArrayList();

        for (TopicMock.MockType mockType : anyMockType.newsTypes())
            newsList.add(TopicIdentifierMock.createDummy(mockType));

        return new TopicIdentifiers(newsList);
    }
}
