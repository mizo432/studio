package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;
import org.venuspj.studio.generic.model.ppt.party.PartyImpl;

import static org.venuspj.util.objects2.Objects2.*;

public class PersonImpl extends PartyImpl implements Person, Entity<Party> {

    public <EI extends PartyIdentifier> PersonImpl(EI anIdentifier, PersonInformation aPersonInformation) {
        super(anIdentifier, aPersonInformation);

    }

    public static Person emptyPerson() {
        return new PersonImpl(
                PartyIdentifier.newId(),
                PersonInformation.empty());

    }

    @Override
    public PersonInformation getPersonInformation() {
        return (PersonInformation) super.getPartyInformation();
    }

    public static class Builder extends PartyImpl.Builder<PersonImpl, Builder> {

        private PersonInformation personInformation;

        @Override
        protected void apply(PersonImpl vo, Builder builder) {
            super.apply(vo, builder);
            builder.withPersonInformation(vo.getPersonInformation());

        }

        public Builder withPersonInformation(PersonInformation aPersonInformation) {
            if (isNull(aPersonInformation)) return getThis();
            addConfigurator(builder -> builder.personInformation = aPersonInformation);
            return getThis();
        }

        @Override
        protected PersonImpl createValueObject() {
            return new PersonImpl(identifier, personInformation);
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        protected Builder newInstance() {
            return new PersonImpl.Builder();
        }
    }

}
