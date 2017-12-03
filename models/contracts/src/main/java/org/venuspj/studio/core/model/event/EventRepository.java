package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event> {

    Events asEntitiesList();

    Events resolveEntities(Iterable<EventIdentifier> anyIdentifiers);

}
