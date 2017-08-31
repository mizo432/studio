package org.venuspj.todox.core.model.timeEntry;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.util.collect.Lists2;

import java.util.Iterator;
import java.util.List;

public class TimeEntryIds implements Iterable<EntityIdentifier<TimeEntry>> {
    List<EntityIdentifier<TimeEntry>> list = Lists2.newArrayList();

    public TimeEntryIds(List<TimeEntryId> anylist) {
        list.addAll(anylist);
    }

    private TimeEntryIds() {
    }

    public static TimeEntryIds empty() {
        return new TimeEntryIds();
    }

    @Override
    public Iterator<EntityIdentifier<TimeEntry>> iterator() {
        return list.iterator();
    }

}
