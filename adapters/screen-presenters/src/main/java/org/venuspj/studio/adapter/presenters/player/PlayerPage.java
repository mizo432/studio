package org.venuspj.studio.adapter.presenters.player;

import org.springframework.ui.Model;
import org.venuspj.cleanArchitecture.presentation.View;
import org.venuspj.studio.adapter.presenters.SpringView;
import org.venuspj.studio.view.event.events.EventsViewModel;
import org.venuspj.studio.view.player.PlayerViewModel;
import org.venuspj.studio.view.product.products.ProductsViewModel;

public class PlayerPage implements SpringView<PlayerViewModel> {
    private static final String PLAYER_PAGE_TEMPLATE = "/player";

    @Override
    public String getTemplatePath() {
        return PLAYER_PAGE_TEMPLATE;
    }

    @Override
    public SpringView<PlayerViewModel> bind(Model aModel) {
        return null;
    }

    @Override
    public View<PlayerViewModel> setViewModel(PlayerViewModel aViewModel) {
        return null;
    }

    public View<PlayerViewModel> setViewModel(EventsViewModel aViewModel) {
        return this;
    }

    public View<PlayerViewModel> setViewModel(ProductsViewModel aViewModel) {
        return this;
    }
}
