package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.studio.generic.fundamentals.datetime.Period;
import org.venuspj.studio.generic.model.ppt.place.Place;
import org.venuspj.studio.generic.model.ppt.place.PlaceImpl;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class AddressUse {
    Period period = Period.emptyPeriod();
    Place place = PlaceImpl.emptyPlace();
    Party<?> party = PartyImpl.emptyParty();

    public AddressUse(Period aPeriod, Place aPlace, Party<?> aParty) {
        period = aPeriod;
        place = aPlace;
        party = aParty;

    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("period", period)
                .add("place", place)
                .add("party", party)
                .omitNullValues()
                .toString();
    }
}
