package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.model.event.eventOutline.Outline;
import org.venuspj.studio.core.model.event.flyers.Flyers;

public class Event extends AbstractEntity<Event> {
    boolean isBlank = false;
    private Outline outline;
    private Descriptor descriptor;
    private Flyers flyers;

    public Event(EntityIdentifier<Event> anIdentifier, Outline anOutline,
                 Descriptor aDescriptor, Flyers anyFlyers) {
        super(anIdentifier);
        outline = anOutline;
        descriptor = aDescriptor;
        flyers = anyFlyers;
    }

    public Event() {
        isBlank = true;

    }

    public static Event blankEvent() {
        return new Event();
    }

    public Outline outline() {
        return outline;
    }

    @Override
    public String toString() {
        return string()
                .add("outline", outline)
                .add("descriptor", descriptor)
                .add("flyers", flyers)
                .omitNullValues()
                .toString();
    }
}
