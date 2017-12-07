package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.model.ppt.party.AddressUse;
import org.venuspj.studio.generic.model.ppt.party.PartyInformation;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

public class OrganizationInformation extends PartyInformation {

    public OrganizationInformation(AddressUse anAddressUse) {
        super(anAddressUse);
    }

    public static OrganizationInformation empty() {
        return new OrganizationInformation(new AddressUse.Builder().build());
    }

    public AddressUse getAddressUse() {
        return addressUse;
    }

    public static class Builder extends ObjectBuilder<OrganizationInformation, Builder> {
        private AddressUse addressUse;

        @Override
        protected void apply(OrganizationInformation vo, Builder builder) {
            builder.withAddressUse(vo.getAddressUse());

        }

        @Override
        protected OrganizationInformation createValueObject() {
            return new OrganizationInformation(addressUse);
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        protected Builder newInstance() {
            return new Builder();
        }

        public Builder withAddressUse(AddressUse anAddressUse) {
            if (isNull(anAddressUse)) return getThis();
            addConfigurator(builder -> builder.addressUse = anAddressUse);
            return getThis();
        }
    }
}
