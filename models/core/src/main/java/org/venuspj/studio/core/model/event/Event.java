package org.venuspj.studio.core.model.event;

import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.model.event.eventOutline.Outline;
import org.venuspj.studio.core.model.event.flyers.Flyers;
import org.venuspj.util.objects2.Objects2;

/**
 *
 */
public class Event {

    /**
     * イベント概要
     */
    Outline outline = Outline.defaultOutline();
    Descriptor descriptor = Descriptor.defaultDescriptor();
    Flyers flyers = Flyers.empty();

    Event() {

    }

    public Event(Outline anOutline, Descriptor aDescriptor, Flyers aFlyers) {
        outline = anOutline;
        descriptor = aDescriptor;
        flyers = aFlyers;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("descriptor", descriptor)
                .add("outline", outline)
                .add("flyers", flyers)
                .omitNullValues()
                .toString();
    }

    public static Event blankEvent() {
        return new Event();
    }

    public Outline outline() {
        return outline;
    }
}
