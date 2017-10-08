package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.model.event.eventOutline.Outline;

import static org.venuspj.util.objects2.Objects2.*;

public class Event extends AbstractEntity<Event> {
    EventInfo eventInfo = EventInfo.emptyEventInfo();

    public Event(EntityIdentifier<Event> anIdentifier, EventInfo anEventInfo) {
        super(anIdentifier);
        eventInfo = anEventInfo;
    }

    private Event() {

    }

    public static Event emptyEvent() {
        return new Event(
                EventId.emptyEventId(),
                EventInfo.emptyEventInfo()
        );
    }

    public Outline outline() {
        return eventInfo.outLine();
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("identifier", identifier())
                .add("\neventInfo", eventInfo)
                .omitNullValues()
                .toString();
    }
}
