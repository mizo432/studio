package org.venuspj.studio.view.player;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Player;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

public class PlayerSummaryViewModel {

    private String playerName;

    PlayerSummaryViewModel(String aPlayerName) {
        playerName = aPlayerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public static class Builder extends ObjectBuilder<PlayerSummaryViewModel, Builder> {
        private String playerName;

        @Override
        protected void apply(PlayerSummaryViewModel vo, Builder aBuilder) {
            aBuilder.withPlayerName(vo.getPlayerName());

        }

        public Builder withPlayerName(String aPlayerName) {
            if (isNull(aPlayerName)) return getThis();
            addConfigurator(builder -> builder.playerName = aPlayerName);
            return getThis();

        }

        @Override
        protected PlayerSummaryViewModel createValueObject() {
            return new PlayerSummaryViewModel(playerName);
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        protected Builder newInstance() {
            return new Builder();
        }

        public Builder fromPlayer(Player aPlayer) {
            if (isNull(aPlayer)) return getThis();
            addConfigurator(builder -> {
            });
            return getThis();

        }
    }
}
