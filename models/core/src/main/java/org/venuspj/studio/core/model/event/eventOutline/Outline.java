package org.venuspj.studio.core.model.event.eventOutline;

import org.venuspj.studio.core.fundamentals.address.Address;
import org.venuspj.studio.core.model.player.PlayerIds;
import org.venuspj.studo.generic.fundamentals.datetime.RecordDate;
import org.venuspj.util.objects2.Objects2;

/**
 * イベントのアウトラインを保持するValueObject
 */
public class Outline {
    RecordDate recordDate;
    Address address;
    PlayerIds playerIds;

    Outline() {
    }

    public Outline(RecordDate aRecordDate, Address anAddress, PlayerIds anPlayerIds) {
        recordDate = aRecordDate;
        address = anAddress;
        playerIds = anPlayerIds;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("recordDate", recordDate)
                .add("address", address)
                .omitNullValues()
                .toString();
    }
}
