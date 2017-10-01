package org.venuspj.studio.core.model.event.eventOutline;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.fundamentals.place.Place;
import org.venuspj.studio.generic.fundamentals.address.Address;
import org.venuspj.studio.generic.fundamentals.datetime.RecordDate;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnit;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnitIds;
import org.venuspj.util.objects2.Objects2;

/**
 * イベントのアウトラインを保持するValueObject
 */
public class Outline {
    RecordDate recordDate;
    Address address;
    OrganizationUnitIds playerIds = OrganizationUnitIds.emptyOrganizationUnitIds();
    Place place;

    Outline() {
    }

    public Outline(RecordDate aRecordDate, Address anAddress, OrganizationUnitIds anPlayerIds, Place aPlace) {
        recordDate = aRecordDate;
        address = anAddress;
        playerIds = anPlayerIds;
        place = aPlace;
    }

    public static Outline defaultOutline() {
        return new Outline();
    }

    public Iterable<EntityIdentifier<OrganizationUnit>> playerIds() {
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
