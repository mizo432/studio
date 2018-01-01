package org.venuspj.studio.usecase.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.studio.core.model.topic.Topic;
import org.venuspj.studio.core.model.topic.TopicRepository;
import org.venuspj.studio.core.usecase.topic.FetchTopicRequest;
import org.venuspj.studio.core.usecase.topic.FetchTopicResponse;
import org.venuspj.studio.core.usecase.topic.FetchTopicUseCase;

@Service
public class FetchTopic implements FetchTopicUseCase {
    TopicRepository topicRepository;

    @Autowired
    FetchTopic(TopicRepository aTopicRepository) {
        topicRepository = aTopicRepository;
    }

    @Override
    public void execute(FetchTopicRequest request, FetchTopicResponse response) {
        Topic news = topicRepository.resolve(request.getTopicIdentifier());
        response.setNews(news);

    }
}
