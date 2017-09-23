package org.venuspj.studio.adapter.datasource.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.adapter.doma.dao.EventDao;
import org.venuspj.studio.core.fundamentals.contact.Contact;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.fundamentals.place.Place;
import org.venuspj.studio.core.fundamentals.snsContact.SnsContacts;
import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.event.EventId;
import org.venuspj.studio.core.model.event.EventRepository;
import org.venuspj.studio.core.model.event.eventOutline.Outline;
import org.venuspj.studio.core.model.event.flyers.Flyers;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.PlayerIds;
import org.venuspj.studio.generic.fundamentals.address.Address;
import org.venuspj.studio.generic.fundamentals.datetime.RecordDate;

import java.util.List;

import static org.venuspj.util.objects2.Objects2.*;

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
        EventId eventId = (EventId) identifier;
        org.venuspj.studio.adapter.doma.entity.Event work = eventDao.selectById(eventId.asInteger());
        if (nonNull(work)) {
            Place place = new Place(
                    Descriptor.defaultDescriptor(),
                    Address.defaultAddress(),
                    Contact.emptyContact(),
                    SnsContacts.emptySnsContacts());

            Outline outline = new Outline(
                    new RecordDate(work.getStartDateTime().toLocalDate()),
                    Address.defaultAddress(),
                    PlayerIds.empty(),
                    place);

            return new Event(
                    new EventId(work.getEventId())
                    , outline
                    , Descriptor.defaultDescriptor()
                    , Flyers.empty());
        }

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
