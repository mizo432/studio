package org.venuspj.studio.adapter.presenters.event;

import org.venuspj.cleanArchitecture.presentation.Presenter;
import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Players;
import org.venuspj.studio.core.usecase.event.FetchEventResponse;
import org.venuspj.studio.core.usecase.player.players.FetchPlayersResponse;
import org.venuspj.studio.view.event.EventViewModel;
import org.venuspj.studio.view.player.players.PlayersViewModel;

/**
 * イベントページ用のプレゼンター
 */
public class EventPagePresenter implements Presenter<EventPage>, FetchEventResponse, FetchPlayersResponse {

    private Event event;
    private Players players;

    @Override
    public EventPage createView() {
        EventPage view = new EventPage();
        view.setViewModel(createEventViewModel());
        view.setViewModel(createPlayersViewModel());
        return view;
    }

    private PlayersViewModel createPlayersViewModel() {
        return new PlayersViewModel.Builder()
                .fromPlayers(players)
                .build();

    }


    @Override
    public void setEvent(Event anEvent) {
        event = anEvent;
    }

    @Override
    public void setPlayers(Players anyPlayers) {
        players = anyPlayers;
    }

    private EventViewModel createEventViewModel() {
        return new EventViewModel
                .Builder()
                .withEventName(event.getInfo().getDescriptor().getName().asText())
                .build();
    }

}
