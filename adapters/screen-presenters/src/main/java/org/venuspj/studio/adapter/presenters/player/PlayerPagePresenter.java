package org.venuspj.studio.adapter.presenters.player;

import org.venuspj.cleanArchitecture.presentation.Presenter;
import org.venuspj.studio.core.model.event.Events;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Player;
import org.venuspj.studio.core.model.role.thingRole.product.Products;
import org.venuspj.studio.core.usecase.event.events.FetchEventsResponse;
import org.venuspj.studio.core.usecase.player.FetchPlayerResponse;
import org.venuspj.studio.core.usecase.product.products.FetchProductsResponse;
import org.venuspj.studio.view.event.events.EventsViewModel;
import org.venuspj.studio.view.player.PlayerViewModel;
import org.venuspj.studio.view.product.products.ProductsViewModel;

/**
 * プレイヤーページ用のプレゼンター
 */
public class PlayerPagePresenter implements Presenter<PlayerPage>, FetchPlayerResponse, FetchEventsResponse, FetchProductsResponse {

    private Player player;
    private Events events;
    private Products products;

    @Override
    public PlayerPage createView() {
        PlayerPage view = new PlayerPage();
        view.setViewModel(createPlayerViewModel());
        view.setViewModel(createEventsViewModel());
        view.setViewModel(createProductsViewModel());
        return view;
    }


    @Override
    public void setPlayer(Player aPlayer) {
        player = aPlayer;
    }

    @Override
    public void setEvents(Events anyEvents) {
        events = anyEvents;
    }

    @Override
    public void setProducts(Products anyProducts) {
        products = anyProducts;
    }

    private PlayerViewModel createPlayerViewModel() {
        return new PlayerViewModel.Builder()
                .fromPlayer(player)
                .build();
    }

    private ProductsViewModel createProductsViewModel() {
        return new ProductsViewModel.Builder()
                .fromProducts(products)
                .build();
    }

    private EventsViewModel createEventsViewModel() {
        return new EventsViewModel.Builder().fromEvents(events).build();
    }

}
