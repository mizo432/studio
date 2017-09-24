package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.model.AbstractCrudRepositoryMock;

import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class EventRepositoryMock extends AbstractCrudRepositoryMock<Event, Events> implements EventRepository {

    public EventRepositoryMock(Iterable<Event> anyIterable) {
        super(anyIterable);
    }

    @Override
    public Events resolve(Iterable<EntityIdentifier<Event>> anyIdentifiers) {
        List<Event> resultList = newArrayList();
        for (EntityIdentifier<Event> entityIdentifier : anyIdentifiers) {
            if (contains(entityIdentifier)) {
                resultList.add(resolve(entityIdentifier));

            }
        }
        return new Events(resultList);
    }

    @Override
    public Events asEntitiesList() {
        List<Event> resultList = newArrayList();
        for (Event entity : map.values())
            resultList.add(entity);
        return new Events(resultList);
    }

}
