package org.venuspj.studio.core.model.event.eventOutline;

import org.venuspj.studio.core.fundamentals.place.Place;
import org.venuspj.studio.core.model.event.EventId;
import org.venuspj.studio.core.model.player.PlayerIds;
import org.venuspj.studio.generic.fundamentals.address.Address;
import org.venuspj.studio.generic.fundamentals.datetime.RecordDate;
import org.venuspj.util.objects2.Objects2;

/**
 * イベントのアウトラインを保持するValueObject
 */
public class Outline {
    EventId eventId;
    RecordDate recordDate;
    Address address;
    PlayerIds playerIds;
    Place place;

    Outline() {
    }

    public Outline(EventId anEventId, RecordDate aRecordDate, Address anAddress, PlayerIds anPlayerIds, Place aPlace) {
        eventId = anEventId;
        recordDate = aRecordDate;
        address = anAddress;
        playerIds = anPlayerIds;
        place = aPlace;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("eventId", eventId)
                .add("recordDate", recordDate)
                .add("address", address)
                .add("place", place)
                .add("playerIds", playerIds)
                .omitNullValues()
                .toString();
    }

    public PlayerIds playerIds() {
        return playerIds;
    }
}
