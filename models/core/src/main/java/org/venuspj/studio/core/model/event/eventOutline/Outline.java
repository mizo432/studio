package org.venuspj.studio.core.model.event.eventOutline;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.ddd.model.entity.EntityIdentifiers;
import org.venuspj.studio.generic.fundamentals.address.Address;
import org.venuspj.studio.generic.fundamentals.datetime.RecordDate;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnitIds;
import org.venuspj.studio.generic.model.ppt.place.Place;
import org.venuspj.util.objects2.Objects2;

/**
 * イベントのアウトラインを保持するValueObject
 */
public class Outline {
    RecordDate recordDate;
    Address address;
    EntityIdentifiers<Party> playerIds = OrganizationUnitIds.emptyOrganizationUnitIds();
    Place place;

    Outline() {
    }

    public Outline(RecordDate aRecordDate, Address anAddress, EntityIdentifiers<Party> anPlayerIds, Place aPlace) {
        recordDate = aRecordDate;
        address = anAddress;
        playerIds = anPlayerIds;
        place = aPlace;
    }

    public static Outline defaultOutline() {
        return new Outline();
    }

    public Iterable<EntityIdentifier<Party>> playerIds() {
        return playerIds;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("recordDate", recordDate)
                .add("address", address)
                .add("place", place)
                .add("playerIds", playerIds)
                .omitNullValues()
                .toString();
    }
}
