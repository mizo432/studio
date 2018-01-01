package org.venuspj.studio.view.player;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Player;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

public class PlayerSummaryViewModel {

    public static class Builder extends ObjectBuilder<PlayerSummaryViewModel, Builder> {

        @Override
        protected void apply(PlayerSummaryViewModel vo, Builder aBuilder) {

        }

        @Override
        protected PlayerSummaryViewModel createValueObject() {
            return new PlayerSummaryViewModel();
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
