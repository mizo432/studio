package org.venuspj.todox.adapter.datasource;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.exception.NotSupportedMethod;
import org.venuspj.todox.core.model.timeEntry.TimeEntry;
import org.venuspj.todox.core.model.timeEntry.TimeEntryRepository;

import java.util.List;
import java.util.Set;

public class TimeEntryDatasource implements TimeEntryRepository {

    @Override
    public TimeEntry resolve(EntityIdentifier<TimeEntry> identifier) {
        return null;
    }

    @Override
    public List<TimeEntry> asEntitiesList() {
        return null;
    }

    @Override
    public Set<TimeEntry> asEntitiesSet() {
        return null;
    }

    @Override
    public boolean contains(EntityIdentifier<TimeEntry> identifier) {
        return false;
    }

    @Override
    public boolean contains(TimeEntry entity) {
        return false;
    }

    @Override
    public void store(TimeEntry entity) {

    }

    @Override
    public void delete(EntityIdentifier<TimeEntry> identifier) {

    }

    @Override
    public void delete(TimeEntry entity) {

    }

    @Override
    public List<TimeEntry> findByIdentifiers(Iterable<EntityIdentifier<TimeEntry>> entityIdentifiers) {
//        return null;
        throw new NotSupportedMethod("findByIdentifiers(Iterable<EntityIdentifier<TimeEntry>>)");
    }

}
