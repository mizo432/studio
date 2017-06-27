package org.venuspj.studio.core.repositories.event;

import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.event.EventCredential;

public interface EventRepository {
    Event findOne(EventCredential credential);
}
