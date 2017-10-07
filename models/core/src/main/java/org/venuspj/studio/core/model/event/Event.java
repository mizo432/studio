package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.model.event.eventOutline.Outline;

import static org.venuspj.util.objects2.Objects2.*;

public class Event extends AbstractEntity<Event> {
    boolean isBlank = false;
    EventInfo eventInfo = EventInfo.emptyEventInfo();

    public Event(EntityIdentifier<Event> anIdentifier, EventInfo anEventInfo) {
        super(anIdentifier);
        eventInfo = anEventInfo;
    }

    public Event() {
        isBlank = true;

    }

    public static Event blankEvent() {
        return new Event();
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
