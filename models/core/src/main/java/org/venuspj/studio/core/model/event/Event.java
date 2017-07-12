package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.model.event.eventOutline.Outline;
import org.venuspj.studio.core.model.event.flyers.Flyers;
import org.venuspj.util.objects2.Objects2;

/**
 *
 */
public class Event extends AbstractEntity<Event> {

    /**
     * イベント概要
     */
    Outline outline = Outline.defaultOutline();
    Descriptor descriptor = Descriptor.defaultDescriptor();
    Flyers flyers = Flyers.empty();

    Event() {

    }

    public Event(EventId anEventId, Outline anOutline, Descriptor aDescriptor, Flyers aFlyers) {
        super(anEventId);
        outline = anOutline;
        descriptor = aDescriptor;
        flyers = aFlyers;
    }

    public static Event blankEvent() {
        return new Event();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("identifier", identifier())
                .add("descriptor", descriptor)
                .add("outline", outline)
                .add("flyers", flyers)
                .omitNullValues()
                .toString();
    }

    public Outline outline() {
        return outline;
    }
}
