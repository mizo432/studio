package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.entity.AbstractEntities;
import org.venuspj.ddd.model.entity.EntityIdentifiers;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;
import static org.venuspj.util.objects2.Objects2.*;

public class Events extends AbstractEntities<Event> {

    Events() {
        super();

    }

    public Events(Collection<? extends Event> anyCollection) {
        list.addAll(anyCollection);
    }

    public static Events empty() {
        return new Events();
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(list)
                .toString();
    }

    @Override
    public Iterator<Event> iterator() {
        return list.iterator();
    }

    @Override
    public EntityIdentifiers<Event> getIdentifiers() {
        List<EventId> resultList = newArrayList();
        for (Event event:list) {
            resultList.add((EventId) event.identifier());
        }
        return new EventIds(resultList);
    }

    @Override
    public List<Event> asList() {
        return unmodifiableList(list);
    }
}
