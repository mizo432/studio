package org.venuspj.studio.adapter.presenters.event;

import org.springframework.ui.Model;
import org.venuspj.cleanArchitecture.presentation.View;
import org.venuspj.studio.adapter.presenters.SpringView;
import org.venuspj.studio.view.event.EventViewModel;
import org.venuspj.studio.view.player.players.PlayersViewModel;

/**
 * イベントページのview
 */
public class EventPage implements SpringView<EventViewModel> {
    private static final String EVENT_PAGE_TEMPLATE = "/event";

    private EventViewModel event;
    private PlayersViewModel players;

    @Override
    public String getTemplatePath() {
        return EVENT_PAGE_TEMPLATE;
    }

    @Override
    public SpringView<EventViewModel> bind(Model model) {
        model.addAttribute("event", event);
        model.addAttribute("players", players);
        return this;
    }

    @Override
    public View<EventViewModel> setViewModel(EventViewModel aViewModel) {
        event = aViewModel;
        return this;
    }

    public View<EventViewModel> setViewModel(PlayersViewModel aViewModel) {
        players = aViewModel;
        return this;
    }

}
