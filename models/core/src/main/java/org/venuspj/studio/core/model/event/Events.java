package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.value.AbstractListValue;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class Events extends AbstractListValue<Event> {

    Events() {
        super();

    }

    public Events(Collection<? extends Event> anyCollection) {
        super(anyCollection);
    }

    public static Events empty() {
        return new Events();
    }

    @Override
    public Iterator<Event> iterator() {
        return asList().iterator();
    }

    public EventIdentifiers getIdentifiers() {
        List<EventIdentifier> resultList = newArrayList();
        for (Event event : list) {
            resultList.add((EventIdentifier) event.identifier());
        }
        return new EventIdentifiers(resultList);
    }

    @Override
    public List<Event> asList() {
        return unmodifiableList(list);
    }
}
