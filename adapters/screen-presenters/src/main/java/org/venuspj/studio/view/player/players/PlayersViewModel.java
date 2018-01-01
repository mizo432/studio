package org.venuspj.studio.view.player.players;

import org.venuspj.ddd.model.value.AbstractListValue;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Player;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Players;
import org.venuspj.studio.view.player.PlayerSummaryViewModel;
import org.venuspj.util.builder.ObjectBuilder;

import java.util.Collection;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;
import static org.venuspj.util.objects2.Objects2.*;

public class PlayersViewModel extends AbstractListValue<PlayerSummaryViewModel> {

    public PlayersViewModel(Collection<PlayerSummaryViewModel> anyPlayers) {
        super(anyPlayers);
    }

    PlayersViewModel() {

    }

    public static PlayersViewModel create() {
        return new PlayersViewModel();
    }

    public static class Builder extends ObjectBuilder<PlayersViewModel, Builder> {

        private List<PlayerSummaryViewModel> list = newArrayList();

        @Override
        protected void apply(PlayersViewModel vo, PlayersViewModel.Builder aBuilder) {

        }

        @Override
        protected PlayersViewModel createValueObject() {
            return new PlayersViewModel(list);
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        protected Builder newInstance() {
            return new Builder();
        }

        public Builder fromPlayers(Players anyPlayers) {
            if (isNull(anyPlayers)) return getThis();
            addConfigurator(builder -> {
                for (Player player : anyPlayers)
                    builder.list.add(new PlayerSummaryViewModel
                            .Builder()
                            .fromPlayer(player)
                            .build());

            });
            return getThis();

        }

    }

}
