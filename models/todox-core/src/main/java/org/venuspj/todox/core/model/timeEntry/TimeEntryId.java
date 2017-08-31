package org.venuspj.todox.core.model.timeEntry;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

public class TimeEntryId extends AbstractEntityIdentifier<TimeEntry> {
    private final Integer value;

    public TimeEntryId(Integer aValue){
        super(TimeEntry.class);

        value = aValue;


    }

}
