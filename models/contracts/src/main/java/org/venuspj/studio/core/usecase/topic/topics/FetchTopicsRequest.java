package org.venuspj.studio.core.usecase.topic.topics;

import org.venuspj.cleanArchitecture.useCase.Request;
import org.venuspj.studio.core.model.topic.TopicCriteria;

public interface FetchTopicsRequest extends Request {
    TopicCriteria getTopicCriteria();

}
