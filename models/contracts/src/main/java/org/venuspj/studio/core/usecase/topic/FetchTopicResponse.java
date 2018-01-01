package org.venuspj.studio.core.usecase.topic;

import org.venuspj.cleanArchitecture.useCase.Response;
import org.venuspj.studio.core.model.topic.Topic;

public interface FetchTopicResponse extends Response {
    void setNews(Topic news);

}
