package org.venuspj.studio.adapter.datasource.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.adapter.doma.dao.event.EventDao;
import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.event.EventRepository;

import java.util.List;

/**
 */
@Repository
public class EventDatasource implements EventRepository {
    private EventDao eventDao;

    @Autowired
    EventDatasource(EventDao anEventDao) {
        eventDao = anEventDao;
    }

    @Override
    public Event resolve(EntityIdentifier<Event> identifier) {
        return null;
    }

    @Override
    public Iterable<Event> resolve(Iterable<EntityIdentifier<Event>> entityIdentifiers) {
        return null;
    }

    @Override
    public List<Event> asEntitiesList() {
        return null;
    }

    @Override
    public boolean contains(EntityIdentifier<Event> identifier) {
        return false;
    }

    @Override
    public <S extends Event> boolean contains(S entity) {
        return false;
    }

    @Override
    public <S extends Event> void store(S entity) {

    }

    @Override
    public void delete(EntityIdentifier<Event> identifier) {

    }

    @Override
    public void delete(Iterable<EntityIdentifier<Event>> entityIdentifiers) {

    }

    @Override
    public <S extends Event> void delete(S entity) {

    }
}
