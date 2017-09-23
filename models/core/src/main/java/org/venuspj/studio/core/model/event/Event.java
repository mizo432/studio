package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.model.event.eventOutline.Outline;
import org.venuspj.studio.core.model.event.flyers.Flyers;

public class Event extends AbstractEntity<Event> {
    Outline anOutline;
    Descriptor aDescriptor;
    Flyers flyers;

    public Event(EntityIdentifier<Event> anIdentifier, Outline anOutline,
                 Descriptor aDescriptor, Flyers anyFlyers) {
        super(anIdentifier);
    }

    public static Event blankEvent() {
        return null;
    }

    public Outline outline() {
        return null;
    }
}
