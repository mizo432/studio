package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.ppt.party.AddressUse;
import org.venuspj.studio.generic.model.ppt.party.PartyInformation;

public class PersonInformation extends PartyInformation {
    protected PersonInformation() {
        super();
    }

    public PersonInformation(Name aName, AddressUse anAddressUse) {
        super(aName, anAddressUse);
    }

    public static PersonInformation empty() {
        return new PersonInformation();
    }

    public static class Builder extends PartyInformation.Builder<PersonInformation, Builder> {

        @Override
        protected void apply(PersonInformation vo, Builder builder) {
            super.apply(vo, builder);

        }

        @Override
        protected PersonInformation createValueObject() {
            return new PersonInformation(name, addressUse);
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
