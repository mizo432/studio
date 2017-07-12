package org.venuspj.studio.core.model.event.eventOutline;

import org.venuspj.studio.core.fundamentals.place.Place;
import org.venuspj.studio.core.model.player.PlayerIds;
import org.venuspj.studio.generic.fundamentals.address.Address;
import org.venuspj.studio.generic.fundamentals.datetime.RecordDate;
import org.venuspj.util.objects2.Objects2;

/**
 * イベントのアウトラインを保持するValueObject
 */
public class Outline {
    RecordDate recordDate;
    Address address;
    PlayerIds playerIds = PlayerIds.empty();
    Place place;

    Outline() {
    }

    public Outline(RecordDate aRecordDate, Address anAddress, PlayerIds anPlayerIds, Place aPlace) {
        recordDate = aRecordDate;
        address = anAddress;
        playerIds = anPlayerIds;
        place = aPlace;
    }

    );
    }

    public PlayerIds playerIds() {
        return playerIds;
    }", pla
public static Outline defaultOutline() {
        return new Outline();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("recordDate", recordDate)
                .add("address", address)
                .add("place", place)
                .add("playerIdstring(
yerIds)
                .omitNullValues()
                .toS
}
