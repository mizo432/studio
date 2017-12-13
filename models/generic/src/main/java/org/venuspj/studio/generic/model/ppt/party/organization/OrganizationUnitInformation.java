package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.ppt.party.AddressUse;
import org.venuspj.studio.generic.model.ppt.party.PartyInformation;

public class OrganizationUnitInformation extends PartyInformation {
    private OrganizationUnitInformation() {
        super(Name.empty(), new AddressUse.Builder().build());

    }

    public OrganizationUnitInformation(Name aName, AddressUse anAddressUse) {
        super(aName, anAddressUse);
    }

    public static OrganizationUnitInformation empty() {
        return new OrganizationUnitInformation();
    }

    public static class Builder extends PartyInformation.Builder<OrganizationUnitInformation, Builder> {

        @Override
        protected void apply(OrganizationUnitInformation vo, Builder builder) {
            super.apply(vo, builder);

        }

        @Override
        protected OrganizationUnitInformation createValueObject() {
            return new OrganizationUnitInformation(name, addressUse);
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        protected Builder newInstance() {
            return new OrganizationUnitInformation.Builder();
        }

    }

}
