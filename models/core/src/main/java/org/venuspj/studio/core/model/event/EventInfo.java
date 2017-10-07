package org.venuspj.studio.core.model.event;

import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.model.event.eventOutline.Outline;
import org.venuspj.studio.core.model.event.flyers.Flyers;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.performer.Performers;
import org.venuspj.util.objects2.Objects2;

import static org.venuspj.util.objects2.Objects2.*;

public class EventInfo {
    boolean isBlank = false;
    private Outline outline;
    private Descriptor descriptor;
    private Flyers flyers;
    private Performers performers;

    EventInfo() {
        boolean isBlank = true;

    }

    EventInfo(Outline anOutline,
              Descriptor aDescriptor,
              Flyers anyFlyers,
              Performers anyPerformers) {
        outline = anOutline;
        descriptor = aDescriptor;
        flyers = anyFlyers;
        performers = anyPerformers;

    }

    public static EventInfo emptyEventInfo() {
        return new EventInfo(Outline.emptyOutline(),
                Descriptor.emptyDescriptor(),
                Flyers.emptyFlyers(),
                Performers.emptyPerformers());
    }

    protected Objects2.ToStringHelper string() {
        return toStringHelper(this)
                .add("outline", outline)
                .add("descriptor", descriptor)
                .add("flyers", flyers)
                .add("performers", performers);

    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

    public Outline outLine() {
        return outline;
    }
}
