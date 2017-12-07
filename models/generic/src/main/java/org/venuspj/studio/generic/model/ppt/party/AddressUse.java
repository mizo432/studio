package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.studio.generic.fundamentals.address.Address;
import org.venuspj.studio.generic.fundamentals.datetime.Period;
import org.venuspj.studio.generic.model.ppt.place.Place;
import org.venuspj.studio.generic.model.ppt.place.PlaceImpl;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

/**
 * パーティーの所在の割り当て
 */
public class AddressUse extends AbstractEntity<AddressUse> {
    Period period = Period.emptyPeriod();
    Place place = PlaceImpl.emptyPlace();
    PartyIds partyIds = PartyIds.emptyPartyIds();
    Address address = Address.defaultAddress();

    public AddressUse(AddressUseIdentifier anAddressUseIdentifier, Period aPeriod, Place aPlace, PartyIds anyPartyIds, Address anAddress) {
        super(anAddressUseIdentifier);
        period = aPeriod;
        place = aPlace;
        partyIds = anyPartyIds;
        address = anAddress;

    }

    public Period getPeriod() {
        return period;
    }

    public PartyIds getPartyIds() {
        return partyIds;
    }

    public Address getAddress() {
        return address;
    }

    public AddressUseIdentifier getAddressUseIdentifier() {
        return (AddressUseIdentifier) super.identifier();
    }

    public static class Builder extends ObjectBuilder<AddressUse, Builder> {
        AddressUseIdentifier addressUseIdentifier;
        Period period;
        Place place;
        PartyIds partyIds;
        Address address;

        @Override
        protected void apply(AddressUse vo, Builder builder) {
            builder.withAddressUseIdentifier(vo.getAddressUseIdentifier());
            builder.withPeriod(vo.getPeriod());
            builder.withPartyIds(vo.getPartyIds());
            builder.withAddress(vo.getAddress());
        }

        public Builder withAddress(Address anAddress) {
            if (isNull(anAddress)) return getThis();
            addConfigurator(builder -> builder.address = anAddress);
            return getThis();
        }

        public Builder withPartyIds(PartyIds aPartyIds) {
            if (isNull(aPartyIds)) return getThis();
            addConfigurator(builder -> builder.partyIds = aPartyIds);
            return getThis();

        }

        public Builder withPeriod(Period aPeriod) {
            if (isNull(aPeriod)) return getThis();
            addConfigurator(builder -> builder.period = aPeriod);
            return getThis();
        }

        public Builder withAddressUseIdentifier(AddressUseIdentifier anAddressUseIdentifier) {
            if (isNull(anAddressUseIdentifier)) return getThis();
            addConfigurator(builder -> builder.addressUseIdentifier = anAddressUseIdentifier);
            return getThis();

        }

        @Override
        protected AddressUse createValueObject() {
            return new AddressUse(addressUseIdentifier, period, place, partyIds, address);
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
