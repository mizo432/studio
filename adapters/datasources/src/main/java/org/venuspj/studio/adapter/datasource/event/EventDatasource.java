package org.venuspj.studio.adapter.datasource.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.venuspj.ddd.model.entity.DefaultEntityIdentifier;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.ddd.model.repository.EntityNotFoundRuntimeException;
import org.venuspj.studio.adapter.mybatis.mapper.EventsMapper;
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

import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;
import static org.venuspj.util.objects2.Objects2.isNull;
import static org.venuspj.util.objects2.Objects2.nonNull;

/**
 */
@Repository
public class EventDatasource implements EventRepository {
    private EventsMapper eventsMapper;

    @Autowired
    EventDatasource(EventsMapper anEventsMapper) {
        eventsMapper = anEventsMapper;
    }

    @Override
    public Events asEntitiesList() {

        List<org.venuspj.studio.adapter.mybatis.model.Events> list = eventsMapper.selectAll();

        List<Event> result = newArrayList();
        for (org.venuspj.studio.adapter.mybatis.model.Events events : list)
            result.add(convertToEvent(events));

        return new Events(result);
    }


    @Override
    public boolean contains(Event anEntity) {
        return false;
    }

    @Override
    public void store(Event entity) {

        org.venuspj.studio.adapter.mybatis.model.Events record = new org.venuspj.studio.adapter.mybatis.model.Events();
        record.setEventId(((EventId) entity.identifier()).asInteger());
        record.setEventName(entity.getInfo().getDescriptor().getName().asText());
        if (needInsertEntity(record)) {
            eventsMapper.insert(record);
            return;
        }
        eventsMapper.updateByPrimaryKey(record);

    }

    private boolean needInsertEntity(org.venuspj.studio.adapter.mybatis.model.Events record) {
        return isNull(record.getEventId());
    }

    @Override
    public void delete(Event anEntity) {

    }

    @Override
    public <I extends EntityIdentifier<Event>> Event resolve(I anIdentifier) {
        EventId eventId = (EventId) anIdentifier;
        org.venuspj.studio.adapter.mybatis.model.Events work = eventsMapper.selectByPrimaryKey(eventId.asInteger());
        if (nonNull(work)) {
            return convertToEvent(work);
        }

        throw new EntityNotFoundRuntimeException(anIdentifier);
    }

    private Event convertToEvent(org.venuspj.studio.adapter.mybatis.model.Events anEvent) {
        Place place = new PlaceImpl(DefaultEntityIdentifier.newId(Place.class), new PlaceInfo(Name.emptyName(), Address.nullAddress()));

        Outline outline = new Outline(
                new RecordDate(anEvent.getEventStartDatetime().toLocalDate()),
                Address.defaultAddress(),
                OrganizationUnitIds.emptyOrganizationUnitIds(),
                place);

        Descriptor descriptor = new Descriptor(new Name(anEvent.getEventName()), new Description(anEvent.getEventDescription()));

        EventInfo eventInfo = new EventInfo(outline,
                descriptor,
                Flyers.emptyFlyers(),
                Performers.emptyPerformers());

        return new Event(
                new EventId(anEvent.getEventId()),
                eventInfo);
    }

    @Override
    public <I extends EntityIdentifier<Event>> Events resolve(Iterable<I> anyIdentifiers) {
        return null;
    }

    @Override
    public <I extends EntityIdentifier<Event>> boolean contains(I anIdentifier) {
        return false;
    }

    @Override
    public <I extends EntityIdentifier<Event>> void delete(I anIdentifier) {

    }

    @Override
    public <I extends EntityIdentifier<Event>> void delete(Iterable<I> anyIdentifiers) {
        for (I anEventId : anyIdentifiers) {
            EventId eventId = (EventId) anEventId;
            delete(eventId);
        }

    }
}
