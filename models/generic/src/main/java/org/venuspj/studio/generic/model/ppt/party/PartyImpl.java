package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.studio.generic.model.ppt.PartyPlaceThingImpl;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

/**
 */
public abstract class PartyImpl extends PartyPlaceThingImpl<Party> implements Party, Entity<Party> {

    @SuppressWarnings("unchecked")
    public <ID extends PartyIdentifier> PartyImpl(ID anIdentifier, PartyInformation aPartyInfo) {
        super(anIdentifier, aPartyInfo);
    }

    public PartyInformation getPartyInformation() {
        return (PartyInformation) super.getPptInformation();
    }

    public boolean sameValueAs(PartyImpl that) {
        if (isNull(that)) return false;
        return super.sameValueAs(that);
    }

    public AddressUse getCurrentAddressUse() {
        return getPartyInformation().getAddressUse();
    }


    public abstract static class Builder<P extends PartyImpl, B extends Builder<P, B>> extends ObjectBuilder<P, B> {
        protected PartyIdentifier identifier;

        public B withIdentifier(PartyIdentifier anIdentifier) {
            if (isNull(anIdentifier)) return getThis();
            addConfigurator(builder -> builder.identifier = anIdentifier);
            return getThis();
        }

        @Override
        protected void apply(P vo, B builder) {
            builder.withIdentifier((PartyIdentifier) vo.identifier());

        }

    }

}
