package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.studio.generic.fundamentals.datetime.Period;
import org.venuspj.studio.generic.model.ppt.place.Place;
import org.venuspj.studio.generic.model.ppt.place.PlaceImpl;

import static org.venuspj.util.objects2.Objects2.*;

/**
 * パーティーの所在の割り当て
 */
public class AddressUse extends AbstractEntity<AddressUse> {
    Period period = Period.emptyPeriod();
    Place place = PlaceImpl.emptyPlace();
    PartyIds partyIds = PartyIds.emptyPartyIds();

    public AddressUse(AddressUseId anAddressUseId, Period aPeriod, Place aPlace, PartyIds anyPartyIds) {
        super(anAddressUseId);
        period = aPeriod;
        place = aPlace;
        partyIds = anyPartyIds;

    }

    @Override
    protected ToStringHelper string() {
        return super.string()
                .add("period", period)
                .add("place", place)
                .add("partyIds", partyIds);
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }
}
