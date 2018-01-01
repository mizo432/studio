package org.venuspj.studio.core.usecase.topic.topics;

import org.venuspj.cleanArchitecture.useCase.Response;
import org.venuspj.studio.core.model.topic.topics.Topics;

public interface FetchTopicsResponse extends Response {

    void setTopics(Topics topics);

}
