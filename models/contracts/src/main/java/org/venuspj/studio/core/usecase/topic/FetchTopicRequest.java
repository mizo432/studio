package org.venuspj.studio.core.usecase.topic;

import org.venuspj.cleanArchitecture.useCase.Request;
import org.venuspj.studio.core.model.topic.TopicIdentifier;

public interface FetchTopicRequest extends Request {
    TopicIdentifier getTopicIdentifier();
}
