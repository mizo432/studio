package org.venuspj.studio.adapter.presenters.topic.topics;

import org.springframework.ui.Model;
import org.venuspj.cleanArchitecture.presentation.View;
import org.venuspj.studio.adapter.presenters.SpringView;
import org.venuspj.studio.view.topic.topics.TopicsViewModel;

public class TopicsPage implements SpringView<TopicsViewModel> {
    private static final String TOPICS_PAGE_TEMPLATE = "/topics";

    private TopicsViewModel topicsViewModel = TopicsViewModel.create();

    @Override
    public String getTemplatePath() {
        return TOPICS_PAGE_TEMPLATE;
    }

    @Override
    public SpringView<TopicsViewModel> bind(Model aModel) {
        aModel.addAttribute("topics", topicsViewModel);
        return this;
    }

    @Override
    public View<TopicsViewModel> setViewModel(TopicsViewModel aViewModel) {
        topicsViewModel = aViewModel;
        return this;
    }

}
