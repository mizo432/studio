package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.model.event.eventOutline.Outline;
import org.venuspj.studio.core.model.event.flyers.Flyers;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.performer.Performers;

public class Event extends AbstractEntity<Event> {
    boolean isBlank = false;
    private Outline outline;
    private Descriptor descriptor;
    private Flyers flyers;
    private Performers performers;

    public Event(EntityIdentifier<Event> anIdentifier, Outline anOutline,
                 Descriptor aDescriptor, Flyers anyFlyers, Performers anyPerformers) {
        super(anIdentifier);
        outline = anOutline;
        descriptor = aDescriptor;
        flyers = anyFlyers;
        performers = anyPerformers;
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
                .add("performers", performers)
                .omitNullValues()
                .toString();
    }
}
