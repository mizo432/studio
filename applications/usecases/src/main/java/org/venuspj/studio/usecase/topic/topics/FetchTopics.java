package org.venuspj.studio.usecase.topic.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.studio.core.model.topic.TopicRepository;
import org.venuspj.studio.core.model.topic.topics.Topics;
import org.venuspj.studio.core.usecase.topic.topics.FetchTopicsRequest;
import org.venuspj.studio.core.usecase.topic.topics.FetchTopicsResponse;
import org.venuspj.studio.core.usecase.topic.topics.FetchTopicsUseCase;

@Service
public class FetchTopics implements FetchTopicsUseCase {
    TopicRepository topicRepository;

    @Autowired
    FetchTopics(TopicRepository aTopicRepository) {
        topicRepository = aTopicRepository;
    }

    @Override
    public void execute(FetchTopicsRequest request, FetchTopicsResponse response) {
        Topics topics = topicRepository.resolveEntities(request.getTopicCriteria());
        response.setTopics(topics);

    }
}
