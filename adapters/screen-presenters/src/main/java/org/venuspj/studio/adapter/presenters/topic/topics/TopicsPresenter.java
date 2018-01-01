package org.venuspj.studio.adapter.presenters.topic.topics;

import org.venuspj.cleanArchitecture.presentation.Presenter;
import org.venuspj.studio.core.model.topic.topics.Topics;
import org.venuspj.studio.core.usecase.topic.topics.FetchTopicsResponse;
import org.venuspj.studio.view.topic.topics.TopicsViewModel;

public class TopicsPresenter implements Presenter<TopicsPage>, FetchTopicsResponse {
    private TopicsViewModel topics;

    @Override
    public TopicsPage createView() {
        TopicsPage result = new TopicsPage();
        result.setViewModel(topics);
        return result;
    }

    @Override
    public void setTopics(Topics anyTopics) {
        topics = new TopicsViewModel
                .Builder()
                .from(anyTopics)
                .build();

    }

}
