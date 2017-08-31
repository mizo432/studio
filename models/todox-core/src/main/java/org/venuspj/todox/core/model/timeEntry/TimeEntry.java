package org.venuspj.todox.core.model.timeEntry;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.todox.core.model.task.TaskId;

public class TimeEntry extends AbstractEntity<TimeEntry> {
    private TaskId taskId;

    public TimeEntry(EntityIdentifier<TimeEntry> anIdentifier, TaskId anTaskId) {
        super(anIdentifier);
        taskId = anTaskId;
    }
}
