package org.venuspj.todox.core.model.timeEntry;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.util.collect.Lists2;

import java.util.Iterator;
import java.util.List;

public class TimeEntries extends AbstractEntity<TimeEntries> implements Iterable<TimeEntry> {
    List<TimeEntry> list = Lists2.newArrayList();

    public TimeEntries(List<TimeEntry> anylist) {
        list.addAll(anylist);
    }

    private TimeEntries() {
    }

    public static TimeEntries empty() {
        return new TimeEntries();
    }

    @Override
    public Iterator<TimeEntry> iterator() {
        return list.iterator();
    }
}
