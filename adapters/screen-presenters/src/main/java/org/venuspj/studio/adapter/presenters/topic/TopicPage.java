package org.venuspj.studio.adapter.presenters.topic;

import org.springframework.ui.Model;
import org.venuspj.cleanArchitecture.presentation.View;
import org.venuspj.studio.adapter.presenters.SpringView;
import org.venuspj.studio.view.player.players.PlayersViewModel;
import org.venuspj.studio.view.topic.TopicViewModel;

public class TopicPage implements SpringView<TopicViewModel> {
    private static final String TOPIC_PAGE_TEMPLATE = "/topic";

    private TopicViewModel topicViewModel;
    private PlayersViewModel playersViewModel;

    @Override
    public String getTemplatePath() {
        return TOPIC_PAGE_TEMPLATE;
    }

    @Override
    public SpringView<TopicViewModel> bind(Model aModel) {
        aModel.addAttribute("topic", topicViewModel);
        aModel.addAttribute("players", playersViewModel);
        return this;
    }

    @Override
    public View<TopicViewModel> setViewModel(TopicViewModel aViewModel) {
        topicViewModel = aViewModel;
        return this;
    }

    public View<TopicViewModel> setViewModel(PlayersViewModel aViewModel) {
        playersViewModel = aViewModel;
        return this;
    }

}
