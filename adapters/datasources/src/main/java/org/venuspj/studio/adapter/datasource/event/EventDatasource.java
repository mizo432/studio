package org.venuspj.studio.adapter.datasource.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.venuspj.ddd.model.entity.DefaultEntityIdentifier;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.adapter.doma.dao.EventsDao;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.model.event.*;
import org.venuspj.studio.core.model.event.eventOutline.Outline;
import org.venuspj.studio.core.model.event.flyers.Flyers;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.performer.Performers;
import org.venuspj.studio.generic.fundamentals.address.Address;
import org.venuspj.studio.generic.fundamentals.datetime.RecordDate;
import org.venuspj.studio.generic.fundamentals.description.Description;
import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnitIds;
import org.venuspj.studio.generic.model.ppt.place.Place;
import org.venuspj.studio.generic.model.ppt.place.PlaceImpl;
import org.venuspj.studio.generic.model.ppt.place.PlaceInfo;

import static org.venuspj.util.objects2.Objects2.*;

/**
 */
@Repository
public class EventDatasource implements EventRepository {
    private EventsDao eventsDao;

    @Autowired
    EventDatasource(EventsDao anEventsDao) {
        eventsDao = anEventsDao;
    }

    @Override
    public Event resolve(EntityIdentifier<Event> anIdentifier) {
        EventId eventId = (EventId) anIdentifier;
        org.venuspj.studio.adapter.doma.entity.Events work = eventsDao.selectById(eventId.asInteger());
        if (nonNull(work)) {
            Place place = new PlaceImpl(DefaultEntityIdentifier.newId(Place.class), new PlaceInfo(Name.emptyName(), Address.nullAddress()));

            Outline outline = new Outline(
                    new RecordDate(work.getEventStartDatetime().toLocalDate()),
                    Address.defaultAddress(),
                    OrganizationUnitIds.emptyOrganizationUnitIds(),
                    place);

            Descriptor descriptor = new Descriptor(new Name(work.getEventName()), new Description(work.getEventDescription()));

            EventInfo eventInfo = new EventInfo(outline,
                    descriptor,
                    Flyers.emptyFlyers(),
                    Performers.emptyPerformers());

            return new Event(
                    new EventId(work.getEventId()),
                    eventInfo);
        }

        return null;
    }

    @Override
    public Events resolve(Iterable<EntityIdentifier<Event>> anyIdentifiers) {
        return null;
    }

    @Override
    public Events asEntitiesList() {
        return null;
    }

    @Override
    public boolean contains(EntityIdentifier<Event> anIdentifier) {
        return false;
    }

    @Override
    public <S extends Event> boolean contains(S anEntity) {
        return false;
    }

    @Override
    public <S extends Event> void store(S entity) {

    }

    @Override
    public void delete(EntityIdentifier<Event> anIdentifier) {

    }

    @Override
    public void delete(Iterable<EntityIdentifier<Event>> anyIdentifiers) {

    }

    @Override
    public <S extends Event> void delete(S anEntity) {

    }
}
