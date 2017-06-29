package org.venuspj.studio.core.model.event;

import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.model.event.eventOutline.Outline;
import org.venuspj.studio.core.model.event.flyers.Flyers;
import org.venuspj.studio.core.model.player.PlayerIds;
import org.venuspj.studio.generic.fundamentals.datetime.RecordDate;
import org.venuspj.util.objects2.Objects2;

/**
 *
 */
public class Event {

    Descriptor descriptor = Descriptor.defaultDescriptor();
    Flyers flyers = Flyers.empty();
    PlayerIds playerIds = PlayerIds.empty();
    Outline outline;

    Event() {

    }

    public Event(Outline anOutline, Descriptor aDescriptor, Flyers aFlyers, PlayerIds aPlayerIds, RecordDate aRecordDate) {
        outline = anOutline;
        descriptor = aDescriptor;
        flyers = aFlyers;
        playerIds = aPlayerIds;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("descriptor", descriptor)
                .add("outline", outline)
                .add("flyers", flyers)
                .add("playerIds", playerIds)
                .omitNullValues()
                .toString();
    }

    public static Event brankEvent() {
        return new Event();
    }

    public PlayerIds playerIds() {
        return playerIds;
    }
}
