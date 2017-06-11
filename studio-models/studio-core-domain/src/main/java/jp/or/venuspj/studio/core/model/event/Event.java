package jp.or.venuspj.studio.core.model.event;

import jp.or.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import jp.or.venuspj.studio.core.model.event.flyers.Flyers;
import jp.or.venuspj.util.objects2.Objects2;

/**
 */
public class Event {

    EventId eventId = EventId.defaultEventId();
    Descriptor descriptor = Descriptor.defaultDescriptor();
    Flyers flyers = Flyers.empty();

    Event() {

    }

    public Event(EventId anEventId, Descriptor aDescriptor, Flyers aFlyers) {
        eventId = anEventId;
        descriptor = aDescriptor;
        flyers = aFlyers;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("eventId", eventId)
                .add("descriptor", descriptor)
                .add("flyers", flyers)
                .omitNullValues()
                .toString();
    }

}
