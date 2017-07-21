package org.venuspj.studio.adapter.datasource.event;

import org.springframework.stereotype.Repository;
import org.venuspj.ddd.model.repository.OnMemoryCrudRepository;
import org.venuspj.studio.core.model.momentInterval.momemt.event.Event;
import org.venuspj.studio.core.model.momentInterval.momemt.event.EventRepository;

/**
 */
@Repository
public class EventDatasource extends OnMemoryCrudRepository<Event> implements EventRepository {

}
