package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.ppt.party.AddressUse;
import org.venuspj.studio.generic.model.ppt.party.PartyInformation;

import static org.venuspj.util.objects2.Objects2.*;

public class OrganizationInformation extends PartyInformation {

    public OrganizationInformation(Name aName, AddressUse anAddressUse) {
        super(aName, anAddressUse);
    }

    public OrganizationInformation() {
        super();

    }

    public static OrganizationInformation empty() {
        return new OrganizationInformation();
    }

    public static class Builder extends PartyInformation.Builder<OrganizationInformation, Builder> {

        @Override
        protected void apply(OrganizationInformation vo, Builder builder) {
            super.apply(vo, builder);

        }

        @Override
        public Builder withAddressUse(AddressUse anAddressUse) {
            if (isNull(anAddressUse)) return getThis();
            addConfigurator(builder -> builder.addressUse = anAddressUse);
            return getThis();
        }

        @Override
        public Builder withName(Name aName) {
            if (isNull(aName)) return getThis();
            addConfigurator(builder -> builder.name = aName);
            return getThis();
        }

        @Override
        protected OrganizationInformation createValueObject() {
            return new OrganizationInformation(name, addressUse);
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
