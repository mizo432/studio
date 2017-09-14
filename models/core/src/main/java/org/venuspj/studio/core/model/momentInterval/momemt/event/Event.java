package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.model.momentInterval.momemt.event.eventOutline.Outline;
import org.venuspj.studio.core.model.momentInterval.momemt.event.flyers.Flyers;

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

    public Event(EntityIdentifier<Event> anEventId, Outline anOutline, Descriptor aDescriptor, Flyers aFlyers) {
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
        return string()
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
