package org.venuspj.studio.view.player;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Player;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

public class PlayerViewModel {

    public static class Builder extends ObjectBuilder<PlayerViewModel, Builder> {

        @Override
        protected void apply(PlayerViewModel vo, Builder aBuilder) {

        }

        @Override
        protected PlayerViewModel createValueObject() {
            return new PlayerViewModel();
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
