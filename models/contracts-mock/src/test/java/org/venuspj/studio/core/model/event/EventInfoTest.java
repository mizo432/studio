package org.venuspj.studio.core.model.event;

import org.junit.Test;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.model.event.eventOutline.Outline;
import org.venuspj.studio.core.model.event.flyers.Flyers;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.performer.Performers;

public class EventInfoTest {

    @Test
    public void constructor() throws Exception {
        EventInfo target = new EventInfo(Outline.emptyOutline(),
                Descriptor.emptyDescriptor(),
                Flyers.emptyFlyers(),
                Performers.emptyPerformers());
        System.out.println(target);
    }

    @Test
    public void empty() throws Exception {
        EventInfo target = EventInfoMock.createDummy(EventInfoMock.EventInfoType.EMPTY);
        System.out.println(target);
    }
}
