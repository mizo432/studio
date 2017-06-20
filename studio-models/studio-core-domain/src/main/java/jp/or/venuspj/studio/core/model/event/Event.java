package jp.or.venuspj.studio.core.model.event;

import jp.or.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import jp.or.venuspj.studio.core.model.event.flyers.Flyers;
import jp.or.venuspj.studio.core.model.player.PlayerIds;
import jp.or.venuspj.studo.generic.fundamentals.datetime.RecordDate;
import jp.or.venuspj.util.objects2.Objects2;

/**
 */
public class Event {

    RecordDate recordDate = RecordDate.empty();

    EventId eventId = EventId.defaultEventId();
    Descriptor descriptor = Descriptor.defaultDescriptor();
    Flyers flyers = Flyers.empty();
    PlayerIds playerIds = PlayerIds.empty();

    Event() {

    }

    public Event(EventId anEventId, Descriptor aDescriptor, Flyers aFlyers, PlayerIds aPlayerIds, RecordDate aRecordDate) {
        eventId = anEventId;
        descriptor = aDescriptor;
        flyers = aFlyers;
        playerIds = aPlayerIds;
        recordDate = aRecordDate;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("eventId", eventId)
                .add("descriptor", descriptor)
                .add("recordDate", recordDate)
                .add("flyers", flyers)
                .add("playerIds", playerIds)
                .omitNullValues()
                .toString();
    }

}
