package org.venuspj.studio.adapter.presenters.player.players;

import org.springframework.ui.Model;
import org.venuspj.cleanArchitecture.presentation.View;
import org.venuspj.studio.adapter.presenters.SpringView;
import org.venuspj.studio.view.player.players.PlayersViewModel;

public class PlayersPage implements SpringView<PlayersViewModel> {
    private static final String PLAYERS_PAGE_TEMPLATE = "/players";

    @Override
    public String getTemplatePath() {
        return PLAYERS_PAGE_TEMPLATE;
    }

    @Override
    public SpringView<PlayersViewModel> bind(Model aModel) {
        return null;
    }

    @Override
    public View<PlayersViewModel> setViewModel(PlayersViewModel aViewModel) {
        return null;
    }
}
