package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.studio.generic.fundamentals.address.Address;
import org.venuspj.studio.generic.fundamentals.datetime.Period;
import org.venuspj.studio.generic.model.ppt.place.Place;
import org.venuspj.studio.generic.model.ppt.place.PlaceImpl;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

/**
 * パーティーの所在の割り当て.
 * MomentInterval
 */
public class AddressUse extends AbstractEntity<AddressUse> {
    Period period = Period.emptyPeriod();
    Place place = PlaceImpl.emptyPlace();
    PartyIdentifiers partyIdentifiers = PartyIdentifiers.create();
    Address address = Address.defaultAddress();

    public AddressUse(AddressUseIdentifier anAddressUseIdentifier, Period aPeriod, Place aPlace, PartyIdentifiers anyPartyIdentifiers, Address anAddress) {
        super(anAddressUseIdentifier);
        period = aPeriod;
        place = aPlace;
        partyIdentifiers = anyPartyIdentifiers;
        address = anAddress;

    }

    public Period getPeriod() {
        return period;
    }

    public PartyIdentifiers getPartyIdentifiers() {
        return partyIdentifiers;
    }

    public Address getAddress() {
        return address;
    }

    public AddressUseIdentifier getAddressUseIdentifier() {
        return (AddressUseIdentifier) super.identifier();
    }

    public Place getPlace() {
        return place;
    }

    public static class Builder extends ObjectBuilder<AddressUse, Builder> {
        AddressUseIdentifier addressUseIdentifier;
        Period period;
        Place place;
        PartyIdentifiers partyIdentifiers;
        Address address;

        @Override
        protected void apply(AddressUse vo, Builder builder) {
            builder.withAddressUseIdentifier(vo.getAddressUseIdentifier());
            builder.withPeriod(vo.getPeriod());
            builder.withPlace(vo.getPlace());
            builder.withPartyIds(vo.getPartyIdentifiers());
            builder.withAddress(vo.getAddress());

        }

        public Builder withPlace(Place aPlace) {
            if (isNull(aPlace)) return getThis();
            addConfigurator(builder -> builder.place = aPlace);
            return getThis();
        }

        public Builder withAddress(Address anAddress) {
            if (isNull(anAddress)) return getThis();
            addConfigurator(builder -> builder.address = anAddress);
            return getThis();
        }

        public Builder withPartyIds(PartyIdentifiers aPartyIdentifiers) {
            if (isNull(aPartyIdentifiers)) return getThis();
            addConfigurator(builder -> builder.partyIdentifiers = aPartyIdentifiers);
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
            return new AddressUse(addressUseIdentifier, period, place, partyIdentifiers, address);
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
