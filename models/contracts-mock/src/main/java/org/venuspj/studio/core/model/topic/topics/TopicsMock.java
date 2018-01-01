package org.venuspj.studio.core.model.topic.topics;

import org.venuspj.studio.core.model.topic.Topic;
import org.venuspj.studio.core.model.topic.TopicMock;

import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class TopicsMock {
    public static Topics createDummy(MockType anyMockType) {
        List<Topic> newsList = newArrayList();
        for (TopicMock.MockType mockType : anyMockType.newsTypes()) {
            newsList.add(TopicMock.createDummy(mockType));
        }
        return new Topics(newsList);
    }


    public enum MockType {
        EMPTY {
            @Override
            public TopicMock.MockType[] newsTypes() {
                return new TopicMock.MockType[0];
            }
        }, DEFAULT {
            @Override
            public TopicMock.MockType[] newsTypes() {
                return new TopicMock.MockType[]{
                        TopicMock.MockType.NEWS1,
                        TopicMock.MockType.NEWS2,
                        TopicMock.MockType.NEWS3,
                        TopicMock.MockType.NEWS4,
                        TopicMock.MockType.NEWS5,
                        TopicMock.MockType.NEWS6,
                        TopicMock.MockType.NEWS7,
                        TopicMock.MockType.NEWS8,
                        TopicMock.MockType.NEWS9,
                        TopicMock.MockType.NEWS10,
                };
            }
        };

        public abstract TopicMock.MockType[] newsTypes();
    }
}
