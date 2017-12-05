package org.venuspj.studio.core.model.role.partyRole.organizationRole.performer;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Player;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.util.builder.ObjectBuilder;

/**
 * 出演者
 */
public class Performer extends Player {

    public <P extends Party, PI extends PerformerInformation> Performer(P aParty, PI aPerformerInformation) {
        super(aParty, aPerformerInformation);

    }

    protected Performer() {
        super();

    }

    public static Performer empty() {
        return new Performer();
    }

    Party getParty() {
        return (Party) partyPlaceThing;
    }

    public PerformerInformation getPerformerInformation() {
        return (PerformerInformation) roleInfoInformation;
    }

    public static class Builder extends ObjectBuilder<Performer, Builder> {

        private Party party;
        private PerformerInformation performerInformation;

        @Override
        protected void apply(Performer vo, Builder builder) {
            builder.withParty(vo.getParty());
            builder.withPerformerInformation(vo.getPerformerInformation());

        }

        public Builder withPerformerInformation(PerformerInformation aPerformerInformation) {
            if (aPerformerInformation == null) return getThis();
            addConfigurator(builder -> builder.performerInformation = aPerformerInformation);
            return getThis();
        }

        public Builder withParty(Party aParty) {
            if (aParty == null) return getThis();
            addConfigurator(builder -> builder.party = aParty);
            return getThis();
        }

        @Override
        protected Performer createValueObject() {
            return new Performer(party, performerInformation);
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        protected Builder newInstance() {
            return new Builder();
        }
    }
}
