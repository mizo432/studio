package org.venuspj.studio.view.index;

import org.springframework.ui.Model;
import org.venuspj.cleanArchitecture.presentation.View;
import org.venuspj.studio.adapter.presenters.SpringView;
import org.venuspj.studio.view.event.events.EventsViewModel;
import org.venuspj.studio.view.topic.news.NewsViewModel;
import org.venuspj.studio.view.player.players.PlayersViewModel;

public class IndexView implements SpringView<IndexViewModel> {

    private static final String INDEX_PAGE_TEMPLATE = "/index";
    private NewsViewModel news;
    private EventsViewModel events;
    private PlayersViewModel players;

    @Override
    public String getTemplatePath() {
        return INDEX_PAGE_TEMPLATE;
    }

    @Override
    public SpringView<IndexViewModel> bind(Model model) {
        model.addAttribute("news", news);
        model.addAttribute("events", events);
        model.addAttribute("players", players);
        return this;
    }

    @Override
    public View<IndexViewModel> setViewModel(IndexViewModel aViewModel) {
        news = aViewModel.getNews();
        events = aViewModel.getEvents();
        players = aViewModel.getPlayers();
        return this;
    }
}
